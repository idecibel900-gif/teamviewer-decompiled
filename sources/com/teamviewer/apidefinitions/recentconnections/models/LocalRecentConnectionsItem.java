package com.teamviewer.apidefinitions.recentconnections.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.e41;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006 "}, d2 = {"Lcom/teamviewer/apidefinitions/recentconnections/models/LocalRecentConnectionsItem;", "", "displayName", "", "itemType", "Lcom/teamviewer/apidefinitions/recentconnections/models/RecentConnectionsItemType;", "connectId", "onlineState", "Lcom/teamviewer/apidefinitions/recentconnections/models/ContactOnlineStatus;", "pictureUrl", "<init>", "(Ljava/lang/String;Lcom/teamviewer/apidefinitions/recentconnections/models/RecentConnectionsItemType;Ljava/lang/String;Lcom/teamviewer/apidefinitions/recentconnections/models/ContactOnlineStatus;Ljava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "getItemType", "()Lcom/teamviewer/apidefinitions/recentconnections/models/RecentConnectionsItemType;", "getConnectId", "getOnlineState", "()Lcom/teamviewer/apidefinitions/recentconnections/models/ContactOnlineStatus;", "getPictureUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LocalRecentConnectionsItem {
    private final String connectId;
    private final String displayName;
    private final RecentConnectionsItemType itemType;
    private final ContactOnlineStatus onlineState;
    private final String pictureUrl;

    public LocalRecentConnectionsItem(@sp3(name = "displayName") String str, @sp3(name = "itemType") RecentConnectionsItemType recentConnectionsItemType, @sp3(name = "connectId") String str2, @sp3(name = "onlineState") ContactOnlineStatus contactOnlineStatus, @sp3(name = "pictureUrl") String str3) {
        str.getClass();
        recentConnectionsItemType.getClass();
        str2.getClass();
        this.displayName = str;
        this.itemType = recentConnectionsItemType;
        this.connectId = str2;
        this.onlineState = contactOnlineStatus;
        this.pictureUrl = str3;
    }

    public static /* synthetic */ LocalRecentConnectionsItem copy$default(LocalRecentConnectionsItem localRecentConnectionsItem, String str, RecentConnectionsItemType recentConnectionsItemType, String str2, ContactOnlineStatus contactOnlineStatus, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localRecentConnectionsItem.displayName;
        }
        if ((i & 2) != 0) {
            recentConnectionsItemType = localRecentConnectionsItem.itemType;
        }
        if ((i & 4) != 0) {
            str2 = localRecentConnectionsItem.connectId;
        }
        if ((i & 8) != 0) {
            contactOnlineStatus = localRecentConnectionsItem.onlineState;
        }
        if ((i & 16) != 0) {
            str3 = localRecentConnectionsItem.pictureUrl;
        }
        String str4 = str3;
        String str5 = str2;
        return localRecentConnectionsItem.copy(str, recentConnectionsItemType, str5, contactOnlineStatus, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RecentConnectionsItemType getItemType() {
        return this.itemType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getConnectId() {
        return this.connectId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ContactOnlineStatus getOnlineState() {
        return this.onlineState;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPictureUrl() {
        return this.pictureUrl;
    }

    public final LocalRecentConnectionsItem copy(@sp3(name = "displayName") String displayName, @sp3(name = "itemType") RecentConnectionsItemType itemType, @sp3(name = "connectId") String connectId, @sp3(name = "onlineState") ContactOnlineStatus onlineState, @sp3(name = "pictureUrl") String pictureUrl) {
        displayName.getClass();
        itemType.getClass();
        connectId.getClass();
        return new LocalRecentConnectionsItem(displayName, itemType, connectId, onlineState, pictureUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalRecentConnectionsItem)) {
            return false;
        }
        LocalRecentConnectionsItem localRecentConnectionsItem = (LocalRecentConnectionsItem) other;
        return im3.n(this.displayName, localRecentConnectionsItem.displayName) && this.itemType == localRecentConnectionsItem.itemType && im3.n(this.connectId, localRecentConnectionsItem.connectId) && this.onlineState == localRecentConnectionsItem.onlineState && im3.n(this.pictureUrl, localRecentConnectionsItem.pictureUrl);
    }

    public final String getConnectId() {
        return this.connectId;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final RecentConnectionsItemType getItemType() {
        return this.itemType;
    }

    public final ContactOnlineStatus getOnlineState() {
        return this.onlineState;
    }

    public final String getPictureUrl() {
        return this.pictureUrl;
    }

    public int hashCode() {
        int iE = to7.e((this.itemType.hashCode() + (this.displayName.hashCode() * 31)) * 31, 31, this.connectId);
        ContactOnlineStatus contactOnlineStatus = this.onlineState;
        int iHashCode = (iE + (contactOnlineStatus == null ? 0 : contactOnlineStatus.hashCode())) * 31;
        String str = this.pictureUrl;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.displayName;
        RecentConnectionsItemType recentConnectionsItemType = this.itemType;
        String str2 = this.connectId;
        ContactOnlineStatus contactOnlineStatus = this.onlineState;
        String str3 = this.pictureUrl;
        StringBuilder sb = new StringBuilder("LocalRecentConnectionsItem(displayName=");
        sb.append(str);
        sb.append(", itemType=");
        sb.append(recentConnectionsItemType);
        sb.append(", connectId=");
        sb.append(str2);
        sb.append(", onlineState=");
        sb.append(contactOnlineStatus);
        sb.append(", pictureUrl=");
        return e41.l(sb, str3, ")");
    }

    public /* synthetic */ LocalRecentConnectionsItem(String str, RecentConnectionsItemType recentConnectionsItemType, String str2, ContactOnlineStatus contactOnlineStatus, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, recentConnectionsItemType, str2, (i & 8) != 0 ? null : contactOnlineStatus, (i & 16) != 0 ? null : str3);
    }
}
