package com.teamviewer.swigcallbacklib;

import o.hk0;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public abstract class VoidResultCallbackImpl extends VoidResultCallback {
    private transient long swigCPtr;

    public VoidResultCallbackImpl() {
        this(VoidResultCallbackImplSWIGJNI.new_VoidResultCallbackImpl(), true);
        VoidResultCallbackImplSWIGJNI.VoidResultCallbackImpl_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(VoidResultCallbackImpl voidResultCallbackImpl) {
        if (voidResultCallbackImpl == null) {
            return 0L;
        }
        return voidResultCallbackImpl.swigCPtr;
    }

    public static long swigRelease(VoidResultCallbackImpl voidResultCallbackImpl) {
        if (voidResultCallbackImpl != null) {
            if (voidResultCallbackImpl.swigCMemOwn) {
                long j = voidResultCallbackImpl.swigCPtr;
                voidResultCallbackImpl.swigCMemOwn = false;
                voidResultCallbackImpl.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public void PerformError() {
        try {
            OnError();
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

    @Override // com.teamviewer.swigcallbacklib.VoidResultCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    VoidResultCallbackImplSWIGJNI.delete_VoidResultCallbackImpl(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.swigcallbacklib.VoidResultCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public void finalize() {
        delete();
    }

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        VoidResultCallbackImplSWIGJNI.VoidResultCallbackImpl_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        VoidResultCallbackImplSWIGJNI.VoidResultCallbackImpl_change_ownership(this, this.swigCPtr, true);
    }

    public VoidResultCallbackImpl(long j, boolean z) {
        super(VoidResultCallbackImplSWIGJNI.VoidResultCallbackImpl_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }
}
