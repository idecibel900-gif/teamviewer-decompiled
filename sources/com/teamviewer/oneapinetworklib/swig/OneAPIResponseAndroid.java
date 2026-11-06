package com.teamviewer.oneapinetworklib.swig;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class OneAPIResponseAndroid {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public OneAPIResponseAndroid() {
        this(OneAPIResponseAndroidSWIGJNI.new_OneAPIResponseAndroid(), true);
    }

    public static long getCPtr(OneAPIResponseAndroid oneAPIResponseAndroid) {
        if (oneAPIResponseAndroid == null) {
            return 0L;
        }
        return oneAPIResponseAndroid.swigCPtr;
    }

    public static long swigRelease(OneAPIResponseAndroid oneAPIResponseAndroid) {
        if (oneAPIResponseAndroid != null) {
            if (oneAPIResponseAndroid.swigCMemOwn) {
                long j = oneAPIResponseAndroid.swigCPtr;
                oneAPIResponseAndroid.swigCMemOwn = false;
                oneAPIResponseAndroid.delete();
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
                    OneAPIResponseAndroidSWIGJNI.delete_OneAPIResponseAndroid(j);
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

    public String getData() {
        return OneAPIResponseAndroidSWIGJNI.OneAPIResponseAndroid_data_get(this.swigCPtr, this);
    }

    public HttpHeaders getHeaders() {
        long jOneAPIResponseAndroid_headers_get = OneAPIResponseAndroidSWIGJNI.OneAPIResponseAndroid_headers_get(this.swigCPtr, this);
        if (jOneAPIResponseAndroid_headers_get == 0) {
            return null;
        }
        return new HttpHeaders(jOneAPIResponseAndroid_headers_get, false);
    }

    public HttpStatusCode getStatus() {
        return HttpStatusCode.swigToEnum(OneAPIResponseAndroidSWIGJNI.OneAPIResponseAndroid_status_get(this.swigCPtr, this));
    }

    public String getStatusText() {
        return OneAPIResponseAndroidSWIGJNI.OneAPIResponseAndroid_statusText_get(this.swigCPtr, this);
    }

    public void setData(String str) {
        OneAPIResponseAndroidSWIGJNI.OneAPIResponseAndroid_data_set(this.swigCPtr, this, str);
    }

    public void setHeaders(HttpHeaders httpHeaders) {
        OneAPIResponseAndroidSWIGJNI.OneAPIResponseAndroid_headers_set(this.swigCPtr, this, HttpHeaders.getCPtr(httpHeaders), httpHeaders);
    }

    public void setStatus(HttpStatusCode httpStatusCode) {
        OneAPIResponseAndroidSWIGJNI.OneAPIResponseAndroid_status_set(this.swigCPtr, this, httpStatusCode.swigValue());
    }

    public void setStatusText(String str) {
        OneAPIResponseAndroidSWIGJNI.OneAPIResponseAndroid_statusText_set(this.swigCPtr, this, str);
    }

    public OneAPIResponseAndroid(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
