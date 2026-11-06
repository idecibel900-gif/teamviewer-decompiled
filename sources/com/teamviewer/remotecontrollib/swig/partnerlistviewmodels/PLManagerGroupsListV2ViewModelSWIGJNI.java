package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

import com.teamviewer.swigcallbacklib.IntSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class PLManagerGroupsListV2ViewModelSWIGJNI {
    public static final native void PLManagerGroupsListV2ViewModel_CleanUp(long j, PLManagerGroupsListV2ViewModel pLManagerGroupsListV2ViewModel);

    public static final native String PLManagerGroupsListV2ViewModel_GetGroupElement(long j, PLManagerGroupsListV2ViewModel pLManagerGroupsListV2ViewModel, int i);

    public static final native long PLManagerGroupsListV2ViewModel_GetGroupMemberElement(long j, PLManagerGroupsListV2ViewModel pLManagerGroupsListV2ViewModel, String str, long j2, ManagedDeviceIndexPath managedDeviceIndexPath);

    public static final native String PLManagerGroupsListV2ViewModel_GetGroupName(long j, PLManagerGroupsListV2ViewModel pLManagerGroupsListV2ViewModel, String str);

    public static final native long PLManagerGroupsListV2ViewModel_GetOfflineDevicesCount(long j, PLManagerGroupsListV2ViewModel pLManagerGroupsListV2ViewModel, String str);

    public static final native long PLManagerGroupsListV2ViewModel_GetOnlineDevicesCount(long j, PLManagerGroupsListV2ViewModel pLManagerGroupsListV2ViewModel, String str);

    public static final native long PLManagerGroupsListV2ViewModel_IsDeviceManagementEnabled(long j, PLManagerGroupsListV2ViewModel pLManagerGroupsListV2ViewModel);

    public static final native void PLManagerGroupsListV2ViewModel_NotifyManagedGroupsListChanged(long j, PLManagerGroupsListV2ViewModel pLManagerGroupsListV2ViewModel, long j2, IntSignalCallback intSignalCallback);

    public static final native void delete_PLManagerGroupsListV2ViewModel(long j);
}
