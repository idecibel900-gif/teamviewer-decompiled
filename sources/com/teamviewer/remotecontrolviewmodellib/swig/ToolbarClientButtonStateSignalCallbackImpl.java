package com.teamviewer.remotecontrolviewmodellib.swig;

import o.hk0;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public abstract class ToolbarClientButtonStateSignalCallbackImpl extends ToolbarClientButtonStateSignalCallback {
    private transient long swigCPtr;

    public ToolbarClientButtonStateSignalCallbackImpl() {
        this(ToolbarClientButtonStateSignalCallbackImplSWIGJNI.new_ToolbarClientButtonStateSignalCallbackImpl(), true);
        ToolbarClientButtonStateSignalCallbackImplSWIGJNI.ToolbarClientButtonStateSignalCallbackImpl_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(ToolbarClientButtonStateSignalCallbackImpl toolbarClientButtonStateSignalCallbackImpl) {
        if (toolbarClientButtonStateSignalCallbackImpl == null) {
            return 0L;
        }
        return toolbarClientButtonStateSignalCallbackImpl.swigCPtr;
    }

    public static long swigRelease(ToolbarClientButtonStateSignalCallbackImpl toolbarClientButtonStateSignalCallbackImpl) {
        if (toolbarClientButtonStateSignalCallbackImpl != null) {
            if (toolbarClientButtonStateSignalCallbackImpl.swigCMemOwn) {
                long j = toolbarClientButtonStateSignalCallbackImpl.swigCPtr;
                toolbarClientButtonStateSignalCallbackImpl.swigCMemOwn = false;
                toolbarClientButtonStateSignalCallbackImpl.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public void PerformCallback(ToolbarButtonState toolbarButtonState) {
        try {
            OnCallback(toolbarButtonState);
        } catch (Throwable th) {
            ye4.d(getClass().getSimpleName(), th);
            throw th;
        }
    }

    @Override // com.teamviewer.remotecontrolviewmodellib.swig.ToolbarClientButtonStateSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ToolbarClientButtonStateSignalCallbackImplSWIGJNI.delete_ToolbarClientButtonStateSignalCallbackImpl(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.remotecontrolviewmodellib.swig.ToolbarClientButtonStateSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public void finalize() {
        delete();
    }

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        ToolbarClientButtonStateSignalCallbackImplSWIGJNI.ToolbarClientButtonStateSignalCallbackImpl_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        ToolbarClientButtonStateSignalCallbackImplSWIGJNI.ToolbarClientButtonStateSignalCallbackImpl_change_ownership(this, this.swigCPtr, true);
    }

    public ToolbarClientButtonStateSignalCallbackImpl(long j, boolean z) {
        super(ToolbarClientButtonStateSignalCallbackImplSWIGJNI.ToolbarClientButtonStateSignalCallbackImpl_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }
}
