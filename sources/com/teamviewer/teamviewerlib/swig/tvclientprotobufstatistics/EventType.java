package com.teamviewer.teamviewerlib.swig.tvclientprotobufstatistics;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public enum EventType {
    Undefined(0),
    View(1),
    Event(2),
    Timing(3);

    private final int swigValue;

    public static class SwigNext {
        private static int next;

        private SwigNext() {
        }
    }

    EventType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    public static EventType swigToEnum(int i) {
        EventType[] eventTypeArr = (EventType[]) EventType.class.getEnumConstants();
        if (i < eventTypeArr.length && i >= 0) {
            EventType eventType = eventTypeArr[i];
            if (eventType.swigValue == i) {
                return eventType;
            }
        }
        for (EventType eventType2 : eventTypeArr) {
            if (eventType2.swigValue == i) {
                return eventType2;
            }
        }
        hk0.g(ua5.k(i, EventType.class, "No enum ", " with value "));
        return null;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    EventType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    EventType(EventType eventType) {
        int i = eventType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
