package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

import com.teamviewer.swigcallbacklib.StringSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class ManagedGroupV2ViewModelSWIGJNI {
    public static final native String ManagedGroupV2ViewModel_GetGroupName(long j, ManagedGroupV2ViewModel managedGroupV2ViewModel);

    public static final native void ManagedGroupV2ViewModel_RegisterForNameChanges(long j, ManagedGroupV2ViewModel managedGroupV2ViewModel, long j2, StringSignalCallback stringSignalCallback);

    public static final native void delete_ManagedGroupV2ViewModel(long j);
}
