package io.sentry.android.replay.util;

import android.os.Build;
import o.gk0;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static String a(h hVar) {
        String str;
        hVar.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return "";
        }
        int i = i.a[hVar.ordinal()];
        if (i == 1) {
            str = Build.SOC_MODEL;
        } else {
            if (i != 2) {
                gk0.s();
                return null;
            }
            str = Build.SOC_MANUFACTURER;
        }
        str.getClass();
        return str;
    }
}
