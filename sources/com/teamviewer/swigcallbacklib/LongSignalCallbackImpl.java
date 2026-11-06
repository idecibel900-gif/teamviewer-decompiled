package com.teamviewer.swigcallbacklib;

import o.hk0;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public abstract class LongSignalCallbackImpl extends LongSignalCallback {
    private transient long swigCPtr;

    public LongSignalCallbackImpl() {
        this(LongSignalCallbackImplSWIGJNI.new_LongSignalCallbackImpl(), true);
        LongSignalCallbackImplSWIGJNI.LongSignalCallbackImpl_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(LongSignalCallbackImpl longSignalCallbackImpl) {
        if (longSignalCallbackImpl == null) {
            return 0L;
        }
        return longSignalCallbackImpl.swigCPtr;
    }

    public static long swigRelease(LongSignalCallbackImpl longSignalCallbackImpl) {
        if (longSignalCallbackImpl != null) {
            if (longSignalCallbackImpl.swigCMemOwn) {
                long j = longSignalCallbackImpl.swigCPtr;
                longSignalCallbackImpl.swigCMemOwn = false;
                longSignalCallbackImpl.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public void PerformCallback(long j) {
        try {
            OnCallback(j);
        } catch (Throwable th) {
            ye4.d(getClass().getSimpleName(), th);
            throw th;
        }
    }

    @Override // com.teamviewer.swigcallbacklib.LongSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    LongSignalCallbackImplSWIGJNI.delete_LongSignalCallbackImpl(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.swigcallbacklib.LongSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public void finalize() {
        delete();
    }

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        LongSignalCallbackImplSWIGJNI.LongSignalCallbackImpl_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        LongSignalCallbackImplSWIGJNI.LongSignalCallbackImpl_change_ownership(this, this.swigCPtr, true);
    }

    public LongSignalCallbackImpl(long j, boolean z) {
        super(LongSignalCallbackImplSWIGJNI.LongSignalCallbackImpl_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }
}
