package com.teamviewer.apidefinitions.contacts.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/teamviewer/apidefinitions/contacts/models/CreatePersonalInvitationResult;", "", "contact", "Lcom/teamviewer/apidefinitions/contacts/models/PersonalContact;", "invitation", "Lcom/teamviewer/apidefinitions/contacts/models/PersonalContactInvitation;", "<init>", "(Lcom/teamviewer/apidefinitions/contacts/models/PersonalContact;Lcom/teamviewer/apidefinitions/contacts/models/PersonalContactInvitation;)V", "getContact", "()Lcom/teamviewer/apidefinitions/contacts/models/PersonalContact;", "getInvitation", "()Lcom/teamviewer/apidefinitions/contacts/models/PersonalContactInvitation;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CreatePersonalInvitationResult {
    private final PersonalContact contact;
    private final PersonalContactInvitation invitation;

    public /* synthetic */ CreatePersonalInvitationResult(PersonalContact personalContact, PersonalContactInvitation personalContactInvitation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : personalContact, (i & 2) != 0 ? null : personalContactInvitation);
    }

    public static /* synthetic */ CreatePersonalInvitationResult copy$default(CreatePersonalInvitationResult createPersonalInvitationResult, PersonalContact personalContact, PersonalContactInvitation personalContactInvitation, int i, Object obj) {
        if ((i & 1) != 0) {
            personalContact = createPersonalInvitationResult.contact;
        }
        if ((i & 2) != 0) {
            personalContactInvitation = createPersonalInvitationResult.invitation;
        }
        return createPersonalInvitationResult.copy(personalContact, personalContactInvitation);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PersonalContact getContact() {
        return this.contact;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PersonalContactInvitation getInvitation() {
        return this.invitation;
    }

    public final CreatePersonalInvitationResult copy(@sp3(name = "contact") PersonalContact contact, @sp3(name = "invitation") PersonalContactInvitation invitation) {
        return new CreatePersonalInvitationResult(contact, invitation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreatePersonalInvitationResult)) {
            return false;
        }
        CreatePersonalInvitationResult createPersonalInvitationResult = (CreatePersonalInvitationResult) other;
        return im3.n(this.contact, createPersonalInvitationResult.contact) && im3.n(this.invitation, createPersonalInvitationResult.invitation);
    }

    public final PersonalContact getContact() {
        return this.contact;
    }

    public final PersonalContactInvitation getInvitation() {
        return this.invitation;
    }

    public int hashCode() {
        PersonalContact personalContact = this.contact;
        int iHashCode = (personalContact == null ? 0 : personalContact.hashCode()) * 31;
        PersonalContactInvitation personalContactInvitation = this.invitation;
        return iHashCode + (personalContactInvitation != null ? personalContactInvitation.hashCode() : 0);
    }

    public String toString() {
        return "CreatePersonalInvitationResult(contact=" + this.contact + ", invitation=" + this.invitation + ")";
    }

    public CreatePersonalInvitationResult(@sp3(name = "contact") PersonalContact personalContact, @sp3(name = "invitation") PersonalContactInvitation personalContactInvitation) {
        this.contact = personalContact;
        this.invitation = personalContactInvitation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CreatePersonalInvitationResult() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
