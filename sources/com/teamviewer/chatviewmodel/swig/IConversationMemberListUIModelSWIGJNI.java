package com.teamviewer.chatviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class IConversationMemberListUIModelSWIGJNI {
    public static final native long IConversationMemberListUIModel_GetConversationMemberAtPosition(long j, IConversationMemberListUIModel iConversationMemberListUIModel, int i);

    public static final native String IConversationMemberListUIModel_GetConversationName(long j, IConversationMemberListUIModel iConversationMemberListUIModel);

    public static final native int IConversationMemberListUIModel_GetMemberCount(long j, IConversationMemberListUIModel iConversationMemberListUIModel);

    public static final native boolean IConversationMemberListUIModel_IsPrivate(long j, IConversationMemberListUIModel iConversationMemberListUIModel);

    public static final native void delete_IConversationMemberListUIModel(long j);
}
