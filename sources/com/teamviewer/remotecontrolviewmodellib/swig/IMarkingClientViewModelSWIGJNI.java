package com.teamviewer.remotecontrolviewmodellib.swig;

import com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks.ISelectedMarkerDataUpdateSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class IMarkingClientViewModelSWIGJNI {
    public static final native void IMarkingClientViewModel_ClearAllMarkers(long j, IMarkingClientViewModel iMarkingClientViewModel);

    public static final native void IMarkingClientViewModel_ClearParticipantMarkers(long j, IMarkingClientViewModel iMarkingClientViewModel);

    public static final native void IMarkingClientViewModel_CreateArrow(long j, IMarkingClientViewModel iMarkingClientViewModel, double d, double d2, boolean z);

    public static final native long IMarkingClientViewModel_GetMaximumTextLength(long j, IMarkingClientViewModel iMarkingClientViewModel);

    public static final native void IMarkingClientViewModel_OnScroll(long j, IMarkingClientViewModel iMarkingClientViewModel, double d, double d2, double d3, double d4);

    public static final native void IMarkingClientViewModel_OnUp(long j, IMarkingClientViewModel iMarkingClientViewModel, boolean z);

    public static final native void IMarkingClientViewModel_RemoveLastMarker(long j, IMarkingClientViewModel iMarkingClientViewModel);

    public static final native void IMarkingClientViewModel_SendText(long j, IMarkingClientViewModel iMarkingClientViewModel);

    public static final native void IMarkingClientViewModel_SetTextForFocusedMarker(long j, IMarkingClientViewModel iMarkingClientViewModel, String str);

    public static final native void IMarkingClientViewModel_registerForSelectedMarkerText(long j, IMarkingClientViewModel iMarkingClientViewModel, long j2, ISelectedMarkerDataUpdateSignalCallback iSelectedMarkerDataUpdateSignalCallback);

    public static final native void delete_IMarkingClientViewModel(long j);
}
