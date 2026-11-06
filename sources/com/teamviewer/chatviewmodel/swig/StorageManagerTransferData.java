package com.teamviewer.chatviewmodel.swig;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class StorageManagerTransferData {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public StorageManagerTransferData(String str, String str2, MapOfStringString mapOfStringString) {
        this(StorageManagerTransferDataSWIGJNI.new_StorageManagerTransferData__SWIG_1(str, str2, MapOfStringString.getCPtr(mapOfStringString), mapOfStringString), true);
    }

    public static long getCPtr(StorageManagerTransferData storageManagerTransferData) {
        if (storageManagerTransferData == null) {
            return 0L;
        }
        return storageManagerTransferData.swigCPtr;
    }

    public static long swigRelease(StorageManagerTransferData storageManagerTransferData) {
        if (storageManagerTransferData != null) {
            if (storageManagerTransferData.swigCMemOwn) {
                long j = storageManagerTransferData.swigCPtr;
                storageManagerTransferData.swigCMemOwn = false;
                storageManagerTransferData.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    StorageManagerTransferDataSWIGJNI.delete_StorageManagerTransferData(j);
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

    public MapOfStringString getMetadata() {
        long jStorageManagerTransferData_metadata_get = StorageManagerTransferDataSWIGJNI.StorageManagerTransferData_metadata_get(this.swigCPtr, this);
        if (jStorageManagerTransferData_metadata_get == 0) {
            return null;
        }
        return new MapOfStringString(jStorageManagerTransferData_metadata_get, false);
    }

    public String getTransferId() {
        return StorageManagerTransferDataSWIGJNI.StorageManagerTransferData_transferId_get(this.swigCPtr, this);
    }

    public String getUrl() {
        return StorageManagerTransferDataSWIGJNI.StorageManagerTransferData_url_get(this.swigCPtr, this);
    }

    public StorageManagerTransferData(String str, String str2) {
        this(StorageManagerTransferDataSWIGJNI.new_StorageManagerTransferData__SWIG_0(str, str2), true);
    }

    public StorageManagerTransferData(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
