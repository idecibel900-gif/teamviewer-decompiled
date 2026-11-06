package com.teamviewer.swigcallbacklib;

/* JADX INFO: loaded from: classes.dex */
public class StringSignalCallbackImplSWIGJNI {
    static {
        swig_module_init();
    }

    public static final native void StringSignalCallbackImpl_PerformCallback(long j, StringSignalCallbackImpl stringSignalCallbackImpl, String str);

    public static final native long StringSignalCallbackImpl_SWIGUpcast(long j);

    public static final native void StringSignalCallbackImpl_change_ownership(StringSignalCallbackImpl stringSignalCallbackImpl, long j, boolean z);

    public static final native void StringSignalCallbackImpl_director_connect(StringSignalCallbackImpl stringSignalCallbackImpl, long j, boolean z, boolean z2);

    public static void SwigDirector_StringSignalCallbackImpl_PerformCallback(StringSignalCallbackImpl stringSignalCallbackImpl, String str) {
        stringSignalCallbackImpl.PerformCallback(str);
    }

    public static final native void delete_StringSignalCallbackImpl(long j);

    public static final native long new_StringSignalCallbackImpl();

    private static final native void swig_module_init();
}
