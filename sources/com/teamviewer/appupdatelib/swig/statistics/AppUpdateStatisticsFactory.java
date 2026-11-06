package com.teamviewer.appupdatelib.swig.statistics;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class AppUpdateStatisticsFactory {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public AppUpdateStatisticsFactory(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static IAppUpdateStatistics GetAppUpdateStatistics() {
        long jAppUpdateStatisticsFactory_GetAppUpdateStatistics = AppUpdateStatisticsFactorySWIGJNI.AppUpdateStatisticsFactory_GetAppUpdateStatistics();
        if (jAppUpdateStatisticsFactory_GetAppUpdateStatistics == 0) {
            return null;
        }
        return new IAppUpdateStatistics(jAppUpdateStatisticsFactory_GetAppUpdateStatistics, true);
    }

    public static long getCPtr(AppUpdateStatisticsFactory appUpdateStatisticsFactory) {
        if (appUpdateStatisticsFactory == null) {
            return 0L;
        }
        return appUpdateStatisticsFactory.swigCPtr;
    }

    public static long swigRelease(AppUpdateStatisticsFactory appUpdateStatisticsFactory) {
        if (appUpdateStatisticsFactory != null) {
            if (appUpdateStatisticsFactory.swigCMemOwn) {
                long j = appUpdateStatisticsFactory.swigCPtr;
                appUpdateStatisticsFactory.swigCMemOwn = false;
                appUpdateStatisticsFactory.delete();
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
                    AppUpdateStatisticsFactorySWIGJNI.delete_AppUpdateStatisticsFactory(j);
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
}
