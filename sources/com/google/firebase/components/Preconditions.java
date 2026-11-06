package com.google.firebase.components;

import o.hk0;
import o.yq4;

/* JADX INFO: loaded from: classes.dex */
public abstract class Preconditions {
    public static void checkArgument(boolean z, String str) {
        if (z) {
            return;
        }
        hk0.g(str);
    }

    public static <T> T checkNotNull(T t, String str) {
        if (t != null) {
            return t;
        }
        yq4.l(str);
        return null;
    }

    public static void checkState(boolean z, String str) {
        if (z) {
            return;
        }
        hk0.l(str);
    }

    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }
}
