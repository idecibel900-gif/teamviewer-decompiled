package com.teamviewer.teamviewerlib.swig.tvclientprotobufstatistics;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class TimingEventInfo {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public TimingEventInfo(boolean z, String str, String str2) {
        this(BehavioralStatisticsTypesSWIGJNI.new_TimingEventInfo(z, str, str2), true);
    }

    public static long getCPtr(TimingEventInfo timingEventInfo) {
        if (timingEventInfo == null) {
            return 0L;
        }
        return timingEventInfo.swigCPtr;
    }

    public static long swigRelease(TimingEventInfo timingEventInfo) {
        if (timingEventInfo != null) {
            if (timingEventInfo.swigCMemOwn) {
                long j = timingEventInfo.swigCPtr;
                timingEventInfo.swigCMemOwn = false;
                timingEventInfo.delete();
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
                    BehavioralStatisticsTypesSWIGJNI.delete_TimingEventInfo(j);
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

    public String getM_eventAction() {
        return BehavioralStatisticsTypesSWIGJNI.TimingEventInfo_m_eventAction_get(this.swigCPtr, this);
    }

    public String getM_eventCategory() {
        return BehavioralStatisticsTypesSWIGJNI.TimingEventInfo_m_eventCategory_get(this.swigCPtr, this);
    }

    public boolean getM_userInteraction() {
        return BehavioralStatisticsTypesSWIGJNI.TimingEventInfo_m_userInteraction_get(this.swigCPtr, this);
    }

    public void setM_eventAction(String str) {
        BehavioralStatisticsTypesSWIGJNI.TimingEventInfo_m_eventAction_set(this.swigCPtr, this, str);
    }

    public void setM_eventCategory(String str) {
        BehavioralStatisticsTypesSWIGJNI.TimingEventInfo_m_eventCategory_set(this.swigCPtr, this, str);
    }

    public void setM_userInteraction(boolean z) {
        BehavioralStatisticsTypesSWIGJNI.TimingEventInfo_m_userInteraction_set(this.swigCPtr, this, z);
    }

    public TimingEventInfo(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
