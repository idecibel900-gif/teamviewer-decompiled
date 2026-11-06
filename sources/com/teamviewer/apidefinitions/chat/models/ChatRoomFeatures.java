package com.teamviewer.apidefinitions.chat.models;

import kotlin.Metadata;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u009f\u0001\u00103\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00032\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\r\u001a\u00020\u00032\b\b\u0003\u0010\u000e\u001a\u00020\u00032\b\b\u0003\u0010\u000f\u001a\u00020\u00032\b\b\u0003\u0010\u0010\u001a\u00020\u00032\b\b\u0003\u0010\u0011\u001a\u00020\u0003HÆ\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020:HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015¨\u0006;"}, d2 = {"Lcom/teamviewer/apidefinitions/chat/models/ChatRoomFeatures;", "", "remoteControl", "Lcom/teamviewer/apidefinitions/chat/models/ChatSupportedFeaturesState;", "presentation", "sendFileSession", "renameConversation", "deleteConversation", "leaveConversation", "deleteHistory", "addParticipant", "removeAccount", "sendMessage", "typingNotifications", "muteConversation", "searchHistory", "addToContacts", "fileMessages", "<init>", "(Lcom/teamviewer/apidefinitions/chat/models/ChatSupportedFeaturesState;Lcom/teamviewer/apidefinitions/chat/models/ChatSupportedFeaturesState;Lcom/teamviewer/apidefinitions/chat/models/ChatSupportedFeaturesState;Lcom/teamviewer/apidefinitions/chat/models/ChatSupportedFeaturesState;Lcom/teamviewer/apidefinitions/chat/models/ChatSupportedFeaturesState;Lcom/teamviewer/apidefinitions/chat/models/ChatSupportedFeaturesState;Lcom/teamviewer/apidefinitions/chat/models/ChatSupportedFeaturesState;Lcom/teamviewer/apidefinitions/chat/models/ChatSupportedFeaturesState;Lcom/teamviewer/apidefinitions/chat/models/ChatSupportedFeaturesState;Lcom/teamviewer/apidefinitions/chat/models/ChatSupportedFeaturesState;Lcom/teamviewer/apidefinitions/chat/models/ChatSupportedFeaturesState;Lcom/teamviewer/apidefinitions/chat/models/ChatSupportedFeaturesState;Lcom/teamviewer/apidefinitions/chat/models/ChatSupportedFeaturesState;Lcom/teamviewer/apidefinitions/chat/models/ChatSupportedFeaturesState;Lcom/teamviewer/apidefinitions/chat/models/ChatSupportedFeaturesState;)V", "getRemoteControl", "()Lcom/teamviewer/apidefinitions/chat/models/ChatSupportedFeaturesState;", "getPresentation", "getSendFileSession", "getRenameConversation", "getDeleteConversation", "getLeaveConversation", "getDeleteHistory", "getAddParticipant", "getRemoveAccount", "getSendMessage", "getTypingNotifications", "getMuteConversation", "getSearchHistory", "getAddToContacts", "getFileMessages", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChatRoomFeatures {
    private final ChatSupportedFeaturesState addParticipant;
    private final ChatSupportedFeaturesState addToContacts;
    private final ChatSupportedFeaturesState deleteConversation;
    private final ChatSupportedFeaturesState deleteHistory;
    private final ChatSupportedFeaturesState fileMessages;
    private final ChatSupportedFeaturesState leaveConversation;
    private final ChatSupportedFeaturesState muteConversation;
    private final ChatSupportedFeaturesState presentation;
    private final ChatSupportedFeaturesState remoteControl;
    private final ChatSupportedFeaturesState removeAccount;
    private final ChatSupportedFeaturesState renameConversation;
    private final ChatSupportedFeaturesState searchHistory;
    private final ChatSupportedFeaturesState sendFileSession;
    private final ChatSupportedFeaturesState sendMessage;
    private final ChatSupportedFeaturesState typingNotifications;

    public ChatRoomFeatures(@sp3(name = "remoteControl") ChatSupportedFeaturesState chatSupportedFeaturesState, @sp3(name = "presentation") ChatSupportedFeaturesState chatSupportedFeaturesState2, @sp3(name = "sendFileSession") ChatSupportedFeaturesState chatSupportedFeaturesState3, @sp3(name = "renameConversation") ChatSupportedFeaturesState chatSupportedFeaturesState4, @sp3(name = "deleteConversation") ChatSupportedFeaturesState chatSupportedFeaturesState5, @sp3(name = "leaveConversation") ChatSupportedFeaturesState chatSupportedFeaturesState6, @sp3(name = "deleteHistory") ChatSupportedFeaturesState chatSupportedFeaturesState7, @sp3(name = "addParticipant") ChatSupportedFeaturesState chatSupportedFeaturesState8, @sp3(name = "removeAccount") ChatSupportedFeaturesState chatSupportedFeaturesState9, @sp3(name = "sendMessage") ChatSupportedFeaturesState chatSupportedFeaturesState10, @sp3(name = "typingNotifications") ChatSupportedFeaturesState chatSupportedFeaturesState11, @sp3(name = "muteConversation") ChatSupportedFeaturesState chatSupportedFeaturesState12, @sp3(name = "searchHistory") ChatSupportedFeaturesState chatSupportedFeaturesState13, @sp3(name = "addToContacts") ChatSupportedFeaturesState chatSupportedFeaturesState14, @sp3(name = "fileMessages") ChatSupportedFeaturesState chatSupportedFeaturesState15) {
        chatSupportedFeaturesState.getClass();
        chatSupportedFeaturesState2.getClass();
        chatSupportedFeaturesState3.getClass();
        chatSupportedFeaturesState4.getClass();
        chatSupportedFeaturesState5.getClass();
        chatSupportedFeaturesState6.getClass();
        chatSupportedFeaturesState7.getClass();
        chatSupportedFeaturesState8.getClass();
        chatSupportedFeaturesState9.getClass();
        chatSupportedFeaturesState10.getClass();
        chatSupportedFeaturesState11.getClass();
        chatSupportedFeaturesState12.getClass();
        chatSupportedFeaturesState13.getClass();
        chatSupportedFeaturesState14.getClass();
        chatSupportedFeaturesState15.getClass();
        this.remoteControl = chatSupportedFeaturesState;
        this.presentation = chatSupportedFeaturesState2;
        this.sendFileSession = chatSupportedFeaturesState3;
        this.renameConversation = chatSupportedFeaturesState4;
        this.deleteConversation = chatSupportedFeaturesState5;
        this.leaveConversation = chatSupportedFeaturesState6;
        this.deleteHistory = chatSupportedFeaturesState7;
        this.addParticipant = chatSupportedFeaturesState8;
        this.removeAccount = chatSupportedFeaturesState9;
        this.sendMessage = chatSupportedFeaturesState10;
        this.typingNotifications = chatSupportedFeaturesState11;
        this.muteConversation = chatSupportedFeaturesState12;
        this.searchHistory = chatSupportedFeaturesState13;
        this.addToContacts = chatSupportedFeaturesState14;
        this.fileMessages = chatSupportedFeaturesState15;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ChatSupportedFeaturesState getRemoteControl() {
        return this.remoteControl;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final ChatSupportedFeaturesState getSendMessage() {
        return this.sendMessage;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final ChatSupportedFeaturesState getTypingNotifications() {
        return this.typingNotifications;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final ChatSupportedFeaturesState getMuteConversation() {
        return this.muteConversation;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final ChatSupportedFeaturesState getSearchHistory() {
        return this.searchHistory;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final ChatSupportedFeaturesState getAddToContacts() {
        return this.addToContacts;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final ChatSupportedFeaturesState getFileMessages() {
        return this.fileMessages;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ChatSupportedFeaturesState getPresentation() {
        return this.presentation;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ChatSupportedFeaturesState getSendFileSession() {
        return this.sendFileSession;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ChatSupportedFeaturesState getRenameConversation() {
        return this.renameConversation;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ChatSupportedFeaturesState getDeleteConversation() {
        return this.deleteConversation;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ChatSupportedFeaturesState getLeaveConversation() {
        return this.leaveConversation;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ChatSupportedFeaturesState getDeleteHistory() {
        return this.deleteHistory;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ChatSupportedFeaturesState getAddParticipant() {
        return this.addParticipant;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final ChatSupportedFeaturesState getRemoveAccount() {
        return this.removeAccount;
    }

    public final ChatRoomFeatures copy(@sp3(name = "remoteControl") ChatSupportedFeaturesState remoteControl, @sp3(name = "presentation") ChatSupportedFeaturesState presentation, @sp3(name = "sendFileSession") ChatSupportedFeaturesState sendFileSession, @sp3(name = "renameConversation") ChatSupportedFeaturesState renameConversation, @sp3(name = "deleteConversation") ChatSupportedFeaturesState deleteConversation, @sp3(name = "leaveConversation") ChatSupportedFeaturesState leaveConversation, @sp3(name = "deleteHistory") ChatSupportedFeaturesState deleteHistory, @sp3(name = "addParticipant") ChatSupportedFeaturesState addParticipant, @sp3(name = "removeAccount") ChatSupportedFeaturesState removeAccount, @sp3(name = "sendMessage") ChatSupportedFeaturesState sendMessage, @sp3(name = "typingNotifications") ChatSupportedFeaturesState typingNotifications, @sp3(name = "muteConversation") ChatSupportedFeaturesState muteConversation, @sp3(name = "searchHistory") ChatSupportedFeaturesState searchHistory, @sp3(name = "addToContacts") ChatSupportedFeaturesState addToContacts, @sp3(name = "fileMessages") ChatSupportedFeaturesState fileMessages) {
        remoteControl.getClass();
        presentation.getClass();
        sendFileSession.getClass();
        renameConversation.getClass();
        deleteConversation.getClass();
        leaveConversation.getClass();
        deleteHistory.getClass();
        addParticipant.getClass();
        removeAccount.getClass();
        sendMessage.getClass();
        typingNotifications.getClass();
        muteConversation.getClass();
        searchHistory.getClass();
        addToContacts.getClass();
        fileMessages.getClass();
        return new ChatRoomFeatures(remoteControl, presentation, sendFileSession, renameConversation, deleteConversation, leaveConversation, deleteHistory, addParticipant, removeAccount, sendMessage, typingNotifications, muteConversation, searchHistory, addToContacts, fileMessages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatRoomFeatures)) {
            return false;
        }
        ChatRoomFeatures chatRoomFeatures = (ChatRoomFeatures) other;
        return this.remoteControl == chatRoomFeatures.remoteControl && this.presentation == chatRoomFeatures.presentation && this.sendFileSession == chatRoomFeatures.sendFileSession && this.renameConversation == chatRoomFeatures.renameConversation && this.deleteConversation == chatRoomFeatures.deleteConversation && this.leaveConversation == chatRoomFeatures.leaveConversation && this.deleteHistory == chatRoomFeatures.deleteHistory && this.addParticipant == chatRoomFeatures.addParticipant && this.removeAccount == chatRoomFeatures.removeAccount && this.sendMessage == chatRoomFeatures.sendMessage && this.typingNotifications == chatRoomFeatures.typingNotifications && this.muteConversation == chatRoomFeatures.muteConversation && this.searchHistory == chatRoomFeatures.searchHistory && this.addToContacts == chatRoomFeatures.addToContacts && this.fileMessages == chatRoomFeatures.fileMessages;
    }

    public final ChatSupportedFeaturesState getAddParticipant() {
        return this.addParticipant;
    }

    public final ChatSupportedFeaturesState getAddToContacts() {
        return this.addToContacts;
    }

    public final ChatSupportedFeaturesState getDeleteConversation() {
        return this.deleteConversation;
    }

    public final ChatSupportedFeaturesState getDeleteHistory() {
        return this.deleteHistory;
    }

    public final ChatSupportedFeaturesState getFileMessages() {
        return this.fileMessages;
    }

    public final ChatSupportedFeaturesState getLeaveConversation() {
        return this.leaveConversation;
    }

    public final ChatSupportedFeaturesState getMuteConversation() {
        return this.muteConversation;
    }

    public final ChatSupportedFeaturesState getPresentation() {
        return this.presentation;
    }

    public final ChatSupportedFeaturesState getRemoteControl() {
        return this.remoteControl;
    }

    public final ChatSupportedFeaturesState getRemoveAccount() {
        return this.removeAccount;
    }

    public final ChatSupportedFeaturesState getRenameConversation() {
        return this.renameConversation;
    }

    public final ChatSupportedFeaturesState getSearchHistory() {
        return this.searchHistory;
    }

    public final ChatSupportedFeaturesState getSendFileSession() {
        return this.sendFileSession;
    }

    public final ChatSupportedFeaturesState getSendMessage() {
        return this.sendMessage;
    }

    public final ChatSupportedFeaturesState getTypingNotifications() {
        return this.typingNotifications;
    }

    public int hashCode() {
        return this.fileMessages.hashCode() + ((this.addToContacts.hashCode() + ((this.searchHistory.hashCode() + ((this.muteConversation.hashCode() + ((this.typingNotifications.hashCode() + ((this.sendMessage.hashCode() + ((this.removeAccount.hashCode() + ((this.addParticipant.hashCode() + ((this.deleteHistory.hashCode() + ((this.leaveConversation.hashCode() + ((this.deleteConversation.hashCode() + ((this.renameConversation.hashCode() + ((this.sendFileSession.hashCode() + ((this.presentation.hashCode() + (this.remoteControl.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "ChatRoomFeatures(remoteControl=" + this.remoteControl + ", presentation=" + this.presentation + ", sendFileSession=" + this.sendFileSession + ", renameConversation=" + this.renameConversation + ", deleteConversation=" + this.deleteConversation + ", leaveConversation=" + this.leaveConversation + ", deleteHistory=" + this.deleteHistory + ", addParticipant=" + this.addParticipant + ", removeAccount=" + this.removeAccount + ", sendMessage=" + this.sendMessage + ", typingNotifications=" + this.typingNotifications + ", muteConversation=" + this.muteConversation + ", searchHistory=" + this.searchHistory + ", addToContacts=" + this.addToContacts + ", fileMessages=" + this.fileMessages + ")";
    }
}
