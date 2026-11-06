package com.teamviewer.dataencryptionlib.swig.settings;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class TByteArrayPtrTupleStruct {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public TByteArrayPtrTupleStruct() {
        this(IAndroidCryptoProtectDataCallbackSWIGJNI.new_TByteArrayPtrTupleStruct(), true);
    }

    public static long getCPtr(TByteArrayPtrTupleStruct tByteArrayPtrTupleStruct) {
        if (tByteArrayPtrTupleStruct == null) {
            return 0L;
        }
        return tByteArrayPtrTupleStruct.swigCPtr;
    }

    public static long swigRelease(TByteArrayPtrTupleStruct tByteArrayPtrTupleStruct) {
        if (tByteArrayPtrTupleStruct != null) {
            if (tByteArrayPtrTupleStruct.swigCMemOwn) {
                long j = tByteArrayPtrTupleStruct.swigCPtr;
                tByteArrayPtrTupleStruct.swigCMemOwn = false;
                tByteArrayPtrTupleStruct.delete();
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
                    IAndroidCryptoProtectDataCallbackSWIGJNI.delete_TByteArrayPtrTupleStruct(j);
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

    public byte[] getData() {
        return IAndroidCryptoProtectDataCallbackSWIGJNI.TByteArrayPtrTupleStruct_data_get(this.swigCPtr, this);
    }

    public void setData(byte[] bArr) {
        IAndroidCryptoProtectDataCallbackSWIGJNI.TByteArrayPtrTupleStruct_data_set(this.swigCPtr, this, bArr);
    }

    public TByteArrayPtrTupleStruct(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
