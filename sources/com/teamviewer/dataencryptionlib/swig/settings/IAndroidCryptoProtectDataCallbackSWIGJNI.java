package com.teamviewer.dataencryptionlib.swig.settings;

/* JADX INFO: loaded from: classes.dex */
public class IAndroidCryptoProtectDataCallbackSWIGJNI {
    static {
        swig_module_init();
    }

    public static final native long IAndroidCryptoProtectDataCallback_DecryptData(long j, IAndroidCryptoProtectDataCallback iAndroidCryptoProtectDataCallback, long j2, TByteArrayPtrTupleStruct tByteArrayPtrTupleStruct);

    public static final native long IAndroidCryptoProtectDataCallback_EncryptData(long j, IAndroidCryptoProtectDataCallback iAndroidCryptoProtectDataCallback, long j2, TByteArrayPtrTupleStruct tByteArrayPtrTupleStruct);

    public static final native void IAndroidCryptoProtectDataCallback_change_ownership(IAndroidCryptoProtectDataCallback iAndroidCryptoProtectDataCallback, long j, boolean z);

    public static final native void IAndroidCryptoProtectDataCallback_director_connect(IAndroidCryptoProtectDataCallback iAndroidCryptoProtectDataCallback, long j, boolean z, boolean z2);

    public static long SwigDirector_IAndroidCryptoProtectDataCallback_DecryptData(IAndroidCryptoProtectDataCallback iAndroidCryptoProtectDataCallback, long j) {
        return TByteArrayPtrTupleStruct.getCPtr(iAndroidCryptoProtectDataCallback.DecryptData(new TByteArrayPtrTupleStruct(j, false)));
    }

    public static long SwigDirector_IAndroidCryptoProtectDataCallback_EncryptData(IAndroidCryptoProtectDataCallback iAndroidCryptoProtectDataCallback, long j) {
        return TByteArrayPtrTupleStruct.getCPtr(iAndroidCryptoProtectDataCallback.EncryptData(new TByteArrayPtrTupleStruct(j, false)));
    }

    public static final native byte[] TByteArrayPtrTupleStruct_data_get(long j, TByteArrayPtrTupleStruct tByteArrayPtrTupleStruct);

    public static final native void TByteArrayPtrTupleStruct_data_set(long j, TByteArrayPtrTupleStruct tByteArrayPtrTupleStruct, byte[] bArr);

    public static final native void delete_IAndroidCryptoProtectDataCallback(long j);

    public static final native void delete_TByteArrayPtrTupleStruct(long j);

    public static final native long new_IAndroidCryptoProtectDataCallback();

    public static final native long new_TByteArrayPtrTupleStruct();

    private static final native void swig_module_init();
}
