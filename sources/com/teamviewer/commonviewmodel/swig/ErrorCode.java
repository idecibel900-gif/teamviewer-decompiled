package com.teamviewer.commonviewmodel.swig;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class ErrorCode {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public ErrorCode(ErrorCode errorCode) {
        this(ErrorCodeSWIGJNI.new_ErrorCode__SWIG_0(getCPtr(errorCode), errorCode), true);
    }

    public static long getCPtr(ErrorCode errorCode) {
        if (errorCode == null) {
            return 0L;
        }
        return errorCode.swigCPtr;
    }

    public static long swigRelease(ErrorCode errorCode) {
        if (errorCode != null) {
            if (errorCode.swigCMemOwn) {
                long j = errorCode.swigCPtr;
                errorCode.swigCMemOwn = false;
                errorCode.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public void AddUserInfo(String str, String str2) {
        ErrorCodeSWIGJNI.ErrorCode_AddUserInfo(this.swigCPtr, this, str, str2);
    }

    public ErrorCode Assignment(ErrorCode errorCode) {
        return new ErrorCode(ErrorCodeSWIGJNI.ErrorCode_Assignment(this.swigCPtr, this, getCPtr(errorCode), errorCode), false);
    }

    public boolean Equal(ErrorCode errorCode) {
        return ErrorCodeSWIGJNI.ErrorCode_Equal(this.swigCPtr, this, getCPtr(errorCode), errorCode);
    }

    public ErrorCategory GetErrorCategory() {
        return ErrorCategory.swigToEnum(ErrorCodeSWIGJNI.ErrorCode_GetErrorCategory(this.swigCPtr, this));
    }

    public int GetErrorId() {
        return ErrorCodeSWIGJNI.ErrorCode_GetErrorId(this.swigCPtr, this);
    }

    public String GetErrorMessage() {
        return ErrorCodeSWIGJNI.ErrorCode_GetErrorMessage(this.swigCPtr, this);
    }

    public String GetUserInfo(String str) {
        return ErrorCodeSWIGJNI.ErrorCode_GetUserInfo(this.swigCPtr, this, str);
    }

    public boolean NotEqual(ErrorCode errorCode) {
        return ErrorCodeSWIGJNI.ErrorCode_NotEqual(this.swigCPtr, this, getCPtr(errorCode), errorCode);
    }

    public void SetErrorMessage(String str) {
        ErrorCodeSWIGJNI.ErrorCode_SetErrorMessage(this.swigCPtr, this, str);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ErrorCodeSWIGJNI.delete_ErrorCode(j);
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

    public ErrorCode(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public ErrorCode(int i, ErrorCategory errorCategory) {
        this(ErrorCodeSWIGJNI.new_ErrorCode__SWIG_1(i, errorCategory.swigValue()), true);
    }

    public ErrorCode(int i, ErrorCategory errorCategory, String str) {
        this(ErrorCodeSWIGJNI.new_ErrorCode__SWIG_2(i, errorCategory.swigValue(), str), true);
    }
}
