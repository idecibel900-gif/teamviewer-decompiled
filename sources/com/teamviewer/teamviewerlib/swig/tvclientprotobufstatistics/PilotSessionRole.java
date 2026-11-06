package com.teamviewer.teamviewerlib.swig.tvclientprotobufstatistics;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public enum PilotSessionRole {
    Undefined(0),
    Presenter(1),
    Expert(2),
    Viewer(3),
    GuestSupporter(4);

    private final int swigValue;

    public static class SwigNext {
        private static int next;

        private SwigNext() {
        }
    }

    PilotSessionRole() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    public static PilotSessionRole swigToEnum(int i) {
        PilotSessionRole[] pilotSessionRoleArr = (PilotSessionRole[]) PilotSessionRole.class.getEnumConstants();
        if (i < pilotSessionRoleArr.length && i >= 0) {
            PilotSessionRole pilotSessionRole = pilotSessionRoleArr[i];
            if (pilotSessionRole.swigValue == i) {
                return pilotSessionRole;
            }
        }
        for (PilotSessionRole pilotSessionRole2 : pilotSessionRoleArr) {
            if (pilotSessionRole2.swigValue == i) {
                return pilotSessionRole2;
            }
        }
        hk0.g(ua5.k(i, PilotSessionRole.class, "No enum ", " with value "));
        return null;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    PilotSessionRole(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    PilotSessionRole(PilotSessionRole pilotSessionRole) {
        int i = pilotSessionRole.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
