package com.teamviewer.outgoingsessionlib.swig;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class StreamFeatures_Getters {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public StreamFeatures_Getters() {
        this(StreamFeatures_GettersSWIGJNI.new_StreamFeatures_Getters(), true);
    }

    public static long GetOwnSupportedStreamFeatures(StreamType streamType) {
        return StreamFeatures_GettersSWIGJNI.StreamFeatures_Getters_GetOwnSupportedStreamFeatures(streamType.swigValue());
    }

    public static long getCPtr(StreamFeatures_Getters streamFeatures_Getters) {
        if (streamFeatures_Getters == null) {
            return 0L;
        }
        return streamFeatures_Getters.swigCPtr;
    }

    public static long swigRelease(StreamFeatures_Getters streamFeatures_Getters) {
        if (streamFeatures_Getters != null) {
            if (streamFeatures_Getters.swigCMemOwn) {
                long j = streamFeatures_Getters.swigCPtr;
                streamFeatures_Getters.swigCMemOwn = false;
                streamFeatures_Getters.delete();
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
                    StreamFeatures_GettersSWIGJNI.delete_StreamFeatures_Getters(j);
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

    public StreamFeatures_Getters(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
