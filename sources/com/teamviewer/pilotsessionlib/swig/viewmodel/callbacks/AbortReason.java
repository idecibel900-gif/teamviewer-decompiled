package com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public enum AbortReason {
    Undefined,
    ClientAborted,
    ConnectionLost,
    SessionTerminated;

    private final int swigValue;

    public static class SwigNext {
        private static int next;

        private SwigNext() {
        }
    }

    AbortReason() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    public static AbortReason swigToEnum(int i) {
        AbortReason[] abortReasonArr = (AbortReason[]) AbortReason.class.getEnumConstants();
        if (i < abortReasonArr.length && i >= 0) {
            AbortReason abortReason = abortReasonArr[i];
            if (abortReason.swigValue == i) {
                return abortReason;
            }
        }
        for (AbortReason abortReason2 : abortReasonArr) {
            if (abortReason2.swigValue == i) {
                return abortReason2;
            }
        }
        hk0.g(ua5.k(i, AbortReason.class, "No enum ", " with value "));
        return null;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    AbortReason(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    AbortReason(AbortReason abortReason) {
        int i = abortReason.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
