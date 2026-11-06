package com.teamviewer.teamviewerlib.swig.tvclientprotobufstatistics;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public enum PilotSessionType {
    Unknown(0),
    ARCore(1),
    ARKit(2),
    NoAR(3);

    private final int swigValue;

    public static class SwigNext {
        private static int next;

        private SwigNext() {
        }
    }

    PilotSessionType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    public static PilotSessionType swigToEnum(int i) {
        PilotSessionType[] pilotSessionTypeArr = (PilotSessionType[]) PilotSessionType.class.getEnumConstants();
        if (i < pilotSessionTypeArr.length && i >= 0) {
            PilotSessionType pilotSessionType = pilotSessionTypeArr[i];
            if (pilotSessionType.swigValue == i) {
                return pilotSessionType;
            }
        }
        for (PilotSessionType pilotSessionType2 : pilotSessionTypeArr) {
            if (pilotSessionType2.swigValue == i) {
                return pilotSessionType2;
            }
        }
        hk0.g(ua5.k(i, PilotSessionType.class, "No enum ", " with value "));
        return null;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    PilotSessionType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    PilotSessionType(PilotSessionType pilotSessionType) {
        int i = pilotSessionType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
