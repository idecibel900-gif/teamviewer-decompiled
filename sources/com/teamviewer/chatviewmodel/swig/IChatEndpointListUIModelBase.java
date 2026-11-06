package com.teamviewer.chatviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class IChatEndpointListUIModelBase {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IChatEndpointListUIModelBase(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IChatEndpointListUIModelBase iChatEndpointListUIModelBase) {
        if (iChatEndpointListUIModelBase == null) {
            return 0L;
        }
        return iChatEndpointListUIModelBase.swigCPtr;
    }

    public boolean CanSelectMoreEndpoints() {
        return IChatEndpointListUIModelBaseSWIGJNI.IChatEndpointListUIModelBase_CanSelectMoreEndpoints(this.swigCPtr, this);
    }

    public void DeselectChatEndpointAtPosition(int i) {
        IChatEndpointListUIModelBaseSWIGJNI.IChatEndpointListUIModelBase_DeselectChatEndpointAtPosition(this.swigCPtr, this, i);
    }

    public IChatEndpointUIModel GetChatEndpointUIModelAtPosition(int i) {
        long jIChatEndpointListUIModelBase_GetChatEndpointUIModelAtPosition = IChatEndpointListUIModelBaseSWIGJNI.IChatEndpointListUIModelBase_GetChatEndpointUIModelAtPosition(this.swigCPtr, this, i);
        if (jIChatEndpointListUIModelBase_GetChatEndpointUIModelAtPosition == 0) {
            return null;
        }
        return new IChatEndpointUIModel(jIChatEndpointListUIModelBase_GetChatEndpointUIModelAtPosition, true);
    }

    public int GetNumberOfChatEndpoints() {
        return IChatEndpointListUIModelBaseSWIGJNI.IChatEndpointListUIModelBase_GetNumberOfChatEndpoints(this.swigCPtr, this);
    }

    public boolean IsLoggedIn() {
        return IChatEndpointListUIModelBaseSWIGJNI.IChatEndpointListUIModelBase_IsLoggedIn(this.swigCPtr, this);
    }

    public void SelectChatEndpointAtPosition(int i) {
        IChatEndpointListUIModelBaseSWIGJNI.IChatEndpointListUIModelBase_SelectChatEndpointAtPosition(this.swigCPtr, this, i);
    }

    public void SetFilter(String str) {
        IChatEndpointListUIModelBaseSWIGJNI.IChatEndpointListUIModelBase_SetFilter(this.swigCPtr, this, str);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IChatEndpointListUIModelBaseSWIGJNI.delete_IChatEndpointListUIModelBase(j);
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
