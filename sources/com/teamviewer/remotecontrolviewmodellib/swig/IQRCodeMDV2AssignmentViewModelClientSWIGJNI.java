package com.teamviewer.remotecontrolviewmodellib.swig;

import com.teamviewer.swigcallbacklib.IntSignalCallback;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class IQRCodeMDV2AssignmentViewModelClientSWIGJNI {
    public static final native void IQRCodeMDV2AssignmentViewModelClient_CancelAssignment(long j, IQRCodeMDV2AssignmentViewModelClient iQRCodeMDV2AssignmentViewModelClient);

    public static final native void IQRCodeMDV2AssignmentViewModelClient_ParseQRCodeContent(long j, IQRCodeMDV2AssignmentViewModelClient iQRCodeMDV2AssignmentViewModelClient, String str);

    public static final native void IQRCodeMDV2AssignmentViewModelClient_RegisterForDisplayPinInput(long j, IQRCodeMDV2AssignmentViewModelClient iQRCodeMDV2AssignmentViewModelClient, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void IQRCodeMDV2AssignmentViewModelClient_RegisterForExpiredQRCode(long j, IQRCodeMDV2AssignmentViewModelClient iQRCodeMDV2AssignmentViewModelClient, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void IQRCodeMDV2AssignmentViewModelClient_RegisterForInvalidQRCode(long j, IQRCodeMDV2AssignmentViewModelClient iQRCodeMDV2AssignmentViewModelClient, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void IQRCodeMDV2AssignmentViewModelClient_RegisterForProcessIsCanceledByTimeout(long j, IQRCodeMDV2AssignmentViewModelClient iQRCodeMDV2AssignmentViewModelClient, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void IQRCodeMDV2AssignmentViewModelClient_RegisterForProcessIsCanceledByUser(long j, IQRCodeMDV2AssignmentViewModelClient iQRCodeMDV2AssignmentViewModelClient, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void IQRCodeMDV2AssignmentViewModelClient_RegisterForUpdateFailedAttempts(long j, IQRCodeMDV2AssignmentViewModelClient iQRCodeMDV2AssignmentViewModelClient, long j2, IntSignalCallback intSignalCallback);

    public static final native void IQRCodeMDV2AssignmentViewModelClient_RegisterForValidationSuccess(long j, IQRCodeMDV2AssignmentViewModelClient iQRCodeMDV2AssignmentViewModelClient, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void IQRCodeMDV2AssignmentViewModelClient_SendAssignmentIdAndPin(long j, IQRCodeMDV2AssignmentViewModelClient iQRCodeMDV2AssignmentViewModelClient, String str, String str2);

    public static final native void delete_IQRCodeMDV2AssignmentViewModelClient(long j);
}
