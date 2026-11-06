package com.teamviewer.chatviewmodel.swig;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class IOwnFileMessageUIModelSWIGJNI {
    public static final native void IOwnFileMessageUIModel_CancelDownload(long j, IOwnFileMessageUIModel iOwnFileMessageUIModel);

    public static final native void IOwnFileMessageUIModel_DownloadFile(long j, IOwnFileMessageUIModel iOwnFileMessageUIModel);

    public static final native void IOwnFileMessageUIModel_DownloadThumbnail(long j, IOwnFileMessageUIModel iOwnFileMessageUIModel);

    public static final native String IOwnFileMessageUIModel_GetDownloadFilePath(long j, IOwnFileMessageUIModel iOwnFileMessageUIModel);

    public static final native long IOwnFileMessageUIModel_GetDownloadProgress(long j, IOwnFileMessageUIModel iOwnFileMessageUIModel);

    public static final native String IOwnFileMessageUIModel_GetFileName(long j, IOwnFileMessageUIModel iOwnFileMessageUIModel);

    public static final native BigInteger IOwnFileMessageUIModel_GetFileSize(long j, IOwnFileMessageUIModel iOwnFileMessageUIModel);

    public static final native byte[] IOwnFileMessageUIModel_GetThumbnailData(long j, IOwnFileMessageUIModel iOwnFileMessageUIModel);

    public static final native String IOwnFileMessageUIModel_GetThumbnailMimeType(long j, IOwnFileMessageUIModel iOwnFileMessageUIModel);

    public static final native boolean IOwnFileMessageUIModel_HasThumbnail(long j, IOwnFileMessageUIModel iOwnFileMessageUIModel);

    public static final native boolean IOwnFileMessageUIModel_IsDownloadReady(long j, IOwnFileMessageUIModel iOwnFileMessageUIModel);

    public static final native boolean IOwnFileMessageUIModel_IsDownloading(long j, IOwnFileMessageUIModel iOwnFileMessageUIModel);

    public static final native long IOwnFileMessageUIModel_SWIGSmartPtrUpcast(long j);

    public static final native void delete_IOwnFileMessageUIModel(long j);
}
