package com.teamviewer.commonviewmodel.swig;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class PairBooleanCodecConfiguration {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public PairBooleanCodecConfiguration(boolean z, CodecConfiguration codecConfiguration) {
        this(IVideoCodecDetectorSWIGJNI.new_PairBooleanCodecConfiguration__SWIG_1(z, CodecConfiguration.getCPtr(codecConfiguration), codecConfiguration), true);
    }

    public static long getCPtr(PairBooleanCodecConfiguration pairBooleanCodecConfiguration) {
        if (pairBooleanCodecConfiguration == null) {
            return 0L;
        }
        return pairBooleanCodecConfiguration.swigCPtr;
    }

    public static long swigRelease(PairBooleanCodecConfiguration pairBooleanCodecConfiguration) {
        if (pairBooleanCodecConfiguration != null) {
            if (pairBooleanCodecConfiguration.swigCMemOwn) {
                long j = pairBooleanCodecConfiguration.swigCPtr;
                pairBooleanCodecConfiguration.swigCMemOwn = false;
                pairBooleanCodecConfiguration.delete();
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
                    IVideoCodecDetectorSWIGJNI.delete_PairBooleanCodecConfiguration(j);
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

    public boolean getFirst() {
        return IVideoCodecDetectorSWIGJNI.PairBooleanCodecConfiguration_first_get(this.swigCPtr, this);
    }

    public CodecConfiguration getSecond() {
        long jPairBooleanCodecConfiguration_second_get = IVideoCodecDetectorSWIGJNI.PairBooleanCodecConfiguration_second_get(this.swigCPtr, this);
        if (jPairBooleanCodecConfiguration_second_get == 0) {
            return null;
        }
        return new CodecConfiguration(jPairBooleanCodecConfiguration_second_get, false);
    }

    public void setFirst(boolean z) {
        IVideoCodecDetectorSWIGJNI.PairBooleanCodecConfiguration_first_set(this.swigCPtr, this, z);
    }

    public void setSecond(CodecConfiguration codecConfiguration) {
        IVideoCodecDetectorSWIGJNI.PairBooleanCodecConfiguration_second_set(this.swigCPtr, this, CodecConfiguration.getCPtr(codecConfiguration), codecConfiguration);
    }

    public PairBooleanCodecConfiguration() {
        this(IVideoCodecDetectorSWIGJNI.new_PairBooleanCodecConfiguration__SWIG_0(), true);
    }

    public PairBooleanCodecConfiguration(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public PairBooleanCodecConfiguration(PairBooleanCodecConfiguration pairBooleanCodecConfiguration) {
        this(IVideoCodecDetectorSWIGJNI.new_PairBooleanCodecConfiguration__SWIG_2(getCPtr(pairBooleanCodecConfiguration), pairBooleanCodecConfiguration), true);
    }
}
