package com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public enum ErrorReason {
    Undefined,
    OutOfSpace,
    DriveAccessDenied,
    Timeout;

    private final int swigValue;

    public static class SwigNext {
        private static int next;

        private SwigNext() {
        }
    }

    ErrorReason() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    public static ErrorReason swigToEnum(int i) {
        ErrorReason[] errorReasonArr = (ErrorReason[]) ErrorReason.class.getEnumConstants();
        if (i < errorReasonArr.length && i >= 0) {
            ErrorReason errorReason = errorReasonArr[i];
            if (errorReason.swigValue == i) {
                return errorReason;
            }
        }
        for (ErrorReason errorReason2 : errorReasonArr) {
            if (errorReason2.swigValue == i) {
                return errorReason2;
            }
        }
        hk0.g(ua5.k(i, ErrorReason.class, "No enum ", " with value "));
        return null;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    ErrorReason(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    ErrorReason(ErrorReason errorReason) {
        int i = errorReason.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
