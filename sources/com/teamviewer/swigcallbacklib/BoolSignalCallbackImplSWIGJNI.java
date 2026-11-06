package com.teamviewer.swigcallbacklib;

/* JADX INFO: loaded from: classes.dex */
public class BoolSignalCallbackImplSWIGJNI {
    static {
        swig_module_init();
    }

    public static final native void BoolSignalCallbackImpl_PerformCallback(long j, BoolSignalCallbackImpl boolSignalCallbackImpl, boolean z);

    public static final native long BoolSignalCallbackImpl_SWIGUpcast(long j);

    public static final native void BoolSignalCallbackImpl_change_ownership(BoolSignalCallbackImpl boolSignalCallbackImpl, long j, boolean z);

    public static final native void BoolSignalCallbackImpl_director_connect(BoolSignalCallbackImpl boolSignalCallbackImpl, long j, boolean z, boolean z2);

    public static void SwigDirector_BoolSignalCallbackImpl_PerformCallback(BoolSignalCallbackImpl boolSignalCallbackImpl, boolean z) {
        boolSignalCallbackImpl.PerformCallback(z);
    }

    public static final native void delete_BoolSignalCallbackImpl(long j);

    public static final native long new_BoolSignalCallbackImpl();

    private static final native void swig_module_init();
}
