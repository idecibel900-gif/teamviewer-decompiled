package com.teamviewer.commonviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class AccountLoginErrorResultCallbackSWIGJNI {
    static {
        swig_module_init();
    }

    public static final native void AccountLoginErrorResultCallback_PerformDeviceLimitExceededError(long j, AccountLoginErrorResultCallback accountLoginErrorResultCallback);

    public static final native void AccountLoginErrorResultCallback_PerformGenericError(long j, AccountLoginErrorResultCallback accountLoginErrorResultCallback, String str);

    public static final native void AccountLoginErrorResultCallback_PerformSuccess(long j, AccountLoginErrorResultCallback accountLoginErrorResultCallback);

    public static final native void AccountLoginErrorResultCallback_PerformWrongEmailOrPasswordError(long j, AccountLoginErrorResultCallback accountLoginErrorResultCallback);

    public static final native long AccountLoginErrorResultCallback_SWIGUpcast(long j);

    public static final native void AccountLoginErrorResultCallback_change_ownership(AccountLoginErrorResultCallback accountLoginErrorResultCallback, long j, boolean z);

    public static final native void AccountLoginErrorResultCallback_director_connect(AccountLoginErrorResultCallback accountLoginErrorResultCallback, long j, boolean z, boolean z2);

    public static void SwigDirector_AccountLoginErrorResultCallback_OnActivationExpired(AccountLoginErrorResultCallback accountLoginErrorResultCallback, String str) {
        accountLoginErrorResultCallback.OnActivationExpired(str);
    }

    public static void SwigDirector_AccountLoginErrorResultCallback_PerformDeviceLimitExceededError(AccountLoginErrorResultCallback accountLoginErrorResultCallback) {
        accountLoginErrorResultCallback.PerformDeviceLimitExceededError();
    }

    public static void SwigDirector_AccountLoginErrorResultCallback_PerformGenericError(AccountLoginErrorResultCallback accountLoginErrorResultCallback, String str) {
        accountLoginErrorResultCallback.PerformGenericError(str);
    }

    public static void SwigDirector_AccountLoginErrorResultCallback_PerformSuccess(AccountLoginErrorResultCallback accountLoginErrorResultCallback) {
        accountLoginErrorResultCallback.PerformSuccess();
    }

    public static void SwigDirector_AccountLoginErrorResultCallback_PerformWrongEmailOrPasswordError(AccountLoginErrorResultCallback accountLoginErrorResultCallback) {
        accountLoginErrorResultCallback.PerformWrongEmailOrPasswordError();
    }

    public static final native void delete_AccountLoginErrorResultCallback(long j);

    public static final native long new_AccountLoginErrorResultCallback();

    private static final native void swig_module_init();
}
