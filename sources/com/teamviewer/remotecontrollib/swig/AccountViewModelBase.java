package com.teamviewer.remotecontrollib.swig;

/* JADX INFO: loaded from: classes.dex */
public class AccountViewModelBase {
    public transient long a;
    public transient boolean b = true;

    public AccountViewModelBase(long j) {
        this.a = j;
    }

    public final LoginState a() {
        return LoginState.a(AccountViewModelBaseSWIGJNI.AccountViewModelBase_GetLoginState(this.a, this));
    }

    public final void b(AccountLoginStateChangedSignalCallbackImpl accountLoginStateChangedSignalCallbackImpl) {
        AccountViewModelBaseSWIGJNI.AccountViewModelBase_RegisterForChanges(this.a, this, AccountLoginStateChangedSignalCallback.getCPtr((AccountLoginStateChangedSignalCallback) accountLoginStateChangedSignalCallbackImpl), accountLoginStateChangedSignalCallbackImpl);
    }

    public synchronized void c() {
        try {
            long j = this.a;
            if (j != 0) {
                if (this.b) {
                    this.b = false;
                    AccountViewModelBaseSWIGJNI.delete_AccountViewModelBase(j);
                }
                this.a = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void finalize() {
        c();
    }
}
