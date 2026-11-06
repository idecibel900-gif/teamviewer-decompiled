package com.teamviewer.teamviewerlib.swig.tvsessionprotocol;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public enum ConnectionMode {
    Unknown(0),
    RemoteControl(1),
    Filetransfer(5),
    VPN(6),
    SessionPlayer(7),
    Incoming_Presentation(8),
    Meeting(9),
    RemoteSupport(10),
    WebControl(11),
    NumEntries;

    private final int swigValue;

    public static class SwigNext {
        private static int next;

        private SwigNext() {
        }
    }

    ConnectionMode() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    public static final ConnectionMode fromString(String str) {
        if (str == null) {
            return Unknown;
        }
        try {
            return valueOf(str);
        } catch (IllegalArgumentException unused) {
            return Unknown;
        }
    }

    public static ConnectionMode swigToEnum(int i) {
        ConnectionMode[] connectionModeArr = (ConnectionMode[]) ConnectionMode.class.getEnumConstants();
        if (i < connectionModeArr.length && i >= 0) {
            ConnectionMode connectionMode = connectionModeArr[i];
            if (connectionMode.swigValue == i) {
                return connectionMode;
            }
        }
        for (ConnectionMode connectionMode2 : connectionModeArr) {
            if (connectionMode2.swigValue == i) {
                return connectionMode2;
            }
        }
        hk0.g(ua5.k(i, ConnectionMode.class, "No enum ", " with value "));
        return null;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    ConnectionMode(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    ConnectionMode(ConnectionMode connectionMode) {
        int i = connectionMode.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
