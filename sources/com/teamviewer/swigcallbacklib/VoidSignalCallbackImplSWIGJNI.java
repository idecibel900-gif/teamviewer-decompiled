package com.teamviewer.swigcallbacklib;

/* JADX INFO: loaded from: classes.dex */
public class VoidSignalCallbackImplSWIGJNI {
    static {
        swig_module_init();
    }

    public static void SwigDirector_VoidSignalCallbackImpl_PerformCallback(VoidSignalCallbackImpl voidSignalCallbackImpl) {
        voidSignalCallbackImpl.PerformCallback();
    }

    public static final native void VoidSignalCallbackImpl_PerformCallback(long j, VoidSignalCallbackImpl voidSignalCallbackImpl);

    public static final native long VoidSignalCallbackImpl_SWIGUpcast(long j);

    public static final native void VoidSignalCallbackImpl_change_ownership(VoidSignalCallbackImpl voidSignalCallbackImpl, long j, boolean z);

    public static final native void VoidSignalCallbackImpl_director_connect(VoidSignalCallbackImpl voidSignalCallbackImpl, long j, boolean z, boolean z2);

    public static final native void delete_VoidSignalCallbackImpl(long j);

    public static final native long new_VoidSignalCallbackImpl();

    private static final native void swig_module_init();
}
