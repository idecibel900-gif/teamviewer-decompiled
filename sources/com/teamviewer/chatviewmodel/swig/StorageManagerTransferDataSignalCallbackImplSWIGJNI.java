package com.teamviewer.chatviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class StorageManagerTransferDataSignalCallbackImplSWIGJNI {
    static {
        swig_module_init();
    }

    public static final native void StorageManagerTransferDataSignalCallbackImpl_PerformCallback(long j, StorageManagerTransferDataSignalCallbackImpl storageManagerTransferDataSignalCallbackImpl, long j2, StorageManagerTransferData storageManagerTransferData);

    public static final native long StorageManagerTransferDataSignalCallbackImpl_SWIGUpcast(long j);

    public static final native void StorageManagerTransferDataSignalCallbackImpl_change_ownership(StorageManagerTransferDataSignalCallbackImpl storageManagerTransferDataSignalCallbackImpl, long j, boolean z);

    public static final native void StorageManagerTransferDataSignalCallbackImpl_director_connect(StorageManagerTransferDataSignalCallbackImpl storageManagerTransferDataSignalCallbackImpl, long j, boolean z, boolean z2);

    public static void SwigDirector_StorageManagerTransferDataSignalCallbackImpl_PerformCallback(StorageManagerTransferDataSignalCallbackImpl storageManagerTransferDataSignalCallbackImpl, long j) {
        storageManagerTransferDataSignalCallbackImpl.PerformCallback(new StorageManagerTransferData(j, false));
    }

    public static final native void delete_StorageManagerTransferDataSignalCallbackImpl(long j);

    public static final native long new_StorageManagerTransferDataSignalCallbackImpl();

    private static final native void swig_module_init();
}
