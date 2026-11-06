package com.teamviewer.chatviewmodel.swig;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public enum EndpointUIState {
    NoState,
    Unknown,
    Online,
    OnlineBusy,
    OnlineAway,
    Offline;

    private final int swigValue;

    public static class SwigNext {
        private static int next;

        private SwigNext() {
        }
    }

    EndpointUIState() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    public static EndpointUIState swigToEnum(int i) {
        EndpointUIState[] endpointUIStateArr = (EndpointUIState[]) EndpointUIState.class.getEnumConstants();
        if (i < endpointUIStateArr.length && i >= 0) {
            EndpointUIState endpointUIState = endpointUIStateArr[i];
            if (endpointUIState.swigValue == i) {
                return endpointUIState;
            }
        }
        for (EndpointUIState endpointUIState2 : endpointUIStateArr) {
            if (endpointUIState2.swigValue == i) {
                return endpointUIState2;
            }
        }
        hk0.g(ua5.k(i, EndpointUIState.class, "No enum ", " with value "));
        return null;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    EndpointUIState(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    EndpointUIState(EndpointUIState endpointUIState) {
        int i = endpointUIState.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
