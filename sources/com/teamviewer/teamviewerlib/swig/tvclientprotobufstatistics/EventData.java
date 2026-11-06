package com.teamviewer.teamviewerlib.swig.tvclientprotobufstatistics;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class EventData {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public EventData(EventType eventType, boolean z, String str, String str2, String str3, long j, TKGRelevant tKGRelevant, String str4, long j2, PilotSessionInfo pilotSessionInfo, CampaignInfo campaignInfo, SessionInfo sessionInfo) {
        this(BehavioralStatisticsTypesSWIGJNI.new_EventData__SWIG_0(eventType.swigValue(), z, str, str2, str3, j, tKGRelevant.swigValue(), str4, j2, PilotSessionInfo.getCPtr(pilotSessionInfo), pilotSessionInfo, CampaignInfo.getCPtr(campaignInfo), campaignInfo, SessionInfo.getCPtr(sessionInfo), sessionInfo), true);
    }

    public static long getCPtr(EventData eventData) {
        if (eventData == null) {
            return 0L;
        }
        return eventData.swigCPtr;
    }

    public static long swigRelease(EventData eventData) {
        if (eventData != null) {
            if (eventData.swigCMemOwn) {
                long j = eventData.swigCPtr;
                eventData.swigCMemOwn = false;
                eventData.delete();
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
                    BehavioralStatisticsTypesSWIGJNI.delete_EventData(j);
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

    public String getAction() {
        return BehavioralStatisticsTypesSWIGJNI.EventData_action_get(this.swigCPtr, this);
    }

    public CampaignInfo getCampaignInfo() {
        long jEventData_campaignInfo_get = BehavioralStatisticsTypesSWIGJNI.EventData_campaignInfo_get(this.swigCPtr, this);
        if (jEventData_campaignInfo_get == 0) {
            return null;
        }
        return new CampaignInfo(jEventData_campaignInfo_get, false);
    }

    public String getCategory() {
        return BehavioralStatisticsTypesSWIGJNI.EventData_category_get(this.swigCPtr, this);
    }

    public long getDurationInMs() {
        return BehavioralStatisticsTypesSWIGJNI.EventData_durationInMs_get(this.swigCPtr, this);
    }

    public String getExperimentID() {
        return BehavioralStatisticsTypesSWIGJNI.EventData_experimentID_get(this.swigCPtr, this);
    }

    public long getExperimentVariant() {
        return BehavioralStatisticsTypesSWIGJNI.EventData_experimentVariant_get(this.swigCPtr, this);
    }

    public boolean getIsMobile() {
        return BehavioralStatisticsTypesSWIGJNI.EventData_isMobile_get(this.swigCPtr, this);
    }

    public SWIGTYPE_p_std__chrono__steady_clock__time_point getLocalTimeStamp() {
        return new SWIGTYPE_p_std__chrono__steady_clock__time_point(BehavioralStatisticsTypesSWIGJNI.EventData_localTimeStamp_get(this.swigCPtr, this), true);
    }

    public PilotSessionInfo getPilotSessionInfo() {
        long jEventData_pilotSessionInfo_get = BehavioralStatisticsTypesSWIGJNI.EventData_pilotSessionInfo_get(this.swigCPtr, this);
        if (jEventData_pilotSessionInfo_get == 0) {
            return null;
        }
        return new PilotSessionInfo(jEventData_pilotSessionInfo_get, false);
    }

    public SWIGTYPE_p_boost__optionalT_tvsessionprotocol__TVSessionID_t getSessionID() {
        return new SWIGTYPE_p_boost__optionalT_tvsessionprotocol__TVSessionID_t(BehavioralStatisticsTypesSWIGJNI.EventData_sessionID_get(this.swigCPtr, this), true);
    }

    public SessionInfo getSessionInfo() {
        long jEventData_sessionInfo_get = BehavioralStatisticsTypesSWIGJNI.EventData_sessionInfo_get(this.swigCPtr, this);
        if (jEventData_sessionInfo_get == 0) {
            return null;
        }
        return new SessionInfo(jEventData_sessionInfo_get, false);
    }

    public TKGRelevant getTkgRelevant() {
        return TKGRelevant.swigToEnum(BehavioralStatisticsTypesSWIGJNI.EventData_tkgRelevant_get(this.swigCPtr, this));
    }

    public EventType getType() {
        return EventType.swigToEnum(BehavioralStatisticsTypesSWIGJNI.EventData_type_get(this.swigCPtr, this));
    }

    public boolean getUserInteraction() {
        return BehavioralStatisticsTypesSWIGJNI.EventData_userInteraction_get(this.swigCPtr, this);
    }

    public String getValue() {
        return BehavioralStatisticsTypesSWIGJNI.EventData_value_get(this.swigCPtr, this);
    }

    public void setAction(String str) {
        BehavioralStatisticsTypesSWIGJNI.EventData_action_set(this.swigCPtr, this, str);
    }

    public void setCampaignInfo(CampaignInfo campaignInfo) {
        BehavioralStatisticsTypesSWIGJNI.EventData_campaignInfo_set(this.swigCPtr, this, CampaignInfo.getCPtr(campaignInfo), campaignInfo);
    }

    public void setCategory(String str) {
        BehavioralStatisticsTypesSWIGJNI.EventData_category_set(this.swigCPtr, this, str);
    }

    public void setDurationInMs(long j) {
        BehavioralStatisticsTypesSWIGJNI.EventData_durationInMs_set(this.swigCPtr, this, j);
    }

    public void setExperimentID(String str) {
        BehavioralStatisticsTypesSWIGJNI.EventData_experimentID_set(this.swigCPtr, this, str);
    }

    public void setExperimentVariant(long j) {
        BehavioralStatisticsTypesSWIGJNI.EventData_experimentVariant_set(this.swigCPtr, this, j);
    }

    public void setIsMobile(boolean z) {
        BehavioralStatisticsTypesSWIGJNI.EventData_isMobile_set(this.swigCPtr, this, z);
    }

    public void setLocalTimeStamp(SWIGTYPE_p_std__chrono__steady_clock__time_point sWIGTYPE_p_std__chrono__steady_clock__time_point) {
        BehavioralStatisticsTypesSWIGJNI.EventData_localTimeStamp_set(this.swigCPtr, this, SWIGTYPE_p_std__chrono__steady_clock__time_point.getCPtr(sWIGTYPE_p_std__chrono__steady_clock__time_point));
    }

    public void setPilotSessionInfo(PilotSessionInfo pilotSessionInfo) {
        BehavioralStatisticsTypesSWIGJNI.EventData_pilotSessionInfo_set(this.swigCPtr, this, PilotSessionInfo.getCPtr(pilotSessionInfo), pilotSessionInfo);
    }

    public void setSessionID(SWIGTYPE_p_boost__optionalT_tvsessionprotocol__TVSessionID_t sWIGTYPE_p_boost__optionalT_tvsessionprotocol__TVSessionID_t) {
        BehavioralStatisticsTypesSWIGJNI.EventData_sessionID_set(this.swigCPtr, this, SWIGTYPE_p_boost__optionalT_tvsessionprotocol__TVSessionID_t.getCPtr(sWIGTYPE_p_boost__optionalT_tvsessionprotocol__TVSessionID_t));
    }

    public void setSessionInfo(SessionInfo sessionInfo) {
        BehavioralStatisticsTypesSWIGJNI.EventData_sessionInfo_set(this.swigCPtr, this, SessionInfo.getCPtr(sessionInfo), sessionInfo);
    }

    public void setTkgRelevant(TKGRelevant tKGRelevant) {
        BehavioralStatisticsTypesSWIGJNI.EventData_tkgRelevant_set(this.swigCPtr, this, tKGRelevant.swigValue());
    }

    public void setType(EventType eventType) {
        BehavioralStatisticsTypesSWIGJNI.EventData_type_set(this.swigCPtr, this, eventType.swigValue());
    }

    public void setUserInteraction(boolean z) {
        BehavioralStatisticsTypesSWIGJNI.EventData_userInteraction_set(this.swigCPtr, this, z);
    }

    public void setValue(String str) {
        BehavioralStatisticsTypesSWIGJNI.EventData_value_set(this.swigCPtr, this, str);
    }

    public EventData(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public EventData(EventType eventType, boolean z, String str, String str2, String str3, long j, TKGRelevant tKGRelevant, String str4, long j2, PilotSessionInfo pilotSessionInfo, CampaignInfo campaignInfo) {
        this(BehavioralStatisticsTypesSWIGJNI.new_EventData__SWIG_1(eventType.swigValue(), z, str, str2, str3, j, tKGRelevant.swigValue(), str4, j2, PilotSessionInfo.getCPtr(pilotSessionInfo), pilotSessionInfo, CampaignInfo.getCPtr(campaignInfo), campaignInfo), true);
    }

    public EventData(EventType eventType, boolean z, String str, String str2, String str3, long j, TKGRelevant tKGRelevant, String str4, long j2, PilotSessionInfo pilotSessionInfo) {
        this(BehavioralStatisticsTypesSWIGJNI.new_EventData__SWIG_2(eventType.swigValue(), z, str, str2, str3, j, tKGRelevant.swigValue(), str4, j2, PilotSessionInfo.getCPtr(pilotSessionInfo), pilotSessionInfo), true);
    }

    public EventData(EventType eventType, boolean z, String str, String str2, String str3, long j, TKGRelevant tKGRelevant, String str4, long j2) {
        this(BehavioralStatisticsTypesSWIGJNI.new_EventData__SWIG_3(eventType.swigValue(), z, str, str2, str3, j, tKGRelevant.swigValue(), str4, j2), true);
    }

    public EventData(EventType eventType, boolean z, String str, String str2, String str3, long j, TKGRelevant tKGRelevant, String str4) {
        this(BehavioralStatisticsTypesSWIGJNI.new_EventData__SWIG_4(eventType.swigValue(), z, str, str2, str3, j, tKGRelevant.swigValue(), str4), true);
    }

    public EventData(EventType eventType, boolean z, String str, String str2, String str3, long j, TKGRelevant tKGRelevant) {
        this(BehavioralStatisticsTypesSWIGJNI.new_EventData__SWIG_5(eventType.swigValue(), z, str, str2, str3, j, tKGRelevant.swigValue()), true);
    }
}
