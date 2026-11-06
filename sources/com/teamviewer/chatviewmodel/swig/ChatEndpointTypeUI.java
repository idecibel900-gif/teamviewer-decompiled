package com.teamviewer.chatviewmodel.swig;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public enum ChatEndpointTypeUI {
    Unknown,
    ComputerEndpoint,
    ContactEndpoint,
    SessionCodeEndpoint;

    private final int swigValue;

    public static class SwigNext {
        private static int next;

        private SwigNext() {
        }
    }

    ChatEndpointTypeUI() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    public static ChatEndpointTypeUI swigToEnum(int i) {
        ChatEndpointTypeUI[] chatEndpointTypeUIArr = (ChatEndpointTypeUI[]) ChatEndpointTypeUI.class.getEnumConstants();
        if (i < chatEndpointTypeUIArr.length && i >= 0) {
            ChatEndpointTypeUI chatEndpointTypeUI = chatEndpointTypeUIArr[i];
            if (chatEndpointTypeUI.swigValue == i) {
                return chatEndpointTypeUI;
            }
        }
        for (ChatEndpointTypeUI chatEndpointTypeUI2 : chatEndpointTypeUIArr) {
            if (chatEndpointTypeUI2.swigValue == i) {
                return chatEndpointTypeUI2;
            }
        }
        hk0.g(ua5.k(i, ChatEndpointTypeUI.class, "No enum ", " with value "));
        return null;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    ChatEndpointTypeUI(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    ChatEndpointTypeUI(ChatEndpointTypeUI chatEndpointTypeUI) {
        int i = chatEndpointTypeUI.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
