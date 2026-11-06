package com.teamviewer.commonviewmodel.swig;

import o.hk0;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public abstract class ErrorCodeResultCallbackImpl extends ErrorCodeResultCallback {
    private transient long swigCPtr;

    public ErrorCodeResultCallbackImpl() {
        this(ErrorCodeResultCallbackImplSWIGJNI.new_ErrorCodeResultCallbackImpl(), true);
        ErrorCodeResultCallbackImplSWIGJNI.ErrorCodeResultCallbackImpl_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(ErrorCodeResultCallbackImpl errorCodeResultCallbackImpl) {
        if (errorCodeResultCallbackImpl == null) {
            return 0L;
        }
        return errorCodeResultCallbackImpl.swigCPtr;
    }

    public static long swigRelease(ErrorCodeResultCallbackImpl errorCodeResultCallbackImpl) {
        if (errorCodeResultCallbackImpl != null) {
            if (errorCodeResultCallbackImpl.swigCMemOwn) {
                long j = errorCodeResultCallbackImpl.swigCPtr;
                errorCodeResultCallbackImpl.swigCMemOwn = false;
                errorCodeResultCallbackImpl.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public void PerformError(ErrorCode errorCode) {
        try {
            OnError(errorCode);
        } catch (Throwable th) {
            ye4.d(getClass().getSimpleName(), th);
            throw th;
        }
    }

    public void PerformSuccess() {
        try {
            OnSuccess();
        } catch (Throwable th) {
            ye4.d(getClass().getSimpleName(), th);
            throw th;
        }
    }

    @Override // com.teamviewer.commonviewmodel.swig.ErrorCodeResultCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ErrorCodeResultCallbackImplSWIGJNI.delete_ErrorCodeResultCallbackImpl(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.commonviewmodel.swig.ErrorCodeResultCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public void finalize() {
        delete();
    }

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        ErrorCodeResultCallbackImplSWIGJNI.ErrorCodeResultCallbackImpl_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        ErrorCodeResultCallbackImplSWIGJNI.ErrorCodeResultCallbackImpl_change_ownership(this, this.swigCPtr, true);
    }

    public ErrorCodeResultCallbackImpl(long j, boolean z) {
        super(ErrorCodeResultCallbackImplSWIGJNI.ErrorCodeResultCallbackImpl_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }
}
