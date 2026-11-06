package com.teamviewer.appupdatelib.swig.statistics;

/* JADX INFO: loaded from: classes.dex */
public class IAppUpdateStatistics {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IAppUpdateStatistics(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IAppUpdateStatistics iAppUpdateStatistics) {
        if (iAppUpdateStatistics == null) {
            return 0L;
        }
        return iAppUpdateStatistics.swigCPtr;
    }

    public void ReportEvent(AppUpdateStatisticsData appUpdateStatisticsData) {
        IAppUpdateStatisticsSWIGJNI.IAppUpdateStatistics_ReportEvent(this.swigCPtr, this, AppUpdateStatisticsData.getCPtr(appUpdateStatisticsData), appUpdateStatisticsData);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IAppUpdateStatisticsSWIGJNI.delete_IAppUpdateStatistics(j);
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

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }
}
