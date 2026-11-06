package com.teamviewer.teamviewerlib.swig.tvclientprotobufstatistics;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class CampaignInfo {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public CampaignInfo(String str, String str2, String str3, String str4, String str5) {
        this(BehavioralStatisticsTypesSWIGJNI.new_CampaignInfo__SWIG_0(str, str2, str3, str4, str5), true);
    }

    public static long getCPtr(CampaignInfo campaignInfo) {
        if (campaignInfo == null) {
            return 0L;
        }
        return campaignInfo.swigCPtr;
    }

    public static long swigRelease(CampaignInfo campaignInfo) {
        if (campaignInfo != null) {
            if (campaignInfo.swigCMemOwn) {
                long j = campaignInfo.swigCPtr;
                campaignInfo.swigCMemOwn = false;
                campaignInfo.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public boolean Equal(CampaignInfo campaignInfo) {
        return BehavioralStatisticsTypesSWIGJNI.CampaignInfo_Equal(this.swigCPtr, this, getCPtr(campaignInfo), campaignInfo);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    BehavioralStatisticsTypesSWIGJNI.delete_CampaignInfo(j);
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

    public String getCampaignContent() {
        return BehavioralStatisticsTypesSWIGJNI.CampaignInfo_campaignContent_get(this.swigCPtr, this);
    }

    public String getCampaignID() {
        return BehavioralStatisticsTypesSWIGJNI.CampaignInfo_campaignID_get(this.swigCPtr, this);
    }

    public String getCampaignMedium() {
        return BehavioralStatisticsTypesSWIGJNI.CampaignInfo_campaignMedium_get(this.swigCPtr, this);
    }

    public String getCampaignSource() {
        return BehavioralStatisticsTypesSWIGJNI.CampaignInfo_campaignSource_get(this.swigCPtr, this);
    }

    public String getCampaignTerm() {
        return BehavioralStatisticsTypesSWIGJNI.CampaignInfo_campaignTerm_get(this.swigCPtr, this);
    }

    public void setCampaignContent(String str) {
        BehavioralStatisticsTypesSWIGJNI.CampaignInfo_campaignContent_set(this.swigCPtr, this, str);
    }

    public void setCampaignID(String str) {
        BehavioralStatisticsTypesSWIGJNI.CampaignInfo_campaignID_set(this.swigCPtr, this, str);
    }

    public void setCampaignMedium(String str) {
        BehavioralStatisticsTypesSWIGJNI.CampaignInfo_campaignMedium_set(this.swigCPtr, this, str);
    }

    public void setCampaignSource(String str) {
        BehavioralStatisticsTypesSWIGJNI.CampaignInfo_campaignSource_set(this.swigCPtr, this, str);
    }

    public void setCampaignTerm(String str) {
        BehavioralStatisticsTypesSWIGJNI.CampaignInfo_campaignTerm_set(this.swigCPtr, this, str);
    }

    public CampaignInfo(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public CampaignInfo() {
        this(BehavioralStatisticsTypesSWIGJNI.new_CampaignInfo__SWIG_1(), true);
    }
}
