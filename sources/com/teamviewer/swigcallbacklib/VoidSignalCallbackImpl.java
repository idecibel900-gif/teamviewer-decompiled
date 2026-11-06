package com.teamviewer.swigcallbacklib;

import o.hk0;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public abstract class VoidSignalCallbackImpl extends VoidSignalCallback {
    private transient long swigCPtr;

    public VoidSignalCallbackImpl() {
        this(VoidSignalCallbackImplSWIGJNI.new_VoidSignalCallbackImpl(), true);
        VoidSignalCallbackImplSWIGJNI.VoidSignalCallbackImpl_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(VoidSignalCallbackImpl voidSignalCallbackImpl) {
        if (voidSignalCallbackImpl == null) {
            return 0L;
        }
        return voidSignalCallbackImpl.swigCPtr;
    }

    public static long swigRelease(VoidSignalCallbackImpl voidSignalCallbackImpl) {
        if (voidSignalCallbackImpl != null) {
            if (voidSignalCallbackImpl.swigCMemOwn) {
                long j = voidSignalCallbackImpl.swigCPtr;
                voidSignalCallbackImpl.swigCMemOwn = false;
                voidSignalCallbackImpl.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public void PerformCallback() {
        try {
            OnCallback();
        } catch (Throwable th) {
            ye4.d(getClass().getSimpleName(), th);
            throw th;
        }
    }

    @Override // com.teamviewer.swigcallbacklib.VoidSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    VoidSignalCallbackImplSWIGJNI.delete_VoidSignalCallbackImpl(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.swigcallbacklib.VoidSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public void finalize() {
        delete();
    }

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        VoidSignalCallbackImplSWIGJNI.VoidSignalCallbackImpl_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        VoidSignalCallbackImplSWIGJNI.VoidSignalCallbackImpl_change_ownership(this, this.swigCPtr, true);
    }

    public VoidSignalCallbackImpl(long j, boolean z) {
        super(VoidSignalCallbackImplSWIGJNI.VoidSignalCallbackImpl_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }
}
