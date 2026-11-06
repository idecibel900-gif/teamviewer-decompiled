package com.teamviewer.teamviewerlib.swig.tvmodularsessiontypes;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public enum PilotMSTypeFlags {
    None(0),
    Default(1),
    LastValue(Default);

    private final int swigValue;

    public static class SwigNext {
        private static int next;

        private SwigNext() {
        }
    }

    PilotMSTypeFlags() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    public static PilotMSTypeFlags swigToEnum(int i) {
        PilotMSTypeFlags[] pilotMSTypeFlagsArr = (PilotMSTypeFlags[]) PilotMSTypeFlags.class.getEnumConstants();
        if (i < pilotMSTypeFlagsArr.length && i >= 0) {
            PilotMSTypeFlags pilotMSTypeFlags = pilotMSTypeFlagsArr[i];
            if (pilotMSTypeFlags.swigValue == i) {
                return pilotMSTypeFlags;
            }
        }
        for (PilotMSTypeFlags pilotMSTypeFlags2 : pilotMSTypeFlagsArr) {
            if (pilotMSTypeFlags2.swigValue == i) {
                return pilotMSTypeFlags2;
            }
        }
        hk0.g(ua5.k(i, PilotMSTypeFlags.class, "No enum ", " with value "));
        return null;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    PilotMSTypeFlags(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    PilotMSTypeFlags(PilotMSTypeFlags pilotMSTypeFlags) {
        int i = pilotMSTypeFlags.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
