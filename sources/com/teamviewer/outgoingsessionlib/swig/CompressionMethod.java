package com.teamviewer.outgoingsessionlib.swig;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public enum CompressionMethod {
    Undefined(0),
    None(1),
    ZLibLevel9(2),
    ZLibLevel6(3),
    ZLibLevel3(4),
    ZLibLevel3RLE(5),
    ZLibLevel1(6),
    ZLibLevel1RLE(7),
    ZLibLevel0(8),
    LZ4_dont_use(9),
    LZ4(10),
    LzmaGood(11),
    LzmaFast(12),
    GZip(13);

    private final int swigValue;

    public static class SwigNext {
        private static int next;

        private SwigNext() {
        }
    }

    CompressionMethod() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    public static CompressionMethod swigToEnum(int i) {
        CompressionMethod[] compressionMethodArr = (CompressionMethod[]) CompressionMethod.class.getEnumConstants();
        if (i < compressionMethodArr.length && i >= 0) {
            CompressionMethod compressionMethod = compressionMethodArr[i];
            if (compressionMethod.swigValue == i) {
                return compressionMethod;
            }
        }
        for (CompressionMethod compressionMethod2 : compressionMethodArr) {
            if (compressionMethod2.swigValue == i) {
                return compressionMethod2;
            }
        }
        hk0.g(ua5.k(i, CompressionMethod.class, "No enum ", " with value "));
        return null;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    CompressionMethod(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    CompressionMethod(CompressionMethod compressionMethod) {
        int i = compressionMethod.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
