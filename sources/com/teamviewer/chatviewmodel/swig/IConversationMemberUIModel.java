package com.teamviewer.chatviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class IConversationMemberUIModel {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IConversationMemberUIModel(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IConversationMemberUIModel iConversationMemberUIModel) {
        if (iConversationMemberUIModel == null) {
            return 0L;
        }
        return iConversationMemberUIModel.swigCPtr;
    }

    public String GetAccountPictureUrl() {
        return IConversationMemberUIModelSWIGJNI.IConversationMemberUIModel_GetAccountPictureUrl(this.swigCPtr, this);
    }

    public ChatEndpoint GetEndpoint() {
        return new ChatEndpoint(IConversationMemberUIModelSWIGJNI.IConversationMemberUIModel_GetEndpoint(this.swigCPtr, this), true);
    }

    public EndpointUIState GetEndpointState() {
        return EndpointUIState.swigToEnum(IConversationMemberUIModelSWIGJNI.IConversationMemberUIModel_GetEndpointState(this.swigCPtr, this));
    }

    public ChatEndpointTypeUI GetEndpointType() {
        return ChatEndpointTypeUI.swigToEnum(IConversationMemberUIModelSWIGJNI.IConversationMemberUIModel_GetEndpointType(this.swigCPtr, this));
    }

    public String GetName() {
        return IConversationMemberUIModelSWIGJNI.IConversationMemberUIModel_GetName(this.swigCPtr, this);
    }

    public boolean IsInContacts() {
        return IConversationMemberUIModelSWIGJNI.IConversationMemberUIModel_IsInContacts(this.swigCPtr, this);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IConversationMemberUIModelSWIGJNI.delete_IConversationMemberUIModel(j);
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
