package com.teamviewer.commonviewmodel.swig;

import o.hk0;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public abstract class AccountLoginErrorResultCallback extends IAccountLoginErrorResultCallback {
    private transient long swigCPtr;

    public AccountLoginErrorResultCallback() {
        this(AccountLoginErrorResultCallbackSWIGJNI.new_AccountLoginErrorResultCallback(), true);
        AccountLoginErrorResultCallbackSWIGJNI.AccountLoginErrorResultCallback_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(AccountLoginErrorResultCallback accountLoginErrorResultCallback) {
        if (accountLoginErrorResultCallback == null) {
            return 0L;
        }
        return accountLoginErrorResultCallback.swigCPtr;
    }

    public static long swigRelease(AccountLoginErrorResultCallback accountLoginErrorResultCallback) {
        if (accountLoginErrorResultCallback != null) {
            if (accountLoginErrorResultCallback.swigCMemOwn) {
                long j = accountLoginErrorResultCallback.swigCPtr;
                accountLoginErrorResultCallback.swigCMemOwn = false;
                accountLoginErrorResultCallback.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public abstract void OnAccountDeviceLimitExceeded();

    @Override // com.teamviewer.commonviewmodel.swig.IAccountLoginErrorResultCallback
    public abstract void OnActivationExpired(String str);

    public abstract void OnGenericError(String str);

    public abstract void OnSuccess();

    public abstract void OnWrongEmailOrPasswordError();

    public void PerformDeviceLimitExceededError() {
        try {
            OnAccountDeviceLimitExceeded();
        } catch (Throwable th) {
            ye4.d("AccountLoginErrorResultCallback", th);
            throw th;
        }
    }

    public void PerformGenericError(String str) {
        try {
            OnGenericError(str);
        } catch (Throwable th) {
            ye4.d("AccountLoginErrorResultCallback", th);
            throw th;
        }
    }

    public void PerformSuccess() {
        try {
            OnSuccess();
        } catch (Throwable th) {
            ye4.d("AccountLoginErrorResultCallback", th);
            throw th;
        }
    }

    public void PerformWrongEmailOrPasswordError() {
        try {
            OnWrongEmailOrPasswordError();
        } catch (Throwable th) {
            ye4.d("AccountLoginErrorResultCallback", th);
            throw th;
        }
    }

    @Override // com.teamviewer.commonviewmodel.swig.IAccountLoginErrorResultCallback
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    AccountLoginErrorResultCallbackSWIGJNI.delete_AccountLoginErrorResultCallback(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.commonviewmodel.swig.IAccountLoginErrorResultCallback
    public void finalize() {
        delete();
    }

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        AccountLoginErrorResultCallbackSWIGJNI.AccountLoginErrorResultCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        AccountLoginErrorResultCallbackSWIGJNI.AccountLoginErrorResultCallback_change_ownership(this, this.swigCPtr, true);
    }

    public AccountLoginErrorResultCallback(long j, boolean z) {
        super(AccountLoginErrorResultCallbackSWIGJNI.AccountLoginErrorResultCallback_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }
}
