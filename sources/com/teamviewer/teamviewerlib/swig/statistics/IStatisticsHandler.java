package com.teamviewer.teamviewerlib.swig.statistics;

/* JADX INFO: loaded from: classes.dex */
public class IStatisticsHandler {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IStatisticsHandler(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IStatisticsHandler iStatisticsHandler) {
        if (iStatisticsHandler == null) {
            return 0L;
        }
        return iStatisticsHandler.swigCPtr;
    }

    public void ReportEvent(StatisticsEvent statisticsEvent) {
        IStatisticsHandlerSWIGJNI.IStatisticsHandler_ReportEvent(this.swigCPtr, this, StatisticsEvent.getCPtr(statisticsEvent), statisticsEvent);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IStatisticsHandlerSWIGJNI.delete_IStatisticsHandler(j);
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
