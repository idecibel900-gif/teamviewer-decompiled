package com.teamviewer.remotecontrolviewmodellib.swig;

import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;

/* JADX INFO: loaded from: classes.dex */
public abstract class IDeviceAuthQrScannerActivityViewModelSWIGJNI {
    public static final native void IDeviceAuthenticationQrScannerActivityViewModel_ReportCameraPermissionIsDenied(long j, IDeviceAuthenticationQrScannerActivityViewModel iDeviceAuthenticationQrScannerActivityViewModel);

    public static final native void IDeviceAuthenticationQrScannerActivityViewModel_ReportCameraPermissionIsGranted(long j, IDeviceAuthenticationQrScannerActivityViewModel iDeviceAuthenticationQrScannerActivityViewModel);

    public static final native void IDeviceAuthenticationQrScannerActivityViewModel_ReportQrCodeIsInvalid(long j, IDeviceAuthenticationQrScannerActivityViewModel iDeviceAuthenticationQrScannerActivityViewModel);

    public static final native void IDeviceAuthenticationQrScannerActivityViewModel_ReportQrCodeIsValid(long j, IDeviceAuthenticationQrScannerActivityViewModel iDeviceAuthenticationQrScannerActivityViewModel);

    public static final native void IDeviceAuthenticationQrScannerActivityViewModel_SendActivateMfaCommand(long j, IDeviceAuthenticationQrScannerActivityViewModel iDeviceAuthenticationQrScannerActivityViewModel, long j2, DyngateID dyngateID, long j3, DyngateID dyngateID2, long j4, String str, String str2);

    public static final native void delete_IDeviceAuthenticationQrScannerActivityViewModel(long j);
}
