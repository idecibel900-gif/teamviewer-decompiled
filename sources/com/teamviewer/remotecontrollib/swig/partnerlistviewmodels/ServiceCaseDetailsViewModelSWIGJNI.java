package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class ServiceCaseDetailsViewModelSWIGJNI {
    public static final native void ServiceCaseDetailsViewModel_CloseCase(long j, ServiceCaseDetailsViewModel serviceCaseDetailsViewModel);

    public static final native String ServiceCaseDetailsViewModel_GetAssignee(long j, ServiceCaseDetailsViewModel serviceCaseDetailsViewModel);

    public static final native long ServiceCaseDetailsViewModel_GetCustomerDyngateID(long j, ServiceCaseDetailsViewModel serviceCaseDetailsViewModel);

    public static final native String ServiceCaseDetailsViewModel_GetDescription(long j, ServiceCaseDetailsViewModel serviceCaseDetailsViewModel);

    public static final native String ServiceCaseDetailsViewModel_GetDisplayID(long j, ServiceCaseDetailsViewModel serviceCaseDetailsViewModel);

    public static final native String ServiceCaseDetailsViewModel_GetGroup(long j, ServiceCaseDetailsViewModel serviceCaseDetailsViewModel);

    public static final native int ServiceCaseDetailsViewModel_GetID(long j, ServiceCaseDetailsViewModel serviceCaseDetailsViewModel);

    public static final native String ServiceCaseDetailsViewModel_GetName(long j, ServiceCaseDetailsViewModel serviceCaseDetailsViewModel);

    public static final native String ServiceCaseDetailsViewModel_GetPassword(long j, ServiceCaseDetailsViewModel serviceCaseDetailsViewModel);

    public static final native boolean ServiceCaseDetailsViewModel_IsCloseAllowed(long j, ServiceCaseDetailsViewModel serviceCaseDetailsViewModel);

    public static final native boolean ServiceCaseDetailsViewModel_IsEditableByMe(long j, ServiceCaseDetailsViewModel serviceCaseDetailsViewModel);

    public static final native void ServiceCaseDetailsViewModel_RegisterForChanges(long j, ServiceCaseDetailsViewModel serviceCaseDetailsViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void ServiceCaseDetailsViewModel_RegisterForDelete(long j, ServiceCaseDetailsViewModel serviceCaseDetailsViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native boolean ServiceCaseDetailsViewModel_ShowConnect(long j, ServiceCaseDetailsViewModel serviceCaseDetailsViewModel);

    public static final native void delete_ServiceCaseDetailsViewModel(long j);
}
