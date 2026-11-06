package com.teamviewer.appupdatelib.swig.statistics;

/* JADX INFO: loaded from: classes.dex */
public class IAppUpdateStatisticsSWIGJNI {
    public static final native int AppUpdateStatisticsData_action_get(long j, AppUpdateStatisticsData appUpdateStatisticsData);

    public static final native void AppUpdateStatisticsData_action_set(long j, AppUpdateStatisticsData appUpdateStatisticsData, int i);

    public static final native String AppUpdateStatisticsData_errorReason_get(long j, AppUpdateStatisticsData appUpdateStatisticsData);

    public static final native void AppUpdateStatisticsData_errorReason_set(long j, AppUpdateStatisticsData appUpdateStatisticsData, String str);

    public static final native int AppUpdateStatisticsData_installationSource_get(long j, AppUpdateStatisticsData appUpdateStatisticsData);

    public static final native void AppUpdateStatisticsData_installationSource_set(long j, AppUpdateStatisticsData appUpdateStatisticsData, int i);

    public static final native boolean AppUpdateStatisticsData_isStoreBuildWithoutStore_get(long j, AppUpdateStatisticsData appUpdateStatisticsData);

    public static final native void AppUpdateStatisticsData_isStoreBuildWithoutStore_set(long j, AppUpdateStatisticsData appUpdateStatisticsData, boolean z);

    public static final native void IAppUpdateStatistics_ReportEvent(long j, IAppUpdateStatistics iAppUpdateStatistics, long j2, AppUpdateStatisticsData appUpdateStatisticsData);

    public static final native void delete_AppUpdateStatisticsData(long j);

    public static final native void delete_IAppUpdateStatistics(long j);

    public static final native long new_AppUpdateStatisticsData();
}
