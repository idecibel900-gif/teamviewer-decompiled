package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Subscriber;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.platforminfo.UserAgentPublisher;
import io.sentry.android.core.v0;
import io.sentry.u4;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.ar;
import o.bo7;
import o.do7;
import o.gk0;
import o.h28;
import o.h57;
import o.ku0;
import o.nv1;
import o.vy0;
import o.wy4;
import o.xl2;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessaging {
    private static Store store;
    static ScheduledExecutorService syncExecutor;
    private final AutoInit autoInit;
    private final Context context;
    private final Executor fileExecutor;
    private final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi firebaseInstallationsApi;
    private final GmsRegistrationClient gmsRegistrationClient;
    private final GmsRpc gmsRpc;
    private final Executor initExecutor;
    private final Application.ActivityLifecycleCallbacks lifecycleCallbacks;
    private final Metadata metadata;
    private final RequestDeduplicator requestDeduplicator;
    private boolean syncScheduledOrRunning;
    private final bo7 topicsSubscriberTask;
    private static final long MAX_DELAY_SEC = 28800;
    static Provider<h28> transportFactory = new vy0(5);

    public class AutoInit {
        private Boolean autoInitEnabled;
        private EventHandler<DataCollectionDefaultChange> dataCollectionDefaultChangeEventHandler;
        private boolean initialized;
        private final Subscriber subscriber;

        public AutoInit(Subscriber subscriber) {
            this.subscriber = subscriber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$initialize$0(Event event) {
            if (isEnabled()) {
                FirebaseMessaging.this.startSyncIfNecessary();
            }
        }

        private Boolean readEnabled() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context applicationContext = FirebaseMessaging.this.firebaseApp.getApplicationContext();
            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = applicationContext.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        public synchronized void initialize() {
            try {
                if (this.initialized) {
                    return;
                }
                Boolean enabled = readEnabled();
                this.autoInitEnabled = enabled;
                if (enabled == null) {
                    d dVar = new d(this);
                    this.dataCollectionDefaultChangeEventHandler = dVar;
                    this.subscriber.subscribe(DataCollectionDefaultChange.class, dVar);
                }
                this.initialized = true;
            } catch (Throwable th) {
                throw th;
            }
        }

        public synchronized boolean isEnabled() {
            Boolean bool;
            try {
                initialize();
                bool = this.autoInitEnabled;
            } catch (Throwable th) {
                throw th;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.firebaseApp.isDataCollectionDefaultEnabled();
        }
    }

    public FirebaseMessaging(FirebaseApp firebaseApp, FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider<h28> provider, Subscriber subscriber, Metadata metadata, GmsRpc gmsRpc, FirebaseInstallationsApi firebaseInstallationsApi, Executor executor, Executor executor2, Executor executor3) {
        final byte b = 0;
        this.syncScheduledOrRunning = false;
        transportFactory = provider;
        this.firebaseApp = firebaseApp;
        this.autoInit = new AutoInit(subscriber);
        Context applicationContext = firebaseApp.getApplicationContext();
        this.context = applicationContext;
        FcmLifecycleCallbacks fcmLifecycleCallbacks = new FcmLifecycleCallbacks();
        this.lifecycleCallbacks = fcmLifecycleCallbacks;
        this.metadata = metadata;
        this.gmsRpc = gmsRpc;
        this.firebaseInstallationsApi = firebaseInstallationsApi;
        GmsRegistrationClient gmsRegistrationClient = new GmsRegistrationClient(applicationContext, firebaseApp, firebaseInstallationsApi, gmsRpc, metadata);
        this.gmsRegistrationClient = gmsRegistrationClient;
        this.requestDeduplicator = new RequestDeduplicator(executor);
        this.initExecutor = executor2;
        this.fileExecutor = executor3;
        Context applicationContext2 = firebaseApp.getApplicationContext();
        if (applicationContext2 instanceof Application) {
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(fcmLifecycleCallbacks);
        } else {
            v0.j("FirebaseMessaging", "Context " + applicationContext2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (firebaseInstanceIdInternal != null && !gmsRegistrationClient.isV1RegistrationEnabled()) {
            firebaseInstanceIdInternal.addNewTokenListener(new gk0((byte) 20));
        }
        if (gmsRegistrationClient.isV1RegistrationEnabled()) {
            firebaseInstallationsApi.registerFidListener(new xl2(this));
        }
        executor2.execute(new Runnable(this) { // from class: o.yl2
            public final /* synthetic */ FirebaseMessaging n;

            {
                this.n = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                FirebaseMessaging firebaseMessaging = this.n;
                switch (b2) {
                    case 0:
                        firebaseMessaging.lambda$new$3();
                        break;
                    default:
                        firebaseMessaging.lambda$new$5();
                        break;
                }
            }
        });
        bo7 bo7VarCreateInstance = TopicsSubscriber.createInstance(firebaseApp, this, firebaseInstallationsApi, metadata, applicationContext, FcmExecutors.newTopicsSyncExecutor());
        this.topicsSubscriberTask = bo7VarCreateInstance;
        bo7VarCreateInstance.e(executor2, new b(this, b));
        final byte b2 = 1;
        executor2.execute(new Runnable(this) { // from class: o.yl2
            public final /* synthetic */ FirebaseMessaging n;

            {
                this.n = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b2;
                FirebaseMessaging firebaseMessaging = this.n;
                switch (b3) {
                    case 0:
                        firebaseMessaging.lambda$new$3();
                        break;
                    default:
                        firebaseMessaging.lambda$new$5();
                        break;
                }
            }
        });
    }

    private String fetchFid() {
        try {
            return (String) h57.e(this.firebaseInstallationsApi.getId());
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Deprecated
    public static synchronized FirebaseMessaging getInstance(FirebaseApp firebaseApp) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) firebaseApp.get(FirebaseMessaging.class);
        nv1.t(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    private static synchronized Store getStore(Context context) {
        Store store2;
        store2 = store;
        if (store2 == null) {
            store2 = new Store(context);
            store = store2;
        }
        return store2;
    }

    private String getSubtype() {
        return "[DEFAULT]".equals(this.firebaseApp.getName()) ? "" : this.firebaseApp.getPersistenceKey();
    }

    public static h28 getTransportFactory() {
        return transportFactory.get();
    }

    private void handleProxiedNotificationData() {
        this.gmsRpc.getProxyNotificationData().e(this.initExecutor, new ar(this, (byte) 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initializeProxyNotifications, reason: merged with bridge method [inline-methods] */
    public void lambda$new$5() {
        ProxyNotificationInitializer.initialize(this.context);
        ProxyNotificationPreferences.setProxyRetention(this.context, this.gmsRpc, shouldRetainProxyNotifications());
        if (shouldRetainProxyNotifications()) {
            handleProxiedNotificationData();
        }
    }

    private void invokeOnRegistrationChanged(String str, boolean z) {
        if ("[DEFAULT]".equals(this.firebaseApp.getName())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.firebaseApp.getName());
            }
            boolean zIsV1RegistrationEnabled = this.gmsRegistrationClient.isV1RegistrationEnabled();
            Intent intent = new Intent();
            intent.putExtra("token", str);
            if (zIsV1RegistrationEnabled) {
                intent.setAction(z ? "com.google.firebase.messaging.FCM_UNREGISTERED" : "com.google.firebase.messaging.FCM_REGISTERED");
            } else if (z) {
                return;
            } else {
                intent.setAction("com.google.firebase.messaging.NEW_TOKEN");
            }
            new FcmBroadcastProcessor(this.context).process(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ bo7 lambda$blockingRegister$16(String str, boolean z, Store.Token token, String str2) {
        getStore(this.context).saveToken(getSubtype(), str, str2, this.metadata.getAppVersionCode());
        if (this.gmsRegistrationClient.isV1RegistrationEnabled() || z || token == null || !str2.equals(token.token)) {
            invokeOnRegistrationChanged(str2, false);
        }
        return h57.j(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ bo7 lambda$blockingRegister$17(String str, boolean z, Store.Token token) {
        return this.gmsRegistrationClient.register().l(this.fileExecutor, new a(this, str, z, token));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$handleProxiedNotificationData$6(ku0 ku0Var) {
        if (ku0Var != null) {
            MessagingAnalytics.logNotificationReceived(ku0Var.m);
            handleProxiedNotificationData();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(String str) {
        if (getTokenWithoutTriggeringSync() == null) {
            return;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "FID Change detected! Triggering re-sync");
        }
        startSync();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3() {
        if (isAutoInitEnabled()) {
            startSyncIfNecessary();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$4(TopicsSubscriber topicsSubscriber) {
        if (isAutoInitEnabled()) {
            topicsSubscriber.startTopicsSyncIfNecessary();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$register$9(do7 do7Var) {
        try {
            blockingRegister(true);
            do7Var.a(null);
        } catch (IOException e) {
            do7Var.a.n(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ h28 lambda$static$0() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$unregister$12(do7 do7Var, Store.Token token) {
        try {
            h57.e(this.gmsRegistrationClient.unregister());
            getStore(this.context).deleteToken(getSubtype(), Metadata.getDefaultSenderId(this.firebaseApp));
            do7Var.a(null);
            invokeOnRegistrationChanged(token.token, true);
        } catch (Exception e) {
            do7Var.a.n(e);
        }
    }

    private boolean shouldRetainProxyNotifications() {
        ProxyNotificationInitializer.initialize(this.context);
        if (!ProxyNotificationInitializer.isProxyNotificationEnabled(this.context)) {
            return false;
        }
        if (this.firebaseApp.get(AnalyticsConnector.class) != null) {
            return true;
        }
        return MessagingAnalytics.deliveryMetricsExportToBigQueryEnabled() && transportFactory != null;
    }

    private synchronized void startSync() {
        if (!this.syncScheduledOrRunning) {
            syncWithDelaySecondsInternal(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSyncIfNecessary() {
        if (tokenNeedsRefresh(getTokenWithoutTriggeringSync())) {
            startSync();
        }
    }

    public String blockingGetToken() {
        return blockingRegister(false);
    }

    public String blockingRegister(boolean z) throws IOException {
        Store.Token tokenWithoutTriggeringSync = getTokenWithoutTriggeringSync();
        if (!tokenNeedsRefresh(tokenWithoutTriggeringSync)) {
            if (z) {
                invokeOnRegistrationChanged(tokenWithoutTriggeringSync.token, false);
            }
            return tokenWithoutTriggeringSync.token;
        }
        String defaultSenderId = Metadata.getDefaultSenderId(this.firebaseApp);
        try {
            return (String) h57.e(this.requestDeduplicator.getOrStartGetTokenRequest(defaultSenderId, new a(this, defaultSenderId, z, tokenWithoutTriggeringSync)));
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException("FCM Registration failed!", e);
        }
    }

    public void enqueueTaskWithDelaySeconds(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                ScheduledExecutorService scheduledThreadPoolExecutor = syncExecutor;
                if (scheduledThreadPoolExecutor == null) {
                    scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new wy4("TAG"));
                    syncExecutor = scheduledThreadPoolExecutor;
                }
                scheduledThreadPoolExecutor.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Context getApplicationContext() {
        return this.context;
    }

    public Store.Token getTokenWithoutTriggeringSync() {
        return getStore(this.context).getToken(getSubtype(), Metadata.getDefaultSenderId(this.firebaseApp));
    }

    public boolean isAutoInitEnabled() {
        return this.autoInit.isEnabled();
    }

    public boolean isGmsCorePresent() {
        return this.metadata.isGmscorePresent();
    }

    public bo7 register() {
        if (!this.gmsRegistrationClient.isV1RegistrationEnabled()) {
            return h57.i(new IllegalStateException("API disabled. Please enable it by adding {@code <meta-data android:name=\"firebase_messaging_installation_id_enabled\" android:value=\"true\" />} to your app's manifest."));
        }
        do7 do7Var = new do7();
        this.initExecutor.execute(new u4((Object) this, (Object) do7Var, (byte) 27));
        return do7Var.a;
    }

    public synchronized void setSyncScheduledOrRunning(boolean z) {
        this.syncScheduledOrRunning = z;
    }

    public synchronized void syncWithDelaySecondsInternal(long j) {
        enqueueTaskWithDelaySeconds(new SyncTask(this, Math.min(Math.max(30L, 2 * j), MAX_DELAY_SEC)), j);
        this.syncScheduledOrRunning = true;
    }

    public boolean tokenNeedsRefresh(Store.Token token) {
        if (token == null || token.needsRefresh(this.metadata.getAppVersionCode())) {
            return true;
        }
        if (!this.gmsRegistrationClient.isV1RegistrationEnabled()) {
            return token.isFid();
        }
        return !token.token.equalsIgnoreCase(fetchFid());
    }

    public bo7 unregister() {
        if (!this.gmsRegistrationClient.isV1RegistrationEnabled()) {
            return h57.i(new IllegalStateException("API disabled. Please enable it by adding {@code <meta-data android:name=\"firebase_messaging_installation_id_enabled\" android:value=\"true\" />} to your app's manifest."));
        }
        final Store.Token tokenWithoutTriggeringSync = getTokenWithoutTriggeringSync();
        if (tokenWithoutTriggeringSync == null) {
            return h57.j(null);
        }
        final do7 do7Var = new do7();
        FcmExecutors.newNetworkIOExecutor().execute(new Runnable() { // from class: com.google.firebase.messaging.c
            @Override // java.lang.Runnable
            public final void run() {
                this.m.lambda$unregister$12(do7Var, tokenWithoutTriggeringSync);
            }
        });
        return do7Var.a;
    }

    public static synchronized FirebaseMessaging getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    public FirebaseMessaging(FirebaseApp firebaseApp, FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi, Provider<h28> provider3, Subscriber subscriber, Metadata metadata) {
        this(firebaseApp, firebaseInstanceIdInternal, provider3, subscriber, metadata, new GmsRpc(firebaseApp, metadata, provider, provider2, firebaseInstallationsApi), firebaseInstallationsApi, FcmExecutors.newTaskExecutor(), FcmExecutors.newInitExecutor(), FcmExecutors.newFileIOExecutor());
    }

    public FirebaseMessaging(FirebaseApp firebaseApp, FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi, Provider<h28> provider3, Subscriber subscriber) {
        this(firebaseApp, firebaseInstanceIdInternal, provider, provider2, firebaseInstallationsApi, provider3, subscriber, new Metadata(firebaseApp.getApplicationContext()));
    }
}
