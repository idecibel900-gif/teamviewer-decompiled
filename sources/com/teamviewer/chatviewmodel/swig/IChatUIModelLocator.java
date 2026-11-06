package com.teamviewer.chatviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class IChatUIModelLocator {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IChatUIModelLocator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IChatUIModelLocator iChatUIModelLocator) {
        if (iChatUIModelLocator == null) {
            return 0L;
        }
        return iChatUIModelLocator.swigCPtr;
    }

    public IAddChatEndpointListUIModel GetAddChatEndpointListUIModel(ChatConversationID chatConversationID) {
        long jIChatUIModelLocator_GetAddChatEndpointListUIModel = IChatUIModelLocatorSWIGJNI.IChatUIModelLocator_GetAddChatEndpointListUIModel(this.swigCPtr, this, ChatConversationID.getCPtr(chatConversationID), chatConversationID);
        if (jIChatUIModelLocator_GetAddChatEndpointListUIModel == 0) {
            return null;
        }
        return new IAddChatEndpointListUIModel(jIChatUIModelLocator_GetAddChatEndpointListUIModel, true);
    }

    public IChatEndpointListUIModel GetChatEndpointListUIModel(ChatConversationID chatConversationID) {
        long jIChatUIModelLocator_GetChatEndpointListUIModel = IChatUIModelLocatorSWIGJNI.IChatUIModelLocator_GetChatEndpointListUIModel(this.swigCPtr, this, ChatConversationID.getCPtr(chatConversationID), chatConversationID);
        if (jIChatUIModelLocator_GetChatEndpointListUIModel == 0) {
            return null;
        }
        return new IChatEndpointListUIModel(jIChatUIModelLocator_GetChatEndpointListUIModel, true);
    }

    public IConversationHistoryListUIModel GetConversationHistoryListUIModelById(ChatConversationID chatConversationID) {
        long jIChatUIModelLocator_GetConversationHistoryListUIModelById = IChatUIModelLocatorSWIGJNI.IChatUIModelLocator_GetConversationHistoryListUIModelById(this.swigCPtr, this, ChatConversationID.getCPtr(chatConversationID), chatConversationID);
        if (jIChatUIModelLocator_GetConversationHistoryListUIModelById == 0) {
            return null;
        }
        return new IConversationHistoryListUIModel(jIChatUIModelLocator_GetConversationHistoryListUIModelById, true);
    }

    public IConversationListUIModel GetConversationListUIModel() {
        long jIChatUIModelLocator_GetConversationListUIModel = IChatUIModelLocatorSWIGJNI.IChatUIModelLocator_GetConversationListUIModel(this.swigCPtr, this);
        if (jIChatUIModelLocator_GetConversationListUIModel == 0) {
            return null;
        }
        return new IConversationListUIModel(jIChatUIModelLocator_GetConversationListUIModel, true);
    }

    public IConversationMemberListUIModel GetConversationMemberListUIModel(ChatConversationID chatConversationID) {
        long jIChatUIModelLocator_GetConversationMemberListUIModel = IChatUIModelLocatorSWIGJNI.IChatUIModelLocator_GetConversationMemberListUIModel(this.swigCPtr, this, ChatConversationID.getCPtr(chatConversationID), chatConversationID);
        if (jIChatUIModelLocator_GetConversationMemberListUIModel == 0) {
            return null;
        }
        return new IConversationMemberListUIModel(jIChatUIModelLocator_GetConversationMemberListUIModel, true);
    }

    public IConversationUIModel GetConversationUIModelById(ChatConversationID chatConversationID) {
        long jIChatUIModelLocator_GetConversationUIModelById = IChatUIModelLocatorSWIGJNI.IChatUIModelLocator_GetConversationUIModelById(this.swigCPtr, this, ChatConversationID.getCPtr(chatConversationID), chatConversationID);
        if (jIChatUIModelLocator_GetConversationUIModelById == 0) {
            return null;
        }
        return new IConversationUIModel(jIChatUIModelLocator_GetConversationUIModelById, true);
    }

    public IErrorMessageHandler GetErrorMessageHandler() {
        long jIChatUIModelLocator_GetErrorMessageHandler = IChatUIModelLocatorSWIGJNI.IChatUIModelLocator_GetErrorMessageHandler(this.swigCPtr, this);
        if (jIChatUIModelLocator_GetErrorMessageHandler == 0) {
            return null;
        }
        return new IErrorMessageHandler(jIChatUIModelLocator_GetErrorMessageHandler, true);
    }

    public IEventMessageUIModel GetEventMessageById(ChatConversationID chatConversationID, ChatMessageID chatMessageID) {
        long jIChatUIModelLocator_GetEventMessageById = IChatUIModelLocatorSWIGJNI.IChatUIModelLocator_GetEventMessageById(this.swigCPtr, this, ChatConversationID.getCPtr(chatConversationID), chatConversationID, ChatMessageID.getCPtr(chatMessageID), chatMessageID);
        if (jIChatUIModelLocator_GetEventMessageById == 0) {
            return null;
        }
        return new IEventMessageUIModel(jIChatUIModelLocator_GetEventMessageById, true);
    }

    public IOwnFileMessageUIModel GetOwnFileMessageById(ChatConversationID chatConversationID, ChatMessageID chatMessageID) {
        long jIChatUIModelLocator_GetOwnFileMessageById = IChatUIModelLocatorSWIGJNI.IChatUIModelLocator_GetOwnFileMessageById(this.swigCPtr, this, ChatConversationID.getCPtr(chatConversationID), chatConversationID, ChatMessageID.getCPtr(chatMessageID), chatMessageID);
        if (jIChatUIModelLocator_GetOwnFileMessageById == 0) {
            return null;
        }
        return new IOwnFileMessageUIModel(jIChatUIModelLocator_GetOwnFileMessageById, true);
    }

    public IOwnTextMessageUIModel GetOwnTextMessageById(ChatConversationID chatConversationID, ChatMessageID chatMessageID) {
        long jIChatUIModelLocator_GetOwnTextMessageById = IChatUIModelLocatorSWIGJNI.IChatUIModelLocator_GetOwnTextMessageById(this.swigCPtr, this, ChatConversationID.getCPtr(chatConversationID), chatConversationID, ChatMessageID.getCPtr(chatMessageID), chatMessageID);
        if (jIChatUIModelLocator_GetOwnTextMessageById == 0) {
            return null;
        }
        return new IOwnTextMessageUIModel(jIChatUIModelLocator_GetOwnTextMessageById, true);
    }

    public IRemoteFileMessageUIModel GetRemoteFileMessageById(ChatConversationID chatConversationID, ChatMessageID chatMessageID) {
        long jIChatUIModelLocator_GetRemoteFileMessageById = IChatUIModelLocatorSWIGJNI.IChatUIModelLocator_GetRemoteFileMessageById(this.swigCPtr, this, ChatConversationID.getCPtr(chatConversationID), chatConversationID, ChatMessageID.getCPtr(chatMessageID), chatMessageID);
        if (jIChatUIModelLocator_GetRemoteFileMessageById == 0) {
            return null;
        }
        return new IRemoteFileMessageUIModel(jIChatUIModelLocator_GetRemoteFileMessageById, true);
    }

    public IRemoteTextMessageUIModel GetRemoteTextMessageById(ChatConversationID chatConversationID, ChatMessageID chatMessageID) {
        long jIChatUIModelLocator_GetRemoteTextMessageById = IChatUIModelLocatorSWIGJNI.IChatUIModelLocator_GetRemoteTextMessageById(this.swigCPtr, this, ChatConversationID.getCPtr(chatConversationID), chatConversationID, ChatMessageID.getCPtr(chatMessageID), chatMessageID);
        if (jIChatUIModelLocator_GetRemoteTextMessageById == 0) {
            return null;
        }
        return new IRemoteTextMessageUIModel(jIChatUIModelLocator_GetRemoteTextMessageById, true);
    }

    public IUnreadChatMessageHandler GetUnreadChatMessageHandler() {
        long jIChatUIModelLocator_GetUnreadChatMessageHandler = IChatUIModelLocatorSWIGJNI.IChatUIModelLocator_GetUnreadChatMessageHandler(this.swigCPtr, this);
        if (jIChatUIModelLocator_GetUnreadChatMessageHandler == 0) {
            return null;
        }
        return new IUnreadChatMessageHandler(jIChatUIModelLocator_GetUnreadChatMessageHandler, true);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IChatUIModelLocatorSWIGJNI.delete_IChatUIModelLocator(j);
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
