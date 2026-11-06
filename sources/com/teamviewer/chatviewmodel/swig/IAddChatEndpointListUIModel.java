package com.teamviewer.chatviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class IAddChatEndpointListUIModel extends IChatEndpointListUIModelBase {
    private transient boolean swigCMemOwnDerived;
    private transient long swigCPtr;

    public IAddChatEndpointListUIModel(long j, boolean z) {
        super(IAddChatEndpointListUIModelSWIGJNI.IAddChatEndpointListUIModel_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IAddChatEndpointListUIModel iAddChatEndpointListUIModel) {
        if (iAddChatEndpointListUIModel == null) {
            return 0L;
        }
        return iAddChatEndpointListUIModel.swigCPtr;
    }

    public ChatConversationID AddChatEndpoints(boolean z) {
        return new ChatConversationID(IAddChatEndpointListUIModelSWIGJNI.IAddChatEndpointListUIModel_AddChatEndpoints(this.swigCPtr, this, z), true);
    }

    public boolean CanSharedHistoryRooms() {
        return IAddChatEndpointListUIModelSWIGJNI.IAddChatEndpointListUIModel_CanSharedHistoryRooms(this.swigCPtr, this);
    }

    public boolean IsPrivate() {
        return IAddChatEndpointListUIModelSWIGJNI.IAddChatEndpointListUIModel_IsPrivate(this.swigCPtr, this);
    }

    @Override // com.teamviewer.chatviewmodel.swig.IChatEndpointListUIModelBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwnDerived) {
                    this.swigCMemOwnDerived = false;
                    IAddChatEndpointListUIModelSWIGJNI.delete_IAddChatEndpointListUIModel(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.chatviewmodel.swig.IChatEndpointListUIModelBase
    public void finalize() {
        delete();
    }

    @Override // com.teamviewer.chatviewmodel.swig.IChatEndpointListUIModelBase
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }
}
