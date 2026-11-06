package com.teamviewer.apidefinitions.chat.models;

import java.util.UUID;
import kotlin.Metadata;
import o.e41;
import o.im3;
import o.sp3;
import o.to7;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/teamviewer/apidefinitions/chat/models/ChatFileUploadProgressEvent;", "Lcom/teamviewer/apidefinitions/chat/models/TeamViewerEvent;", "eventType", "", "fileName", "outboxItemId", "Ljava/util/UUID;", "progress", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;I)V", "getEventType", "()Ljava/lang/String;", "getFileName", "getOutboxItemId", "()Ljava/util/UUID;", "getProgress", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChatFileUploadProgressEvent implements TeamViewerEvent {
    private final String eventType;
    private final String fileName;
    private final UUID outboxItemId;
    private final int progress;

    public ChatFileUploadProgressEvent(@sp3(name = "eventType") String str, @sp3(name = "fileName") String str2, @sp3(name = "outboxItemId") UUID uuid, @sp3(name = "progress") int i) {
        str.getClass();
        str2.getClass();
        uuid.getClass();
        this.eventType = str;
        this.fileName = str2;
        this.outboxItemId = uuid;
        this.progress = i;
    }

    public static /* synthetic */ ChatFileUploadProgressEvent copy$default(ChatFileUploadProgressEvent chatFileUploadProgressEvent, String str, String str2, UUID uuid, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = chatFileUploadProgressEvent.eventType;
        }
        if ((i2 & 2) != 0) {
            str2 = chatFileUploadProgressEvent.fileName;
        }
        if ((i2 & 4) != 0) {
            uuid = chatFileUploadProgressEvent.outboxItemId;
        }
        if ((i2 & 8) != 0) {
            i = chatFileUploadProgressEvent.progress;
        }
        return chatFileUploadProgressEvent.copy(str, str2, uuid, i);
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
    public final UUID getOutboxItemId() {
        return this.outboxItemId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    public final ChatFileUploadProgressEvent copy(@sp3(name = "eventType") String eventType, @sp3(name = "fileName") String fileName, @sp3(name = "outboxItemId") UUID outboxItemId, @sp3(name = "progress") int progress) {
        eventType.getClass();
        fileName.getClass();
        outboxItemId.getClass();
        return new ChatFileUploadProgressEvent(eventType, fileName, outboxItemId, progress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatFileUploadProgressEvent)) {
            return false;
        }
        ChatFileUploadProgressEvent chatFileUploadProgressEvent = (ChatFileUploadProgressEvent) other;
        return im3.n(this.eventType, chatFileUploadProgressEvent.eventType) && im3.n(this.fileName, chatFileUploadProgressEvent.fileName) && im3.n(this.outboxItemId, chatFileUploadProgressEvent.outboxItemId) && this.progress == chatFileUploadProgressEvent.progress;
    }

    @Override // com.teamviewer.apidefinitions.chat.models.TeamViewerEvent
    public String getEventType() {
        return this.eventType;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final UUID getOutboxItemId() {
        return this.outboxItemId;
    }

    public final int getProgress() {
        return this.progress;
    }

    public int hashCode() {
        return Integer.hashCode(this.progress) + ua5.e(this.outboxItemId, to7.e(this.eventType.hashCode() * 31, 31, this.fileName), 31);
    }

    public String toString() {
        String str = this.eventType;
        String str2 = this.fileName;
        UUID uuid = this.outboxItemId;
        int i = this.progress;
        StringBuilder sbO = e41.o("ChatFileUploadProgressEvent(eventType=", str, ", fileName=", str2, ", outboxItemId=");
        sbO.append(uuid);
        sbO.append(", progress=");
        sbO.append(i);
        sbO.append(")");
        return sbO.toString();
    }
}
