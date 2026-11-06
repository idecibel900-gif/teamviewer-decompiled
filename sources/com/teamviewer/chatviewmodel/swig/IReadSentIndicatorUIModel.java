package com.teamviewer.chatviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class IReadSentIndicatorUIModel {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IReadSentIndicatorUIModel(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IReadSentIndicatorUIModel iReadSentIndicatorUIModel) {
        if (iReadSentIndicatorUIModel == null) {
            return 0L;
        }
        return iReadSentIndicatorUIModel.swigCPtr;
    }

    public ChatMessageState GetState() {
        return ChatMessageState.swigToEnum(IReadSentIndicatorUIModelSWIGJNI.IReadSentIndicatorUIModel_GetState(this.swigCPtr, this));
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IReadSentIndicatorUIModelSWIGJNI.delete_IReadSentIndicatorUIModel(j);
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
