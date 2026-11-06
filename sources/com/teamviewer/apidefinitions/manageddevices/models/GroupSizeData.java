package com.teamviewer.apidefinitions.manageddevices.models;

import java.util.UUID;
import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/GroupSizeData;", "", "chainId", "Ljava/util/UUID;", "groupSize", "", "<init>", "(Ljava/util/UUID;I)V", "getChainId", "()Ljava/util/UUID;", "getGroupSize", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupSizeData {
    private final UUID chainId;
    private final int groupSize;

    public GroupSizeData(@sp3(name = "chainId") UUID uuid, @sp3(name = "groupSize") int i) {
        uuid.getClass();
        this.chainId = uuid;
        this.groupSize = i;
    }

    public static /* synthetic */ GroupSizeData copy$default(GroupSizeData groupSizeData, UUID uuid, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            uuid = groupSizeData.chainId;
        }
        if ((i2 & 2) != 0) {
            i = groupSizeData.groupSize;
        }
        return groupSizeData.copy(uuid, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getChainId() {
        return this.chainId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getGroupSize() {
        return this.groupSize;
    }

    public final GroupSizeData copy(@sp3(name = "chainId") UUID chainId, @sp3(name = "groupSize") int groupSize) {
        chainId.getClass();
        return new GroupSizeData(chainId, groupSize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupSizeData)) {
            return false;
        }
        GroupSizeData groupSizeData = (GroupSizeData) other;
        return im3.n(this.chainId, groupSizeData.chainId) && this.groupSize == groupSizeData.groupSize;
    }

    public final UUID getChainId() {
        return this.chainId;
    }

    public final int getGroupSize() {
        return this.groupSize;
    }

    public int hashCode() {
        return Integer.hashCode(this.groupSize) + (this.chainId.hashCode() * 31);
    }

    public String toString() {
        return "GroupSizeData(chainId=" + this.chainId + ", groupSize=" + this.groupSize + ")";
    }
}
