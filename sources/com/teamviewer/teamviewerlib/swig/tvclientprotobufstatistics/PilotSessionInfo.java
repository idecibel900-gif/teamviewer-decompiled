package com.teamviewer.teamviewerlib.swig.tvclientprotobufstatistics;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class PilotSessionInfo {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public PilotSessionInfo(PilotSessionType pilotSessionType, PilotSessionRole pilotSessionRole) {
        this(BehavioralStatisticsPilotTypesSWIGJNI.new_PilotSessionInfo__SWIG_0(pilotSessionType.swigValue(), pilotSessionRole.swigValue()), true);
    }

    public static long getCPtr(PilotSessionInfo pilotSessionInfo) {
        if (pilotSessionInfo == null) {
            return 0L;
        }
        return pilotSessionInfo.swigCPtr;
    }

    public static long swigRelease(PilotSessionInfo pilotSessionInfo) {
        if (pilotSessionInfo != null) {
            if (pilotSessionInfo.swigCMemOwn) {
                long j = pilotSessionInfo.swigCPtr;
                pilotSessionInfo.swigCMemOwn = false;
                pilotSessionInfo.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public boolean Equal(PilotSessionInfo pilotSessionInfo) {
        return BehavioralStatisticsPilotTypesSWIGJNI.PilotSessionInfo_Equal(this.swigCPtr, this, getCPtr(pilotSessionInfo), pilotSessionInfo);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    BehavioralStatisticsPilotTypesSWIGJNI.delete_PilotSessionInfo(j);
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

    public PilotSessionRole getRole() {
        return PilotSessionRole.swigToEnum(BehavioralStatisticsPilotTypesSWIGJNI.PilotSessionInfo_role_get(this.swigCPtr, this));
    }

    public PilotSessionType getSessionType() {
        return PilotSessionType.swigToEnum(BehavioralStatisticsPilotTypesSWIGJNI.PilotSessionInfo_sessionType_get(this.swigCPtr, this));
    }

    public void setRole(PilotSessionRole pilotSessionRole) {
        BehavioralStatisticsPilotTypesSWIGJNI.PilotSessionInfo_role_set(this.swigCPtr, this, pilotSessionRole.swigValue());
    }

    public void setSessionType(PilotSessionType pilotSessionType) {
        BehavioralStatisticsPilotTypesSWIGJNI.PilotSessionInfo_sessionType_set(this.swigCPtr, this, pilotSessionType.swigValue());
    }

    public PilotSessionInfo(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public PilotSessionInfo() {
        this(BehavioralStatisticsPilotTypesSWIGJNI.new_PilotSessionInfo__SWIG_1(), true);
    }
}
