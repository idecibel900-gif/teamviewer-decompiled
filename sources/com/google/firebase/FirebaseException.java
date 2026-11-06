package com.google.firebase;

import o.nv1;

/* JADX INFO: loaded from: classes.dex */
public abstract class FirebaseException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseException(String str) {
        super(str);
        nv1.r(str, "Detail message must not be empty");
    }

    @Deprecated
    public FirebaseException() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseException(String str, Throwable th) {
        super(str, th);
        nv1.r(str, "Detail message must not be empty");
    }
}
