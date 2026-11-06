package com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class DeliverFileDownloadStarted {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DeliverFileDownloadStarted() {
        this(DeliverFileDownloadStartedSWIGJNI.new_DeliverFileDownloadStarted(), true);
    }

    public static long getCPtr(DeliverFileDownloadStarted deliverFileDownloadStarted) {
        if (deliverFileDownloadStarted == null) {
            return 0L;
        }
        return deliverFileDownloadStarted.swigCPtr;
    }

    public static long swigRelease(DeliverFileDownloadStarted deliverFileDownloadStarted) {
        if (deliverFileDownloadStarted != null) {
            if (deliverFileDownloadStarted.swigCMemOwn) {
                long j = deliverFileDownloadStarted.swigCPtr;
                deliverFileDownloadStarted.swigCMemOwn = false;
                deliverFileDownloadStarted.delete();
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
                    DeliverFileDownloadStartedSWIGJNI.delete_DeliverFileDownloadStarted(j);
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

    public String getFilePath() {
        return DeliverFileDownloadStartedSWIGJNI.DeliverFileDownloadStarted_filePath_get(this.swigCPtr, this);
    }

    public long getSenderDyngateId() {
        return DeliverFileDownloadStartedSWIGJNI.DeliverFileDownloadStarted_senderDyngateId_get(this.swigCPtr, this);
    }

    public void setFilePath(String str) {
        DeliverFileDownloadStartedSWIGJNI.DeliverFileDownloadStarted_filePath_set(this.swigCPtr, this, str);
    }

    public void setSenderDyngateId(long j) {
        DeliverFileDownloadStartedSWIGJNI.DeliverFileDownloadStarted_senderDyngateId_set(this.swigCPtr, this, j);
    }

    public DeliverFileDownloadStarted(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
