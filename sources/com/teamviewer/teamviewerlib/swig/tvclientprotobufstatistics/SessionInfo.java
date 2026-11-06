package com.teamviewer.teamviewerlib.swig.tvclientprotobufstatistics;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class SessionInfo {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public SessionInfo(long j, SWIGTYPE_p_tvdyngateid__DyngateID sWIGTYPE_p_tvdyngateid__DyngateID) {
        this(BehavioralStatisticsTypesSWIGJNI.new_SessionInfo__SWIG_0(j, SWIGTYPE_p_tvdyngateid__DyngateID.getCPtr(sWIGTYPE_p_tvdyngateid__DyngateID)), true);
    }

    public static long getCPtr(SessionInfo sessionInfo) {
        if (sessionInfo == null) {
            return 0L;
        }
        return sessionInfo.swigCPtr;
    }

    public static long swigRelease(SessionInfo sessionInfo) {
        if (sessionInfo != null) {
            if (sessionInfo.swigCMemOwn) {
                long j = sessionInfo.swigCPtr;
                sessionInfo.swigCMemOwn = false;
                sessionInfo.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public boolean Equal(SessionInfo sessionInfo) {
        return BehavioralStatisticsTypesSWIGJNI.SessionInfo_Equal(this.swigCPtr, this, getCPtr(sessionInfo), sessionInfo);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    BehavioralStatisticsTypesSWIGJNI.delete_SessionInfo(j);
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

    public SWIGTYPE_p_tvdyngateid__DyngateID getPassiveDyngateID() {
        return new SWIGTYPE_p_tvdyngateid__DyngateID(BehavioralStatisticsTypesSWIGJNI.SessionInfo_passiveDyngateID_get(this.swigCPtr, this), true);
    }

    public long getSessionID() {
        return BehavioralStatisticsTypesSWIGJNI.SessionInfo_sessionID_get(this.swigCPtr, this);
    }

    public void setPassiveDyngateID(SWIGTYPE_p_tvdyngateid__DyngateID sWIGTYPE_p_tvdyngateid__DyngateID) {
        BehavioralStatisticsTypesSWIGJNI.SessionInfo_passiveDyngateID_set(this.swigCPtr, this, SWIGTYPE_p_tvdyngateid__DyngateID.getCPtr(sWIGTYPE_p_tvdyngateid__DyngateID));
    }

    public void setSessionID(long j) {
        BehavioralStatisticsTypesSWIGJNI.SessionInfo_sessionID_set(this.swigCPtr, this, j);
    }

    public SessionInfo(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public SessionInfo() {
        this(BehavioralStatisticsTypesSWIGJNI.new_SessionInfo__SWIG_1(), true);
    }
}
