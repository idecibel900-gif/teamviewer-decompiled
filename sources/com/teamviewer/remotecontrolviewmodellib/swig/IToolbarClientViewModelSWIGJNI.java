package com.teamviewer.remotecontrolviewmodellib.swig;

/* JADX INFO: loaded from: classes.dex */
public abstract class IToolbarClientViewModelSWIGJNI {
    public static final native long IToolbarClientViewModel_MicMuted(long j, IToolbarClientViewModel iToolbarClientViewModel);

    public static final native void IToolbarClientViewModel_RegisterForButtonStateChanged(long j, IToolbarClientViewModel iToolbarClientViewModel, long j2, ToolbarClientButtonStateSignalCallback toolbarClientButtonStateSignalCallback);

    public static final native long IToolbarClientViewModel_VideoStreamPaused(long j, IToolbarClientViewModel iToolbarClientViewModel);

    public static final native void delete_IToolbarClientViewModel(long j);
}
