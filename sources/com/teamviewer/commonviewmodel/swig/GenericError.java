package com.teamviewer.commonviewmodel.swig;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public enum GenericError {
    NoError(0),
    UnknownError(1),
    Timeout(2),
    InvalidParameter(3),
    MissingParameter(4),
    Disposed(5),
    CommandNotSend(6),
    InternalError(7),
    ProtocolError(8),
    Canceled(9),
    ConnectionLoss(10),
    EncryptionError(11);

    private final int swigValue;

    public static class SwigNext {
        private static int next;

        private SwigNext() {
        }
    }

    GenericError() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    public static GenericError swigToEnum(int i) {
        GenericError[] genericErrorArr = (GenericError[]) GenericError.class.getEnumConstants();
        if (i < genericErrorArr.length && i >= 0) {
            GenericError genericError = genericErrorArr[i];
            if (genericError.swigValue == i) {
                return genericError;
            }
        }
        for (GenericError genericError2 : genericErrorArr) {
            if (genericError2.swigValue == i) {
                return genericError2;
            }
        }
        hk0.g(ua5.k(i, GenericError.class, "No enum ", " with value "));
        return null;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    GenericError(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    GenericError(GenericError genericError) {
        int i = genericError.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
