package com.teamviewer.apidefinitions.chat.models;

import java.util.UUID;
import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/teamviewer/apidefinitions/chat/models/ChatUpdateRoomFeaturesResponse;", "", "conversationId", "Ljava/util/UUID;", "roomFeatures", "Lcom/teamviewer/apidefinitions/chat/models/ChatRoomFeatures;", "<init>", "(Ljava/util/UUID;Lcom/teamviewer/apidefinitions/chat/models/ChatRoomFeatures;)V", "getConversationId", "()Ljava/util/UUID;", "getRoomFeatures", "()Lcom/teamviewer/apidefinitions/chat/models/ChatRoomFeatures;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChatUpdateRoomFeaturesResponse {
    private final UUID conversationId;
    private final ChatRoomFeatures roomFeatures;

    public ChatUpdateRoomFeaturesResponse(@sp3(name = "conversationId") UUID uuid, @sp3(name = "roomFeatures") ChatRoomFeatures chatRoomFeatures) {
        uuid.getClass();
        chatRoomFeatures.getClass();
        this.conversationId = uuid;
        this.roomFeatures = chatRoomFeatures;
    }

    public static /* synthetic */ ChatUpdateRoomFeaturesResponse copy$default(ChatUpdateRoomFeaturesResponse chatUpdateRoomFeaturesResponse, UUID uuid, ChatRoomFeatures chatRoomFeatures, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = chatUpdateRoomFeaturesResponse.conversationId;
        }
        if ((i & 2) != 0) {
            chatRoomFeatures = chatUpdateRoomFeaturesResponse.roomFeatures;
        }
        return chatUpdateRoomFeaturesResponse.copy(uuid, chatRoomFeatures);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getConversationId() {
        return this.conversationId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ChatRoomFeatures getRoomFeatures() {
        return this.roomFeatures;
    }

    public final ChatUpdateRoomFeaturesResponse copy(@sp3(name = "conversationId") UUID conversationId, @sp3(name = "roomFeatures") ChatRoomFeatures roomFeatures) {
        conversationId.getClass();
        roomFeatures.getClass();
        return new ChatUpdateRoomFeaturesResponse(conversationId, roomFeatures);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatUpdateRoomFeaturesResponse)) {
            return false;
        }
        ChatUpdateRoomFeaturesResponse chatUpdateRoomFeaturesResponse = (ChatUpdateRoomFeaturesResponse) other;
        return im3.n(this.conversationId, chatUpdateRoomFeaturesResponse.conversationId) && im3.n(this.roomFeatures, chatUpdateRoomFeaturesResponse.roomFeatures);
    }

    public final UUID getConversationId() {
        return this.conversationId;
    }

    public final ChatRoomFeatures getRoomFeatures() {
        return this.roomFeatures;
    }

    public int hashCode() {
        return this.roomFeatures.hashCode() + (this.conversationId.hashCode() * 31);
    }

    public String toString() {
        return "ChatUpdateRoomFeaturesResponse(conversationId=" + this.conversationId + ", roomFeatures=" + this.roomFeatures + ")";
    }
}
