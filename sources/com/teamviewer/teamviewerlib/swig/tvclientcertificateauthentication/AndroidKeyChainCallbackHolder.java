package com.teamviewer.teamviewerlib.swig.tvclientcertificateauthentication;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class AndroidKeyChainCallbackHolder {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public AndroidKeyChainCallbackHolder(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static void ClearCallback() {
        AndroidKeyChainCallbackHolderSWIGJNI.AndroidKeyChainCallbackHolder_ClearCallback();
    }

    public static void SetAndroidKeyChainCallback(IAndroidKeyChainCallback iAndroidKeyChainCallback) {
        AndroidKeyChainCallbackHolderSWIGJNI.AndroidKeyChainCallbackHolder_SetAndroidKeyChainCallback(IAndroidKeyChainCallback.getCPtr(iAndroidKeyChainCallback), iAndroidKeyChainCallback);
    }

    public static long getCPtr(AndroidKeyChainCallbackHolder androidKeyChainCallbackHolder) {
        if (androidKeyChainCallbackHolder == null) {
            return 0L;
        }
        return androidKeyChainCallbackHolder.swigCPtr;
    }

    public static long swigRelease(AndroidKeyChainCallbackHolder androidKeyChainCallbackHolder) {
        if (androidKeyChainCallbackHolder != null) {
            if (androidKeyChainCallbackHolder.swigCMemOwn) {
                long j = androidKeyChainCallbackHolder.swigCPtr;
                androidKeyChainCallbackHolder.swigCMemOwn = false;
                androidKeyChainCallbackHolder.delete();
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
                    AndroidKeyChainCallbackHolderSWIGJNI.delete_AndroidKeyChainCallbackHolder(j);
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
