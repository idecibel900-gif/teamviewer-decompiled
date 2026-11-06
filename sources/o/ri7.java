package o;

/* JADX INFO: loaded from: classes.dex */
public enum ri7 implements i10 {
    WhatAccess((byte) 1),
    Answer((byte) 2),
    /* JADX INFO: Fake field, exist only in values array */
    Requester((byte) 3),
    /* JADX INFO: Fake field, exist only in values array */
    DenyReason((byte) 4),
    /* JADX INFO: Fake field, exist only in values array */
    Timeout((byte) 5);

    public final byte m;

    ri7(byte b) {
        this.m = b;
    }

    @Override // o.i10
    public final byte a() {
        return this.m;
    }
}
