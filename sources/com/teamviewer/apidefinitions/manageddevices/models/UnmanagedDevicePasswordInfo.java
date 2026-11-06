package com.teamviewer.apidefinitions.manageddevices.models;

import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/UnmanagedDevicePasswordInfo;", "", "bookmarkId", "Ljava/util/UUID;", "groupIds", "", "<init>", "(Ljava/util/UUID;Ljava/util/List;)V", "getBookmarkId", "()Ljava/util/UUID;", "getGroupIds", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UnmanagedDevicePasswordInfo {
    private final UUID bookmarkId;
    private final List<UUID> groupIds;

    public UnmanagedDevicePasswordInfo(@sp3(name = "bookmarkId") UUID uuid, @sp3(name = "groupIds") List<UUID> list) {
        uuid.getClass();
        list.getClass();
        this.bookmarkId = uuid;
        this.groupIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnmanagedDevicePasswordInfo copy$default(UnmanagedDevicePasswordInfo unmanagedDevicePasswordInfo, UUID uuid, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = unmanagedDevicePasswordInfo.bookmarkId;
        }
        if ((i & 2) != 0) {
            list = unmanagedDevicePasswordInfo.groupIds;
        }
        return unmanagedDevicePasswordInfo.copy(uuid, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getBookmarkId() {
        return this.bookmarkId;
    }

    public final List<UUID> component2() {
        return this.groupIds;
    }

    public final UnmanagedDevicePasswordInfo copy(@sp3(name = "bookmarkId") UUID bookmarkId, @sp3(name = "groupIds") List<UUID> groupIds) {
        bookmarkId.getClass();
        groupIds.getClass();
        return new UnmanagedDevicePasswordInfo(bookmarkId, groupIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnmanagedDevicePasswordInfo)) {
            return false;
        }
        UnmanagedDevicePasswordInfo unmanagedDevicePasswordInfo = (UnmanagedDevicePasswordInfo) other;
        return im3.n(this.bookmarkId, unmanagedDevicePasswordInfo.bookmarkId) && im3.n(this.groupIds, unmanagedDevicePasswordInfo.groupIds);
    }

    public final UUID getBookmarkId() {
        return this.bookmarkId;
    }

    public final List<UUID> getGroupIds() {
        return this.groupIds;
    }

    public int hashCode() {
        return this.groupIds.hashCode() + (this.bookmarkId.hashCode() * 31);
    }

    public String toString() {
        return "UnmanagedDevicePasswordInfo(bookmarkId=" + this.bookmarkId + ", groupIds=" + this.groupIds + ")";
    }
}
