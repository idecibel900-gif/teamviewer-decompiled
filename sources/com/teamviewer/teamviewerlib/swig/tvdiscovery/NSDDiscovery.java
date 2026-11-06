package com.teamviewer.teamviewerlib.swig.tvdiscovery;

/* JADX INFO: loaded from: classes.dex */
public class NSDDiscovery {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public NSDDiscovery(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static SWIGTYPE_p_NSDDiscoveryPtr Factory() {
        return new SWIGTYPE_p_NSDDiscoveryPtr(NSDDiscoverySWIGJNI.NSDDiscovery_Factory(), true);
    }

    public static long getCPtr(NSDDiscovery nSDDiscovery) {
        if (nSDDiscovery == null) {
            return 0L;
        }
        return nSDDiscovery.swigCPtr;
    }

    public void Browse(SWIGTYPE_p_DiscoveryQueryPtr sWIGTYPE_p_DiscoveryQueryPtr) {
        NSDDiscoverySWIGJNI.NSDDiscovery_Browse(this.swigCPtr, this, SWIGTYPE_p_DiscoveryQueryPtr.getCPtr(sWIGTYPE_p_DiscoveryQueryPtr));
    }

    public void BrowseCallback(SWIGTYPE_p_DiscoveryNodePtr sWIGTYPE_p_DiscoveryNodePtr) {
        NSDDiscoverySWIGJNI.NSDDiscovery_BrowseCallback(this.swigCPtr, this, SWIGTYPE_p_DiscoveryNodePtr.getCPtr(sWIGTYPE_p_DiscoveryNodePtr));
    }

    public String GetAuthenticationToken() {
        return NSDDiscoverySWIGJNI.NSDDiscovery_GetAuthenticationToken(this.swigCPtr, this);
    }

    public String GetIdentifier() {
        return NSDDiscoverySWIGJNI.NSDDiscovery_GetIdentifier(this.swigCPtr, this);
    }

    public void OnNodeResolved(boolean z, String str, String str2, String str3, String str4, String str5) {
        NSDDiscoverySWIGJNI.NSDDiscovery_OnNodeResolved(this.swigCPtr, this, z, str, str2, str3, str4, str5);
    }

    public void Publish(SWIGTYPE_p_DiscoveryNodePtr sWIGTYPE_p_DiscoveryNodePtr) {
        NSDDiscoverySWIGJNI.NSDDiscovery_Publish(this.swigCPtr, this, SWIGTYPE_p_DiscoveryNodePtr.getCPtr(sWIGTYPE_p_DiscoveryNodePtr));
    }

    public void PublishCallback(SWIGTYPE_p_DiscoveryNodePtr sWIGTYPE_p_DiscoveryNodePtr) {
        NSDDiscoverySWIGJNI.NSDDiscovery_PublishCallback(this.swigCPtr, this, SWIGTYPE_p_DiscoveryNodePtr.getCPtr(sWIGTYPE_p_DiscoveryNodePtr));
    }

    public void SetAuthenticationToken(String str) {
        NSDDiscoverySWIGJNI.NSDDiscovery_SetAuthenticationToken(this.swigCPtr, this, str);
    }

    public void ShutdownDiscovery() {
        NSDDiscoverySWIGJNI.NSDDiscovery_ShutdownDiscovery(this.swigCPtr, this);
    }

    public void Start() {
        NSDDiscoverySWIGJNI.NSDDiscovery_Start(this.swigCPtr, this);
    }

    public void Stop() {
        NSDDiscoverySWIGJNI.NSDDiscovery_Stop(this.swigCPtr, this);
    }

    public void Unbrowse(SWIGTYPE_p_DiscoveryQueryPtr sWIGTYPE_p_DiscoveryQueryPtr) {
        NSDDiscoverySWIGJNI.NSDDiscovery_Unbrowse(this.swigCPtr, this, SWIGTYPE_p_DiscoveryQueryPtr.getCPtr(sWIGTYPE_p_DiscoveryQueryPtr));
    }

    public void UnbrowseCallback(SWIGTYPE_p_DiscoveryQueryPtr sWIGTYPE_p_DiscoveryQueryPtr) {
        NSDDiscoverySWIGJNI.NSDDiscovery_UnbrowseCallback(this.swigCPtr, this, SWIGTYPE_p_DiscoveryQueryPtr.getCPtr(sWIGTYPE_p_DiscoveryQueryPtr));
    }

    public void Unpublish(SWIGTYPE_p_DiscoveryNodePtr sWIGTYPE_p_DiscoveryNodePtr) {
        NSDDiscoverySWIGJNI.NSDDiscovery_Unpublish(this.swigCPtr, this, SWIGTYPE_p_DiscoveryNodePtr.getCPtr(sWIGTYPE_p_DiscoveryNodePtr));
    }

    public void UnpublishCallback(SWIGTYPE_p_DiscoveryNodePtr sWIGTYPE_p_DiscoveryNodePtr) {
        NSDDiscoverySWIGJNI.NSDDiscovery_UnpublishCallback(this.swigCPtr, this, SWIGTYPE_p_DiscoveryNodePtr.getCPtr(sWIGTYPE_p_DiscoveryNodePtr));
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    NSDDiscoverySWIGJNI.delete_NSDDiscovery(j);
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
