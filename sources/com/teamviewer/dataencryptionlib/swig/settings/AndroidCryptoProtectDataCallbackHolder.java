package com.teamviewer.dataencryptionlib.swig.settings;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class AndroidCryptoProtectDataCallbackHolder {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public AndroidCryptoProtectDataCallbackHolder(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static void ClearCallback() {
        AndroidCryptoProtectDataCallbackHolderSWIGJNI.AndroidCryptoProtectDataCallbackHolder_ClearCallback();
    }

    public static void SetAndroidCryptoProtectDataCallback(IAndroidCryptoProtectDataCallback iAndroidCryptoProtectDataCallback) {
        AndroidCryptoProtectDataCallbackHolderSWIGJNI.AndroidCryptoProtectDataCallbackHolder_SetAndroidCryptoProtectDataCallback(IAndroidCryptoProtectDataCallback.getCPtr(iAndroidCryptoProtectDataCallback), iAndroidCryptoProtectDataCallback);
    }

    public static long getCPtr(AndroidCryptoProtectDataCallbackHolder androidCryptoProtectDataCallbackHolder) {
        if (androidCryptoProtectDataCallbackHolder == null) {
            return 0L;
        }
        return androidCryptoProtectDataCallbackHolder.swigCPtr;
    }

    public static long swigRelease(AndroidCryptoProtectDataCallbackHolder androidCryptoProtectDataCallbackHolder) {
        if (androidCryptoProtectDataCallbackHolder != null) {
            if (androidCryptoProtectDataCallbackHolder.swigCMemOwn) {
                long j = androidCryptoProtectDataCallbackHolder.swigCPtr;
                androidCryptoProtectDataCallbackHolder.swigCMemOwn = false;
                androidCryptoProtectDataCallbackHolder.delete();
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
                    AndroidCryptoProtectDataCallbackHolderSWIGJNI.delete_AndroidCryptoProtectDataCallbackHolder(j);
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
}
