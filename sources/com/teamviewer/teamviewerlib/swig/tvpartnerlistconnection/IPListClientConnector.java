package com.teamviewer.teamviewerlib.swig.tvpartnerlistconnection;

import com.teamviewer.teamviewerlib.swig.tvclientprotobufstatistics.IConnectionCreationTimingCollector;

/* JADX INFO: loaded from: classes.dex */
public class IPListClientConnector {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IPListClientConnector(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IPListClientConnector iPListClientConnector) {
        if (iPListClientConnector == null) {
            return 0L;
        }
        return iPListClientConnector.swigCPtr;
    }

    public SWIGTYPE_p_tvpartnerlist__IPartnerListPtr GetPartnerList() {
        return new SWIGTYPE_p_tvpartnerlist__IPartnerListPtr(IPListClientConnectorSWIGJNI.IPListClientConnector_GetPartnerList(this.swigCPtr, this), true);
    }

    public void RemoteControl(ClientConnectParams clientConnectParams, boolean z, int i, SWIGTYPE_p_tvpartnerlistconnection__ClientConnector__IRemoteControlLoginStateChangeNotifier sWIGTYPE_p_tvpartnerlistconnection__ClientConnector__IRemoteControlLoginStateChangeNotifier, IConnectionCreationTimingCollector iConnectionCreationTimingCollector) {
        IPListClientConnectorSWIGJNI.IPListClientConnector_RemoteControl__SWIG_1(this.swigCPtr, this, ClientConnectParams.getCPtr(clientConnectParams), clientConnectParams, z, i, SWIGTYPE_p_tvpartnerlistconnection__ClientConnector__IRemoteControlLoginStateChangeNotifier.getCPtr(sWIGTYPE_p_tvpartnerlistconnection__ClientConnector__IRemoteControlLoginStateChangeNotifier), IConnectionCreationTimingCollector.getCPtr(iConnectionCreationTimingCollector), iConnectionCreationTimingCollector);
    }

    public void ResetAccountSessionData() {
        IPListClientConnectorSWIGJNI.IPListClientConnector_ResetAccountSessionData(this.swigCPtr, this);
    }

    public void SetAccountSessionData(SWIGTYPE_p_tvaccount__IAccountSessionDataConstPtr sWIGTYPE_p_tvaccount__IAccountSessionDataConstPtr) {
        IPListClientConnectorSWIGJNI.IPListClientConnector_SetAccountSessionData(this.swigCPtr, this, SWIGTYPE_p_tvaccount__IAccountSessionDataConstPtr.getCPtr(sWIGTYPE_p_tvaccount__IAccountSessionDataConstPtr));
    }

    public void SetAdditionalConnectionParams(ClientConnectParams clientConnectParams, boolean z) {
        IPListClientConnectorSWIGJNI.IPListClientConnector_SetAdditionalConnectionParams(this.swigCPtr, this, ClientConnectParams.getCPtr(clientConnectParams), clientConnectParams, z);
    }

    public void SetPartnerList(SWIGTYPE_p_tvpartnerlist__IPartnerListPtr sWIGTYPE_p_tvpartnerlist__IPartnerListPtr) {
        IPListClientConnectorSWIGJNI.IPListClientConnector_SetPartnerList(this.swigCPtr, this, SWIGTYPE_p_tvpartnerlist__IPartnerListPtr.getCPtr(sWIGTYPE_p_tvpartnerlist__IPartnerListPtr));
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IPListClientConnectorSWIGJNI.delete_IPListClientConnector(j);
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

    public void RemoteControl(ClientConnectParams clientConnectParams, boolean z, int i, IConnectionCreationTimingCollector iConnectionCreationTimingCollector) {
        IPListClientConnectorSWIGJNI.IPListClientConnector_RemoteControl__SWIG_0(this.swigCPtr, this, ClientConnectParams.getCPtr(clientConnectParams), clientConnectParams, z, i, IConnectionCreationTimingCollector.getCPtr(iConnectionCreationTimingCollector), iConnectionCreationTimingCollector);
    }
}
