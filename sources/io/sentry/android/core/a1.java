package io.sentry.android.core;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[io.sentry.y0.values().length];
        a = iArr;
        try {
            iArr[io.sentry.y0.DISCONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[io.sentry.y0.CONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
