package com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks;

/* JADX INFO: loaded from: classes.dex */
public class IDeliverFileErrorSignalCallbackSWIGJNI {
    static {
        swig_module_init();
    }

    public static final native void IDeliverFileErrorSignalCallback_PerformCallback(long j, IDeliverFileErrorSignalCallback iDeliverFileErrorSignalCallback, int i);

    public static final native long IDeliverFileErrorSignalCallback_SWIGUpcast(long j);

    public static final native void IDeliverFileErrorSignalCallback_change_ownership(IDeliverFileErrorSignalCallback iDeliverFileErrorSignalCallback, long j, boolean z);

    public static final native void IDeliverFileErrorSignalCallback_director_connect(IDeliverFileErrorSignalCallback iDeliverFileErrorSignalCallback, long j, boolean z, boolean z2);

    public static void SwigDirector_IDeliverFileErrorSignalCallback_PerformCallback(IDeliverFileErrorSignalCallback iDeliverFileErrorSignalCallback, int i) {
        iDeliverFileErrorSignalCallback.PerformCallback(ErrorReason.swigToEnum(i));
    }

    public static final native void delete_IDeliverFileErrorSignalCallback(long j);

    public static final native long new_IDeliverFileErrorSignalCallback();

    private static final native void swig_module_init();
}
