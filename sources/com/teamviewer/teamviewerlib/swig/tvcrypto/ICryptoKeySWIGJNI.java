package com.teamviewer.teamviewerlib.swig.tvcrypto;

/* JADX INFO: loaded from: classes.dex */
public class ICryptoKeySWIGJNI {
    public static final native boolean ICryptoKey_DecryptionKey(long j, ICryptoKey iCryptoKey);

    public static final native long ICryptoKey_ExportEncryptionKey(long j, ICryptoKey iCryptoKey);

    public static final native long ICryptoKey_ExportFullKey(long j, ICryptoKey iCryptoKey);

    public static final native boolean ICryptoKey_IsSymmetricKey(long j, ICryptoKey iCryptoKey);

    public static final native long ICryptoKey_KeySize(long j, ICryptoKey iCryptoKey);

    public static final native int ICryptoKey_KeyType(long j, ICryptoKey iCryptoKey);

    public static final native boolean ICryptoKey_WrappingKey(long j, ICryptoKey iCryptoKey);

    public static final native void delete_ICryptoKey(long j);
}
