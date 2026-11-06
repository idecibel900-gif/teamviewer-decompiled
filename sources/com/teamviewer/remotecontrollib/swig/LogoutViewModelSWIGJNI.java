package com.teamviewer.remotecontrollib.swig;

import com.teamviewer.commonviewmodel.swig.ErrorCodeResultCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class LogoutViewModelSWIGJNI {
    public static final native boolean LogoutViewModel_IsEnabled(long j, LogoutViewModel logoutViewModel);

    public static final native void LogoutViewModel_LogOut(long j, LogoutViewModel logoutViewModel, long j2, ErrorCodeResultCallback errorCodeResultCallback);

    public static final native long LogoutViewModel_SWIGSmartPtrUpcast(long j);

    public static final native void delete_LogoutViewModel(long j);
}
