package com.teamviewer.chatviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class IChatEndpointListUIModelSWIGJNI {
    public static final native boolean IChatEndpointListUIModel_CanRequestConversation(long j, IChatEndpointListUIModel iChatEndpointListUIModel);

    public static final native boolean IChatEndpointListUIModel_CanSharedHistoryRooms(long j, IChatEndpointListUIModel iChatEndpointListUIModel);

    public static final native void IChatEndpointListUIModel_RemoveNewConversation(long j, IChatEndpointListUIModel iChatEndpointListUIModel);

    public static final native long IChatEndpointListUIModel_RequestConversation(long j, IChatEndpointListUIModel iChatEndpointListUIModel, boolean z);

    public static final native long IChatEndpointListUIModel_SWIGSmartPtrUpcast(long j);

    public static final native void delete_IChatEndpointListUIModel(long j);
}
