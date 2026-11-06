package com.teamviewer.remotecontrollib.swig;

import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class INearbyDevicesViewModelSWIGJNI {
    public static final native long INearbyDevicesViewModel_GetList(long j, INearbyDevicesViewModel iNearbyDevicesViewModel);

    public static final native void INearbyDevicesViewModel_RegisterOnTreeChangedCallback(long j, INearbyDevicesViewModel iNearbyDevicesViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void INearbyDevicesViewModel_ReportEvent(long j, INearbyDevicesViewModel iNearbyDevicesViewModel, int i);

    public static final native void NearbyDeviceItemVector_clear(long j, NearbyDeviceItemVector nearbyDeviceItemVector);

    public static final native void NearbyDeviceItemVector_doAdd__SWIG_0(long j, NearbyDeviceItemVector nearbyDeviceItemVector, long j2, INearbyDeviceItem iNearbyDeviceItem);

    public static final native void NearbyDeviceItemVector_doAdd__SWIG_1(long j, NearbyDeviceItemVector nearbyDeviceItemVector, int i, long j2, INearbyDeviceItem iNearbyDeviceItem);

    public static final native long NearbyDeviceItemVector_doGet(long j, NearbyDeviceItemVector nearbyDeviceItemVector, int i);

    public static final native long NearbyDeviceItemVector_doRemove(long j, NearbyDeviceItemVector nearbyDeviceItemVector, int i);

    public static final native void NearbyDeviceItemVector_doRemoveRange(long j, NearbyDeviceItemVector nearbyDeviceItemVector, int i, int i2);

    public static final native long NearbyDeviceItemVector_doSet(long j, NearbyDeviceItemVector nearbyDeviceItemVector, int i, long j2, INearbyDeviceItem iNearbyDeviceItem);

    public static final native int NearbyDeviceItemVector_doSize(long j, NearbyDeviceItemVector nearbyDeviceItemVector);

    public static final native boolean NearbyDeviceItemVector_isEmpty(long j, NearbyDeviceItemVector nearbyDeviceItemVector);

    public static final native void delete_INearbyDevicesViewModel(long j);

    public static final native void delete_NearbyDeviceItemVector(long j);
}
