package com.teamviewer.oneapinetworklib.swig;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class IOneAPIResponseListener {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IOneAPIResponseListener() {
        this(OneAPIResponseListenerSWIGJNI.new_IOneAPIResponseListener(), true);
        OneAPIResponseListenerSWIGJNI.IOneAPIResponseListener_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(IOneAPIResponseListener iOneAPIResponseListener) {
        if (iOneAPIResponseListener == null) {
            return 0L;
        }
        return iOneAPIResponseListener.swigCPtr;
    }

    public static long swigRelease(IOneAPIResponseListener iOneAPIResponseListener) {
        if (iOneAPIResponseListener != null) {
            if (iOneAPIResponseListener.swigCMemOwn) {
                long j = iOneAPIResponseListener.swigCPtr;
                iOneAPIResponseListener.swigCMemOwn = false;
                iOneAPIResponseListener.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public void OnResponse(OneAPIResponseAndroid oneAPIResponseAndroid) {
        OneAPIResponseListenerSWIGJNI.IOneAPIResponseListener_OnResponse(this.swigCPtr, this, OneAPIResponseAndroid.getCPtr(oneAPIResponseAndroid), oneAPIResponseAndroid);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    OneAPIResponseListenerSWIGJNI.delete_IOneAPIResponseListener(j);
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

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        OneAPIResponseListenerSWIGJNI.IOneAPIResponseListener_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        OneAPIResponseListenerSWIGJNI.IOneAPIResponseListener_change_ownership(this, this.swigCPtr, true);
    }

    public IOneAPIResponseListener(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
