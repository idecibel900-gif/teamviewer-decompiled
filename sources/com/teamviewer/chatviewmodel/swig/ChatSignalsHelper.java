package com.teamviewer.chatviewmodel.swig;

import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class ChatSignalsHelper {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public ChatSignalsHelper(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static void RegisterChatEndpointChangedSlot(IChatEndpointListUIModelBase iChatEndpointListUIModelBase, VoidSignalCallback voidSignalCallback) {
        ChatSignalsHelperSWIGJNI.ChatSignalsHelper_RegisterChatEndpointChangedSlot(IChatEndpointListUIModelBase.getCPtr(iChatEndpointListUIModelBase), iChatEndpointListUIModelBase, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    public static void RegisterChatEndpointListChangedSlot(IChatEndpointListUIModelBase iChatEndpointListUIModelBase, ListChangeSignalCallback listChangeSignalCallback) {
        ChatSignalsHelperSWIGJNI.ChatSignalsHelper_RegisterChatEndpointListChangedSlot(IChatEndpointListUIModelBase.getCPtr(iChatEndpointListUIModelBase), iChatEndpointListUIModelBase, ListChangeSignalCallback.getCPtr(listChangeSignalCallback), listChangeSignalCallback);
    }

    public static void RegisterConversationChangedSlot(IConversationUIModel iConversationUIModel, VoidSignalCallback voidSignalCallback) {
        ChatSignalsHelperSWIGJNI.ChatSignalsHelper_RegisterConversationChangedSlot(IConversationUIModel.getCPtr(iConversationUIModel), iConversationUIModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    public static void RegisterConversationHistoryListListChangedSlot(IConversationHistoryListUIModel iConversationHistoryListUIModel, ListChangeSignalCallback listChangeSignalCallback) {
        ChatSignalsHelperSWIGJNI.ChatSignalsHelper_RegisterConversationHistoryListListChangedSlot(IConversationHistoryListUIModel.getCPtr(iConversationHistoryListUIModel), iConversationHistoryListUIModel, ListChangeSignalCallback.getCPtr(listChangeSignalCallback), listChangeSignalCallback);
    }

    public static void RegisterConversationHistoryListRemovedChangedSlot(IConversationHistoryListUIModel iConversationHistoryListUIModel, VoidSignalCallback voidSignalCallback) {
        ChatSignalsHelperSWIGJNI.ChatSignalsHelper_RegisterConversationHistoryListRemovedChangedSlot(IConversationHistoryListUIModel.getCPtr(iConversationHistoryListUIModel), iConversationHistoryListUIModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    public static void RegisterConversationHistoryListStatusChangedSlot(IConversationHistoryListUIModel iConversationHistoryListUIModel, VoidSignalCallback voidSignalCallback) {
        ChatSignalsHelperSWIGJNI.ChatSignalsHelper_RegisterConversationHistoryListStatusChangedSlot(IConversationHistoryListUIModel.getCPtr(iConversationHistoryListUIModel), iConversationHistoryListUIModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    public static void RegisterConversationListListChangedSlot(IConversationListUIModel iConversationListUIModel, ListChangeSignalCallback listChangeSignalCallback) {
        ChatSignalsHelperSWIGJNI.ChatSignalsHelper_RegisterConversationListListChangedSlot(IConversationListUIModel.getCPtr(iConversationListUIModel), iConversationListUIModel, ListChangeSignalCallback.getCPtr(listChangeSignalCallback), listChangeSignalCallback);
    }

    public static void RegisterConversationListStatusChangedSlot(IConversationListUIModel iConversationListUIModel, VoidSignalCallback voidSignalCallback) {
        ChatSignalsHelperSWIGJNI.ChatSignalsHelper_RegisterConversationListStatusChangedSlot(IConversationListUIModel.getCPtr(iConversationListUIModel), iConversationListUIModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    public static void RegisterConversationOptionsChangedSlot(IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid, VoidSignalCallback voidSignalCallback) {
        ChatSignalsHelperSWIGJNI.ChatSignalsHelper_RegisterConversationOptionsChangedSlot(IConversationOptionsUIModelAndroid.getCPtr(iConversationOptionsUIModelAndroid), iConversationOptionsUIModelAndroid, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    public static void RegisterErrorMessagesChangedSlot(IErrorMessageHandler iErrorMessageHandler, ErrorMessageSignalCallback errorMessageSignalCallback) {
        ChatSignalsHelperSWIGJNI.ChatSignalsHelper_RegisterErrorMessagesChangedSlot(IErrorMessageHandler.getCPtr(iErrorMessageHandler), iErrorMessageHandler, ErrorMessageSignalCallback.getCPtr(errorMessageSignalCallback), errorMessageSignalCallback);
    }

    public static void RegisterNewMessagesSignalSlot(IUnreadChatMessageHandler iUnreadChatMessageHandler, NewMessageSignalCallback newMessageSignalCallback) {
        ChatSignalsHelperSWIGJNI.ChatSignalsHelper_RegisterNewMessagesSignalSlot(IUnreadChatMessageHandler.getCPtr(iUnreadChatMessageHandler), iUnreadChatMessageHandler, NewMessageSignalCallback.getCPtr(newMessageSignalCallback), newMessageSignalCallback);
    }

    public static void RegisterOwnFileMessageChangedSlot(IOwnFileMessageUIModel iOwnFileMessageUIModel, VoidSignalCallback voidSignalCallback) {
        ChatSignalsHelperSWIGJNI.ChatSignalsHelper_RegisterOwnFileMessageChangedSlot(IOwnFileMessageUIModel.getCPtr(iOwnFileMessageUIModel), iOwnFileMessageUIModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    public static void RegisterOwnFileMessageChangedSlot2(IOwnFileMessageUIModel iOwnFileMessageUIModel, VoidSignalCallback voidSignalCallback) {
        ChatSignalsHelperSWIGJNI.ChatSignalsHelper_RegisterOwnFileMessageChangedSlot2(IOwnFileMessageUIModel.getCPtr(iOwnFileMessageUIModel), iOwnFileMessageUIModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    public static void RegisterOwnTextMessageChangedSlot(IOwnTextMessageUIModel iOwnTextMessageUIModel, VoidSignalCallback voidSignalCallback) {
        ChatSignalsHelperSWIGJNI.ChatSignalsHelper_RegisterOwnTextMessageChangedSlot(IOwnTextMessageUIModel.getCPtr(iOwnTextMessageUIModel), iOwnTextMessageUIModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    public static void RegisterReadSentStateChangedSlot(IReadSentIndicatorUIModel iReadSentIndicatorUIModel, VoidSignalCallback voidSignalCallback) {
        ChatSignalsHelperSWIGJNI.ChatSignalsHelper_RegisterReadSentStateChangedSlot(IReadSentIndicatorUIModel.getCPtr(iReadSentIndicatorUIModel), iReadSentIndicatorUIModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    public static void RegisterRemoteFileMessageChangedSlot(IRemoteFileMessageUIModel iRemoteFileMessageUIModel, VoidSignalCallback voidSignalCallback) {
        ChatSignalsHelperSWIGJNI.ChatSignalsHelper_RegisterRemoteFileMessageChangedSlot(IRemoteFileMessageUIModel.getCPtr(iRemoteFileMessageUIModel), iRemoteFileMessageUIModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    public static void RegisterRemoteFileMessageChangedSlot2(IRemoteFileMessageUIModel iRemoteFileMessageUIModel, VoidSignalCallback voidSignalCallback) {
        ChatSignalsHelperSWIGJNI.ChatSignalsHelper_RegisterRemoteFileMessageChangedSlot2(IRemoteFileMessageUIModel.getCPtr(iRemoteFileMessageUIModel), iRemoteFileMessageUIModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    public static void RegisterRemoteTextMessageChangedSlot(IRemoteTextMessageUIModel iRemoteTextMessageUIModel, VoidSignalCallback voidSignalCallback) {
        ChatSignalsHelperSWIGJNI.ChatSignalsHelper_RegisterRemoteTextMessageChangedSlot(IRemoteTextMessageUIModel.getCPtr(iRemoteTextMessageUIModel), iRemoteTextMessageUIModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    public static long getCPtr(ChatSignalsHelper chatSignalsHelper) {
        if (chatSignalsHelper == null) {
            return 0L;
        }
        return chatSignalsHelper.swigCPtr;
    }

    public static long swigRelease(ChatSignalsHelper chatSignalsHelper) {
        if (chatSignalsHelper != null) {
            if (chatSignalsHelper.swigCMemOwn) {
                long j = chatSignalsHelper.swigCPtr;
                chatSignalsHelper.swigCMemOwn = false;
                chatSignalsHelper.delete();
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
                    ChatSignalsHelperSWIGJNI.delete_ChatSignalsHelper(j);
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
