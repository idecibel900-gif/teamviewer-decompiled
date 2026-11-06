package com.teamviewer.commonviewmodel.swig;

import com.teamviewer.swigcallbacklib.BoolSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public class IIntuneModuleAdapter {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IIntuneModuleAdapter(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IIntuneModuleAdapter iIntuneModuleAdapter) {
        if (iIntuneModuleAdapter == null) {
            return 0L;
        }
        return iIntuneModuleAdapter.swigCPtr;
    }

    public boolean IsModuleAvailable() {
        return IIntuneModuleAdapterSWIGJNI.IIntuneModuleAdapter_IsModuleAvailable(this.swigCPtr, this);
    }

    public void RegisterIntuneModuleAvailableCallback(BoolSignalCallback boolSignalCallback) {
        IIntuneModuleAdapterSWIGJNI.IIntuneModuleAdapter_RegisterIntuneModuleAvailableCallback(this.swigCPtr, this, BoolSignalCallback.getCPtr(boolSignalCallback), boolSignalCallback);
    }

    public void UpdateEntraDeviceId(String str) {
        IIntuneModuleAdapterSWIGJNI.IIntuneModuleAdapter_UpdateEntraDeviceId(this.swigCPtr, this, str);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IIntuneModuleAdapterSWIGJNI.delete_IIntuneModuleAdapter(j);
                }
                this.swigCPtr = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void finalize() {
        delete();
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }
}
