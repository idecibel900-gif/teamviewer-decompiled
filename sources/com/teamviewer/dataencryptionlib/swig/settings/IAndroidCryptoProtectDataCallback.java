package com.teamviewer.dataencryptionlib.swig.settings;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public abstract class IAndroidCryptoProtectDataCallback {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IAndroidCryptoProtectDataCallback() {
        this(IAndroidCryptoProtectDataCallbackSWIGJNI.new_IAndroidCryptoProtectDataCallback(), true);
        IAndroidCryptoProtectDataCallbackSWIGJNI.IAndroidCryptoProtectDataCallback_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(IAndroidCryptoProtectDataCallback iAndroidCryptoProtectDataCallback) {
        if (iAndroidCryptoProtectDataCallback == null) {
            return 0L;
        }
        return iAndroidCryptoProtectDataCallback.swigCPtr;
    }

    public static long swigRelease(IAndroidCryptoProtectDataCallback iAndroidCryptoProtectDataCallback) {
        if (iAndroidCryptoProtectDataCallback != null) {
            if (iAndroidCryptoProtectDataCallback.swigCMemOwn) {
                long j = iAndroidCryptoProtectDataCallback.swigCPtr;
                iAndroidCryptoProtectDataCallback.swigCMemOwn = false;
                iAndroidCryptoProtectDataCallback.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public TByteArrayPtrTupleStruct DecryptData(TByteArrayPtrTupleStruct tByteArrayPtrTupleStruct) {
        return new TByteArrayPtrTupleStruct(IAndroidCryptoProtectDataCallbackSWIGJNI.IAndroidCryptoProtectDataCallback_DecryptData(this.swigCPtr, this, TByteArrayPtrTupleStruct.getCPtr(tByteArrayPtrTupleStruct), tByteArrayPtrTupleStruct), true);
    }

    public TByteArrayPtrTupleStruct EncryptData(TByteArrayPtrTupleStruct tByteArrayPtrTupleStruct) {
        return new TByteArrayPtrTupleStruct(IAndroidCryptoProtectDataCallbackSWIGJNI.IAndroidCryptoProtectDataCallback_EncryptData(this.swigCPtr, this, TByteArrayPtrTupleStruct.getCPtr(tByteArrayPtrTupleStruct), tByteArrayPtrTupleStruct), true);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IAndroidCryptoProtectDataCallbackSWIGJNI.delete_IAndroidCryptoProtectDataCallback(j);
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

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        IAndroidCryptoProtectDataCallbackSWIGJNI.IAndroidCryptoProtectDataCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        IAndroidCryptoProtectDataCallbackSWIGJNI.IAndroidCryptoProtectDataCallback_change_ownership(this, this.swigCPtr, true);
    }

    public IAndroidCryptoProtectDataCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
