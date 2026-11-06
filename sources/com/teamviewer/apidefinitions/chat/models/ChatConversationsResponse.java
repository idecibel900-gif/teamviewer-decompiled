package com.teamviewer.apidefinitions.chat.models;

import java.util.List;
import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/teamviewer/apidefinitions/chat/models/ChatConversationsResponse;", "", "allConversationsLoaded", "", "conversations", "", "Lcom/teamviewer/apidefinitions/chat/models/ChatConversation;", "<init>", "(ZLjava/util/List;)V", "getAllConversationsLoaded", "()Z", "getConversations", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChatConversationsResponse {
    private final boolean allConversationsLoaded;
    private final List<ChatConversation> conversations;

    public ChatConversationsResponse(@sp3(name = "allConversationsLoaded") boolean z, @sp3(name = "conversations") List<ChatConversation> list) {
        list.getClass();
        this.allConversationsLoaded = z;
        this.conversations = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatConversationsResponse copy$default(ChatConversationsResponse chatConversationsResponse, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = chatConversationsResponse.allConversationsLoaded;
        }
        if ((i & 2) != 0) {
            list = chatConversationsResponse.conversations;
        }
        return chatConversationsResponse.copy(z, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getAllConversationsLoaded() {
        return this.allConversationsLoaded;
    }

    public final List<ChatConversation> component2() {
        return this.conversations;
    }

    public final ChatConversationsResponse copy(@sp3(name = "allConversationsLoaded") boolean allConversationsLoaded, @sp3(name = "conversations") List<ChatConversation> conversations) {
        conversations.getClass();
        return new ChatConversationsResponse(allConversationsLoaded, conversations);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatConversationsResponse)) {
            return false;
        }
        ChatConversationsResponse chatConversationsResponse = (ChatConversationsResponse) other;
        return this.allConversationsLoaded == chatConversationsResponse.allConversationsLoaded && im3.n(this.conversations, chatConversationsResponse.conversations);
    }

    public final boolean getAllConversationsLoaded() {
        return this.allConversationsLoaded;
    }

    public final List<ChatConversation> getConversations() {
        return this.conversations;
    }

    public int hashCode() {
        return this.conversations.hashCode() + (Boolean.hashCode(this.allConversationsLoaded) * 31);
    }

    public String toString() {
        return "ChatConversationsResponse(allConversationsLoaded=" + this.allConversationsLoaded + ", conversations=" + this.conversations + ")";
    }
}
