package com.google.firebase.messaging;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import io.sentry.android.core.v0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import o.bi2;
import o.bo7;
import o.bq;
import o.co7;
import o.h57;
import o.h96;
import o.lh7;
import o.lu0;
import o.qf0;
import o.qz2;
import o.x88;
import o.yp8;

/* JADX INFO: loaded from: classes.dex */
class GmsRegistrationClient {
    private final FirebaseApp app;
    private final lu0 client;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final GmsRpc gmsRpc;
    private final Metadata metadata;

    public GmsRegistrationClient(Context context, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, GmsRpc gmsRpc, Metadata metadata) {
        this(firebaseApp, firebaseInstallationsApi, gmsRpc, new yp8(context, yp8.l, bq.a, qz2.b), metadata);
    }

    private bo7 fetchFidCredentials(ExecutorService executorService) {
        return this.firebaseInstallations.getToken(false).g(executorService, new f(this, executorService, (byte) 1));
    }

    private Exception getOrCreateException(bo7 bo7Var) {
        return bo7Var.h() != null ? bo7Var.h() : new ExecutionException(new RuntimeException("Unexpected Error"));
    }

    private boolean haveV1RegistrationSupport() {
        return this.metadata.getGmsVersionCode() >= 261200000;
    }

    private static boolean isFidAlreadyUsedException(Exception exc) {
        return (exc == null || TextUtils.isEmpty(exc.getMessage()) || !exc.getMessage().contains("FID_ALREADY_USED:")) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ bo7 lambda$fetchFidCredentials$0(String str, bo7 bo7Var) {
        return !bo7Var.k() ? h57.i(getOrCreateException(bo7Var)) : h57.j(new Pair((String) bo7Var.i(), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ bo7 lambda$fetchFidCredentials$1(ExecutorService executorService, bo7 bo7Var) {
        if (!bo7Var.k()) {
            return h57.i(getOrCreateException(bo7Var));
        }
        return this.firebaseInstallations.getId().g(executorService, new g((byte) 0, this, ((InstallationTokenResult) bo7Var.i()).getToken()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ bo7 lambda$register$2(bo7 bo7Var) {
        if (bo7Var.k() || !isFidAlreadyUsedException(bo7Var.h())) {
            return bo7Var;
        }
        v0.j("FirebaseMessaging", "FID_ALREADY_USED Detected. Retrying with FID cache clearing!");
        this.firebaseInstallations.clearFidCache();
        return registerInternal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$registerInternal$3(String str, bo7 bo7Var) throws ExecutionException {
        if (!bo7Var.k()) {
            throw new ExecutionException(bo7Var.h());
        }
        String str2 = (String) bo7Var.i();
        if (TextUtils.isEmpty(str2) || !str2.endsWith(str)) {
            throw new ExecutionException(new IllegalArgumentException("Unexpected Error: FID NOT matching!"));
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ bo7 lambda$registerInternal$4(ExecutorService executorService, bo7 bo7Var) {
        if (!bo7Var.k()) {
            return h57.i(getOrCreateException(bo7Var));
        }
        String str = (String) ((Pair) bo7Var.i()).first;
        return registerOverV1(str, (String) ((Pair) bo7Var.i()).second).f(executorService, new b(str, (byte) 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public bo7 lambda$unregisterOverV1$5(bo7 bo7Var) {
        if (!bo7Var.k()) {
            return h57.i(getOrCreateException(bo7Var));
        }
        String str = (String) ((Pair) bo7Var.i()).first;
        String str2 = (String) ((Pair) bo7Var.i()).second;
        x88 x88Var = new x88(Metadata.getDefaultSenderId(this.app), this.app.getOptions().getApiKey(), str, str2);
        yp8 yp8Var = (yp8) this.client;
        yp8Var.getClass();
        co7 co7Var = new co7();
        co7Var.b = true;
        co7Var.a = new bi2[]{qf0.t};
        co7Var.d = new lh7(yp8Var, x88Var, (byte) 25);
        co7Var.c = (char) 39002;
        return yp8Var.b(0, co7Var.a());
    }

    private bo7 registerInternal() {
        boolean zIsV1RegistrationEnabled = isV1RegistrationEnabled();
        if (!zIsV1RegistrationEnabled || !haveV1RegistrationSupport()) {
            return this.gmsRpc.getToken(zIsV1RegistrationEnabled);
        }
        ExecutorService executorServiceNewNetworkIOExecutor = FcmExecutors.newNetworkIOExecutor();
        return fetchFidCredentials(executorServiceNewNetworkIOExecutor).g(executorServiceNewNetworkIOExecutor, new f(this, executorServiceNewNetworkIOExecutor, (byte) 0));
    }

    private bo7 registerOverV1(String str, String str2) {
        String apiKey = this.app.getOptions().getApiKey();
        h96 h96Var = new h96(Metadata.getDefaultSenderId(this.app), this.app.getOptions().getApplicationId(), apiKey, str, str2);
        yp8 yp8Var = (yp8) this.client;
        yp8Var.getClass();
        co7 co7Var = new co7();
        co7Var.b = true;
        co7Var.a = new bi2[]{qf0.s};
        co7Var.d = new lh7(yp8Var, h96Var, (byte) 26);
        co7Var.c = (char) 39001;
        return yp8Var.b(0, co7Var.a());
    }

    private bo7 unregisterOverV1() {
        ExecutorService executorServiceNewNetworkIOExecutor = FcmExecutors.newNetworkIOExecutor();
        return fetchFidCredentials(executorServiceNewNetworkIOExecutor).g(executorServiceNewNetworkIOExecutor, new e(this, (byte) 0));
    }

    public boolean isV1RegistrationEnabled() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Context applicationContext = this.app.getApplicationContext();
        try {
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (bundle = (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)).metaData) == null || !bundle.containsKey("firebase_messaging_installation_id_enabled")) {
                return false;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_installation_id_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public bo7 register() {
        return registerInternal().g(FcmExecutors.newTaskExecutor(), new e(this, (byte) 1));
    }

    public bo7 unregister() {
        boolean zIsV1RegistrationEnabled = isV1RegistrationEnabled();
        return (zIsV1RegistrationEnabled && haveV1RegistrationSupport()) ? unregisterOverV1() : this.gmsRpc.deleteToken(zIsV1RegistrationEnabled);
    }

    public GmsRegistrationClient(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, GmsRpc gmsRpc, lu0 lu0Var, Metadata metadata) {
        this.client = lu0Var;
        this.app = firebaseApp;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.gmsRpc = gmsRpc;
        this.metadata = metadata;
    }
}
