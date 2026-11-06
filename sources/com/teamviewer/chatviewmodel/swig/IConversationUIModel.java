package com.teamviewer.chatviewmodel.swig;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public class IConversationUIModel {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IConversationUIModel(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IConversationUIModel iConversationUIModel) {
        if (iConversationUIModel == null) {
            return 0L;
        }
        return iConversationUIModel.swigCPtr;
    }

    public String GetAccountPictureUrl() {
        return IConversationUIModelSWIGJNI.IConversationUIModel_GetAccountPictureUrl(this.swigCPtr, this);
    }

    public ChatConversationID GetConversationID() {
        return new ChatConversationID(IConversationUIModelSWIGJNI.IConversationUIModel_GetConversationID(this.swigCPtr, this), true);
    }

    public ConversationType GetConversationType() {
        return ConversationType.swigToEnum(IConversationUIModelSWIGJNI.IConversationUIModel_GetConversationType(this.swigCPtr, this));
    }

    public EndpointUIState GetEndpointState() {
        return EndpointUIState.swigToEnum(IConversationUIModelSWIGJNI.IConversationUIModel_GetEndpointState(this.swigCPtr, this));
    }

    public long GetLastActivityTimestamp() {
        return IConversationUIModelSWIGJNI.IConversationUIModel_GetLastActivityTimestamp(this.swigCPtr, this);
    }

    public ChatConversationID GetProviderConversationID() {
        return new ChatConversationID(IConversationUIModelSWIGJNI.IConversationUIModel_GetProviderConversationID(this.swigCPtr, this), true);
    }

    public String GetSubTitle() {
        return IConversationUIModelSWIGJNI.IConversationUIModel_GetSubTitle(this.swigCPtr, this);
    }

    public String GetTitle() {
        return IConversationUIModelSWIGJNI.IConversationUIModel_GetTitle(this.swigCPtr, this);
    }

    public boolean HasPersistentHistory() {
        return IConversationUIModelSWIGJNI.IConversationUIModel_HasPersistentHistory(this.swigCPtr, this);
    }

    public boolean HasUnreadMessages() {
        return IConversationUIModelSWIGJNI.IConversationUIModel_HasUnreadMessages(this.swigCPtr, this);
    }

    public boolean IsConversationMuted() {
        return IConversationUIModelSWIGJNI.IConversationUIModel_IsConversationMuted(this.swigCPtr, this);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IConversationUIModelSWIGJNI.delete_IConversationUIModel(j);
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

    public enum ConversationType {
        Unknown,
        ContactConversation,
        ComputerConversation,
        GroupConversation,
        GroupConversationWithShardHistory,
        ServiceCaseConversation,
        EmptyConversation;

        private final int swigValue;

        public static class SwigNext {
            private static int next;

            private SwigNext() {
            }
        }

        ConversationType() {
            int i = SwigNext.next;
            SwigNext.next = i + 1;
            this.swigValue = i;
        }

        public static ConversationType swigToEnum(int i) {
            ConversationType[] conversationTypeArr = (ConversationType[]) ConversationType.class.getEnumConstants();
            if (i < conversationTypeArr.length && i >= 0) {
                ConversationType conversationType = conversationTypeArr[i];
                if (conversationType.swigValue == i) {
                    return conversationType;
                }
            }
            for (ConversationType conversationType2 : conversationTypeArr) {
                if (conversationType2.swigValue == i) {
                    return conversationType2;
                }
            }
            hk0.g(ua5.k(i, ConversationType.class, "No enum ", " with value "));
            return null;
        }

        public final int swigValue() {
            return this.swigValue;
        }

        ConversationType(int i) {
            this.swigValue = i;
            SwigNext.next = i + 1;
        }

        ConversationType(ConversationType conversationType) {
            int i = conversationType.swigValue;
            this.swigValue = i;
            SwigNext.next = i + 1;
        }
    }
}
