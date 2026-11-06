package com.teamviewer.chatviewmodel.swig;

import o.hk0;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public abstract class ErrorMessageSignalCallbackImpl extends ErrorMessageSignalCallback {
    private transient long swigCPtr;

    public ErrorMessageSignalCallbackImpl() {
        this(ErrorMessageSignalCallbackImplSWIGJNI.new_ErrorMessageSignalCallbackImpl(), true);
        ErrorMessageSignalCallbackImplSWIGJNI.ErrorMessageSignalCallbackImpl_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(ErrorMessageSignalCallbackImpl errorMessageSignalCallbackImpl) {
        if (errorMessageSignalCallbackImpl == null) {
            return 0L;
        }
        return errorMessageSignalCallbackImpl.swigCPtr;
    }

    public static long swigRelease(ErrorMessageSignalCallbackImpl errorMessageSignalCallbackImpl) {
        if (errorMessageSignalCallbackImpl != null) {
            if (errorMessageSignalCallbackImpl.swigCMemOwn) {
                long j = errorMessageSignalCallbackImpl.swigCPtr;
                errorMessageSignalCallbackImpl.swigCMemOwn = false;
                errorMessageSignalCallbackImpl.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public void PerformCallback(ErrorMessage errorMessage) {
        try {
            OnCallback(errorMessage);
        } catch (Throwable th) {
            ye4.d(getClass().getSimpleName(), th);
            throw th;
        }
    }

    @Override // com.teamviewer.chatviewmodel.swig.ErrorMessageSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ErrorMessageSignalCallbackImplSWIGJNI.delete_ErrorMessageSignalCallbackImpl(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.chatviewmodel.swig.ErrorMessageSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public void finalize() {
        delete();
    }

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        ErrorMessageSignalCallbackImplSWIGJNI.ErrorMessageSignalCallbackImpl_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        ErrorMessageSignalCallbackImplSWIGJNI.ErrorMessageSignalCallbackImpl_change_ownership(this, this.swigCPtr, true);
    }

    public ErrorMessageSignalCallbackImpl(long j, boolean z) {
        super(ErrorMessageSignalCallbackImplSWIGJNI.ErrorMessageSignalCallbackImpl_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }
}
