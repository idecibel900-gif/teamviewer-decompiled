package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class IPLSynchronizationStateViewModelSWIGJNI {
    public static final native void IPLSynchronizationStateViewModel_RegisterForSynchronizationChanges(long j, IPLSynchronizationStateViewModel iPLSynchronizationStateViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void IPLSynchronizationStateViewModel_ReportErrorShown(long j, IPLSynchronizationStateViewModel iPLSynchronizationStateViewModel);

    public static final native void IPLSynchronizationStateViewModel_RetrySynchronization(long j, IPLSynchronizationStateViewModel iPLSynchronizationStateViewModel);

    public static final native boolean IPLSynchronizationStateViewModel_SynchronizationFailed(long j, IPLSynchronizationStateViewModel iPLSynchronizationStateViewModel);

    public static final native boolean IPLSynchronizationStateViewModel_SynchronizationSucceeded(long j, IPLSynchronizationStateViewModel iPLSynchronizationStateViewModel);

    public static final native void delete_IPLSynchronizationStateViewModel(long j);
}
