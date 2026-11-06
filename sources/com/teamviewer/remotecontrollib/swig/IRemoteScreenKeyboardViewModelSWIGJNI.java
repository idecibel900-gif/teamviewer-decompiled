package com.teamviewer.remotecontrollib.swig;

/* JADX INFO: loaded from: classes2.dex */
public abstract class IRemoteScreenKeyboardViewModelSWIGJNI {
    public static final native boolean IRemoteScreenKeyboardViewModel_CanSendCtrlAltDel(long j, IRemoteScreenKeyboardViewModel iRemoteScreenKeyboardViewModel);

    public static final native int IRemoteScreenKeyboardViewModel_GetRemoteOperatingSystem(long j, IRemoteScreenKeyboardViewModel iRemoteScreenKeyboardViewModel);

    public static final native long IRemoteScreenKeyboardViewModel_IsInputAllowed(long j, IRemoteScreenKeyboardViewModel iRemoteScreenKeyboardViewModel);

    public static final native void IRemoteScreenKeyboardViewModel_SendCtrlAltDel(long j, IRemoteScreenKeyboardViewModel iRemoteScreenKeyboardViewModel);

    public static final native void IRemoteScreenKeyboardViewModel_SendUnicode(long j, IRemoteScreenKeyboardViewModel iRemoteScreenKeyboardViewModel, int i);

    public static final native void IRemoteScreenKeyboardViewModel_SendVirtualKey(long j, IRemoteScreenKeyboardViewModel iRemoteScreenKeyboardViewModel, int i, boolean z, boolean z2, int i2);

    public static final native void delete_IRemoteScreenKeyboardViewModel(long j);
}
