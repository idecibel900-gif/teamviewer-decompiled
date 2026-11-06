package com.teamviewer.apidefinitions.chat.models;

import java.util.UUID;
import kotlin.Metadata;
import o.im3;
import o.sp3;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/teamviewer/apidefinitions/chat/models/ChatFileUploadFinishedEvent;", "Lcom/teamviewer/apidefinitions/chat/models/TeamViewerEvent;", "eventType", "", "outboxItemId", "Ljava/util/UUID;", "resultCode", "Lcom/teamviewer/apidefinitions/chat/models/ChatFileUploadResultCode;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Lcom/teamviewer/apidefinitions/chat/models/ChatFileUploadResultCode;)V", "getEventType", "()Ljava/lang/String;", "getOutboxItemId", "()Ljava/util/UUID;", "getResultCode", "()Lcom/teamviewer/apidefinitions/chat/models/ChatFileUploadResultCode;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChatFileUploadFinishedEvent implements TeamViewerEvent {
    private final String eventType;
    private final UUID outboxItemId;
    private final ChatFileUploadResultCode resultCode;

    public ChatFileUploadFinishedEvent(@sp3(name = "eventType") String str, @sp3(name = "outboxItemId") UUID uuid, @sp3(name = "resultCode") ChatFileUploadResultCode chatFileUploadResultCode) {
        str.getClass();
        uuid.getClass();
        chatFileUploadResultCode.getClass();
        this.eventType = str;
        this.outboxItemId = uuid;
        this.resultCode = chatFileUploadResultCode;
    }

    public static /* synthetic */ ChatFileUploadFinishedEvent copy$default(ChatFileUploadFinishedEvent chatFileUploadFinishedEvent, String str, UUID uuid, ChatFileUploadResultCode chatFileUploadResultCode, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatFileUploadFinishedEvent.eventType;
        }
        if ((i & 2) != 0) {
            uuid = chatFileUploadFinishedEvent.outboxItemId;
        }
        if ((i & 4) != 0) {
            chatFileUploadResultCode = chatFileUploadFinishedEvent.resultCode;
        }
        return chatFileUploadFinishedEvent.copy(str, uuid, chatFileUploadResultCode);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UUID getOutboxItemId() {
        return this.outboxItemId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ChatFileUploadResultCode getResultCode() {
        return this.resultCode;
    }

    public final ChatFileUploadFinishedEvent copy(@sp3(name = "eventType") String eventType, @sp3(name = "outboxItemId") UUID outboxItemId, @sp3(name = "resultCode") ChatFileUploadResultCode resultCode) {
        eventType.getClass();
        outboxItemId.getClass();
        resultCode.getClass();
        return new ChatFileUploadFinishedEvent(eventType, outboxItemId, resultCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatFileUploadFinishedEvent)) {
            return false;
        }
        ChatFileUploadFinishedEvent chatFileUploadFinishedEvent = (ChatFileUploadFinishedEvent) other;
        return im3.n(this.eventType, chatFileUploadFinishedEvent.eventType) && im3.n(this.outboxItemId, chatFileUploadFinishedEvent.outboxItemId) && this.resultCode == chatFileUploadFinishedEvent.resultCode;
    }

    @Override // com.teamviewer.apidefinitions.chat.models.TeamViewerEvent
    public String getEventType() {
        return this.eventType;
    }

    public final UUID getOutboxItemId() {
        return this.outboxItemId;
    }

    public final ChatFileUploadResultCode getResultCode() {
        return this.resultCode;
    }

    public int hashCode() {
        return this.resultCode.hashCode() + ua5.e(this.outboxItemId, this.eventType.hashCode() * 31, 31);
    }

    public String toString() {
        return "ChatFileUploadFinishedEvent(eventType=" + this.eventType + ", outboxItemId=" + this.outboxItemId + ", resultCode=" + this.resultCode + ")";
    }
}
