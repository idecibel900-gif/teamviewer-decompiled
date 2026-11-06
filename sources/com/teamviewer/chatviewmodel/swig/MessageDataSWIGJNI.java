package com.teamviewer.chatviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class MessageDataSWIGJNI {
    public static final native String MessageData_chatRoomId_get(long j, MessageData messageData);

    public static final native void MessageData_chatRoomId_set(long j, MessageData messageData, String str);

    public static final native String MessageData_senderDisplayName_get(long j, MessageData messageData);

    public static final native void MessageData_senderDisplayName_set(long j, MessageData messageData, String str);

    public static final native void delete_MessageData(long j);

    public static final native long new_MessageData();
}
