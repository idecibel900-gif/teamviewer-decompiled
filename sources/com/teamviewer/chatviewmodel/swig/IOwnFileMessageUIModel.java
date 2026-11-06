package com.teamviewer.chatviewmodel.swig;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class IOwnFileMessageUIModel extends ILocalMessageUIModelBase {
    private transient boolean swigCMemOwnDerived;
    private transient long swigCPtr;

    public IOwnFileMessageUIModel(long j, boolean z) {
        super(IOwnFileMessageUIModelSWIGJNI.IOwnFileMessageUIModel_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IOwnFileMessageUIModel iOwnFileMessageUIModel) {
        if (iOwnFileMessageUIModel == null) {
            return 0L;
        }
        return iOwnFileMessageUIModel.swigCPtr;
    }

    public void CancelDownload() {
        IOwnFileMessageUIModelSWIGJNI.IOwnFileMessageUIModel_CancelDownload(this.swigCPtr, this);
    }

    public void DownloadFile() {
        IOwnFileMessageUIModelSWIGJNI.IOwnFileMessageUIModel_DownloadFile(this.swigCPtr, this);
    }

    public void DownloadThumbnail() {
        IOwnFileMessageUIModelSWIGJNI.IOwnFileMessageUIModel_DownloadThumbnail(this.swigCPtr, this);
    }

    public String GetDownloadFilePath() {
        return IOwnFileMessageUIModelSWIGJNI.IOwnFileMessageUIModel_GetDownloadFilePath(this.swigCPtr, this);
    }

    public long GetDownloadProgress() {
        return IOwnFileMessageUIModelSWIGJNI.IOwnFileMessageUIModel_GetDownloadProgress(this.swigCPtr, this);
    }

    public String GetFileName() {
        return IOwnFileMessageUIModelSWIGJNI.IOwnFileMessageUIModel_GetFileName(this.swigCPtr, this);
    }

    public BigInteger GetFileSize() {
        return IOwnFileMessageUIModelSWIGJNI.IOwnFileMessageUIModel_GetFileSize(this.swigCPtr, this);
    }

    public byte[] GetThumbnailData() {
        return IOwnFileMessageUIModelSWIGJNI.IOwnFileMessageUIModel_GetThumbnailData(this.swigCPtr, this);
    }

    public String GetThumbnailMimeType() {
        return IOwnFileMessageUIModelSWIGJNI.IOwnFileMessageUIModel_GetThumbnailMimeType(this.swigCPtr, this);
    }

    public boolean HasThumbnail() {
        return IOwnFileMessageUIModelSWIGJNI.IOwnFileMessageUIModel_HasThumbnail(this.swigCPtr, this);
    }

    public boolean IsDownloadReady() {
        return IOwnFileMessageUIModelSWIGJNI.IOwnFileMessageUIModel_IsDownloadReady(this.swigCPtr, this);
    }

    public boolean IsDownloading() {
        return IOwnFileMessageUIModelSWIGJNI.IOwnFileMessageUIModel_IsDownloading(this.swigCPtr, this);
    }

    @Override // com.teamviewer.chatviewmodel.swig.ILocalMessageUIModelBase
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwnDerived) {
                    this.swigCMemOwnDerived = false;
                    IOwnFileMessageUIModelSWIGJNI.delete_IOwnFileMessageUIModel(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.chatviewmodel.swig.ILocalMessageUIModelBase
    public void finalize() {
        delete();
    }

    @Override // com.teamviewer.chatviewmodel.swig.ILocalMessageUIModelBase
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }
}
