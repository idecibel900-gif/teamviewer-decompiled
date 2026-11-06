package com.teamviewer.apidefinitions.chat.models;

import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/teamviewer/apidefinitions/chat/models/ChatCreateConversationEvent;", "Lcom/teamviewer/apidefinitions/chat/models/TeamViewerEvent;", "eventType", "", "conversation", "Lcom/teamviewer/apidefinitions/chat/models/ChatConversation;", "<init>", "(Ljava/lang/String;Lcom/teamviewer/apidefinitions/chat/models/ChatConversation;)V", "getEventType", "()Ljava/lang/String;", "getConversation", "()Lcom/teamviewer/apidefinitions/chat/models/ChatConversation;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChatCreateConversationEvent implements TeamViewerEvent {
    private final ChatConversation conversation;
    private final String eventType;

    public ChatCreateConversationEvent(@sp3(name = "eventType") String str, @sp3(name = "conversation") ChatConversation chatConversation) {
        str.getClass();
        chatConversation.getClass();
        this.eventType = str;
        this.conversation = chatConversation;
    }

    public static /* synthetic */ ChatCreateConversationEvent copy$default(ChatCreateConversationEvent chatCreateConversationEvent, String str, ChatConversation chatConversation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatCreateConversationEvent.eventType;
        }
        if ((i & 2) != 0) {
            chatConversation = chatCreateConversationEvent.conversation;
        }
        return chatCreateConversationEvent.copy(str, chatConversation);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ChatConversation getConversation() {
        return this.conversation;
    }

    public final ChatCreateConversationEvent copy(@sp3(name = "eventType") String eventType, @sp3(name = "conversation") ChatConversation conversation) {
        eventType.getClass();
        conversation.getClass();
        return new ChatCreateConversationEvent(eventType, conversation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatCreateConversationEvent)) {
            return false;
        }
        ChatCreateConversationEvent chatCreateConversationEvent = (ChatCreateConversationEvent) other;
        return im3.n(this.eventType, chatCreateConversationEvent.eventType) && im3.n(this.conversation, chatCreateConversationEvent.conversation);
    }

    public final ChatConversation getConversation() {
        return this.conversation;
    }

    @Override // com.teamviewer.apidefinitions.chat.models.TeamViewerEvent
    public String getEventType() {
        return this.eventType;
    }

    public int hashCode() {
        return this.conversation.hashCode() + (this.eventType.hashCode() * 31);
    }

    public String toString() {
        return "ChatCreateConversationEvent(eventType=" + this.eventType + ", conversation=" + this.conversation + ")";
    }
}
