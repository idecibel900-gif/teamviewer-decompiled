package com.teamviewer.remotecontrolviewmodellib.swig;

import com.teamviewer.swigcallbacklib.IntSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class ISupportMessagesClientViewModelSWIGJNI {
    public static final native void ISupportMessagesClientViewModel_RegisterForAppInBackground(long j, ISupportMessagesClientViewModel iSupportMessagesClientViewModel, long j2, IntSignalCallback intSignalCallback);

    public static final native void ISupportMessagesClientViewModel_RegisterForConnectionLost(long j, ISupportMessagesClientViewModel iSupportMessagesClientViewModel, long j2, IntSignalCallback intSignalCallback);

    public static final native void delete_ISupportMessagesClientViewModel(long j);
}
