package com.teamviewer.chatviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class IConversationUIModelSWIGJNI {
    public static final native String IConversationUIModel_GetAccountPictureUrl(long j, IConversationUIModel iConversationUIModel);

    public static final native long IConversationUIModel_GetConversationID(long j, IConversationUIModel iConversationUIModel);

    public static final native int IConversationUIModel_GetConversationType(long j, IConversationUIModel iConversationUIModel);

    public static final native int IConversationUIModel_GetEndpointState(long j, IConversationUIModel iConversationUIModel);

    public static final native long IConversationUIModel_GetLastActivityTimestamp(long j, IConversationUIModel iConversationUIModel);

    public static final native long IConversationUIModel_GetProviderConversationID(long j, IConversationUIModel iConversationUIModel);

    public static final native String IConversationUIModel_GetSubTitle(long j, IConversationUIModel iConversationUIModel);

    public static final native String IConversationUIModel_GetTitle(long j, IConversationUIModel iConversationUIModel);

    public static final native boolean IConversationUIModel_HasPersistentHistory(long j, IConversationUIModel iConversationUIModel);

    public static final native boolean IConversationUIModel_HasUnreadMessages(long j, IConversationUIModel iConversationUIModel);

    public static final native boolean IConversationUIModel_IsConversationMuted(long j, IConversationUIModel iConversationUIModel);

    public static final native void delete_IConversationUIModel(long j);
}
