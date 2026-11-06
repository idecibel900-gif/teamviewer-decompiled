package com.teamviewer.teamviewerlib.swig.tvdiscovery;

/* JADX INFO: loaded from: classes.dex */
public class NSDDiscoverySWIGJNI {
    public static final native void NSDDiscovery_Browse(long j, NSDDiscovery nSDDiscovery, long j2);

    public static final native void NSDDiscovery_BrowseCallback(long j, NSDDiscovery nSDDiscovery, long j2);

    public static final native long NSDDiscovery_Factory();

    public static final native String NSDDiscovery_GetAuthenticationToken(long j, NSDDiscovery nSDDiscovery);

    public static final native String NSDDiscovery_GetIdentifier(long j, NSDDiscovery nSDDiscovery);

    public static final native void NSDDiscovery_OnNodeResolved(long j, NSDDiscovery nSDDiscovery, boolean z, String str, String str2, String str3, String str4, String str5);

    public static final native void NSDDiscovery_Publish(long j, NSDDiscovery nSDDiscovery, long j2);

    public static final native void NSDDiscovery_PublishCallback(long j, NSDDiscovery nSDDiscovery, long j2);

    public static final native void NSDDiscovery_SetAuthenticationToken(long j, NSDDiscovery nSDDiscovery, String str);

    public static final native void NSDDiscovery_ShutdownDiscovery(long j, NSDDiscovery nSDDiscovery);

    public static final native void NSDDiscovery_Start(long j, NSDDiscovery nSDDiscovery);

    public static final native void NSDDiscovery_Stop(long j, NSDDiscovery nSDDiscovery);

    public static final native void NSDDiscovery_Unbrowse(long j, NSDDiscovery nSDDiscovery, long j2);

    public static final native void NSDDiscovery_UnbrowseCallback(long j, NSDDiscovery nSDDiscovery, long j2);

    public static final native void NSDDiscovery_Unpublish(long j, NSDDiscovery nSDDiscovery, long j2);

    public static final native void NSDDiscovery_UnpublishCallback(long j, NSDDiscovery nSDDiscovery, long j2);

    public static final native void delete_NSDDiscovery(long j);
}
