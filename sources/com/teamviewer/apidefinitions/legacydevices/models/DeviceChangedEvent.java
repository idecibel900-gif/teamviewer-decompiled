package com.teamviewer.apidefinitions.legacydevices.models;

import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceChangedEvent;", "Lcom/teamviewer/apidefinitions/legacydevices/models/TeamViewerEvent;", "eventType", "", "device", "Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceDelta;", "<init>", "(Ljava/lang/String;Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceDelta;)V", "getEventType", "()Ljava/lang/String;", "getDevice", "()Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceDelta;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceChangedEvent implements TeamViewerEvent {
    private final DeviceDelta device;
    private final String eventType;

    public DeviceChangedEvent(@sp3(name = "eventType") String str, @sp3(name = "device") DeviceDelta deviceDelta) {
        str.getClass();
        deviceDelta.getClass();
        this.eventType = str;
        this.device = deviceDelta;
    }

    public static /* synthetic */ DeviceChangedEvent copy$default(DeviceChangedEvent deviceChangedEvent, String str, DeviceDelta deviceDelta, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceChangedEvent.eventType;
        }
        if ((i & 2) != 0) {
            deviceDelta = deviceChangedEvent.device;
        }
        return deviceChangedEvent.copy(str, deviceDelta);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DeviceDelta getDevice() {
        return this.device;
    }

    public final DeviceChangedEvent copy(@sp3(name = "eventType") String eventType, @sp3(name = "device") DeviceDelta device) {
        eventType.getClass();
        device.getClass();
        return new DeviceChangedEvent(eventType, device);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceChangedEvent)) {
            return false;
        }
        DeviceChangedEvent deviceChangedEvent = (DeviceChangedEvent) other;
        return im3.n(this.eventType, deviceChangedEvent.eventType) && im3.n(this.device, deviceChangedEvent.device);
    }

    public final DeviceDelta getDevice() {
        return this.device;
    }

    @Override // com.teamviewer.apidefinitions.legacydevices.models.TeamViewerEvent
    public String getEventType() {
        return this.eventType;
    }

    public int hashCode() {
        return this.device.hashCode() + (this.eventType.hashCode() * 31);
    }

    public String toString() {
        return "DeviceChangedEvent(eventType=" + this.eventType + ", device=" + this.device + ")";
    }
}
