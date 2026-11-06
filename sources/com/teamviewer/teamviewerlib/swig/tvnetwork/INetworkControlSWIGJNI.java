package com.teamviewer.teamviewerlib.swig.tvnetwork;

/* JADX INFO: loaded from: classes.dex */
public class INetworkControlSWIGJNI {
    public static final native int INetworkControl_GetOnlineState(long j, INetworkControl iNetworkControl);

    public static final native void INetworkControl_Offline__SWIG_0(long j, INetworkControl iNetworkControl, int i);

    public static final native void INetworkControl_Offline__SWIG_1(long j, INetworkControl iNetworkControl, int i, long j2);

    public static final native void INetworkControl_Online(long j, INetworkControl iNetworkControl);

    public static final native void INetworkControl_ShutdownDynGateAsync(long j, INetworkControl iNetworkControl, long j2);

    public static final native void INetworkControl_StartKeepAlive(long j, INetworkControl iNetworkControl);

    public static final native void INetworkControl_StopKeepAlive(long j, INetworkControl iNetworkControl);

    public static final native void delete_INetworkControl(long j);
}
