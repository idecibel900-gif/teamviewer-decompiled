package com.teamviewer.chatviewmodel.swig;

import com.teamviewer.swigcallbacklib.SignalCallbackBase;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public abstract class ErrorMessageSignalCallback extends SignalCallbackBase {
    private transient long swigCPtr;

    public ErrorMessageSignalCallback(long j, boolean z) {
        super(ErrorMessageSignalCallbackSWIGJNI.ErrorMessageSignalCallback_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(ErrorMessageSignalCallback errorMessageSignalCallback) {
        if (errorMessageSignalCallback == null) {
            return 0L;
        }
        return errorMessageSignalCallback.swigCPtr;
    }

    public static long swigRelease(ErrorMessageSignalCallback errorMessageSignalCallback) {
        if (errorMessageSignalCallback != null) {
            if (errorMessageSignalCallback.swigCMemOwn) {
                long j = errorMessageSignalCallback.swigCPtr;
                errorMessageSignalCallback.swigCMemOwn = false;
                errorMessageSignalCallback.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public abstract void OnCallback(ErrorMessage errorMessage);

    @Override // com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ErrorMessageSignalCallbackSWIGJNI.delete_ErrorMessageSignalCallback(j);
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
