package com.teamviewer.nativelivedatalib.swig;

import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public class NativeLiveDataSWIGJNI {
    public static final native boolean NativeLiveDataBool_GetNativeValue(long j, NativeLiveDataBool nativeLiveDataBool);

    public static final native void NativeLiveDataBool_RegisterNative(long j, NativeLiveDataBool nativeLiveDataBool, long j2, VoidSignalCallback voidSignalCallback);

    public static final native float NativeLiveDataFloat_GetNativeValue(long j, NativeLiveDataFloat nativeLiveDataFloat);

    public static final native void NativeLiveDataFloat_RegisterNative(long j, NativeLiveDataFloat nativeLiveDataFloat, long j2, VoidSignalCallback voidSignalCallback);

    public static final native int NativeLiveDataInt_GetNativeValue(long j, NativeLiveDataInt nativeLiveDataInt);

    public static final native void NativeLiveDataInt_RegisterNative(long j, NativeLiveDataInt nativeLiveDataInt, long j2, VoidSignalCallback voidSignalCallback);

    public static final native long NativeLiveDataSize_GetNativeValue(long j, NativeLiveDataSize nativeLiveDataSize);

    public static final native void NativeLiveDataSize_RegisterNative(long j, NativeLiveDataSize nativeLiveDataSize, long j2, VoidSignalCallback voidSignalCallback);

    public static final native String NativeLiveDataStringUTF8_GetNativeValue(long j, NativeLiveDataStringUTF8 nativeLiveDataStringUTF8);

    public static final native void NativeLiveDataStringUTF8_RegisterNative(long j, NativeLiveDataStringUTF8 nativeLiveDataStringUTF8, long j2, VoidSignalCallback voidSignalCallback);

    public static final native String NativeLiveDataString_GetNativeValue(long j, NativeLiveDataString nativeLiveDataString);

    public static final native void NativeLiveDataString_RegisterNative(long j, NativeLiveDataString nativeLiveDataString, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void delete_NativeLiveDataBool(long j);

    public static final native void delete_NativeLiveDataFloat(long j);

    public static final native void delete_NativeLiveDataInt(long j);

    public static final native void delete_NativeLiveDataSize(long j);

    public static final native void delete_NativeLiveDataString(long j);

    public static final native void delete_NativeLiveDataStringUTF8(long j);
}
