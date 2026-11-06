package com.teamviewer.apidefinitions.manageddevices.models;

import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/GroupListEntry;", "", "groupId", "Ljava/util/UUID;", "displayName", "", "managerIds", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/util/List;)V", "getGroupId", "()Ljava/util/UUID;", "getDisplayName", "()Ljava/lang/String;", "getManagerIds", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupListEntry {
    private final String displayName;
    private final UUID groupId;
    private final List<UUID> managerIds;

    public GroupListEntry(@sp3(name = "groupId") UUID uuid, @sp3(name = "displayName") String str, @sp3(name = "managerIds") List<UUID> list) {
        uuid.getClass();
        str.getClass();
        this.groupId = uuid;
        this.displayName = str;
        this.managerIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupListEntry copy$default(GroupListEntry groupListEntry, UUID uuid, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = groupListEntry.groupId;
        }
        if ((i & 2) != 0) {
            str = groupListEntry.displayName;
        }
        if ((i & 4) != 0) {
            list = groupListEntry.managerIds;
        }
        return groupListEntry.copy(uuid, str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getGroupId() {
        return this.groupId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    public final List<UUID> component3() {
        return this.managerIds;
    }

    public final GroupListEntry copy(@sp3(name = "groupId") UUID groupId, @sp3(name = "displayName") String displayName, @sp3(name = "managerIds") List<UUID> managerIds) {
        groupId.getClass();
        displayName.getClass();
        return new GroupListEntry(groupId, displayName, managerIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupListEntry)) {
            return false;
        }
        GroupListEntry groupListEntry = (GroupListEntry) other;
        return im3.n(this.groupId, groupListEntry.groupId) && im3.n(this.displayName, groupListEntry.displayName) && im3.n(this.managerIds, groupListEntry.managerIds);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final UUID getGroupId() {
        return this.groupId;
    }

    public final List<UUID> getManagerIds() {
        return this.managerIds;
    }

    public int hashCode() {
        int iE = to7.e(this.groupId.hashCode() * 31, 31, this.displayName);
        List<UUID> list = this.managerIds;
        return iE + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "GroupListEntry(groupId=" + this.groupId + ", displayName=" + this.displayName + ", managerIds=" + this.managerIds + ")";
    }

    public /* synthetic */ GroupListEntry(UUID uuid, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, str, (i & 4) != 0 ? null : list);
    }
}
