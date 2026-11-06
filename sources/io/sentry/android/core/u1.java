package io.sentry.android.core;

import io.sentry.e4;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class u1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[e4.values().length];
        a = iArr;
        try {
            iArr[e4.TRACE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[e4.MANUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
