package com.teamviewer.apidefinitions.manageddevices.models;

import java.time.OffsetDateTime;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.fx3;
import o.im3;
import o.sp3;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003J=\u0010\u001d\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/ManagedDeviceOnlineStateChangedEvent;", "Lcom/teamviewer/apidefinitions/manageddevices/models/TeamViewerEvent;", "eventType", "", "managementId", "Ljava/util/UUID;", "teamViewerId", "", "onlineStatus", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceOnlineStatus;", "lastSeenTimestamp", "Ljava/time/OffsetDateTime;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;JLcom/teamviewer/apidefinitions/manageddevices/models/DeviceOnlineStatus;Ljava/time/OffsetDateTime;)V", "getEventType", "()Ljava/lang/String;", "getManagementId", "()Ljava/util/UUID;", "getTeamViewerId", "()J", "getOnlineStatus", "()Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceOnlineStatus;", "getLastSeenTimestamp", "()Ljava/time/OffsetDateTime;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ManagedDeviceOnlineStateChangedEvent implements TeamViewerEvent {
    private final String eventType;
    private final OffsetDateTime lastSeenTimestamp;
    private final UUID managementId;
    private final DeviceOnlineStatus onlineStatus;
    private final long teamViewerId;

    public ManagedDeviceOnlineStateChangedEvent(@sp3(name = "eventType") String str, @sp3(name = "managementId") UUID uuid, @sp3(name = "teamViewerId") long j, @sp3(name = "onlineStatus") DeviceOnlineStatus deviceOnlineStatus, @sp3(name = "lastSeenTimestamp") OffsetDateTime offsetDateTime) {
        str.getClass();
        uuid.getClass();
        deviceOnlineStatus.getClass();
        this.eventType = str;
        this.managementId = uuid;
        this.teamViewerId = j;
        this.onlineStatus = deviceOnlineStatus;
        this.lastSeenTimestamp = offsetDateTime;
    }

    public static /* synthetic */ ManagedDeviceOnlineStateChangedEvent copy$default(ManagedDeviceOnlineStateChangedEvent managedDeviceOnlineStateChangedEvent, String str, UUID uuid, long j, DeviceOnlineStatus deviceOnlineStatus, OffsetDateTime offsetDateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            str = managedDeviceOnlineStateChangedEvent.eventType;
        }
        if ((i & 2) != 0) {
            uuid = managedDeviceOnlineStateChangedEvent.managementId;
        }
        if ((i & 4) != 0) {
            j = managedDeviceOnlineStateChangedEvent.teamViewerId;
        }
        if ((i & 8) != 0) {
            deviceOnlineStatus = managedDeviceOnlineStateChangedEvent.onlineStatus;
        }
        if ((i & 16) != 0) {
            offsetDateTime = managedDeviceOnlineStateChangedEvent.lastSeenTimestamp;
        }
        long j2 = j;
        return managedDeviceOnlineStateChangedEvent.copy(str, uuid, j2, deviceOnlineStatus, offsetDateTime);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UUID getManagementId() {
        return this.managementId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTeamViewerId() {
        return this.teamViewerId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DeviceOnlineStatus getOnlineStatus() {
        return this.onlineStatus;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OffsetDateTime getLastSeenTimestamp() {
        return this.lastSeenTimestamp;
    }

    public final ManagedDeviceOnlineStateChangedEvent copy(@sp3(name = "eventType") String eventType, @sp3(name = "managementId") UUID managementId, @sp3(name = "teamViewerId") long teamViewerId, @sp3(name = "onlineStatus") DeviceOnlineStatus onlineStatus, @sp3(name = "lastSeenTimestamp") OffsetDateTime lastSeenTimestamp) {
        eventType.getClass();
        managementId.getClass();
        onlineStatus.getClass();
        return new ManagedDeviceOnlineStateChangedEvent(eventType, managementId, teamViewerId, onlineStatus, lastSeenTimestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManagedDeviceOnlineStateChangedEvent)) {
            return false;
        }
        ManagedDeviceOnlineStateChangedEvent managedDeviceOnlineStateChangedEvent = (ManagedDeviceOnlineStateChangedEvent) other;
        return im3.n(this.eventType, managedDeviceOnlineStateChangedEvent.eventType) && im3.n(this.managementId, managedDeviceOnlineStateChangedEvent.managementId) && this.teamViewerId == managedDeviceOnlineStateChangedEvent.teamViewerId && this.onlineStatus == managedDeviceOnlineStateChangedEvent.onlineStatus && im3.n(this.lastSeenTimestamp, managedDeviceOnlineStateChangedEvent.lastSeenTimestamp);
    }

    @Override // com.teamviewer.apidefinitions.manageddevices.models.TeamViewerEvent
    public String getEventType() {
        return this.eventType;
    }

    public final OffsetDateTime getLastSeenTimestamp() {
        return this.lastSeenTimestamp;
    }

    public final UUID getManagementId() {
        return this.managementId;
    }

    public final DeviceOnlineStatus getOnlineStatus() {
        return this.onlineStatus;
    }

    public final long getTeamViewerId() {
        return this.teamViewerId;
    }

    public int hashCode() {
        int iHashCode = (this.onlineStatus.hashCode() + fx3.c(ua5.e(this.managementId, this.eventType.hashCode() * 31, 31), 31, this.teamViewerId)) * 31;
        OffsetDateTime offsetDateTime = this.lastSeenTimestamp;
        return iHashCode + (offsetDateTime == null ? 0 : offsetDateTime.hashCode());
    }

    public String toString() {
        return "ManagedDeviceOnlineStateChangedEvent(eventType=" + this.eventType + ", managementId=" + this.managementId + ", teamViewerId=" + this.teamViewerId + ", onlineStatus=" + this.onlineStatus + ", lastSeenTimestamp=" + this.lastSeenTimestamp + ")";
    }

    public /* synthetic */ ManagedDeviceOnlineStateChangedEvent(String str, UUID uuid, long j, DeviceOnlineStatus deviceOnlineStatus, OffsetDateTime offsetDateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, uuid, j, deviceOnlineStatus, (i & 16) != 0 ? null : offsetDateTime);
    }
}
