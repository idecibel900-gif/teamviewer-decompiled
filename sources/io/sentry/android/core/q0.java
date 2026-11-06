package io.sentry.android.core;

import android.os.Build;
import io.sentry.f6;

/* JADX INFO: loaded from: classes.dex */
public final class q0 {
    public final io.sentry.g1 a;

    public q0(io.sentry.g1 g1Var) {
        io.sentry.util.b.v(g1Var, "The ILogger object is required.");
        this.a = g1Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0097  */
    public final Boolean a() {
        boolean z;
        try {
            if (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) {
                z = true;
            } else {
                String str = Build.FINGERPRINT;
                if (str.startsWith("generic") || str.startsWith("unknown")) {
                    z = true;
                } else {
                    String str2 = Build.HARDWARE;
                    if (str2.contains("goldfish") || str2.contains("ranchu")) {
                        z = true;
                    } else {
                        String str3 = Build.MODEL;
                        if (str3.contains("google_sdk") || str3.contains("Emulator") || str3.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion")) {
                            z = true;
                        } else {
                            String str4 = Build.PRODUCT;
                            if (str4.contains("sdk_google") || str4.contains("google_sdk") || str4.contains("sdk") || str4.contains("sdk_x86") || str4.contains("vbox86p") || str4.contains("emulator") || str4.contains("simulator")) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                    }
                }
            }
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            this.a.d(f6.ERROR, "Error checking whether application is running in an emulator.", th);
            return null;
        }
    }
}
