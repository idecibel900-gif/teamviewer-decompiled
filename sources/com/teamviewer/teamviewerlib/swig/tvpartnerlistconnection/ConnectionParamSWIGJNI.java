package com.teamviewer.teamviewerlib.swig.tvpartnerlistconnection;

/* JADX INFO: loaded from: classes.dex */
public class ConnectionParamSWIGJNI {
    public static final native int ConnectionParam_actionId_get(long j, ConnectionParam connectionParam);

    public static final native short ConnectionParam_blockingReason_get(long j, ConnectionParam connectionParam);

    public static final native long ConnectionParam_destClientId_get(long j, ConnectionParam connectionParam);

    public static final native String ConnectionParam_errorMessage_get(long j, ConnectionParam connectionParam);

    public static final native byte[] ConnectionParam_getMyLicenseFeatures(long j, ConnectionParam connectionParam);

    public static final native byte[] ConnectionParam_getPartnerLicenseFeatures(long j, ConnectionParam connectionParam);

    public static final native boolean ConnectionParam_sendStatistics_get(long j, ConnectionParam connectionParam);

    public static final native int ConnectionParam_sessionId_get(long j, ConnectionParam connectionParam);

    public static final native int ConnectionParam_timeoutSecs_get(long j, ConnectionParam connectionParam);

    public static final native int ConnectionParam_usedLicenseFull_get(long j, ConnectionParam connectionParam);

    public static final native int ConnectionParam_usedLicense_get(long j, ConnectionParam connectionParam);

    public static final native void delete_ConnectionParam(long j);

    public static final native long new_ConnectionParam();
}
