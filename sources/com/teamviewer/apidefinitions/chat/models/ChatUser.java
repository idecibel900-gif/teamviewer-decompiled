package com.teamviewer.apidefinitions.chat.models;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.e41;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/teamviewer/apidefinitions/chat/models/ChatUser;", "", "userId", "", "displayName", "pictureUrl", "status", "Lcom/teamviewer/apidefinitions/chat/models/ContactOnlineStatus;", "managementId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/teamviewer/apidefinitions/chat/models/ContactOnlineStatus;Ljava/util/UUID;)V", "getUserId", "()Ljava/lang/String;", "getDisplayName", "getPictureUrl", "getStatus", "()Lcom/teamviewer/apidefinitions/chat/models/ContactOnlineStatus;", "getManagementId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChatUser {
    private final String displayName;
    private final UUID managementId;
    private final String pictureUrl;
    private final ContactOnlineStatus status;
    private final String userId;

    public ChatUser(@sp3(name = "userId") String str, @sp3(name = "displayName") String str2, @sp3(name = "pictureUrl") String str3, @sp3(name = "status") ContactOnlineStatus contactOnlineStatus, @sp3(name = "managementId") UUID uuid) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        contactOnlineStatus.getClass();
        this.userId = str;
        this.displayName = str2;
        this.pictureUrl = str3;
        this.status = contactOnlineStatus;
        this.managementId = uuid;
    }

    public static /* synthetic */ ChatUser copy$default(ChatUser chatUser, String str, String str2, String str3, ContactOnlineStatus contactOnlineStatus, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatUser.userId;
        }
        if ((i & 2) != 0) {
            str2 = chatUser.displayName;
        }
        if ((i & 4) != 0) {
            str3 = chatUser.pictureUrl;
        }
        if ((i & 8) != 0) {
            contactOnlineStatus = chatUser.status;
        }
        if ((i & 16) != 0) {
            uuid = chatUser.managementId;
        }
        UUID uuid2 = uuid;
        String str4 = str3;
        return chatUser.copy(str, str2, str4, contactOnlineStatus, uuid2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPictureUrl() {
        return this.pictureUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ContactOnlineStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final UUID getManagementId() {
        return this.managementId;
    }

    public final ChatUser copy(@sp3(name = "userId") String userId, @sp3(name = "displayName") String displayName, @sp3(name = "pictureUrl") String pictureUrl, @sp3(name = "status") ContactOnlineStatus status, @sp3(name = "managementId") UUID managementId) {
        userId.getClass();
        displayName.getClass();
        pictureUrl.getClass();
        status.getClass();
        return new ChatUser(userId, displayName, pictureUrl, status, managementId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatUser)) {
            return false;
        }
        ChatUser chatUser = (ChatUser) other;
        return im3.n(this.userId, chatUser.userId) && im3.n(this.displayName, chatUser.displayName) && im3.n(this.pictureUrl, chatUser.pictureUrl) && this.status == chatUser.status && im3.n(this.managementId, chatUser.managementId);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final UUID getManagementId() {
        return this.managementId;
    }

    public final String getPictureUrl() {
        return this.pictureUrl;
    }

    public final ContactOnlineStatus getStatus() {
        return this.status;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = (this.status.hashCode() + to7.e(to7.e(this.userId.hashCode() * 31, 31, this.displayName), 31, this.pictureUrl)) * 31;
        UUID uuid = this.managementId;
        return iHashCode + (uuid == null ? 0 : uuid.hashCode());
    }

    public String toString() {
        String str = this.userId;
        String str2 = this.displayName;
        String str3 = this.pictureUrl;
        ContactOnlineStatus contactOnlineStatus = this.status;
        UUID uuid = this.managementId;
        StringBuilder sbO = e41.o("ChatUser(userId=", str, ", displayName=", str2, ", pictureUrl=");
        sbO.append(str3);
        sbO.append(", status=");
        sbO.append(contactOnlineStatus);
        sbO.append(", managementId=");
        sbO.append(uuid);
        sbO.append(")");
        return sbO.toString();
    }

    public /* synthetic */ ChatUser(String str, String str2, String str3, ContactOnlineStatus contactOnlineStatus, UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, contactOnlineStatus, (i & 16) != 0 ? null : uuid);
    }
}
