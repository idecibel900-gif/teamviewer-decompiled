package com.teamviewer.chatviewmodel.swig;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class IStartChatUIModelAndroid {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IStartChatUIModelAndroid(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IStartChatUIModelAndroid iStartChatUIModelAndroid) {
        if (iStartChatUIModelAndroid == null) {
            return 0L;
        }
        return iStartChatUIModelAndroid.swigCPtr;
    }

    public ChatConversationID RequestPrivateRoomWithEndPoint(BigInteger bigInteger) {
        return new ChatConversationID(IStartChatUIModelAndroidSWIGJNI.IStartChatUIModelAndroid_RequestPrivateRoomWithEndPoint(this.swigCPtr, this, bigInteger), true);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IStartChatUIModelAndroidSWIGJNI.delete_IStartChatUIModelAndroid(j);
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

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }
}
