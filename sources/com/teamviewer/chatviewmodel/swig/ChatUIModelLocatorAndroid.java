package com.teamviewer.chatviewmodel.swig;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class ChatUIModelLocatorAndroid {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public ChatUIModelLocatorAndroid(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static IChatCanBeUsedUIModelAndroid GetChatCanBeUsedUIModelAndroid() {
        long jChatUIModelLocatorAndroid_GetChatCanBeUsedUIModelAndroid = ChatUIModelLocatorAndroidSWIGJNI.ChatUIModelLocatorAndroid_GetChatCanBeUsedUIModelAndroid();
        if (jChatUIModelLocatorAndroid_GetChatCanBeUsedUIModelAndroid == 0) {
            return null;
        }
        return new IChatCanBeUsedUIModelAndroid(jChatUIModelLocatorAndroid_GetChatCanBeUsedUIModelAndroid, true);
    }

    public static IChatUIModelLocator GetChatUIModelLocator() {
        long jChatUIModelLocatorAndroid_GetChatUIModelLocator = ChatUIModelLocatorAndroidSWIGJNI.ChatUIModelLocatorAndroid_GetChatUIModelLocator();
        if (jChatUIModelLocatorAndroid_GetChatUIModelLocator == 0) {
            return null;
        }
        return new IChatUIModelLocator(jChatUIModelLocatorAndroid_GetChatUIModelLocator, true);
    }

    public static IConversationHistoryListUIModelAndroid GetConversationHistoryListUIModelAndroid(ChatConversationID chatConversationID) {
        long jChatUIModelLocatorAndroid_GetConversationHistoryListUIModelAndroid = ChatUIModelLocatorAndroidSWIGJNI.ChatUIModelLocatorAndroid_GetConversationHistoryListUIModelAndroid(ChatConversationID.getCPtr(chatConversationID), chatConversationID);
        if (jChatUIModelLocatorAndroid_GetConversationHistoryListUIModelAndroid == 0) {
            return null;
        }
        return new IConversationHistoryListUIModelAndroid(jChatUIModelLocatorAndroid_GetConversationHistoryListUIModelAndroid, true);
    }

    public static IConversationOptionsUIModelAndroid GetConversationOptionsUIModelAndroid(ChatConversationID chatConversationID) {
        long jChatUIModelLocatorAndroid_GetConversationOptionsUIModelAndroid = ChatUIModelLocatorAndroidSWIGJNI.ChatUIModelLocatorAndroid_GetConversationOptionsUIModelAndroid(ChatConversationID.getCPtr(chatConversationID), chatConversationID);
        if (jChatUIModelLocatorAndroid_GetConversationOptionsUIModelAndroid == 0) {
            return null;
        }
        return new IConversationOptionsUIModelAndroid(jChatUIModelLocatorAndroid_GetConversationOptionsUIModelAndroid, true);
    }

    public static IStartChatUIModelAndroid GetStartChatUIModelAndroid() {
        long jChatUIModelLocatorAndroid_GetStartChatUIModelAndroid = ChatUIModelLocatorAndroidSWIGJNI.ChatUIModelLocatorAndroid_GetStartChatUIModelAndroid();
        if (jChatUIModelLocatorAndroid_GetStartChatUIModelAndroid == 0) {
            return null;
        }
        return new IStartChatUIModelAndroid(jChatUIModelLocatorAndroid_GetStartChatUIModelAndroid, true);
    }

    public static IStorageManagerUIModel GetStorageManagerUIModel() {
        long jChatUIModelLocatorAndroid_GetStorageManagerUIModel = ChatUIModelLocatorAndroidSWIGJNI.ChatUIModelLocatorAndroid_GetStorageManagerUIModel();
        if (jChatUIModelLocatorAndroid_GetStorageManagerUIModel == 0) {
            return null;
        }
        return new IStorageManagerUIModel(jChatUIModelLocatorAndroid_GetStorageManagerUIModel, true);
    }

    public static void SetAccountWithReadAccessGetter(SWIGTYPE_p_tvaccount__GetAccountWithReadAccess sWIGTYPE_p_tvaccount__GetAccountWithReadAccess) {
        ChatUIModelLocatorAndroidSWIGJNI.ChatUIModelLocatorAndroid_SetAccountWithReadAccessGetter(SWIGTYPE_p_tvaccount__GetAccountWithReadAccess.getCPtr(sWIGTYPE_p_tvaccount__GetAccountWithReadAccess));
    }

    public static void SetOnlineStateHelperWithReadAccessGetter(SWIGTYPE_p_tvpartnerlist__GetOnlineStateHelperWithReadAccess sWIGTYPE_p_tvpartnerlist__GetOnlineStateHelperWithReadAccess) {
        ChatUIModelLocatorAndroidSWIGJNI.ChatUIModelLocatorAndroid_SetOnlineStateHelperWithReadAccessGetter(SWIGTYPE_p_tvpartnerlist__GetOnlineStateHelperWithReadAccess.getCPtr(sWIGTYPE_p_tvpartnerlist__GetOnlineStateHelperWithReadAccess));
    }

    public static void SetPartnerlistWithReadAccessGetter(SWIGTYPE_p_tvpartnerlist__GetPartnerlistWithReadAccess sWIGTYPE_p_tvpartnerlist__GetPartnerlistWithReadAccess) {
        ChatUIModelLocatorAndroidSWIGJNI.ChatUIModelLocatorAndroid_SetPartnerlistWithReadAccessGetter(SWIGTYPE_p_tvpartnerlist__GetPartnerlistWithReadAccess.getCPtr(sWIGTYPE_p_tvpartnerlist__GetPartnerlistWithReadAccess));
    }

    public static long getCPtr(ChatUIModelLocatorAndroid chatUIModelLocatorAndroid) {
        if (chatUIModelLocatorAndroid == null) {
            return 0L;
        }
        return chatUIModelLocatorAndroid.swigCPtr;
    }

    public static long swigRelease(ChatUIModelLocatorAndroid chatUIModelLocatorAndroid) {
        if (chatUIModelLocatorAndroid != null) {
            if (chatUIModelLocatorAndroid.swigCMemOwn) {
                long j = chatUIModelLocatorAndroid.swigCPtr;
                chatUIModelLocatorAndroid.swigCMemOwn = false;
                chatUIModelLocatorAndroid.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ChatUIModelLocatorAndroidSWIGJNI.delete_ChatUIModelLocatorAndroid(j);
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
}
