package com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public enum ParticipantColor {
    Undefined(0),
    PilotServer(1),
    PilotClient(2),
    Blue(3),
    Red(4),
    Purple(5),
    Orange(6),
    Green(7),
    Turquoise(8),
    PilotGuest1(9),
    PilotGuest2(10),
    PilotGuest3(11),
    PilotGuest4(12),
    PilotGuest5(13),
    LastValue(PilotGuest5);

    private final int swigValue;

    public static class SwigNext {
        private static int next;

        private SwigNext() {
        }
    }

    ParticipantColor() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    public static ParticipantColor swigToEnum(int i) {
        ParticipantColor[] participantColorArr = (ParticipantColor[]) ParticipantColor.class.getEnumConstants();
        if (i < participantColorArr.length && i >= 0) {
            ParticipantColor participantColor = participantColorArr[i];
            if (participantColor.swigValue == i) {
                return participantColor;
            }
        }
        for (ParticipantColor participantColor2 : participantColorArr) {
            if (participantColor2.swigValue == i) {
                return participantColor2;
            }
        }
        hk0.g(ua5.k(i, ParticipantColor.class, "No enum ", " with value "));
        return null;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    ParticipantColor(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    ParticipantColor(ParticipantColor participantColor) {
        int i = participantColor.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
