package com.teamviewer.commonresourcelib.swig;

/* JADX INFO: loaded from: classes.dex */
public class MessageDataSignalCallbackImplSWIGJNI {
    static {
        swig_module_init();
    }

    public static final native void MessageDataSignalCallbackImpl_PerformCallback(long j, MessageDataSignalCallbackImpl messageDataSignalCallbackImpl, long j2, DefaultMessageViewModel defaultMessageViewModel);

    public static final native long MessageDataSignalCallbackImpl_SWIGUpcast(long j);

    public static final native void MessageDataSignalCallbackImpl_change_ownership(MessageDataSignalCallbackImpl messageDataSignalCallbackImpl, long j, boolean z);

    public static final native void MessageDataSignalCallbackImpl_director_connect(MessageDataSignalCallbackImpl messageDataSignalCallbackImpl, long j, boolean z, boolean z2);

    public static void SwigDirector_MessageDataSignalCallbackImpl_PerformCallback(MessageDataSignalCallbackImpl messageDataSignalCallbackImpl, long j) {
        messageDataSignalCallbackImpl.PerformCallback(new DefaultMessageViewModel(j, false));
    }

    public static final native void delete_MessageDataSignalCallbackImpl(long j);

    public static final native long new_MessageDataSignalCallbackImpl();

    private static final native void swig_module_init();
}
