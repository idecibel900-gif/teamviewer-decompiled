package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class IGroupMemberListSearchViewModelSWIGJNI {
    public static final native long IGroupMemberListSearchViewModel_GetItemIdAtPosition(long j, IGroupMemberListSearchViewModel iGroupMemberListSearchViewModel, int i);

    public static final native String IGroupMemberListSearchViewModel_GetItemManagedDeviceIdAtPosition(long j, IGroupMemberListSearchViewModel iGroupMemberListSearchViewModel, int i);

    public static final native int IGroupMemberListSearchViewModel_GetSize(long j, IGroupMemberListSearchViewModel iGroupMemberListSearchViewModel);

    public static final native void IGroupMemberListSearchViewModel_RegisterForChanges(long j, IGroupMemberListSearchViewModel iGroupMemberListSearchViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native boolean IGroupMemberListSearchViewModel_ShouldShowEmptyResultsView(long j, IGroupMemberListSearchViewModel iGroupMemberListSearchViewModel);

    public static final native void IGroupMemberListSearchViewModel_UpdateSearch(long j, IGroupMemberListSearchViewModel iGroupMemberListSearchViewModel, String str);

    public static final native void delete_IGroupMemberListSearchViewModel(long j);
}
