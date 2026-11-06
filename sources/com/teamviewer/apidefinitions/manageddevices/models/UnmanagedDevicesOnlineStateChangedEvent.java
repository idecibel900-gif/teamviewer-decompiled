package com.teamviewer.apidefinitions.manageddevices.models;

import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import o.im3;
import o.sp3;
import o.to7;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0003\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/UnmanagedDevicesOnlineStateChangedEvent;", "Lcom/teamviewer/apidefinitions/manageddevices/models/TeamViewerEvent;", "eventType", "", "bookmarkIds", "", "Ljava/util/UUID;", "isOnline", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Z)V", "getEventType", "()Ljava/lang/String;", "getBookmarkIds", "()Ljava/util/List;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UnmanagedDevicesOnlineStateChangedEvent implements TeamViewerEvent {
    private final List<UUID> bookmarkIds;
    private final String eventType;
    private final boolean isOnline;

    public UnmanagedDevicesOnlineStateChangedEvent(@sp3(name = "eventType") String str, @sp3(name = "bookmarkIds") List<UUID> list, @sp3(name = "isOnline") boolean z) {
        str.getClass();
        list.getClass();
        this.eventType = str;
        this.bookmarkIds = list;
        this.isOnline = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnmanagedDevicesOnlineStateChangedEvent copy$default(UnmanagedDevicesOnlineStateChangedEvent unmanagedDevicesOnlineStateChangedEvent, String str, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unmanagedDevicesOnlineStateChangedEvent.eventType;
        }
        if ((i & 2) != 0) {
            list = unmanagedDevicesOnlineStateChangedEvent.bookmarkIds;
        }
        if ((i & 4) != 0) {
            z = unmanagedDevicesOnlineStateChangedEvent.isOnline;
        }
        return unmanagedDevicesOnlineStateChangedEvent.copy(str, list, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    public final List<UUID> component2() {
        return this.bookmarkIds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsOnline() {
        return this.isOnline;
    }

    public final UnmanagedDevicesOnlineStateChangedEvent copy(@sp3(name = "eventType") String eventType, @sp3(name = "bookmarkIds") List<UUID> bookmarkIds, @sp3(name = "isOnline") boolean isOnline) {
        eventType.getClass();
        bookmarkIds.getClass();
        return new UnmanagedDevicesOnlineStateChangedEvent(eventType, bookmarkIds, isOnline);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnmanagedDevicesOnlineStateChangedEvent)) {
            return false;
        }
        UnmanagedDevicesOnlineStateChangedEvent unmanagedDevicesOnlineStateChangedEvent = (UnmanagedDevicesOnlineStateChangedEvent) other;
        return im3.n(this.eventType, unmanagedDevicesOnlineStateChangedEvent.eventType) && im3.n(this.bookmarkIds, unmanagedDevicesOnlineStateChangedEvent.bookmarkIds) && this.isOnline == unmanagedDevicesOnlineStateChangedEvent.isOnline;
    }

    public final List<UUID> getBookmarkIds() {
        return this.bookmarkIds;
    }

    @Override // com.teamviewer.apidefinitions.manageddevices.models.TeamViewerEvent
    public String getEventType() {
        return this.eventType;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isOnline) + to7.g(this.bookmarkIds, this.eventType.hashCode() * 31, 31);
    }

    public final boolean isOnline() {
        return this.isOnline;
    }

    public String toString() {
        String str = this.eventType;
        List<UUID> list = this.bookmarkIds;
        boolean z = this.isOnline;
        StringBuilder sb = new StringBuilder("UnmanagedDevicesOnlineStateChangedEvent(eventType=");
        sb.append(str);
        sb.append(", bookmarkIds=");
        sb.append(list);
        sb.append(", isOnline=");
        return ua5.n(")", sb, z);
    }
}
