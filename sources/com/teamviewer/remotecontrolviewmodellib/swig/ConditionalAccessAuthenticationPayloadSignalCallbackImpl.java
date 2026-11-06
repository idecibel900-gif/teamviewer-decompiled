package com.teamviewer.remotecontrolviewmodellib.swig;

import o.hk0;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public abstract class ConditionalAccessAuthenticationPayloadSignalCallbackImpl extends ConditionalAccessAuthenticationPayloadSignalCallback {
    private transient long swigCPtr;

    public ConditionalAccessAuthenticationPayloadSignalCallbackImpl() {
        this(ConditionalAccessAuthPayloadSignalCallbackImplSWIGJNI.new_ConditionalAccessAuthenticationPayloadSignalCallbackImpl(), true);
        ConditionalAccessAuthPayloadSignalCallbackImplSWIGJNI.ConditionalAccessAuthenticationPayloadSignalCallbackImpl_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(ConditionalAccessAuthenticationPayloadSignalCallbackImpl conditionalAccessAuthenticationPayloadSignalCallbackImpl) {
        if (conditionalAccessAuthenticationPayloadSignalCallbackImpl == null) {
            return 0L;
        }
        return conditionalAccessAuthenticationPayloadSignalCallbackImpl.swigCPtr;
    }

    public static long swigRelease(ConditionalAccessAuthenticationPayloadSignalCallbackImpl conditionalAccessAuthenticationPayloadSignalCallbackImpl) {
        if (conditionalAccessAuthenticationPayloadSignalCallbackImpl != null) {
            if (conditionalAccessAuthenticationPayloadSignalCallbackImpl.swigCMemOwn) {
                long j = conditionalAccessAuthenticationPayloadSignalCallbackImpl.swigCPtr;
                conditionalAccessAuthenticationPayloadSignalCallbackImpl.swigCMemOwn = false;
                conditionalAccessAuthenticationPayloadSignalCallbackImpl.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public void PerformCallback(ConditionalAccessAuthenticationPayloadNative conditionalAccessAuthenticationPayloadNative) {
        try {
            OnCallback(conditionalAccessAuthenticationPayloadNative);
        } catch (Throwable th) {
            ye4.d(getClass().getSimpleName(), th);
            throw th;
        }
    }

    @Override // com.teamviewer.remotecontrolviewmodellib.swig.ConditionalAccessAuthenticationPayloadSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ConditionalAccessAuthPayloadSignalCallbackImplSWIGJNI.delete_ConditionalAccessAuthenticationPayloadSignalCallbackImpl(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.remotecontrolviewmodellib.swig.ConditionalAccessAuthenticationPayloadSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public void finalize() {
        delete();
    }

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        ConditionalAccessAuthPayloadSignalCallbackImplSWIGJNI.ConditionalAccessAuthenticationPayloadSignalCallbackImpl_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        ConditionalAccessAuthPayloadSignalCallbackImplSWIGJNI.ConditionalAccessAuthenticationPayloadSignalCallbackImpl_change_ownership(this, this.swigCPtr, true);
    }

    public ConditionalAccessAuthenticationPayloadSignalCallbackImpl(long j, boolean z) {
        super(ConditionalAccessAuthPayloadSignalCallbackImplSWIGJNI.ConditionalAccessAuthenticationPayloadSignalCallbackImpl_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }
}
