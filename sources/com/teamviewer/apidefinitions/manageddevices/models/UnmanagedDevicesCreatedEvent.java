package com.teamviewer.apidefinitions.manageddevices.models;

import java.util.List;
import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/UnmanagedDevicesCreatedEvent;", "Lcom/teamviewer/apidefinitions/manageddevices/models/TeamViewerEvent;", "eventType", "", "unmanagedDevices", "", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceListEntry;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getEventType", "()Ljava/lang/String;", "getUnmanagedDevices", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UnmanagedDevicesCreatedEvent implements TeamViewerEvent {
    private final String eventType;
    private final List<DeviceListEntry> unmanagedDevices;

    public UnmanagedDevicesCreatedEvent(@sp3(name = "eventType") String str, @sp3(name = "unmanagedDevices") List<DeviceListEntry> list) {
        str.getClass();
        list.getClass();
        this.eventType = str;
        this.unmanagedDevices = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnmanagedDevicesCreatedEvent copy$default(UnmanagedDevicesCreatedEvent unmanagedDevicesCreatedEvent, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unmanagedDevicesCreatedEvent.eventType;
        }
        if ((i & 2) != 0) {
            list = unmanagedDevicesCreatedEvent.unmanagedDevices;
        }
        return unmanagedDevicesCreatedEvent.copy(str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    public final List<DeviceListEntry> component2() {
        return this.unmanagedDevices;
    }

    public final UnmanagedDevicesCreatedEvent copy(@sp3(name = "eventType") String eventType, @sp3(name = "unmanagedDevices") List<DeviceListEntry> unmanagedDevices) {
        eventType.getClass();
        unmanagedDevices.getClass();
        return new UnmanagedDevicesCreatedEvent(eventType, unmanagedDevices);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnmanagedDevicesCreatedEvent)) {
            return false;
        }
        UnmanagedDevicesCreatedEvent unmanagedDevicesCreatedEvent = (UnmanagedDevicesCreatedEvent) other;
        return im3.n(this.eventType, unmanagedDevicesCreatedEvent.eventType) && im3.n(this.unmanagedDevices, unmanagedDevicesCreatedEvent.unmanagedDevices);
    }

    @Override // com.teamviewer.apidefinitions.manageddevices.models.TeamViewerEvent
    public String getEventType() {
        return this.eventType;
    }

    public final List<DeviceListEntry> getUnmanagedDevices() {
        return this.unmanagedDevices;
    }

    public int hashCode() {
        return this.unmanagedDevices.hashCode() + (this.eventType.hashCode() * 31);
    }

    public String toString() {
        return "UnmanagedDevicesCreatedEvent(eventType=" + this.eventType + ", unmanagedDevices=" + this.unmanagedDevices + ")";
    }
}
