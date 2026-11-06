package com.teamviewer.chatviewmodel.swig;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class IRemoteFileMessageUIModel extends IRemoteMessageUIModelBase {
    private transient boolean swigCMemOwnDerived;
    private transient long swigCPtr;

    public IRemoteFileMessageUIModel(long j, boolean z) {
        super(IRemoteFileMessageUIModelSWIGJNI.IRemoteFileMessageUIModel_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IRemoteFileMessageUIModel iRemoteFileMessageUIModel) {
        if (iRemoteFileMessageUIModel == null) {
            return 0L;
        }
        return iRemoteFileMessageUIModel.swigCPtr;
    }

    public void CancelDownload() {
        IRemoteFileMessageUIModelSWIGJNI.IRemoteFileMessageUIModel_CancelDownload(this.swigCPtr, this);
    }

    public void DownloadFile() {
        IRemoteFileMessageUIModelSWIGJNI.IRemoteFileMessageUIModel_DownloadFile(this.swigCPtr, this);
    }

    public void DownloadThumbnail() {
        IRemoteFileMessageUIModelSWIGJNI.IRemoteFileMessageUIModel_DownloadThumbnail(this.swigCPtr, this);
    }

    public String GetDownloadFilePath() {
        return IRemoteFileMessageUIModelSWIGJNI.IRemoteFileMessageUIModel_GetDownloadFilePath(this.swigCPtr, this);
    }

    public long GetDownloadProgress() {
        return IRemoteFileMessageUIModelSWIGJNI.IRemoteFileMessageUIModel_GetDownloadProgress(this.swigCPtr, this);
    }

    public String GetFileName() {
        return IRemoteFileMessageUIModelSWIGJNI.IRemoteFileMessageUIModel_GetFileName(this.swigCPtr, this);
    }

    public BigInteger GetFileSize() {
        return IRemoteFileMessageUIModelSWIGJNI.IRemoteFileMessageUIModel_GetFileSize(this.swigCPtr, this);
    }

    public byte[] GetThumbnailData() {
        return IRemoteFileMessageUIModelSWIGJNI.IRemoteFileMessageUIModel_GetThumbnailData(this.swigCPtr, this);
    }

    public String GetThumbnailMimeType() {
        return IRemoteFileMessageUIModelSWIGJNI.IRemoteFileMessageUIModel_GetThumbnailMimeType(this.swigCPtr, this);
    }

    public boolean HasThumbnail() {
        return IRemoteFileMessageUIModelSWIGJNI.IRemoteFileMessageUIModel_HasThumbnail(this.swigCPtr, this);
    }

    public boolean IsDownloadFailed() {
        return IRemoteFileMessageUIModelSWIGJNI.IRemoteFileMessageUIModel_IsDownloadFailed(this.swigCPtr, this);
    }

    public boolean IsDownloadReady() {
        return IRemoteFileMessageUIModelSWIGJNI.IRemoteFileMessageUIModel_IsDownloadReady(this.swigCPtr, this);
    }

    public boolean IsDownloading() {
        return IRemoteFileMessageUIModelSWIGJNI.IRemoteFileMessageUIModel_IsDownloading(this.swigCPtr, this);
    }

    @Override // com.teamviewer.chatviewmodel.swig.IRemoteMessageUIModelBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwnDerived) {
                    this.swigCMemOwnDerived = false;
                    IRemoteFileMessageUIModelSWIGJNI.delete_IRemoteFileMessageUIModel(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.chatviewmodel.swig.IRemoteMessageUIModelBase
    public void finalize() {
        delete();
    }

    @Override // com.teamviewer.chatviewmodel.swig.IRemoteMessageUIModelBase
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }
}
