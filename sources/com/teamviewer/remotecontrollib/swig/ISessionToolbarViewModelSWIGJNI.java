package com.teamviewer.remotecontrollib.swig;

/* JADX INFO: loaded from: classes.dex */
public abstract class ISessionToolbarViewModelSWIGJNI {
    public static final native void ISessionToolbarViewModel_ChangeMonitor(long j, ISessionToolbarViewModel iSessionToolbarViewModel);

    public static final native boolean ISessionToolbarViewModel_IsAutoLockOnSessionEnd(long j, ISessionToolbarViewModel iSessionToolbarViewModel);

    public static final native void ISessionToolbarViewModel_ReportEvent(long j, ISessionToolbarViewModel iSessionToolbarViewModel, int i);

    public static final native void ISessionToolbarViewModel_RequestControl(long j, ISessionToolbarViewModel iSessionToolbarViewModel);

    public static final native long ISessionToolbarViewModel_ShowChangeMonitor(long j, ISessionToolbarViewModel iSessionToolbarViewModel);

    public static final native long ISessionToolbarViewModel_ShowOpenKeyboard(long j, ISessionToolbarViewModel iSessionToolbarViewModel);

    public static final native long ISessionToolbarViewModel_ShowQuickActionsButton(long j, ISessionToolbarViewModel iSessionToolbarViewModel);

    public static final native long ISessionToolbarViewModel_ShowRequestControl(long j, ISessionToolbarViewModel iSessionToolbarViewModel);

    public static final native void delete_ISessionToolbarViewModel(long j);
}
