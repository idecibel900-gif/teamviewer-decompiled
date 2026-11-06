package com.teamviewer.teamviewerlib.swig.tvclientcertificateauthentication;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class CertificateFingerprints {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public CertificateFingerprints() {
        this(IAndroidKeyChainCallbackSWIGJNI.new_CertificateFingerprints(), true);
    }

    public static long getCPtr(CertificateFingerprints certificateFingerprints) {
        if (certificateFingerprints == null) {
            return 0L;
        }
        return certificateFingerprints.swigCPtr;
    }

    public static long swigRelease(CertificateFingerprints certificateFingerprints) {
        if (certificateFingerprints != null) {
            if (certificateFingerprints.swigCMemOwn) {
                long j = certificateFingerprints.swigCPtr;
                certificateFingerprints.swigCMemOwn = false;
                certificateFingerprints.delete();
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
                    IAndroidKeyChainCallbackSWIGJNI.delete_CertificateFingerprints(j);
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

    public String getRootCaFingerprint() {
        return IAndroidKeyChainCallbackSWIGJNI.CertificateFingerprints_rootCaFingerprint_get(this.swigCPtr, this);
    }

    public String getUserCertFingerprint() {
        return IAndroidKeyChainCallbackSWIGJNI.CertificateFingerprints_userCertFingerprint_get(this.swigCPtr, this);
    }

    public void setRootCaFingerprint(String str) {
        IAndroidKeyChainCallbackSWIGJNI.CertificateFingerprints_rootCaFingerprint_set(this.swigCPtr, this, str);
    }

    public void setUserCertFingerprint(String str) {
        IAndroidKeyChainCallbackSWIGJNI.CertificateFingerprints_userCertFingerprint_set(this.swigCPtr, this, str);
    }

    public CertificateFingerprints(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
