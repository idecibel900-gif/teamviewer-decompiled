package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class IDeviceSystemDetailsViewModelSWIGJNI {
    public static final native String IDeviceSystemDetailsViewModel_GetDomain(long j, IDeviceSystemDetailsViewModel iDeviceSystemDetailsViewModel);

    public static final native String IDeviceSystemDetailsViewModel_GetExternalIp(long j, IDeviceSystemDetailsViewModel iDeviceSystemDetailsViewModel);

    public static final native String IDeviceSystemDetailsViewModel_GetHardware(long j, IDeviceSystemDetailsViewModel iDeviceSystemDetailsViewModel);

    public static final native String IDeviceSystemDetailsViewModel_GetInternalIp(long j, IDeviceSystemDetailsViewModel iDeviceSystemDetailsViewModel);

    public static final native String IDeviceSystemDetailsViewModel_GetOperatingSystem(long j, IDeviceSystemDetailsViewModel iDeviceSystemDetailsViewModel);

    public static final native boolean IDeviceSystemDetailsViewModel_IsValid(long j, IDeviceSystemDetailsViewModel iDeviceSystemDetailsViewModel);

    public static final native void IDeviceSystemDetailsViewModel_QuerySystemInformation(long j, IDeviceSystemDetailsViewModel iDeviceSystemDetailsViewModel);

    public static final native void IDeviceSystemDetailsViewModel_RegisterForInformationChanged(long j, IDeviceSystemDetailsViewModel iDeviceSystemDetailsViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void delete_IDeviceSystemDetailsViewModel(long j);
}
