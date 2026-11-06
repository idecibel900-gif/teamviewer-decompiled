package com.teamviewer.chatviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class IOwnTextMessageUIModel extends ILocalMessageUIModelBase {
    private transient boolean swigCMemOwnDerived;
    private transient long swigCPtr;

    public IOwnTextMessageUIModel(long j, boolean z) {
        super(IOwnTextMessageUIModelSWIGJNI.IOwnTextMessageUIModel_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IOwnTextMessageUIModel iOwnTextMessageUIModel) {
        if (iOwnTextMessageUIModel == null) {
            return 0L;
        }
        return iOwnTextMessageUIModel.swigCPtr;
    }

    public String GetMessageContent() {
        return IOwnTextMessageUIModelSWIGJNI.IOwnTextMessageUIModel_GetMessageContent(this.swigCPtr, this);
    }

    @Override // com.teamviewer.chatviewmodel.swig.ILocalMessageUIModelBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwnDerived) {
                    this.swigCMemOwnDerived = false;
                    IOwnTextMessageUIModelSWIGJNI.delete_IOwnTextMessageUIModel(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.chatviewmodel.swig.ILocalMessageUIModelBase
    public void finalize() {
        delete();
    }

    @Override // com.teamviewer.chatviewmodel.swig.ILocalMessageUIModelBase
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }
}
