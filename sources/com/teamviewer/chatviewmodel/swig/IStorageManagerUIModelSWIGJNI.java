package com.teamviewer.chatviewmodel.swig;

import com.teamviewer.swigcallbacklib.StringSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public class IStorageManagerUIModelSWIGJNI {
    public static final native void IStorageManagerUIModel_NotifyDownloadFinished(long j, IStorageManagerUIModel iStorageManagerUIModel, String str, int i);

    public static final native void IStorageManagerUIModel_NotifyDownloadProgress(long j, IStorageManagerUIModel iStorageManagerUIModel, String str, int i);

    public static final native void IStorageManagerUIModel_NotifyUploadFinished(long j, IStorageManagerUIModel iStorageManagerUIModel, String str, int i);

    public static final native void IStorageManagerUIModel_NotifyUploadProgress(long j, IStorageManagerUIModel iStorageManagerUIModel, String str, int i);

    public static final native void IStorageManagerUIModel_RegisterForCancel(long j, IStorageManagerUIModel iStorageManagerUIModel, long j2, StringSignalCallback stringSignalCallback);

    public static final native void IStorageManagerUIModel_RegisterForDownload(long j, IStorageManagerUIModel iStorageManagerUIModel, long j2, StorageManagerTransferDataSignalCallback storageManagerTransferDataSignalCallback);

    public static final native void IStorageManagerUIModel_RegisterForUpload(long j, IStorageManagerUIModel iStorageManagerUIModel, long j2, StorageManagerTransferDataSignalCallback storageManagerTransferDataSignalCallback);

    public static final native void delete_IStorageManagerUIModel(long j);
}
