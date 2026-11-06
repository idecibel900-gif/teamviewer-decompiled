package com.teamviewer.chatviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class ErrorMessageSignalCallbackImplSWIGJNI {
    static {
        swig_module_init();
    }

    public static final native void ErrorMessageSignalCallbackImpl_PerformCallback(long j, ErrorMessageSignalCallbackImpl errorMessageSignalCallbackImpl, int i);

    public static final native long ErrorMessageSignalCallbackImpl_SWIGUpcast(long j);

    public static final native void ErrorMessageSignalCallbackImpl_change_ownership(ErrorMessageSignalCallbackImpl errorMessageSignalCallbackImpl, long j, boolean z);

    public static final native void ErrorMessageSignalCallbackImpl_director_connect(ErrorMessageSignalCallbackImpl errorMessageSignalCallbackImpl, long j, boolean z, boolean z2);

    public static void SwigDirector_ErrorMessageSignalCallbackImpl_PerformCallback(ErrorMessageSignalCallbackImpl errorMessageSignalCallbackImpl, int i) {
        errorMessageSignalCallbackImpl.PerformCallback(ErrorMessage.swigToEnum(i));
    }

    public static final native void delete_ErrorMessageSignalCallbackImpl(long j);

    public static final native long new_ErrorMessageSignalCallbackImpl();

    private static final native void swig_module_init();
}
