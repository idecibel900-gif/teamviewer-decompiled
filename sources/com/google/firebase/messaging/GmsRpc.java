package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.platforminfo.UserAgentPublisher;
import io.sentry.android.core.v0;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import o.bo7;
import o.el5;
import o.gg6;
import o.gk0;
import o.gy8;
import o.h57;
import o.hy8;
import o.jy8;
import o.lg6;
import o.lh7;
import o.m12;
import o.wj5;
import o.xv;
import o.yx8;

/* JADX INFO: loaded from: classes.dex */
class GmsRpc {
    private final FirebaseApp app;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final Provider<HeartBeatInfo> heartbeatInfo;
    private final Metadata metadata;
    private final gg6 rpc;
    private final Provider<UserAgentPublisher> userAgentPublisher;

    public GmsRpc(FirebaseApp firebaseApp, Metadata metadata, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        this(firebaseApp, metadata, new gg6(firebaseApp.getApplicationContext()), provider, provider2, firebaseInstallationsApi);
    }

    private static String base64UrlSafe(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private bo7 extractResponseWhenComplete(bo7 bo7Var) {
        return bo7Var.f(new xv((byte) 1), new b(this, (byte) 2));
    }

    private String getHashedFirebaseAppName() {
        try {
            return base64UrlSafe(MessageDigest.getInstance("SHA-1").digest(this.app.getName().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String handleResponse(Bundle bundle) throws IOException {
        if (bundle == null) {
            gk0.l("SERVICE_NOT_AVAILABLE");
            return null;
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            gk0.l("INSTANCE_ID_RESET");
            return null;
        }
        if (string3 != null) {
            gk0.l(string3);
            return null;
        }
        v0.l("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        gk0.l("SERVICE_NOT_AVAILABLE");
        return null;
    }

    public static boolean isErrorMessageForRetryableError(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String lambda$extractResponseWhenComplete$0(bo7 bo7Var) {
        Object obj;
        hy8 hy8Var = (hy8) bo7Var;
        synchronized (hy8Var.a) {
            if (!hy8Var.c) {
                throw new IllegalStateException("Task is not yet complete");
            }
            if (hy8Var.d) {
                throw new CancellationException("Task is already canceled.");
            }
            boolean zIsInstance = IOException.class.isInstance(hy8Var.f);
            Exception exc = hy8Var.f;
            if (zIsInstance) {
                throw ((Throwable) IOException.class.cast(exc));
            }
            if (exc != null) {
                throw new lg6(exc);
            }
            obj = hy8Var.e;
        }
        return handleResponse((Bundle) obj);
    }

    private void setDefaultAttributesToBundle(String str, String str2, Bundle bundle, boolean z) {
        HeartBeatInfo.HeartBeat heartBeatCode;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.app.getOptions().getApplicationId());
        bundle.putString("gmsv", Integer.toString(this.metadata.getGmsVersionCode()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.metadata.getAppVersionCode());
        bundle.putString("app_ver_name", this.metadata.getAppVersionName());
        bundle.putString("firebase-app-name-hash", getHashedFirebaseAppName());
        if (z) {
            bundle.putString("Goog-Api-Key", this.app.getOptions().getApiKey());
        }
        try {
            String token = ((InstallationTokenResult) h57.e(this.firebaseInstallations.getToken(false))).getToken();
            if (TextUtils.isEmpty(token)) {
                v0.j("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", token);
            }
        } catch (InterruptedException e) {
            e = e;
            v0.d("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e2) {
            e = e2;
            v0.d("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) h57.e(this.firebaseInstallations.getId()));
        bundle.putString("cliv", "fcm-25.1.3");
        HeartBeatInfo heartBeatInfo = this.heartbeatInfo.get();
        UserAgentPublisher userAgentPublisher = this.userAgentPublisher.get();
        if (heartBeatInfo == null || userAgentPublisher == null || (heartBeatCode = heartBeatInfo.getHeartBeatCode("fire-iid")) == HeartBeatInfo.HeartBeat.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(heartBeatCode.getCode()));
        bundle.putString("Firebase-Client", userAgentPublisher.getUserAgent());
    }

    private bo7 startRpc(String str, String str2, Bundle bundle, boolean z) {
        int i;
        try {
            setDefaultAttributesToBundle(str, str2, bundle, z);
            gg6 gg6Var = this.rpc;
            m12 m12Var = m12.f1424o;
            jy8 jy8Var = gg6Var.c;
            if (jy8Var.b() < 12000000) {
                return jy8Var.a() != 0 ? gg6Var.b(bundle).g(m12Var, new lh7(gg6Var, bundle, (byte) 29)) : h57.i(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            gy8 gy8VarT = gy8.t(gg6Var.b);
            synchronized (gy8VarT) {
                i = gy8VarT.b;
                gy8VarT.b = i + 1;
            }
            return gy8VarT.u(new yx8(i, 1, bundle, (byte) 1)).f(m12Var, el5.n);
        } catch (InterruptedException | ExecutionException e) {
            return h57.i(e);
        }
    }

    public bo7 deleteToken(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return extractResponseWhenComplete(startRpc(Metadata.getDefaultSenderId(this.app), "*", bundle, z));
    }

    public bo7 getProxyNotificationData() {
        int i;
        gg6 gg6Var = this.rpc;
        if (gg6Var.c.b() < 241100000) {
            return h57.i(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        gy8 gy8VarT = gy8.t(gg6Var.b);
        Bundle bundle = Bundle.EMPTY;
        synchronized (gy8VarT) {
            i = gy8VarT.b;
            gy8VarT.b = i + 1;
        }
        return gy8VarT.u(new yx8(i, 5, bundle, (byte) 1)).f(m12.f1424o, wj5.f2418o);
    }

    public bo7 getToken(boolean z) {
        return extractResponseWhenComplete(startRpc(Metadata.getDefaultSenderId(this.app), "*", new Bundle(), z));
    }

    public bo7 setRetainProxiedNotifications(boolean z) {
        int i;
        gg6 gg6Var = this.rpc;
        if (gg6Var.c.b() < 241100000) {
            return h57.i(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("proxy_retention", z);
        gy8 gy8VarT = gy8.t(gg6Var.b);
        synchronized (gy8VarT) {
            i = gy8VarT.b;
            gy8VarT.b = i + 1;
        }
        return gy8VarT.u(new yx8(i, 4, bundle, (byte) 0));
    }

    public GmsRpc(FirebaseApp firebaseApp, Metadata metadata, gg6 gg6Var, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        this.app = firebaseApp;
        this.metadata = metadata;
        this.rpc = gg6Var;
        this.userAgentPublisher = provider;
        this.heartbeatInfo = provider2;
        this.firebaseInstallations = firebaseInstallationsApi;
    }
}
