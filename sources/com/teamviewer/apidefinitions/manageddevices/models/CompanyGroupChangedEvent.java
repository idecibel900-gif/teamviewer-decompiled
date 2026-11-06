package com.teamviewer.apidefinitions.manageddevices.models;

import java.util.UUID;
import kotlin.Metadata;
import o.e41;
import o.im3;
import o.sp3;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/CompanyGroupChangedEvent;", "Lcom/teamviewer/apidefinitions/manageddevices/models/TeamViewerEvent;", "eventType", "", "groupId", "Ljava/util/UUID;", "displayName", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;)V", "getEventType", "()Ljava/lang/String;", "getGroupId", "()Ljava/util/UUID;", "getDisplayName", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CompanyGroupChangedEvent implements TeamViewerEvent {
    private final String displayName;
    private final String eventType;
    private final UUID groupId;

    public CompanyGroupChangedEvent(@sp3(name = "eventType") String str, @sp3(name = "groupId") UUID uuid, @sp3(name = "displayName") String str2) {
        str.getClass();
        uuid.getClass();
        str2.getClass();
        this.eventType = str;
        this.groupId = uuid;
        this.displayName = str2;
    }

    public static /* synthetic */ CompanyGroupChangedEvent copy$default(CompanyGroupChangedEvent companyGroupChangedEvent, String str, UUID uuid, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = companyGroupChangedEvent.eventType;
        }
        if ((i & 2) != 0) {
            uuid = companyGroupChangedEvent.groupId;
        }
        if ((i & 4) != 0) {
            str2 = companyGroupChangedEvent.displayName;
        }
        return companyGroupChangedEvent.copy(str, uuid, str2);
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

    public final CompanyGroupChangedEvent copy(@sp3(name = "eventType") String eventType, @sp3(name = "groupId") UUID groupId, @sp3(name = "displayName") String displayName) {
        eventType.getClass();
        groupId.getClass();
        displayName.getClass();
        return new CompanyGroupChangedEvent(eventType, groupId, displayName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompanyGroupChangedEvent)) {
            return false;
        }
        CompanyGroupChangedEvent companyGroupChangedEvent = (CompanyGroupChangedEvent) other;
        return im3.n(this.eventType, companyGroupChangedEvent.eventType) && im3.n(this.groupId, companyGroupChangedEvent.groupId) && im3.n(this.displayName, companyGroupChangedEvent.displayName);
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

    public int hashCode() {
        return this.displayName.hashCode() + ua5.e(this.groupId, this.eventType.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.eventType;
        UUID uuid = this.groupId;
        String str2 = this.displayName;
        StringBuilder sb = new StringBuilder("CompanyGroupChangedEvent(eventType=");
        sb.append(str);
        sb.append(", groupId=");
        sb.append(uuid);
        sb.append(", displayName=");
        return e41.l(sb, str2, ")");
    }
}
