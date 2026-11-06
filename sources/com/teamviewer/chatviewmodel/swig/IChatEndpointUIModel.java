package com.teamviewer.chatviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class IChatEndpointUIModel {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IChatEndpointUIModel(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IChatEndpointUIModel iChatEndpointUIModel) {
        if (iChatEndpointUIModel == null) {
            return 0L;
        }
        return iChatEndpointUIModel.swigCPtr;
    }

    public String GetAccountPictureUrl() {
        return IChatEndpointUIModelSWIGJNI.IChatEndpointUIModel_GetAccountPictureUrl(this.swigCPtr, this);
    }

    public String GetDisplayName() {
        return IChatEndpointUIModelSWIGJNI.IChatEndpointUIModel_GetDisplayName(this.swigCPtr, this);
    }

    public ChatEndpoint GetEndpoint() {
        return new ChatEndpoint(IChatEndpointUIModelSWIGJNI.IChatEndpointUIModel_GetEndpoint(this.swigCPtr, this), true);
    }

    public EndpointUIState GetState() {
        return EndpointUIState.swigToEnum(IChatEndpointUIModelSWIGJNI.IChatEndpointUIModel_GetState(this.swigCPtr, this));
    }

    public ChatEndpointTypeUI GetType() {
        return ChatEndpointTypeUI.swigToEnum(IChatEndpointUIModelSWIGJNI.IChatEndpointUIModel_GetType(this.swigCPtr, this));
    }

    public boolean IsInContacts() {
        return IChatEndpointUIModelSWIGJNI.IChatEndpointUIModel_IsInContacts(this.swigCPtr, this);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IChatEndpointUIModelSWIGJNI.delete_IChatEndpointUIModel(j);
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
