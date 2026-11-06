package com.teamviewer.teamviewerlib.swig.tvmodularsessiontypes;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public enum EnforceLevelMS {
    NotEnforced(1),
    Preferred(2),
    Enforced(3);

    private final int swigValue;

    public static class SwigNext {
        private static int next;

        private SwigNext() {
        }
    }

    EnforceLevelMS() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    public static EnforceLevelMS swigToEnum(int i) {
        EnforceLevelMS[] enforceLevelMSArr = (EnforceLevelMS[]) EnforceLevelMS.class.getEnumConstants();
        if (i < enforceLevelMSArr.length && i >= 0) {
            EnforceLevelMS enforceLevelMS = enforceLevelMSArr[i];
            if (enforceLevelMS.swigValue == i) {
                return enforceLevelMS;
            }
        }
        for (EnforceLevelMS enforceLevelMS2 : enforceLevelMSArr) {
            if (enforceLevelMS2.swigValue == i) {
                return enforceLevelMS2;
            }
        }
        hk0.g(ua5.k(i, EnforceLevelMS.class, "No enum ", " with value "));
        return null;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    EnforceLevelMS(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    EnforceLevelMS(EnforceLevelMS enforceLevelMS) {
        int i = enforceLevelMS.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
