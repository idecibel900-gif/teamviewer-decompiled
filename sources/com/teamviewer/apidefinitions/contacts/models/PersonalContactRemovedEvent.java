package com.teamviewer.apidefinitions.contacts.models;

import kotlin.Metadata;
import o.fx3;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/teamviewer/apidefinitions/contacts/models/PersonalContactRemovedEvent;", "Lcom/teamviewer/apidefinitions/contacts/models/TeamViewerEvent;", "eventType", "", "personalContactId", "", "groupId", "<init>", "(Ljava/lang/String;II)V", "getEventType", "()Ljava/lang/String;", "getPersonalContactId", "()I", "getGroupId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PersonalContactRemovedEvent implements TeamViewerEvent {
    private final String eventType;
    private final int groupId;
    private final int personalContactId;

    public PersonalContactRemovedEvent(@sp3(name = "eventType") String str, @sp3(name = "personalContactId") int i, @sp3(name = "groupId") int i2) {
        str.getClass();
        this.eventType = str;
        this.personalContactId = i;
        this.groupId = i2;
    }

    public static /* synthetic */ PersonalContactRemovedEvent copy$default(PersonalContactRemovedEvent personalContactRemovedEvent, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = personalContactRemovedEvent.eventType;
        }
        if ((i3 & 2) != 0) {
            i = personalContactRemovedEvent.personalContactId;
        }
        if ((i3 & 4) != 0) {
            i2 = personalContactRemovedEvent.groupId;
        }
        return personalContactRemovedEvent.copy(str, i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPersonalContactId() {
        return this.personalContactId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getGroupId() {
        return this.groupId;
    }

    public final PersonalContactRemovedEvent copy(@sp3(name = "eventType") String eventType, @sp3(name = "personalContactId") int personalContactId, @sp3(name = "groupId") int groupId) {
        eventType.getClass();
        return new PersonalContactRemovedEvent(eventType, personalContactId, groupId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalContactRemovedEvent)) {
            return false;
        }
        PersonalContactRemovedEvent personalContactRemovedEvent = (PersonalContactRemovedEvent) other;
        return im3.n(this.eventType, personalContactRemovedEvent.eventType) && this.personalContactId == personalContactRemovedEvent.personalContactId && this.groupId == personalContactRemovedEvent.groupId;
    }

    @Override // com.teamviewer.apidefinitions.contacts.models.TeamViewerEvent
    public String getEventType() {
        return this.eventType;
    }

    public final int getGroupId() {
        return this.groupId;
    }

    public final int getPersonalContactId() {
        return this.personalContactId;
    }

    public int hashCode() {
        return Integer.hashCode(this.groupId) + fx3.a(this.personalContactId, this.eventType.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.eventType;
        int i = this.personalContactId;
        int i2 = this.groupId;
        StringBuilder sb = new StringBuilder("PersonalContactRemovedEvent(eventType=");
        sb.append(str);
        sb.append(", personalContactId=");
        sb.append(i);
        sb.append(", groupId=");
        return to7.l(sb, i2, ")");
    }
}
