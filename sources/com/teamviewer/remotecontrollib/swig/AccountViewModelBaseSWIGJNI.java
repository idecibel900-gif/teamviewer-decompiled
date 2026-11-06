package com.teamviewer.remotecontrollib.swig;

/* JADX INFO: loaded from: classes.dex */
public abstract class AccountViewModelBaseSWIGJNI {
    public static final native int AccountViewModelBase_GetLoginState(long j, AccountViewModelBase accountViewModelBase);

    public static final native void AccountViewModelBase_RegisterForChanges(long j, AccountViewModelBase accountViewModelBase, long j2, AccountLoginStateChangedSignalCallback accountLoginStateChangedSignalCallback);

    public static final native void delete_AccountViewModelBase(long j);
}
