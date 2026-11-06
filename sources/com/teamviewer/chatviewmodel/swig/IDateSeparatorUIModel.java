package com.teamviewer.chatviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class IDateSeparatorUIModel {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IDateSeparatorUIModel(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IDateSeparatorUIModel iDateSeparatorUIModel) {
        if (iDateSeparatorUIModel == null) {
            return 0L;
        }
        return iDateSeparatorUIModel.swigCPtr;
    }

    public long GetTimestamp() {
        return IDateSeparatorUIModelSWIGJNI.IDateSeparatorUIModel_GetTimestamp(this.swigCPtr, this);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IDateSeparatorUIModelSWIGJNI.delete_IDateSeparatorUIModel(j);
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
