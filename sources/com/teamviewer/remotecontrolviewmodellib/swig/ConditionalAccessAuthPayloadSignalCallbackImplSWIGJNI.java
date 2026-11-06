package com.teamviewer.remotecontrolviewmodellib.swig;

/* JADX INFO: loaded from: classes.dex */
public class ConditionalAccessAuthPayloadSignalCallbackImplSWIGJNI {
    static {
        swig_module_init();
    }

    public static final native void ConditionalAccessAuthenticationPayloadSignalCallbackImpl_PerformCallback(long j, ConditionalAccessAuthenticationPayloadSignalCallbackImpl conditionalAccessAuthenticationPayloadSignalCallbackImpl, long j2, ConditionalAccessAuthenticationPayloadNative conditionalAccessAuthenticationPayloadNative);

    public static final native long ConditionalAccessAuthenticationPayloadSignalCallbackImpl_SWIGUpcast(long j);

    public static final native void ConditionalAccessAuthenticationPayloadSignalCallbackImpl_change_ownership(ConditionalAccessAuthenticationPayloadSignalCallbackImpl conditionalAccessAuthenticationPayloadSignalCallbackImpl, long j, boolean z);

    public static final native void ConditionalAccessAuthenticationPayloadSignalCallbackImpl_director_connect(ConditionalAccessAuthenticationPayloadSignalCallbackImpl conditionalAccessAuthenticationPayloadSignalCallbackImpl, long j, boolean z, boolean z2);

    public static void SwigDirector_ConditionalAccessAuthenticationPayloadSignalCallbackImpl_PerformCallback(ConditionalAccessAuthenticationPayloadSignalCallbackImpl conditionalAccessAuthenticationPayloadSignalCallbackImpl, long j) {
        ConditionalAccessAuthenticationPayloadNative conditionalAccessAuthenticationPayloadNative = new ConditionalAccessAuthenticationPayloadNative();
        conditionalAccessAuthenticationPayloadNative.a = j;
        conditionalAccessAuthenticationPayloadSignalCallbackImpl.PerformCallback(conditionalAccessAuthenticationPayloadNative);
    }

    public static final native void delete_ConditionalAccessAuthenticationPayloadSignalCallbackImpl(long j);

    public static final native long new_ConditionalAccessAuthenticationPayloadSignalCallbackImpl();

    private static final native void swig_module_init();
}
