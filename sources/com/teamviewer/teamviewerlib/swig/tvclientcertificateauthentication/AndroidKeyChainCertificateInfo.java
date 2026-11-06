package com.teamviewer.teamviewerlib.swig.tvclientcertificateauthentication;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class AndroidKeyChainCertificateInfo {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public AndroidKeyChainCertificateInfo() {
        this(IAndroidKeyChainCallbackSWIGJNI.new_AndroidKeyChainCertificateInfo(), true);
    }

    public static long getCPtr(AndroidKeyChainCertificateInfo androidKeyChainCertificateInfo) {
        if (androidKeyChainCertificateInfo == null) {
            return 0L;
        }
        return androidKeyChainCertificateInfo.swigCPtr;
    }

    public static long swigRelease(AndroidKeyChainCertificateInfo androidKeyChainCertificateInfo) {
        if (androidKeyChainCertificateInfo != null) {
            if (androidKeyChainCertificateInfo.swigCMemOwn) {
                long j = androidKeyChainCertificateInfo.swigCPtr;
                androidKeyChainCertificateInfo.swigCMemOwn = false;
                androidKeyChainCertificateInfo.delete();
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
                    IAndroidKeyChainCallbackSWIGJNI.delete_AndroidKeyChainCertificateInfo(j);
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

    public AndroidKeyChainStringVector getSubjectPairs() {
        long jAndroidKeyChainCertificateInfo_subjectPairs_get = IAndroidKeyChainCallbackSWIGJNI.AndroidKeyChainCertificateInfo_subjectPairs_get(this.swigCPtr, this);
        if (jAndroidKeyChainCertificateInfo_subjectPairs_get == 0) {
            return null;
        }
        return new AndroidKeyChainStringVector(jAndroidKeyChainCertificateInfo_subjectPairs_get, false);
    }

    public void setSubjectPairs(AndroidKeyChainStringVector androidKeyChainStringVector) {
        IAndroidKeyChainCallbackSWIGJNI.AndroidKeyChainCertificateInfo_subjectPairs_set(this.swigCPtr, this, AndroidKeyChainStringVector.getCPtr(androidKeyChainStringVector), androidKeyChainStringVector);
    }

    public AndroidKeyChainCertificateInfo(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
