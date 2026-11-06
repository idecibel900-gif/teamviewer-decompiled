package com.teamviewer.apidefinitions.manageddevices.models;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;
import o.to7;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/ManagedGroupAddedEvent;", "Lcom/teamviewer/apidefinitions/manageddevices/models/TeamViewerEvent;", "eventType", "", "groupId", "Ljava/util/UUID;", "displayName", "targetManagerId", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;Ljava/util/UUID;)V", "getEventType", "()Ljava/lang/String;", "getGroupId", "()Ljava/util/UUID;", "getDisplayName", "getTargetManagerId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ManagedGroupAddedEvent implements TeamViewerEvent {
    private final String displayName;
    private final String eventType;
    private final UUID groupId;
    private final UUID targetManagerId;

    public ManagedGroupAddedEvent(@sp3(name = "eventType") String str, @sp3(name = "groupId") UUID uuid, @sp3(name = "displayName") String str2, @sp3(name = "targetManagerId") UUID uuid2) {
        str.getClass();
        uuid.getClass();
        str2.getClass();
        this.eventType = str;
        this.groupId = uuid;
        this.displayName = str2;
        this.targetManagerId = uuid2;
    }

    public static /* synthetic */ ManagedGroupAddedEvent copy$default(ManagedGroupAddedEvent managedGroupAddedEvent, String str, UUID uuid, String str2, UUID uuid2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = managedGroupAddedEvent.eventType;
        }
        if ((i & 2) != 0) {
            uuid = managedGroupAddedEvent.groupId;
        }
        if ((i & 4) != 0) {
            str2 = managedGroupAddedEvent.displayName;
        }
        if ((i & 8) != 0) {
            uuid2 = managedGroupAddedEvent.targetManagerId;
        }
        return managedGroupAddedEvent.copy(str, uuid, str2, uuid2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UUID getGroupId() {
        return this.groupId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final UUID getTargetManagerId() {
        return this.targetManagerId;
    }

    public final ManagedGroupAddedEvent copy(@sp3(name = "eventType") String eventType, @sp3(name = "groupId") UUID groupId, @sp3(name = "displayName") String displayName, @sp3(name = "targetManagerId") UUID targetManagerId) {
        eventType.getClass();
        groupId.getClass();
        displayName.getClass();
        return new ManagedGroupAddedEvent(eventType, groupId, displayName, targetManagerId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManagedGroupAddedEvent)) {
            return false;
        }
        ManagedGroupAddedEvent managedGroupAddedEvent = (ManagedGroupAddedEvent) other;
        return im3.n(this.eventType, managedGroupAddedEvent.eventType) && im3.n(this.groupId, managedGroupAddedEvent.groupId) && im3.n(this.displayName, managedGroupAddedEvent.displayName) && im3.n(this.targetManagerId, managedGroupAddedEvent.targetManagerId);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    @Override // com.teamviewer.apidefinitions.manageddevices.models.TeamViewerEvent
    public String getEventType() {
        return this.eventType;
    }

    public final UUID getGroupId() {
        return this.groupId;
    }

    public final UUID getTargetManagerId() {
        return this.targetManagerId;
    }

    public int hashCode() {
        int iE = to7.e(ua5.e(this.groupId, this.eventType.hashCode() * 31, 31), 31, this.displayName);
        UUID uuid = this.targetManagerId;
        return iE + (uuid == null ? 0 : uuid.hashCode());
    }

    public String toString() {
        return "ManagedGroupAddedEvent(eventType=" + this.eventType + ", groupId=" + this.groupId + ", displayName=" + this.displayName + ", targetManagerId=" + this.targetManagerId + ")";
    }

    public /* synthetic */ ManagedGroupAddedEvent(String str, UUID uuid, String str2, UUID uuid2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, uuid, str2, (i & 8) != 0 ? null : uuid2);
    }
}
