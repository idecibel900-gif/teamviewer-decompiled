package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

import com.teamviewer.commonviewmodel.swig.ErrorCodeResultCallback;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class IMonitoringOverviewViewModelSWIGJNI {
    public static final native void IMonitoringOverviewViewModel_CheckNow(long j, IMonitoringOverviewViewModel iMonitoringOverviewViewModel, long j2, ErrorCodeResultCallback errorCodeResultCallback);

    public static final native long IMonitoringOverviewViewModel_GetNumberOfUsedEndpoints(long j, IMonitoringOverviewViewModel iMonitoringOverviewViewModel);

    public static final native long IMonitoringOverviewViewModel_GetTotalNumberOfEndpoints(long j, IMonitoringOverviewViewModel iMonitoringOverviewViewModel);

    public static final native void IMonitoringOverviewViewModel_RegisterForChanges(long j, IMonitoringOverviewViewModel iMonitoringOverviewViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void delete_IMonitoringOverviewViewModel(long j);
}
