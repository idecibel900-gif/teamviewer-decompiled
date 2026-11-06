package com.teamviewer.chatviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class IConversationMemberListUIModel {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IConversationMemberListUIModel(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IConversationMemberListUIModel iConversationMemberListUIModel) {
        if (iConversationMemberListUIModel == null) {
            return 0L;
        }
        return iConversationMemberListUIModel.swigCPtr;
    }

    public IConversationMemberUIModel GetConversationMemberAtPosition(int i) {
        long jIConversationMemberListUIModel_GetConversationMemberAtPosition = IConversationMemberListUIModelSWIGJNI.IConversationMemberListUIModel_GetConversationMemberAtPosition(this.swigCPtr, this, i);
        if (jIConversationMemberListUIModel_GetConversationMemberAtPosition == 0) {
            return null;
        }
        return new IConversationMemberUIModel(jIConversationMemberListUIModel_GetConversationMemberAtPosition, true);
    }

    public String GetConversationName() {
        return IConversationMemberListUIModelSWIGJNI.IConversationMemberListUIModel_GetConversationName(this.swigCPtr, this);
    }

    public int GetMemberCount() {
        return IConversationMemberListUIModelSWIGJNI.IConversationMemberListUIModel_GetMemberCount(this.swigCPtr, this);
    }

    public boolean IsPrivate() {
        return IConversationMemberListUIModelSWIGJNI.IConversationMemberListUIModel_IsPrivate(this.swigCPtr, this);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IConversationMemberListUIModelSWIGJNI.delete_IConversationMemberListUIModel(j);
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
