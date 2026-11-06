package com.teamviewer.apidefinitions.chat.models;

import java.util.UUID;
import kotlin.Metadata;
import o.im3;
import o.sp3;
import o.to7;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\tHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/teamviewer/apidefinitions/chat/models/ChatFileDownloadProgressEvent;", "Lcom/teamviewer/apidefinitions/chat/models/TeamViewerEvent;", "eventType", "", "messageId", "Ljava/util/UUID;", "fileName", "fileId", "progress", "", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;Ljava/util/UUID;I)V", "getEventType", "()Ljava/lang/String;", "getMessageId", "()Ljava/util/UUID;", "getFileName", "getFileId", "getProgress", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChatFileDownloadProgressEvent implements TeamViewerEvent {
    private final String eventType;
    private final UUID fileId;
    private final String fileName;
    private final UUID messageId;
    private final int progress;

    public ChatFileDownloadProgressEvent(@sp3(name = "eventType") String str, @sp3(name = "messageId") UUID uuid, @sp3(name = "fileName") String str2, @sp3(name = "fileId") UUID uuid2, @sp3(name = "progress") int i) {
        str.getClass();
        uuid.getClass();
        str2.getClass();
        uuid2.getClass();
        this.eventType = str;
        this.messageId = uuid;
        this.fileName = str2;
        this.fileId = uuid2;
        this.progress = i;
    }

    public static /* synthetic */ ChatFileDownloadProgressEvent copy$default(ChatFileDownloadProgressEvent chatFileDownloadProgressEvent, String str, UUID uuid, String str2, UUID uuid2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = chatFileDownloadProgressEvent.eventType;
        }
        if ((i2 & 2) != 0) {
            uuid = chatFileDownloadProgressEvent.messageId;
        }
        if ((i2 & 4) != 0) {
            str2 = chatFileDownloadProgressEvent.fileName;
        }
        if ((i2 & 8) != 0) {
            uuid2 = chatFileDownloadProgressEvent.fileId;
        }
        if ((i2 & 16) != 0) {
            i = chatFileDownloadProgressEvent.progress;
        }
        int i3 = i;
        String str3 = str2;
        return chatFileDownloadProgressEvent.copy(str, uuid, str3, uuid2, i3);
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

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    public final ChatFileDownloadProgressEvent copy(@sp3(name = "eventType") String eventType, @sp3(name = "messageId") UUID messageId, @sp3(name = "fileName") String fileName, @sp3(name = "fileId") UUID fileId, @sp3(name = "progress") int progress) {
        eventType.getClass();
        messageId.getClass();
        fileName.getClass();
        fileId.getClass();
        return new ChatFileDownloadProgressEvent(eventType, messageId, fileName, fileId, progress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatFileDownloadProgressEvent)) {
            return false;
        }
        ChatFileDownloadProgressEvent chatFileDownloadProgressEvent = (ChatFileDownloadProgressEvent) other;
        return im3.n(this.eventType, chatFileDownloadProgressEvent.eventType) && im3.n(this.messageId, chatFileDownloadProgressEvent.messageId) && im3.n(this.fileName, chatFileDownloadProgressEvent.fileName) && im3.n(this.fileId, chatFileDownloadProgressEvent.fileId) && this.progress == chatFileDownloadProgressEvent.progress;
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

    public final int getProgress() {
        return this.progress;
    }

    public int hashCode() {
        return Integer.hashCode(this.progress) + ua5.e(this.fileId, to7.e(ua5.e(this.messageId, this.eventType.hashCode() * 31, 31), 31, this.fileName), 31);
    }

    public String toString() {
        String str = this.eventType;
        UUID uuid = this.messageId;
        String str2 = this.fileName;
        UUID uuid2 = this.fileId;
        int i = this.progress;
        StringBuilder sb = new StringBuilder("ChatFileDownloadProgressEvent(eventType=");
        sb.append(str);
        sb.append(", messageId=");
        sb.append(uuid);
        sb.append(", fileName=");
        sb.append(str2);
        sb.append(", fileId=");
        sb.append(uuid2);
        sb.append(", progress=");
        return to7.l(sb, i, ")");
    }
}
