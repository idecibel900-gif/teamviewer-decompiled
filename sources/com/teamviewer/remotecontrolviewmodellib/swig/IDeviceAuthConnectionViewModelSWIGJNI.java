package com.teamviewer.remotecontrolviewmodellib.swig;

import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;

/* JADX INFO: loaded from: classes.dex */
public abstract class IDeviceAuthConnectionViewModelSWIGJNI {
    public static final native void IDeviceAuthenticationConnectionViewModel_DecryptPayload(long j, IDeviceAuthenticationConnectionViewModel iDeviceAuthenticationConnectionViewModel, long j2, DeviceAuthenticationCallback deviceAuthenticationCallback, String str, String str2);

    public static final native void IDeviceAuthenticationConnectionViewModel_OnNotificationRequestAllowed(long j, IDeviceAuthenticationConnectionViewModel iDeviceAuthenticationConnectionViewModel);

    public static final native void IDeviceAuthenticationConnectionViewModel_OnNotificationRequestDenied(long j, IDeviceAuthenticationConnectionViewModel iDeviceAuthenticationConnectionViewModel);

    public static final native void IDeviceAuthenticationConnectionViewModel_SendConnectionResponse(long j, IDeviceAuthenticationConnectionViewModel iDeviceAuthenticationConnectionViewModel, long j2, DyngateID dyngateID, int i, String str, String str2, long j3);

    public static final native void delete_IDeviceAuthenticationConnectionViewModel(long j);
}
