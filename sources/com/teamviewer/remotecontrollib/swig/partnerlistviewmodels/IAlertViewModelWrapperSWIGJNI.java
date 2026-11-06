package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

import com.teamviewer.commonviewmodel.swig.ErrorCodeResultCallback;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class IAlertViewModelWrapperSWIGJNI {
    public static final native void IAlertViewModelWrapper_Acknowledge(long j, IAlertViewModelWrapper iAlertViewModelWrapper, long j2, ErrorCodeResultCallback errorCodeResultCallback);

    public static final native void IAlertViewModelWrapper_CheckNow(long j, IAlertViewModelWrapper iAlertViewModelWrapper, long j2, ErrorCodeResultCallback errorCodeResultCallback);

    public static final native String IAlertViewModelWrapper_GetAge(long j, IAlertViewModelWrapper iAlertViewModelWrapper);

    public static final native String IAlertViewModelWrapper_GetDate(long j, IAlertViewModelWrapper iAlertViewModelWrapper);

    public static final native String IAlertViewModelWrapper_GetDescription(long j, IAlertViewModelWrapper iAlertViewModelWrapper);

    public static final native long IAlertViewModelWrapper_GetID(long j, IAlertViewModelWrapper iAlertViewModelWrapper);

    public static final native boolean IAlertViewModelWrapper_IsAcknowledged(long j, IAlertViewModelWrapper iAlertViewModelWrapper);

    public static final native void IAlertViewModelWrapper_RegisterForAlertChanged(long j, IAlertViewModelWrapper iAlertViewModelWrapper, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void delete_IAlertViewModelWrapper(long j);
}
