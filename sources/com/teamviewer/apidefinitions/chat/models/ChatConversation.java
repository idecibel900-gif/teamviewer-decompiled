package com.teamviewer.apidefinitions.chat.models;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jc\u0010)\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\n2\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016¨\u00060"}, d2 = {"Lcom/teamviewer/apidefinitions/chat/models/ChatConversation;", "", "conversationId", "Ljava/util/UUID;", "createdBy", "", "title", "conversationType", "Lcom/teamviewer/apidefinitions/chat/models/ChatConversationType;", "lastActivity", "Ljava/time/OffsetDateTime;", "members", "", "Lcom/teamviewer/apidefinitions/chat/models/ChatUser;", "lastMessage", "Lcom/teamviewer/apidefinitions/chat/models/ChatMessage;", "conversationState", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lcom/teamviewer/apidefinitions/chat/models/ChatConversationType;Ljava/time/OffsetDateTime;Ljava/util/List;Lcom/teamviewer/apidefinitions/chat/models/ChatMessage;Ljava/lang/String;)V", "getConversationId", "()Ljava/util/UUID;", "getCreatedBy", "()Ljava/lang/String;", "getTitle", "getConversationType", "()Lcom/teamviewer/apidefinitions/chat/models/ChatConversationType;", "getLastActivity", "()Ljava/time/OffsetDateTime;", "getMembers", "()Ljava/util/List;", "getLastMessage", "()Lcom/teamviewer/apidefinitions/chat/models/ChatMessage;", "getConversationState", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChatConversation {
    private final UUID conversationId;
    private final String conversationState;
    private final ChatConversationType conversationType;
    private final String createdBy;
    private final OffsetDateTime lastActivity;
    private final ChatMessage lastMessage;
    private final List<ChatUser> members;
    private final String title;

    public ChatConversation(@sp3(name = "conversationId") UUID uuid, @sp3(name = "createdBy") String str, @sp3(name = "title") String str2, @sp3(name = "conversationType") ChatConversationType chatConversationType, @sp3(name = "lastActivity") OffsetDateTime offsetDateTime, @sp3(name = "members") List<ChatUser> list, @sp3(name = "lastMessage") ChatMessage chatMessage, @sp3(name = "conversationState") String str3) {
        uuid.getClass();
        str.getClass();
        str2.getClass();
        chatConversationType.getClass();
        offsetDateTime.getClass();
        list.getClass();
        this.conversationId = uuid;
        this.createdBy = str;
        this.title = str2;
        this.conversationType = chatConversationType;
        this.lastActivity = offsetDateTime;
        this.members = list;
        this.lastMessage = chatMessage;
        this.conversationState = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatConversation copy$default(ChatConversation chatConversation, UUID uuid, String str, String str2, ChatConversationType chatConversationType, OffsetDateTime offsetDateTime, List list, ChatMessage chatMessage, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = chatConversation.conversationId;
        }
        if ((i & 2) != 0) {
            str = chatConversation.createdBy;
        }
        if ((i & 4) != 0) {
            str2 = chatConversation.title;
        }
        if ((i & 8) != 0) {
            chatConversationType = chatConversation.conversationType;
        }
        if ((i & 16) != 0) {
            offsetDateTime = chatConversation.lastActivity;
        }
        if ((i & 32) != 0) {
            list = chatConversation.members;
        }
        if ((i & 64) != 0) {
            chatMessage = chatConversation.lastMessage;
        }
        if ((i & 128) != 0) {
            str3 = chatConversation.conversationState;
        }
        ChatMessage chatMessage2 = chatMessage;
        String str4 = str3;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        List list2 = list;
        return chatConversation.copy(uuid, str, str2, chatConversationType, offsetDateTime2, list2, chatMessage2, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getConversationId() {
        return this.conversationId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCreatedBy() {
        return this.createdBy;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ChatConversationType getConversationType() {
        return this.conversationType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OffsetDateTime getLastActivity() {
        return this.lastActivity;
    }

    public final List<ChatUser> component6() {
        return this.members;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ChatMessage getLastMessage() {
        return this.lastMessage;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getConversationState() {
        return this.conversationState;
    }

    public final ChatConversation copy(@sp3(name = "conversationId") UUID conversationId, @sp3(name = "createdBy") String createdBy, @sp3(name = "title") String title, @sp3(name = "conversationType") ChatConversationType conversationType, @sp3(name = "lastActivity") OffsetDateTime lastActivity, @sp3(name = "members") List<ChatUser> members, @sp3(name = "lastMessage") ChatMessage lastMessage, @sp3(name = "conversationState") String conversationState) {
        conversationId.getClass();
        createdBy.getClass();
        title.getClass();
        conversationType.getClass();
        lastActivity.getClass();
        members.getClass();
        return new ChatConversation(conversationId, createdBy, title, conversationType, lastActivity, members, lastMessage, conversationState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatConversation)) {
            return false;
        }
        ChatConversation chatConversation = (ChatConversation) other;
        return im3.n(this.conversationId, chatConversation.conversationId) && im3.n(this.createdBy, chatConversation.createdBy) && im3.n(this.title, chatConversation.title) && this.conversationType == chatConversation.conversationType && im3.n(this.lastActivity, chatConversation.lastActivity) && im3.n(this.members, chatConversation.members) && im3.n(this.lastMessage, chatConversation.lastMessage) && im3.n(this.conversationState, chatConversation.conversationState);
    }

    public final UUID getConversationId() {
        return this.conversationId;
    }

    public final String getConversationState() {
        return this.conversationState;
    }

    public final ChatConversationType getConversationType() {
        return this.conversationType;
    }

    public final String getCreatedBy() {
        return this.createdBy;
    }

    public final OffsetDateTime getLastActivity() {
        return this.lastActivity;
    }

    public final ChatMessage getLastMessage() {
        return this.lastMessage;
    }

    public final List<ChatUser> getMembers() {
        return this.members;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iG = to7.g(this.members, (this.lastActivity.hashCode() + ((this.conversationType.hashCode() + to7.e(to7.e(this.conversationId.hashCode() * 31, 31, this.createdBy), 31, this.title)) * 31)) * 31, 31);
        ChatMessage chatMessage = this.lastMessage;
        int iHashCode = (iG + (chatMessage == null ? 0 : chatMessage.hashCode())) * 31;
        String str = this.conversationState;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ChatConversation(conversationId=" + this.conversationId + ", createdBy=" + this.createdBy + ", title=" + this.title + ", conversationType=" + this.conversationType + ", lastActivity=" + this.lastActivity + ", members=" + this.members + ", lastMessage=" + this.lastMessage + ", conversationState=" + this.conversationState + ")";
    }

    public /* synthetic */ ChatConversation(UUID uuid, String str, String str2, ChatConversationType chatConversationType, OffsetDateTime offsetDateTime, List list, ChatMessage chatMessage, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, str, str2, chatConversationType, offsetDateTime, list, (i & 64) != 0 ? null : chatMessage, (i & 128) != 0 ? null : str3);
    }
}
