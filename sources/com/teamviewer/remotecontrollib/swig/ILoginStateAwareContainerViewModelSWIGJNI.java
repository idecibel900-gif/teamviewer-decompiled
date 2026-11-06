package com.teamviewer.remotecontrollib.swig;

import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class ILoginStateAwareContainerViewModelSWIGJNI {
    public static final native void ILoginStateAwareContainerViewModel_RegisterForChanges(long j, ILoginStateAwareContainerViewModel iLoginStateAwareContainerViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native boolean ILoginStateAwareContainerViewModel_ShowLoggedInView(long j, ILoginStateAwareContainerViewModel iLoginStateAwareContainerViewModel);

    public static final native void delete_ILoginStateAwareContainerViewModel(long j);
}
