package com.teamviewer.teamviewerlib.swig.statistics;

import com.teamviewer.teamviewerlib.swig.tvclientprotobufstatistics.EventType;

/* JADX INFO: loaded from: classes.dex */
public class StatisticsEvent {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public StatisticsEvent(EventType eventType, boolean z, String str, String str2, String str3) {
        this(StatisticsEventSWIGJNI.new_StatisticsEvent(eventType.swigValue(), z, str, str2, str3), true);
    }

    public static long getCPtr(StatisticsEvent statisticsEvent) {
        if (statisticsEvent == null) {
            return 0L;
        }
        return statisticsEvent.swigCPtr;
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    StatisticsEventSWIGJNI.delete_StatisticsEvent(j);
                }
                this.swigCPtr = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void finalize() {
        delete();
    }

    public String getAction() {
        return StatisticsEventSWIGJNI.StatisticsEvent_getAction(this.swigCPtr, this);
    }

    public String getCategory() {
        return StatisticsEventSWIGJNI.StatisticsEvent_getCategory(this.swigCPtr, this);
    }

    public EventType getEventType() {
        return EventType.swigToEnum(StatisticsEventSWIGJNI.StatisticsEvent_getEventType(this.swigCPtr, this));
    }

    public boolean getUserInteraction() {
        return StatisticsEventSWIGJNI.StatisticsEvent_getUserInteraction(this.swigCPtr, this);
    }

    public String getValue() {
        return StatisticsEventSWIGJNI.StatisticsEvent_getValue(this.swigCPtr, this);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public StatisticsEvent(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
