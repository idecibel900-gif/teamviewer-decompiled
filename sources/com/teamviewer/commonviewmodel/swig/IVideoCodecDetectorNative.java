package com.teamviewer.commonviewmodel.swig;

import o.hk0;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public abstract class IVideoCodecDetectorNative {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IVideoCodecDetectorNative() {
        this(IVideoCodecDetectorSWIGJNI.new_IVideoCodecDetectorNative(), true);
        IVideoCodecDetectorSWIGJNI.IVideoCodecDetectorNative_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(IVideoCodecDetectorNative iVideoCodecDetectorNative) {
        if (iVideoCodecDetectorNative == null) {
            return 0L;
        }
        return iVideoCodecDetectorNative.swigCPtr;
    }

    public static long swigRelease(IVideoCodecDetectorNative iVideoCodecDetectorNative) {
        if (iVideoCodecDetectorNative != null) {
            if (iVideoCodecDetectorNative.swigCMemOwn) {
                long j = iVideoCodecDetectorNative.swigCPtr;
                iVideoCodecDetectorNative.swigCMemOwn = false;
                iVideoCodecDetectorNative.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public abstract PairBooleanCodecConfiguration DetectCodec(boolean z, String str, int i, IntVector intVector);

    public PairBooleanCodecConfiguration DetectCodec_CallbackFromNative(boolean z, String str, int i, IntVector intVector) {
        try {
            return DetectCodec(z, str, i, intVector);
        } catch (Throwable th) {
            ye4.d("IVideoCodecDetector", th);
            throw th;
        }
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IVideoCodecDetectorSWIGJNI.delete_IVideoCodecDetectorNative(j);
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
        IVideoCodecDetectorSWIGJNI.IVideoCodecDetectorNative_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        IVideoCodecDetectorSWIGJNI.IVideoCodecDetectorNative_change_ownership(this, this.swigCPtr, true);
    }

    public IVideoCodecDetectorNative(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
