package com.teamviewer.chatviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class ChatMessageIDSWIGJNI {
    public static final native boolean ChatMessageID_Equal(long j, ChatMessageID chatMessageID, long j2, ChatMessageID chatMessageID2);

    public static final native int ChatMessageID_GetType(long j, ChatMessageID chatMessageID);

    public static final native boolean ChatMessageID_LessThan(long j, ChatMessageID chatMessageID, long j2, ChatMessageID chatMessageID2);

    public static final native boolean ChatMessageID_NotEqual(long j, ChatMessageID chatMessageID, long j2, ChatMessageID chatMessageID2);

    public static final native void delete_ChatMessageID(long j);

    public static final native long new_ChatMessageID();
}
