package com.teamviewer.commonviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class IVideoCodecDetectorSWIGJNI {
    static {
        swig_module_init();
    }

    public static final native long IVideoCodecDetectorNative_DetectCodec_CallbackFromNative(long j, IVideoCodecDetectorNative iVideoCodecDetectorNative, boolean z, String str, int i, long j2, IntVector intVector);

    public static final native void IVideoCodecDetectorNative_change_ownership(IVideoCodecDetectorNative iVideoCodecDetectorNative, long j, boolean z);

    public static final native void IVideoCodecDetectorNative_director_connect(IVideoCodecDetectorNative iVideoCodecDetectorNative, long j, boolean z, boolean z2);

    public static final native void IntVector_clear(long j, IntVector intVector);

    public static final native void IntVector_doAdd__SWIG_0(long j, IntVector intVector, int i);

    public static final native void IntVector_doAdd__SWIG_1(long j, IntVector intVector, int i, int i2);

    public static final native int IntVector_doCapacity(long j, IntVector intVector);

    public static final native int IntVector_doGet(long j, IntVector intVector, int i);

    public static final native int IntVector_doRemove(long j, IntVector intVector, int i);

    public static final native void IntVector_doRemoveRange(long j, IntVector intVector, int i, int i2);

    public static final native void IntVector_doReserve(long j, IntVector intVector, int i);

    public static final native int IntVector_doSet(long j, IntVector intVector, int i, int i2);

    public static final native int IntVector_doSize(long j, IntVector intVector);

    public static final native boolean IntVector_isEmpty(long j, IntVector intVector);

    public static final native boolean PairBooleanCodecConfiguration_first_get(long j, PairBooleanCodecConfiguration pairBooleanCodecConfiguration);

    public static final native void PairBooleanCodecConfiguration_first_set(long j, PairBooleanCodecConfiguration pairBooleanCodecConfiguration, boolean z);

    public static final native long PairBooleanCodecConfiguration_second_get(long j, PairBooleanCodecConfiguration pairBooleanCodecConfiguration);

    public static final native void PairBooleanCodecConfiguration_second_set(long j, PairBooleanCodecConfiguration pairBooleanCodecConfiguration, long j2, CodecConfiguration codecConfiguration);

    public static long SwigDirector_IVideoCodecDetectorNative_DetectCodec_CallbackFromNative(IVideoCodecDetectorNative iVideoCodecDetectorNative, boolean z, String str, int i, long j) {
        return PairBooleanCodecConfiguration.getCPtr(iVideoCodecDetectorNative.DetectCodec_CallbackFromNative(z, str, i, new IntVector(j, false)));
    }

    public static final native void delete_IVideoCodecDetectorNative(long j);

    public static final native void delete_IntVector(long j);

    public static final native void delete_PairBooleanCodecConfiguration(long j);

    public static final native long new_IVideoCodecDetectorNative();

    public static final native long new_IntVector__SWIG_0();

    public static final native long new_IntVector__SWIG_1(long j, IntVector intVector);

    public static final native long new_IntVector__SWIG_2(int i, int i2);

    public static final native long new_PairBooleanCodecConfiguration__SWIG_0();

    public static final native long new_PairBooleanCodecConfiguration__SWIG_1(boolean z, long j, CodecConfiguration codecConfiguration);

    public static final native long new_PairBooleanCodecConfiguration__SWIG_2(long j, PairBooleanCodecConfiguration pairBooleanCodecConfiguration);

    private static final native void swig_module_init();
}
