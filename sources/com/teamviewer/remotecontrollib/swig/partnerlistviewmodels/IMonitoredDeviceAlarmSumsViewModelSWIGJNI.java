package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class IMonitoredDeviceAlarmSumsViewModelSWIGJNI {
    public static final native long IMonitoredDeviceAlarmSumsViewModel_GetAcknowledgedAlarmsNumber(long j, IMonitoredDeviceAlarmSumsViewModel iMonitoredDeviceAlarmSumsViewModel);

    public static final native long IMonitoredDeviceAlarmSumsViewModel_GetAlarmsNumber(long j, IMonitoredDeviceAlarmSumsViewModel iMonitoredDeviceAlarmSumsViewModel);

    public static final native long IMonitoredDeviceAlarmSumsViewModel_GetFailedAlarmsNumber(long j, IMonitoredDeviceAlarmSumsViewModel iMonitoredDeviceAlarmSumsViewModel);

    public static final native void IMonitoredDeviceAlarmSumsViewModel_RegisterForChanges(long j, IMonitoredDeviceAlarmSumsViewModel iMonitoredDeviceAlarmSumsViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void delete_IMonitoredDeviceAlarmSumsViewModel(long j);
}
