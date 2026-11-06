package com.teamviewer.teamviewerlib.swig.tvpartnerlistconnection;

/* JADX INFO: loaded from: classes.dex */
public class ClientConnectorAndroidSWIGJNI {
    public static final native void ClientConnectorAndroid_ConnectRaapiSession(long j, ClientConnectorAndroid clientConnectorAndroid, String str, int i, String str2, String str3);

    public static final native void ClientConnectorAndroid_ConnectRemoteControlSession__SWIG_0(long j, ClientConnectorAndroid clientConnectorAndroid, String str, int i, String str2);

    public static final native void ClientConnectorAndroid_ConnectRemoteControlSession__SWIG_1(long j, ClientConnectorAndroid clientConnectorAndroid, String str, int i);

    public static final native long ClientConnectorAndroid_GetConnectionParams(long j, ClientConnectorAndroid clientConnectorAndroid);

    public static final native long ClientConnectorAndroid_GetEasyAccessParams(long j, ClientConnectorAndroid clientConnectorAndroid);

    public static final native boolean ClientConnectorAndroid_GetHasEasyAccess(long j, ClientConnectorAndroid clientConnectorAndroid);

    public static final native void ClientConnectorAndroid_UpdateRecentlyContactedPartners(long j, ClientConnectorAndroid clientConnectorAndroid, long j2);

    public static final native void delete_ClientConnectorAndroid(long j);
}
