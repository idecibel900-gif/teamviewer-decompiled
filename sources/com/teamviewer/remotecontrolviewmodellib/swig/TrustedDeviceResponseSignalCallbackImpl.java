package com.teamviewer.remotecontrolviewmodellib.swig;

import o.hk0;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public abstract class TrustedDeviceResponseSignalCallbackImpl extends TrustedDeviceResponseSignalCallback {
    private transient long swigCPtr;

    public TrustedDeviceResponseSignalCallbackImpl() {
        this(TrustedDeviceResponseSignalCallbackImplSWIGJNI.new_TrustedDeviceResponseSignalCallbackImpl(), true);
        TrustedDeviceResponseSignalCallbackImplSWIGJNI.TrustedDeviceResponseSignalCallbackImpl_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(TrustedDeviceResponseSignalCallbackImpl trustedDeviceResponseSignalCallbackImpl) {
        if (trustedDeviceResponseSignalCallbackImpl == null) {
            return 0L;
        }
        return trustedDeviceResponseSignalCallbackImpl.swigCPtr;
    }

    public static long swigRelease(TrustedDeviceResponseSignalCallbackImpl trustedDeviceResponseSignalCallbackImpl) {
        if (trustedDeviceResponseSignalCallbackImpl != null) {
            if (trustedDeviceResponseSignalCallbackImpl.swigCMemOwn) {
                long j = trustedDeviceResponseSignalCallbackImpl.swigCPtr;
                trustedDeviceResponseSignalCallbackImpl.swigCMemOwn = false;
                trustedDeviceResponseSignalCallbackImpl.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public void PerformCallback(ResponseCode responseCode) {
        try {
            OnCallback(responseCode);
        } catch (Throwable th) {
            ye4.d(getClass().getSimpleName(), th);
            throw th;
        }
    }

    @Override // com.teamviewer.remotecontrolviewmodellib.swig.TrustedDeviceResponseSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    TrustedDeviceResponseSignalCallbackImplSWIGJNI.delete_TrustedDeviceResponseSignalCallbackImpl(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.remotecontrolviewmodellib.swig.TrustedDeviceResponseSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public void finalize() {
        delete();
    }

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        TrustedDeviceResponseSignalCallbackImplSWIGJNI.TrustedDeviceResponseSignalCallbackImpl_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        TrustedDeviceResponseSignalCallbackImplSWIGJNI.TrustedDeviceResponseSignalCallbackImpl_change_ownership(this, this.swigCPtr, true);
    }

    public TrustedDeviceResponseSignalCallbackImpl(long j, boolean z) {
        super(TrustedDeviceResponseSignalCallbackImplSWIGJNI.TrustedDeviceResponseSignalCallbackImpl_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }
}
