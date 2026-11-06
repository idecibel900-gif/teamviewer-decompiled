package com.teamviewer.remotecontrolviewmodellib.swig;

import com.teamviewer.swigcallbacklib.SignalCallbackBase;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public abstract class TakePictureResponseSignalCallback extends SignalCallbackBase {
    private transient long swigCPtr;

    public TakePictureResponseSignalCallback(long j, boolean z) {
        super(TakePictureResponseSignalCallbackSWIGJNI.TakePictureResponseSignalCallback_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(TakePictureResponseSignalCallback takePictureResponseSignalCallback) {
        if (takePictureResponseSignalCallback == null) {
            return 0L;
        }
        return takePictureResponseSignalCallback.swigCPtr;
    }

    public static long swigRelease(TakePictureResponseSignalCallback takePictureResponseSignalCallback) {
        if (takePictureResponseSignalCallback != null) {
            if (takePictureResponseSignalCallback.swigCMemOwn) {
                long j = takePictureResponseSignalCallback.swigCPtr;
                takePictureResponseSignalCallback.swigCMemOwn = false;
                takePictureResponseSignalCallback.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public abstract void OnCallback(TakePictureResponse takePictureResponse);

    @Override // com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    TakePictureResponseSignalCallbackSWIGJNI.delete_TakePictureResponseSignalCallback(j);
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
