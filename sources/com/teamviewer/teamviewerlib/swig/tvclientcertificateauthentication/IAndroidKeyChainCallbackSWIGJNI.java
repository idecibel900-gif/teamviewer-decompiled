package com.teamviewer.teamviewerlib.swig.tvclientcertificateauthentication;

/* JADX INFO: loaded from: classes.dex */
public class IAndroidKeyChainCallbackSWIGJNI {
    static {
        swig_module_init();
    }

    public static final native void AndroidKeyChainByteArrayVector_clear(long j, AndroidKeyChainByteArrayVector androidKeyChainByteArrayVector);

    public static final native void AndroidKeyChainByteArrayVector_doAdd__SWIG_0(long j, AndroidKeyChainByteArrayVector androidKeyChainByteArrayVector, long j2, AndroidKeyChainByteArray androidKeyChainByteArray);

    public static final native void AndroidKeyChainByteArrayVector_doAdd__SWIG_1(long j, AndroidKeyChainByteArrayVector androidKeyChainByteArrayVector, int i, long j2, AndroidKeyChainByteArray androidKeyChainByteArray);

    public static final native int AndroidKeyChainByteArrayVector_doCapacity(long j, AndroidKeyChainByteArrayVector androidKeyChainByteArrayVector);

    public static final native long AndroidKeyChainByteArrayVector_doGet(long j, AndroidKeyChainByteArrayVector androidKeyChainByteArrayVector, int i);

    public static final native long AndroidKeyChainByteArrayVector_doRemove(long j, AndroidKeyChainByteArrayVector androidKeyChainByteArrayVector, int i);

    public static final native void AndroidKeyChainByteArrayVector_doRemoveRange(long j, AndroidKeyChainByteArrayVector androidKeyChainByteArrayVector, int i, int i2);

    public static final native void AndroidKeyChainByteArrayVector_doReserve(long j, AndroidKeyChainByteArrayVector androidKeyChainByteArrayVector, int i);

    public static final native long AndroidKeyChainByteArrayVector_doSet(long j, AndroidKeyChainByteArrayVector androidKeyChainByteArrayVector, int i, long j2, AndroidKeyChainByteArray androidKeyChainByteArray);

    public static final native int AndroidKeyChainByteArrayVector_doSize(long j, AndroidKeyChainByteArrayVector androidKeyChainByteArrayVector);

    public static final native boolean AndroidKeyChainByteArrayVector_isEmpty(long j, AndroidKeyChainByteArrayVector androidKeyChainByteArrayVector);

    public static final native byte[] AndroidKeyChainByteArray_data_get(long j, AndroidKeyChainByteArray androidKeyChainByteArray);

    public static final native void AndroidKeyChainByteArray_data_set(long j, AndroidKeyChainByteArray androidKeyChainByteArray, byte[] bArr);

    public static final native long AndroidKeyChainCertificateInfo_subjectPairs_get(long j, AndroidKeyChainCertificateInfo androidKeyChainCertificateInfo);

    public static final native void AndroidKeyChainCertificateInfo_subjectPairs_set(long j, AndroidKeyChainCertificateInfo androidKeyChainCertificateInfo, long j2, AndroidKeyChainStringVector androidKeyChainStringVector);

    public static final native void AndroidKeyChainStringVector_clear(long j, AndroidKeyChainStringVector androidKeyChainStringVector);

    public static final native void AndroidKeyChainStringVector_doAdd__SWIG_0(long j, AndroidKeyChainStringVector androidKeyChainStringVector, String str);

    public static final native void AndroidKeyChainStringVector_doAdd__SWIG_1(long j, AndroidKeyChainStringVector androidKeyChainStringVector, int i, String str);

    public static final native int AndroidKeyChainStringVector_doCapacity(long j, AndroidKeyChainStringVector androidKeyChainStringVector);

    public static final native String AndroidKeyChainStringVector_doGet(long j, AndroidKeyChainStringVector androidKeyChainStringVector, int i);

    public static final native String AndroidKeyChainStringVector_doRemove(long j, AndroidKeyChainStringVector androidKeyChainStringVector, int i);

    public static final native void AndroidKeyChainStringVector_doRemoveRange(long j, AndroidKeyChainStringVector androidKeyChainStringVector, int i, int i2);

    public static final native void AndroidKeyChainStringVector_doReserve(long j, AndroidKeyChainStringVector androidKeyChainStringVector, int i);

    public static final native String AndroidKeyChainStringVector_doSet(long j, AndroidKeyChainStringVector androidKeyChainStringVector, int i, String str);

    public static final native int AndroidKeyChainStringVector_doSize(long j, AndroidKeyChainStringVector androidKeyChainStringVector);

    public static final native boolean AndroidKeyChainStringVector_isEmpty(long j, AndroidKeyChainStringVector androidKeyChainStringVector);

    public static final native String CertificateFingerprints_rootCaFingerprint_get(long j, CertificateFingerprints certificateFingerprints);

    public static final native void CertificateFingerprints_rootCaFingerprint_set(long j, CertificateFingerprints certificateFingerprints, String str);

    public static final native String CertificateFingerprints_userCertFingerprint_get(long j, CertificateFingerprints certificateFingerprints);

    public static final native void CertificateFingerprints_userCertFingerprint_set(long j, CertificateFingerprints certificateFingerprints, String str);

    public static final native long IAndroidKeyChainCallback_GetCertificateChainDer(long j, IAndroidKeyChainCallback iAndroidKeyChainCallback, String str);

    public static final native long IAndroidKeyChainCallback_GetCertificateInfo(long j, IAndroidKeyChainCallback iAndroidKeyChainCallback, long j2, AndroidKeyChainByteArray androidKeyChainByteArray);

    public static final native long IAndroidKeyChainCallback_GetFingerprints(long j, IAndroidKeyChainCallback iAndroidKeyChainCallback, String str);

    public static final native long IAndroidKeyChainCallback_Sign(long j, IAndroidKeyChainCallback iAndroidKeyChainCallback, String str, long j2, AndroidKeyChainByteArray androidKeyChainByteArray);

    public static final native boolean IAndroidKeyChainCallback_VerifyChainPkix(long j, IAndroidKeyChainCallback iAndroidKeyChainCallback, long j2, AndroidKeyChainByteArray androidKeyChainByteArray, long j3, AndroidKeyChainByteArrayVector androidKeyChainByteArrayVector, long j4, AndroidKeyChainByteArrayVector androidKeyChainByteArrayVector2);

    public static final native boolean IAndroidKeyChainCallback_VerifySignature(long j, IAndroidKeyChainCallback iAndroidKeyChainCallback, long j2, AndroidKeyChainByteArray androidKeyChainByteArray, long j3, AndroidKeyChainByteArray androidKeyChainByteArray2, long j4, AndroidKeyChainByteArray androidKeyChainByteArray3);

    public static final native void IAndroidKeyChainCallback_change_ownership(IAndroidKeyChainCallback iAndroidKeyChainCallback, long j, boolean z);

    public static final native void IAndroidKeyChainCallback_director_connect(IAndroidKeyChainCallback iAndroidKeyChainCallback, long j, boolean z, boolean z2);

    public static long SwigDirector_IAndroidKeyChainCallback_GetCertificateChainDer(IAndroidKeyChainCallback iAndroidKeyChainCallback, String str) {
        return AndroidKeyChainByteArrayVector.getCPtr(iAndroidKeyChainCallback.GetCertificateChainDer(str));
    }

    public static long SwigDirector_IAndroidKeyChainCallback_GetCertificateInfo(IAndroidKeyChainCallback iAndroidKeyChainCallback, long j) {
        return AndroidKeyChainCertificateInfo.getCPtr(iAndroidKeyChainCallback.GetCertificateInfo(new AndroidKeyChainByteArray(j, false)));
    }

    public static long SwigDirector_IAndroidKeyChainCallback_GetFingerprints(IAndroidKeyChainCallback iAndroidKeyChainCallback, String str) {
        return CertificateFingerprints.getCPtr(iAndroidKeyChainCallback.GetFingerprints(str));
    }

    public static long SwigDirector_IAndroidKeyChainCallback_Sign(IAndroidKeyChainCallback iAndroidKeyChainCallback, String str, long j) {
        return AndroidKeyChainByteArray.getCPtr(iAndroidKeyChainCallback.Sign(str, new AndroidKeyChainByteArray(j, false)));
    }

    public static boolean SwigDirector_IAndroidKeyChainCallback_VerifyChainPkix(IAndroidKeyChainCallback iAndroidKeyChainCallback, long j, long j2, long j3) {
        return iAndroidKeyChainCallback.VerifyChainPkix(new AndroidKeyChainByteArray(j, false), new AndroidKeyChainByteArrayVector(j2, false), new AndroidKeyChainByteArrayVector(j3, false));
    }

    public static boolean SwigDirector_IAndroidKeyChainCallback_VerifySignature(IAndroidKeyChainCallback iAndroidKeyChainCallback, long j, long j2, long j3) {
        return iAndroidKeyChainCallback.VerifySignature(new AndroidKeyChainByteArray(j, false), new AndroidKeyChainByteArray(j2, false), new AndroidKeyChainByteArray(j3, false));
    }

    public static final native void delete_AndroidKeyChainByteArray(long j);

    public static final native void delete_AndroidKeyChainByteArrayVector(long j);

    public static final native void delete_AndroidKeyChainCertificateInfo(long j);

    public static final native void delete_AndroidKeyChainStringVector(long j);

    public static final native void delete_CertificateFingerprints(long j);

    public static final native void delete_IAndroidKeyChainCallback(long j);

    public static final native long new_AndroidKeyChainByteArray();

    public static final native long new_AndroidKeyChainByteArrayVector__SWIG_0();

    public static final native long new_AndroidKeyChainByteArrayVector__SWIG_1(long j, AndroidKeyChainByteArrayVector androidKeyChainByteArrayVector);

    public static final native long new_AndroidKeyChainByteArrayVector__SWIG_2(int i, long j, AndroidKeyChainByteArray androidKeyChainByteArray);

    public static final native long new_AndroidKeyChainCertificateInfo();

    public static final native long new_AndroidKeyChainStringVector__SWIG_0();

    public static final native long new_AndroidKeyChainStringVector__SWIG_1(long j, AndroidKeyChainStringVector androidKeyChainStringVector);

    public static final native long new_AndroidKeyChainStringVector__SWIG_2(int i, String str);

    public static final native long new_CertificateFingerprints();

    public static final native long new_IAndroidKeyChainCallback();

    private static final native void swig_module_init();
}
