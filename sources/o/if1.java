package o;

import com.teamviewer.dataencryptionlib.encryption.AESGCMCipher;
import com.teamviewer.dataencryptionlib.swig.settings.IAndroidCryptoProtectDataCallback;
import com.teamviewer.dataencryptionlib.swig.settings.TByteArrayPtrTupleStruct;

/* JADX INFO: loaded from: classes.dex */
public final class if1 extends IAndroidCryptoProtectDataCallback {
    public static final if1 a = new if1();

    @Override // com.teamviewer.dataencryptionlib.swig.settings.IAndroidCryptoProtectDataCallback
    public final TByteArrayPtrTupleStruct DecryptData(TByteArrayPtrTupleStruct tByteArrayPtrTupleStruct) {
        byte[] data;
        TByteArrayPtrTupleStruct tByteArrayPtrTupleStruct2 = new TByteArrayPtrTupleStruct();
        if (tByteArrayPtrTupleStruct != null && (data = tByteArrayPtrTupleStruct.getData()) != null) {
            tByteArrayPtrTupleStruct2.setData(AESGCMCipher.INSTANCE.decrypt(data));
        }
        return tByteArrayPtrTupleStruct2;
    }

    @Override // com.teamviewer.dataencryptionlib.swig.settings.IAndroidCryptoProtectDataCallback
    public final TByteArrayPtrTupleStruct EncryptData(TByteArrayPtrTupleStruct tByteArrayPtrTupleStruct) {
        byte[] data;
        TByteArrayPtrTupleStruct tByteArrayPtrTupleStruct2 = new TByteArrayPtrTupleStruct();
        if (tByteArrayPtrTupleStruct != null && (data = tByteArrayPtrTupleStruct.getData()) != null) {
            tByteArrayPtrTupleStruct2.setData(AESGCMCipher.INSTANCE.encrypt(data));
        }
        return tByteArrayPtrTupleStruct2;
    }
}
