package com.teamviewer.apidefinitions.chat.models;

import java.util.List;
import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/teamviewer/apidefinitions/chat/models/ChatAddUsers;", "", "users", "", "", "enableSharedHistory", "", "<init>", "(Ljava/util/List;Z)V", "getUsers", "()Ljava/util/List;", "getEnableSharedHistory", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChatAddUsers {
    private final boolean enableSharedHistory;
    private final List<String> users;

    public ChatAddUsers(@sp3(name = "users") List<String> list, @sp3(name = "enableSharedHistory") boolean z) {
        list.getClass();
        this.users = list;
        this.enableSharedHistory = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatAddUsers copy$default(ChatAddUsers chatAddUsers, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = chatAddUsers.users;
        }
        if ((i & 2) != 0) {
            z = chatAddUsers.enableSharedHistory;
        }
        return chatAddUsers.copy(list, z);
    }

    public final List<String> component1() {
        return this.users;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getEnableSharedHistory() {
        return this.enableSharedHistory;
    }

    public final ChatAddUsers copy(@sp3(name = "users") List<String> users, @sp3(name = "enableSharedHistory") boolean enableSharedHistory) {
        users.getClass();
        return new ChatAddUsers(users, enableSharedHistory);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatAddUsers)) {
            return false;
        }
        ChatAddUsers chatAddUsers = (ChatAddUsers) other;
        return im3.n(this.users, chatAddUsers.users) && this.enableSharedHistory == chatAddUsers.enableSharedHistory;
    }

    public final boolean getEnableSharedHistory() {
        return this.enableSharedHistory;
    }

    public final List<String> getUsers() {
        return this.users;
    }

    public int hashCode() {
        return Boolean.hashCode(this.enableSharedHistory) + (this.users.hashCode() * 31);
    }

    public String toString() {
        return "ChatAddUsers(users=" + this.users + ", enableSharedHistory=" + this.enableSharedHistory + ")";
    }
}
