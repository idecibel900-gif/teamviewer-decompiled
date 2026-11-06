package com.teamviewer.chatviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class ConversationIDSWIGJNI {
    public static final native boolean ChatConversationID_Equal(long j, ChatConversationID chatConversationID, long j2, ChatConversationID chatConversationID2);

    public static final native long ChatConversationID_InvalidConversationID_get();

    public static final native boolean ChatConversationID_IsTemporaryRoomForNewConversation(long j, ChatConversationID chatConversationID);

    public static final native boolean ChatConversationID_LessThan(long j, ChatConversationID chatConversationID, long j2, ChatConversationID chatConversationID2);

    public static final native boolean ChatConversationID_NotEqual(long j, ChatConversationID chatConversationID, long j2, ChatConversationID chatConversationID2);

    public static final native void delete_ChatConversationID(long j);

    public static final native long new_ChatConversationID();
}
