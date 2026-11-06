package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

import com.teamviewer.swigcallbacklib.StringSignalCallback;
import com.teamviewer.swigcallbacklib.VoidResultCallback;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class IManagedDeviceV2ViewModelSWIGJNI {
    public static final native void IManagedDeviceV2ViewModel_ActivateRemoteAccessEndpoint(long j, IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel);

    public static final native void IManagedDeviceV2ViewModel_DeRegisterMobileWakeUpNotification(long j, IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel);

    public static final native BigInteger IManagedDeviceV2ViewModel_GetChatEndPoint(long j, IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel);

    public static final native long IManagedDeviceV2ViewModel_GetDyngateID(long j, IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel);

    public static final native String IManagedDeviceV2ViewModel_GetManagementID(long j, IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel);

    public static final native String IManagedDeviceV2ViewModel_GetName(long j, IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel);

    public static final native int IManagedDeviceV2ViewModel_GetOnlineState(long j, IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel);

    public static final native int IManagedDeviceV2ViewModel_GetType(long j, IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel);

    public static final native boolean IManagedDeviceV2ViewModel_IsMobileWakeActivated(long j, IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel);

    public static final native boolean IManagedDeviceV2ViewModel_IsOnline(long j, IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel);

    public static final native boolean IManagedDeviceV2ViewModel_ShowActivateRemoteAccessEndpoint(long j, IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel);

    public static final native boolean IManagedDeviceV2ViewModel_ShowChatTo(long j, IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel);

    public static final native boolean IManagedDeviceV2ViewModel_ShowConnect(long j, IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel);

    public static final native boolean IManagedDeviceV2ViewModel_ShowConnectRemoteAccess(long j, IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel);

    public static final native boolean IManagedDeviceV2ViewModel_ShowFileTransfer(long j, IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel);

    public static final native boolean IManagedDeviceV2ViewModel_ShowWakeOnLan(long j, IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel);

    public static final native void IManagedDeviceV2ViewModel_TriggerMobileWakeUp(long j, IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel, long j2, VoidResultCallback voidResultCallback);

    public static final native void IManagedDeviceV2ViewModel_WakeOnLan(long j, IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel);

    public static final native void IManagedDeviceV2ViewModel_registerForChanges(long j, IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void IManagedDeviceV2ViewModel_registerForEndpointActivationChanges(long j, IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel, long j2, RemoteAccessEndpointActivationSignalCallback remoteAccessEndpointActivationSignalCallback);

    public static final native void IManagedDeviceV2ViewModel_registerForNameChanges(long j, IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel, long j2, StringSignalCallback stringSignalCallback);

    public static final native void delete_IManagedDeviceV2ViewModel(long j);
}
