package com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks;

import o.hk0;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public abstract class DeliverFileDownloadStartedSignalCallbackImpl extends DeliverFileDownloadStartedSignalCallback {
    private transient long swigCPtr;

    public DeliverFileDownloadStartedSignalCallbackImpl() {
        this(DeliverFileDownloadStartedSignalCallbackImplSWIGJNI.new_DeliverFileDownloadStartedSignalCallbackImpl(), true);
        DeliverFileDownloadStartedSignalCallbackImplSWIGJNI.DeliverFileDownloadStartedSignalCallbackImpl_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(DeliverFileDownloadStartedSignalCallbackImpl deliverFileDownloadStartedSignalCallbackImpl) {
        if (deliverFileDownloadStartedSignalCallbackImpl == null) {
            return 0L;
        }
        return deliverFileDownloadStartedSignalCallbackImpl.swigCPtr;
    }

    public static long swigRelease(DeliverFileDownloadStartedSignalCallbackImpl deliverFileDownloadStartedSignalCallbackImpl) {
        if (deliverFileDownloadStartedSignalCallbackImpl != null) {
            if (deliverFileDownloadStartedSignalCallbackImpl.swigCMemOwn) {
                long j = deliverFileDownloadStartedSignalCallbackImpl.swigCPtr;
                deliverFileDownloadStartedSignalCallbackImpl.swigCMemOwn = false;
                deliverFileDownloadStartedSignalCallbackImpl.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public void PerformCallback(DeliverFileDownloadStarted deliverFileDownloadStarted) {
        try {
            OnCallback(deliverFileDownloadStarted);
        } catch (Throwable th) {
            ye4.d(getClass().getSimpleName(), th);
            throw th;
        }
    }

    @Override // com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks.DeliverFileDownloadStartedSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    DeliverFileDownloadStartedSignalCallbackImplSWIGJNI.delete_DeliverFileDownloadStartedSignalCallbackImpl(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks.DeliverFileDownloadStartedSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public void finalize() {
        delete();
    }

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        DeliverFileDownloadStartedSignalCallbackImplSWIGJNI.DeliverFileDownloadStartedSignalCallbackImpl_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        DeliverFileDownloadStartedSignalCallbackImplSWIGJNI.DeliverFileDownloadStartedSignalCallbackImpl_change_ownership(this, this.swigCPtr, true);
    }

    public DeliverFileDownloadStartedSignalCallbackImpl(long j, boolean z) {
        super(DeliverFileDownloadStartedSignalCallbackImplSWIGJNI.DeliverFileDownloadStartedSignalCallbackImpl_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }
}
