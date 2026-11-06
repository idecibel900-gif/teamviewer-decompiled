package com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks;

import com.teamviewer.swigcallbacklib.SignalCallbackBase;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public abstract class DeliverFileDownloadStartedSignalCallback extends SignalCallbackBase {
    private transient long swigCPtr;

    public DeliverFileDownloadStartedSignalCallback(long j, boolean z) {
        super(DeliverFileDownloadStartedSignalCallbackSWIGJNI.DeliverFileDownloadStartedSignalCallback_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(DeliverFileDownloadStartedSignalCallback deliverFileDownloadStartedSignalCallback) {
        if (deliverFileDownloadStartedSignalCallback == null) {
            return 0L;
        }
        return deliverFileDownloadStartedSignalCallback.swigCPtr;
    }

    public static long swigRelease(DeliverFileDownloadStartedSignalCallback deliverFileDownloadStartedSignalCallback) {
        if (deliverFileDownloadStartedSignalCallback != null) {
            if (deliverFileDownloadStartedSignalCallback.swigCMemOwn) {
                long j = deliverFileDownloadStartedSignalCallback.swigCPtr;
                deliverFileDownloadStartedSignalCallback.swigCMemOwn = false;
                deliverFileDownloadStartedSignalCallback.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public abstract void OnCallback(DeliverFileDownloadStarted deliverFileDownloadStarted);

    @Override // com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    DeliverFileDownloadStartedSignalCallbackSWIGJNI.delete_DeliverFileDownloadStartedSignalCallback(j);
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
}
