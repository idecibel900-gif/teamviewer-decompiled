package com.teamviewer.teamviewerlib.swig.tvclientcertificateauthentication;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public abstract class IAndroidKeyChainCallback {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IAndroidKeyChainCallback() {
        this(IAndroidKeyChainCallbackSWIGJNI.new_IAndroidKeyChainCallback(), true);
        IAndroidKeyChainCallbackSWIGJNI.IAndroidKeyChainCallback_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(IAndroidKeyChainCallback iAndroidKeyChainCallback) {
        if (iAndroidKeyChainCallback == null) {
            return 0L;
        }
        return iAndroidKeyChainCallback.swigCPtr;
    }

    public static long swigRelease(IAndroidKeyChainCallback iAndroidKeyChainCallback) {
        if (iAndroidKeyChainCallback != null) {
            if (iAndroidKeyChainCallback.swigCMemOwn) {
                long j = iAndroidKeyChainCallback.swigCPtr;
                iAndroidKeyChainCallback.swigCMemOwn = false;
                iAndroidKeyChainCallback.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public AndroidKeyChainByteArrayVector GetCertificateChainDer(String str) {
        return new AndroidKeyChainByteArrayVector(IAndroidKeyChainCallbackSWIGJNI.IAndroidKeyChainCallback_GetCertificateChainDer(this.swigCPtr, this, str), true);
    }

    public AndroidKeyChainCertificateInfo GetCertificateInfo(AndroidKeyChainByteArray androidKeyChainByteArray) {
        return new AndroidKeyChainCertificateInfo(IAndroidKeyChainCallbackSWIGJNI.IAndroidKeyChainCallback_GetCertificateInfo(this.swigCPtr, this, AndroidKeyChainByteArray.getCPtr(androidKeyChainByteArray), androidKeyChainByteArray), true);
    }

    public CertificateFingerprints GetFingerprints(String str) {
        return new CertificateFingerprints(IAndroidKeyChainCallbackSWIGJNI.IAndroidKeyChainCallback_GetFingerprints(this.swigCPtr, this, str), true);
    }

    public AndroidKeyChainByteArray Sign(String str, AndroidKeyChainByteArray androidKeyChainByteArray) {
        return new AndroidKeyChainByteArray(IAndroidKeyChainCallbackSWIGJNI.IAndroidKeyChainCallback_Sign(this.swigCPtr, this, str, AndroidKeyChainByteArray.getCPtr(androidKeyChainByteArray), androidKeyChainByteArray), true);
    }

    public boolean VerifyChainPkix(AndroidKeyChainByteArray androidKeyChainByteArray, AndroidKeyChainByteArrayVector androidKeyChainByteArrayVector, AndroidKeyChainByteArrayVector androidKeyChainByteArrayVector2) {
        return IAndroidKeyChainCallbackSWIGJNI.IAndroidKeyChainCallback_VerifyChainPkix(this.swigCPtr, this, AndroidKeyChainByteArray.getCPtr(androidKeyChainByteArray), androidKeyChainByteArray, AndroidKeyChainByteArrayVector.getCPtr(androidKeyChainByteArrayVector), androidKeyChainByteArrayVector, AndroidKeyChainByteArrayVector.getCPtr(androidKeyChainByteArrayVector2), androidKeyChainByteArrayVector2);
    }

    public boolean VerifySignature(AndroidKeyChainByteArray androidKeyChainByteArray, AndroidKeyChainByteArray androidKeyChainByteArray2, AndroidKeyChainByteArray androidKeyChainByteArray3) {
        return IAndroidKeyChainCallbackSWIGJNI.IAndroidKeyChainCallback_VerifySignature(this.swigCPtr, this, AndroidKeyChainByteArray.getCPtr(androidKeyChainByteArray), androidKeyChainByteArray, AndroidKeyChainByteArray.getCPtr(androidKeyChainByteArray2), androidKeyChainByteArray2, AndroidKeyChainByteArray.getCPtr(androidKeyChainByteArray3), androidKeyChainByteArray3);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IAndroidKeyChainCallbackSWIGJNI.delete_IAndroidKeyChainCallback(j);
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
        IAndroidKeyChainCallbackSWIGJNI.IAndroidKeyChainCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        IAndroidKeyChainCallbackSWIGJNI.IAndroidKeyChainCallback_change_ownership(this, this.swigCPtr, true);
    }

    public IAndroidKeyChainCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
