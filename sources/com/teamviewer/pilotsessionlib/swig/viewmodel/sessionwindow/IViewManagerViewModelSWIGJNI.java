package com.teamviewer.pilotsessionlib.swig.viewmodel.sessionwindow;

import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class IViewManagerViewModelSWIGJNI {
    public static final native long IViewManagerViewModel_GetSessionData(long j, IViewManagerViewModel iViewManagerViewModel);

    public static final native long NativeLiveDataSessionData_GetNativeValue(long j, NativeLiveDataSessionData nativeLiveDataSessionData);

    public static final native void NativeLiveDataSessionData_RegisterNative(long j, NativeLiveDataSessionData nativeLiveDataSessionData, long j2, VoidSignalCallback voidSignalCallback);

    public static final native int SessionData_getCurrentView(long j, SessionData sessionData);

    public static final native int SessionData_getSessionId(long j, SessionData sessionData);

    public static final native void delete_IViewManagerViewModel(long j);

    public static final native void delete_SessionData(long j);
}
