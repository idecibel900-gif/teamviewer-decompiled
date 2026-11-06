package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class GroupListElementViewModelSWIGJNI {
    public static final native int GroupListElementViewModel_GetGroupSharingStatus(long j, GroupListElementViewModel groupListElementViewModel);

    public static final native long GroupListElementViewModel_GetID(long j, GroupListElementViewModel groupListElementViewModel);

    public static final native String GroupListElementViewModel_GetName(long j, GroupListElementViewModel groupListElementViewModel);

    public static final native void GroupListElementViewModel_RegisterForChanges(long j, GroupListElementViewModel groupListElementViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native long GroupListElementViewModel_SWIGSmartPtrUpcast(long j);

    public static final native void delete_GroupListElementViewModel(long j);
}
