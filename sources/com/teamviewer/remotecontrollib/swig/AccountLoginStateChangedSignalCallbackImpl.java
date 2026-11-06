package com.teamviewer.remotecontrollib.swig;

import o.hk0;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public abstract class AccountLoginStateChangedSignalCallbackImpl extends AccountLoginStateChangedSignalCallback {
    private transient long swigCPtr;

    public AccountLoginStateChangedSignalCallbackImpl() {
        this(AccountLoginStateChangedSignalCallbackImplSWIGJNI.new_AccountLoginStateChangedSignalCallbackImpl(), true);
        AccountLoginStateChangedSignalCallbackImplSWIGJNI.AccountLoginStateChangedSignalCallbackImpl_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(AccountLoginStateChangedSignalCallbackImpl accountLoginStateChangedSignalCallbackImpl) {
        if (accountLoginStateChangedSignalCallbackImpl == null) {
            return 0L;
        }
        return accountLoginStateChangedSignalCallbackImpl.swigCPtr;
    }

    public static long swigRelease(AccountLoginStateChangedSignalCallbackImpl accountLoginStateChangedSignalCallbackImpl) {
        if (accountLoginStateChangedSignalCallbackImpl != null) {
            if (accountLoginStateChangedSignalCallbackImpl.swigCMemOwn) {
                long j = accountLoginStateChangedSignalCallbackImpl.swigCPtr;
                accountLoginStateChangedSignalCallbackImpl.swigCMemOwn = false;
                accountLoginStateChangedSignalCallbackImpl.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public void PerformCallback(LoginState loginState) {
        try {
            OnCallback(loginState);
        } catch (Throwable th) {
            ye4.d(getClass().getSimpleName(), th);
            throw th;
        }
    }

    @Override // com.teamviewer.remotecontrollib.swig.AccountLoginStateChangedSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    AccountLoginStateChangedSignalCallbackImplSWIGJNI.delete_AccountLoginStateChangedSignalCallbackImpl(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.remotecontrollib.swig.AccountLoginStateChangedSignalCallback, com.teamviewer.swigcallbacklib.SignalCallbackBase
    public void finalize() {
        delete();
    }

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        AccountLoginStateChangedSignalCallbackImplSWIGJNI.AccountLoginStateChangedSignalCallbackImpl_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        AccountLoginStateChangedSignalCallbackImplSWIGJNI.AccountLoginStateChangedSignalCallbackImpl_change_ownership(this, this.swigCPtr, true);
    }

    public AccountLoginStateChangedSignalCallbackImpl(long j, boolean z) {
        super(AccountLoginStateChangedSignalCallbackImplSWIGJNI.AccountLoginStateChangedSignalCallbackImpl_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }
}
