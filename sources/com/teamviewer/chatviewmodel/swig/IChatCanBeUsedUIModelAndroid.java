package com.teamviewer.chatviewmodel.swig;

import com.teamviewer.nativelivedatalib.swig.NativeLiveDataBool;

/* JADX INFO: loaded from: classes.dex */
public class IChatCanBeUsedUIModelAndroid {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IChatCanBeUsedUIModelAndroid(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IChatCanBeUsedUIModelAndroid iChatCanBeUsedUIModelAndroid) {
        if (iChatCanBeUsedUIModelAndroid == null) {
            return 0L;
        }
        return iChatCanBeUsedUIModelAndroid.swigCPtr;
    }

    public NativeLiveDataBool CanChatBeUsed() {
        return NativeLiveDataBool.newInstance(IChatCanBeUsedUIModelAndroidSWIGJNI.IChatCanBeUsedUIModelAndroid_CanChatBeUsed(this.swigCPtr, this), false);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IChatCanBeUsedUIModelAndroidSWIGJNI.delete_IChatCanBeUsedUIModelAndroid(j);
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
