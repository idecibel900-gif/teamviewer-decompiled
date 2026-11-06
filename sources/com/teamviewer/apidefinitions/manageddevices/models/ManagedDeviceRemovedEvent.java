package com.teamviewer.apidefinitions.manageddevices.models;

import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003JL\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006$"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/ManagedDeviceRemovedEvent;", "Lcom/teamviewer/apidefinitions/manageddevices/models/TeamViewerEvent;", "eventType", "", "managementId", "Ljava/util/UUID;", "direct", "", "groupIds", "", "targetManagerId", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/UUID;)V", "getEventType", "()Ljava/lang/String;", "getManagementId", "()Ljava/util/UUID;", "getDirect", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getGroupIds", "()Ljava/util/List;", "getTargetManagerId", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/UUID;)Lcom/teamviewer/apidefinitions/manageddevices/models/ManagedDeviceRemovedEvent;", "equals", "other", "", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ManagedDeviceRemovedEvent implements TeamViewerEvent {
    private final Boolean direct;
    private final String eventType;
    private final List<UUID> groupIds;
    private final UUID managementId;
    private final UUID targetManagerId;

    public ManagedDeviceRemovedEvent(@sp3(name = "eventType") String str, @sp3(name = "managementId") UUID uuid, @sp3(name = "direct") Boolean bool, @sp3(name = "groupIds") List<UUID> list, @sp3(name = "targetManagerId") UUID uuid2) {
        str.getClass();
        uuid.getClass();
        this.eventType = str;
        this.managementId = uuid;
        this.direct = bool;
        this.groupIds = list;
        this.targetManagerId = uuid2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ManagedDeviceRemovedEvent copy$default(ManagedDeviceRemovedEvent managedDeviceRemovedEvent, String str, UUID uuid, Boolean bool, List list, UUID uuid2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = managedDeviceRemovedEvent.eventType;
        }
        if ((i & 2) != 0) {
            uuid = managedDeviceRemovedEvent.managementId;
        }
        if ((i & 4) != 0) {
            bool = managedDeviceRemovedEvent.direct;
        }
        if ((i & 8) != 0) {
            list = managedDeviceRemovedEvent.groupIds;
        }
        if ((i & 16) != 0) {
            uuid2 = managedDeviceRemovedEvent.targetManagerId;
        }
        UUID uuid3 = uuid2;
        Boolean bool2 = bool;
        return managedDeviceRemovedEvent.copy(str, uuid, bool2, list, uuid3);
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
    public final Boolean getDirect() {
        return this.direct;
    }

    public final List<UUID> component4() {
        return this.groupIds;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final UUID getTargetManagerId() {
        return this.targetManagerId;
    }

    public final ManagedDeviceRemovedEvent copy(@sp3(name = "eventType") String eventType, @sp3(name = "managementId") UUID managementId, @sp3(name = "direct") Boolean direct, @sp3(name = "groupIds") List<UUID> groupIds, @sp3(name = "targetManagerId") UUID targetManagerId) {
        eventType.getClass();
        managementId.getClass();
        return new ManagedDeviceRemovedEvent(eventType, managementId, direct, groupIds, targetManagerId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManagedDeviceRemovedEvent)) {
            return false;
        }
        ManagedDeviceRemovedEvent managedDeviceRemovedEvent = (ManagedDeviceRemovedEvent) other;
        return im3.n(this.eventType, managedDeviceRemovedEvent.eventType) && im3.n(this.managementId, managedDeviceRemovedEvent.managementId) && im3.n(this.direct, managedDeviceRemovedEvent.direct) && im3.n(this.groupIds, managedDeviceRemovedEvent.groupIds) && im3.n(this.targetManagerId, managedDeviceRemovedEvent.targetManagerId);
    }

    public final Boolean getDirect() {
        return this.direct;
    }

    @Override // com.teamviewer.apidefinitions.manageddevices.models.TeamViewerEvent
    public String getEventType() {
        return this.eventType;
    }

    public final List<UUID> getGroupIds() {
        return this.groupIds;
    }

    public final UUID getManagementId() {
        return this.managementId;
    }

    public final UUID getTargetManagerId() {
        return this.targetManagerId;
    }

    public int hashCode() {
        int iE = ua5.e(this.managementId, this.eventType.hashCode() * 31, 31);
        Boolean bool = this.direct;
        int iHashCode = (iE + (bool == null ? 0 : bool.hashCode())) * 31;
        List<UUID> list = this.groupIds;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        UUID uuid = this.targetManagerId;
        return iHashCode2 + (uuid != null ? uuid.hashCode() : 0);
    }

    public String toString() {
        return "ManagedDeviceRemovedEvent(eventType=" + this.eventType + ", managementId=" + this.managementId + ", direct=" + this.direct + ", groupIds=" + this.groupIds + ", targetManagerId=" + this.targetManagerId + ")";
    }

    public /* synthetic */ ManagedDeviceRemovedEvent(String str, UUID uuid, Boolean bool, List list, UUID uuid2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, uuid, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : uuid2);
    }
}
