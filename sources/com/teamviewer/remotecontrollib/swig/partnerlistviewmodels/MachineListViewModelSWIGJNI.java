package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class MachineListViewModelSWIGJNI {
    public static final native long MachineListViewModel_GetElement(long j, MachineListViewModel machineListViewModel, long j2);

    public static final native long MachineListViewModel_GetSize(long j, MachineListViewModel machineListViewModel);

    public static final native boolean MachineListViewModel_IsContactComputerSelectionRequired(long j, MachineListViewModel machineListViewModel);

    public static final native void MachineListViewModel_RegisterForChanges(long j, MachineListViewModel machineListViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void delete_MachineListViewModel(long j);
}
