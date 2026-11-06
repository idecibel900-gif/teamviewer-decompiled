package com.teamviewer.remotecontrollib.swig;

import com.teamviewer.teamviewerlib.swig.tvdiscovery.NSDDiscovery;

/* JADX INFO: loaded from: classes.dex */
public abstract class NSDDiscoveryWrapperSWIGJNI {
    public static final native long NSDDiscoveryWrapper_CreateInstance(long j, NSDDiscovery nSDDiscovery);

    public static final native void NSDDiscoveryWrapper_OnNodeResolved(long j, NSDDiscoveryWrapper nSDDiscoveryWrapper, boolean z, String str, String str2, String str3, String str4, String str5);

    public static final native void delete_NSDDiscoveryWrapper(long j);
}
