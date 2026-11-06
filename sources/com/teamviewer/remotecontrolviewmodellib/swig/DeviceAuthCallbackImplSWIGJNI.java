package com.teamviewer.remotecontrolviewmodellib.swig;

/* JADX INFO: loaded from: classes.dex */
public class DeviceAuthCallbackImplSWIGJNI {
    static {
        swig_module_init();
    }

    public static final native void DeviceAuthenticationCallbackImpl_PerformCallback(long j, DeviceAuthenticationCallbackImpl deviceAuthenticationCallbackImpl, long j2, DeviceAuthenticationData deviceAuthenticationData);

    public static final native long DeviceAuthenticationCallbackImpl_SWIGUpcast(long j);

    public static final native void DeviceAuthenticationCallbackImpl_change_ownership(DeviceAuthenticationCallbackImpl deviceAuthenticationCallbackImpl, long j, boolean z);

    public static final native void DeviceAuthenticationCallbackImpl_director_connect(DeviceAuthenticationCallbackImpl deviceAuthenticationCallbackImpl, long j, boolean z, boolean z2);

    public static void SwigDirector_DeviceAuthenticationCallbackImpl_PerformCallback(DeviceAuthenticationCallbackImpl deviceAuthenticationCallbackImpl, long j) {
        DeviceAuthenticationData deviceAuthenticationData = new DeviceAuthenticationData();
        deviceAuthenticationData.a = j;
        deviceAuthenticationCallbackImpl.PerformCallback(deviceAuthenticationData);
    }

    public static final native void delete_DeviceAuthenticationCallbackImpl(long j);

    public static final native long new_DeviceAuthenticationCallbackImpl();

    private static final native void swig_module_init();
}
