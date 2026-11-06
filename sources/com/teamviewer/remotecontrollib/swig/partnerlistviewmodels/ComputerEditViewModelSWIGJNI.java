package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

import com.teamviewer.commonviewmodel.swig.ErrorCodeResultCallback;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListGroupID;
import com.teamviewer.swigcallbacklib.VoidResultCallback;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class ComputerEditViewModelSWIGJNI {
    public static final native void ComputerEditViewModel_CreateComputer(long j, ComputerEditViewModel computerEditViewModel, String str, String str2, String str3, long j2, PListGroupID pListGroupID, String str4, long j3, ErrorCodeResultCallback errorCodeResultCallback);

    public static final native String ComputerEditViewModel_GetAlias(long j, ComputerEditViewModel computerEditViewModel);

    public static final native String ComputerEditViewModel_GetDisplayName(long j, ComputerEditViewModel computerEditViewModel);

    public static final native long ComputerEditViewModel_GetDyngateID(long j, ComputerEditViewModel computerEditViewModel);

    public static final native long ComputerEditViewModel_GetGroupID(long j, ComputerEditViewModel computerEditViewModel);

    public static final native String ComputerEditViewModel_GetNote(long j, ComputerEditViewModel computerEditViewModel);

    public static final native String ComputerEditViewModel_GetPassword(long j, ComputerEditViewModel computerEditViewModel);

    public static final native boolean ComputerEditViewModel_HasPasswordSet(long j, ComputerEditViewModel computerEditViewModel);

    public static final native boolean ComputerEditViewModel_IsEditableByMe(long j, ComputerEditViewModel computerEditViewModel);

    public static final native boolean ComputerEditViewModel_IsITbRemoteAccessActivated(long j, ComputerEditViewModel computerEditViewModel);

    public static final native boolean ComputerEditViewModel_IsMobileWakeActivated(long j, ComputerEditViewModel computerEditViewModel);

    public static final native void ComputerEditViewModel_RegisterForDelete(long j, ComputerEditViewModel computerEditViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void ComputerEditViewModel_ReportEvent(long j, ComputerEditViewModel computerEditViewModel, int i);

    public static final native void ComputerEditViewModel_TriggerMobileWake(long j, ComputerEditViewModel computerEditViewModel, long j2, VoidResultCallback voidResultCallback);

    public static final native void ComputerEditViewModel_UpdateComputer(long j, ComputerEditViewModel computerEditViewModel, String str, String str2, boolean z, long j2, PListGroupID pListGroupID, String str3, long j3, ErrorCodeResultCallback errorCodeResultCallback);

    public static final native void delete_ComputerEditViewModel(long j);
}
