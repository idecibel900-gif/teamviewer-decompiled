package com.teamviewer.apidefinitions.chat.models;

import java.util.Arrays;
import java.util.UUID;
import kotlin.Metadata;
import o.e41;
import o.im3;
import o.sp3;
import o.to7;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/teamviewer/apidefinitions/chat/models/ChatFileThumbnailAvailableEvent;", "Lcom/teamviewer/apidefinitions/chat/models/TeamViewerEvent;", "eventType", "", "messageId", "Ljava/util/UUID;", "thumbnailMimeType", "thumbnailByteArray", "", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;[B)V", "getEventType", "()Ljava/lang/String;", "getMessageId", "()Ljava/util/UUID;", "getThumbnailMimeType", "getThumbnailByteArray", "()[B", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChatFileThumbnailAvailableEvent implements TeamViewerEvent {
    private final String eventType;
    private final UUID messageId;
    private final byte[] thumbnailByteArray;
    private final String thumbnailMimeType;

    public ChatFileThumbnailAvailableEvent(@sp3(name = "eventType") String str, @sp3(name = "messageId") UUID uuid, @sp3(name = "thumbnailMimeType") String str2, @sp3(name = "thumbnailByteArray") byte[] bArr) {
        str.getClass();
        uuid.getClass();
        str2.getClass();
        bArr.getClass();
        this.eventType = str;
        this.messageId = uuid;
        this.thumbnailMimeType = str2;
        this.thumbnailByteArray = bArr;
    }

    public static /* synthetic */ ChatFileThumbnailAvailableEvent copy$default(ChatFileThumbnailAvailableEvent chatFileThumbnailAvailableEvent, String str, UUID uuid, String str2, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatFileThumbnailAvailableEvent.eventType;
        }
        if ((i & 2) != 0) {
            uuid = chatFileThumbnailAvailableEvent.messageId;
        }
        if ((i & 4) != 0) {
            str2 = chatFileThumbnailAvailableEvent.thumbnailMimeType;
        }
        if ((i & 8) != 0) {
            bArr = chatFileThumbnailAvailableEvent.thumbnailByteArray;
        }
        return chatFileThumbnailAvailableEvent.copy(str, uuid, str2, bArr);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UUID getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getThumbnailMimeType() {
        return this.thumbnailMimeType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final byte[] getThumbnailByteArray() {
        return this.thumbnailByteArray;
    }

    public final ChatFileThumbnailAvailableEvent copy(@sp3(name = "eventType") String eventType, @sp3(name = "messageId") UUID messageId, @sp3(name = "thumbnailMimeType") String thumbnailMimeType, @sp3(name = "thumbnailByteArray") byte[] thumbnailByteArray) {
        eventType.getClass();
        messageId.getClass();
        thumbnailMimeType.getClass();
        thumbnailByteArray.getClass();
        return new ChatFileThumbnailAvailableEvent(eventType, messageId, thumbnailMimeType, thumbnailByteArray);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatFileThumbnailAvailableEvent)) {
            return false;
        }
        ChatFileThumbnailAvailableEvent chatFileThumbnailAvailableEvent = (ChatFileThumbnailAvailableEvent) other;
        return im3.n(this.eventType, chatFileThumbnailAvailableEvent.eventType) && im3.n(this.messageId, chatFileThumbnailAvailableEvent.messageId) && im3.n(this.thumbnailMimeType, chatFileThumbnailAvailableEvent.thumbnailMimeType) && im3.n(this.thumbnailByteArray, chatFileThumbnailAvailableEvent.thumbnailByteArray);
    }

    @Override // com.teamviewer.apidefinitions.chat.models.TeamViewerEvent
    public String getEventType() {
        return this.eventType;
    }

    public final UUID getMessageId() {
        return this.messageId;
    }

    public final byte[] getThumbnailByteArray() {
        return this.thumbnailByteArray;
    }

    public final String getThumbnailMimeType() {
        return this.thumbnailMimeType;
    }

    public int hashCode() {
        return Arrays.hashCode(this.thumbnailByteArray) + to7.e(ua5.e(this.messageId, this.eventType.hashCode() * 31, 31), 31, this.thumbnailMimeType);
    }

    public String toString() {
        String str = this.eventType;
        UUID uuid = this.messageId;
        String str2 = this.thumbnailMimeType;
        String string = Arrays.toString(this.thumbnailByteArray);
        StringBuilder sb = new StringBuilder("ChatFileThumbnailAvailableEvent(eventType=");
        sb.append(str);
        sb.append(", messageId=");
        sb.append(uuid);
        sb.append(", thumbnailMimeType=");
        return e41.m(sb, str2, ", thumbnailByteArray=", string, ")");
    }
}
