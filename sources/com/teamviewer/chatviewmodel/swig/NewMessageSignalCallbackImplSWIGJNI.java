package com.teamviewer.chatviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class NewMessageSignalCallbackImplSWIGJNI {
    static {
        swig_module_init();
    }

    public static final native void NewMessageSignalCallbackImpl_PerformCallback(long j, NewMessageSignalCallbackImpl newMessageSignalCallbackImpl, long j2, MessageData messageData);

    public static final native long NewMessageSignalCallbackImpl_SWIGUpcast(long j);

    public static final native void NewMessageSignalCallbackImpl_change_ownership(NewMessageSignalCallbackImpl newMessageSignalCallbackImpl, long j, boolean z);

    public static final native void NewMessageSignalCallbackImpl_director_connect(NewMessageSignalCallbackImpl newMessageSignalCallbackImpl, long j, boolean z, boolean z2);

    public static void SwigDirector_NewMessageSignalCallbackImpl_PerformCallback(NewMessageSignalCallbackImpl newMessageSignalCallbackImpl, long j) {
        newMessageSignalCallbackImpl.PerformCallback(new MessageData(j, false));
    }

    public static final native void delete_NewMessageSignalCallbackImpl(long j);

    public static final native long new_NewMessageSignalCallbackImpl();

    private static final native void swig_module_init();
}
