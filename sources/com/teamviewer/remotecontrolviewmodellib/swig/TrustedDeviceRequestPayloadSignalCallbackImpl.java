package com.teamviewer.remotecontrolviewmodellib.swig;

import o.hk0;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public abstract class TrustedDeviceRequestPayloadSignalCallbackImpl extends TrustedDeviceRequestPayloadSignalCallback {
    private transient long swigCPtr;

    public TrustedDeviceRequestPayloadSignalCallbackImpl() {
        this(TrustedDeviceRequestPayloadSignalCallbackImplSWIGJNI.new_TrustedDeviceRequestPayloadSignalCallbackImpl(), true);
        TrustedDeviceRequestPayloadSignalCallbackImplSWIGJNI.TrustedDeviceRequestPayloadSignalCallbackImpl_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(TrustedDeviceRequestPayloadSignalCallbackImpl trustedDeviceRequestPayloadSignalCallbackImpl) {
        if (trustedDeviceRequestPayloadSignalCallbackImpl == null) {
            return 0L;
        }
        return trustedDeviceRequestPayloadSignalCallbackImpl.swigCPtr;
    }

    public static long swigRelease(TrustedDeviceRequestPayloadSignalCallbackImpl trustedDeviceRequestPayloadSignalCallbackImpl) {
        if (trustedDeviceRequestPayloadSignalCallbackImpl != null) {
            if (trustedDeviceRequestPayloadSignalCallbackImpl.swigCMemOwn) {
                long j = trustedDeviceRequestPayloadSignalCallbackImpl.swigCPtr;
                trustedDeviceRequestPayloadSignalCallbackImpl.swigCMemOwn = false;
                trustedDeviceRequestPayloadSignalCallbackImpl.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public void PerformCallback(TrustedDeviceRequestPayloadNative trustedDeviceRequestPayloadNative) {
        try {
            OnCallback(trustedDeviceRequestPayloadNative);
        } catch (Throwable th) {
            ye4.d(getClass().getSimpleName(), th);
            throw th;
        }
    }

    @Override // com.teamviewer.remotecontrolviewmodellib.swig.TrustedDeviceRequestPayloadSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    TrustedDeviceRequestPayloadSignalCallbackImplSWIGJNI.delete_TrustedDeviceRequestPayloadSignalCallbackImpl(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.remotecontrolviewmodellib.swig.TrustedDeviceRequestPayloadSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public void finalize() {
        delete();
    }

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        TrustedDeviceRequestPayloadSignalCallbackImplSWIGJNI.TrustedDeviceRequestPayloadSignalCallbackImpl_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        TrustedDeviceRequestPayloadSignalCallbackImplSWIGJNI.TrustedDeviceRequestPayloadSignalCallbackImpl_change_ownership(this, this.swigCPtr, true);
    }

    public TrustedDeviceRequestPayloadSignalCallbackImpl(long j, boolean z) {
        super(TrustedDeviceRequestPayloadSignalCallbackImplSWIGJNI.TrustedDeviceRequestPayloadSignalCallbackImpl_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }
}
