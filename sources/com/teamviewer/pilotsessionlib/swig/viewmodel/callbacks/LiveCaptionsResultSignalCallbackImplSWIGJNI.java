package com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks;

/* JADX INFO: loaded from: classes.dex */
public class LiveCaptionsResultSignalCallbackImplSWIGJNI {
    static {
        swig_module_init();
    }

    public static final native void LiveCaptionsResultSignalCallbackImpl_PerformCallback(long j, LiveCaptionsResultSignalCallbackImpl liveCaptionsResultSignalCallbackImpl, long j2, LiveCaptionsResult liveCaptionsResult);

    public static final native long LiveCaptionsResultSignalCallbackImpl_SWIGUpcast(long j);

    public static final native void LiveCaptionsResultSignalCallbackImpl_change_ownership(LiveCaptionsResultSignalCallbackImpl liveCaptionsResultSignalCallbackImpl, long j, boolean z);

    public static final native void LiveCaptionsResultSignalCallbackImpl_director_connect(LiveCaptionsResultSignalCallbackImpl liveCaptionsResultSignalCallbackImpl, long j, boolean z, boolean z2);

    public static void SwigDirector_LiveCaptionsResultSignalCallbackImpl_PerformCallback(LiveCaptionsResultSignalCallbackImpl liveCaptionsResultSignalCallbackImpl, long j) {
        liveCaptionsResultSignalCallbackImpl.PerformCallback(new LiveCaptionsResult(j, false));
    }

    public static final native void delete_LiveCaptionsResultSignalCallbackImpl(long j);

    public static final native long new_LiveCaptionsResultSignalCallbackImpl();

    private static final native void swig_module_init();
}
