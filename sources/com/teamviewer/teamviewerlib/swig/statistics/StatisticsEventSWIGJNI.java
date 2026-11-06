package com.teamviewer.teamviewerlib.swig.statistics;

/* JADX INFO: loaded from: classes.dex */
public class StatisticsEventSWIGJNI {
    public static final native String StatisticsEvent_getAction(long j, StatisticsEvent statisticsEvent);

    public static final native String StatisticsEvent_getCategory(long j, StatisticsEvent statisticsEvent);

    public static final native int StatisticsEvent_getEventType(long j, StatisticsEvent statisticsEvent);

    public static final native boolean StatisticsEvent_getUserInteraction(long j, StatisticsEvent statisticsEvent);

    public static final native String StatisticsEvent_getValue(long j, StatisticsEvent statisticsEvent);

    public static final native void delete_StatisticsEvent(long j);

    public static final native long new_StatisticsEvent(int i, boolean z, String str, String str2, String str3);
}
