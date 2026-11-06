package com.teamviewer.remotecontrollib.swig;

import com.teamviewer.swigcallbacklib.SignalCallbackBase;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public abstract class AccountLoginStateChangedSignalCallback extends SignalCallbackBase {
    private transient long swigCPtr;

    public AccountLoginStateChangedSignalCallback(long j, boolean z) {
        super(AccountLoginStateChangedSignalCallbackSWIGJNI.AccountLoginStateChangedSignalCallback_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public static long getCPtr(AccountLoginStateChangedSignalCallback accountLoginStateChangedSignalCallback) {
        if (accountLoginStateChangedSignalCallback == null) {
            return 0L;
        }
        return accountLoginStateChangedSignalCallback.swigCPtr;
    }

    public static long swigRelease(AccountLoginStateChangedSignalCallback accountLoginStateChangedSignalCallback) {
        if (accountLoginStateChangedSignalCallback != null) {
            if (accountLoginStateChangedSignalCallback.swigCMemOwn) {
                long j = accountLoginStateChangedSignalCallback.swigCPtr;
                accountLoginStateChangedSignalCallback.swigCMemOwn = false;
                accountLoginStateChangedSignalCallback.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public abstract void OnCallback(LoginState loginState);

    @Override // com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    AccountLoginStateChangedSignalCallbackSWIGJNI.delete_AccountLoginStateChangedSignalCallback(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.swigcallbacklib.SignalCallbackBase
    public void finalize() {
        delete();
    }
}
