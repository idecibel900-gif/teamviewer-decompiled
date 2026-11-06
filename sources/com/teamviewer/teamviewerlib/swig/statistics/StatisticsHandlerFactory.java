package com.teamviewer.teamviewerlib.swig.statistics;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class StatisticsHandlerFactory {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public StatisticsHandlerFactory(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static IStatisticsHandler GetStatisticsHandler() {
        long jStatisticsHandlerFactory_GetStatisticsHandler = StatisticsHandlerFactorySWIGJNI.StatisticsHandlerFactory_GetStatisticsHandler();
        if (jStatisticsHandlerFactory_GetStatisticsHandler == 0) {
            return null;
        }
        return new IStatisticsHandler(jStatisticsHandlerFactory_GetStatisticsHandler, true);
    }

    public static long getCPtr(StatisticsHandlerFactory statisticsHandlerFactory) {
        if (statisticsHandlerFactory == null) {
            return 0L;
        }
        return statisticsHandlerFactory.swigCPtr;
    }

    public static long swigRelease(StatisticsHandlerFactory statisticsHandlerFactory) {
        if (statisticsHandlerFactory != null) {
            if (statisticsHandlerFactory.swigCMemOwn) {
                long j = statisticsHandlerFactory.swigCPtr;
                statisticsHandlerFactory.swigCMemOwn = false;
                statisticsHandlerFactory.delete();
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
                    StatisticsHandlerFactorySWIGJNI.delete_StatisticsHandlerFactory(j);
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
