package com.teamviewer.teamviewerlib.swig.tvnetwork;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public enum EOnlineState {
    Initializing,
    Online,
    Offline,
    Shutdown,
    OfflinePending,
    ShutdownPending;

    private final int swigValue;

    public static class SwigNext {
        private static int next;

        private SwigNext() {
        }
    }

    EOnlineState() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    public static EOnlineState swigToEnum(int i) {
        EOnlineState[] eOnlineStateArr = (EOnlineState[]) EOnlineState.class.getEnumConstants();
        if (i < eOnlineStateArr.length && i >= 0) {
            EOnlineState eOnlineState = eOnlineStateArr[i];
            if (eOnlineState.swigValue == i) {
                return eOnlineState;
            }
        }
        for (EOnlineState eOnlineState2 : eOnlineStateArr) {
            if (eOnlineState2.swigValue == i) {
                return eOnlineState2;
            }
        }
        hk0.g(ua5.k(i, EOnlineState.class, "No enum ", " with value "));
        return null;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    EOnlineState(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    EOnlineState(EOnlineState eOnlineState) {
        int i = eOnlineState.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
