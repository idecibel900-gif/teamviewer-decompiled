package com.teamviewer.chatviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class ChatUIModelLocatorAndroidSWIGJNI {
    public static final native long ChatUIModelLocatorAndroid_GetChatCanBeUsedUIModelAndroid();

    public static final native long ChatUIModelLocatorAndroid_GetChatUIModelLocator();

    public static final native long ChatUIModelLocatorAndroid_GetConversationHistoryListUIModelAndroid(long j, ChatConversationID chatConversationID);

    public static final native long ChatUIModelLocatorAndroid_GetConversationOptionsUIModelAndroid(long j, ChatConversationID chatConversationID);

    public static final native long ChatUIModelLocatorAndroid_GetStartChatUIModelAndroid();

    public static final native long ChatUIModelLocatorAndroid_GetStorageManagerUIModel();

    public static final native void ChatUIModelLocatorAndroid_SetAccountWithReadAccessGetter(long j);

    public static final native void ChatUIModelLocatorAndroid_SetOnlineStateHelperWithReadAccessGetter(long j);

    public static final native void ChatUIModelLocatorAndroid_SetPartnerlistWithReadAccessGetter(long j);

    public static final native void delete_ChatUIModelLocatorAndroid(long j);
}
