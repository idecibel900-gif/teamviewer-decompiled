package com.teamviewer.commonviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class ErrorCodeResultCallbackImplSWIGJNI {
    static {
        swig_module_init();
    }

    public static final native void ErrorCodeResultCallbackImpl_PerformError(long j, ErrorCodeResultCallbackImpl errorCodeResultCallbackImpl, long j2, ErrorCode errorCode);

    public static final native void ErrorCodeResultCallbackImpl_PerformSuccess(long j, ErrorCodeResultCallbackImpl errorCodeResultCallbackImpl);

    public static final native long ErrorCodeResultCallbackImpl_SWIGUpcast(long j);

    public static final native void ErrorCodeResultCallbackImpl_change_ownership(ErrorCodeResultCallbackImpl errorCodeResultCallbackImpl, long j, boolean z);

    public static final native void ErrorCodeResultCallbackImpl_director_connect(ErrorCodeResultCallbackImpl errorCodeResultCallbackImpl, long j, boolean z, boolean z2);

    public static void SwigDirector_ErrorCodeResultCallbackImpl_PerformError(ErrorCodeResultCallbackImpl errorCodeResultCallbackImpl, long j) {
        errorCodeResultCallbackImpl.PerformError(new ErrorCode(j, false));
    }

    public static void SwigDirector_ErrorCodeResultCallbackImpl_PerformSuccess(ErrorCodeResultCallbackImpl errorCodeResultCallbackImpl) {
        errorCodeResultCallbackImpl.PerformSuccess();
    }

    public static final native void delete_ErrorCodeResultCallbackImpl(long j);

    public static final native long new_ErrorCodeResultCallbackImpl();

    private static final native void swig_module_init();
}
