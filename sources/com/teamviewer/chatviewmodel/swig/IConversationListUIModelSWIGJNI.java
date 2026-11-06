package com.teamviewer.chatviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class IConversationListUIModelSWIGJNI {
    public static final native void ChatConversationIDVector_clear(long j, ChatConversationIDVector chatConversationIDVector);

    public static final native void ChatConversationIDVector_doAdd__SWIG_0(long j, ChatConversationIDVector chatConversationIDVector, long j2, ChatConversationID chatConversationID);

    public static final native void ChatConversationIDVector_doAdd__SWIG_1(long j, ChatConversationIDVector chatConversationIDVector, int i, long j2, ChatConversationID chatConversationID);

    public static final native int ChatConversationIDVector_doCapacity(long j, ChatConversationIDVector chatConversationIDVector);

    public static final native long ChatConversationIDVector_doGet(long j, ChatConversationIDVector chatConversationIDVector, int i);

    public static final native long ChatConversationIDVector_doRemove(long j, ChatConversationIDVector chatConversationIDVector, int i);

    public static final native void ChatConversationIDVector_doRemoveRange(long j, ChatConversationIDVector chatConversationIDVector, int i, int i2);

    public static final native void ChatConversationIDVector_doReserve(long j, ChatConversationIDVector chatConversationIDVector, int i);

    public static final native long ChatConversationIDVector_doSet(long j, ChatConversationIDVector chatConversationIDVector, int i, long j2, ChatConversationID chatConversationID);

    public static final native int ChatConversationIDVector_doSize(long j, ChatConversationIDVector chatConversationIDVector);

    public static final native boolean ChatConversationIDVector_isEmpty(long j, ChatConversationIDVector chatConversationIDVector);

    public static final native boolean IConversationListUIModel_CanCreateNewConversation(long j, IConversationListUIModel iConversationListUIModel);

    public static final native boolean IConversationListUIModel_CanSearchForRooms(long j, IConversationListUIModel iConversationListUIModel);

    public static final native long IConversationListUIModel_GetConversationAtPosition(long j, IConversationListUIModel iConversationListUIModel, long j2);

    public static final native long IConversationListUIModel_GetConversationGuidForProviderId(long j, IConversationListUIModel iConversationListUIModel, String str);

    public static final native long IConversationListUIModel_GetNumberOfConversations(long j, IConversationListUIModel iConversationListUIModel);

    public static final native boolean IConversationListUIModel_HasMoreConversations(long j, IConversationListUIModel iConversationListUIModel);

    public static final native boolean IConversationListUIModel_IsLoading(long j, IConversationListUIModel iConversationListUIModel);

    public static final native void IConversationListUIModel_LoadMoreConversations(long j, IConversationListUIModel iConversationListUIModel, int i);

    public static final native long IConversationListUIModel_RequestNewRoom(long j, IConversationListUIModel iConversationListUIModel);

    public static final native void IConversationListUIModel_ResetRoomSearch(long j, IConversationListUIModel iConversationListUIModel);

    public static final native void IConversationListUIModel_SelectRoomFromSearch(long j, IConversationListUIModel iConversationListUIModel, long j2, ChatConversationID chatConversationID);

    public static final native void IConversationListUIModel_StartRoomSearch(long j, IConversationListUIModel iConversationListUIModel, String str);

    public static final native void delete_ChatConversationIDVector(long j);

    public static final native void delete_IConversationListUIModel(long j);

    public static final native long new_ChatConversationIDVector__SWIG_0();

    public static final native long new_ChatConversationIDVector__SWIG_1(long j, ChatConversationIDVector chatConversationIDVector);

    public static final native long new_ChatConversationIDVector__SWIG_2(int i, long j, ChatConversationID chatConversationID);
}
