package com.teamviewer.apidefinitions.chat.models;

import java.time.OffsetDateTime;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.e41;
import o.fx3;
import o.im3;
import o.sp3;
import o.to7;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u000eHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003Je\u0010(\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\r\u001a\u00020\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010)\u001a\u00020\u000b2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u000eHÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019¨\u0006-"}, d2 = {"Lcom/teamviewer/apidefinitions/chat/models/ChatMessage;", "", "authorId", "", "authorDisplayName", "messageId", "Ljava/util/UUID;", "conversationId", "writtenAt", "Ljava/time/OffsetDateTime;", "isEventMessage", "", "text", "clientMessageId", "", "readAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;Ljava/time/OffsetDateTime;ZLjava/lang/String;ILjava/time/OffsetDateTime;)V", "getAuthorId", "()Ljava/lang/String;", "getAuthorDisplayName", "getMessageId", "()Ljava/util/UUID;", "getConversationId", "getWrittenAt", "()Ljava/time/OffsetDateTime;", "()Z", "getText", "getClientMessageId", "()I", "getReadAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChatMessage {
    private final String authorDisplayName;
    private final String authorId;
    private final int clientMessageId;
    private final UUID conversationId;
    private final boolean isEventMessage;
    private final UUID messageId;
    private final OffsetDateTime readAt;
    private final String text;
    private final OffsetDateTime writtenAt;

    public ChatMessage(@sp3(name = "authorId") String str, @sp3(name = "authorDisplayName") String str2, @sp3(name = "messageId") UUID uuid, @sp3(name = "conversationId") UUID uuid2, @sp3(name = "writtenAt") OffsetDateTime offsetDateTime, @sp3(name = "isEventMessage") boolean z, @sp3(name = "text") String str3, @sp3(name = "clientMessageId") int i, @sp3(name = "readAt") OffsetDateTime offsetDateTime2) {
        str.getClass();
        str2.getClass();
        uuid.getClass();
        uuid2.getClass();
        offsetDateTime.getClass();
        str3.getClass();
        this.authorId = str;
        this.authorDisplayName = str2;
        this.messageId = uuid;
        this.conversationId = uuid2;
        this.writtenAt = offsetDateTime;
        this.isEventMessage = z;
        this.text = str3;
        this.clientMessageId = i;
        this.readAt = offsetDateTime2;
    }

    public static /* synthetic */ ChatMessage copy$default(ChatMessage chatMessage, String str, String str2, UUID uuid, UUID uuid2, OffsetDateTime offsetDateTime, boolean z, String str3, int i, OffsetDateTime offsetDateTime2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = chatMessage.authorId;
        }
        if ((i2 & 2) != 0) {
            str2 = chatMessage.authorDisplayName;
        }
        if ((i2 & 4) != 0) {
            uuid = chatMessage.messageId;
        }
        if ((i2 & 8) != 0) {
            uuid2 = chatMessage.conversationId;
        }
        if ((i2 & 16) != 0) {
            offsetDateTime = chatMessage.writtenAt;
        }
        if ((i2 & 32) != 0) {
            z = chatMessage.isEventMessage;
        }
        if ((i2 & 64) != 0) {
            str3 = chatMessage.text;
        }
        if ((i2 & 128) != 0) {
            i = chatMessage.clientMessageId;
        }
        if ((i2 & 256) != 0) {
            offsetDateTime2 = chatMessage.readAt;
        }
        int i3 = i;
        OffsetDateTime offsetDateTime3 = offsetDateTime2;
        boolean z2 = z;
        String str4 = str3;
        OffsetDateTime offsetDateTime4 = offsetDateTime;
        UUID uuid3 = uuid;
        return chatMessage.copy(str, str2, uuid3, uuid2, offsetDateTime4, z2, str4, i3, offsetDateTime3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAuthorId() {
        return this.authorId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuthorDisplayName() {
        return this.authorDisplayName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UUID getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final UUID getConversationId() {
        return this.conversationId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OffsetDateTime getWrittenAt() {
        return this.writtenAt;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsEventMessage() {
        return this.isEventMessage;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getClientMessageId() {
        return this.clientMessageId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final OffsetDateTime getReadAt() {
        return this.readAt;
    }

    public final ChatMessage copy(@sp3(name = "authorId") String authorId, @sp3(name = "authorDisplayName") String authorDisplayName, @sp3(name = "messageId") UUID messageId, @sp3(name = "conversationId") UUID conversationId, @sp3(name = "writtenAt") OffsetDateTime writtenAt, @sp3(name = "isEventMessage") boolean isEventMessage, @sp3(name = "text") String text, @sp3(name = "clientMessageId") int clientMessageId, @sp3(name = "readAt") OffsetDateTime readAt) {
        authorId.getClass();
        authorDisplayName.getClass();
        messageId.getClass();
        conversationId.getClass();
        writtenAt.getClass();
        text.getClass();
        return new ChatMessage(authorId, authorDisplayName, messageId, conversationId, writtenAt, isEventMessage, text, clientMessageId, readAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatMessage)) {
            return false;
        }
        ChatMessage chatMessage = (ChatMessage) other;
        return im3.n(this.authorId, chatMessage.authorId) && im3.n(this.authorDisplayName, chatMessage.authorDisplayName) && im3.n(this.messageId, chatMessage.messageId) && im3.n(this.conversationId, chatMessage.conversationId) && im3.n(this.writtenAt, chatMessage.writtenAt) && this.isEventMessage == chatMessage.isEventMessage && im3.n(this.text, chatMessage.text) && this.clientMessageId == chatMessage.clientMessageId && im3.n(this.readAt, chatMessage.readAt);
    }

    public final String getAuthorDisplayName() {
        return this.authorDisplayName;
    }

    public final String getAuthorId() {
        return this.authorId;
    }

    public final int getClientMessageId() {
        return this.clientMessageId;
    }

    public final UUID getConversationId() {
        return this.conversationId;
    }

    public final UUID getMessageId() {
        return this.messageId;
    }

    public final OffsetDateTime getReadAt() {
        return this.readAt;
    }

    public final String getText() {
        return this.text;
    }

    public final OffsetDateTime getWrittenAt() {
        return this.writtenAt;
    }

    public int hashCode() {
        int iA = fx3.a(this.clientMessageId, to7.e(to7.f((this.writtenAt.hashCode() + ua5.e(this.conversationId, ua5.e(this.messageId, to7.e(this.authorId.hashCode() * 31, 31, this.authorDisplayName), 31), 31)) * 31, 31, this.isEventMessage), 31, this.text), 31);
        OffsetDateTime offsetDateTime = this.readAt;
        return iA + (offsetDateTime == null ? 0 : offsetDateTime.hashCode());
    }

    public final boolean isEventMessage() {
        return this.isEventMessage;
    }

    public String toString() {
        String str = this.authorId;
        String str2 = this.authorDisplayName;
        UUID uuid = this.messageId;
        UUID uuid2 = this.conversationId;
        OffsetDateTime offsetDateTime = this.writtenAt;
        boolean z = this.isEventMessage;
        String str3 = this.text;
        int i = this.clientMessageId;
        OffsetDateTime offsetDateTime2 = this.readAt;
        StringBuilder sbO = e41.o("ChatMessage(authorId=", str, ", authorDisplayName=", str2, ", messageId=");
        sbO.append(uuid);
        sbO.append(", conversationId=");
        sbO.append(uuid2);
        sbO.append(", writtenAt=");
        sbO.append(offsetDateTime);
        sbO.append(", isEventMessage=");
        sbO.append(z);
        sbO.append(", text=");
        sbO.append(str3);
        sbO.append(", clientMessageId=");
        sbO.append(i);
        sbO.append(", readAt=");
        sbO.append(offsetDateTime2);
        sbO.append(")");
        return sbO.toString();
    }

    public /* synthetic */ ChatMessage(String str, String str2, UUID uuid, UUID uuid2, OffsetDateTime offsetDateTime, boolean z, String str3, int i, OffsetDateTime offsetDateTime2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, uuid, uuid2, offsetDateTime, z, str3, i, (i2 & 256) != 0 ? null : offsetDateTime2);
    }
}
