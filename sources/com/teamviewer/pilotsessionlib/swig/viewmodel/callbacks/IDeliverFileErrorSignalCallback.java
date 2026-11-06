package com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks;

import com.teamviewer.swigcallbacklib.SignalCallbackBase;
import o.hk0;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public abstract class IDeliverFileErrorSignalCallback extends SignalCallbackBase {
    private transient long swigCPtr;

    public IDeliverFileErrorSignalCallback() {
        this(IDeliverFileErrorSignalCallbackSWIGJNI.new_IDeliverFileErrorSignalCallback(), true);
        IDeliverFileErrorSignalCallbackSWIGJNI.IDeliverFileErrorSignalCallback_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(IDeliverFileErrorSignalCallback iDeliverFileErrorSignalCallback) {
        if (iDeliverFileErrorSignalCallback == null) {
            return 0L;
        }
        return iDeliverFileErrorSignalCallback.swigCPtr;
    }

    public static long swigRelease(IDeliverFileErrorSignalCallback iDeliverFileErrorSignalCallback) {
        if (iDeliverFileErrorSignalCallback != null) {
            if (iDeliverFileErrorSignalCallback.swigCMemOwn) {
                long j = iDeliverFileErrorSignalCallback.swigCPtr;
                iDeliverFileErrorSignalCallback.swigCMemOwn = false;
                iDeliverFileErrorSignalCallback.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public abstract void OnCallback(ErrorReason errorReason);

    public void PerformCallback(ErrorReason errorReason) {
        try {
            OnCallback(errorReason);
        } catch (Throwable th) {
            ye4.d("IDeliverFileErrorSignalCallback", th);
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
                    IDeliverFileErrorSignalCallbackSWIGJNI.delete_IDeliverFileErrorSignalCallback(j);
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
        IDeliverFileErrorSignalCallbackSWIGJNI.IDeliverFileErrorSignalCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        IDeliverFileErrorSignalCallbackSWIGJNI.IDeliverFileErrorSignalCallback_change_ownership(this, this.swigCPtr, true);
    }

    public IDeliverFileErrorSignalCallback(long j, boolean z) {
        super(IDeliverFileErrorSignalCallbackSWIGJNI.IDeliverFileErrorSignalCallback_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }
}
