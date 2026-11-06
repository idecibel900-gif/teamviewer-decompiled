package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class ServiceCaseListElementViewModelSWIGJNI {
    public static final native long ServiceCaseListElementViewModel_GetCustomerDyngateID(long j, ServiceCaseListElementViewModel serviceCaseListElementViewModel);

    public static final native int ServiceCaseListElementViewModel_GetID(long j, ServiceCaseListElementViewModel serviceCaseListElementViewModel);

    public static final native int ServiceCaseListElementViewModel_GetIcon(long j, ServiceCaseListElementViewModel serviceCaseListElementViewModel);

    public static final native String ServiceCaseListElementViewModel_GetName(long j, ServiceCaseListElementViewModel serviceCaseListElementViewModel);

    public static final native String ServiceCaseListElementViewModel_GetPassword(long j, ServiceCaseListElementViewModel serviceCaseListElementViewModel);

    public static final native boolean ServiceCaseListElementViewModel_IsConnectPossible(long j, ServiceCaseListElementViewModel serviceCaseListElementViewModel);

    public static final native boolean ServiceCaseListElementViewModel_IsTakeOverPossible(long j, ServiceCaseListElementViewModel serviceCaseListElementViewModel);

    public static final native void ServiceCaseListElementViewModel_RegisterForChanges(long j, ServiceCaseListElementViewModel serviceCaseListElementViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native long ServiceCaseListElementViewModel_SWIGSmartPtrUpcast(long j);

    public static final native void ServiceCaseListElementViewModel_TakeOver(long j, ServiceCaseListElementViewModel serviceCaseListElementViewModel);

    public static final native void delete_ServiceCaseListElementViewModel(long j);
}
