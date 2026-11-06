package com.teamviewer.remotecontrolviewmodellib.swig;

import com.teamviewer.swigcallbacklib.SignalCallbackBase;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public abstract class ToolbarClientButtonStateSignalCallback extends SignalCallbackBase {
    private transient long swigCPtr;

    public ToolbarClientButtonStateSignalCallback(long j, boolean z) {
        super(ToolbarClientButtonStateSignalCallbackSWIGJNI.ToolbarClientButtonStateSignalCallback_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(ToolbarClientButtonStateSignalCallback toolbarClientButtonStateSignalCallback) {
        if (toolbarClientButtonStateSignalCallback == null) {
            return 0L;
        }
        return toolbarClientButtonStateSignalCallback.swigCPtr;
    }

    public static long swigRelease(ToolbarClientButtonStateSignalCallback toolbarClientButtonStateSignalCallback) {
        if (toolbarClientButtonStateSignalCallback != null) {
            if (toolbarClientButtonStateSignalCallback.swigCMemOwn) {
                long j = toolbarClientButtonStateSignalCallback.swigCPtr;
                toolbarClientButtonStateSignalCallback.swigCMemOwn = false;
                toolbarClientButtonStateSignalCallback.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public abstract void OnCallback(ToolbarButtonState toolbarButtonState);

    @Override // com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ToolbarClientButtonStateSignalCallbackSWIGJNI.delete_ToolbarClientButtonStateSignalCallback(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.swigcallbacklib.SignalCallbackBase
    public void finalize() {
        delete();
    }
}
