package com.teamviewer.remotecontrollib.swig;

import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class IBannerViewModelSWIGJNI {
    public static final native int IBannerViewModel_GetBannerState(long j, IBannerViewModel iBannerViewModel);

    public static final native void IBannerViewModel_RegisterForChanges(long j, IBannerViewModel iBannerViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void delete_IBannerViewModel(long j);
}
