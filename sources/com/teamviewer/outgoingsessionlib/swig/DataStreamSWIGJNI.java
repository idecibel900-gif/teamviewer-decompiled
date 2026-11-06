package com.teamviewer.outgoingsessionlib.swig;

/* JADX INFO: loaded from: classes.dex */
public class DataStreamSWIGJNI {
    public static final native long DataStream_Assignment(long j, DataStream dataStream, long j2, DataStream dataStream2);

    public static final native long DataStream_RequiredFeatures_get(long j, DataStream dataStream);

    public static final native void DataStream_RequiredFeatures_set(long j, DataStream dataStream, long j2);

    public static final native boolean DataStream_RequiresCongestionControl(long j, DataStream dataStream);

    public static final native long DataStream_StreamID_get(long j, DataStream dataStream);

    public static final native void DataStream_StreamID_set(long j, DataStream dataStream, long j2);

    public static final native int DataStream_StreamType_get(long j, DataStream dataStream);

    public static final native void DataStream_StreamType_set(long j, DataStream dataStream, int i);

    public static final native void delete_DataStream(long j);

    public static final native long new_DataStream__SWIG_0();

    public static final native long new_DataStream__SWIG_1(long j, DataStream dataStream);

    public static final native long new_DataStream__SWIG_2(long j, long j2);
}
