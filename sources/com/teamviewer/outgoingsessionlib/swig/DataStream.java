package com.teamviewer.outgoingsessionlib.swig;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class DataStream {
    public static final int STREAM_ID_UNKNOWN = 0;
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DataStream(SWIGTYPE_p_ParticipantIdentifier sWIGTYPE_p_ParticipantIdentifier, SWIGTYPE_p_tvbcommand__BCommand sWIGTYPE_p_tvbcommand__BCommand) {
        this(DataStreamSWIGJNI.new_DataStream__SWIG_2(SWIGTYPE_p_ParticipantIdentifier.getCPtr(sWIGTYPE_p_ParticipantIdentifier), SWIGTYPE_p_tvbcommand__BCommand.getCPtr(sWIGTYPE_p_tvbcommand__BCommand)), true);
    }

    public static long getCPtr(DataStream dataStream) {
        if (dataStream == null) {
            return 0L;
        }
        return dataStream.swigCPtr;
    }

    public static long swigRelease(DataStream dataStream) {
        if (dataStream != null) {
            if (dataStream.swigCMemOwn) {
                long j = dataStream.swigCPtr;
                dataStream.swigCMemOwn = false;
                dataStream.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public DataStream Assignment(DataStream dataStream) {
        return new DataStream(DataStreamSWIGJNI.DataStream_Assignment(this.swigCPtr, this, getCPtr(dataStream), dataStream), false);
    }

    public boolean RequiresCongestionControl() {
        return DataStreamSWIGJNI.DataStream_RequiresCongestionControl(this.swigCPtr, this);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    DataStreamSWIGJNI.delete_DataStream(j);
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

    public long getRequiredFeatures() {
        return DataStreamSWIGJNI.DataStream_RequiredFeatures_get(this.swigCPtr, this);
    }

    public long getStreamID() {
        return DataStreamSWIGJNI.DataStream_StreamID_get(this.swigCPtr, this);
    }

    public StreamType getStreamType() {
        return StreamType.swigToEnum(DataStreamSWIGJNI.DataStream_StreamType_get(this.swigCPtr, this));
    }

    public void setRequiredFeatures(long j) {
        DataStreamSWIGJNI.DataStream_RequiredFeatures_set(this.swigCPtr, this, j);
    }

    public void setStreamID(long j) {
        DataStreamSWIGJNI.DataStream_StreamID_set(this.swigCPtr, this, j);
    }

    public void setStreamType(StreamType streamType) {
        DataStreamSWIGJNI.DataStream_StreamType_set(this.swigCPtr, this, streamType.swigValue());
    }

    public DataStream() {
        this(DataStreamSWIGJNI.new_DataStream__SWIG_0(), true);
    }

    public DataStream(DataStream dataStream) {
        this(DataStreamSWIGJNI.new_DataStream__SWIG_1(getCPtr(dataStream), dataStream), true);
    }

    public DataStream(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
