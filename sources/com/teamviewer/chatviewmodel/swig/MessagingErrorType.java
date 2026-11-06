package com.teamviewer.chatviewmodel.swig;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public enum MessagingErrorType {
    LoadMessagesFailed,
    RecipientRejectedChatMessages,
    FileMessageTooBig,
    GenericHttpError,
    GenericTeamViewerError;

    private final int swigValue;

    public static class SwigNext {
        private static int next;

        private SwigNext() {
        }
    }

    MessagingErrorType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    public static MessagingErrorType swigToEnum(int i) {
        MessagingErrorType[] messagingErrorTypeArr = (MessagingErrorType[]) MessagingErrorType.class.getEnumConstants();
        if (i < messagingErrorTypeArr.length && i >= 0) {
            MessagingErrorType messagingErrorType = messagingErrorTypeArr[i];
            if (messagingErrorType.swigValue == i) {
                return messagingErrorType;
            }
        }
        for (MessagingErrorType messagingErrorType2 : messagingErrorTypeArr) {
            if (messagingErrorType2.swigValue == i) {
                return messagingErrorType2;
            }
        }
        hk0.g(ua5.k(i, MessagingErrorType.class, "No enum ", " with value "));
        return null;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    MessagingErrorType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    MessagingErrorType(MessagingErrorType messagingErrorType) {
        int i = messagingErrorType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
