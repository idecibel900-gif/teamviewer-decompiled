package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

/* JADX INFO: loaded from: classes.dex */
public abstract class ManagedDevicesV2MemberSWIGJNI {
    public static final native int ManagedDevicesV2MemberId_getType(long j, ManagedDevicesV2MemberId managedDevicesV2MemberId);

    public static final native String ManagedDevicesV2MemberId_getUuidString(long j, ManagedDevicesV2MemberId managedDevicesV2MemberId);

    public static final native void delete_ManagedDevicesV2MemberId(long j);

    public static final native long new_ManagedDevicesV2MemberId(int i, String str);
}
