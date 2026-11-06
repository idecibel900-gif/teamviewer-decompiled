package com.teamviewer.swigcallbacklib;

/* JADX INFO: loaded from: classes.dex */
public class IntSignalCallbackImplSWIGJNI {
    static {
        swig_module_init();
    }

    public static final native void IntSignalCallbackImpl_PerformCallback(long j, IntSignalCallbackImpl intSignalCallbackImpl, int i);

    public static final native long IntSignalCallbackImpl_SWIGUpcast(long j);

    public static final native void IntSignalCallbackImpl_change_ownership(IntSignalCallbackImpl intSignalCallbackImpl, long j, boolean z);

    public static final native void IntSignalCallbackImpl_director_connect(IntSignalCallbackImpl intSignalCallbackImpl, long j, boolean z, boolean z2);

    public static void SwigDirector_IntSignalCallbackImpl_PerformCallback(IntSignalCallbackImpl intSignalCallbackImpl, int i) {
        intSignalCallbackImpl.PerformCallback(i);
    }

    public static final native void delete_IntSignalCallbackImpl(long j);

    public static final native long new_IntSignalCallbackImpl();

    private static final native void swig_module_init();
}
