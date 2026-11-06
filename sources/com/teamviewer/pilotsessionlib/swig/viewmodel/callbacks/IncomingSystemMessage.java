package com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class IncomingSystemMessage {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IncomingSystemMessage() {
        this(IncomingSystemMessageSWIGJNI.new_IncomingSystemMessage(), true);
    }

    public static long getCPtr(IncomingSystemMessage incomingSystemMessage) {
        if (incomingSystemMessage == null) {
            return 0L;
        }
        return incomingSystemMessage.swigCPtr;
    }

    public static long swigRelease(IncomingSystemMessage incomingSystemMessage) {
        if (incomingSystemMessage != null) {
            if (incomingSystemMessage.swigCMemOwn) {
                long j = incomingSystemMessage.swigCPtr;
                incomingSystemMessage.swigCMemOwn = false;
                incomingSystemMessage.delete();
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
                    IncomingSystemMessageSWIGJNI.delete_IncomingSystemMessage(j);
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

    public String getCompanyName() {
        return IncomingSystemMessageSWIGJNI.IncomingSystemMessage_companyName_get(this.swigCPtr, this);
    }

    public boolean getIsTranscriptionRunning() {
        return IncomingSystemMessageSWIGJNI.IncomingSystemMessage_isTranscriptionRunning_get(this.swigCPtr, this);
    }

    public void setCompanyName(String str) {
        IncomingSystemMessageSWIGJNI.IncomingSystemMessage_companyName_set(this.swigCPtr, this, str);
    }

    public void setIsTranscriptionRunning(boolean z) {
        IncomingSystemMessageSWIGJNI.IncomingSystemMessage_isTranscriptionRunning_set(this.swigCPtr, this, z);
    }

    public IncomingSystemMessage(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
