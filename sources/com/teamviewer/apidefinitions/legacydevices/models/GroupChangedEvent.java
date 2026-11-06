package com.teamviewer.apidefinitions.legacydevices.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.fx3;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003JM\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lcom/teamviewer/apidefinitions/legacydevices/models/GroupChangedEvent;", "Lcom/teamviewer/apidefinitions/legacydevices/models/TeamViewerEvent;", "eventType", "", "groupId", "", "name", "owner", "Lcom/teamviewer/apidefinitions/legacydevices/models/GroupOwner;", "shareStatus", "Lcom/teamviewer/apidefinitions/legacydevices/models/GroupShareStatus;", "shareRight", "Lcom/teamviewer/apidefinitions/legacydevices/models/GroupShareRight;", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lcom/teamviewer/apidefinitions/legacydevices/models/GroupOwner;Lcom/teamviewer/apidefinitions/legacydevices/models/GroupShareStatus;Lcom/teamviewer/apidefinitions/legacydevices/models/GroupShareRight;)V", "getEventType", "()Ljava/lang/String;", "getGroupId", "()I", "getName", "getOwner", "()Lcom/teamviewer/apidefinitions/legacydevices/models/GroupOwner;", "getShareStatus", "()Lcom/teamviewer/apidefinitions/legacydevices/models/GroupShareStatus;", "getShareRight", "()Lcom/teamviewer/apidefinitions/legacydevices/models/GroupShareRight;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupChangedEvent implements TeamViewerEvent {
    private final String eventType;
    private final int groupId;
    private final String name;
    private final GroupOwner owner;
    private final GroupShareRight shareRight;
    private final GroupShareStatus shareStatus;

    public /* synthetic */ GroupChangedEvent(String str, int i, String str2, GroupOwner groupOwner, GroupShareStatus groupShareStatus, GroupShareRight groupShareRight, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : groupOwner, (i2 & 16) != 0 ? null : groupShareStatus, (i2 & 32) != 0 ? null : groupShareRight);
    }

    public static /* synthetic */ GroupChangedEvent copy$default(GroupChangedEvent groupChangedEvent, String str, int i, String str2, GroupOwner groupOwner, GroupShareStatus groupShareStatus, GroupShareRight groupShareRight, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = groupChangedEvent.eventType;
        }
        if ((i2 & 2) != 0) {
            i = groupChangedEvent.groupId;
        }
        if ((i2 & 4) != 0) {
            str2 = groupChangedEvent.name;
        }
        if ((i2 & 8) != 0) {
            groupOwner = groupChangedEvent.owner;
        }
        if ((i2 & 16) != 0) {
            groupShareStatus = groupChangedEvent.shareStatus;
        }
        if ((i2 & 32) != 0) {
            groupShareRight = groupChangedEvent.shareRight;
        }
        GroupShareStatus groupShareStatus2 = groupShareStatus;
        GroupShareRight groupShareRight2 = groupShareRight;
        return groupChangedEvent.copy(str, i, str2, groupOwner, groupShareStatus2, groupShareRight2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getGroupId() {
        return this.groupId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final GroupOwner getOwner() {
        return this.owner;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final GroupShareStatus getShareStatus() {
        return this.shareStatus;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final GroupShareRight getShareRight() {
        return this.shareRight;
    }

    public final GroupChangedEvent copy(@sp3(name = "eventType") String eventType, @sp3(name = "groupId") int groupId, @sp3(name = "name") String name, @sp3(name = "owner") GroupOwner owner, @sp3(name = "shareStatus") GroupShareStatus shareStatus, @sp3(name = "shareRight") GroupShareRight shareRight) {
        eventType.getClass();
        return new GroupChangedEvent(eventType, groupId, name, owner, shareStatus, shareRight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupChangedEvent)) {
            return false;
        }
        GroupChangedEvent groupChangedEvent = (GroupChangedEvent) other;
        return im3.n(this.eventType, groupChangedEvent.eventType) && this.groupId == groupChangedEvent.groupId && im3.n(this.name, groupChangedEvent.name) && im3.n(this.owner, groupChangedEvent.owner) && this.shareStatus == groupChangedEvent.shareStatus && this.shareRight == groupChangedEvent.shareRight;
    }

    @Override // com.teamviewer.apidefinitions.legacydevices.models.TeamViewerEvent
    public String getEventType() {
        return this.eventType;
    }

    public final int getGroupId() {
        return this.groupId;
    }

    public final String getName() {
        return this.name;
    }

    public final GroupOwner getOwner() {
        return this.owner;
    }

    public final GroupShareRight getShareRight() {
        return this.shareRight;
    }

    public final GroupShareStatus getShareStatus() {
        return this.shareStatus;
    }

    public int hashCode() {
        int iA = fx3.a(this.groupId, this.eventType.hashCode() * 31, 31);
        String str = this.name;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        GroupOwner groupOwner = this.owner;
        int iHashCode2 = (iHashCode + (groupOwner == null ? 0 : groupOwner.hashCode())) * 31;
        GroupShareStatus groupShareStatus = this.shareStatus;
        int iHashCode3 = (iHashCode2 + (groupShareStatus == null ? 0 : groupShareStatus.hashCode())) * 31;
        GroupShareRight groupShareRight = this.shareRight;
        return iHashCode3 + (groupShareRight != null ? groupShareRight.hashCode() : 0);
    }

    public String toString() {
        return "GroupChangedEvent(eventType=" + this.eventType + ", groupId=" + this.groupId + ", name=" + this.name + ", owner=" + this.owner + ", shareStatus=" + this.shareStatus + ", shareRight=" + this.shareRight + ")";
    }

    public GroupChangedEvent(@sp3(name = "eventType") String str, @sp3(name = "groupId") int i, @sp3(name = "name") String str2, @sp3(name = "owner") GroupOwner groupOwner, @sp3(name = "shareStatus") GroupShareStatus groupShareStatus, @sp3(name = "shareRight") GroupShareRight groupShareRight) {
        str.getClass();
        this.eventType = str;
        this.groupId = i;
        this.name = str2;
        this.owner = groupOwner;
        this.shareStatus = groupShareStatus;
        this.shareRight = groupShareRight;
    }
}
