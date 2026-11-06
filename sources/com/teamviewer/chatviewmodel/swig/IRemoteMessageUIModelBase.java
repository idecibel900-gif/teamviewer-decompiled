package com.teamviewer.chatviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class IRemoteMessageUIModelBase {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IRemoteMessageUIModelBase(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IRemoteMessageUIModelBase iRemoteMessageUIModelBase) {
        if (iRemoteMessageUIModelBase == null) {
            return 0L;
        }
        return iRemoteMessageUIModelBase.swigCPtr;
    }

    public String GetAccountPictureUrl() {
        return IRemoteMessageUIModelBaseSWIGJNI.IRemoteMessageUIModelBase_GetAccountPictureUrl(this.swigCPtr, this);
    }

    public String GetDisplayName() {
        return IRemoteMessageUIModelBaseSWIGJNI.IRemoteMessageUIModelBase_GetDisplayName(this.swigCPtr, this);
    }

    public long GetTimestamp() {
        return IRemoteMessageUIModelBaseSWIGJNI.IRemoteMessageUIModelBase_GetTimestamp(this.swigCPtr, this);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IRemoteMessageUIModelBaseSWIGJNI.delete_IRemoteMessageUIModelBase(j);
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
