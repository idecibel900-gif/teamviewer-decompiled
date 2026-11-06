package com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks;

/* JADX INFO: loaded from: classes.dex */
public class DeliverFileDownloadStartedSignalCallbackImplSWIGJNI {
    static {
        swig_module_init();
    }

    public static final native void DeliverFileDownloadStartedSignalCallbackImpl_PerformCallback(long j, DeliverFileDownloadStartedSignalCallbackImpl deliverFileDownloadStartedSignalCallbackImpl, long j2, DeliverFileDownloadStarted deliverFileDownloadStarted);

    public static final native long DeliverFileDownloadStartedSignalCallbackImpl_SWIGUpcast(long j);

    public static final native void DeliverFileDownloadStartedSignalCallbackImpl_change_ownership(DeliverFileDownloadStartedSignalCallbackImpl deliverFileDownloadStartedSignalCallbackImpl, long j, boolean z);

    public static final native void DeliverFileDownloadStartedSignalCallbackImpl_director_connect(DeliverFileDownloadStartedSignalCallbackImpl deliverFileDownloadStartedSignalCallbackImpl, long j, boolean z, boolean z2);

    public static void SwigDirector_DeliverFileDownloadStartedSignalCallbackImpl_PerformCallback(DeliverFileDownloadStartedSignalCallbackImpl deliverFileDownloadStartedSignalCallbackImpl, long j) {
        deliverFileDownloadStartedSignalCallbackImpl.PerformCallback(new DeliverFileDownloadStarted(j, false));
    }

    public static final native void delete_DeliverFileDownloadStartedSignalCallbackImpl(long j);

    public static final native long new_DeliverFileDownloadStartedSignalCallbackImpl();

    private static final native void swig_module_init();
}
