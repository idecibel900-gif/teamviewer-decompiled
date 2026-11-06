package com.teamviewer.chatviewmodel.swig;

import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public class ChatSignalsHelperSWIGJNI {
    public static final native void ChatSignalsHelper_RegisterChatEndpointChangedSlot(long j, IChatEndpointListUIModelBase iChatEndpointListUIModelBase, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void ChatSignalsHelper_RegisterChatEndpointListChangedSlot(long j, IChatEndpointListUIModelBase iChatEndpointListUIModelBase, long j2, ListChangeSignalCallback listChangeSignalCallback);

    public static final native void ChatSignalsHelper_RegisterConversationChangedSlot(long j, IConversationUIModel iConversationUIModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void ChatSignalsHelper_RegisterConversationHistoryListListChangedSlot(long j, IConversationHistoryListUIModel iConversationHistoryListUIModel, long j2, ListChangeSignalCallback listChangeSignalCallback);

    public static final native void ChatSignalsHelper_RegisterConversationHistoryListRemovedChangedSlot(long j, IConversationHistoryListUIModel iConversationHistoryListUIModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void ChatSignalsHelper_RegisterConversationHistoryListStatusChangedSlot(long j, IConversationHistoryListUIModel iConversationHistoryListUIModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void ChatSignalsHelper_RegisterConversationListListChangedSlot(long j, IConversationListUIModel iConversationListUIModel, long j2, ListChangeSignalCallback listChangeSignalCallback);

    public static final native void ChatSignalsHelper_RegisterConversationListStatusChangedSlot(long j, IConversationListUIModel iConversationListUIModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void ChatSignalsHelper_RegisterConversationOptionsChangedSlot(long j, IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void ChatSignalsHelper_RegisterErrorMessagesChangedSlot(long j, IErrorMessageHandler iErrorMessageHandler, long j2, ErrorMessageSignalCallback errorMessageSignalCallback);

    public static final native void ChatSignalsHelper_RegisterNewMessagesSignalSlot(long j, IUnreadChatMessageHandler iUnreadChatMessageHandler, long j2, NewMessageSignalCallback newMessageSignalCallback);

    public static final native void ChatSignalsHelper_RegisterOwnFileMessageChangedSlot(long j, IOwnFileMessageUIModel iOwnFileMessageUIModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void ChatSignalsHelper_RegisterOwnFileMessageChangedSlot2(long j, IOwnFileMessageUIModel iOwnFileMessageUIModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void ChatSignalsHelper_RegisterOwnTextMessageChangedSlot(long j, IOwnTextMessageUIModel iOwnTextMessageUIModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void ChatSignalsHelper_RegisterReadSentStateChangedSlot(long j, IReadSentIndicatorUIModel iReadSentIndicatorUIModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void ChatSignalsHelper_RegisterRemoteFileMessageChangedSlot(long j, IRemoteFileMessageUIModel iRemoteFileMessageUIModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void ChatSignalsHelper_RegisterRemoteFileMessageChangedSlot2(long j, IRemoteFileMessageUIModel iRemoteFileMessageUIModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void ChatSignalsHelper_RegisterRemoteTextMessageChangedSlot(long j, IRemoteTextMessageUIModel iRemoteTextMessageUIModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void delete_ChatSignalsHelper(long j);
}
