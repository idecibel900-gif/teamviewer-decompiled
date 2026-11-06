package com.teamviewer.commonviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class ErrorCodeSWIGJNI {
    public static final native void ErrorCode_AddUserInfo(long j, ErrorCode errorCode, String str, String str2);

    public static final native long ErrorCode_Assignment(long j, ErrorCode errorCode, long j2, ErrorCode errorCode2);

    public static final native boolean ErrorCode_Equal(long j, ErrorCode errorCode, long j2, ErrorCode errorCode2);

    public static final native int ErrorCode_GetErrorCategory(long j, ErrorCode errorCode);

    public static final native int ErrorCode_GetErrorId(long j, ErrorCode errorCode);

    public static final native String ErrorCode_GetErrorMessage(long j, ErrorCode errorCode);

    public static final native String ErrorCode_GetUserInfo(long j, ErrorCode errorCode, String str);

    public static final native boolean ErrorCode_NotEqual(long j, ErrorCode errorCode, long j2, ErrorCode errorCode2);

    public static final native void ErrorCode_SetErrorMessage(long j, ErrorCode errorCode, String str);

    public static final native void delete_ErrorCode(long j);

    public static final native long new_ErrorCode__SWIG_0(long j, ErrorCode errorCode);

    public static final native long new_ErrorCode__SWIG_1(int i, int i2);

    public static final native long new_ErrorCode__SWIG_2(int i, int i2, String str);
}
