package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import io.sentry.h2;
import io.sentry.q7;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import o.ar;
import o.bo7;
import o.cu0;
import o.g21;
import o.h57;
import o.hy8;
import o.ic1;
import o.ua5;
import o.yl7;

/* JADX INFO: loaded from: classes.dex */
public class ConfigFetchHandler {
    private final Provider<AnalyticsConnector> analyticsConnector;
    private final cu0 clock;
    private final Map<String, String> customHttpHeaders;
    private final Executor executor;
    private final ConfigCacheClient fetchedConfigsCache;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final ConfigFetchHttpClient frcBackendApiClient;
    private final ConfigSharedPrefsClient frcSharedPrefs;
    private final Random randomGenerator;
    public static final long DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS = 43200;
    static final int[] BACKOFF_TIME_DURATIONS_IN_MINUTES = {2, 4, 8, 16, 32, 64, 128, 256};

    public static class FetchResponse {
        private final Date fetchTime;
        private final ConfigContainer fetchedConfigs;
        private final String lastFetchETag;
        private final int status;

        private FetchResponse(Date date, int i, ConfigContainer configContainer, String str) {
            this.fetchTime = date;
            this.status = i;
            this.fetchedConfigs = configContainer;
            this.lastFetchETag = str;
        }

        public static FetchResponse forBackendHasNoUpdates(Date date, ConfigContainer configContainer) {
            return new FetchResponse(date, 1, configContainer, null);
        }

        public static FetchResponse forBackendUpdatesFetched(ConfigContainer configContainer, String str) {
            return new FetchResponse(configContainer.getFetchTime(), 0, configContainer, str);
        }

        public static FetchResponse forLocalStorageUsed(Date date) {
            return new FetchResponse(date, 2, null, null);
        }

        public ConfigContainer getFetchedConfigs() {
            return this.fetchedConfigs;
        }

        public String getLastFetchETag() {
            return this.lastFetchETag;
        }

        public int getStatus() {
            return this.status;
        }
    }

    public enum FetchType {
        BASE("BASE"),
        REALTIME("REALTIME");

        private final String value;

        FetchType(String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }
    }

    public ConfigFetchHandler(FirebaseInstallationsApi firebaseInstallationsApi, Provider<AnalyticsConnector> provider, Executor executor, cu0 cu0Var, Random random, ConfigCacheClient configCacheClient, ConfigFetchHttpClient configFetchHttpClient, ConfigSharedPrefsClient configSharedPrefsClient, Map<String, String> map) {
        this.firebaseInstallations = firebaseInstallationsApi;
        this.analyticsConnector = provider;
        this.executor = executor;
        this.clock = cu0Var;
        this.randomGenerator = random;
        this.fetchedConfigsCache = configCacheClient;
        this.frcBackendApiClient = configFetchHttpClient;
        this.frcSharedPrefs = configSharedPrefsClient;
        this.customHttpHeaders = map;
    }

    private boolean areCachedFetchConfigsValid(long j, Date date) {
        Date lastSuccessfulFetchTime = this.frcSharedPrefs.getLastSuccessfulFetchTime();
        if (lastSuccessfulFetchTime.equals(ConfigSharedPrefsClient.LAST_FETCH_TIME_NO_FETCH_YET)) {
            return false;
        }
        return date.before(new Date(TimeUnit.SECONDS.toMillis(j) + lastSuccessfulFetchTime.getTime()));
    }

    private FirebaseRemoteConfigServerException createExceptionWithGenericMessage(FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) throws FirebaseRemoteConfigClientException {
        String str;
        int httpStatusCode = firebaseRemoteConfigServerException.getHttpStatusCode();
        if (httpStatusCode == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (httpStatusCode == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else {
            if (httpStatusCode == 429) {
                throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
            }
            if (httpStatusCode != 500) {
                switch (httpStatusCode) {
                    case 502:
                    case 503:
                    case 504:
                        str = "The server is unavailable. Please try again later.";
                        break;
                    default:
                        str = "The server returned an unexpected error.";
                        break;
                }
            } else {
                str = "There was an internal server error.";
            }
        }
        return new FirebaseRemoteConfigServerException(firebaseRemoteConfigServerException.getHttpStatusCode(), "Fetch failed: ".concat(str), firebaseRemoteConfigServerException);
    }

    private String createThrottledMessage(long j) {
        return ua5.m("Fetch is throttled. Please wait before calling fetch again: ", DateUtils.formatElapsedTime(j / 1000));
    }

    private FetchResponse fetchFromBackend(String str, String str2, Date date, Map<String, String> map) throws FirebaseRemoteConfigFetchThrottledException, FirebaseRemoteConfigServerException {
        Date date2;
        try {
            date2 = date;
            try {
                FetchResponse fetchResponseFetch = this.frcBackendApiClient.fetch(this.frcBackendApiClient.createHttpURLConnection(), str, str2, getUserProperties(), this.frcSharedPrefs.getLastFetchETag(), map, getFirstOpenTime(), date2, this.frcSharedPrefs.getCustomSignals());
                if (fetchResponseFetch.getFetchedConfigs() != null) {
                    this.frcSharedPrefs.setLastTemplateVersion(fetchResponseFetch.getFetchedConfigs().getTemplateVersionNumber());
                }
                if (fetchResponseFetch.getLastFetchETag() != null) {
                    this.frcSharedPrefs.setLastFetchETag(fetchResponseFetch.getLastFetchETag());
                }
                this.frcSharedPrefs.resetBackoff();
                return fetchResponseFetch;
            } catch (FirebaseRemoteConfigServerException e) {
                e = e;
                FirebaseRemoteConfigServerException firebaseRemoteConfigServerException = e;
                ConfigSharedPrefsClient.BackoffMetadata backoffMetadataUpdateAndReturnBackoffMetadata = updateAndReturnBackoffMetadata(firebaseRemoteConfigServerException.getHttpStatusCode(), date2);
                if (shouldThrottle(backoffMetadataUpdateAndReturnBackoffMetadata, firebaseRemoteConfigServerException.getHttpStatusCode())) {
                    throw new FirebaseRemoteConfigFetchThrottledException(backoffMetadataUpdateAndReturnBackoffMetadata.getBackoffEndTime().getTime());
                }
                throw createExceptionWithGenericMessage(firebaseRemoteConfigServerException);
            }
        } catch (FirebaseRemoteConfigServerException e2) {
            e = e2;
            date2 = date;
        }
    }

    private bo7 fetchFromBackendAndCacheResponse(String str, String str2, Date date, Map<String, String> map) {
        try {
            FetchResponse fetchResponseFetchFromBackend = fetchFromBackend(str, str2, date, map);
            return fetchResponseFetchFromBackend.getStatus() != 0 ? h57.j(fetchResponseFetchFromBackend) : this.fetchedConfigsCache.put(fetchResponseFetchFromBackend.getFetchedConfigs()).l(this.executor, new ar(fetchResponseFetchFromBackend, (byte) 6));
        } catch (FirebaseRemoteConfigException e) {
            return h57.i(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: fetchIfCacheExpiredAndNotThrottled, reason: merged with bridge method [inline-methods] */
    public bo7 lambda$fetch$0(bo7 bo7Var, long j, final Map<String, String> map) {
        final ConfigFetchHandler configFetchHandler;
        hy8 hy8VarG;
        ((yl7) this.clock).getClass();
        final Date date = new Date(System.currentTimeMillis());
        if (bo7Var.k() && areCachedFetchConfigsValid(j, date)) {
            return h57.j(FetchResponse.forLocalStorageUsed(date));
        }
        Date backoffEndTimeInMillis = getBackoffEndTimeInMillis(date);
        if (backoffEndTimeInMillis != null) {
            hy8VarG = h57.i(new FirebaseRemoteConfigFetchThrottledException(createThrottledMessage(backoffEndTimeInMillis.getTime() - date.getTime()), backoffEndTimeInMillis.getTime()));
            configFetchHandler = this;
        } else {
            final bo7 id = this.firebaseInstallations.getId();
            final bo7 token = this.firebaseInstallations.getToken(false);
            configFetchHandler = this;
            hy8VarG = h57.C(id, token).g(this.executor, new ic1() { // from class: o.h21
                @Override // o.ic1
                public final Object j(bo7 bo7Var2) {
                    return this.m.lambda$fetchIfCacheExpiredAndNotThrottled$2(id, token, date, map, bo7Var2);
                }
            });
        }
        return hy8VarG.g(configFetchHandler.executor, new q7(configFetchHandler, date, (byte) 14));
    }

    private Date getBackoffEndTimeInMillis(Date date) {
        Date backoffEndTime = this.frcSharedPrefs.getBackoffMetadata().getBackoffEndTime();
        if (date.before(backoffEndTime)) {
            return backoffEndTime;
        }
        return null;
    }

    private Long getFirstOpenTime() {
        if (this.analyticsConnector.get() == null) {
            return null;
        }
        h2.f();
        return null;
    }

    private long getRandomizedBackoffDurationInMillis(int i) {
        int[] iArr = BACKOFF_TIME_DURATIONS_IN_MINUTES;
        long millis = TimeUnit.MINUTES.toMillis(iArr[Math.min(i, iArr.length) - 1]);
        return (millis / 2) + ((long) this.randomGenerator.nextInt((int) millis));
    }

    private Map<String, String> getUserProperties() {
        HashMap map = new HashMap();
        if (this.analyticsConnector.get() == null) {
            return map;
        }
        h2.f();
        return null;
    }

    private boolean isThrottleableServerError(int i) {
        return i == 429 || i == 502 || i == 503 || i == 504;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ bo7 lambda$fetchFromBackendAndCacheResponse$4(FetchResponse fetchResponse, ConfigContainer configContainer) {
        return h57.j(fetchResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ bo7 lambda$fetchIfCacheExpiredAndNotThrottled$2(bo7 bo7Var, bo7 bo7Var2, Date date, Map map, bo7 bo7Var3) {
        if (bo7Var.k()) {
            return !bo7Var2.k() ? h57.i(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", bo7Var2.h())) : fetchFromBackendAndCacheResponse((String) bo7Var.i(), ((InstallationTokenResult) bo7Var2.i()).getToken(), date, map);
        }
        return h57.i(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", bo7Var.h()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ bo7 lambda$fetchIfCacheExpiredAndNotThrottled$3(Date date, bo7 bo7Var) {
        updateLastFetchStatusAndTime(bo7Var, date);
        return bo7Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ bo7 lambda$fetchNowWithTypeAndAttemptNumber$1(Map map, bo7 bo7Var) {
        return lambda$fetch$0(bo7Var, 0L, map);
    }

    private boolean shouldThrottle(ConfigSharedPrefsClient.BackoffMetadata backoffMetadata, int i) {
        return backoffMetadata.getNumFailedFetches() > 1 || i == 429;
    }

    private ConfigSharedPrefsClient.BackoffMetadata updateAndReturnBackoffMetadata(int i, Date date) {
        if (isThrottleableServerError(i)) {
            updateBackoffMetadataWithLastFailedFetchTime(date);
        }
        return this.frcSharedPrefs.getBackoffMetadata();
    }

    private void updateBackoffMetadataWithLastFailedFetchTime(Date date) {
        int numFailedFetches = this.frcSharedPrefs.getBackoffMetadata().getNumFailedFetches() + 1;
        this.frcSharedPrefs.setBackoffMetadata(numFailedFetches, new Date(date.getTime() + getRandomizedBackoffDurationInMillis(numFailedFetches)));
    }

    private void updateLastFetchStatusAndTime(bo7 bo7Var, Date date) {
        if (bo7Var.k()) {
            this.frcSharedPrefs.updateLastFetchAsSuccessfulAt(date);
            return;
        }
        Exception excH = bo7Var.h();
        if (excH == null) {
            return;
        }
        boolean z = excH instanceof FirebaseRemoteConfigFetchThrottledException;
        ConfigSharedPrefsClient configSharedPrefsClient = this.frcSharedPrefs;
        if (z) {
            configSharedPrefsClient.updateLastFetchAsThrottled();
        } else {
            configSharedPrefsClient.updateLastFetchAsFailed();
        }
    }

    public bo7 fetch(long j) {
        HashMap map = new HashMap(this.customHttpHeaders);
        map.put("X-Firebase-RC-Fetch-Type", FetchType.BASE.getValue() + "/1");
        return this.fetchedConfigsCache.get().g(this.executor, new g21(this, j, map));
    }

    public bo7 fetchNowWithTypeAndAttemptNumber(FetchType fetchType, int i) {
        HashMap map = new HashMap(this.customHttpHeaders);
        map.put("X-Firebase-RC-Fetch-Type", fetchType.getValue() + "/" + i);
        return this.fetchedConfigsCache.get().g(this.executor, new q7(this, map, (byte) 13));
    }

    public long getTemplateVersionNumber() {
        return this.frcSharedPrefs.getLastTemplateVersion();
    }

    public bo7 fetch() {
        return fetch(this.frcSharedPrefs.getMinimumFetchIntervalInSeconds());
    }
}
