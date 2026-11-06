package com.teamviewer.chatviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class ListChangeSignalCallbackImplSWIGJNI {
    static {
        swig_module_init();
    }

    public static final native void ListChangeSignalCallbackImpl_PerformCallback(long j, ListChangeSignalCallbackImpl listChangeSignalCallbackImpl, long j2, ListChangeArgs listChangeArgs);

    public static final native long ListChangeSignalCallbackImpl_SWIGUpcast(long j);

    public static final native void ListChangeSignalCallbackImpl_change_ownership(ListChangeSignalCallbackImpl listChangeSignalCallbackImpl, long j, boolean z);

    public static final native void ListChangeSignalCallbackImpl_director_connect(ListChangeSignalCallbackImpl listChangeSignalCallbackImpl, long j, boolean z, boolean z2);

    public static void SwigDirector_ListChangeSignalCallbackImpl_PerformCallback(ListChangeSignalCallbackImpl listChangeSignalCallbackImpl, long j) {
        listChangeSignalCallbackImpl.PerformCallback(new ListChangeArgs(j, false));
    }

    public static final native void delete_ListChangeSignalCallbackImpl(long j);

    public static final native long new_ListChangeSignalCallbackImpl();

    private static final native void swig_module_init();
}
