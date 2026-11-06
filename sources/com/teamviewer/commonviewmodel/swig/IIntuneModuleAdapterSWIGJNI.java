package com.teamviewer.commonviewmodel.swig;

import com.teamviewer.swigcallbacklib.BoolSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public class IIntuneModuleAdapterSWIGJNI {
    public static final native boolean IIntuneModuleAdapter_IsModuleAvailable(long j, IIntuneModuleAdapter iIntuneModuleAdapter);

    public static final native void IIntuneModuleAdapter_RegisterIntuneModuleAvailableCallback(long j, IIntuneModuleAdapter iIntuneModuleAdapter, long j2, BoolSignalCallback boolSignalCallback);

    public static final native void IIntuneModuleAdapter_UpdateEntraDeviceId(long j, IIntuneModuleAdapter iIntuneModuleAdapter, String str);

    public static final native void delete_IIntuneModuleAdapter(long j);
}
