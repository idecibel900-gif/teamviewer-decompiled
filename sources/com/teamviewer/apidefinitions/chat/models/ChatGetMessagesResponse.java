package com.teamviewer.apidefinitions.chat.models;

import java.util.List;
import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/teamviewer/apidefinitions/chat/models/ChatGetMessagesResponse;", "", "allMessagesLoaded", "", "messages", "", "Lcom/teamviewer/apidefinitions/chat/models/ChatMessage;", "<init>", "(ZLjava/util/List;)V", "getAllMessagesLoaded", "()Z", "getMessages", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChatGetMessagesResponse {
    private final boolean allMessagesLoaded;
    private final List<ChatMessage> messages;

    public ChatGetMessagesResponse(@sp3(name = "allMessagesLoaded") boolean z, @sp3(name = "messages") List<ChatMessage> list) {
        list.getClass();
        this.allMessagesLoaded = z;
        this.messages = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatGetMessagesResponse copy$default(ChatGetMessagesResponse chatGetMessagesResponse, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = chatGetMessagesResponse.allMessagesLoaded;
        }
        if ((i & 2) != 0) {
            list = chatGetMessagesResponse.messages;
        }
        return chatGetMessagesResponse.copy(z, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getAllMessagesLoaded() {
        return this.allMessagesLoaded;
    }

    public final List<ChatMessage> component2() {
        return this.messages;
    }

    public final ChatGetMessagesResponse copy(@sp3(name = "allMessagesLoaded") boolean allMessagesLoaded, @sp3(name = "messages") List<ChatMessage> messages) {
        messages.getClass();
        return new ChatGetMessagesResponse(allMessagesLoaded, messages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatGetMessagesResponse)) {
            return false;
        }
        ChatGetMessagesResponse chatGetMessagesResponse = (ChatGetMessagesResponse) other;
        return this.allMessagesLoaded == chatGetMessagesResponse.allMessagesLoaded && im3.n(this.messages, chatGetMessagesResponse.messages);
    }

    public final boolean getAllMessagesLoaded() {
        return this.allMessagesLoaded;
    }

    public final List<ChatMessage> getMessages() {
        return this.messages;
    }

    public int hashCode() {
        return this.messages.hashCode() + (Boolean.hashCode(this.allMessagesLoaded) * 31);
    }

    public String toString() {
        return "ChatGetMessagesResponse(allMessagesLoaded=" + this.allMessagesLoaded + ", messages=" + this.messages + ")";
    }
}
