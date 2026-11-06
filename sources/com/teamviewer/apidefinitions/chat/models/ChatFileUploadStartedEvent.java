package com.teamviewer.apidefinitions.chat.models;

import java.util.UUID;
import kotlin.Metadata;
import o.e41;
import o.fx3;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/teamviewer/apidefinitions/chat/models/ChatFileUploadStartedEvent;", "Lcom/teamviewer/apidefinitions/chat/models/TeamViewerEvent;", "eventType", "", "fileName", "fileSize", "", "outboxItemId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/util/UUID;)V", "getEventType", "()Ljava/lang/String;", "getFileName", "getFileSize", "()J", "getOutboxItemId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChatFileUploadStartedEvent implements TeamViewerEvent {
    private final String eventType;
    private final String fileName;
    private final long fileSize;
    private final UUID outboxItemId;

    public ChatFileUploadStartedEvent(@sp3(name = "eventType") String str, @sp3(name = "fileName") String str2, @sp3(name = "fileSize") long j, @sp3(name = "outboxItemId") UUID uuid) {
        str.getClass();
        str2.getClass();
        uuid.getClass();
        this.eventType = str;
        this.fileName = str2;
        this.fileSize = j;
        this.outboxItemId = uuid;
    }

    public static /* synthetic */ ChatFileUploadStartedEvent copy$default(ChatFileUploadStartedEvent chatFileUploadStartedEvent, String str, String str2, long j, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatFileUploadStartedEvent.eventType;
        }
        if ((i & 2) != 0) {
            str2 = chatFileUploadStartedEvent.fileName;
        }
        if ((i & 4) != 0) {
            j = chatFileUploadStartedEvent.fileSize;
        }
        if ((i & 8) != 0) {
            uuid = chatFileUploadStartedEvent.outboxItemId;
        }
        UUID uuid2 = uuid;
        return chatFileUploadStartedEvent.copy(str, str2, j, uuid2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getFileSize() {
        return this.fileSize;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final UUID getOutboxItemId() {
        return this.outboxItemId;
    }

    public final ChatFileUploadStartedEvent copy(@sp3(name = "eventType") String eventType, @sp3(name = "fileName") String fileName, @sp3(name = "fileSize") long fileSize, @sp3(name = "outboxItemId") UUID outboxItemId) {
        eventType.getClass();
        fileName.getClass();
        outboxItemId.getClass();
        return new ChatFileUploadStartedEvent(eventType, fileName, fileSize, outboxItemId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatFileUploadStartedEvent)) {
            return false;
        }
        ChatFileUploadStartedEvent chatFileUploadStartedEvent = (ChatFileUploadStartedEvent) other;
        return im3.n(this.eventType, chatFileUploadStartedEvent.eventType) && im3.n(this.fileName, chatFileUploadStartedEvent.fileName) && this.fileSize == chatFileUploadStartedEvent.fileSize && im3.n(this.outboxItemId, chatFileUploadStartedEvent.outboxItemId);
    }

    @Override // com.teamviewer.apidefinitions.chat.models.TeamViewerEvent
    public String getEventType() {
        return this.eventType;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final UUID getOutboxItemId() {
        return this.outboxItemId;
    }

    public int hashCode() {
        return this.outboxItemId.hashCode() + fx3.c(to7.e(this.eventType.hashCode() * 31, 31, this.fileName), 31, this.fileSize);
    }

    public String toString() {
        String str = this.eventType;
        String str2 = this.fileName;
        long j = this.fileSize;
        UUID uuid = this.outboxItemId;
        StringBuilder sbO = e41.o("ChatFileUploadStartedEvent(eventType=", str, ", fileName=", str2, ", fileSize=");
        sbO.append(j);
        sbO.append(", outboxItemId=");
        sbO.append(uuid);
        sbO.append(")");
        return sbO.toString();
    }
}
