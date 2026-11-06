package com.teamviewer.teamviewerlib.swig.tvcrypto;

/* JADX INFO: loaded from: classes.dex */
public class ICryptoKey {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public ICryptoKey(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(ICryptoKey iCryptoKey) {
        if (iCryptoKey == null) {
            return 0L;
        }
        return iCryptoKey.swigCPtr;
    }

    public boolean DecryptionKey() {
        return ICryptoKeySWIGJNI.ICryptoKey_DecryptionKey(this.swigCPtr, this);
    }

    public SWIGTYPE_p_TByteArrayPtrTuple ExportEncryptionKey() {
        return new SWIGTYPE_p_TByteArrayPtrTuple(ICryptoKeySWIGJNI.ICryptoKey_ExportEncryptionKey(this.swigCPtr, this), true);
    }

    public SWIGTYPE_p_TByteArrayPtrTuple ExportFullKey() {
        return new SWIGTYPE_p_TByteArrayPtrTuple(ICryptoKeySWIGJNI.ICryptoKey_ExportFullKey(this.swigCPtr, this), true);
    }

    public boolean IsSymmetricKey() {
        return ICryptoKeySWIGJNI.ICryptoKey_IsSymmetricKey(this.swigCPtr, this);
    }

    public long KeySize() {
        return ICryptoKeySWIGJNI.ICryptoKey_KeySize(this.swigCPtr, this);
    }

    public CryptoKeyType KeyType() {
        return CryptoKeyType.swigToEnum(ICryptoKeySWIGJNI.ICryptoKey_KeyType(this.swigCPtr, this));
    }

    public boolean WrappingKey() {
        return ICryptoKeySWIGJNI.ICryptoKey_WrappingKey(this.swigCPtr, this);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ICryptoKeySWIGJNI.delete_ICryptoKey(j);
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
