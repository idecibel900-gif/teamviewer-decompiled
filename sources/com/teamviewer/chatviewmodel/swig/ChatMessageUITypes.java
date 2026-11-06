package com.teamviewer.chatviewmodel.swig;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public enum ChatMessageUITypes {
    Unknown,
    RemoteMessage,
    OwnMessage,
    Event,
    Date,
    NewSeparator,
    RemoteTypingEvent,
    ReadSentState,
    OwnFileMessage,
    RemoteFileMessage;

    private final int swigValue;

    public static class SwigNext {
        private static int next;

        private SwigNext() {
        }
    }

    ChatMessageUITypes() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    public static ChatMessageUITypes swigToEnum(int i) {
        ChatMessageUITypes[] chatMessageUITypesArr = (ChatMessageUITypes[]) ChatMessageUITypes.class.getEnumConstants();
        if (i < chatMessageUITypesArr.length && i >= 0) {
            ChatMessageUITypes chatMessageUITypes = chatMessageUITypesArr[i];
            if (chatMessageUITypes.swigValue == i) {
                return chatMessageUITypes;
            }
        }
        for (ChatMessageUITypes chatMessageUITypes2 : chatMessageUITypesArr) {
            if (chatMessageUITypes2.swigValue == i) {
                return chatMessageUITypes2;
            }
        }
        hk0.g(ua5.k(i, ChatMessageUITypes.class, "No enum ", " with value "));
        return null;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    ChatMessageUITypes(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    ChatMessageUITypes(ChatMessageUITypes chatMessageUITypes) {
        int i = chatMessageUITypes.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
