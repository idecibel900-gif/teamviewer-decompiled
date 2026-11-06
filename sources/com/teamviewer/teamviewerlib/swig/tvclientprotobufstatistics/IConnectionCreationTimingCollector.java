package com.teamviewer.teamviewerlib.swig.tvclientprotobufstatistics;

/* JADX INFO: loaded from: classes.dex */
public class IConnectionCreationTimingCollector {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IConnectionCreationTimingCollector(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IConnectionCreationTimingCollector iConnectionCreationTimingCollector) {
        if (iConnectionCreationTimingCollector == null) {
            return 0L;
        }
        return iConnectionCreationTimingCollector.swigCPtr;
    }

    public void AuthenticatedByUser() {
        IConnectionCreationTimingCollectorSWIGJNI.IConnectionCreationTimingCollector_AuthenticatedByUser(this.swigCPtr, this);
    }

    public void AuthenticationRequested() {
        IConnectionCreationTimingCollectorSWIGJNI.IConnectionCreationTimingCollector_AuthenticationRequested(this.swigCPtr, this);
    }

    public void AuthenticationStart() {
        IConnectionCreationTimingCollectorSWIGJNI.IConnectionCreationTimingCollector_AuthenticationStart(this.swigCPtr, this);
    }

    public void ConnectionCreationComplete() {
        IConnectionCreationTimingCollectorSWIGJNI.IConnectionCreationTimingCollector_ConnectionCreationComplete(this.swigCPtr, this);
    }

    public void ConnectionCreationStart() {
        IConnectionCreationTimingCollectorSWIGJNI.IConnectionCreationTimingCollector_ConnectionCreationStart(this.swigCPtr, this);
    }

    public void RequestConnectionStart() {
        IConnectionCreationTimingCollectorSWIGJNI.IConnectionCreationTimingCollector_RequestConnectionStart(this.swigCPtr, this);
    }

    public void SetInitiator(String str) {
        IConnectionCreationTimingCollectorSWIGJNI.IConnectionCreationTimingCollector_SetInitiator(this.swigCPtr, this, str);
    }

    public void SetIsTKGRelevant(boolean z) {
        IConnectionCreationTimingCollectorSWIGJNI.IConnectionCreationTimingCollector_SetIsTKGRelevant(this.swigCPtr, this, z);
    }

    public void SetModularSession(String str) {
        IConnectionCreationTimingCollectorSWIGJNI.IConnectionCreationTimingCollector_SetModularSession(this.swigCPtr, this, str);
    }

    public void SetPassiveDyngateID(SWIGTYPE_p_tvdyngateid__DyngateID sWIGTYPE_p_tvdyngateid__DyngateID) {
        IConnectionCreationTimingCollectorSWIGJNI.IConnectionCreationTimingCollector_SetPassiveDyngateID(this.swigCPtr, this, SWIGTYPE_p_tvdyngateid__DyngateID.getCPtr(sWIGTYPE_p_tvdyngateid__DyngateID));
    }

    public void SetSessionID(long j) {
        IConnectionCreationTimingCollectorSWIGJNI.IConnectionCreationTimingCollector_SetSessionID(this.swigCPtr, this, j);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IConnectionCreationTimingCollectorSWIGJNI.delete_IConnectionCreationTimingCollector(j);
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
}
