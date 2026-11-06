package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import io.sentry.android.core.v0;
import io.sentry.i5;
import io.sentry.q7;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.bo7;
import o.ck3;
import o.cu0;
import o.fx3;
import o.h57;
import o.im3;
import o.yl7;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ConfigRealtimeHttpClient {
    static final int[] BACKOFF_TIME_DURATIONS_IN_MINUTES = {2, 4, 8, 16, 32, 64, 128, 256};
    private static final Pattern GMP_APP_ID_PATTERN = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    ConfigCacheClient activatedCache;
    private ConfigAutoFetch configAutoFetch;
    private final ConfigFetchHandler configFetchHandler;
    private final Context context;
    private final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi firebaseInstallations;
    private int httpRetriesRemaining;
    private HttpURLConnection httpURLConnection;
    private final Set<ConfigUpdateListener> listeners;
    private final String namespace;
    private final ScheduledExecutorService scheduledExecutorService;
    private final ConfigSharedPrefsClient sharedPrefsClient;
    private final int ORIGINAL_RETRIES = 8;
    private boolean isHttpConnectionRunning = false;
    private final Random random = new Random();
    private final cu0 clock = yl7.w;
    private boolean isRealtimeDisabled = false;
    private boolean isInBackground = false;
    private final Object backgroundLock = new Object();

    public ConfigRealtimeHttpClient(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Context context, String str, Set<ConfigUpdateListener> set, ConfigSharedPrefsClient configSharedPrefsClient, ScheduledExecutorService scheduledExecutorService) {
        this.listeners = set;
        this.scheduledExecutorService = scheduledExecutorService;
        this.httpRetriesRemaining = Math.max(8 - configSharedPrefsClient.getRealtimeBackoffMetadata().getNumFailedStreams(), 1);
        this.firebaseApp = firebaseApp;
        this.configFetchHandler = configFetchHandler;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.activatedCache = configCacheClient;
        this.context = context;
        this.namespace = str;
        this.sharedPrefsClient = configSharedPrefsClient;
    }

    private synchronized boolean canMakeHttpStreamConnection() {
        return (this.listeners.isEmpty() || this.isHttpConnectionRunning || this.isRealtimeDisabled || this.isInBackground) ? false : true;
    }

    private synchronized boolean checkAndSetHttpConnectionFlagIfNotRunning() {
        boolean zCanMakeHttpStreamConnection;
        zCanMakeHttpStreamConnection = canMakeHttpStreamConnection();
        if (zCanMakeHttpStreamConnection) {
            setIsHttpConnectionRunning(true);
        }
        return zCanMakeHttpStreamConnection;
    }

    private void closeHttpConnectionInputStream(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e);
            }
        }
    }

    private JSONObject createRequestBody(String str) {
        HashMap map = new HashMap();
        map.put("project", extractProjectNumberFromAppId(this.firebaseApp.getOptions().getApplicationId()));
        map.put("namespace", this.namespace);
        map.put("lastKnownVersionNumber", Long.toString(this.configFetchHandler.getTemplateVersionNumber()));
        map.put("appId", this.firebaseApp.getOptions().getApplicationId());
        map.put("sdkVersion", "23.1.0");
        map.put("appInstanceId", str);
        return new JSONObject(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void enableBackoff() {
        this.isRealtimeDisabled = true;
    }

    private static String extractProjectNumberFromAppId(String str) {
        Matcher matcher = GMP_APP_ID_PATTERN.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private String getFingerprintHashForPackage() {
        try {
            Context context = this.context;
            byte[] bArrH = im3.H(context, context.getPackageName());
            if (bArrH != null) {
                return ck3.o(bArrH);
            }
            v0.c("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + this.context.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i("FirebaseRemoteConfig", "No such package: " + this.context.getPackageName());
            return null;
        }
    }

    private long getRandomizedBackoffDurationInMillis(int i) {
        int[] iArr = BACKOFF_TIME_DURATIONS_IN_MINUTES;
        int length = iArr.length;
        if (i >= length) {
            i = length;
        }
        long millis = TimeUnit.MINUTES.toMillis(iArr[i - 1]);
        return (millis / 2) + ((long) this.random.nextInt((int) millis));
    }

    private String getRealtimeURL(String str) {
        return fx3.h("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/", extractProjectNumberFromAppId(this.firebaseApp.getOptions().getApplicationId()), "/namespaces/", str, ":streamFetchInvalidations");
    }

    private URL getUrl() {
        try {
            return new URL(getRealtimeURL(this.namespace));
        } catch (MalformedURLException unused) {
            v0.c("FirebaseRemoteConfig", "URL is malformed");
            return null;
        }
    }

    private boolean isStatusCodeRetryable(int i) {
        return i == 408 || i == 429 || i == 502 || i == 503 || i == 504;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x0093  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c3 A[Catch: all -> 0x0041, TryCatch #1 {all -> 0x0041, blocks: (B:9:0x002d, B:47:0x00bf, B:49:0x00c3, B:50:0x00c7), top: B:88:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c7 A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #1 {all -> 0x0041, blocks: (B:9:0x002d, B:47:0x00bf, B:49:0x00c3, B:50:0x00c7), top: B:88:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient] */
    /* JADX WARN: Type inference failed for: r11v0, types: [o.bo7] */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v32, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Integer, java.lang.Object] */
    public bo7 lambda$beginRealtimeHttpStream$1(bo7 bo7Var, bo7 bo7Var2) throws Throwable {
        InputStream errorStream;
        Integer num;
        Throwable th;
        ?? ValueOf;
        FirebaseRemoteConfigServerException firebaseRemoteConfigServerException;
        boolean z = true;
        try {
            try {
                if (!bo7Var.k()) {
                    throw new IOException(bo7Var.h());
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) bo7Var.i();
                this.httpURLConnection = httpURLConnection;
                bo7Var = httpURLConnection.getInputStream();
                try {
                    errorStream = this.httpURLConnection.getErrorStream();
                    try {
                        int responseCode = this.httpURLConnection.getResponseCode();
                        ValueOf = Integer.valueOf(responseCode);
                        if (responseCode == 200) {
                            try {
                                resetRetryCount();
                                this.sharedPrefsClient.resetRealtimeBackoff();
                                ConfigAutoFetch configAutoFetchStartAutoFetch = startAutoFetch(this.httpURLConnection);
                                this.configAutoFetch = configAutoFetchStartAutoFetch;
                                configAutoFetchStartAutoFetch.listenForNotifications();
                            } catch (IOException e) {
                                e = e;
                                if (this.isInBackground) {
                                    resetRetryCount();
                                } else {
                                    Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                                }
                                closeRealtimeHttpConnection(bo7Var, errorStream);
                                setIsHttpConnectionRunning(false);
                                if (this.isInBackground || (ValueOf != 0 && !isStatusCodeRetryable(ValueOf.intValue()))) {
                                    z = false;
                                }
                                if (z) {
                                    ((yl7) this.clock).getClass();
                                    updateBackoffMetadataWithLastFailedStreamConnectionTime(new Date(System.currentTimeMillis()));
                                }
                                if (!z || ValueOf.intValue() == 200) {
                                    retryHttpConnectionWhenBackoffEnds();
                                } else {
                                    String forbiddenErrorResponseMessage = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", ValueOf);
                                    if (ValueOf.intValue() == 403) {
                                        forbiddenErrorResponseMessage = parseForbiddenErrorResponseMessage(this.httpURLConnection.getErrorStream());
                                    }
                                    firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(ValueOf.intValue(), forbiddenErrorResponseMessage, FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR);
                                }
                                this.httpURLConnection = null;
                                this.configAutoFetch = null;
                                return h57.j(null);
                            }
                        }
                        closeRealtimeHttpConnection(bo7Var, errorStream);
                        setIsHttpConnectionRunning(false);
                        z = !this.isInBackground && isStatusCodeRetryable(responseCode);
                        if (z) {
                            ((yl7) this.clock).getClass();
                            updateBackoffMetadataWithLastFailedStreamConnectionTime(new Date(System.currentTimeMillis()));
                        }
                        if (z || responseCode == 200) {
                            retryHttpConnectionWhenBackoffEnds();
                        } else {
                            String forbiddenErrorResponseMessage2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", ValueOf);
                            if (responseCode == 403) {
                                forbiddenErrorResponseMessage2 = parseForbiddenErrorResponseMessage(this.httpURLConnection.getErrorStream());
                            }
                            firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(responseCode, forbiddenErrorResponseMessage2, FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR);
                            propagateErrors(firebaseRemoteConfigServerException);
                        }
                    } catch (IOException e2) {
                        e = e2;
                        ValueOf = 0;
                    } catch (Throwable th2) {
                        num = null;
                        th = th2;
                        closeRealtimeHttpConnection(bo7Var, errorStream);
                        setIsHttpConnectionRunning(false);
                        if (this.isInBackground || (num != null && !isStatusCodeRetryable(num.intValue()))) {
                            z = false;
                        }
                        if (z) {
                            ((yl7) this.clock).getClass();
                            updateBackoffMetadataWithLastFailedStreamConnectionTime(new Date(System.currentTimeMillis()));
                        }
                        if (z || num.intValue() == 200) {
                            retryHttpConnectionWhenBackoffEnds();
                        } else {
                            String forbiddenErrorResponseMessage3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num);
                            if (num.intValue() == 403) {
                                forbiddenErrorResponseMessage3 = parseForbiddenErrorResponseMessage(this.httpURLConnection.getErrorStream());
                            }
                            propagateErrors(new FirebaseRemoteConfigServerException(num.intValue(), forbiddenErrorResponseMessage3, FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR));
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                    errorStream = null;
                    bo7Var = bo7Var;
                    ValueOf = errorStream;
                    if (this.isInBackground) {
                        resetRetryCount();
                    } else {
                        Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                    }
                    closeRealtimeHttpConnection(bo7Var, errorStream);
                    setIsHttpConnectionRunning(false);
                    if (this.isInBackground) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (z) {
                        ((yl7) this.clock).getClass();
                        updateBackoffMetadataWithLastFailedStreamConnectionTime(new Date(System.currentTimeMillis()));
                    }
                    if (z) {
                    }
                    retryHttpConnectionWhenBackoffEnds();
                    this.httpURLConnection = null;
                    this.configAutoFetch = null;
                    return h57.j(null);
                } catch (Throwable th3) {
                    num = null;
                    th = th3;
                    errorStream = null;
                }
                this.httpURLConnection = null;
                this.configAutoFetch = null;
                return h57.j(null);
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (IOException e4) {
            e = e4;
            bo7Var = 0;
            errorStream = null;
        } catch (Throwable th5) {
            errorStream = null;
            num = null;
            th = th5;
            bo7Var = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ bo7 lambda$createRealtimeConnection$0(bo7 bo7Var, bo7 bo7Var2, bo7 bo7Var3) {
        if (!bo7Var.k()) {
            return h57.i(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for config update listener connection.", bo7Var.h()));
        }
        if (!bo7Var2.k()) {
            return h57.i(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for config update listener connection.", bo7Var2.h()));
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) getUrl().openConnection();
            setRequestParams(httpURLConnection, (String) bo7Var2.i(), ((InstallationTokenResult) bo7Var.i()).getToken());
            return h57.j(httpURLConnection);
        } catch (IOException e) {
            return h57.i(new FirebaseRemoteConfigClientException("Failed to open HTTP stream connection", e));
        }
    }

    private synchronized void makeRealtimeHttpConnection(long j) {
        try {
            if (canMakeHttpStreamConnection()) {
                int i = this.httpRetriesRemaining;
                if (i > 0) {
                    this.httpRetriesRemaining = i - 1;
                    this.scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ConfigRealtimeHttpClient.this.beginRealtimeHttpStream();
                        }
                    }, j, TimeUnit.MILLISECONDS);
                } else if (!this.isInBackground) {
                    propagateErrors(new FirebaseRemoteConfigClientException("Unable to connect to the server. Check your connection and try again.", FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private String parseForbiddenErrorResponseMessage(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void propagateErrors(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator<ConfigUpdateListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onError(firebaseRemoteConfigException);
        }
    }

    private synchronized void resetRetryCount() {
        this.httpRetriesRemaining = 8;
    }

    private void setCommonRequestHeaders(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.firebaseApp.getOptions().getApiKey());
        httpURLConnection.setRequestProperty("X-Android-Package", this.context.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", getFingerprintHashForPackage());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    private synchronized void setIsHttpConnectionRunning(boolean z) {
        this.isHttpConnectionRunning = z;
    }

    private void updateBackoffMetadataWithLastFailedStreamConnectionTime(Date date) {
        int numFailedStreams = this.sharedPrefsClient.getRealtimeBackoffMetadata().getNumFailedStreams() + 1;
        this.sharedPrefsClient.setRealtimeBackoffMetadata(numFailedStreams, new Date(date.getTime() + getRandomizedBackoffDurationInMillis(numFailedStreams)));
    }

    public void beginRealtimeHttpStream() {
        if (checkAndSetHttpConnectionFlagIfNotRunning()) {
            ConfigSharedPrefsClient.RealtimeBackoffMetadata realtimeBackoffMetadata = this.sharedPrefsClient.getRealtimeBackoffMetadata();
            ((yl7) this.clock).getClass();
            if (new Date(System.currentTimeMillis()).before(realtimeBackoffMetadata.getBackoffEndTime())) {
                retryHttpConnectionWhenBackoffEnds();
            } else {
                bo7 bo7VarCreateRealtimeConnection = createRealtimeConnection();
                h57.C(bo7VarCreateRealtimeConnection).f(this.scheduledExecutorService, new q7(this, bo7VarCreateRealtimeConnection, (byte) 15));
            }
        }
    }

    public void closeRealtimeHttpConnection(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.httpURLConnection;
        if (httpURLConnection != null && !this.isInBackground) {
            httpURLConnection.disconnect();
        }
        closeHttpConnectionInputStream(inputStream);
        closeHttpConnectionInputStream(inputStream2);
    }

    public bo7 createRealtimeConnection() {
        bo7 token = this.firebaseInstallations.getToken(false);
        bo7 id = this.firebaseInstallations.getId();
        return h57.C(token, id).g(this.scheduledExecutorService, new i5(this, token, id, (byte) 4));
    }

    public synchronized void retryHttpConnectionWhenBackoffEnds() {
        ((yl7) this.clock).getClass();
        makeRealtimeHttpConnection(Math.max(0L, this.sharedPrefsClient.getRealtimeBackoffMetadata().getBackoffEndTime().getTime() - new Date(System.currentTimeMillis()).getTime()));
    }

    public void setIsInBackground(boolean z) {
        HttpURLConnection httpURLConnection;
        synchronized (this.backgroundLock) {
            try {
                this.isInBackground = z;
                ConfigAutoFetch configAutoFetch = this.configAutoFetch;
                if (configAutoFetch != null) {
                    configAutoFetch.setIsInBackground(z);
                }
                if (z && (httpURLConnection = this.httpURLConnection) != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setRequestParams(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        httpURLConnection.setRequestMethod("POST");
        setCommonRequestHeaders(httpURLConnection, str2);
        byte[] bytes = createRequestBody(str).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public synchronized ConfigAutoFetch startAutoFetch(HttpURLConnection httpURLConnection) {
        return new ConfigAutoFetch(httpURLConnection, this.configFetchHandler, this.activatedCache, this.listeners, new ConfigUpdateListener() { // from class: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.2
            @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
            public void onError(FirebaseRemoteConfigException firebaseRemoteConfigException) {
                ConfigRealtimeHttpClient.this.enableBackoff();
                ConfigRealtimeHttpClient.this.propagateErrors(firebaseRemoteConfigException);
            }

            @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
            public void onUpdate(ConfigUpdate configUpdate) {
            }
        }, this.scheduledExecutorService, this.sharedPrefsClient);
    }

    public void startHttpConnection() {
        makeRealtimeHttpConnection(0L);
    }
}
