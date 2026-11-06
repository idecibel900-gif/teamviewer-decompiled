package com.teamviewer.chatviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class IConversationHistoryListUIModelSWIGJNI {
    public static final native void IConversationHistoryListUIModel_CancelAllUploads(long j, IConversationHistoryListUIModel iConversationHistoryListUIModel);

    public static final native String IConversationHistoryListUIModel_GetChatRoomPictureURL(long j, IConversationHistoryListUIModel iConversationHistoryListUIModel);

    public static final native long IConversationHistoryListUIModel_GetConversationID(long j, IConversationHistoryListUIModel iConversationHistoryListUIModel);

    public static final native long IConversationHistoryListUIModel_GetConversationMemberUIModel(long j, IConversationHistoryListUIModel iConversationHistoryListUIModel);

    public static final native long IConversationHistoryListUIModel_GetDateSeparatorUIModelById(long j, IConversationHistoryListUIModel iConversationHistoryListUIModel, long j2, ChatMessageID chatMessageID);

    public static final native boolean IConversationHistoryListUIModel_GetHasMoreMessages(long j, IConversationHistoryListUIModel iConversationHistoryListUIModel);

    public static final native String IConversationHistoryListUIModel_GetLastTypedMessage(long j, IConversationHistoryListUIModel iConversationHistoryListUIModel);

    public static final native long IConversationHistoryListUIModel_GetMessageAtPosition(long j, IConversationHistoryListUIModel iConversationHistoryListUIModel, int i);

    public static final native String IConversationHistoryListUIModel_GetNewestChatMessage(long j, IConversationHistoryListUIModel iConversationHistoryListUIModel);

    public static final native int IConversationHistoryListUIModel_GetNumberOfMessages(long j, IConversationHistoryListUIModel iConversationHistoryListUIModel);

    public static final native long IConversationHistoryListUIModel_GetProviderRoomID(long j, IConversationHistoryListUIModel iConversationHistoryListUIModel);

    public static final native long IConversationHistoryListUIModel_GetReadSentIndicatorUIModelById(long j, IConversationHistoryListUIModel iConversationHistoryListUIModel, long j2, ChatMessageID chatMessageID);

    public static final native String IConversationHistoryListUIModel_GetTitle(long j, IConversationHistoryListUIModel iConversationHistoryListUIModel);

    public static final native boolean IConversationHistoryListUIModel_HasSharedHistory(long j, IConversationHistoryListUIModel iConversationHistoryListUIModel);

    public static final native boolean IConversationHistoryListUIModel_IsGroupChat(long j, IConversationHistoryListUIModel iConversationHistoryListUIModel);

    public static final native boolean IConversationHistoryListUIModel_IsLoading(long j, IConversationHistoryListUIModel iConversationHistoryListUIModel);

    public static final native boolean IConversationHistoryListUIModel_IsRemoved(long j, IConversationHistoryListUIModel iConversationHistoryListUIModel);

    public static final native void IConversationHistoryListUIModel_LoadMoreMessages(long j, IConversationHistoryListUIModel iConversationHistoryListUIModel, long j2);

    public static final native void IConversationHistoryListUIModel_MessagesRead(long j, IConversationHistoryListUIModel iConversationHistoryListUIModel);

    public static final native void IConversationHistoryListUIModel_SendFile(long j, IConversationHistoryListUIModel iConversationHistoryListUIModel, String str, byte[] bArr);

    public static final native void IConversationHistoryListUIModel_SendFileData(long j, IConversationHistoryListUIModel iConversationHistoryListUIModel, String str, byte[] bArr, byte[] bArr2);

    public static final native boolean IConversationHistoryListUIModel_SendMessage(long j, IConversationHistoryListUIModel iConversationHistoryListUIModel, String str);

    public static final native void IConversationHistoryListUIModel_SendTypingEvent(long j, IConversationHistoryListUIModel iConversationHistoryListUIModel, boolean z);

    public static final native void IConversationHistoryListUIModel_SetLastTypedMessage(long j, IConversationHistoryListUIModel iConversationHistoryListUIModel, String str);

    public static final native void delete_IConversationHistoryListUIModel(long j);
}
