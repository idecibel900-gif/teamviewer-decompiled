package com.teamviewer.chatviewmodel.swig;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class ChatDataSWIGJNI {
    public static final native String AzureMetadataKeyChatEndpoint_get();

    public static final native String AzureMetadataKeyChatRoomId_get();

    public static final native boolean ChatEndpoint_Equal(long j, ChatEndpoint chatEndpoint, long j2, ChatEndpoint chatEndpoint2);

    public static final native long ChatEndpoint_Id_get(long j, ChatEndpoint chatEndpoint);

    public static final native void ChatEndpoint_Id_set(long j, ChatEndpoint chatEndpoint, long j2);

    public static final native boolean ChatEndpoint_IsAccount(long j, ChatEndpoint chatEndpoint);

    public static final native boolean ChatEndpoint_IsMachine(long j, ChatEndpoint chatEndpoint);

    public static final native boolean ChatEndpoint_IsSessionCode(long j, ChatEndpoint chatEndpoint);

    public static final native boolean ChatEndpoint_IsValid(long j, ChatEndpoint chatEndpoint);

    public static final native boolean ChatEndpoint_LessThan(long j, ChatEndpoint chatEndpoint, long j2, ChatEndpoint chatEndpoint2);

    public static final native boolean ChatEndpoint_NotEqual(long j, ChatEndpoint chatEndpoint, long j2, ChatEndpoint chatEndpoint2);

    public static final native BigInteger ChatEndpoint_Pack(long j, ChatEndpoint chatEndpoint);

    public static final native boolean ChatEndpoint_TryUnpack(BigInteger bigInteger, long j, ChatEndpoint chatEndpoint);

    public static final native long ChatEndpoint_Type_get(long j, ChatEndpoint chatEndpoint);

    public static final native void ChatEndpoint_Type_set(long j, ChatEndpoint chatEndpoint, long j2);

    public static final native long ChatEndpoint_Unpack(BigInteger bigInteger);

    public static final native void delete_ChatEndpoint(long j);

    public static final native long new_ChatEndpoint__SWIG_0();

    public static final native long new_ChatEndpoint__SWIG_1(long j, long j2);
}
