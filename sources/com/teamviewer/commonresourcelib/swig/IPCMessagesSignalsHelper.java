package com.teamviewer.commonresourcelib.swig;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class IPCMessagesSignalsHelper {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IPCMessagesSignalsHelper(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static void RegisterForPopUpMessageChangedSlot(IIPCMessagesViewModel iIPCMessagesViewModel, MessageDataSignalCallback messageDataSignalCallback) {
        IPCMessagesSignalsHelperSWIGJNI.IPCMessagesSignalsHelper_RegisterForPopUpMessageChangedSlot(IIPCMessagesViewModel.getCPtr(iIPCMessagesViewModel), iIPCMessagesViewModel, MessageDataSignalCallback.getCPtr(messageDataSignalCallback), messageDataSignalCallback);
    }

    public static void RegisterForTrayMessageChangedSlot(IIPCMessagesViewModel iIPCMessagesViewModel, MessageDataSignalCallback messageDataSignalCallback) {
        IPCMessagesSignalsHelperSWIGJNI.IPCMessagesSignalsHelper_RegisterForTrayMessageChangedSlot(IIPCMessagesViewModel.getCPtr(iIPCMessagesViewModel), iIPCMessagesViewModel, MessageDataSignalCallback.getCPtr(messageDataSignalCallback), messageDataSignalCallback);
    }

    public static long getCPtr(IPCMessagesSignalsHelper iPCMessagesSignalsHelper) {
        if (iPCMessagesSignalsHelper == null) {
            return 0L;
        }
        return iPCMessagesSignalsHelper.swigCPtr;
    }

    public static long swigRelease(IPCMessagesSignalsHelper iPCMessagesSignalsHelper) {
        if (iPCMessagesSignalsHelper != null) {
            if (iPCMessagesSignalsHelper.swigCMemOwn) {
                long j = iPCMessagesSignalsHelper.swigCPtr;
                iPCMessagesSignalsHelper.swigCMemOwn = false;
                iPCMessagesSignalsHelper.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IPCMessagesSignalsHelperSWIGJNI.delete_IPCMessagesSignalsHelper(j);
                }
                this.swigCPtr = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void finalize() {
        delete();
    }
}
