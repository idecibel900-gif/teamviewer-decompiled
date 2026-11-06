package com.teamviewer.apidefinitions.chat.models;

import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/teamviewer/apidefinitions/chat/models/ChatUserStatus;", "", "userId", "", "status", "Lcom/teamviewer/apidefinitions/chat/models/ContactOnlineStatus;", "<init>", "(Ljava/lang/String;Lcom/teamviewer/apidefinitions/chat/models/ContactOnlineStatus;)V", "getUserId", "()Ljava/lang/String;", "getStatus", "()Lcom/teamviewer/apidefinitions/chat/models/ContactOnlineStatus;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChatUserStatus {
    private final ContactOnlineStatus status;
    private final String userId;

    public ChatUserStatus(@sp3(name = "userId") String str, @sp3(name = "status") ContactOnlineStatus contactOnlineStatus) {
        str.getClass();
        contactOnlineStatus.getClass();
        this.userId = str;
        this.status = contactOnlineStatus;
    }

    public static /* synthetic */ ChatUserStatus copy$default(ChatUserStatus chatUserStatus, String str, ContactOnlineStatus contactOnlineStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatUserStatus.userId;
        }
        if ((i & 2) != 0) {
            contactOnlineStatus = chatUserStatus.status;
        }
        return chatUserStatus.copy(str, contactOnlineStatus);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ContactOnlineStatus getStatus() {
        return this.status;
    }

    public final ChatUserStatus copy(@sp3(name = "userId") String userId, @sp3(name = "status") ContactOnlineStatus status) {
        userId.getClass();
        status.getClass();
        return new ChatUserStatus(userId, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatUserStatus)) {
            return false;
        }
        ChatUserStatus chatUserStatus = (ChatUserStatus) other;
        return im3.n(this.userId, chatUserStatus.userId) && this.status == chatUserStatus.status;
    }

    public final ContactOnlineStatus getStatus() {
        return this.status;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.status.hashCode() + (this.userId.hashCode() * 31);
    }

    public String toString() {
        return "ChatUserStatus(userId=" + this.userId + ", status=" + this.status + ")";
    }
}
