package com.teamviewer.chatviewmodel.swig;

import com.teamviewer.swigcallbacklib.SignalCallbackBase;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public abstract class ListChangeSignalCallback extends SignalCallbackBase {
    private transient long swigCPtr;

    public ListChangeSignalCallback(long j, boolean z) {
        super(ListChangeSignalCallbackSWIGJNI.ListChangeSignalCallback_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(ListChangeSignalCallback listChangeSignalCallback) {
        if (listChangeSignalCallback == null) {
            return 0L;
        }
        return listChangeSignalCallback.swigCPtr;
    }

    public static long swigRelease(ListChangeSignalCallback listChangeSignalCallback) {
        if (listChangeSignalCallback != null) {
            if (listChangeSignalCallback.swigCMemOwn) {
                long j = listChangeSignalCallback.swigCPtr;
                listChangeSignalCallback.swigCMemOwn = false;
                listChangeSignalCallback.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public abstract void OnCallback(ListChangeArgs listChangeArgs);

    @Override // com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ListChangeSignalCallbackSWIGJNI.delete_ListChangeSignalCallback(j);
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
