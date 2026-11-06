package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

import com.teamviewer.commonviewmodel.swig.ErrorCodeResultCallback;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListGroupID;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class GroupListViewModelSWIGJNI {
    public static final native void GroupListViewModel_CreateGroup(long j, GroupListViewModel groupListViewModel, String str, long j2, ErrorCodeResultCallback errorCodeResultCallback);

    public static final native long GroupListViewModel_GetElement(long j, GroupListViewModel groupListViewModel, int i);

    public static final native int GroupListViewModel_GetIndexForGroupID(long j, GroupListViewModel groupListViewModel, long j2, PListGroupID pListGroupID);

    public static final native int GroupListViewModel_GetSize(long j, GroupListViewModel groupListViewModel);

    public static final native boolean GroupListViewModel_HasGroups(long j, GroupListViewModel groupListViewModel);

    public static final native boolean GroupListViewModel_IsEnabled(long j, GroupListViewModel groupListViewModel, int i);

    public static final native void GroupListViewModel_RegisterForChanges(long j, GroupListViewModel groupListViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void GroupListViewModel_ReportEvent(long j, GroupListViewModel groupListViewModel, int i);

    public static final native void delete_GroupListViewModel(long j);
}
