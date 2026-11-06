package com.teamviewer.apidefinitions.chat.models;

import java.util.UUID;
import kotlin.Metadata;
import o.im3;
import o.sp3;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/teamviewer/apidefinitions/chat/models/ChatReadMessage;", "", "userId", "", "messageId", "Ljava/util/UUID;", "conversationId", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;)V", "getUserId", "()Ljava/lang/String;", "getMessageId", "()Ljava/util/UUID;", "getConversationId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChatReadMessage {
    private final UUID conversationId;
    private final UUID messageId;
    private final String userId;

    public ChatReadMessage(@sp3(name = "userId") String str, @sp3(name = "messageId") UUID uuid, @sp3(name = "conversationId") UUID uuid2) {
        str.getClass();
        uuid.getClass();
        uuid2.getClass();
        this.userId = str;
        this.messageId = uuid;
        this.conversationId = uuid2;
    }

    public static /* synthetic */ ChatReadMessage copy$default(ChatReadMessage chatReadMessage, String str, UUID uuid, UUID uuid2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatReadMessage.userId;
        }
        if ((i & 2) != 0) {
            uuid = chatReadMessage.messageId;
        }
        if ((i & 4) != 0) {
            uuid2 = chatReadMessage.conversationId;
        }
        return chatReadMessage.copy(str, uuid, uuid2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UUID getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UUID getConversationId() {
        return this.conversationId;
    }

    public final ChatReadMessage copy(@sp3(name = "userId") String userId, @sp3(name = "messageId") UUID messageId, @sp3(name = "conversationId") UUID conversationId) {
        userId.getClass();
        messageId.getClass();
        conversationId.getClass();
        return new ChatReadMessage(userId, messageId, conversationId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatReadMessage)) {
            return false;
        }
        ChatReadMessage chatReadMessage = (ChatReadMessage) other;
        return im3.n(this.userId, chatReadMessage.userId) && im3.n(this.messageId, chatReadMessage.messageId) && im3.n(this.conversationId, chatReadMessage.conversationId);
    }

    public final UUID getConversationId() {
        return this.conversationId;
    }

    public final UUID getMessageId() {
        return this.messageId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.conversationId.hashCode() + ua5.e(this.messageId, this.userId.hashCode() * 31, 31);
    }

    public String toString() {
        return "ChatReadMessage(userId=" + this.userId + ", messageId=" + this.messageId + ", conversationId=" + this.conversationId + ")";
    }
}
