package com.teamviewer.apidefinitions.chat.models;

import java.util.UUID;
import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/teamviewer/apidefinitions/chat/models/ChatRenameConversationResponse;", "", "newTitle", "", "conversationId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;)V", "getNewTitle", "()Ljava/lang/String;", "getConversationId", "()Ljava/util/UUID;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChatRenameConversationResponse {
    private final UUID conversationId;
    private final String newTitle;

    public ChatRenameConversationResponse(@sp3(name = "newTitle") String str, @sp3(name = "conversationId") UUID uuid) {
        str.getClass();
        uuid.getClass();
        this.newTitle = str;
        this.conversationId = uuid;
    }

    public static /* synthetic */ ChatRenameConversationResponse copy$default(ChatRenameConversationResponse chatRenameConversationResponse, String str, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatRenameConversationResponse.newTitle;
        }
        if ((i & 2) != 0) {
            uuid = chatRenameConversationResponse.conversationId;
        }
        return chatRenameConversationResponse.copy(str, uuid);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNewTitle() {
        return this.newTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UUID getConversationId() {
        return this.conversationId;
    }

    public final ChatRenameConversationResponse copy(@sp3(name = "newTitle") String newTitle, @sp3(name = "conversationId") UUID conversationId) {
        newTitle.getClass();
        conversationId.getClass();
        return new ChatRenameConversationResponse(newTitle, conversationId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatRenameConversationResponse)) {
            return false;
        }
        ChatRenameConversationResponse chatRenameConversationResponse = (ChatRenameConversationResponse) other;
        return im3.n(this.newTitle, chatRenameConversationResponse.newTitle) && im3.n(this.conversationId, chatRenameConversationResponse.conversationId);
    }

    public final UUID getConversationId() {
        return this.conversationId;
    }

    public final String getNewTitle() {
        return this.newTitle;
    }

    public int hashCode() {
        return this.conversationId.hashCode() + (this.newTitle.hashCode() * 31);
    }

    public String toString() {
        return "ChatRenameConversationResponse(newTitle=" + this.newTitle + ", conversationId=" + this.conversationId + ")";
    }
}
