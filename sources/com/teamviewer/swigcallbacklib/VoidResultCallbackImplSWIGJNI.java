package com.teamviewer.swigcallbacklib;

/* JADX INFO: loaded from: classes.dex */
public class VoidResultCallbackImplSWIGJNI {
    static {
        swig_module_init();
    }

    public static void SwigDirector_VoidResultCallbackImpl_PerformError(VoidResultCallbackImpl voidResultCallbackImpl) {
        voidResultCallbackImpl.PerformError();
    }

    public static void SwigDirector_VoidResultCallbackImpl_PerformSuccess(VoidResultCallbackImpl voidResultCallbackImpl) {
        voidResultCallbackImpl.PerformSuccess();
    }

    public static final native void VoidResultCallbackImpl_PerformError(long j, VoidResultCallbackImpl voidResultCallbackImpl);

    public static final native void VoidResultCallbackImpl_PerformSuccess(long j, VoidResultCallbackImpl voidResultCallbackImpl);

    public static final native long VoidResultCallbackImpl_SWIGUpcast(long j);

    public static final native void VoidResultCallbackImpl_change_ownership(VoidResultCallbackImpl voidResultCallbackImpl, long j, boolean z);

    public static final native void VoidResultCallbackImpl_director_connect(VoidResultCallbackImpl voidResultCallbackImpl, long j, boolean z, boolean z2);

    public static final native void delete_VoidResultCallbackImpl(long j);

    public static final native long new_VoidResultCallbackImpl();

    private static final native void swig_module_init();
}
