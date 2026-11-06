package com.teamviewer.remotecontrollib.swig;

import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class IConnectivityStateViewModelSWIGJNI {
    public static final native int IConnectivityStateViewModel_GetState(long j, IConnectivityStateViewModel iConnectivityStateViewModel);

    public static final native void IConnectivityStateViewModel_RegisterForChanges(long j, IConnectivityStateViewModel iConnectivityStateViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void delete_IConnectivityStateViewModel(long j);
}
