package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

import com.teamviewer.commonviewmodel.swig.ErrorCodeResultCallback;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListComputerID;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class ComputerDetailsViewModelSWIGJNI {
    public static final native boolean ComputerDetailsViewModel_AreAllAlertsAcknowledged(long j, ComputerDetailsViewModel computerDetailsViewModel);

    public static final native boolean ComputerDetailsViewModel_AreAllAlertsUnAcknowledged(long j, ComputerDetailsViewModel computerDetailsViewModel);

    public static final native void ComputerDetailsViewModel_CheckDeviceAlerts(long j, ComputerDetailsViewModel computerDetailsViewModel, long j2, ErrorCodeResultCallback errorCodeResultCallback);

    public static final native long ComputerDetailsViewModel_GetAlertsList(long j, ComputerDetailsViewModel computerDetailsViewModel);

    public static final native String ComputerDetailsViewModel_GetDisplayName(long j, ComputerDetailsViewModel computerDetailsViewModel);

    public static final native long ComputerDetailsViewModel_GetDyngateID(long j, ComputerDetailsViewModel computerDetailsViewModel);

    public static final native long ComputerDetailsViewModel_GetGroupID(long j, ComputerDetailsViewModel computerDetailsViewModel);

    public static final native long ComputerDetailsViewModel_GetID(long j, ComputerDetailsViewModel computerDetailsViewModel);

    public static final native String ComputerDetailsViewModel_GetNote(long j, ComputerDetailsViewModel computerDetailsViewModel);

    public static final native boolean ComputerDetailsViewModel_IsEditableByMe(long j, ComputerDetailsViewModel computerDetailsViewModel);

    public static final native boolean ComputerDetailsViewModel_IsManagedByMe(long j, ComputerDetailsViewModel computerDetailsViewModel);

    public static final native boolean ComputerDetailsViewModel_IsMobileWakeActive(long j, ComputerDetailsViewModel computerDetailsViewModel);

    public static final native boolean ComputerDetailsViewModel_IsOnline(long j, ComputerDetailsViewModel computerDetailsViewModel);

    public static final native boolean ComputerDetailsViewModel_IsProMonitoring(long j, ComputerDetailsViewModel computerDetailsViewModel);

    public static final native void ComputerDetailsViewModel_RegisterForAlertsListChanged(long j, ComputerDetailsViewModel computerDetailsViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void ComputerDetailsViewModel_RegisterForChanges(long j, ComputerDetailsViewModel computerDetailsViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void ComputerDetailsViewModel_RegisterForDeviceDelete(long j, ComputerDetailsViewModel computerDetailsViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void ComputerDetailsViewModel_RegisterForGroupDelete(long j, ComputerDetailsViewModel computerDetailsViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void ComputerDetailsViewModel_RegisterForMonitoringInstallation(long j, ComputerDetailsViewModel computerDetailsViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void ComputerDetailsViewModel_RegisterForMonitoringUnInstallation(long j, ComputerDetailsViewModel computerDetailsViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void ComputerDetailsViewModel_RemoveComputer(long j, ComputerDetailsViewModel computerDetailsViewModel, long j2, PListComputerID pListComputerID, long j3, ErrorCodeResultCallback errorCodeResultCallback);

    public static final native void IAlertViewModelWrapperVector_clear(long j, IAlertViewModelWrapperVector iAlertViewModelWrapperVector);

    public static final native void IAlertViewModelWrapperVector_doAdd__SWIG_0(long j, IAlertViewModelWrapperVector iAlertViewModelWrapperVector, long j2, IAlertViewModelWrapper iAlertViewModelWrapper);

    public static final native void IAlertViewModelWrapperVector_doAdd__SWIG_1(long j, IAlertViewModelWrapperVector iAlertViewModelWrapperVector, int i, long j2, IAlertViewModelWrapper iAlertViewModelWrapper);

    public static final native long IAlertViewModelWrapperVector_doGet(long j, IAlertViewModelWrapperVector iAlertViewModelWrapperVector, int i);

    public static final native long IAlertViewModelWrapperVector_doRemove(long j, IAlertViewModelWrapperVector iAlertViewModelWrapperVector, int i);

    public static final native void IAlertViewModelWrapperVector_doRemoveRange(long j, IAlertViewModelWrapperVector iAlertViewModelWrapperVector, int i, int i2);

    public static final native long IAlertViewModelWrapperVector_doSet(long j, IAlertViewModelWrapperVector iAlertViewModelWrapperVector, int i, long j2, IAlertViewModelWrapper iAlertViewModelWrapper);

    public static final native int IAlertViewModelWrapperVector_doSize(long j, IAlertViewModelWrapperVector iAlertViewModelWrapperVector);

    public static final native boolean IAlertViewModelWrapperVector_isEmpty(long j, IAlertViewModelWrapperVector iAlertViewModelWrapperVector);

    public static final native void delete_ComputerDetailsViewModel(long j);

    public static final native void delete_IAlertViewModelWrapperVector(long j);
}
