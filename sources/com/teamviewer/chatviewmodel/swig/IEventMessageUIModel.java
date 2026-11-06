package com.teamviewer.chatviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class IEventMessageUIModel {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IEventMessageUIModel(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IEventMessageUIModel iEventMessageUIModel) {
        if (iEventMessageUIModel == null) {
            return 0L;
        }
        return iEventMessageUIModel.swigCPtr;
    }

    public String GetMessageContent() {
        return IEventMessageUIModelSWIGJNI.IEventMessageUIModel_GetMessageContent(this.swigCPtr, this);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IEventMessageUIModelSWIGJNI.delete_IEventMessageUIModel(j);
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
