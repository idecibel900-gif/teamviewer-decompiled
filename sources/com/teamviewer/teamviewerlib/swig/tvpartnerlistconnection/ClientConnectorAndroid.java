package com.teamviewer.teamviewerlib.swig.tvpartnerlistconnection;

/* JADX INFO: loaded from: classes.dex */
public class ClientConnectorAndroid {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public ClientConnectorAndroid(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(ClientConnectorAndroid clientConnectorAndroid) {
        if (clientConnectorAndroid == null) {
            return 0L;
        }
        return clientConnectorAndroid.swigCPtr;
    }

    public void ConnectRaapiSession(String str, int i, String str2, String str3) {
        ClientConnectorAndroidSWIGJNI.ClientConnectorAndroid_ConnectRaapiSession(this.swigCPtr, this, str, i, str2, str3);
    }

    public void ConnectRemoteControlSession(String str, int i, String str2) {
        ClientConnectorAndroidSWIGJNI.ClientConnectorAndroid_ConnectRemoteControlSession__SWIG_0(this.swigCPtr, this, str, i, str2);
    }

    public ConnectionParam GetConnectionParams() {
        return new ConnectionParam(ClientConnectorAndroidSWIGJNI.ClientConnectorAndroid_GetConnectionParams(this.swigCPtr, this), true);
    }

    public EasyAccessParams GetEasyAccessParams() {
        return new EasyAccessParams(ClientConnectorAndroidSWIGJNI.ClientConnectorAndroid_GetEasyAccessParams(this.swigCPtr, this), true);
    }

    public boolean GetHasEasyAccess() {
        return ClientConnectorAndroidSWIGJNI.ClientConnectorAndroid_GetHasEasyAccess(this.swigCPtr, this);
    }

    public void UpdateRecentlyContactedPartners(SWIGTYPE_p_tvstd__nnT_ClientConnectParamsPtr_t sWIGTYPE_p_tvstd__nnT_ClientConnectParamsPtr_t) {
        ClientConnectorAndroidSWIGJNI.ClientConnectorAndroid_UpdateRecentlyContactedPartners(this.swigCPtr, this, SWIGTYPE_p_tvstd__nnT_ClientConnectParamsPtr_t.getCPtr(sWIGTYPE_p_tvstd__nnT_ClientConnectParamsPtr_t));
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ClientConnectorAndroidSWIGJNI.delete_ClientConnectorAndroid(j);
                }
                this.swigCPtr = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void finalize() {
        delete();
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public void ConnectRemoteControlSession(String str, int i) {
        ClientConnectorAndroidSWIGJNI.ClientConnectorAndroid_ConnectRemoteControlSession__SWIG_1(this.swigCPtr, this, str, i);
    }
}
