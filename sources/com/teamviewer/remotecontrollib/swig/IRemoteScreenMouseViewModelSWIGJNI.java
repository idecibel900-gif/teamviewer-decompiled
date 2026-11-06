package com.teamviewer.remotecontrollib.swig;

/* JADX INFO: loaded from: classes.dex */
public abstract class IRemoteScreenMouseViewModelSWIGJNI {
    public static final native void IRemoteScreenMouseViewModel_SendMouseClick(long j, IRemoteScreenMouseViewModel iRemoteScreenMouseViewModel, int i, int i2, int i3);

    public static final native void IRemoteScreenMouseViewModel_SendMousePress(long j, IRemoteScreenMouseViewModel iRemoteScreenMouseViewModel, int i, int i2, int i3);

    public static final native void IRemoteScreenMouseViewModel_SendMouseScroll(long j, IRemoteScreenMouseViewModel iRemoteScreenMouseViewModel, int i, boolean z, int i2, int i3);

    public static final native void delete_IRemoteScreenMouseViewModel(long j);
}
