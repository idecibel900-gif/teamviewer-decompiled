package com.teamviewer.apidefinitions.chat.models;

import java.util.UUID;
import kotlin.Metadata;
import o.im3;
import o.sp3;
import o.to7;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/teamviewer/apidefinitions/chat/models/ChatTyping;", "", "conversationId", "Ljava/util/UUID;", "userId", "", "isTyping", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Z)V", "getConversationId", "()Ljava/util/UUID;", "getUserId", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChatTyping {
    private final UUID conversationId;
    private final boolean isTyping;
    private final String userId;

    public ChatTyping(@sp3(name = "conversationId") UUID uuid, @sp3(name = "userId") String str, @sp3(name = "isTyping") boolean z) {
        uuid.getClass();
        str.getClass();
        this.conversationId = uuid;
        this.userId = str;
        this.isTyping = z;
    }

    public static /* synthetic */ ChatTyping copy$default(ChatTyping chatTyping, UUID uuid, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = chatTyping.conversationId;
        }
        if ((i & 2) != 0) {
            str = chatTyping.userId;
        }
        if ((i & 4) != 0) {
            z = chatTyping.isTyping;
        }
        return chatTyping.copy(uuid, str, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getConversationId() {
        return this.conversationId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsTyping() {
        return this.isTyping;
    }

    public final ChatTyping copy(@sp3(name = "conversationId") UUID conversationId, @sp3(name = "userId") String userId, @sp3(name = "isTyping") boolean isTyping) {
        conversationId.getClass();
        userId.getClass();
        return new ChatTyping(conversationId, userId, isTyping);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatTyping)) {
            return false;
        }
        ChatTyping chatTyping = (ChatTyping) other;
        return im3.n(this.conversationId, chatTyping.conversationId) && im3.n(this.userId, chatTyping.userId) && this.isTyping == chatTyping.isTyping;
    }

    public final UUID getConversationId() {
        return this.conversationId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isTyping) + to7.e(this.conversationId.hashCode() * 31, 31, this.userId);
    }

    public final boolean isTyping() {
        return this.isTyping;
    }

    public String toString() {
        UUID uuid = this.conversationId;
        String str = this.userId;
        boolean z = this.isTyping;
        StringBuilder sb = new StringBuilder("ChatTyping(conversationId=");
        sb.append(uuid);
        sb.append(", userId=");
        sb.append(str);
        sb.append(", isTyping=");
        return ua5.n(")", sb, z);
    }
}
