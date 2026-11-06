package com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks;

/* JADX INFO: loaded from: classes.dex */
public class IncomingSystemMessageSignalCallbackImplSWIGJNI {
    static {
        swig_module_init();
    }

    public static final native void IncomingSystemMessageSignalCallbackImpl_PerformCallback(long j, IncomingSystemMessageSignalCallbackImpl incomingSystemMessageSignalCallbackImpl, long j2, IncomingSystemMessage incomingSystemMessage);

    public static final native long IncomingSystemMessageSignalCallbackImpl_SWIGUpcast(long j);

    public static final native void IncomingSystemMessageSignalCallbackImpl_change_ownership(IncomingSystemMessageSignalCallbackImpl incomingSystemMessageSignalCallbackImpl, long j, boolean z);

    public static final native void IncomingSystemMessageSignalCallbackImpl_director_connect(IncomingSystemMessageSignalCallbackImpl incomingSystemMessageSignalCallbackImpl, long j, boolean z, boolean z2);

    public static void SwigDirector_IncomingSystemMessageSignalCallbackImpl_PerformCallback(IncomingSystemMessageSignalCallbackImpl incomingSystemMessageSignalCallbackImpl, long j) {
        incomingSystemMessageSignalCallbackImpl.PerformCallback(new IncomingSystemMessage(j, false));
    }

    public static final native void delete_IncomingSystemMessageSignalCallbackImpl(long j);

    public static final native long new_IncomingSystemMessageSignalCallbackImpl();

    private static final native void swig_module_init();
}
