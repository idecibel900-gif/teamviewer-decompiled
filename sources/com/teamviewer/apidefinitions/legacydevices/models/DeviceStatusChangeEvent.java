package com.teamviewer.apidefinitions.legacydevices.models;

import kotlin.Metadata;
import o.fx3;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceStatusChangeEvent;", "Lcom/teamviewer/apidefinitions/legacydevices/models/TeamViewerEvent;", "eventType", "", "deviceId", "", "onlineStatus", "Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceOnlineStatus;", "<init>", "(Ljava/lang/String;ILcom/teamviewer/apidefinitions/legacydevices/models/DeviceOnlineStatus;)V", "getEventType", "()Ljava/lang/String;", "getDeviceId", "()I", "getOnlineStatus", "()Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceOnlineStatus;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceStatusChangeEvent implements TeamViewerEvent {
    private final int deviceId;
    private final String eventType;
    private final DeviceOnlineStatus onlineStatus;

    public DeviceStatusChangeEvent(@sp3(name = "eventType") String str, @sp3(name = "deviceId") int i, @sp3(name = "onlineStatus") DeviceOnlineStatus deviceOnlineStatus) {
        str.getClass();
        deviceOnlineStatus.getClass();
        this.eventType = str;
        this.deviceId = i;
        this.onlineStatus = deviceOnlineStatus;
    }

    public static /* synthetic */ DeviceStatusChangeEvent copy$default(DeviceStatusChangeEvent deviceStatusChangeEvent, String str, int i, DeviceOnlineStatus deviceOnlineStatus, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = deviceStatusChangeEvent.eventType;
        }
        if ((i2 & 2) != 0) {
            i = deviceStatusChangeEvent.deviceId;
        }
        if ((i2 & 4) != 0) {
            deviceOnlineStatus = deviceStatusChangeEvent.onlineStatus;
        }
        return deviceStatusChangeEvent.copy(str, i, deviceOnlineStatus);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DeviceOnlineStatus getOnlineStatus() {
        return this.onlineStatus;
    }

    public final DeviceStatusChangeEvent copy(@sp3(name = "eventType") String eventType, @sp3(name = "deviceId") int deviceId, @sp3(name = "onlineStatus") DeviceOnlineStatus onlineStatus) {
        eventType.getClass();
        onlineStatus.getClass();
        return new DeviceStatusChangeEvent(eventType, deviceId, onlineStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceStatusChangeEvent)) {
            return false;
        }
        DeviceStatusChangeEvent deviceStatusChangeEvent = (DeviceStatusChangeEvent) other;
        return im3.n(this.eventType, deviceStatusChangeEvent.eventType) && this.deviceId == deviceStatusChangeEvent.deviceId && this.onlineStatus == deviceStatusChangeEvent.onlineStatus;
    }

    public final int getDeviceId() {
        return this.deviceId;
    }

    @Override // com.teamviewer.apidefinitions.legacydevices.models.TeamViewerEvent
    public String getEventType() {
        return this.eventType;
    }

    public final DeviceOnlineStatus getOnlineStatus() {
        return this.onlineStatus;
    }

    public int hashCode() {
        return this.onlineStatus.hashCode() + fx3.a(this.deviceId, this.eventType.hashCode() * 31, 31);
    }

    public String toString() {
        return "DeviceStatusChangeEvent(eventType=" + this.eventType + ", deviceId=" + this.deviceId + ", onlineStatus=" + this.onlineStatus + ")";
    }
}
