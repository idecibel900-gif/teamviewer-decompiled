package com.teamviewer.swigcallbacklib;

import o.hk0;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public abstract class IntSignalCallbackImpl extends IntSignalCallback {
    private transient long swigCPtr;

    public IntSignalCallbackImpl() {
        this(IntSignalCallbackImplSWIGJNI.new_IntSignalCallbackImpl(), true);
        IntSignalCallbackImplSWIGJNI.IntSignalCallbackImpl_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(IntSignalCallbackImpl intSignalCallbackImpl) {
        if (intSignalCallbackImpl == null) {
            return 0L;
        }
        return intSignalCallbackImpl.swigCPtr;
    }

    public static long swigRelease(IntSignalCallbackImpl intSignalCallbackImpl) {
        if (intSignalCallbackImpl != null) {
            if (intSignalCallbackImpl.swigCMemOwn) {
                long j = intSignalCallbackImpl.swigCPtr;
                intSignalCallbackImpl.swigCMemOwn = false;
                intSignalCallbackImpl.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public void PerformCallback(int i) {
        try {
            OnCallback(i);
        } catch (Throwable th) {
            ye4.d(getClass().getSimpleName(), th);
            throw th;
        }
    }

    @Override // com.teamviewer.swigcallbacklib.IntSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IntSignalCallbackImplSWIGJNI.delete_IntSignalCallbackImpl(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.swigcallbacklib.IntSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public void finalize() {
        delete();
    }

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        IntSignalCallbackImplSWIGJNI.IntSignalCallbackImpl_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        IntSignalCallbackImplSWIGJNI.IntSignalCallbackImpl_change_ownership(this, this.swigCPtr, true);
    }

    public IntSignalCallbackImpl(long j, boolean z) {
        super(IntSignalCallbackImplSWIGJNI.IntSignalCallbackImpl_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }
}
