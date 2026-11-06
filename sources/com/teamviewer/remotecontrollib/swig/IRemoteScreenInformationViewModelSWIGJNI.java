package com.teamviewer.remotecontrollib.swig;

import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class IRemoteScreenInformationViewModelSWIGJNI {
    public static final native long IRemoteScreenInformationViewModel_DpiScale(long j, IRemoteScreenInformationViewModel iRemoteScreenInformationViewModel);

    public static final native void IRemoteScreenInformationViewModel_RegisterObserverScreenInformationChanged(long j, IRemoteScreenInformationViewModel iRemoteScreenInformationViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native long IRemoteScreenInformationViewModel_RemoteOriginalSize(long j, IRemoteScreenInformationViewModel iRemoteScreenInformationViewModel);

    public static final native long IRemoteScreenInformationViewModel_ServerScalingFactor(long j, IRemoteScreenInformationViewModel iRemoteScreenInformationViewModel);

    public static final native void delete_IRemoteScreenInformationViewModel(long j);
}
