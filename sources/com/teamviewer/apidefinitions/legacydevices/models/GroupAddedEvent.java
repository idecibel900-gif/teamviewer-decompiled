package com.teamviewer.apidefinitions.legacydevices.models;

import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/teamviewer/apidefinitions/legacydevices/models/GroupAddedEvent;", "Lcom/teamviewer/apidefinitions/legacydevices/models/TeamViewerEvent;", "eventType", "", "group", "Lcom/teamviewer/apidefinitions/legacydevices/models/Group;", "<init>", "(Ljava/lang/String;Lcom/teamviewer/apidefinitions/legacydevices/models/Group;)V", "getEventType", "()Ljava/lang/String;", "getGroup", "()Lcom/teamviewer/apidefinitions/legacydevices/models/Group;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupAddedEvent implements TeamViewerEvent {
    private final String eventType;
    private final Group group;

    public GroupAddedEvent(@sp3(name = "eventType") String str, @sp3(name = "group") Group group) {
        str.getClass();
        group.getClass();
        this.eventType = str;
        this.group = group;
    }

    public static /* synthetic */ GroupAddedEvent copy$default(GroupAddedEvent groupAddedEvent, String str, Group group, int i, Object obj) {
        if ((i & 1) != 0) {
            str = groupAddedEvent.eventType;
        }
        if ((i & 2) != 0) {
            group = groupAddedEvent.group;
        }
        return groupAddedEvent.copy(str, group);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Group getGroup() {
        return this.group;
    }

    public final GroupAddedEvent copy(@sp3(name = "eventType") String eventType, @sp3(name = "group") Group group) {
        eventType.getClass();
        group.getClass();
        return new GroupAddedEvent(eventType, group);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupAddedEvent)) {
            return false;
        }
        GroupAddedEvent groupAddedEvent = (GroupAddedEvent) other;
        return im3.n(this.eventType, groupAddedEvent.eventType) && im3.n(this.group, groupAddedEvent.group);
    }

    @Override // com.teamviewer.apidefinitions.legacydevices.models.TeamViewerEvent
    public String getEventType() {
        return this.eventType;
    }

    public final Group getGroup() {
        return this.group;
    }

    public int hashCode() {
        return this.group.hashCode() + (this.eventType.hashCode() * 31);
    }

    public String toString() {
        return "GroupAddedEvent(eventType=" + this.eventType + ", group=" + this.group + ")";
    }
}
