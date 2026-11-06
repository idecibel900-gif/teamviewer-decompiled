package com.teamviewer.chatviewmodel.swig;

import com.teamviewer.nativelivedatalib.swig.NativeLiveDataBool;
import com.teamviewer.nativelivedatalib.swig.NativeLiveDataInt;
import com.teamviewer.nativelivedatalib.swig.NativeLiveDataStringUTF8;

/* JADX INFO: loaded from: classes.dex */
public class IConversationHistoryListUIModelAndroid {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IConversationHistoryListUIModelAndroid(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IConversationHistoryListUIModelAndroid iConversationHistoryListUIModelAndroid) {
        if (iConversationHistoryListUIModelAndroid == null) {
            return 0L;
        }
        return iConversationHistoryListUIModelAndroid.swigCPtr;
    }

    public NativeLiveDataStringUTF8 CurrentUploadFileName() {
        return NativeLiveDataStringUTF8.newInstance(IConversationHistoryListUIModelAndroidSWIGJNI.IConversationHistoryListUIModelAndroid_CurrentUploadFileName(this.swigCPtr, this), false);
    }

    public NativeLiveDataInt CurrentUploadProgress() {
        return NativeLiveDataInt.newInstance(IConversationHistoryListUIModelAndroidSWIGJNI.IConversationHistoryListUIModelAndroid_CurrentUploadProgress(this.swigCPtr, this), false);
    }

    public NativeLiveDataBool HasQueuedUploads() {
        return NativeLiveDataBool.newInstance(IConversationHistoryListUIModelAndroidSWIGJNI.IConversationHistoryListUIModelAndroid_HasQueuedUploads(this.swigCPtr, this), false);
    }

    public NativeLiveDataInt NumberOfQueuedUploads() {
        return NativeLiveDataInt.newInstance(IConversationHistoryListUIModelAndroidSWIGJNI.IConversationHistoryListUIModelAndroid_NumberOfQueuedUploads(this.swigCPtr, this), false);
    }

    public void PrepareUpload(String str) {
        IConversationHistoryListUIModelAndroidSWIGJNI.IConversationHistoryListUIModelAndroid_PrepareUpload(this.swigCPtr, this, str);
    }

    public void PrepareUploadFailed() {
        IConversationHistoryListUIModelAndroidSWIGJNI.IConversationHistoryListUIModelAndroid_PrepareUploadFailed(this.swigCPtr, this);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IConversationHistoryListUIModelAndroidSWIGJNI.delete_IConversationHistoryListUIModelAndroid(j);
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
