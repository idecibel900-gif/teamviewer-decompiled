package com.teamviewer.oneapinetworklib.swig;

import com.teamviewer.swigcallbacklib.StringSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public class OneAPIEventHandlerAndroid {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public OneAPIEventHandlerAndroid(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static OneAPIEventHandlerAndroid Create() {
        long jOneAPIEventHandlerAndroid_Create = OneAPIEventHandlerAndroidSWIGJNI.OneAPIEventHandlerAndroid_Create();
        if (jOneAPIEventHandlerAndroid_Create == 0) {
            return null;
        }
        return new OneAPIEventHandlerAndroid(jOneAPIEventHandlerAndroid_Create, true);
    }

    public static long getCPtr(OneAPIEventHandlerAndroid oneAPIEventHandlerAndroid) {
        if (oneAPIEventHandlerAndroid == null) {
            return 0L;
        }
        return oneAPIEventHandlerAndroid.swigCPtr;
    }

    public void RegisterForOneAPIEvents(StringSignalCallback stringSignalCallback) {
        OneAPIEventHandlerAndroidSWIGJNI.OneAPIEventHandlerAndroid_RegisterForOneAPIEvents(this.swigCPtr, this, StringSignalCallback.getCPtr(stringSignalCallback), stringSignalCallback);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    OneAPIEventHandlerAndroidSWIGJNI.delete_OneAPIEventHandlerAndroid(j);
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
