package com.teamviewer.teamviewerlib.swig.tvclientprotobufstatistics;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public enum TKGRelevant {
    No(0),
    Yes(1);

    private final int swigValue;

    public static class SwigNext {
        private static int next;

        private SwigNext() {
        }
    }

    TKGRelevant() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    public static TKGRelevant swigToEnum(int i) {
        TKGRelevant[] tKGRelevantArr = (TKGRelevant[]) TKGRelevant.class.getEnumConstants();
        if (i < tKGRelevantArr.length && i >= 0) {
            TKGRelevant tKGRelevant = tKGRelevantArr[i];
            if (tKGRelevant.swigValue == i) {
                return tKGRelevant;
            }
        }
        for (TKGRelevant tKGRelevant2 : tKGRelevantArr) {
            if (tKGRelevant2.swigValue == i) {
                return tKGRelevant2;
            }
        }
        hk0.g(ua5.k(i, TKGRelevant.class, "No enum ", " with value "));
        return null;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    TKGRelevant(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    TKGRelevant(TKGRelevant tKGRelevant) {
        int i = tKGRelevant.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
