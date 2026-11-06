package com.teamviewer.chatviewmodel.swig;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public enum ErrorMessage {
    UnknownError,
    EndpointIsOffline,
    EndpointIsUnknown,
    CannotOpenChatToMyself,
    EndpointDoesNotKnowYouYet;

    private final int swigValue;

    public static class SwigNext {
        private static int next;

        private SwigNext() {
        }
    }

    ErrorMessage() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    public static ErrorMessage swigToEnum(int i) {
        ErrorMessage[] errorMessageArr = (ErrorMessage[]) ErrorMessage.class.getEnumConstants();
        if (i < errorMessageArr.length && i >= 0) {
            ErrorMessage errorMessage = errorMessageArr[i];
            if (errorMessage.swigValue == i) {
                return errorMessage;
            }
        }
        for (ErrorMessage errorMessage2 : errorMessageArr) {
            if (errorMessage2.swigValue == i) {
                return errorMessage2;
            }
        }
        hk0.g(ua5.k(i, ErrorMessage.class, "No enum ", " with value "));
        return null;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    ErrorMessage(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    ErrorMessage(ErrorMessage errorMessage) {
        int i = errorMessage.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
