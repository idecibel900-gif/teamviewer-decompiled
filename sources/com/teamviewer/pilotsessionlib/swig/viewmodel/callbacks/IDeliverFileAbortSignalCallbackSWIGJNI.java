package com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks;

/* JADX INFO: loaded from: classes.dex */
public class IDeliverFileAbortSignalCallbackSWIGJNI {
    static {
        swig_module_init();
    }

    public static final native void IDeliverFileAbortSignalCallback_PerformCallback(long j, IDeliverFileAbortSignalCallback iDeliverFileAbortSignalCallback, int i);

    public static final native long IDeliverFileAbortSignalCallback_SWIGUpcast(long j);

    public static final native void IDeliverFileAbortSignalCallback_change_ownership(IDeliverFileAbortSignalCallback iDeliverFileAbortSignalCallback, long j, boolean z);

    public static final native void IDeliverFileAbortSignalCallback_director_connect(IDeliverFileAbortSignalCallback iDeliverFileAbortSignalCallback, long j, boolean z, boolean z2);

    public static void SwigDirector_IDeliverFileAbortSignalCallback_PerformCallback(IDeliverFileAbortSignalCallback iDeliverFileAbortSignalCallback, int i) {
        iDeliverFileAbortSignalCallback.PerformCallback(AbortReason.swigToEnum(i));
    }

    public static final native void delete_IDeliverFileAbortSignalCallback(long j);

    public static final native long new_IDeliverFileAbortSignalCallback();

    private static final native void swig_module_init();
}
