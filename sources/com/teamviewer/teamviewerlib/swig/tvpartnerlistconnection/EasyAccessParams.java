package com.teamviewer.teamviewerlib.swig.tvpartnerlistconnection;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class EasyAccessParams {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public EasyAccessParams() {
        this(EasyAccessParamsSWIGJNI.new_EasyAccessParams(), true);
    }

    public static long getCPtr(EasyAccessParams easyAccessParams) {
        if (easyAccessParams == null) {
            return 0L;
        }
        return easyAccessParams.swigCPtr;
    }

    public static long swigRelease(EasyAccessParams easyAccessParams) {
        if (easyAccessParams != null) {
            if (easyAccessParams.swigCMemOwn) {
                long j = easyAccessParams.swigCPtr;
                easyAccessParams.swigCMemOwn = false;
                easyAccessParams.delete();
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
                    EasyAccessParamsSWIGJNI.delete_EasyAccessParams(j);
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

    public EasyAccessParams(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
