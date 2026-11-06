package com.teamviewer.chatviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class IRemoteTextMessageUIModel extends IRemoteMessageUIModelBase {
    private transient boolean swigCMemOwnDerived;
    private transient long swigCPtr;

    public IRemoteTextMessageUIModel(long j, boolean z) {
        super(IRemoteTextMessageUIModelSWIGJNI.IRemoteTextMessageUIModel_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IRemoteTextMessageUIModel iRemoteTextMessageUIModel) {
        if (iRemoteTextMessageUIModel == null) {
            return 0L;
        }
        return iRemoteTextMessageUIModel.swigCPtr;
    }

    public String GetMessageContent() {
        return IRemoteTextMessageUIModelSWIGJNI.IRemoteTextMessageUIModel_GetMessageContent(this.swigCPtr, this);
    }

    @Override // com.teamviewer.chatviewmodel.swig.IRemoteMessageUIModelBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwnDerived) {
                    this.swigCMemOwnDerived = false;
                    IRemoteTextMessageUIModelSWIGJNI.delete_IRemoteTextMessageUIModel(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.chatviewmodel.swig.IRemoteMessageUIModelBase
    public void finalize() {
        delete();
    }

    @Override // com.teamviewer.chatviewmodel.swig.IRemoteMessageUIModelBase
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }
}
