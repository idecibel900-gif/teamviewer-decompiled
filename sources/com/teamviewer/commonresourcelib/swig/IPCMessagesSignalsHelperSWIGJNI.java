package com.teamviewer.commonresourcelib.swig;

/* JADX INFO: loaded from: classes.dex */
public class IPCMessagesSignalsHelperSWIGJNI {
    public static final native void IPCMessagesSignalsHelper_RegisterForPopUpMessageChangedSlot(long j, IIPCMessagesViewModel iIPCMessagesViewModel, long j2, MessageDataSignalCallback messageDataSignalCallback);

    public static final native void IPCMessagesSignalsHelper_RegisterForTrayMessageChangedSlot(long j, IIPCMessagesViewModel iIPCMessagesViewModel, long j2, MessageDataSignalCallback messageDataSignalCallback);

    public static final native void delete_IPCMessagesSignalsHelper(long j);
}
