package com.teamviewer.commonviewmodel.swig;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public enum ViewModelOnlineState {
    NoState(0),
    Online(1),
    OnlineAway(2),
    OnlineBusy(3),
    Offline(4);

    private final int swigValue;

    public static class SwigNext {
        private static int next;

        private SwigNext() {
        }
    }

    ViewModelOnlineState() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    public static ViewModelOnlineState swigToEnum(int i) {
        ViewModelOnlineState[] viewModelOnlineStateArr = (ViewModelOnlineState[]) ViewModelOnlineState.class.getEnumConstants();
        if (i < viewModelOnlineStateArr.length && i >= 0) {
            ViewModelOnlineState viewModelOnlineState = viewModelOnlineStateArr[i];
            if (viewModelOnlineState.swigValue == i) {
                return viewModelOnlineState;
            }
        }
        for (ViewModelOnlineState viewModelOnlineState2 : viewModelOnlineStateArr) {
            if (viewModelOnlineState2.swigValue == i) {
                return viewModelOnlineState2;
            }
        }
        hk0.g(ua5.k(i, ViewModelOnlineState.class, "No enum ", " with value "));
        return null;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    ViewModelOnlineState(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    ViewModelOnlineState(ViewModelOnlineState viewModelOnlineState) {
        int i = viewModelOnlineState.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
