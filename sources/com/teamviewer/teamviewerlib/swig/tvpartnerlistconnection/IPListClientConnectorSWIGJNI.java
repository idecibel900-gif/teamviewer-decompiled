package com.teamviewer.teamviewerlib.swig.tvpartnerlistconnection;

import com.teamviewer.teamviewerlib.swig.tvclientprotobufstatistics.IConnectionCreationTimingCollector;

/* JADX INFO: loaded from: classes.dex */
public class IPListClientConnectorSWIGJNI {
    public static final native long IPListClientConnector_GetPartnerList(long j, IPListClientConnector iPListClientConnector);

    public static final native void IPListClientConnector_RemoteControl__SWIG_0(long j, IPListClientConnector iPListClientConnector, long j2, ClientConnectParams clientConnectParams, boolean z, int i, long j3, IConnectionCreationTimingCollector iConnectionCreationTimingCollector);

    public static final native void IPListClientConnector_RemoteControl__SWIG_1(long j, IPListClientConnector iPListClientConnector, long j2, ClientConnectParams clientConnectParams, boolean z, int i, long j3, long j4, IConnectionCreationTimingCollector iConnectionCreationTimingCollector);

    public static final native void IPListClientConnector_ResetAccountSessionData(long j, IPListClientConnector iPListClientConnector);

    public static final native void IPListClientConnector_SetAccountSessionData(long j, IPListClientConnector iPListClientConnector, long j2);

    public static final native void IPListClientConnector_SetAdditionalConnectionParams(long j, IPListClientConnector iPListClientConnector, long j2, ClientConnectParams clientConnectParams, boolean z);

    public static final native void IPListClientConnector_SetPartnerList(long j, IPListClientConnector iPListClientConnector, long j2);

    public static final native void delete_IPListClientConnector(long j);
}
