package com.teamviewer.apidefinitions.manageddevices.models;

import java.util.List;
import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/UnmanagedDevicesPasswordInfoChangedEvent;", "Lcom/teamviewer/apidefinitions/manageddevices/models/TeamViewerEvent;", "eventType", "", "operation", "Lcom/teamviewer/apidefinitions/manageddevices/models/UnmanagedDevicesPasswordsOperationType;", "affectedBookmarks", "", "Lcom/teamviewer/apidefinitions/manageddevices/models/UnmanagedDevicePasswordInfo;", "<init>", "(Ljava/lang/String;Lcom/teamviewer/apidefinitions/manageddevices/models/UnmanagedDevicesPasswordsOperationType;Ljava/util/List;)V", "getEventType", "()Ljava/lang/String;", "getOperation", "()Lcom/teamviewer/apidefinitions/manageddevices/models/UnmanagedDevicesPasswordsOperationType;", "getAffectedBookmarks", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UnmanagedDevicesPasswordInfoChangedEvent implements TeamViewerEvent {
    private final List<UnmanagedDevicePasswordInfo> affectedBookmarks;
    private final String eventType;
    private final UnmanagedDevicesPasswordsOperationType operation;

    public UnmanagedDevicesPasswordInfoChangedEvent(@sp3(name = "eventType") String str, @sp3(name = "operation") UnmanagedDevicesPasswordsOperationType unmanagedDevicesPasswordsOperationType, @sp3(name = "affectedBookmarks") List<UnmanagedDevicePasswordInfo> list) {
        str.getClass();
        unmanagedDevicesPasswordsOperationType.getClass();
        list.getClass();
        this.eventType = str;
        this.operation = unmanagedDevicesPasswordsOperationType;
        this.affectedBookmarks = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnmanagedDevicesPasswordInfoChangedEvent copy$default(UnmanagedDevicesPasswordInfoChangedEvent unmanagedDevicesPasswordInfoChangedEvent, String str, UnmanagedDevicesPasswordsOperationType unmanagedDevicesPasswordsOperationType, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unmanagedDevicesPasswordInfoChangedEvent.eventType;
        }
        if ((i & 2) != 0) {
            unmanagedDevicesPasswordsOperationType = unmanagedDevicesPasswordInfoChangedEvent.operation;
        }
        if ((i & 4) != 0) {
            list = unmanagedDevicesPasswordInfoChangedEvent.affectedBookmarks;
        }
        return unmanagedDevicesPasswordInfoChangedEvent.copy(str, unmanagedDevicesPasswordsOperationType, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UnmanagedDevicesPasswordsOperationType getOperation() {
        return this.operation;
    }

    public final List<UnmanagedDevicePasswordInfo> component3() {
        return this.affectedBookmarks;
    }

    public final UnmanagedDevicesPasswordInfoChangedEvent copy(@sp3(name = "eventType") String eventType, @sp3(name = "operation") UnmanagedDevicesPasswordsOperationType operation, @sp3(name = "affectedBookmarks") List<UnmanagedDevicePasswordInfo> affectedBookmarks) {
        eventType.getClass();
        operation.getClass();
        affectedBookmarks.getClass();
        return new UnmanagedDevicesPasswordInfoChangedEvent(eventType, operation, affectedBookmarks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnmanagedDevicesPasswordInfoChangedEvent)) {
            return false;
        }
        UnmanagedDevicesPasswordInfoChangedEvent unmanagedDevicesPasswordInfoChangedEvent = (UnmanagedDevicesPasswordInfoChangedEvent) other;
        return im3.n(this.eventType, unmanagedDevicesPasswordInfoChangedEvent.eventType) && this.operation == unmanagedDevicesPasswordInfoChangedEvent.operation && im3.n(this.affectedBookmarks, unmanagedDevicesPasswordInfoChangedEvent.affectedBookmarks);
    }

    public final List<UnmanagedDevicePasswordInfo> getAffectedBookmarks() {
        return this.affectedBookmarks;
    }

    @Override // com.teamviewer.apidefinitions.manageddevices.models.TeamViewerEvent
    public String getEventType() {
        return this.eventType;
    }

    public final UnmanagedDevicesPasswordsOperationType getOperation() {
        return this.operation;
    }

    public int hashCode() {
        return this.affectedBookmarks.hashCode() + ((this.operation.hashCode() + (this.eventType.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "UnmanagedDevicesPasswordInfoChangedEvent(eventType=" + this.eventType + ", operation=" + this.operation + ", affectedBookmarks=" + this.affectedBookmarks + ")";
    }
}
