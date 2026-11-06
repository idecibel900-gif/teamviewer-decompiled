package com.google.firebase.platforminfo;

import o.vz3;

/* JADX INFO: loaded from: classes.dex */
public abstract class KotlinDetector {
    public static String detectVersion() {
        try {
            return vz3.q.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
