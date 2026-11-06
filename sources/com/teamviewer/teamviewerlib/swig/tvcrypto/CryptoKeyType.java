package com.teamviewer.teamviewerlib.swig.tvcrypto;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public enum CryptoKeyType {
    CKEY_UNDEFINED(0),
    CKEY_RSA(1),
    CKEY_AES(2),
    CKEY_PASSWORD(3),
    CKEY_LEGACY(4),
    CKEY_MASTER(5),
    CKEY_TOKEN(6),
    CKEY_MAC(7),
    CKEY_AES_CIPHERMODE(8),
    CKEY_CHACHA20POLY1305(9);

    private final int swigValue;

    public static class SwigNext {
        private static int next;

        private SwigNext() {
        }
    }

    CryptoKeyType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    public static CryptoKeyType swigToEnum(int i) {
        CryptoKeyType[] cryptoKeyTypeArr = (CryptoKeyType[]) CryptoKeyType.class.getEnumConstants();
        if (i < cryptoKeyTypeArr.length && i >= 0) {
            CryptoKeyType cryptoKeyType = cryptoKeyTypeArr[i];
            if (cryptoKeyType.swigValue == i) {
                return cryptoKeyType;
            }
        }
        for (CryptoKeyType cryptoKeyType2 : cryptoKeyTypeArr) {
            if (cryptoKeyType2.swigValue == i) {
                return cryptoKeyType2;
            }
        }
        hk0.g(ua5.k(i, CryptoKeyType.class, "No enum ", " with value "));
        return null;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    CryptoKeyType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    CryptoKeyType(CryptoKeyType cryptoKeyType) {
        int i = cryptoKeyType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
