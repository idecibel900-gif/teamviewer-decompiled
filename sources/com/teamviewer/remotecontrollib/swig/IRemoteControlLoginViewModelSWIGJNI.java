package com.teamviewer.remotecontrollib.swig;

import com.teamviewer.commonviewmodel.swig.IAccountLoginErrorResultCallback;
import com.teamviewer.swigcallbacklib.StringSignalCallback;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class IRemoteControlLoginViewModelSWIGJNI {
    public static final native int IRemoteControlLoginViewModel_GetCurrentView(long j, IRemoteControlLoginViewModel iRemoteControlLoginViewModel);

    public static final native void IRemoteControlLoginViewModel_ProcessSocialLogInResponse(long j, IRemoteControlLoginViewModel iRemoteControlLoginViewModel, String str);

    public static final native void IRemoteControlLoginViewModel_RegisterForLoginErrorResult(long j, IRemoteControlLoginViewModel iRemoteControlLoginViewModel, long j2, IAccountLoginErrorResultCallback iAccountLoginErrorResultCallback);

    public static final native void IRemoteControlLoginViewModel_RegisterForLoginStateChanges(long j, IRemoteControlLoginViewModel iRemoteControlLoginViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void IRemoteControlLoginViewModel_RegisterForSocialLoginConfirmation(long j, IRemoteControlLoginViewModel iRemoteControlLoginViewModel, long j2, StringSignalCallback stringSignalCallback);

    public static final native void IRemoteControlLoginViewModel_StartUrlTokenLogIn(long j, IRemoteControlLoginViewModel iRemoteControlLoginViewModel, String str);

    public static final native void delete_IRemoteControlLoginViewModel(long j);
}
