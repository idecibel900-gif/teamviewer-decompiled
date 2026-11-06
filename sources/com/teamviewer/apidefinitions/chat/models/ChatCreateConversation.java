package com.teamviewer.apidefinitions.chat.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.e41;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/teamviewer/apidefinitions/chat/models/ChatCreateConversation;", "", "users", "", "Lcom/teamviewer/apidefinitions/chat/models/ChatEndpoint;", "enableSharedHistory", "", "conversationName", "", "<init>", "(Ljava/util/List;ZLjava/lang/String;)V", "getUsers", "()Ljava/util/List;", "getEnableSharedHistory", "()Z", "getConversationName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChatCreateConversation {
    private final String conversationName;
    private final boolean enableSharedHistory;
    private final List<ChatEndpoint> users;

    public ChatCreateConversation(@sp3(name = "users") List<ChatEndpoint> list, @sp3(name = "enableSharedHistory") boolean z, @sp3(name = "conversationName") String str) {
        list.getClass();
        this.users = list;
        this.enableSharedHistory = z;
        this.conversationName = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatCreateConversation copy$default(ChatCreateConversation chatCreateConversation, List list, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = chatCreateConversation.users;
        }
        if ((i & 2) != 0) {
            z = chatCreateConversation.enableSharedHistory;
        }
        if ((i & 4) != 0) {
            str = chatCreateConversation.conversationName;
        }
        return chatCreateConversation.copy(list, z, str);
    }

    public final List<ChatEndpoint> component1() {
        return this.users;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getEnableSharedHistory() {
        return this.enableSharedHistory;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getConversationName() {
        return this.conversationName;
    }

    public final ChatCreateConversation copy(@sp3(name = "users") List<ChatEndpoint> users, @sp3(name = "enableSharedHistory") boolean enableSharedHistory, @sp3(name = "conversationName") String conversationName) {
        users.getClass();
        return new ChatCreateConversation(users, enableSharedHistory, conversationName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatCreateConversation)) {
            return false;
        }
        ChatCreateConversation chatCreateConversation = (ChatCreateConversation) other;
        return im3.n(this.users, chatCreateConversation.users) && this.enableSharedHistory == chatCreateConversation.enableSharedHistory && im3.n(this.conversationName, chatCreateConversation.conversationName);
    }

    public final String getConversationName() {
        return this.conversationName;
    }

    public final boolean getEnableSharedHistory() {
        return this.enableSharedHistory;
    }

    public final List<ChatEndpoint> getUsers() {
        return this.users;
    }

    public int hashCode() {
        int iF = to7.f(this.users.hashCode() * 31, 31, this.enableSharedHistory);
        String str = this.conversationName;
        return iF + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        List<ChatEndpoint> list = this.users;
        boolean z = this.enableSharedHistory;
        String str = this.conversationName;
        StringBuilder sb = new StringBuilder("ChatCreateConversation(users=");
        sb.append(list);
        sb.append(", enableSharedHistory=");
        sb.append(z);
        sb.append(", conversationName=");
        return e41.l(sb, str, ")");
    }

    public /* synthetic */ ChatCreateConversation(List list, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, z, (i & 4) != 0 ? null : str);
    }
}
