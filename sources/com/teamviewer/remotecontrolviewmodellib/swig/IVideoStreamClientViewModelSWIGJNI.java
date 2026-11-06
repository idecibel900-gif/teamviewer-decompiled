package com.teamviewer.remotecontrolviewmodellib.swig;

import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class IVideoStreamClientViewModelSWIGJNI {
    public static final native int IVideoStreamClientViewModel_GetVideoHeight(long j, IVideoStreamClientViewModel iVideoStreamClientViewModel);

    public static final native int IVideoStreamClientViewModel_GetVideoOffsetX(long j, IVideoStreamClientViewModel iVideoStreamClientViewModel);

    public static final native int IVideoStreamClientViewModel_GetVideoOffsetY(long j, IVideoStreamClientViewModel iVideoStreamClientViewModel);

    public static final native int IVideoStreamClientViewModel_GetVideoWidth(long j, IVideoStreamClientViewModel iVideoStreamClientViewModel);

    public static final native void IVideoStreamClientViewModel_RegisterForRequestRender(long j, IVideoStreamClientViewModel iVideoStreamClientViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void IVideoStreamClientViewModel_SendPauseVideoStream(long j, IVideoStreamClientViewModel iVideoStreamClientViewModel);

    public static final native void IVideoStreamClientViewModel_SendResumeVideoStream(long j, IVideoStreamClientViewModel iVideoStreamClientViewModel);

    public static final native void IVideoStreamClientViewModel_ViewportCreated(long j, IVideoStreamClientViewModel iVideoStreamClientViewModel);

    public static final native void IVideoStreamClientViewModel_ViewportDestroyed(long j, IVideoStreamClientViewModel iVideoStreamClientViewModel);

    public static final native void IVideoStreamClientViewModel_ViewportRender(long j, IVideoStreamClientViewModel iVideoStreamClientViewModel);

    public static final native void IVideoStreamClientViewModel_ViewportSizeChanged(long j, IVideoStreamClientViewModel iVideoStreamClientViewModel, int i, int i2);

    public static final native void delete_IVideoStreamClientViewModel(long j);
}
