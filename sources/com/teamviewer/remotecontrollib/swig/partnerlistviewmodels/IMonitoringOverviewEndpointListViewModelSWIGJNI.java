package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class IMonitoringOverviewEndpointListViewModelSWIGJNI {
    public static final native long IMonitoringOverviewEndpointListViewModel_EndpointsCount(long j, IMonitoringOverviewEndpointListViewModel iMonitoringOverviewEndpointListViewModel);

    public static final native long IMonitoringOverviewEndpointListViewModel_GetEndpointViewModel(long j, IMonitoringOverviewEndpointListViewModel iMonitoringOverviewEndpointListViewModel, int i);

    public static final native void IMonitoringOverviewEndpointListViewModel_RegisterForChanges(long j, IMonitoringOverviewEndpointListViewModel iMonitoringOverviewEndpointListViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void delete_IMonitoringOverviewEndpointListViewModel(long j);
}
