package com.teamviewer.chatviewmodel.swig;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public enum DeleteOptions {
    DeleteNotPossible,
    DeleteDisabled,
    DeletePossible;

    private final int swigValue;

    public static class SwigNext {
        private static int next;

        private SwigNext() {
        }
    }

    DeleteOptions() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    public static DeleteOptions swigToEnum(int i) {
        DeleteOptions[] deleteOptionsArr = (DeleteOptions[]) DeleteOptions.class.getEnumConstants();
        if (i < deleteOptionsArr.length && i >= 0) {
            DeleteOptions deleteOptions = deleteOptionsArr[i];
            if (deleteOptions.swigValue == i) {
                return deleteOptions;
            }
        }
        for (DeleteOptions deleteOptions2 : deleteOptionsArr) {
            if (deleteOptions2.swigValue == i) {
                return deleteOptions2;
            }
        }
        hk0.g(ua5.k(i, DeleteOptions.class, "No enum ", " with value "));
        return null;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    DeleteOptions(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    DeleteOptions(DeleteOptions deleteOptions) {
        int i = deleteOptions.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
