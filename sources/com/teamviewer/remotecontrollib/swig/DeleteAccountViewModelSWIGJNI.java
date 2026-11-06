package com.teamviewer.remotecontrollib.swig;

import com.teamviewer.commonviewmodel.swig.ErrorCodeResultCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class DeleteAccountViewModelSWIGJNI {
    public static final native void DeleteAccountViewModel_DeleteAccount(long j, DeleteAccountViewModel deleteAccountViewModel, long j2, ErrorCodeResultCallback errorCodeResultCallback);

    public static final native boolean DeleteAccountViewModel_IsAccountLoggedIn(long j, DeleteAccountViewModel deleteAccountViewModel);

    public static final native boolean DeleteAccountViewModel_IsCompanyAccount(long j, DeleteAccountViewModel deleteAccountViewModel);

    public static final native long DeleteAccountViewModel_SWIGSmartPtrUpcast(long j);

    public static final native void delete_DeleteAccountViewModel(long j);
}
