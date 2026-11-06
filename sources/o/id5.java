package o;

import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class id5 {
    public static boolean a(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.fingerprint");
    }
}
