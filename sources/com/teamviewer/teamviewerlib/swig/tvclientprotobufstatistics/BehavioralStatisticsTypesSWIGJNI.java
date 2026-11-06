package com.teamviewer.teamviewerlib.swig.tvclientprotobufstatistics;

/* JADX INFO: loaded from: classes.dex */
public class BehavioralStatisticsTypesSWIGJNI {
    public static final native boolean CampaignInfo_Equal(long j, CampaignInfo campaignInfo, long j2, CampaignInfo campaignInfo2);

    public static final native String CampaignInfo_campaignContent_get(long j, CampaignInfo campaignInfo);

    public static final native void CampaignInfo_campaignContent_set(long j, CampaignInfo campaignInfo, String str);

    public static final native String CampaignInfo_campaignID_get(long j, CampaignInfo campaignInfo);

    public static final native void CampaignInfo_campaignID_set(long j, CampaignInfo campaignInfo, String str);

    public static final native String CampaignInfo_campaignMedium_get(long j, CampaignInfo campaignInfo);

    public static final native void CampaignInfo_campaignMedium_set(long j, CampaignInfo campaignInfo, String str);

    public static final native String CampaignInfo_campaignSource_get(long j, CampaignInfo campaignInfo);

    public static final native void CampaignInfo_campaignSource_set(long j, CampaignInfo campaignInfo, String str);

    public static final native String CampaignInfo_campaignTerm_get(long j, CampaignInfo campaignInfo);

    public static final native void CampaignInfo_campaignTerm_set(long j, CampaignInfo campaignInfo, String str);

    public static final native String EventData_action_get(long j, EventData eventData);

    public static final native void EventData_action_set(long j, EventData eventData, String str);

    public static final native long EventData_campaignInfo_get(long j, EventData eventData);

    public static final native void EventData_campaignInfo_set(long j, EventData eventData, long j2, CampaignInfo campaignInfo);

    public static final native String EventData_category_get(long j, EventData eventData);

    public static final native void EventData_category_set(long j, EventData eventData, String str);

    public static final native long EventData_durationInMs_get(long j, EventData eventData);

    public static final native void EventData_durationInMs_set(long j, EventData eventData, long j2);

    public static final native String EventData_experimentID_get(long j, EventData eventData);

    public static final native void EventData_experimentID_set(long j, EventData eventData, String str);

    public static final native long EventData_experimentVariant_get(long j, EventData eventData);

    public static final native void EventData_experimentVariant_set(long j, EventData eventData, long j2);

    public static final native boolean EventData_isMobile_get(long j, EventData eventData);

    public static final native void EventData_isMobile_set(long j, EventData eventData, boolean z);

    public static final native long EventData_localTimeStamp_get(long j, EventData eventData);

    public static final native void EventData_localTimeStamp_set(long j, EventData eventData, long j2);

    public static final native long EventData_pilotSessionInfo_get(long j, EventData eventData);

    public static final native void EventData_pilotSessionInfo_set(long j, EventData eventData, long j2, PilotSessionInfo pilotSessionInfo);

    public static final native long EventData_sessionID_get(long j, EventData eventData);

    public static final native void EventData_sessionID_set(long j, EventData eventData, long j2);

    public static final native long EventData_sessionInfo_get(long j, EventData eventData);

    public static final native void EventData_sessionInfo_set(long j, EventData eventData, long j2, SessionInfo sessionInfo);

    public static final native int EventData_tkgRelevant_get(long j, EventData eventData);

    public static final native void EventData_tkgRelevant_set(long j, EventData eventData, int i);

    public static final native int EventData_type_get(long j, EventData eventData);

    public static final native void EventData_type_set(long j, EventData eventData, int i);

    public static final native boolean EventData_userInteraction_get(long j, EventData eventData);

    public static final native void EventData_userInteraction_set(long j, EventData eventData, boolean z);

    public static final native String EventData_value_get(long j, EventData eventData);

    public static final native void EventData_value_set(long j, EventData eventData, String str);

    public static final native boolean SessionInfo_Equal(long j, SessionInfo sessionInfo, long j2, SessionInfo sessionInfo2);

    public static final native long SessionInfo_passiveDyngateID_get(long j, SessionInfo sessionInfo);

    public static final native void SessionInfo_passiveDyngateID_set(long j, SessionInfo sessionInfo, long j2);

    public static final native long SessionInfo_sessionID_get(long j, SessionInfo sessionInfo);

    public static final native void SessionInfo_sessionID_set(long j, SessionInfo sessionInfo, long j2);

    public static final native String TimingEventInfo_m_eventAction_get(long j, TimingEventInfo timingEventInfo);

    public static final native void TimingEventInfo_m_eventAction_set(long j, TimingEventInfo timingEventInfo, String str);

    public static final native String TimingEventInfo_m_eventCategory_get(long j, TimingEventInfo timingEventInfo);

    public static final native void TimingEventInfo_m_eventCategory_set(long j, TimingEventInfo timingEventInfo, String str);

    public static final native boolean TimingEventInfo_m_userInteraction_get(long j, TimingEventInfo timingEventInfo);

    public static final native void TimingEventInfo_m_userInteraction_set(long j, TimingEventInfo timingEventInfo, boolean z);

    public static final native void delete_CampaignInfo(long j);

    public static final native void delete_EventData(long j);

    public static final native void delete_SessionInfo(long j);

    public static final native void delete_TimingEventInfo(long j);

    public static final native long new_CampaignInfo__SWIG_0(String str, String str2, String str3, String str4, String str5);

    public static final native long new_CampaignInfo__SWIG_1();

    public static final native long new_EventData__SWIG_0(int i, boolean z, String str, String str2, String str3, long j, int i2, String str4, long j2, long j3, PilotSessionInfo pilotSessionInfo, long j4, CampaignInfo campaignInfo, long j5, SessionInfo sessionInfo);

    public static final native long new_EventData__SWIG_1(int i, boolean z, String str, String str2, String str3, long j, int i2, String str4, long j2, long j3, PilotSessionInfo pilotSessionInfo, long j4, CampaignInfo campaignInfo);

    public static final native long new_EventData__SWIG_2(int i, boolean z, String str, String str2, String str3, long j, int i2, String str4, long j2, long j3, PilotSessionInfo pilotSessionInfo);

    public static final native long new_EventData__SWIG_3(int i, boolean z, String str, String str2, String str3, long j, int i2, String str4, long j2);

    public static final native long new_EventData__SWIG_4(int i, boolean z, String str, String str2, String str3, long j, int i2, String str4);

    public static final native long new_EventData__SWIG_5(int i, boolean z, String str, String str2, String str3, long j, int i2);

    public static final native long new_SessionInfo__SWIG_0(long j, long j2);

    public static final native long new_SessionInfo__SWIG_1();

    public static final native long new_TimingEventInfo(boolean z, String str, String str2);
}
