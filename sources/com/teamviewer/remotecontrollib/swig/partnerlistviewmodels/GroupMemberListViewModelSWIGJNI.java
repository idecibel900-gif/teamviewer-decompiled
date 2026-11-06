package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

import com.teamviewer.commonviewmodel.swig.ErrorCodeResultCallback;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class GroupMemberListViewModelSWIGJNI {
    public static final native long GroupMemberListViewModel_GetElement(long j, GroupMemberListViewModel groupMemberListViewModel, long j2, IndexPath indexPath);

    public static final native long GroupMemberListViewModel_GetSize(long j, GroupMemberListViewModel groupMemberListViewModel, int i);

    public static final native long GroupMemberListViewModel_GetTotalListSize(long j, GroupMemberListViewModel groupMemberListViewModel);

    public static final native long GroupMemberListViewModel_GroupNameChanged(long j, GroupMemberListViewModel groupMemberListViewModel);

    public static final native void GroupMemberListViewModel_RegisterForChanges(long j, GroupMemberListViewModel groupMemberListViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void GroupMemberListViewModel_RegisterForDelete(long j, GroupMemberListViewModel groupMemberListViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void GroupMemberListViewModel_RemoveGroup(long j, GroupMemberListViewModel groupMemberListViewModel, long j2, ErrorCodeResultCallback errorCodeResultCallback);

    public static final native void GroupMemberListViewModel_RenameGroup(long j, GroupMemberListViewModel groupMemberListViewModel, String str, long j2, ErrorCodeResultCallback errorCodeResultCallback);

    public static final native void delete_GroupMemberListViewModel(long j);
}
