package com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks;

/* JADX INFO: loaded from: classes.dex */
public class IncomingSystemMessageSWIGJNI {
    public static final native String IncomingSystemMessage_companyName_get(long j, IncomingSystemMessage incomingSystemMessage);

    public static final native void IncomingSystemMessage_companyName_set(long j, IncomingSystemMessage incomingSystemMessage, String str);

    public static final native boolean IncomingSystemMessage_isTranscriptionRunning_get(long j, IncomingSystemMessage incomingSystemMessage);

    public static final native void IncomingSystemMessage_isTranscriptionRunning_set(long j, IncomingSystemMessage incomingSystemMessage, boolean z);

    public static final native void delete_IncomingSystemMessage(long j);

    public static final native long new_IncomingSystemMessage();
}
