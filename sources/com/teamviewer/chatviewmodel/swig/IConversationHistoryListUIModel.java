package com.teamviewer.chatviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class IConversationHistoryListUIModel {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IConversationHistoryListUIModel(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IConversationHistoryListUIModel iConversationHistoryListUIModel) {
        if (iConversationHistoryListUIModel == null) {
            return 0L;
        }
        return iConversationHistoryListUIModel.swigCPtr;
    }

    public void CancelAllUploads() {
        IConversationHistoryListUIModelSWIGJNI.IConversationHistoryListUIModel_CancelAllUploads(this.swigCPtr, this);
    }

    public String GetChatRoomPictureURL() {
        return IConversationHistoryListUIModelSWIGJNI.IConversationHistoryListUIModel_GetChatRoomPictureURL(this.swigCPtr, this);
    }

    public ChatConversationID GetConversationID() {
        return new ChatConversationID(IConversationHistoryListUIModelSWIGJNI.IConversationHistoryListUIModel_GetConversationID(this.swigCPtr, this), true);
    }

    public IConversationMemberUIModel GetConversationMemberUIModel() {
        long jIConversationHistoryListUIModel_GetConversationMemberUIModel = IConversationHistoryListUIModelSWIGJNI.IConversationHistoryListUIModel_GetConversationMemberUIModel(this.swigCPtr, this);
        if (jIConversationHistoryListUIModel_GetConversationMemberUIModel == 0) {
            return null;
        }
        return new IConversationMemberUIModel(jIConversationHistoryListUIModel_GetConversationMemberUIModel, true);
    }

    public IDateSeparatorUIModel GetDateSeparatorUIModelById(ChatMessageID chatMessageID) {
        long jIConversationHistoryListUIModel_GetDateSeparatorUIModelById = IConversationHistoryListUIModelSWIGJNI.IConversationHistoryListUIModel_GetDateSeparatorUIModelById(this.swigCPtr, this, ChatMessageID.getCPtr(chatMessageID), chatMessageID);
        if (jIConversationHistoryListUIModel_GetDateSeparatorUIModelById == 0) {
            return null;
        }
        return new IDateSeparatorUIModel(jIConversationHistoryListUIModel_GetDateSeparatorUIModelById, true);
    }

    public boolean GetHasMoreMessages() {
        return IConversationHistoryListUIModelSWIGJNI.IConversationHistoryListUIModel_GetHasMoreMessages(this.swigCPtr, this);
    }

    public String GetLastTypedMessage() {
        return IConversationHistoryListUIModelSWIGJNI.IConversationHistoryListUIModel_GetLastTypedMessage(this.swigCPtr, this);
    }

    public ChatMessageID GetMessageAtPosition(int i) {
        return new ChatMessageID(IConversationHistoryListUIModelSWIGJNI.IConversationHistoryListUIModel_GetMessageAtPosition(this.swigCPtr, this, i), true);
    }

    public String GetNewestChatMessage() {
        return IConversationHistoryListUIModelSWIGJNI.IConversationHistoryListUIModel_GetNewestChatMessage(this.swigCPtr, this);
    }

    public int GetNumberOfMessages() {
        return IConversationHistoryListUIModelSWIGJNI.IConversationHistoryListUIModel_GetNumberOfMessages(this.swigCPtr, this);
    }

    public ChatConversationID GetProviderRoomID() {
        return new ChatConversationID(IConversationHistoryListUIModelSWIGJNI.IConversationHistoryListUIModel_GetProviderRoomID(this.swigCPtr, this), true);
    }

    public IReadSentIndicatorUIModel GetReadSentIndicatorUIModelById(ChatMessageID chatMessageID) {
        long jIConversationHistoryListUIModel_GetReadSentIndicatorUIModelById = IConversationHistoryListUIModelSWIGJNI.IConversationHistoryListUIModel_GetReadSentIndicatorUIModelById(this.swigCPtr, this, ChatMessageID.getCPtr(chatMessageID), chatMessageID);
        if (jIConversationHistoryListUIModel_GetReadSentIndicatorUIModelById == 0) {
            return null;
        }
        return new IReadSentIndicatorUIModel(jIConversationHistoryListUIModel_GetReadSentIndicatorUIModelById, true);
    }

    public String GetTitle() {
        return IConversationHistoryListUIModelSWIGJNI.IConversationHistoryListUIModel_GetTitle(this.swigCPtr, this);
    }

    public boolean HasSharedHistory() {
        return IConversationHistoryListUIModelSWIGJNI.IConversationHistoryListUIModel_HasSharedHistory(this.swigCPtr, this);
    }

    public boolean IsGroupChat() {
        return IConversationHistoryListUIModelSWIGJNI.IConversationHistoryListUIModel_IsGroupChat(this.swigCPtr, this);
    }

    public boolean IsLoading() {
        return IConversationHistoryListUIModelSWIGJNI.IConversationHistoryListUIModel_IsLoading(this.swigCPtr, this);
    }

    public boolean IsRemoved() {
        return IConversationHistoryListUIModelSWIGJNI.IConversationHistoryListUIModel_IsRemoved(this.swigCPtr, this);
    }

    public void LoadMoreMessages(long j) {
        IConversationHistoryListUIModelSWIGJNI.IConversationHistoryListUIModel_LoadMoreMessages(this.swigCPtr, this, j);
    }

    public void MessagesRead() {
        IConversationHistoryListUIModelSWIGJNI.IConversationHistoryListUIModel_MessagesRead(this.swigCPtr, this);
    }

    public void SendFile(String str, byte[] bArr) {
        IConversationHistoryListUIModelSWIGJNI.IConversationHistoryListUIModel_SendFile(this.swigCPtr, this, str, bArr);
    }

    public void SendFileData(String str, byte[] bArr, byte[] bArr2) {
        IConversationHistoryListUIModelSWIGJNI.IConversationHistoryListUIModel_SendFileData(this.swigCPtr, this, str, bArr, bArr2);
    }

    public boolean SendMessage(String str) {
        return IConversationHistoryListUIModelSWIGJNI.IConversationHistoryListUIModel_SendMessage(this.swigCPtr, this, str);
    }

    public void SendTypingEvent(boolean z) {
        IConversationHistoryListUIModelSWIGJNI.IConversationHistoryListUIModel_SendTypingEvent(this.swigCPtr, this, z);
    }

    public void SetLastTypedMessage(String str) {
        IConversationHistoryListUIModelSWIGJNI.IConversationHistoryListUIModel_SetLastTypedMessage(this.swigCPtr, this, str);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IConversationHistoryListUIModelSWIGJNI.delete_IConversationHistoryListUIModel(j);
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
