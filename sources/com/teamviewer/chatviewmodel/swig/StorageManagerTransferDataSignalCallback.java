package com.teamviewer.chatviewmodel.swig;

import com.teamviewer.swigcallbacklib.SignalCallbackBase;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public abstract class StorageManagerTransferDataSignalCallback extends SignalCallbackBase {
    private transient long swigCPtr;

    public StorageManagerTransferDataSignalCallback(long j, boolean z) {
        super(StorageManagerTransferDataSignalCallbackSWIGJNI.StorageManagerTransferDataSignalCallback_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(StorageManagerTransferDataSignalCallback storageManagerTransferDataSignalCallback) {
        if (storageManagerTransferDataSignalCallback == null) {
            return 0L;
        }
        return storageManagerTransferDataSignalCallback.swigCPtr;
    }

    public static long swigRelease(StorageManagerTransferDataSignalCallback storageManagerTransferDataSignalCallback) {
        if (storageManagerTransferDataSignalCallback != null) {
            if (storageManagerTransferDataSignalCallback.swigCMemOwn) {
                long j = storageManagerTransferDataSignalCallback.swigCPtr;
                storageManagerTransferDataSignalCallback.swigCMemOwn = false;
                storageManagerTransferDataSignalCallback.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public abstract void OnCallback(StorageManagerTransferData storageManagerTransferData);

    @Override // com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    StorageManagerTransferDataSignalCallbackSWIGJNI.delete_StorageManagerTransferDataSignalCallback(j);
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
