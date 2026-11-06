package com.teamviewer.apidefinitions.manageddevices.models;

import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/ManagerRelationChangedEvent;", "Lcom/teamviewer/apidefinitions/manageddevices/models/TeamViewerEvent;", "eventType", "", "addedManagerIds", "", "Ljava/util/UUID;", "removedManagerIds", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getEventType", "()Ljava/lang/String;", "getAddedManagerIds", "()Ljava/util/List;", "getRemovedManagerIds", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ManagerRelationChangedEvent implements TeamViewerEvent {
    private final List<UUID> addedManagerIds;
    private final String eventType;
    private final List<UUID> removedManagerIds;

    public ManagerRelationChangedEvent(@sp3(name = "eventType") String str, @sp3(name = "addedManagerIds") List<UUID> list, @sp3(name = "removedManagerIds") List<UUID> list2) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.eventType = str;
        this.addedManagerIds = list;
        this.removedManagerIds = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ManagerRelationChangedEvent copy$default(ManagerRelationChangedEvent managerRelationChangedEvent, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = managerRelationChangedEvent.eventType;
        }
        if ((i & 2) != 0) {
            list = managerRelationChangedEvent.addedManagerIds;
        }
        if ((i & 4) != 0) {
            list2 = managerRelationChangedEvent.removedManagerIds;
        }
        return managerRelationChangedEvent.copy(str, list, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    public final List<UUID> component2() {
        return this.addedManagerIds;
    }

    public final List<UUID> component3() {
        return this.removedManagerIds;
    }

    public final ManagerRelationChangedEvent copy(@sp3(name = "eventType") String eventType, @sp3(name = "addedManagerIds") List<UUID> addedManagerIds, @sp3(name = "removedManagerIds") List<UUID> removedManagerIds) {
        eventType.getClass();
        addedManagerIds.getClass();
        removedManagerIds.getClass();
        return new ManagerRelationChangedEvent(eventType, addedManagerIds, removedManagerIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManagerRelationChangedEvent)) {
            return false;
        }
        ManagerRelationChangedEvent managerRelationChangedEvent = (ManagerRelationChangedEvent) other;
        return im3.n(this.eventType, managerRelationChangedEvent.eventType) && im3.n(this.addedManagerIds, managerRelationChangedEvent.addedManagerIds) && im3.n(this.removedManagerIds, managerRelationChangedEvent.removedManagerIds);
    }

    public final List<UUID> getAddedManagerIds() {
        return this.addedManagerIds;
    }

    @Override // com.teamviewer.apidefinitions.manageddevices.models.TeamViewerEvent
    public String getEventType() {
        return this.eventType;
    }

    public final List<UUID> getRemovedManagerIds() {
        return this.removedManagerIds;
    }

    public int hashCode() {
        return this.removedManagerIds.hashCode() + to7.g(this.addedManagerIds, this.eventType.hashCode() * 31, 31);
    }

    public String toString() {
        return "ManagerRelationChangedEvent(eventType=" + this.eventType + ", addedManagerIds=" + this.addedManagerIds + ", removedManagerIds=" + this.removedManagerIds + ")";
    }
}
