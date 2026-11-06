package com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class LiveCaptionsResult {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public LiveCaptionsResult() {
        this(LiveCaptionsResultSWIGJNI.new_LiveCaptionsResult(), true);
    }

    public static long getCPtr(LiveCaptionsResult liveCaptionsResult) {
        if (liveCaptionsResult == null) {
            return 0L;
        }
        return liveCaptionsResult.swigCPtr;
    }

    public static long swigRelease(LiveCaptionsResult liveCaptionsResult) {
        if (liveCaptionsResult != null) {
            if (liveCaptionsResult.swigCMemOwn) {
                long j = liveCaptionsResult.swigCPtr;
                liveCaptionsResult.swigCMemOwn = false;
                liveCaptionsResult.delete();
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
                    LiveCaptionsResultSWIGJNI.delete_LiveCaptionsResult(j);
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

    public String getDisplayName() {
        return LiveCaptionsResultSWIGJNI.LiveCaptionsResult_displayName_get(this.swigCPtr, this);
    }

    public boolean getIsFinalResult() {
        return LiveCaptionsResultSWIGJNI.LiveCaptionsResult_isFinalResult_get(this.swigCPtr, this);
    }

    public boolean getIsTranslated() {
        return LiveCaptionsResultSWIGJNI.LiveCaptionsResult_isTranslated_get(this.swigCPtr, this);
    }

    public long getParticipantId() {
        return LiveCaptionsResultSWIGJNI.LiveCaptionsResult_participantId_get(this.swigCPtr, this);
    }

    public String getTranscriptionText() {
        return LiveCaptionsResultSWIGJNI.LiveCaptionsResult_transcriptionText_get(this.swigCPtr, this);
    }

    public LiveCaptionsResult(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
