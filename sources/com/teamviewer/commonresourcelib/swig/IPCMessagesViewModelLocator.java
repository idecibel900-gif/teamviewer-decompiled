package com.teamviewer.commonresourcelib.swig;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class IPCMessagesViewModelLocator {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IPCMessagesViewModelLocator() {
        this(IPCMessagesViewModelLocatorSWIGJNI.new_IPCMessagesViewModelLocator(), true);
    }

    public static IIPCMessagesViewModel GetIIPCMessagesViewModel() {
        long jIPCMessagesViewModelLocator_GetIIPCMessagesViewModel = IPCMessagesViewModelLocatorSWIGJNI.IPCMessagesViewModelLocator_GetIIPCMessagesViewModel();
        if (jIPCMessagesViewModelLocator_GetIIPCMessagesViewModel == 0) {
            return null;
        }
        return new IIPCMessagesViewModel(jIPCMessagesViewModelLocator_GetIIPCMessagesViewModel, true);
    }

    public static void SetLegacyUIModelFactoryAndroid(SWIGTYPE_p_tvuimodels__LegacyUIModelFactoryAndroid__SharedPtr sWIGTYPE_p_tvuimodels__LegacyUIModelFactoryAndroid__SharedPtr) {
        IPCMessagesViewModelLocatorSWIGJNI.IPCMessagesViewModelLocator_SetLegacyUIModelFactoryAndroid(SWIGTYPE_p_tvuimodels__LegacyUIModelFactoryAndroid__SharedPtr.getCPtr(sWIGTYPE_p_tvuimodels__LegacyUIModelFactoryAndroid__SharedPtr));
    }

    public static long getCPtr(IPCMessagesViewModelLocator iPCMessagesViewModelLocator) {
        if (iPCMessagesViewModelLocator == null) {
            return 0L;
        }
        return iPCMessagesViewModelLocator.swigCPtr;
    }

    public static long swigRelease(IPCMessagesViewModelLocator iPCMessagesViewModelLocator) {
        if (iPCMessagesViewModelLocator != null) {
            if (iPCMessagesViewModelLocator.swigCMemOwn) {
                long j = iPCMessagesViewModelLocator.swigCPtr;
                iPCMessagesViewModelLocator.swigCMemOwn = false;
                iPCMessagesViewModelLocator.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IPCMessagesViewModelLocatorSWIGJNI.delete_IPCMessagesViewModelLocator(j);
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

    public IPCMessagesViewModelLocator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
