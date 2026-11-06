package com.teamviewer.apidefinitions.manageddevices.models;

import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003JC\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/UnmanagedDevicesMovedEvent;", "Lcom/teamviewer/apidefinitions/manageddevices/models/TeamViewerEvent;", "eventType", "", "unmanagedDevices", "", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceListEntry;", "sourceGroupIds", "Ljava/util/UUID;", "targetGroupIds", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getEventType", "()Ljava/lang/String;", "getUnmanagedDevices", "()Ljava/util/List;", "getSourceGroupIds", "getTargetGroupIds", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UnmanagedDevicesMovedEvent implements TeamViewerEvent {
    private final String eventType;
    private final List<UUID> sourceGroupIds;
    private final List<UUID> targetGroupIds;
    private final List<DeviceListEntry> unmanagedDevices;

    public UnmanagedDevicesMovedEvent(@sp3(name = "eventType") String str, @sp3(name = "unmanagedDevices") List<DeviceListEntry> list, @sp3(name = "sourceGroupIds") List<UUID> list2, @sp3(name = "targetGroupIds") List<UUID> list3) {
        str.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.eventType = str;
        this.unmanagedDevices = list;
        this.sourceGroupIds = list2;
        this.targetGroupIds = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnmanagedDevicesMovedEvent copy$default(UnmanagedDevicesMovedEvent unmanagedDevicesMovedEvent, String str, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unmanagedDevicesMovedEvent.eventType;
        }
        if ((i & 2) != 0) {
            list = unmanagedDevicesMovedEvent.unmanagedDevices;
        }
        if ((i & 4) != 0) {
            list2 = unmanagedDevicesMovedEvent.sourceGroupIds;
        }
        if ((i & 8) != 0) {
            list3 = unmanagedDevicesMovedEvent.targetGroupIds;
        }
        return unmanagedDevicesMovedEvent.copy(str, list, list2, list3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    public final List<DeviceListEntry> component2() {
        return this.unmanagedDevices;
    }

    public final List<UUID> component3() {
        return this.sourceGroupIds;
    }

    public final List<UUID> component4() {
        return this.targetGroupIds;
    }

    public final UnmanagedDevicesMovedEvent copy(@sp3(name = "eventType") String eventType, @sp3(name = "unmanagedDevices") List<DeviceListEntry> unmanagedDevices, @sp3(name = "sourceGroupIds") List<UUID> sourceGroupIds, @sp3(name = "targetGroupIds") List<UUID> targetGroupIds) {
        eventType.getClass();
        unmanagedDevices.getClass();
        sourceGroupIds.getClass();
        targetGroupIds.getClass();
        return new UnmanagedDevicesMovedEvent(eventType, unmanagedDevices, sourceGroupIds, targetGroupIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnmanagedDevicesMovedEvent)) {
            return false;
        }
        UnmanagedDevicesMovedEvent unmanagedDevicesMovedEvent = (UnmanagedDevicesMovedEvent) other;
        return im3.n(this.eventType, unmanagedDevicesMovedEvent.eventType) && im3.n(this.unmanagedDevices, unmanagedDevicesMovedEvent.unmanagedDevices) && im3.n(this.sourceGroupIds, unmanagedDevicesMovedEvent.sourceGroupIds) && im3.n(this.targetGroupIds, unmanagedDevicesMovedEvent.targetGroupIds);
    }

    @Override // com.teamviewer.apidefinitions.manageddevices.models.TeamViewerEvent
    public String getEventType() {
        return this.eventType;
    }

    public final List<UUID> getSourceGroupIds() {
        return this.sourceGroupIds;
    }

    public final List<UUID> getTargetGroupIds() {
        return this.targetGroupIds;
    }

    public final List<DeviceListEntry> getUnmanagedDevices() {
        return this.unmanagedDevices;
    }

    public int hashCode() {
        return this.targetGroupIds.hashCode() + to7.g(this.sourceGroupIds, to7.g(this.unmanagedDevices, this.eventType.hashCode() * 31, 31), 31);
    }

    public String toString() {
        return "UnmanagedDevicesMovedEvent(eventType=" + this.eventType + ", unmanagedDevices=" + this.unmanagedDevices + ", sourceGroupIds=" + this.sourceGroupIds + ", targetGroupIds=" + this.targetGroupIds + ")";
    }
}
