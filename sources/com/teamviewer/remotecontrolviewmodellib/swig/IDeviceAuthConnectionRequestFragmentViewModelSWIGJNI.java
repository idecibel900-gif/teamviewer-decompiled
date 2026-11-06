package com.teamviewer.remotecontrolviewmodellib.swig;

import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;

/* JADX INFO: loaded from: classes.dex */
public abstract class IDeviceAuthConnectionRequestFragmentViewModelSWIGJNI {
    public static final native void IDeviceAuthenticationConnectionRequestFragmentViewModel_OnConnectionRequestScreenShown(long j, IDeviceAuthenticationConnectionRequestFragmentViewModel iDeviceAuthenticationConnectionRequestFragmentViewModel);

    public static final native void IDeviceAuthenticationConnectionRequestFragmentViewModel_OnScreenRequestAllowed(long j, IDeviceAuthenticationConnectionRequestFragmentViewModel iDeviceAuthenticationConnectionRequestFragmentViewModel);

    public static final native void IDeviceAuthenticationConnectionRequestFragmentViewModel_OnScreenRequestDenied(long j, IDeviceAuthenticationConnectionRequestFragmentViewModel iDeviceAuthenticationConnectionRequestFragmentViewModel);

    public static final native void IDeviceAuthenticationConnectionRequestFragmentViewModel_SendConnectionResponse(long j, IDeviceAuthenticationConnectionRequestFragmentViewModel iDeviceAuthenticationConnectionRequestFragmentViewModel, long j2, DyngateID dyngateID, int i, String str, String str2, long j3);

    public static final native void delete_IDeviceAuthenticationConnectionRequestFragmentViewModel(long j);
}
