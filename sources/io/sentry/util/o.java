package io.sentry.util;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static final ThreadLocal a = new ThreadLocal();
    public static final n b = new n();

    public static boolean a() {
        Integer num = (Integer) a.get();
        return num != null && num.intValue() > 0;
    }
}
