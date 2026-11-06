package com.teamviewer.chatviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class ILocalMessageUIModelBase {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public ILocalMessageUIModelBase(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(ILocalMessageUIModelBase iLocalMessageUIModelBase) {
        if (iLocalMessageUIModelBase == null) {
            return 0L;
        }
        return iLocalMessageUIModelBase.swigCPtr;
    }

    public void DeleteMessage() {
        ILocalMessageUIModelBaseSWIGJNI.ILocalMessageUIModelBase_DeleteMessage(this.swigCPtr, this);
    }

    public boolean DeliveryFailed() {
        return ILocalMessageUIModelBaseSWIGJNI.ILocalMessageUIModelBase_DeliveryFailed(this.swigCPtr, this);
    }

    public DeleteOptions GetDeleteOptions() {
        return DeleteOptions.swigToEnum(ILocalMessageUIModelBaseSWIGJNI.ILocalMessageUIModelBase_GetDeleteOptions(this.swigCPtr, this));
    }

    public ResendOptions GetResendOptions() {
        return ResendOptions.swigToEnum(ILocalMessageUIModelBaseSWIGJNI.ILocalMessageUIModelBase_GetResendOptions(this.swigCPtr, this));
    }

    public long GetTimestamp() {
        return ILocalMessageUIModelBaseSWIGJNI.ILocalMessageUIModelBase_GetTimestamp(this.swigCPtr, this);
    }

    public void SendMessageAgain() {
        ILocalMessageUIModelBaseSWIGJNI.ILocalMessageUIModelBase_SendMessageAgain(this.swigCPtr, this);
    }

    public boolean WasRead() {
        return ILocalMessageUIModelBaseSWIGJNI.ILocalMessageUIModelBase_WasRead(this.swigCPtr, this);
    }

    public boolean WasSent() {
        return ILocalMessageUIModelBaseSWIGJNI.ILocalMessageUIModelBase_WasSent(this.swigCPtr, this);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ILocalMessageUIModelBaseSWIGJNI.delete_ILocalMessageUIModelBase(j);
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
