package com.teamviewer.apidefinitions.contacts.models;

import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/teamviewer/apidefinitions/contacts/models/PersonalContactPictureAvailabilityChangedEvent;", "Lcom/teamviewer/apidefinitions/contacts/models/TeamViewerEvent;", "eventType", "", "personalContactId", "", "<init>", "(Ljava/lang/String;I)V", "getEventType", "()Ljava/lang/String;", "getPersonalContactId", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PersonalContactPictureAvailabilityChangedEvent implements TeamViewerEvent {
    private final String eventType;
    private final int personalContactId;

    public PersonalContactPictureAvailabilityChangedEvent(@sp3(name = "eventType") String str, @sp3(name = "personalContactId") int i) {
        str.getClass();
        this.eventType = str;
        this.personalContactId = i;
    }

    public static /* synthetic */ PersonalContactPictureAvailabilityChangedEvent copy$default(PersonalContactPictureAvailabilityChangedEvent personalContactPictureAvailabilityChangedEvent, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = personalContactPictureAvailabilityChangedEvent.eventType;
        }
        if ((i2 & 2) != 0) {
            i = personalContactPictureAvailabilityChangedEvent.personalContactId;
        }
        return personalContactPictureAvailabilityChangedEvent.copy(str, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPersonalContactId() {
        return this.personalContactId;
    }

    public final PersonalContactPictureAvailabilityChangedEvent copy(@sp3(name = "eventType") String eventType, @sp3(name = "personalContactId") int personalContactId) {
        eventType.getClass();
        return new PersonalContactPictureAvailabilityChangedEvent(eventType, personalContactId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalContactPictureAvailabilityChangedEvent)) {
            return false;
        }
        PersonalContactPictureAvailabilityChangedEvent personalContactPictureAvailabilityChangedEvent = (PersonalContactPictureAvailabilityChangedEvent) other;
        return im3.n(this.eventType, personalContactPictureAvailabilityChangedEvent.eventType) && this.personalContactId == personalContactPictureAvailabilityChangedEvent.personalContactId;
    }

    @Override // com.teamviewer.apidefinitions.contacts.models.TeamViewerEvent
    public String getEventType() {
        return this.eventType;
    }

    public final int getPersonalContactId() {
        return this.personalContactId;
    }

    public int hashCode() {
        return Integer.hashCode(this.personalContactId) + (this.eventType.hashCode() * 31);
    }

    public String toString() {
        return "PersonalContactPictureAvailabilityChangedEvent(eventType=" + this.eventType + ", personalContactId=" + this.personalContactId + ")";
    }
}
