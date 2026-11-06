package com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public enum ARSessionType {
    Unknown(0),
    AR(1),
    NoAR(2);

    private final int swigValue;

    public static class SwigNext {
        private static int next;

        private SwigNext() {
        }
    }

    ARSessionType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    public static ARSessionType swigToEnum(int i) {
        ARSessionType[] aRSessionTypeArr = (ARSessionType[]) ARSessionType.class.getEnumConstants();
        if (i < aRSessionTypeArr.length && i >= 0) {
            ARSessionType aRSessionType = aRSessionTypeArr[i];
            if (aRSessionType.swigValue == i) {
                return aRSessionType;
            }
        }
        for (ARSessionType aRSessionType2 : aRSessionTypeArr) {
            if (aRSessionType2.swigValue == i) {
                return aRSessionType2;
            }
        }
        hk0.g(ua5.k(i, ARSessionType.class, "No enum ", " with value "));
        return null;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    ARSessionType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    ARSessionType(ARSessionType aRSessionType) {
        int i = aRSessionType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
