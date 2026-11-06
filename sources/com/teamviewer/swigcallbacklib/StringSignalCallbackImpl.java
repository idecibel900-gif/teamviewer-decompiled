package com.teamviewer.swigcallbacklib;

import o.hk0;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public abstract class StringSignalCallbackImpl extends StringSignalCallback {
    private transient long swigCPtr;

    public StringSignalCallbackImpl() {
        this(StringSignalCallbackImplSWIGJNI.new_StringSignalCallbackImpl(), true);
        StringSignalCallbackImplSWIGJNI.StringSignalCallbackImpl_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(StringSignalCallbackImpl stringSignalCallbackImpl) {
        if (stringSignalCallbackImpl == null) {
            return 0L;
        }
        return stringSignalCallbackImpl.swigCPtr;
    }

    public static long swigRelease(StringSignalCallbackImpl stringSignalCallbackImpl) {
        if (stringSignalCallbackImpl != null) {
            if (stringSignalCallbackImpl.swigCMemOwn) {
                long j = stringSignalCallbackImpl.swigCPtr;
                stringSignalCallbackImpl.swigCMemOwn = false;
                stringSignalCallbackImpl.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public void PerformCallback(String str) {
        try {
            OnCallback(str);
        } catch (Throwable th) {
            ye4.d(getClass().getSimpleName(), th);
            throw th;
        }
    }

    @Override // com.teamviewer.swigcallbacklib.StringSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    StringSignalCallbackImplSWIGJNI.delete_StringSignalCallbackImpl(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.swigcallbacklib.StringSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public void finalize() {
        delete();
    }

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        StringSignalCallbackImplSWIGJNI.StringSignalCallbackImpl_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        StringSignalCallbackImplSWIGJNI.StringSignalCallbackImpl_change_ownership(this, this.swigCPtr, true);
    }

    public StringSignalCallbackImpl(long j, boolean z) {
        super(StringSignalCallbackImplSWIGJNI.StringSignalCallbackImpl_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }
}
