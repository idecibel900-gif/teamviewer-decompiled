package io.sentry.util;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static final boolean a;
    public static final boolean b;

    static {
        boolean zEquals;
        try {
            zEquals = "The Android Project".equals(System.getProperty("java.vendor"));
            a = zEquals;
        } catch (Throwable unused) {
            a = false;
            zEquals = false;
        }
        if (zEquals) {
            b = false;
            return;
        }
        try {
            String property = System.getProperty("java.specification.version");
            if (property != null) {
                b = Double.parseDouble(property) >= 9.0d;
            } else {
                b = false;
            }
        } catch (Throwable unused2) {
            b = false;
        }
    }
}
