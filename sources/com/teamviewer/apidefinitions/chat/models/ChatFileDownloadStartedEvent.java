package com.teamviewer.apidefinitions.chat.models;

import java.util.UUID;
import kotlin.Metadata;
import o.im3;
import o.sp3;
import o.to7;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/teamviewer/apidefinitions/chat/models/ChatFileDownloadStartedEvent;", "Lcom/teamviewer/apidefinitions/chat/models/TeamViewerEvent;", "eventType", "", "messageId", "Ljava/util/UUID;", "fileName", "fileId", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;Ljava/util/UUID;)V", "getEventType", "()Ljava/lang/String;", "getMessageId", "()Ljava/util/UUID;", "getFileName", "getFileId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChatFileDownloadStartedEvent implements TeamViewerEvent {
    private final String eventType;
    private final UUID fileId;
    private final String fileName;
    private final UUID messageId;

    public ChatFileDownloadStartedEvent(@sp3(name = "eventType") String str, @sp3(name = "messageId") UUID uuid, @sp3(name = "fileName") String str2, @sp3(name = "fileId") UUID uuid2) {
        str.getClass();
        uuid.getClass();
        str2.getClass();
        uuid2.getClass();
        this.eventType = str;
        this.messageId = uuid;
        this.fileName = str2;
        this.fileId = uuid2;
    }

    public static /* synthetic */ ChatFileDownloadStartedEvent copy$default(ChatFileDownloadStartedEvent chatFileDownloadStartedEvent, String str, UUID uuid, String str2, UUID uuid2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatFileDownloadStartedEvent.eventType;
        }
        if ((i & 2) != 0) {
            uuid = chatFileDownloadStartedEvent.messageId;
        }
        if ((i & 4) != 0) {
            str2 = chatFileDownloadStartedEvent.fileName;
        }
        if ((i & 8) != 0) {
            uuid2 = chatFileDownloadStartedEvent.fileId;
        }
        return chatFileDownloadStartedEvent.copy(str, uuid, str2, uuid2);
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
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final UUID getFileId() {
        return this.fileId;
    }

    public final ChatFileDownloadStartedEvent copy(@sp3(name = "eventType") String eventType, @sp3(name = "messageId") UUID messageId, @sp3(name = "fileName") String fileName, @sp3(name = "fileId") UUID fileId) {
        eventType.getClass();
        messageId.getClass();
        fileName.getClass();
        fileId.getClass();
        return new ChatFileDownloadStartedEvent(eventType, messageId, fileName, fileId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatFileDownloadStartedEvent)) {
            return false;
        }
        ChatFileDownloadStartedEvent chatFileDownloadStartedEvent = (ChatFileDownloadStartedEvent) other;
        return im3.n(this.eventType, chatFileDownloadStartedEvent.eventType) && im3.n(this.messageId, chatFileDownloadStartedEvent.messageId) && im3.n(this.fileName, chatFileDownloadStartedEvent.fileName) && im3.n(this.fileId, chatFileDownloadStartedEvent.fileId);
    }

    @Override // com.teamviewer.apidefinitions.chat.models.TeamViewerEvent
    public String getEventType() {
        return this.eventType;
    }

    public final UUID getFileId() {
        return this.fileId;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final UUID getMessageId() {
        return this.messageId;
    }

    public int hashCode() {
        return this.fileId.hashCode() + to7.e(ua5.e(this.messageId, this.eventType.hashCode() * 31, 31), 31, this.fileName);
    }

    public String toString() {
        return "ChatFileDownloadStartedEvent(eventType=" + this.eventType + ", messageId=" + this.messageId + ", fileName=" + this.fileName + ", fileId=" + this.fileId + ")";
    }
}
