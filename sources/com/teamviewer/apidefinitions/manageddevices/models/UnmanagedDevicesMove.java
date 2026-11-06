package com.teamviewer.apidefinitions.manageddevices.models;

import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/UnmanagedDevicesMove;", "", "deviceIds", "", "Ljava/util/UUID;", "targetGroupIds", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getDeviceIds", "()Ljava/util/List;", "getTargetGroupIds", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UnmanagedDevicesMove {
    private final List<UUID> deviceIds;
    private final List<UUID> targetGroupIds;

    public UnmanagedDevicesMove(@sp3(name = "deviceIds") List<UUID> list, @sp3(name = "targetGroupIds") List<UUID> list2) {
        list.getClass();
        list2.getClass();
        this.deviceIds = list;
        this.targetGroupIds = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnmanagedDevicesMove copy$default(UnmanagedDevicesMove unmanagedDevicesMove, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = unmanagedDevicesMove.deviceIds;
        }
        if ((i & 2) != 0) {
            list2 = unmanagedDevicesMove.targetGroupIds;
        }
        return unmanagedDevicesMove.copy(list, list2);
    }

    public final List<UUID> component1() {
        return this.deviceIds;
    }

    public final List<UUID> component2() {
        return this.targetGroupIds;
    }

    public final UnmanagedDevicesMove copy(@sp3(name = "deviceIds") List<UUID> deviceIds, @sp3(name = "targetGroupIds") List<UUID> targetGroupIds) {
        deviceIds.getClass();
        targetGroupIds.getClass();
        return new UnmanagedDevicesMove(deviceIds, targetGroupIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnmanagedDevicesMove)) {
            return false;
        }
        UnmanagedDevicesMove unmanagedDevicesMove = (UnmanagedDevicesMove) other;
        return im3.n(this.deviceIds, unmanagedDevicesMove.deviceIds) && im3.n(this.targetGroupIds, unmanagedDevicesMove.targetGroupIds);
    }

    public final List<UUID> getDeviceIds() {
        return this.deviceIds;
    }

    public final List<UUID> getTargetGroupIds() {
        return this.targetGroupIds;
    }

    public int hashCode() {
        return this.targetGroupIds.hashCode() + (this.deviceIds.hashCode() * 31);
    }

    public String toString() {
        return "UnmanagedDevicesMove(deviceIds=" + this.deviceIds + ", targetGroupIds=" + this.targetGroupIds + ")";
    }
}
