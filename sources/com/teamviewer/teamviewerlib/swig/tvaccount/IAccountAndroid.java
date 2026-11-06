package com.teamviewer.teamviewerlib.swig.tvaccount;

/* JADX INFO: loaded from: classes.dex */
public class IAccountAndroid {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IAccountAndroid(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IAccountAndroid iAccountAndroid) {
        if (iAccountAndroid == null) {
            return 0L;
        }
        return iAccountAndroid.swigCPtr;
    }

    public long GetAccountID() {
        return IAccountAndroidSWIGJNI.IAccountAndroid_GetAccountID(this.swigCPtr, this);
    }

    public String GetAccountPictureUrl() {
        return IAccountAndroidSWIGJNI.IAccountAndroid_GetAccountPictureUrl(this.swigCPtr, this);
    }

    public long GetCompanyID() {
        return IAccountAndroidSWIGJNI.IAccountAndroid_GetCompanyID(this.swigCPtr, this);
    }

    public String GetDisplayName() {
        return IAccountAndroidSWIGJNI.IAccountAndroid_GetDisplayName(this.swigCPtr, this);
    }

    public String GetEmail() {
        return IAccountAndroidSWIGJNI.IAccountAndroid_GetEmail(this.swigCPtr, this);
    }

    public boolean IsLoggedIn() {
        return IAccountAndroidSWIGJNI.IAccountAndroid_IsLoggedIn(this.swigCPtr, this);
    }

    public boolean IsSessionCommentingEnabled() {
        return IAccountAndroidSWIGJNI.IAccountAndroid_IsSessionCommentingEnabled(this.swigCPtr, this);
    }

    public boolean IsSessionLoggingEnabled() {
        return IAccountAndroidSWIGJNI.IAccountAndroid_IsSessionLoggingEnabled(this.swigCPtr, this);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IAccountAndroidSWIGJNI.delete_IAccountAndroid(j);
                }
                this.swigCPtr = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void finalize() {
        delete();
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }
}
