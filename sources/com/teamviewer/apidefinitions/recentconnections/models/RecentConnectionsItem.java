package com.teamviewer.apidefinitions.recentconnections.models;

import java.time.OffsetDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.fx3;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010.\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010%J\u000b\u00102\u001a\u0004\u0018\u00010\u0012HÆ\u0003J~\u00103\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u00104J\u0013\u00105\u001a\u00020\u00072\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\n\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006:"}, d2 = {"Lcom/teamviewer/apidefinitions/recentconnections/models/RecentConnectionsItem;", "", "displayName", "", "itemType", "Lcom/teamviewer/apidefinitions/recentconnections/models/RecentConnectionsItemType;", "canBeAddedToPartnerList", "", "connectId", "", "isMyself", "lastConnectionDate", "Ljava/time/OffsetDateTime;", "onlineState", "Lcom/teamviewer/apidefinitions/recentconnections/models/ContactOnlineStatus;", "pictureUrl", "buddyId", "ownership", "Lcom/teamviewer/apidefinitions/recentconnections/models/RecentConnectionsItemOwnership;", "<init>", "(Ljava/lang/String;Lcom/teamviewer/apidefinitions/recentconnections/models/RecentConnectionsItemType;ZJLjava/lang/Boolean;Ljava/time/OffsetDateTime;Lcom/teamviewer/apidefinitions/recentconnections/models/ContactOnlineStatus;Ljava/lang/String;Ljava/lang/Long;Lcom/teamviewer/apidefinitions/recentconnections/models/RecentConnectionsItemOwnership;)V", "getDisplayName", "()Ljava/lang/String;", "getItemType", "()Lcom/teamviewer/apidefinitions/recentconnections/models/RecentConnectionsItemType;", "getCanBeAddedToPartnerList", "()Z", "getConnectId", "()J", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLastConnectionDate", "()Ljava/time/OffsetDateTime;", "getOnlineState", "()Lcom/teamviewer/apidefinitions/recentconnections/models/ContactOnlineStatus;", "getPictureUrl", "getBuddyId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getOwnership", "()Lcom/teamviewer/apidefinitions/recentconnections/models/RecentConnectionsItemOwnership;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Lcom/teamviewer/apidefinitions/recentconnections/models/RecentConnectionsItemType;ZJLjava/lang/Boolean;Ljava/time/OffsetDateTime;Lcom/teamviewer/apidefinitions/recentconnections/models/ContactOnlineStatus;Ljava/lang/String;Ljava/lang/Long;Lcom/teamviewer/apidefinitions/recentconnections/models/RecentConnectionsItemOwnership;)Lcom/teamviewer/apidefinitions/recentconnections/models/RecentConnectionsItem;", "equals", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RecentConnectionsItem {
    private final Long buddyId;
    private final boolean canBeAddedToPartnerList;
    private final long connectId;
    private final String displayName;
    private final Boolean isMyself;
    private final RecentConnectionsItemType itemType;
    private final OffsetDateTime lastConnectionDate;
    private final ContactOnlineStatus onlineState;
    private final RecentConnectionsItemOwnership ownership;
    private final String pictureUrl;

    public /* synthetic */ RecentConnectionsItem(String str, RecentConnectionsItemType recentConnectionsItemType, boolean z, long j, Boolean bool, OffsetDateTime offsetDateTime, ContactOnlineStatus contactOnlineStatus, String str2, Long l, RecentConnectionsItemOwnership recentConnectionsItemOwnership, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, recentConnectionsItemType, z, j, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : offsetDateTime, (i & 64) != 0 ? null : contactOnlineStatus, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? null : l, (i & 512) != 0 ? null : recentConnectionsItemOwnership);
    }

    public static /* synthetic */ RecentConnectionsItem copy$default(RecentConnectionsItem recentConnectionsItem, String str, RecentConnectionsItemType recentConnectionsItemType, boolean z, long j, Boolean bool, OffsetDateTime offsetDateTime, ContactOnlineStatus contactOnlineStatus, String str2, Long l, RecentConnectionsItemOwnership recentConnectionsItemOwnership, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recentConnectionsItem.displayName;
        }
        if ((i & 2) != 0) {
            recentConnectionsItemType = recentConnectionsItem.itemType;
        }
        if ((i & 4) != 0) {
            z = recentConnectionsItem.canBeAddedToPartnerList;
        }
        if ((i & 8) != 0) {
            j = recentConnectionsItem.connectId;
        }
        if ((i & 16) != 0) {
            bool = recentConnectionsItem.isMyself;
        }
        if ((i & 32) != 0) {
            offsetDateTime = recentConnectionsItem.lastConnectionDate;
        }
        if ((i & 64) != 0) {
            contactOnlineStatus = recentConnectionsItem.onlineState;
        }
        if ((i & 128) != 0) {
            str2 = recentConnectionsItem.pictureUrl;
        }
        if ((i & 256) != 0) {
            l = recentConnectionsItem.buddyId;
        }
        if ((i & 512) != 0) {
            recentConnectionsItemOwnership = recentConnectionsItem.ownership;
        }
        Long l2 = l;
        RecentConnectionsItemOwnership recentConnectionsItemOwnership2 = recentConnectionsItemOwnership;
        long j2 = j;
        boolean z2 = z;
        return recentConnectionsItem.copy(str, recentConnectionsItemType, z2, j2, bool, offsetDateTime, contactOnlineStatus, str2, l2, recentConnectionsItemOwnership2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final RecentConnectionsItemOwnership getOwnership() {
        return this.ownership;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RecentConnectionsItemType getItemType() {
        return this.itemType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getCanBeAddedToPartnerList() {
        return this.canBeAddedToPartnerList;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getConnectId() {
        return this.connectId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getIsMyself() {
        return this.isMyself;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final OffsetDateTime getLastConnectionDate() {
        return this.lastConnectionDate;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ContactOnlineStatus getOnlineState() {
        return this.onlineState;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPictureUrl() {
        return this.pictureUrl;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getBuddyId() {
        return this.buddyId;
    }

    public final RecentConnectionsItem copy(@sp3(name = "displayName") String displayName, @sp3(name = "itemType") RecentConnectionsItemType itemType, @sp3(name = "canBeAddedToPartnerList") boolean canBeAddedToPartnerList, @sp3(name = "connectId") long connectId, @sp3(name = "isMyself") Boolean isMyself, @sp3(name = "lastConnectionDate") OffsetDateTime lastConnectionDate, @sp3(name = "onlineState") ContactOnlineStatus onlineState, @sp3(name = "pictureUrl") String pictureUrl, @sp3(name = "buddyId") Long buddyId, @sp3(name = "ownership") RecentConnectionsItemOwnership ownership) {
        displayName.getClass();
        itemType.getClass();
        return new RecentConnectionsItem(displayName, itemType, canBeAddedToPartnerList, connectId, isMyself, lastConnectionDate, onlineState, pictureUrl, buddyId, ownership);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecentConnectionsItem)) {
            return false;
        }
        RecentConnectionsItem recentConnectionsItem = (RecentConnectionsItem) other;
        return im3.n(this.displayName, recentConnectionsItem.displayName) && this.itemType == recentConnectionsItem.itemType && this.canBeAddedToPartnerList == recentConnectionsItem.canBeAddedToPartnerList && this.connectId == recentConnectionsItem.connectId && im3.n(this.isMyself, recentConnectionsItem.isMyself) && im3.n(this.lastConnectionDate, recentConnectionsItem.lastConnectionDate) && this.onlineState == recentConnectionsItem.onlineState && im3.n(this.pictureUrl, recentConnectionsItem.pictureUrl) && im3.n(this.buddyId, recentConnectionsItem.buddyId) && this.ownership == recentConnectionsItem.ownership;
    }

    public final Long getBuddyId() {
        return this.buddyId;
    }

    public final boolean getCanBeAddedToPartnerList() {
        return this.canBeAddedToPartnerList;
    }

    public final long getConnectId() {
        return this.connectId;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final RecentConnectionsItemType getItemType() {
        return this.itemType;
    }

    public final OffsetDateTime getLastConnectionDate() {
        return this.lastConnectionDate;
    }

    public final ContactOnlineStatus getOnlineState() {
        return this.onlineState;
    }

    public final RecentConnectionsItemOwnership getOwnership() {
        return this.ownership;
    }

    public final String getPictureUrl() {
        return this.pictureUrl;
    }

    public int hashCode() {
        int iC = fx3.c(to7.f((this.itemType.hashCode() + (this.displayName.hashCode() * 31)) * 31, 31, this.canBeAddedToPartnerList), 31, this.connectId);
        Boolean bool = this.isMyself;
        int iHashCode = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        OffsetDateTime offsetDateTime = this.lastConnectionDate;
        int iHashCode2 = (iHashCode + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        ContactOnlineStatus contactOnlineStatus = this.onlineState;
        int iHashCode3 = (iHashCode2 + (contactOnlineStatus == null ? 0 : contactOnlineStatus.hashCode())) * 31;
        String str = this.pictureUrl;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.buddyId;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        RecentConnectionsItemOwnership recentConnectionsItemOwnership = this.ownership;
        return iHashCode5 + (recentConnectionsItemOwnership != null ? recentConnectionsItemOwnership.hashCode() : 0);
    }

    public final Boolean isMyself() {
        return this.isMyself;
    }

    public String toString() {
        return "RecentConnectionsItem(displayName=" + this.displayName + ", itemType=" + this.itemType + ", canBeAddedToPartnerList=" + this.canBeAddedToPartnerList + ", connectId=" + this.connectId + ", isMyself=" + this.isMyself + ", lastConnectionDate=" + this.lastConnectionDate + ", onlineState=" + this.onlineState + ", pictureUrl=" + this.pictureUrl + ", buddyId=" + this.buddyId + ", ownership=" + this.ownership + ")";
    }

    public RecentConnectionsItem(@sp3(name = "displayName") String str, @sp3(name = "itemType") RecentConnectionsItemType recentConnectionsItemType, @sp3(name = "canBeAddedToPartnerList") boolean z, @sp3(name = "connectId") long j, @sp3(name = "isMyself") Boolean bool, @sp3(name = "lastConnectionDate") OffsetDateTime offsetDateTime, @sp3(name = "onlineState") ContactOnlineStatus contactOnlineStatus, @sp3(name = "pictureUrl") String str2, @sp3(name = "buddyId") Long l, @sp3(name = "ownership") RecentConnectionsItemOwnership recentConnectionsItemOwnership) {
        str.getClass();
        recentConnectionsItemType.getClass();
        this.displayName = str;
        this.itemType = recentConnectionsItemType;
        this.canBeAddedToPartnerList = z;
        this.connectId = j;
        this.isMyself = bool;
        this.lastConnectionDate = offsetDateTime;
        this.onlineState = contactOnlineStatus;
        this.pictureUrl = str2;
        this.buddyId = l;
        this.ownership = recentConnectionsItemOwnership;
    }
}
