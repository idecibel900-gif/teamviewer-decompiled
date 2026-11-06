package com.teamviewer.swigcallbacklib;

import o.hk0;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public abstract class DoubleSignalCallbackImpl extends DoubleSignalCallback {
    private transient long swigCPtr;

    public DoubleSignalCallbackImpl() {
        this(DoubleSignalCallbackImplSWIGJNI.new_DoubleSignalCallbackImpl(), true);
        DoubleSignalCallbackImplSWIGJNI.DoubleSignalCallbackImpl_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(DoubleSignalCallbackImpl doubleSignalCallbackImpl) {
        if (doubleSignalCallbackImpl == null) {
            return 0L;
        }
        return doubleSignalCallbackImpl.swigCPtr;
    }

    public static long swigRelease(DoubleSignalCallbackImpl doubleSignalCallbackImpl) {
        if (doubleSignalCallbackImpl != null) {
            if (doubleSignalCallbackImpl.swigCMemOwn) {
                long j = doubleSignalCallbackImpl.swigCPtr;
                doubleSignalCallbackImpl.swigCMemOwn = false;
                doubleSignalCallbackImpl.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public void PerformCallback(double d) {
        try {
            OnCallback(d);
        } catch (Throwable th) {
            ye4.d(getClass().getSimpleName(), th);
            throw th;
        }
    }

    @Override // com.teamviewer.swigcallbacklib.DoubleSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    DoubleSignalCallbackImplSWIGJNI.delete_DoubleSignalCallbackImpl(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.swigcallbacklib.DoubleSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public void finalize() {
        delete();
    }

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        DoubleSignalCallbackImplSWIGJNI.DoubleSignalCallbackImpl_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        DoubleSignalCallbackImplSWIGJNI.DoubleSignalCallbackImpl_change_ownership(this, this.swigCPtr, true);
    }

    public DoubleSignalCallbackImpl(long j, boolean z) {
        super(DoubleSignalCallbackImplSWIGJNI.DoubleSignalCallbackImpl_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }
}
