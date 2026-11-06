package com.teamviewer.remotecontrollib.swig;

import com.teamviewer.commonviewmodel.swig.ErrorCodeResultCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class TokenLoginViewModelSWIGJNI {
    public static final native boolean TokenLoginViewModel_IsCurrentlyLoggedIn(long j, TokenLoginViewModel tokenLoginViewModel, String str);

    public static final native long TokenLoginViewModel_SWIGSmartPtrUpcast(long j);

    public static final native void TokenLoginViewModel_TryLogin(long j, TokenLoginViewModel tokenLoginViewModel, String str, String str2, long j2, long j3, ErrorCodeResultCallback errorCodeResultCallback);

    public static final native void delete_TokenLoginViewModel(long j);
}
