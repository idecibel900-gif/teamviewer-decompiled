package com.teamviewer.chatviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class IConversationListUIModel {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IConversationListUIModel(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IConversationListUIModel iConversationListUIModel) {
        if (iConversationListUIModel == null) {
            return 0L;
        }
        return iConversationListUIModel.swigCPtr;
    }

    public boolean CanCreateNewConversation() {
        return IConversationListUIModelSWIGJNI.IConversationListUIModel_CanCreateNewConversation(this.swigCPtr, this);
    }

    public boolean CanSearchForRooms() {
        return IConversationListUIModelSWIGJNI.IConversationListUIModel_CanSearchForRooms(this.swigCPtr, this);
    }

    public ChatConversationID GetConversationAtPosition(long j) {
        return new ChatConversationID(IConversationListUIModelSWIGJNI.IConversationListUIModel_GetConversationAtPosition(this.swigCPtr, this, j), true);
    }

    public ChatConversationID GetConversationGuidForProviderId(String str) {
        return new ChatConversationID(IConversationListUIModelSWIGJNI.IConversationListUIModel_GetConversationGuidForProviderId(this.swigCPtr, this, str), true);
    }

    public long GetNumberOfConversations() {
        return IConversationListUIModelSWIGJNI.IConversationListUIModel_GetNumberOfConversations(this.swigCPtr, this);
    }

    public boolean HasMoreConversations() {
        return IConversationListUIModelSWIGJNI.IConversationListUIModel_HasMoreConversations(this.swigCPtr, this);
    }

    public boolean IsLoading() {
        return IConversationListUIModelSWIGJNI.IConversationListUIModel_IsLoading(this.swigCPtr, this);
    }

    public void LoadMoreConversations(int i) {
        IConversationListUIModelSWIGJNI.IConversationListUIModel_LoadMoreConversations(this.swigCPtr, this, i);
    }

    public ChatConversationID RequestNewRoom() {
        return new ChatConversationID(IConversationListUIModelSWIGJNI.IConversationListUIModel_RequestNewRoom(this.swigCPtr, this), true);
    }

    public void ResetRoomSearch() {
        IConversationListUIModelSWIGJNI.IConversationListUIModel_ResetRoomSearch(this.swigCPtr, this);
    }

    public void SelectRoomFromSearch(ChatConversationID chatConversationID) {
        IConversationListUIModelSWIGJNI.IConversationListUIModel_SelectRoomFromSearch(this.swigCPtr, this, ChatConversationID.getCPtr(chatConversationID), chatConversationID);
    }

    public void StartRoomSearch(String str) {
        IConversationListUIModelSWIGJNI.IConversationListUIModel_StartRoomSearch(this.swigCPtr, this, str);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IConversationListUIModelSWIGJNI.delete_IConversationListUIModel(j);
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
