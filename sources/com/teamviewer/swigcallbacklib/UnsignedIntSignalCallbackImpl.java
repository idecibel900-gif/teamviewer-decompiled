package com.teamviewer.swigcallbacklib;

import o.hk0;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public abstract class UnsignedIntSignalCallbackImpl extends UnsignedIntSignalCallback {
    private transient long swigCPtr;

    public UnsignedIntSignalCallbackImpl() {
        this(UnsignedIntSignalCallbackImplSWIGJNI.new_UnsignedIntSignalCallbackImpl(), true);
        UnsignedIntSignalCallbackImplSWIGJNI.UnsignedIntSignalCallbackImpl_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(UnsignedIntSignalCallbackImpl unsignedIntSignalCallbackImpl) {
        if (unsignedIntSignalCallbackImpl == null) {
            return 0L;
        }
        return unsignedIntSignalCallbackImpl.swigCPtr;
    }

    public static long swigRelease(UnsignedIntSignalCallbackImpl unsignedIntSignalCallbackImpl) {
        if (unsignedIntSignalCallbackImpl != null) {
            if (unsignedIntSignalCallbackImpl.swigCMemOwn) {
                long j = unsignedIntSignalCallbackImpl.swigCPtr;
                unsignedIntSignalCallbackImpl.swigCMemOwn = false;
                unsignedIntSignalCallbackImpl.delete();
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

    @Override // com.teamviewer.swigcallbacklib.UnsignedIntSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    UnsignedIntSignalCallbackImplSWIGJNI.delete_UnsignedIntSignalCallbackImpl(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.swigcallbacklib.UnsignedIntSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public void finalize() {
        delete();
    }

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        UnsignedIntSignalCallbackImplSWIGJNI.UnsignedIntSignalCallbackImpl_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        UnsignedIntSignalCallbackImplSWIGJNI.UnsignedIntSignalCallbackImpl_change_ownership(this, this.swigCPtr, true);
    }

    public UnsignedIntSignalCallbackImpl(long j, boolean z) {
        super(UnsignedIntSignalCallbackImplSWIGJNI.UnsignedIntSignalCallbackImpl_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }
}
