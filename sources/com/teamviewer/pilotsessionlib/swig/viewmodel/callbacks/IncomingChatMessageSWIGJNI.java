package com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks;

/* JADX INFO: loaded from: classes.dex */
public class IncomingChatMessageSWIGJNI {
    public static final native boolean IncomingChatMessage_isOwnMessage_get(long j, IncomingChatMessage incomingChatMessage);

    public static final native void IncomingChatMessage_isOwnMessage_set(long j, IncomingChatMessage incomingChatMessage, boolean z);

    public static final native boolean IncomingChatMessage_isTranslated_get(long j, IncomingChatMessage incomingChatMessage);

    public static final native void IncomingChatMessage_isTranslated_set(long j, IncomingChatMessage incomingChatMessage, boolean z);

    public static final native long IncomingChatMessage_messageId_get(long j, IncomingChatMessage incomingChatMessage);

    public static final native void IncomingChatMessage_messageId_set(long j, IncomingChatMessage incomingChatMessage, long j2);

    public static final native int IncomingChatMessage_participantColor_get(long j, IncomingChatMessage incomingChatMessage);

    public static final native void IncomingChatMessage_participantColor_set(long j, IncomingChatMessage incomingChatMessage, int i);

    public static final native long IncomingChatMessage_participantId_get(long j, IncomingChatMessage incomingChatMessage);

    public static final native void IncomingChatMessage_participantId_set(long j, IncomingChatMessage incomingChatMessage, long j2);

    public static final native String IncomingChatMessage_participantName_get(long j, IncomingChatMessage incomingChatMessage);

    public static final native void IncomingChatMessage_participantName_set(long j, IncomingChatMessage incomingChatMessage, String str);

    public static final native int IncomingChatMessage_participantRole_get(long j, IncomingChatMessage incomingChatMessage);

    public static final native void IncomingChatMessage_participantRole_set(long j, IncomingChatMessage incomingChatMessage, int i);

    public static final native String IncomingChatMessage_pictureUrl_get(long j, IncomingChatMessage incomingChatMessage);

    public static final native void IncomingChatMessage_pictureUrl_set(long j, IncomingChatMessage incomingChatMessage, String str);

    public static final native boolean IncomingChatMessage_showHeader_get(long j, IncomingChatMessage incomingChatMessage);

    public static final native void IncomingChatMessage_showHeader_set(long j, IncomingChatMessage incomingChatMessage, boolean z);

    public static final native String IncomingChatMessage_text_get(long j, IncomingChatMessage incomingChatMessage);

    public static final native void IncomingChatMessage_text_set(long j, IncomingChatMessage incomingChatMessage, String str);

    public static final native void delete_IncomingChatMessage(long j);

    public static final native long new_IncomingChatMessage();
}
