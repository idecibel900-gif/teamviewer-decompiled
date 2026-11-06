package com.teamviewer.remotecontrolviewmodellib.swig;

/* JADX INFO: loaded from: classes.dex */
public class TrustedDeviceRequestPayloadSignalCallbackImplSWIGJNI {
    static {
        swig_module_init();
    }

    public static void SwigDirector_TrustedDeviceRequestPayloadSignalCallbackImpl_PerformCallback(TrustedDeviceRequestPayloadSignalCallbackImpl trustedDeviceRequestPayloadSignalCallbackImpl, long j) {
        TrustedDeviceRequestPayloadNative trustedDeviceRequestPayloadNative = new TrustedDeviceRequestPayloadNative();
        trustedDeviceRequestPayloadNative.a = j;
        trustedDeviceRequestPayloadSignalCallbackImpl.PerformCallback(trustedDeviceRequestPayloadNative);
    }

    public static final native void TrustedDeviceRequestPayloadSignalCallbackImpl_PerformCallback(long j, TrustedDeviceRequestPayloadSignalCallbackImpl trustedDeviceRequestPayloadSignalCallbackImpl, long j2, TrustedDeviceRequestPayloadNative trustedDeviceRequestPayloadNative);

    public static final native long TrustedDeviceRequestPayloadSignalCallbackImpl_SWIGUpcast(long j);

    public static final native void TrustedDeviceRequestPayloadSignalCallbackImpl_change_ownership(TrustedDeviceRequestPayloadSignalCallbackImpl trustedDeviceRequestPayloadSignalCallbackImpl, long j, boolean z);

    public static final native void TrustedDeviceRequestPayloadSignalCallbackImpl_director_connect(TrustedDeviceRequestPayloadSignalCallbackImpl trustedDeviceRequestPayloadSignalCallbackImpl, long j, boolean z, boolean z2);

    public static final native void delete_TrustedDeviceRequestPayloadSignalCallbackImpl(long j);

    public static final native long new_TrustedDeviceRequestPayloadSignalCallbackImpl();

    private static final native void swig_module_init();
}
