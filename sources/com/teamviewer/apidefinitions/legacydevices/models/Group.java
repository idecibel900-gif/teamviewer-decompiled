package com.teamviewer.apidefinitions.legacydevices.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003J=\u0010\u001d\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lcom/teamviewer/apidefinitions/legacydevices/models/Group;", "", "groupId", "", "name", "", "shareStatus", "Lcom/teamviewer/apidefinitions/legacydevices/models/GroupShareStatus;", "shareRight", "Lcom/teamviewer/apidefinitions/legacydevices/models/GroupShareRight;", "owner", "Lcom/teamviewer/apidefinitions/legacydevices/models/GroupOwner;", "<init>", "(ILjava/lang/String;Lcom/teamviewer/apidefinitions/legacydevices/models/GroupShareStatus;Lcom/teamviewer/apidefinitions/legacydevices/models/GroupShareRight;Lcom/teamviewer/apidefinitions/legacydevices/models/GroupOwner;)V", "getGroupId", "()I", "getName", "()Ljava/lang/String;", "getShareStatus", "()Lcom/teamviewer/apidefinitions/legacydevices/models/GroupShareStatus;", "getShareRight", "()Lcom/teamviewer/apidefinitions/legacydevices/models/GroupShareRight;", "getOwner", "()Lcom/teamviewer/apidefinitions/legacydevices/models/GroupOwner;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Group {
    private final int groupId;
    private final String name;
    private final GroupOwner owner;
    private final GroupShareRight shareRight;
    private final GroupShareStatus shareStatus;

    public Group(@sp3(name = "groupId") int i, @sp3(name = "name") String str, @sp3(name = "shareStatus") GroupShareStatus groupShareStatus, @sp3(name = "shareRight") GroupShareRight groupShareRight, @sp3(name = "owner") GroupOwner groupOwner) {
        str.getClass();
        groupShareStatus.getClass();
        groupShareRight.getClass();
        this.groupId = i;
        this.name = str;
        this.shareStatus = groupShareStatus;
        this.shareRight = groupShareRight;
        this.owner = groupOwner;
    }

    public static /* synthetic */ Group copy$default(Group group, int i, String str, GroupShareStatus groupShareStatus, GroupShareRight groupShareRight, GroupOwner groupOwner, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = group.groupId;
        }
        if ((i2 & 2) != 0) {
            str = group.name;
        }
        if ((i2 & 4) != 0) {
            groupShareStatus = group.shareStatus;
        }
        if ((i2 & 8) != 0) {
            groupShareRight = group.shareRight;
        }
        if ((i2 & 16) != 0) {
            groupOwner = group.owner;
        }
        GroupOwner groupOwner2 = groupOwner;
        GroupShareStatus groupShareStatus2 = groupShareStatus;
        return group.copy(i, str, groupShareStatus2, groupShareRight, groupOwner2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getGroupId() {
        return this.groupId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final GroupShareStatus getShareStatus() {
        return this.shareStatus;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final GroupShareRight getShareRight() {
        return this.shareRight;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final GroupOwner getOwner() {
        return this.owner;
    }

    public final Group copy(@sp3(name = "groupId") int groupId, @sp3(name = "name") String name, @sp3(name = "shareStatus") GroupShareStatus shareStatus, @sp3(name = "shareRight") GroupShareRight shareRight, @sp3(name = "owner") GroupOwner owner) {
        name.getClass();
        shareStatus.getClass();
        shareRight.getClass();
        return new Group(groupId, name, shareStatus, shareRight, owner);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Group)) {
            return false;
        }
        Group group = (Group) other;
        return this.groupId == group.groupId && im3.n(this.name, group.name) && this.shareStatus == group.shareStatus && this.shareRight == group.shareRight && im3.n(this.owner, group.owner);
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
        int iHashCode = (this.shareRight.hashCode() + ((this.shareStatus.hashCode() + to7.e(Integer.hashCode(this.groupId) * 31, 31, this.name)) * 31)) * 31;
        GroupOwner groupOwner = this.owner;
        return iHashCode + (groupOwner == null ? 0 : groupOwner.hashCode());
    }

    public String toString() {
        return "Group(groupId=" + this.groupId + ", name=" + this.name + ", shareStatus=" + this.shareStatus + ", shareRight=" + this.shareRight + ", owner=" + this.owner + ")";
    }

    public /* synthetic */ Group(int i, String str, GroupShareStatus groupShareStatus, GroupShareRight groupShareRight, GroupOwner groupOwner, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, groupShareStatus, groupShareRight, (i2 & 16) != 0 ? null : groupOwner);
    }
}
