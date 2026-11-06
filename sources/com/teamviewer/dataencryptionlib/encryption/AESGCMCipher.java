package com.teamviewer.dataencryptionlib.encryption;

import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.Metadata;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/teamviewer/dataencryptionlib/encryption/AESGCMCipher;", "", "<init>", "()V", "TAG", "", "ANDROID_KEYSTORE", "KEY_ALIAS", "ALGORITHM", "MODE", "PADDING", "TRANSFORMATION", "IV_AES_GCM_SIZE", "", "AUTHENTICATION_TAG_SIZE", "encrypt", "", "data", "decrypt", "inputData", "getKey", "Ljava/security/Key;", "createKey", "DataEncryptionLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AESGCMCipher {
    private static final String ALGORITHM = "AES";
    private static final String ANDROID_KEYSTORE = "AndroidKeyStore";
    private static final int AUTHENTICATION_TAG_SIZE = 128;
    public static final AESGCMCipher INSTANCE = new AESGCMCipher();
    private static final int IV_AES_GCM_SIZE = 12;
    private static final String KEY_ALIAS = "SettingsKeyAESGCM";
    private static final String MODE = "GCM";
    private static final String PADDING = "NoPadding";
    private static final String TAG = "AESGCMCipher";
    private static final String TRANSFORMATION = "AES/GCM/NoPadding";

    private AESGCMCipher() {
    }

    private final Key createKey() throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(ALGORITHM, ANDROID_KEYSTORE);
        keyGenerator.getClass();
        keyGenerator.init(new KeyGenParameterSpec.Builder(KEY_ALIAS, 3).setBlockModes(MODE).setEncryptionPaddings(PADDING).build());
        return keyGenerator.generateKey();
    }

    private final Key getKey() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        KeyStore keyStore = KeyStore.getInstance(ANDROID_KEYSTORE);
        keyStore.load(null);
        return keyStore.getEntry(KEY_ALIAS, null) != null ? keyStore.getKey(KEY_ALIAS, null) : createKey();
    }

    public final byte[] decrypt(byte[] inputData) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, KeyStoreException, CertificateException, InvalidAlgorithmParameterException {
        inputData.getClass();
        Key key = getKey();
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        int length = inputData.length;
        if (length <= 12) {
            ye4.c(TAG, "Invalid input, size smaller than expected");
            return new byte[0];
        }
        byte[] bArr = new byte[12];
        int i = length - 12;
        byte[] bArr2 = new byte[i];
        System.arraycopy(inputData, 0, bArr, 0, 12);
        System.arraycopy(inputData, 12, bArr2, 0, i);
        cipher.init(2, key, new GCMParameterSpec(AUTHENTICATION_TAG_SIZE, bArr));
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        bArrDoFinal.getClass();
        return bArrDoFinal;
    }

    public final byte[] encrypt(byte[] data) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, KeyStoreException, CertificateException {
        data.getClass();
        Key key = getKey();
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(1, key);
        byte[] bArrDoFinal = cipher.doFinal(data);
        byte[] iv = cipher.getIV();
        iv.getClass();
        bArrDoFinal.getClass();
        int length = iv.length;
        int length2 = bArrDoFinal.length;
        byte[] bArrCopyOf = Arrays.copyOf(iv, length + length2);
        System.arraycopy(bArrDoFinal, 0, bArrCopyOf, length, length2);
        return bArrCopyOf;
    }
}
