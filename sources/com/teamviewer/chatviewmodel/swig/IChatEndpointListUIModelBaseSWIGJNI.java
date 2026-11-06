package com.teamviewer.chatviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class IChatEndpointListUIModelBaseSWIGJNI {
    public static final native boolean IChatEndpointListUIModelBase_CanSelectMoreEndpoints(long j, IChatEndpointListUIModelBase iChatEndpointListUIModelBase);

    public static final native void IChatEndpointListUIModelBase_DeselectChatEndpointAtPosition(long j, IChatEndpointListUIModelBase iChatEndpointListUIModelBase, int i);

    public static final native long IChatEndpointListUIModelBase_GetChatEndpointUIModelAtPosition(long j, IChatEndpointListUIModelBase iChatEndpointListUIModelBase, int i);

    public static final native int IChatEndpointListUIModelBase_GetNumberOfChatEndpoints(long j, IChatEndpointListUIModelBase iChatEndpointListUIModelBase);

    public static final native boolean IChatEndpointListUIModelBase_IsLoggedIn(long j, IChatEndpointListUIModelBase iChatEndpointListUIModelBase);

    public static final native void IChatEndpointListUIModelBase_SelectChatEndpointAtPosition(long j, IChatEndpointListUIModelBase iChatEndpointListUIModelBase, int i);

    public static final native void IChatEndpointListUIModelBase_SetFilter(long j, IChatEndpointListUIModelBase iChatEndpointListUIModelBase, String str);

    public static final native void delete_IChatEndpointListUIModelBase(long j);
}
