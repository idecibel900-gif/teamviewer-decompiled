package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

import com.teamviewer.commonviewmodel.swig.ErrorCodeResultCallback;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class ServiceCaseEditViewModelSWIGJNI {
    public static final native String ServiceCaseEditViewModel_GetAssignee(long j, ServiceCaseEditViewModel serviceCaseEditViewModel);

    public static final native String ServiceCaseEditViewModel_GetDescription(long j, ServiceCaseEditViewModel serviceCaseEditViewModel);

    public static final native String ServiceCaseEditViewModel_GetDisplayID(long j, ServiceCaseEditViewModel serviceCaseEditViewModel);

    public static final native String ServiceCaseEditViewModel_GetGroup(long j, ServiceCaseEditViewModel serviceCaseEditViewModel);

    public static final native int ServiceCaseEditViewModel_GetGroupID(long j, ServiceCaseEditViewModel serviceCaseEditViewModel);

    public static final native String ServiceCaseEditViewModel_GetName(long j, ServiceCaseEditViewModel serviceCaseEditViewModel);

    public static final native boolean ServiceCaseEditViewModel_IsEditableByMe(long j, ServiceCaseEditViewModel serviceCaseEditViewModel);

    public static final native void ServiceCaseEditViewModel_RegisterForDelete(long j, ServiceCaseEditViewModel serviceCaseEditViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void ServiceCaseEditViewModel_UpdateNote(long j, ServiceCaseEditViewModel serviceCaseEditViewModel, String str, long j2, ErrorCodeResultCallback errorCodeResultCallback);

    public static final native void delete_ServiceCaseEditViewModel(long j);
}
