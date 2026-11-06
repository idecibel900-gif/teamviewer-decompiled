package com.teamviewer.swigcallbacklib;

/* JADX INFO: loaded from: classes.dex */
public class UnsignedIntSignalCallbackImplSWIGJNI {
    static {
        swig_module_init();
    }

    public static void SwigDirector_UnsignedIntSignalCallbackImpl_PerformCallback(UnsignedIntSignalCallbackImpl unsignedIntSignalCallbackImpl, long j) {
        unsignedIntSignalCallbackImpl.PerformCallback(j);
    }

    public static final native void UnsignedIntSignalCallbackImpl_PerformCallback(long j, UnsignedIntSignalCallbackImpl unsignedIntSignalCallbackImpl, long j2);

    public static final native long UnsignedIntSignalCallbackImpl_SWIGUpcast(long j);

    public static final native void UnsignedIntSignalCallbackImpl_change_ownership(UnsignedIntSignalCallbackImpl unsignedIntSignalCallbackImpl, long j, boolean z);

    public static final native void UnsignedIntSignalCallbackImpl_director_connect(UnsignedIntSignalCallbackImpl unsignedIntSignalCallbackImpl, long j, boolean z, boolean z2);

    public static final native void delete_UnsignedIntSignalCallbackImpl(long j);

    public static final native long new_UnsignedIntSignalCallbackImpl();

    private static final native void swig_module_init();
}
