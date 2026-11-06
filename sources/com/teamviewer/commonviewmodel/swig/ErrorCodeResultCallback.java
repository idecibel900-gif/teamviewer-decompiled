package com.teamviewer.commonviewmodel.swig;

import com.teamviewer.swigcallbacklib.SignalCallbackBase;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public abstract class ErrorCodeResultCallback extends SignalCallbackBase {
    private transient long swigCPtr;

    public ErrorCodeResultCallback(long j, boolean z) {
        super(ErrorCodeResultCallbackSWIGJNI.ErrorCodeResultCallback_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(ErrorCodeResultCallback errorCodeResultCallback) {
        if (errorCodeResultCallback == null) {
            return 0L;
        }
        return errorCodeResultCallback.swigCPtr;
    }

    public static long swigRelease(ErrorCodeResultCallback errorCodeResultCallback) {
        if (errorCodeResultCallback != null) {
            if (errorCodeResultCallback.swigCMemOwn) {
                long j = errorCodeResultCallback.swigCPtr;
                errorCodeResultCallback.swigCMemOwn = false;
                errorCodeResultCallback.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public abstract void OnError(ErrorCode errorCode);

    public abstract void OnSuccess();

    @Override // com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ErrorCodeResultCallbackSWIGJNI.delete_ErrorCodeResultCallback(j);
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
