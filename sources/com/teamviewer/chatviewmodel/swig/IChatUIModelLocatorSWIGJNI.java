package com.teamviewer.chatviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class IChatUIModelLocatorSWIGJNI {
    public static final native long IChatUIModelLocator_GetAddChatEndpointListUIModel(long j, IChatUIModelLocator iChatUIModelLocator, long j2, ChatConversationID chatConversationID);

    public static final native long IChatUIModelLocator_GetChatEndpointListUIModel(long j, IChatUIModelLocator iChatUIModelLocator, long j2, ChatConversationID chatConversationID);

    public static final native long IChatUIModelLocator_GetConversationHistoryListUIModelById(long j, IChatUIModelLocator iChatUIModelLocator, long j2, ChatConversationID chatConversationID);

    public static final native long IChatUIModelLocator_GetConversationListUIModel(long j, IChatUIModelLocator iChatUIModelLocator);

    public static final native long IChatUIModelLocator_GetConversationMemberListUIModel(long j, IChatUIModelLocator iChatUIModelLocator, long j2, ChatConversationID chatConversationID);

    public static final native long IChatUIModelLocator_GetConversationUIModelById(long j, IChatUIModelLocator iChatUIModelLocator, long j2, ChatConversationID chatConversationID);

    public static final native long IChatUIModelLocator_GetErrorMessageHandler(long j, IChatUIModelLocator iChatUIModelLocator);

    public static final native long IChatUIModelLocator_GetEventMessageById(long j, IChatUIModelLocator iChatUIModelLocator, long j2, ChatConversationID chatConversationID, long j3, ChatMessageID chatMessageID);

    public static final native long IChatUIModelLocator_GetOwnFileMessageById(long j, IChatUIModelLocator iChatUIModelLocator, long j2, ChatConversationID chatConversationID, long j3, ChatMessageID chatMessageID);

    public static final native long IChatUIModelLocator_GetOwnTextMessageById(long j, IChatUIModelLocator iChatUIModelLocator, long j2, ChatConversationID chatConversationID, long j3, ChatMessageID chatMessageID);

    public static final native long IChatUIModelLocator_GetRemoteFileMessageById(long j, IChatUIModelLocator iChatUIModelLocator, long j2, ChatConversationID chatConversationID, long j3, ChatMessageID chatMessageID);

    public static final native long IChatUIModelLocator_GetRemoteTextMessageById(long j, IChatUIModelLocator iChatUIModelLocator, long j2, ChatConversationID chatConversationID, long j3, ChatMessageID chatMessageID);

    public static final native long IChatUIModelLocator_GetUnreadChatMessageHandler(long j, IChatUIModelLocator iChatUIModelLocator);

    public static final native void delete_IChatUIModelLocator(long j);
}
