package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class PLManagerDevicesV2ViewModelSWIGJNI {
    public static final native void PLManagerDevicesV2ViewModel_CleanUp(long j, PLManagerDevicesV2ViewModel pLManagerDevicesV2ViewModel);

    public static final native long PLManagerDevicesV2ViewModel_GetElement(long j, PLManagerDevicesV2ViewModel pLManagerDevicesV2ViewModel, long j2, ManagedDeviceIndexPath managedDeviceIndexPath);

    public static final native long PLManagerDevicesV2ViewModel_GetOfflineDevicesSize(long j, PLManagerDevicesV2ViewModel pLManagerDevicesV2ViewModel);

    public static final native long PLManagerDevicesV2ViewModel_GetOnlineDevicesSize(long j, PLManagerDevicesV2ViewModel pLManagerDevicesV2ViewModel);

    public static final native void PLManagerDevicesV2ViewModel_Init(long j, PLManagerDevicesV2ViewModel pLManagerDevicesV2ViewModel);

    public static final native void PLManagerDevicesV2ViewModel_NotifyManagedDevicesListReady(long j, PLManagerDevicesV2ViewModel pLManagerDevicesV2ViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void delete_PLManagerDevicesV2ViewModel(long j);
}
