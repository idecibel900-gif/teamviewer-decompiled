package com.teamviewer.apidefinitions.chat.models;

import java.util.UUID;
import kotlin.Metadata;
import o.im3;
import o.sp3;
import o.to7;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/teamviewer/apidefinitions/chat/models/ChatFileDownloadFinishedEvent;", "Lcom/teamviewer/apidefinitions/chat/models/TeamViewerEvent;", "eventType", "", "messageId", "Ljava/util/UUID;", "downloadedFilePath", "fileId", "resultCode", "Lcom/teamviewer/apidefinitions/chat/models/ChatFileDownloadResultCode;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;Ljava/util/UUID;Lcom/teamviewer/apidefinitions/chat/models/ChatFileDownloadResultCode;)V", "getEventType", "()Ljava/lang/String;", "getMessageId", "()Ljava/util/UUID;", "getDownloadedFilePath", "getFileId", "getResultCode", "()Lcom/teamviewer/apidefinitions/chat/models/ChatFileDownloadResultCode;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChatFileDownloadFinishedEvent implements TeamViewerEvent {
    private final String downloadedFilePath;
    private final String eventType;
    private final UUID fileId;
    private final UUID messageId;
    private final ChatFileDownloadResultCode resultCode;

    public ChatFileDownloadFinishedEvent(@sp3(name = "eventType") String str, @sp3(name = "messageId") UUID uuid, @sp3(name = "downloadedFilePath") String str2, @sp3(name = "fileId") UUID uuid2, @sp3(name = "resultCode") ChatFileDownloadResultCode chatFileDownloadResultCode) {
        str.getClass();
        uuid.getClass();
        str2.getClass();
        uuid2.getClass();
        chatFileDownloadResultCode.getClass();
        this.eventType = str;
        this.messageId = uuid;
        this.downloadedFilePath = str2;
        this.fileId = uuid2;
        this.resultCode = chatFileDownloadResultCode;
    }

    public static /* synthetic */ ChatFileDownloadFinishedEvent copy$default(ChatFileDownloadFinishedEvent chatFileDownloadFinishedEvent, String str, UUID uuid, String str2, UUID uuid2, ChatFileDownloadResultCode chatFileDownloadResultCode, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatFileDownloadFinishedEvent.eventType;
        }
        if ((i & 2) != 0) {
            uuid = chatFileDownloadFinishedEvent.messageId;
        }
        if ((i & 4) != 0) {
            str2 = chatFileDownloadFinishedEvent.downloadedFilePath;
        }
        if ((i & 8) != 0) {
            uuid2 = chatFileDownloadFinishedEvent.fileId;
        }
        if ((i & 16) != 0) {
            chatFileDownloadResultCode = chatFileDownloadFinishedEvent.resultCode;
        }
        ChatFileDownloadResultCode chatFileDownloadResultCode2 = chatFileDownloadResultCode;
        String str3 = str2;
        return chatFileDownloadFinishedEvent.copy(str, uuid, str3, uuid2, chatFileDownloadResultCode2);
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
    public final String getDownloadedFilePath() {
        return this.downloadedFilePath;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final UUID getFileId() {
        return this.fileId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ChatFileDownloadResultCode getResultCode() {
        return this.resultCode;
    }

    public final ChatFileDownloadFinishedEvent copy(@sp3(name = "eventType") String eventType, @sp3(name = "messageId") UUID messageId, @sp3(name = "downloadedFilePath") String downloadedFilePath, @sp3(name = "fileId") UUID fileId, @sp3(name = "resultCode") ChatFileDownloadResultCode resultCode) {
        eventType.getClass();
        messageId.getClass();
        downloadedFilePath.getClass();
        fileId.getClass();
        resultCode.getClass();
        return new ChatFileDownloadFinishedEvent(eventType, messageId, downloadedFilePath, fileId, resultCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatFileDownloadFinishedEvent)) {
            return false;
        }
        ChatFileDownloadFinishedEvent chatFileDownloadFinishedEvent = (ChatFileDownloadFinishedEvent) other;
        return im3.n(this.eventType, chatFileDownloadFinishedEvent.eventType) && im3.n(this.messageId, chatFileDownloadFinishedEvent.messageId) && im3.n(this.downloadedFilePath, chatFileDownloadFinishedEvent.downloadedFilePath) && im3.n(this.fileId, chatFileDownloadFinishedEvent.fileId) && this.resultCode == chatFileDownloadFinishedEvent.resultCode;
    }

    public final String getDownloadedFilePath() {
        return this.downloadedFilePath;
    }

    @Override // com.teamviewer.apidefinitions.chat.models.TeamViewerEvent
    public String getEventType() {
        return this.eventType;
    }

    public final UUID getFileId() {
        return this.fileId;
    }

    public final UUID getMessageId() {
        return this.messageId;
    }

    public final ChatFileDownloadResultCode getResultCode() {
        return this.resultCode;
    }

    public int hashCode() {
        return this.resultCode.hashCode() + ua5.e(this.fileId, to7.e(ua5.e(this.messageId, this.eventType.hashCode() * 31, 31), 31, this.downloadedFilePath), 31);
    }

    public String toString() {
        return "ChatFileDownloadFinishedEvent(eventType=" + this.eventType + ", messageId=" + this.messageId + ", downloadedFilePath=" + this.downloadedFilePath + ", fileId=" + this.fileId + ", resultCode=" + this.resultCode + ")";
    }
}
