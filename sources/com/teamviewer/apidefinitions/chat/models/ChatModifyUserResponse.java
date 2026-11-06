package com.teamviewer.apidefinitions.chat.models;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003J]\u0010%\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, d2 = {"Lcom/teamviewer/apidefinitions/chat/models/ChatModifyUserResponse;", "", "conversationId", "Ljava/util/UUID;", "type", "Lcom/teamviewer/apidefinitions/chat/models/ChatModifyUsersEventMessageType;", "affectedUsers", "", "", "messageId", "authorId", "writtenAt", "Ljava/time/OffsetDateTime;", "modificationEventMessage", "Lcom/teamviewer/apidefinitions/chat/models/ChatMessage;", "<init>", "(Ljava/util/UUID;Lcom/teamviewer/apidefinitions/chat/models/ChatModifyUsersEventMessageType;Ljava/util/List;Ljava/util/UUID;Ljava/lang/String;Ljava/time/OffsetDateTime;Lcom/teamviewer/apidefinitions/chat/models/ChatMessage;)V", "getConversationId", "()Ljava/util/UUID;", "getType", "()Lcom/teamviewer/apidefinitions/chat/models/ChatModifyUsersEventMessageType;", "getAffectedUsers", "()Ljava/util/List;", "getMessageId", "getAuthorId", "()Ljava/lang/String;", "getWrittenAt", "()Ljava/time/OffsetDateTime;", "getModificationEventMessage", "()Lcom/teamviewer/apidefinitions/chat/models/ChatMessage;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChatModifyUserResponse {
    private final List<String> affectedUsers;
    private final String authorId;
    private final UUID conversationId;
    private final UUID messageId;
    private final ChatMessage modificationEventMessage;
    private final ChatModifyUsersEventMessageType type;
    private final OffsetDateTime writtenAt;

    public ChatModifyUserResponse(@sp3(name = "conversationId") UUID uuid, @sp3(name = "type") ChatModifyUsersEventMessageType chatModifyUsersEventMessageType, @sp3(name = "affectedUsers") List<String> list, @sp3(name = "messageId") UUID uuid2, @sp3(name = "authorId") String str, @sp3(name = "writtenAt") OffsetDateTime offsetDateTime, @sp3(name = "modificationEventMessage") ChatMessage chatMessage) {
        uuid.getClass();
        chatModifyUsersEventMessageType.getClass();
        list.getClass();
        this.conversationId = uuid;
        this.type = chatModifyUsersEventMessageType;
        this.affectedUsers = list;
        this.messageId = uuid2;
        this.authorId = str;
        this.writtenAt = offsetDateTime;
        this.modificationEventMessage = chatMessage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatModifyUserResponse copy$default(ChatModifyUserResponse chatModifyUserResponse, UUID uuid, ChatModifyUsersEventMessageType chatModifyUsersEventMessageType, List list, UUID uuid2, String str, OffsetDateTime offsetDateTime, ChatMessage chatMessage, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = chatModifyUserResponse.conversationId;
        }
        if ((i & 2) != 0) {
            chatModifyUsersEventMessageType = chatModifyUserResponse.type;
        }
        if ((i & 4) != 0) {
            list = chatModifyUserResponse.affectedUsers;
        }
        if ((i & 8) != 0) {
            uuid2 = chatModifyUserResponse.messageId;
        }
        if ((i & 16) != 0) {
            str = chatModifyUserResponse.authorId;
        }
        if ((i & 32) != 0) {
            offsetDateTime = chatModifyUserResponse.writtenAt;
        }
        if ((i & 64) != 0) {
            chatMessage = chatModifyUserResponse.modificationEventMessage;
        }
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        ChatMessage chatMessage2 = chatMessage;
        String str2 = str;
        List list2 = list;
        return chatModifyUserResponse.copy(uuid, chatModifyUsersEventMessageType, list2, uuid2, str2, offsetDateTime2, chatMessage2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getConversationId() {
        return this.conversationId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ChatModifyUsersEventMessageType getType() {
        return this.type;
    }

    public final List<String> component3() {
        return this.affectedUsers;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final UUID getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAuthorId() {
        return this.authorId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final OffsetDateTime getWrittenAt() {
        return this.writtenAt;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ChatMessage getModificationEventMessage() {
        return this.modificationEventMessage;
    }

    public final ChatModifyUserResponse copy(@sp3(name = "conversationId") UUID conversationId, @sp3(name = "type") ChatModifyUsersEventMessageType type, @sp3(name = "affectedUsers") List<String> affectedUsers, @sp3(name = "messageId") UUID messageId, @sp3(name = "authorId") String authorId, @sp3(name = "writtenAt") OffsetDateTime writtenAt, @sp3(name = "modificationEventMessage") ChatMessage modificationEventMessage) {
        conversationId.getClass();
        type.getClass();
        affectedUsers.getClass();
        return new ChatModifyUserResponse(conversationId, type, affectedUsers, messageId, authorId, writtenAt, modificationEventMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatModifyUserResponse)) {
            return false;
        }
        ChatModifyUserResponse chatModifyUserResponse = (ChatModifyUserResponse) other;
        return im3.n(this.conversationId, chatModifyUserResponse.conversationId) && this.type == chatModifyUserResponse.type && im3.n(this.affectedUsers, chatModifyUserResponse.affectedUsers) && im3.n(this.messageId, chatModifyUserResponse.messageId) && im3.n(this.authorId, chatModifyUserResponse.authorId) && im3.n(this.writtenAt, chatModifyUserResponse.writtenAt) && im3.n(this.modificationEventMessage, chatModifyUserResponse.modificationEventMessage);
    }

    public final List<String> getAffectedUsers() {
        return this.affectedUsers;
    }

    public final String getAuthorId() {
        return this.authorId;
    }

    public final UUID getConversationId() {
        return this.conversationId;
    }

    public final UUID getMessageId() {
        return this.messageId;
    }

    public final ChatMessage getModificationEventMessage() {
        return this.modificationEventMessage;
    }

    public final ChatModifyUsersEventMessageType getType() {
        return this.type;
    }

    public final OffsetDateTime getWrittenAt() {
        return this.writtenAt;
    }

    public int hashCode() {
        int iG = to7.g(this.affectedUsers, (this.type.hashCode() + (this.conversationId.hashCode() * 31)) * 31, 31);
        UUID uuid = this.messageId;
        int iHashCode = (iG + (uuid == null ? 0 : uuid.hashCode())) * 31;
        String str = this.authorId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        OffsetDateTime offsetDateTime = this.writtenAt;
        int iHashCode3 = (iHashCode2 + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        ChatMessage chatMessage = this.modificationEventMessage;
        return iHashCode3 + (chatMessage != null ? chatMessage.hashCode() : 0);
    }

    public String toString() {
        return "ChatModifyUserResponse(conversationId=" + this.conversationId + ", type=" + this.type + ", affectedUsers=" + this.affectedUsers + ", messageId=" + this.messageId + ", authorId=" + this.authorId + ", writtenAt=" + this.writtenAt + ", modificationEventMessage=" + this.modificationEventMessage + ")";
    }

    public /* synthetic */ ChatModifyUserResponse(UUID uuid, ChatModifyUsersEventMessageType chatModifyUsersEventMessageType, List list, UUID uuid2, String str, OffsetDateTime offsetDateTime, ChatMessage chatMessage, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, chatModifyUsersEventMessageType, list, (i & 8) != 0 ? null : uuid2, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : offsetDateTime, (i & 64) != 0 ? null : chatMessage);
    }
}
