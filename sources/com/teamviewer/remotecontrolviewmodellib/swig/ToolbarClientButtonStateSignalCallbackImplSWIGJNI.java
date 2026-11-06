package com.teamviewer.remotecontrolviewmodellib.swig;

/* JADX INFO: loaded from: classes.dex */
public class ToolbarClientButtonStateSignalCallbackImplSWIGJNI {
    static {
        swig_module_init();
    }

    public static void SwigDirector_ToolbarClientButtonStateSignalCallbackImpl_PerformCallback(ToolbarClientButtonStateSignalCallbackImpl toolbarClientButtonStateSignalCallbackImpl, long j) {
        ToolbarButtonState toolbarButtonState = new ToolbarButtonState();
        toolbarButtonState.a = j;
        toolbarClientButtonStateSignalCallbackImpl.PerformCallback(toolbarButtonState);
    }

    public static final native void ToolbarClientButtonStateSignalCallbackImpl_PerformCallback(long j, ToolbarClientButtonStateSignalCallbackImpl toolbarClientButtonStateSignalCallbackImpl, long j2, ToolbarButtonState toolbarButtonState);

    public static final native long ToolbarClientButtonStateSignalCallbackImpl_SWIGUpcast(long j);

    public static final native void ToolbarClientButtonStateSignalCallbackImpl_change_ownership(ToolbarClientButtonStateSignalCallbackImpl toolbarClientButtonStateSignalCallbackImpl, long j, boolean z);

    public static final native void ToolbarClientButtonStateSignalCallbackImpl_director_connect(ToolbarClientButtonStateSignalCallbackImpl toolbarClientButtonStateSignalCallbackImpl, long j, boolean z, boolean z2);

    public static final native void delete_ToolbarClientButtonStateSignalCallbackImpl(long j);

    public static final native long new_ToolbarClientButtonStateSignalCallbackImpl();

    private static final native void swig_module_init();
}
