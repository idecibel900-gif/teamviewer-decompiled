package com.teamviewer.chatviewmodel.swig;

import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;

/* JADX INFO: loaded from: classes.dex */
public class ConnectionInfoCallbackSWIGJNI {
    static {
        swig_module_init();
    }

    public static final native void ConnectionInfoCallback_PerformConnectionToAccount(long j, ConnectionInfoCallback connectionInfoCallback, long j2);

    public static final native void ConnectionInfoCallback_PerformConnectionToMachine(long j, ConnectionInfoCallback connectionInfoCallback, long j2, DyngateID dyngateID);

    public static final native void ConnectionInfoCallback_PerformConnectionToServiceCase(long j, ConnectionInfoCallback connectionInfoCallback, long j2, DyngateID dyngateID);

    public static final native void ConnectionInfoCallback_PerformError(long j, ConnectionInfoCallback connectionInfoCallback);

    public static final native long ConnectionInfoCallback_SWIGUpcast(long j);

    public static final native void ConnectionInfoCallback_change_ownership(ConnectionInfoCallback connectionInfoCallback, long j, boolean z);

    public static final native void ConnectionInfoCallback_director_connect(ConnectionInfoCallback connectionInfoCallback, long j, boolean z, boolean z2);

    public static void SwigDirector_ConnectionInfoCallback_PerformConnectionToAccount(ConnectionInfoCallback connectionInfoCallback, long j) {
        connectionInfoCallback.PerformConnectionToAccount(j);
    }

    public static void SwigDirector_ConnectionInfoCallback_PerformConnectionToMachine(ConnectionInfoCallback connectionInfoCallback, long j) {
        connectionInfoCallback.PerformConnectionToMachine(new DyngateID(j, false));
    }

    public static void SwigDirector_ConnectionInfoCallback_PerformConnectionToServiceCase(ConnectionInfoCallback connectionInfoCallback, long j) {
        connectionInfoCallback.PerformConnectionToServiceCase(new DyngateID(j, false));
    }

    public static void SwigDirector_ConnectionInfoCallback_PerformError(ConnectionInfoCallback connectionInfoCallback) {
        connectionInfoCallback.PerformError();
    }

    public static final native void delete_ConnectionInfoCallback(long j);

    public static final native long new_ConnectionInfoCallback();

    private static final native void swig_module_init();
}
