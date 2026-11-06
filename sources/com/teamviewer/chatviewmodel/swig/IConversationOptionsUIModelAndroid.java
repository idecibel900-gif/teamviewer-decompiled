package com.teamviewer.chatviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class IConversationOptionsUIModelAndroid {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IConversationOptionsUIModelAndroid(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid) {
        if (iConversationOptionsUIModelAndroid == null) {
            return 0L;
        }
        return iConversationOptionsUIModelAndroid.swigCPtr;
    }

    public boolean CanAddParticipants() {
        return IConversationOptionsUIModelAndroidSWIGJNI.IConversationOptionsUIModelAndroid_CanAddParticipants(this.swigCPtr, this);
    }

    public boolean CanDeleteConversation() {
        return IConversationOptionsUIModelAndroidSWIGJNI.IConversationOptionsUIModelAndroid_CanDeleteConversation(this.swigCPtr, this);
    }

    public boolean CanDeleteHistory() {
        return IConversationOptionsUIModelAndroidSWIGJNI.IConversationOptionsUIModelAndroid_CanDeleteHistory(this.swigCPtr, this);
    }

    public boolean CanLeaveConversation() {
        return IConversationOptionsUIModelAndroidSWIGJNI.IConversationOptionsUIModelAndroid_CanLeaveConversation(this.swigCPtr, this);
    }

    public boolean CanRemoteControl() {
        return IConversationOptionsUIModelAndroidSWIGJNI.IConversationOptionsUIModelAndroid_CanRemoteControl(this.swigCPtr, this);
    }

    public boolean CanRemoveParticipants() {
        return IConversationOptionsUIModelAndroidSWIGJNI.IConversationOptionsUIModelAndroid_CanRemoveParticipants(this.swigCPtr, this);
    }

    public boolean CanRenameConversation() {
        return IConversationOptionsUIModelAndroidSWIGJNI.IConversationOptionsUIModelAndroid_CanRenameConversation(this.swigCPtr, this);
    }

    public boolean CanSendFile() {
        return IConversationOptionsUIModelAndroidSWIGJNI.IConversationOptionsUIModelAndroid_CanSendFile(this.swigCPtr, this);
    }

    public boolean CanSendMessage() {
        return IConversationOptionsUIModelAndroidSWIGJNI.IConversationOptionsUIModelAndroid_CanSendMessage(this.swigCPtr, this);
    }

    public void DeleteConversation() {
        IConversationOptionsUIModelAndroidSWIGJNI.IConversationOptionsUIModelAndroid_DeleteConversation(this.swigCPtr, this);
    }

    public void DeleteHistory() {
        IConversationOptionsUIModelAndroidSWIGJNI.IConversationOptionsUIModelAndroid_DeleteHistory(this.swigCPtr, this);
    }

    public void GetConnectionInfoForRemoteControl(IConnectionInfoCallback iConnectionInfoCallback) {
        IConversationOptionsUIModelAndroidSWIGJNI.IConversationOptionsUIModelAndroid_GetConnectionInfoForRemoteControl(this.swigCPtr, this, IConnectionInfoCallback.getCPtr(iConnectionInfoCallback), iConnectionInfoCallback);
    }

    public void LeaveConversation() {
        IConversationOptionsUIModelAndroidSWIGJNI.IConversationOptionsUIModelAndroid_LeaveConversation(this.swigCPtr, this);
    }

    public void RemoveParticipant(long j) {
        IConversationOptionsUIModelAndroidSWIGJNI.IConversationOptionsUIModelAndroid_RemoveParticipant(this.swigCPtr, this, j);
    }

    public void RequestRenameConversation(String str) {
        IConversationOptionsUIModelAndroidSWIGJNI.IConversationOptionsUIModelAndroid_RequestRenameConversation(this.swigCPtr, this, str);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IConversationOptionsUIModelAndroidSWIGJNI.delete_IConversationOptionsUIModelAndroid(j);
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
