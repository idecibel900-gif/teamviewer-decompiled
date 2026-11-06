package com.teamviewer.swigcallbacklib;

/* JADX INFO: loaded from: classes.dex */
public class LongSignalCallbackImplSWIGJNI {
    static {
        swig_module_init();
    }

    public static final native void LongSignalCallbackImpl_PerformCallback(long j, LongSignalCallbackImpl longSignalCallbackImpl, long j2);

    public static final native long LongSignalCallbackImpl_SWIGUpcast(long j);

    public static final native void LongSignalCallbackImpl_change_ownership(LongSignalCallbackImpl longSignalCallbackImpl, long j, boolean z);

    public static final native void LongSignalCallbackImpl_director_connect(LongSignalCallbackImpl longSignalCallbackImpl, long j, boolean z, boolean z2);

    public static void SwigDirector_LongSignalCallbackImpl_PerformCallback(LongSignalCallbackImpl longSignalCallbackImpl, long j) {
        longSignalCallbackImpl.PerformCallback(j);
    }

    public static final native void delete_LongSignalCallbackImpl(long j);

    public static final native long new_LongSignalCallbackImpl();

    private static final native void swig_module_init();
}
