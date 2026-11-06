package com.teamviewer.swigcallbacklib;

import o.hk0;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public abstract class BoolSignalCallbackImpl extends BoolSignalCallback {
    private transient long swigCPtr;

    public BoolSignalCallbackImpl() {
        this(BoolSignalCallbackImplSWIGJNI.new_BoolSignalCallbackImpl(), true);
        BoolSignalCallbackImplSWIGJNI.BoolSignalCallbackImpl_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(BoolSignalCallbackImpl boolSignalCallbackImpl) {
        if (boolSignalCallbackImpl == null) {
            return 0L;
        }
        return boolSignalCallbackImpl.swigCPtr;
    }

    public static long swigRelease(BoolSignalCallbackImpl boolSignalCallbackImpl) {
        if (boolSignalCallbackImpl != null) {
            if (boolSignalCallbackImpl.swigCMemOwn) {
                long j = boolSignalCallbackImpl.swigCPtr;
                boolSignalCallbackImpl.swigCMemOwn = false;
                boolSignalCallbackImpl.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public void PerformCallback(boolean z) {
        try {
            OnCallback(z);
        } catch (Throwable th) {
            ye4.d(getClass().getSimpleName(), th);
            throw th;
        }
    }

    @Override // com.teamviewer.swigcallbacklib.BoolSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    BoolSignalCallbackImplSWIGJNI.delete_BoolSignalCallbackImpl(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.swigcallbacklib.BoolSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public void finalize() {
        delete();
    }

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        BoolSignalCallbackImplSWIGJNI.BoolSignalCallbackImpl_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        BoolSignalCallbackImplSWIGJNI.BoolSignalCallbackImpl_change_ownership(this, this.swigCPtr, true);
    }

    public BoolSignalCallbackImpl(long j, boolean z) {
        super(BoolSignalCallbackImplSWIGJNI.BoolSignalCallbackImpl_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }
}
