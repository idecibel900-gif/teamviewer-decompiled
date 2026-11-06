package com.teamviewer.chatviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class ILocalMessageUIModelBaseSWIGJNI {
    public static final native void ILocalMessageUIModelBase_DeleteMessage(long j, ILocalMessageUIModelBase iLocalMessageUIModelBase);

    public static final native boolean ILocalMessageUIModelBase_DeliveryFailed(long j, ILocalMessageUIModelBase iLocalMessageUIModelBase);

    public static final native int ILocalMessageUIModelBase_GetDeleteOptions(long j, ILocalMessageUIModelBase iLocalMessageUIModelBase);

    public static final native int ILocalMessageUIModelBase_GetResendOptions(long j, ILocalMessageUIModelBase iLocalMessageUIModelBase);

    public static final native long ILocalMessageUIModelBase_GetTimestamp(long j, ILocalMessageUIModelBase iLocalMessageUIModelBase);

    public static final native void ILocalMessageUIModelBase_SendMessageAgain(long j, ILocalMessageUIModelBase iLocalMessageUIModelBase);

    public static final native boolean ILocalMessageUIModelBase_WasRead(long j, ILocalMessageUIModelBase iLocalMessageUIModelBase);

    public static final native boolean ILocalMessageUIModelBase_WasSent(long j, ILocalMessageUIModelBase iLocalMessageUIModelBase);

    public static final native void delete_ILocalMessageUIModelBase(long j);
}
