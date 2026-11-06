package com.teamviewer.remotecontrolviewmodellib.swig;

import o.hk0;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public abstract class TakePictureResponseSignalCallbackImpl extends TakePictureResponseSignalCallback {
    private transient long swigCPtr;

    public TakePictureResponseSignalCallbackImpl() {
        this(TakePictureResponseSignalCallbackImplSWIGJNI.new_TakePictureResponseSignalCallbackImpl(), true);
        TakePictureResponseSignalCallbackImplSWIGJNI.TakePictureResponseSignalCallbackImpl_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(TakePictureResponseSignalCallbackImpl takePictureResponseSignalCallbackImpl) {
        if (takePictureResponseSignalCallbackImpl == null) {
            return 0L;
        }
        return takePictureResponseSignalCallbackImpl.swigCPtr;
    }

    public static long swigRelease(TakePictureResponseSignalCallbackImpl takePictureResponseSignalCallbackImpl) {
        if (takePictureResponseSignalCallbackImpl != null) {
            if (takePictureResponseSignalCallbackImpl.swigCMemOwn) {
                long j = takePictureResponseSignalCallbackImpl.swigCPtr;
                takePictureResponseSignalCallbackImpl.swigCMemOwn = false;
                takePictureResponseSignalCallbackImpl.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public void PerformCallback(TakePictureResponse takePictureResponse) {
        try {
            OnCallback(takePictureResponse);
        } catch (Throwable th) {
            ye4.d(getClass().getSimpleName(), th);
            throw th;
        }
    }

    @Override // com.teamviewer.remotecontrolviewmodellib.swig.TakePictureResponseSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    TakePictureResponseSignalCallbackImplSWIGJNI.delete_TakePictureResponseSignalCallbackImpl(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.remotecontrolviewmodellib.swig.TakePictureResponseSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public void finalize() {
        delete();
    }

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        TakePictureResponseSignalCallbackImplSWIGJNI.TakePictureResponseSignalCallbackImpl_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        TakePictureResponseSignalCallbackImplSWIGJNI.TakePictureResponseSignalCallbackImpl_change_ownership(this, this.swigCPtr, true);
    }

    public TakePictureResponseSignalCallbackImpl(long j, boolean z) {
        super(TakePictureResponseSignalCallbackImplSWIGJNI.TakePictureResponseSignalCallbackImpl_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }
}
