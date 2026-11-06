package com.teamviewer.apidefinitions.manageddevices.models;

import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/UnmanagedDevicesAddedToGroupsEvent;", "Lcom/teamviewer/apidefinitions/manageddevices/models/TeamViewerEvent;", "eventType", "", "unmanagedDevices", "", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceListEntry;", "groupIds", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getEventType", "()Ljava/lang/String;", "getUnmanagedDevices", "()Ljava/util/List;", "getGroupIds", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UnmanagedDevicesAddedToGroupsEvent implements TeamViewerEvent {
    private final String eventType;
    private final List<UUID> groupIds;
    private final List<DeviceListEntry> unmanagedDevices;

    public UnmanagedDevicesAddedToGroupsEvent(@sp3(name = "eventType") String str, @sp3(name = "unmanagedDevices") List<DeviceListEntry> list, @sp3(name = "groupIds") List<UUID> list2) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.eventType = str;
        this.unmanagedDevices = list;
        this.groupIds = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnmanagedDevicesAddedToGroupsEvent copy$default(UnmanagedDevicesAddedToGroupsEvent unmanagedDevicesAddedToGroupsEvent, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unmanagedDevicesAddedToGroupsEvent.eventType;
        }
        if ((i & 2) != 0) {
            list = unmanagedDevicesAddedToGroupsEvent.unmanagedDevices;
        }
        if ((i & 4) != 0) {
            list2 = unmanagedDevicesAddedToGroupsEvent.groupIds;
        }
        return unmanagedDevicesAddedToGroupsEvent.copy(str, list, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    public final List<DeviceListEntry> component2() {
        return this.unmanagedDevices;
    }

    public final List<UUID> component3() {
        return this.groupIds;
    }

    public final UnmanagedDevicesAddedToGroupsEvent copy(@sp3(name = "eventType") String eventType, @sp3(name = "unmanagedDevices") List<DeviceListEntry> unmanagedDevices, @sp3(name = "groupIds") List<UUID> groupIds) {
        eventType.getClass();
        unmanagedDevices.getClass();
        groupIds.getClass();
        return new UnmanagedDevicesAddedToGroupsEvent(eventType, unmanagedDevices, groupIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnmanagedDevicesAddedToGroupsEvent)) {
            return false;
        }
        UnmanagedDevicesAddedToGroupsEvent unmanagedDevicesAddedToGroupsEvent = (UnmanagedDevicesAddedToGroupsEvent) other;
        return im3.n(this.eventType, unmanagedDevicesAddedToGroupsEvent.eventType) && im3.n(this.unmanagedDevices, unmanagedDevicesAddedToGroupsEvent.unmanagedDevices) && im3.n(this.groupIds, unmanagedDevicesAddedToGroupsEvent.groupIds);
    }

    @Override // com.teamviewer.apidefinitions.manageddevices.models.TeamViewerEvent
    public String getEventType() {
        return this.eventType;
    }

    public final List<UUID> getGroupIds() {
        return this.groupIds;
    }

    public final List<DeviceListEntry> getUnmanagedDevices() {
        return this.unmanagedDevices;
    }

    public int hashCode() {
        return this.groupIds.hashCode() + to7.g(this.unmanagedDevices, this.eventType.hashCode() * 31, 31);
    }

    public String toString() {
        return "UnmanagedDevicesAddedToGroupsEvent(eventType=" + this.eventType + ", unmanagedDevices=" + this.unmanagedDevices + ", groupIds=" + this.groupIds + ")";
    }
}
