package com.teamviewer.apidefinitions.legacydevices.models;

import java.util.List;
import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/teamviewer/apidefinitions/legacydevices/models/MultipleDevicesAddedEvent;", "Lcom/teamviewer/apidefinitions/legacydevices/models/TeamViewerEvent;", "eventType", "", "devices", "", "Lcom/teamviewer/apidefinitions/legacydevices/models/Device;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getEventType", "()Ljava/lang/String;", "getDevices", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MultipleDevicesAddedEvent implements TeamViewerEvent {
    private final List<Device> devices;
    private final String eventType;

    public MultipleDevicesAddedEvent(@sp3(name = "eventType") String str, @sp3(name = "devices") List<Device> list) {
        str.getClass();
        list.getClass();
        this.eventType = str;
        this.devices = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MultipleDevicesAddedEvent copy$default(MultipleDevicesAddedEvent multipleDevicesAddedEvent, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = multipleDevicesAddedEvent.eventType;
        }
        if ((i & 2) != 0) {
            list = multipleDevicesAddedEvent.devices;
        }
        return multipleDevicesAddedEvent.copy(str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    public final List<Device> component2() {
        return this.devices;
    }

    public final MultipleDevicesAddedEvent copy(@sp3(name = "eventType") String eventType, @sp3(name = "devices") List<Device> devices) {
        eventType.getClass();
        devices.getClass();
        return new MultipleDevicesAddedEvent(eventType, devices);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultipleDevicesAddedEvent)) {
            return false;
        }
        MultipleDevicesAddedEvent multipleDevicesAddedEvent = (MultipleDevicesAddedEvent) other;
        return im3.n(this.eventType, multipleDevicesAddedEvent.eventType) && im3.n(this.devices, multipleDevicesAddedEvent.devices);
    }

    public final List<Device> getDevices() {
        return this.devices;
    }

    @Override // com.teamviewer.apidefinitions.legacydevices.models.TeamViewerEvent
    public String getEventType() {
        return this.eventType;
    }

    public int hashCode() {
        return this.devices.hashCode() + (this.eventType.hashCode() * 31);
    }

    public String toString() {
        return "MultipleDevicesAddedEvent(eventType=" + this.eventType + ", devices=" + this.devices + ")";
    }
}
