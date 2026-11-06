package com.teamviewer.teamviewerlib.swig.tvnetwork;

/* JADX INFO: loaded from: classes.dex */
public class INetworkControl {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public INetworkControl(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(INetworkControl iNetworkControl) {
        if (iNetworkControl == null) {
            return 0L;
        }
        return iNetworkControl.swigCPtr;
    }

    public EOnlineState GetOnlineState() {
        return EOnlineState.swigToEnum(INetworkControlSWIGJNI.INetworkControl_GetOnlineState(this.swigCPtr, this));
    }

    public void Offline(EOnlineState eOnlineState, SWIGTYPE_p_std__functionT_void_fF_t sWIGTYPE_p_std__functionT_void_fF_t) {
        INetworkControlSWIGJNI.INetworkControl_Offline__SWIG_1(this.swigCPtr, this, eOnlineState.swigValue(), SWIGTYPE_p_std__functionT_void_fF_t.getCPtr(sWIGTYPE_p_std__functionT_void_fF_t));
    }

    public void Online() {
        INetworkControlSWIGJNI.INetworkControl_Online(this.swigCPtr, this);
    }

    public void ShutdownDynGateAsync(SWIGTYPE_p_std__functionT_void_fF_t sWIGTYPE_p_std__functionT_void_fF_t) {
        INetworkControlSWIGJNI.INetworkControl_ShutdownDynGateAsync(this.swigCPtr, this, SWIGTYPE_p_std__functionT_void_fF_t.getCPtr(sWIGTYPE_p_std__functionT_void_fF_t));
    }

    public void StartKeepAlive() {
        INetworkControlSWIGJNI.INetworkControl_StartKeepAlive(this.swigCPtr, this);
    }

    public void StopKeepAlive() {
        INetworkControlSWIGJNI.INetworkControl_StopKeepAlive(this.swigCPtr, this);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    INetworkControlSWIGJNI.delete_INetworkControl(j);
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

    public void Offline(EOnlineState eOnlineState) {
        INetworkControlSWIGJNI.INetworkControl_Offline__SWIG_0(this.swigCPtr, this, eOnlineState.swigValue());
    }
}
