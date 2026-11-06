package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class GroupMemberListElementViewModelSWIGJNI {
    public static final native void GroupMemberListElementViewModel_ActivateRemoteAccessEndpoint(long j, GroupMemberListElementViewModel groupMemberListElementViewModel);

    public static final native String GroupMemberListElementViewModel_GetAccountPictureUrl(long j, GroupMemberListElementViewModel groupMemberListElementViewModel);

    public static final native BigInteger GroupMemberListElementViewModel_GetChatEndPoint(long j, GroupMemberListElementViewModel groupMemberListElementViewModel);

    public static final native long GroupMemberListElementViewModel_GetID(long j, GroupMemberListElementViewModel groupMemberListElementViewModel);

    public static final native String GroupMemberListElementViewModel_GetName(long j, GroupMemberListElementViewModel groupMemberListElementViewModel);

    public static final native int GroupMemberListElementViewModel_GetOnlineState(long j, GroupMemberListElementViewModel groupMemberListElementViewModel);

    public static final native int GroupMemberListElementViewModel_GetType(long j, GroupMemberListElementViewModel groupMemberListElementViewModel);

    public static final native boolean GroupMemberListElementViewModel_IsChatPossible(long j, GroupMemberListElementViewModel groupMemberListElementViewModel);

    public static final native boolean GroupMemberListElementViewModel_IsEditableByMe(long j, GroupMemberListElementViewModel groupMemberListElementViewModel);

    public static final native boolean GroupMemberListElementViewModel_IsMobileWakeActive(long j, GroupMemberListElementViewModel groupMemberListElementViewModel);

    public static final native boolean GroupMemberListElementViewModel_IsOnline(long j, GroupMemberListElementViewModel groupMemberListElementViewModel);

    public static final native void GroupMemberListElementViewModel_RegisterForChanges(long j, GroupMemberListElementViewModel groupMemberListElementViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void GroupMemberListElementViewModel_RegisterForEndpointActivationChanges(long j, GroupMemberListElementViewModel groupMemberListElementViewModel, long j2, RemoteAccessEndpointActivationSignalCallback remoteAccessEndpointActivationSignalCallback);

    public static final native boolean GroupMemberListElementViewModel_ShouldShowAlarmsOverview(long j, GroupMemberListElementViewModel groupMemberListElementViewModel);

    public static final native boolean GroupMemberListElementViewModel_ShowActivateRemoteAccessEndpoint(long j, GroupMemberListElementViewModel groupMemberListElementViewModel);

    public static final native boolean GroupMemberListElementViewModel_ShowChatTo(long j, GroupMemberListElementViewModel groupMemberListElementViewModel);

    public static final native boolean GroupMemberListElementViewModel_ShowConnect(long j, GroupMemberListElementViewModel groupMemberListElementViewModel);

    public static final native boolean GroupMemberListElementViewModel_ShowConnectConfirm(long j, GroupMemberListElementViewModel groupMemberListElementViewModel);

    public static final native boolean GroupMemberListElementViewModel_ShowConnectRemoteAccess(long j, GroupMemberListElementViewModel groupMemberListElementViewModel);

    public static final native boolean GroupMemberListElementViewModel_ShowFileTransfer(long j, GroupMemberListElementViewModel groupMemberListElementViewModel);

    public static final native boolean GroupMemberListElementViewModel_ShowStartApp(long j, GroupMemberListElementViewModel groupMemberListElementViewModel);

    public static final native boolean GroupMemberListElementViewModel_ShowWakeOnLan(long j, GroupMemberListElementViewModel groupMemberListElementViewModel);

    public static final native void GroupMemberListElementViewModel_WakeOnLan(long j, GroupMemberListElementViewModel groupMemberListElementViewModel);

    public static final native void delete_GroupMemberListElementViewModel(long j);
}
