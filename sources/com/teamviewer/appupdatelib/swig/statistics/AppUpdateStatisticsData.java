package com.teamviewer.appupdatelib.swig.statistics;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class AppUpdateStatisticsData {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public AppUpdateStatisticsData() {
        this(IAppUpdateStatisticsSWIGJNI.new_AppUpdateStatisticsData(), true);
    }

    public static long getCPtr(AppUpdateStatisticsData appUpdateStatisticsData) {
        if (appUpdateStatisticsData == null) {
            return 0L;
        }
        return appUpdateStatisticsData.swigCPtr;
    }

    public static long swigRelease(AppUpdateStatisticsData appUpdateStatisticsData) {
        if (appUpdateStatisticsData != null) {
            if (appUpdateStatisticsData.swigCMemOwn) {
                long j = appUpdateStatisticsData.swigCPtr;
                appUpdateStatisticsData.swigCMemOwn = false;
                appUpdateStatisticsData.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IAppUpdateStatisticsSWIGJNI.delete_AppUpdateStatisticsData(j);
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

    public AppUpdateStatisticsAction getAction() {
        return AppUpdateStatisticsAction.swigToEnum(IAppUpdateStatisticsSWIGJNI.AppUpdateStatisticsData_action_get(this.swigCPtr, this));
    }

    public String getErrorReason() {
        return IAppUpdateStatisticsSWIGJNI.AppUpdateStatisticsData_errorReason_get(this.swigCPtr, this);
    }

    public ApkInstallationSource getInstallationSource() {
        return ApkInstallationSource.swigToEnum(IAppUpdateStatisticsSWIGJNI.AppUpdateStatisticsData_installationSource_get(this.swigCPtr, this));
    }

    public boolean getIsStoreBuildWithoutStore() {
        return IAppUpdateStatisticsSWIGJNI.AppUpdateStatisticsData_isStoreBuildWithoutStore_get(this.swigCPtr, this);
    }

    public void setAction(AppUpdateStatisticsAction appUpdateStatisticsAction) {
        IAppUpdateStatisticsSWIGJNI.AppUpdateStatisticsData_action_set(this.swigCPtr, this, appUpdateStatisticsAction.swigValue());
    }

    public void setErrorReason(String str) {
        IAppUpdateStatisticsSWIGJNI.AppUpdateStatisticsData_errorReason_set(this.swigCPtr, this, str);
    }

    public void setInstallationSource(ApkInstallationSource apkInstallationSource) {
        IAppUpdateStatisticsSWIGJNI.AppUpdateStatisticsData_installationSource_set(this.swigCPtr, this, apkInstallationSource.swigValue());
    }

    public void setIsStoreBuildWithoutStore(boolean z) {
        IAppUpdateStatisticsSWIGJNI.AppUpdateStatisticsData_isStoreBuildWithoutStore_set(this.swigCPtr, this, z);
    }

    public AppUpdateStatisticsData(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
