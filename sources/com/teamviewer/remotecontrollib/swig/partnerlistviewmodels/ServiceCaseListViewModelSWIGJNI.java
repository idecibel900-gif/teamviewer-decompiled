package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class ServiceCaseListViewModelSWIGJNI {
    public static final native int ServiceCaseListViewModel_GetElement(long j, ServiceCaseListViewModel serviceCaseListViewModel, int i);

    public static final native int ServiceCaseListViewModel_GetSize(long j, ServiceCaseListViewModel serviceCaseListViewModel);

    public static final native void ServiceCaseListViewModel_RegisterForChanges(long j, ServiceCaseListViewModel serviceCaseListViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void delete_ServiceCaseListViewModel(long j);
}
