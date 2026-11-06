package com.teamviewer.remotecontrollib.swig;

/* JADX INFO: loaded from: classes.dex */
public abstract class IQuickActionsViewModelSWIGJNI {
    public static final native long IQuickActionsViewModel_IsBlackScreenActive(long j, IQuickActionsViewModel iQuickActionsViewModel);

    public static final native long IQuickActionsViewModel_IsBlackScreenAvailable(long j, IQuickActionsViewModel iQuickActionsViewModel);

    public static final native long IQuickActionsViewModel_IsCtrlAltDelAvailable(long j, IQuickActionsViewModel iQuickActionsViewModel);

    public static final native long IQuickActionsViewModel_IsDisablePartnerInputActive(long j, IQuickActionsViewModel iQuickActionsViewModel);

    public static final native long IQuickActionsViewModel_IsDisablePartnerInputAvailable(long j, IQuickActionsViewModel iQuickActionsViewModel);

    public static final native long IQuickActionsViewModel_IsLockRemoteWorkstationAvailable(long j, IQuickActionsViewModel iQuickActionsViewModel);

    public static final native long IQuickActionsViewModel_IsRemoteRebootAvailable(long j, IQuickActionsViewModel iQuickActionsViewModel);

    public static final native void IQuickActionsViewModel_LockRemoteWorkstation(long j, IQuickActionsViewModel iQuickActionsViewModel);

    public static final native void IQuickActionsViewModel_RemoteReboot(long j, IQuickActionsViewModel iQuickActionsViewModel);

    public static final native void IQuickActionsViewModel_ReportEvent(long j, IQuickActionsViewModel iQuickActionsViewModel, int i);

    public static final native void IQuickActionsViewModel_SendCtrlAltDel(long j, IQuickActionsViewModel iQuickActionsViewModel);

    public static final native void IQuickActionsViewModel_ToggleBlackScreen(long j, IQuickActionsViewModel iQuickActionsViewModel);

    public static final native void IQuickActionsViewModel_TogglePartnerInput(long j, IQuickActionsViewModel iQuickActionsViewModel);

    public static final native void delete_IQuickActionsViewModel(long j);
}
