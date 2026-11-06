package com.teamviewer.teamviewerlib.swig.tvstream;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public enum KnownStreams {
    UnknownStream(0),
    PrivateStream(1),
    DefaultStream_Misc(2),
    DefaultStream_Screen(3),
    DefaultStream_Audio(4),
    DefaultStream_Video(5),
    DefaultStream_Chat(6),
    DefaultStream_File(7),
    DefaultStream_VPN(8),
    KnownStream_MaxIndex(9);

    private final int swigValue;

    public static class SwigNext {
        private static int next;

        private SwigNext() {
        }
    }

    KnownStreams() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    public static KnownStreams swigToEnum(int i) {
        KnownStreams[] knownStreamsArr = (KnownStreams[]) KnownStreams.class.getEnumConstants();
        if (i < knownStreamsArr.length && i >= 0) {
            KnownStreams knownStreams = knownStreamsArr[i];
            if (knownStreams.swigValue == i) {
                return knownStreams;
            }
        }
        for (KnownStreams knownStreams2 : knownStreamsArr) {
            if (knownStreams2.swigValue == i) {
                return knownStreams2;
            }
        }
        hk0.g(ua5.k(i, KnownStreams.class, "No enum ", " with value "));
        return null;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    KnownStreams(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    KnownStreams(KnownStreams knownStreams) {
        int i = knownStreams.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
