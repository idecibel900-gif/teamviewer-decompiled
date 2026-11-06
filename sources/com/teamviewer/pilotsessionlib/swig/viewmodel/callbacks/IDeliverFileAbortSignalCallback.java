package com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks;

import com.teamviewer.swigcallbacklib.SignalCallbackBase;
import o.hk0;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public abstract class IDeliverFileAbortSignalCallback extends SignalCallbackBase {
    private transient long swigCPtr;

    public IDeliverFileAbortSignalCallback() {
        this(IDeliverFileAbortSignalCallbackSWIGJNI.new_IDeliverFileAbortSignalCallback(), true);
        IDeliverFileAbortSignalCallbackSWIGJNI.IDeliverFileAbortSignalCallback_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(IDeliverFileAbortSignalCallback iDeliverFileAbortSignalCallback) {
        if (iDeliverFileAbortSignalCallback == null) {
            return 0L;
        }
        return iDeliverFileAbortSignalCallback.swigCPtr;
    }

    public static long swigRelease(IDeliverFileAbortSignalCallback iDeliverFileAbortSignalCallback) {
        if (iDeliverFileAbortSignalCallback != null) {
            if (iDeliverFileAbortSignalCallback.swigCMemOwn) {
                long j = iDeliverFileAbortSignalCallback.swigCPtr;
                iDeliverFileAbortSignalCallback.swigCMemOwn = false;
                iDeliverFileAbortSignalCallback.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public abstract void OnCallback(AbortReason abortReason);

    public void PerformCallback(AbortReason abortReason) {
        try {
            OnCallback(abortReason);
        } catch (Throwable th) {
            ye4.d("IDeliverFileAbortSignalCallback", th);
            throw th;
        }
    }

    @Override // com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IDeliverFileAbortSignalCallbackSWIGJNI.delete_IDeliverFileAbortSignalCallback(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.swigcallbacklib.SignalCallbackBase
    public void finalize() {
        delete();
    }

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        IDeliverFileAbortSignalCallbackSWIGJNI.IDeliverFileAbortSignalCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        IDeliverFileAbortSignalCallbackSWIGJNI.IDeliverFileAbortSignalCallback_change_ownership(this, this.swigCPtr, true);
    }

    public IDeliverFileAbortSignalCallback(long j, boolean z) {
        super(IDeliverFileAbortSignalCallbackSWIGJNI.IDeliverFileAbortSignalCallback_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }
}
