package com.teamviewer.oneapinetworklib.swig;

/* JADX INFO: loaded from: classes.dex */
public class OneAPIRequestHandlerAndroid {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public OneAPIRequestHandlerAndroid(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static OneAPIRequestHandlerAndroid Create() {
        long jOneAPIRequestHandlerAndroid_Create = OneAPIRequestHandlerAndroidSWIGJNI.OneAPIRequestHandlerAndroid_Create();
        if (jOneAPIRequestHandlerAndroid_Create == 0) {
            return null;
        }
        return new OneAPIRequestHandlerAndroid(jOneAPIRequestHandlerAndroid_Create, true);
    }

    public static long getCPtr(OneAPIRequestHandlerAndroid oneAPIRequestHandlerAndroid) {
        if (oneAPIRequestHandlerAndroid == null) {
            return 0L;
        }
        return oneAPIRequestHandlerAndroid.swigCPtr;
    }

    public void HandleRequest(String str, IOneAPIResponseListener iOneAPIResponseListener) {
        OneAPIRequestHandlerAndroidSWIGJNI.OneAPIRequestHandlerAndroid_HandleRequest(this.swigCPtr, this, str, IOneAPIResponseListener.getCPtr(iOneAPIResponseListener), iOneAPIResponseListener);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    OneAPIRequestHandlerAndroidSWIGJNI.delete_OneAPIRequestHandlerAndroid(j);
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
