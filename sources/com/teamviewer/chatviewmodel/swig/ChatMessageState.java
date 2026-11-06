package com.teamviewer.chatviewmodel.swig;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public enum ChatMessageState {
    NoState,
    WasSent,
    WasRead;

    private final int swigValue;

    public static class SwigNext {
        private static int next;

        private SwigNext() {
        }
    }

    ChatMessageState() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    public static ChatMessageState swigToEnum(int i) {
        ChatMessageState[] chatMessageStateArr = (ChatMessageState[]) ChatMessageState.class.getEnumConstants();
        if (i < chatMessageStateArr.length && i >= 0) {
            ChatMessageState chatMessageState = chatMessageStateArr[i];
            if (chatMessageState.swigValue == i) {
                return chatMessageState;
            }
        }
        for (ChatMessageState chatMessageState2 : chatMessageStateArr) {
            if (chatMessageState2.swigValue == i) {
                return chatMessageState2;
            }
        }
        hk0.g(ua5.k(i, ChatMessageState.class, "No enum ", " with value "));
        return null;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    ChatMessageState(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    ChatMessageState(ChatMessageState chatMessageState) {
        int i = chatMessageState.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
