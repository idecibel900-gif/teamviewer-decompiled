package com.teamviewer.chatviewmodel.swig;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public enum ResendOptions {
    ResendNotPossible,
    ResendDisabled,
    ResendPossible;

    private final int swigValue;

    public static class SwigNext {
        private static int next;

        private SwigNext() {
        }
    }

    ResendOptions() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    public static ResendOptions swigToEnum(int i) {
        ResendOptions[] resendOptionsArr = (ResendOptions[]) ResendOptions.class.getEnumConstants();
        if (i < resendOptionsArr.length && i >= 0) {
            ResendOptions resendOptions = resendOptionsArr[i];
            if (resendOptions.swigValue == i) {
                return resendOptions;
            }
        }
        for (ResendOptions resendOptions2 : resendOptionsArr) {
            if (resendOptions2.swigValue == i) {
                return resendOptions2;
            }
        }
        hk0.g(ua5.k(i, ResendOptions.class, "No enum ", " with value "));
        return null;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    ResendOptions(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    ResendOptions(ResendOptions resendOptions) {
        int i = resendOptions.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
