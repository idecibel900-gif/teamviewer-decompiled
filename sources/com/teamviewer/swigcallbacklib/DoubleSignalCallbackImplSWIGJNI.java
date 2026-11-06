package com.teamviewer.swigcallbacklib;

/* JADX INFO: loaded from: classes.dex */
public class DoubleSignalCallbackImplSWIGJNI {
    static {
        swig_module_init();
    }

    public static final native void DoubleSignalCallbackImpl_PerformCallback(long j, DoubleSignalCallbackImpl doubleSignalCallbackImpl, double d);

    public static final native long DoubleSignalCallbackImpl_SWIGUpcast(long j);

    public static final native void DoubleSignalCallbackImpl_change_ownership(DoubleSignalCallbackImpl doubleSignalCallbackImpl, long j, boolean z);

    public static final native void DoubleSignalCallbackImpl_director_connect(DoubleSignalCallbackImpl doubleSignalCallbackImpl, long j, boolean z, boolean z2);

    public static void SwigDirector_DoubleSignalCallbackImpl_PerformCallback(DoubleSignalCallbackImpl doubleSignalCallbackImpl, double d) {
        doubleSignalCallbackImpl.PerformCallback(d);
    }

    public static final native void delete_DoubleSignalCallbackImpl(long j);

    public static final native long new_DoubleSignalCallbackImpl();

    private static final native void swig_module_init();
}
