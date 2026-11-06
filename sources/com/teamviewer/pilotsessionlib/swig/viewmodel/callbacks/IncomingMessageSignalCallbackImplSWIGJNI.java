package com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks;

/* JADX INFO: loaded from: classes.dex */
public class IncomingMessageSignalCallbackImplSWIGJNI {
    static {
        swig_module_init();
    }

    public static final native void IncomingMessageSignalCallbackImpl_PerformCallback(long j, IncomingMessageSignalCallbackImpl incomingMessageSignalCallbackImpl, long j2, IncomingChatMessage incomingChatMessage);

    public static final native long IncomingMessageSignalCallbackImpl_SWIGUpcast(long j);

    public static final native void IncomingMessageSignalCallbackImpl_change_ownership(IncomingMessageSignalCallbackImpl incomingMessageSignalCallbackImpl, long j, boolean z);

    public static final native void IncomingMessageSignalCallbackImpl_director_connect(IncomingMessageSignalCallbackImpl incomingMessageSignalCallbackImpl, long j, boolean z, boolean z2);

    public static void SwigDirector_IncomingMessageSignalCallbackImpl_PerformCallback(IncomingMessageSignalCallbackImpl incomingMessageSignalCallbackImpl, long j) {
        incomingMessageSignalCallbackImpl.PerformCallback(new IncomingChatMessage(j, false));
    }

    public static final native void delete_IncomingMessageSignalCallbackImpl(long j);

    public static final native long new_IncomingMessageSignalCallbackImpl();

    private static final native void swig_module_init();
}
