package com.teamviewer.remotecontrollib.swig;

/* JADX INFO: loaded from: classes.dex */
public class AccountLoginStateChangedSignalCallbackImplSWIGJNI {
    static {
        swig_module_init();
    }

    public static final native void AccountLoginStateChangedSignalCallbackImpl_PerformCallback(long j, AccountLoginStateChangedSignalCallbackImpl accountLoginStateChangedSignalCallbackImpl, int i);

    public static final native long AccountLoginStateChangedSignalCallbackImpl_SWIGUpcast(long j);

    public static final native void AccountLoginStateChangedSignalCallbackImpl_change_ownership(AccountLoginStateChangedSignalCallbackImpl accountLoginStateChangedSignalCallbackImpl, long j, boolean z);

    public static final native void AccountLoginStateChangedSignalCallbackImpl_director_connect(AccountLoginStateChangedSignalCallbackImpl accountLoginStateChangedSignalCallbackImpl, long j, boolean z, boolean z2);

    public static void SwigDirector_AccountLoginStateChangedSignalCallbackImpl_PerformCallback(AccountLoginStateChangedSignalCallbackImpl accountLoginStateChangedSignalCallbackImpl, int i) {
        accountLoginStateChangedSignalCallbackImpl.PerformCallback(LoginState.a(i));
    }

    public static final native void delete_AccountLoginStateChangedSignalCallbackImpl(long j);

    public static final native long new_AccountLoginStateChangedSignalCallbackImpl();

    private static final native void swig_module_init();
}
