package com.teamviewer.remotecontrolviewmodellib.swig;

/* JADX INFO: loaded from: classes.dex */
public abstract class ITrustedDeviceRequestViewModelSWIGJNI {
    public static final native void ITrustedDeviceRequestViewModelNative_DecryptPayload(long j, ITrustedDeviceRequestViewModelNative iTrustedDeviceRequestViewModelNative, String str, String str2, long j2, TrustedDeviceRequestPayloadSignalCallback trustedDeviceRequestPayloadSignalCallback);

    public static final native void ITrustedDeviceRequestViewModelNative_OnResetPasswordOpened(long j, ITrustedDeviceRequestViewModelNative iTrustedDeviceRequestViewModelNative);

    public static final native void ITrustedDeviceRequestViewModelNative_OnSignInConfirmedDevice(long j, ITrustedDeviceRequestViewModelNative iTrustedDeviceRequestViewModelNative);

    public static final native void ITrustedDeviceRequestViewModelNative_OnSignInConfirmedDeviceFromNotification(long j, ITrustedDeviceRequestViewModelNative iTrustedDeviceRequestViewModelNative);

    public static final native void ITrustedDeviceRequestViewModelNative_OnSignInConfirmedIpAddress(long j, ITrustedDeviceRequestViewModelNative iTrustedDeviceRequestViewModelNative);

    public static final native void ITrustedDeviceRequestViewModelNative_OnSignInConfirmedOnce(long j, ITrustedDeviceRequestViewModelNative iTrustedDeviceRequestViewModelNative);

    public static final native void ITrustedDeviceRequestViewModelNative_OnSignInDeclined(long j, ITrustedDeviceRequestViewModelNative iTrustedDeviceRequestViewModelNative);

    public static final native void ITrustedDeviceRequestViewModelNative_OnSignInDeclinedFromNotification(long j, ITrustedDeviceRequestViewModelNative iTrustedDeviceRequestViewModelNative);

    public static final native void ITrustedDeviceRequestViewModelNative_OnSignInRequestScreenShown(long j, ITrustedDeviceRequestViewModelNative iTrustedDeviceRequestViewModelNative);

    public static final native void ITrustedDeviceRequestViewModelNative_SendResponse(long j, ITrustedDeviceRequestViewModelNative iTrustedDeviceRequestViewModelNative, int i, boolean z, String str, long j2, TrustedDeviceResponseSignalCallback trustedDeviceResponseSignalCallback);

    public static final native void delete_ITrustedDeviceRequestViewModelNative(long j);
}
