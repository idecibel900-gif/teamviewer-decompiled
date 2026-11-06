package com.teamviewer.chatviewmodel.swig;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class IRemoteFileMessageUIModelSWIGJNI {
    public static final native void IRemoteFileMessageUIModel_CancelDownload(long j, IRemoteFileMessageUIModel iRemoteFileMessageUIModel);

    public static final native void IRemoteFileMessageUIModel_DownloadFile(long j, IRemoteFileMessageUIModel iRemoteFileMessageUIModel);

    public static final native void IRemoteFileMessageUIModel_DownloadThumbnail(long j, IRemoteFileMessageUIModel iRemoteFileMessageUIModel);

    public static final native String IRemoteFileMessageUIModel_GetDownloadFilePath(long j, IRemoteFileMessageUIModel iRemoteFileMessageUIModel);

    public static final native long IRemoteFileMessageUIModel_GetDownloadProgress(long j, IRemoteFileMessageUIModel iRemoteFileMessageUIModel);

    public static final native String IRemoteFileMessageUIModel_GetFileName(long j, IRemoteFileMessageUIModel iRemoteFileMessageUIModel);

    public static final native BigInteger IRemoteFileMessageUIModel_GetFileSize(long j, IRemoteFileMessageUIModel iRemoteFileMessageUIModel);

    public static final native byte[] IRemoteFileMessageUIModel_GetThumbnailData(long j, IRemoteFileMessageUIModel iRemoteFileMessageUIModel);

    public static final native String IRemoteFileMessageUIModel_GetThumbnailMimeType(long j, IRemoteFileMessageUIModel iRemoteFileMessageUIModel);

    public static final native boolean IRemoteFileMessageUIModel_HasThumbnail(long j, IRemoteFileMessageUIModel iRemoteFileMessageUIModel);

    public static final native boolean IRemoteFileMessageUIModel_IsDownloadFailed(long j, IRemoteFileMessageUIModel iRemoteFileMessageUIModel);

    public static final native boolean IRemoteFileMessageUIModel_IsDownloadReady(long j, IRemoteFileMessageUIModel iRemoteFileMessageUIModel);

    public static final native boolean IRemoteFileMessageUIModel_IsDownloading(long j, IRemoteFileMessageUIModel iRemoteFileMessageUIModel);

    public static final native long IRemoteFileMessageUIModel_SWIGSmartPtrUpcast(long j);

    public static final native void delete_IRemoteFileMessageUIModel(long j);
}
