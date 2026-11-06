package com.teamviewer.chatviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class IChatEndpointListUIModel extends IChatEndpointListUIModelBase {
    private transient boolean swigCMemOwnDerived;
    private transient long swigCPtr;

    public IChatEndpointListUIModel(long j, boolean z) {
        super(IChatEndpointListUIModelSWIGJNI.IChatEndpointListUIModel_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IChatEndpointListUIModel iChatEndpointListUIModel) {
        if (iChatEndpointListUIModel == null) {
            return 0L;
        }
        return iChatEndpointListUIModel.swigCPtr;
    }

    public boolean CanRequestConversation() {
        return IChatEndpointListUIModelSWIGJNI.IChatEndpointListUIModel_CanRequestConversation(this.swigCPtr, this);
    }

    public boolean CanSharedHistoryRooms() {
        return IChatEndpointListUIModelSWIGJNI.IChatEndpointListUIModel_CanSharedHistoryRooms(this.swigCPtr, this);
    }

    public void RemoveNewConversation() {
        IChatEndpointListUIModelSWIGJNI.IChatEndpointListUIModel_RemoveNewConversation(this.swigCPtr, this);
    }

    public ChatConversationID RequestConversation(boolean z) {
        return new ChatConversationID(IChatEndpointListUIModelSWIGJNI.IChatEndpointListUIModel_RequestConversation(this.swigCPtr, this, z), true);
    }

    @Override // com.teamviewer.chatviewmodel.swig.IChatEndpointListUIModelBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwnDerived) {
                    this.swigCMemOwnDerived = false;
                    IChatEndpointListUIModelSWIGJNI.delete_IChatEndpointListUIModel(j);
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
