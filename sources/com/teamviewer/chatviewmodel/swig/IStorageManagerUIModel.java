package com.teamviewer.chatviewmodel.swig;

import com.teamviewer.swigcallbacklib.StringSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public class IStorageManagerUIModel {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IStorageManagerUIModel(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IStorageManagerUIModel iStorageManagerUIModel) {
        if (iStorageManagerUIModel == null) {
            return 0L;
        }
        return iStorageManagerUIModel.swigCPtr;
    }

    public void NotifyDownloadFinished(String str, int i) {
        IStorageManagerUIModelSWIGJNI.IStorageManagerUIModel_NotifyDownloadFinished(this.swigCPtr, this, str, i);
    }

    public void NotifyDownloadProgress(String str, int i) {
        IStorageManagerUIModelSWIGJNI.IStorageManagerUIModel_NotifyDownloadProgress(this.swigCPtr, this, str, i);
    }

    public void NotifyUploadFinished(String str, int i) {
        IStorageManagerUIModelSWIGJNI.IStorageManagerUIModel_NotifyUploadFinished(this.swigCPtr, this, str, i);
    }

    public void NotifyUploadProgress(String str, int i) {
        IStorageManagerUIModelSWIGJNI.IStorageManagerUIModel_NotifyUploadProgress(this.swigCPtr, this, str, i);
    }

    public void RegisterForCancel(StringSignalCallback stringSignalCallback) {
        IStorageManagerUIModelSWIGJNI.IStorageManagerUIModel_RegisterForCancel(this.swigCPtr, this, StringSignalCallback.getCPtr(stringSignalCallback), stringSignalCallback);
    }

    public void RegisterForDownload(StorageManagerTransferDataSignalCallback storageManagerTransferDataSignalCallback) {
        IStorageManagerUIModelSWIGJNI.IStorageManagerUIModel_RegisterForDownload(this.swigCPtr, this, StorageManagerTransferDataSignalCallback.getCPtr(storageManagerTransferDataSignalCallback), storageManagerTransferDataSignalCallback);
    }

    public void RegisterForUpload(StorageManagerTransferDataSignalCallback storageManagerTransferDataSignalCallback) {
        IStorageManagerUIModelSWIGJNI.IStorageManagerUIModel_RegisterForUpload(this.swigCPtr, this, StorageManagerTransferDataSignalCallback.getCPtr(storageManagerTransferDataSignalCallback), storageManagerTransferDataSignalCallback);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IStorageManagerUIModelSWIGJNI.delete_IStorageManagerUIModel(j);
                }
                this.swigCPtr = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void finalize() {
        delete();
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }
}
