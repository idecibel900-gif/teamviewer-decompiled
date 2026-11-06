package com.teamviewer.teamviewerlib.swig.tvclientcertificateauthentication;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class AndroidKeyChainByteArray {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public AndroidKeyChainByteArray() {
        this(IAndroidKeyChainCallbackSWIGJNI.new_AndroidKeyChainByteArray(), true);
    }

    public static long getCPtr(AndroidKeyChainByteArray androidKeyChainByteArray) {
        if (androidKeyChainByteArray == null) {
            return 0L;
        }
        return androidKeyChainByteArray.swigCPtr;
    }

    public static long swigRelease(AndroidKeyChainByteArray androidKeyChainByteArray) {
        if (androidKeyChainByteArray != null) {
            if (androidKeyChainByteArray.swigCMemOwn) {
                long j = androidKeyChainByteArray.swigCPtr;
                androidKeyChainByteArray.swigCMemOwn = false;
                androidKeyChainByteArray.delete();
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
                    IAndroidKeyChainCallbackSWIGJNI.delete_AndroidKeyChainByteArray(j);
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
        return IAndroidKeyChainCallbackSWIGJNI.AndroidKeyChainByteArray_data_get(this.swigCPtr, this);
    }

    public void setData(byte[] bArr) {
        IAndroidKeyChainCallbackSWIGJNI.AndroidKeyChainByteArray_data_set(this.swigCPtr, this, bArr);
    }

    public AndroidKeyChainByteArray(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
