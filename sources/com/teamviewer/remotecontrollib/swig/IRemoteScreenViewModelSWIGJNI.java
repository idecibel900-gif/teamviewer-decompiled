package com.teamviewer.remotecontrollib.swig;

import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class IRemoteScreenViewModelSWIGJNI {
    public static final native void IRemoteScreenViewModel_RegisterForRenderRequests(long j, IRemoteScreenViewModel iRemoteScreenViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native long IRemoteScreenViewModel_RemoteResolution(long j, IRemoteScreenViewModel iRemoteScreenViewModel);

    public static final native void IRemoteScreenViewModel_RequestRefresh(long j, IRemoteScreenViewModel iRemoteScreenViewModel);

    public static final native void IRemoteScreenViewModel_SetLocalCursorPosition(long j, IRemoteScreenViewModel iRemoteScreenViewModel, int i, int i2);

    public static final native void IRemoteScreenViewModel_SetLocalCursorVisible(long j, IRemoteScreenViewModel iRemoteScreenViewModel, boolean z);

    public static final native void IRemoteScreenViewModel_UpdateMaxResolution(long j, IRemoteScreenViewModel iRemoteScreenViewModel, int i, int i2);

    public static final native void IRemoteScreenViewModel_ViewportCreated(long j, IRemoteScreenViewModel iRemoteScreenViewModel);

    public static final native void IRemoteScreenViewModel_ViewportDestroyed(long j, IRemoteScreenViewModel iRemoteScreenViewModel);

    public static final native void IRemoteScreenViewModel_ViewportRender(long j, IRemoteScreenViewModel iRemoteScreenViewModel, float f, float f2, int i, int i2);

    public static final native void IRemoteScreenViewModel_ViewportSizeChanged(long j, IRemoteScreenViewModel iRemoteScreenViewModel, int i, int i2, int i3);

    public static final native void delete_IRemoteScreenViewModel(long j);
}
