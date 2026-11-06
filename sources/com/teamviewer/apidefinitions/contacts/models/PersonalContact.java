package com.teamviewer.apidefinitions.contacts.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.e41;
import o.fx3;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003J|\u0010,\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u0003HÖ\u0001J\t\u00102\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016¨\u00063"}, d2 = {"Lcom/teamviewer/apidefinitions/contacts/models/PersonalContact;", "", "personalContactId", "", "accountId", "name", "", "status", "Lcom/teamviewer/apidefinitions/contacts/models/ContactOnlineStatus;", "ownership", "Lcom/teamviewer/apidefinitions/contacts/models/Ownership;", "pictureUrl", "groupId", "groupName", "email", "description", "<init>", "(IILjava/lang/String;Lcom/teamviewer/apidefinitions/contacts/models/ContactOnlineStatus;Lcom/teamviewer/apidefinitions/contacts/models/Ownership;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPersonalContactId", "()I", "getAccountId", "getName", "()Ljava/lang/String;", "getStatus", "()Lcom/teamviewer/apidefinitions/contacts/models/ContactOnlineStatus;", "getOwnership", "()Lcom/teamviewer/apidefinitions/contacts/models/Ownership;", "getPictureUrl", "getGroupId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGroupName", "getEmail", "getDescription", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(IILjava/lang/String;Lcom/teamviewer/apidefinitions/contacts/models/ContactOnlineStatus;Lcom/teamviewer/apidefinitions/contacts/models/Ownership;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/teamviewer/apidefinitions/contacts/models/PersonalContact;", "equals", "", "other", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PersonalContact {
    private final int accountId;
    private final String description;
    private final String email;
    private final Integer groupId;
    private final String groupName;
    private final String name;
    private final Ownership ownership;
    private final int personalContactId;
    private final String pictureUrl;
    private final ContactOnlineStatus status;

    public PersonalContact(@sp3(name = "personalContactId") int i, @sp3(name = "accountId") int i2, @sp3(name = "name") String str, @sp3(name = "status") ContactOnlineStatus contactOnlineStatus, @sp3(name = "ownership") Ownership ownership, @sp3(name = "pictureUrl") String str2, @sp3(name = "groupId") Integer num, @sp3(name = "groupName") String str3, @sp3(name = "email") String str4, @sp3(name = "description") String str5) {
        str.getClass();
        contactOnlineStatus.getClass();
        ownership.getClass();
        this.personalContactId = i;
        this.accountId = i2;
        this.name = str;
        this.status = contactOnlineStatus;
        this.ownership = ownership;
        this.pictureUrl = str2;
        this.groupId = num;
        this.groupName = str3;
        this.email = str4;
        this.description = str5;
    }

    public static /* synthetic */ PersonalContact copy$default(PersonalContact personalContact, int i, int i2, String str, ContactOnlineStatus contactOnlineStatus, Ownership ownership, String str2, Integer num, String str3, String str4, String str5, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = personalContact.personalContactId;
        }
        if ((i3 & 2) != 0) {
            i2 = personalContact.accountId;
        }
        if ((i3 & 4) != 0) {
            str = personalContact.name;
        }
        if ((i3 & 8) != 0) {
            contactOnlineStatus = personalContact.status;
        }
        if ((i3 & 16) != 0) {
            ownership = personalContact.ownership;
        }
        if ((i3 & 32) != 0) {
            str2 = personalContact.pictureUrl;
        }
        if ((i3 & 64) != 0) {
            num = personalContact.groupId;
        }
        if ((i3 & 128) != 0) {
            str3 = personalContact.groupName;
        }
        if ((i3 & 256) != 0) {
            str4 = personalContact.email;
        }
        if ((i3 & 512) != 0) {
            str5 = personalContact.description;
        }
        String str6 = str4;
        String str7 = str5;
        Integer num2 = num;
        String str8 = str3;
        Ownership ownership2 = ownership;
        String str9 = str2;
        return personalContact.copy(i, i2, str, contactOnlineStatus, ownership2, str9, num2, str8, str6, str7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPersonalContactId() {
        return this.personalContactId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAccountId() {
        return this.accountId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ContactOnlineStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Ownership getOwnership() {
        return this.ownership;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPictureUrl() {
        return this.pictureUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getGroupId() {
        return this.groupId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getGroupName() {
        return this.groupName;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    public final PersonalContact copy(@sp3(name = "personalContactId") int personalContactId, @sp3(name = "accountId") int accountId, @sp3(name = "name") String name, @sp3(name = "status") ContactOnlineStatus status, @sp3(name = "ownership") Ownership ownership, @sp3(name = "pictureUrl") String pictureUrl, @sp3(name = "groupId") Integer groupId, @sp3(name = "groupName") String groupName, @sp3(name = "email") String email, @sp3(name = "description") String description) {
        name.getClass();
        status.getClass();
        ownership.getClass();
        return new PersonalContact(personalContactId, accountId, name, status, ownership, pictureUrl, groupId, groupName, email, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalContact)) {
            return false;
        }
        PersonalContact personalContact = (PersonalContact) other;
        return this.personalContactId == personalContact.personalContactId && this.accountId == personalContact.accountId && im3.n(this.name, personalContact.name) && this.status == personalContact.status && this.ownership == personalContact.ownership && im3.n(this.pictureUrl, personalContact.pictureUrl) && im3.n(this.groupId, personalContact.groupId) && im3.n(this.groupName, personalContact.groupName) && im3.n(this.email, personalContact.email) && im3.n(this.description, personalContact.description);
    }

    public final int getAccountId() {
        return this.accountId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEmail() {
        return this.email;
    }

    public final Integer getGroupId() {
        return this.groupId;
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final String getName() {
        return this.name;
    }

    public final Ownership getOwnership() {
        return this.ownership;
    }

    public final int getPersonalContactId() {
        return this.personalContactId;
    }

    public final String getPictureUrl() {
        return this.pictureUrl;
    }

    public final ContactOnlineStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = (this.ownership.hashCode() + ((this.status.hashCode() + to7.e(fx3.a(this.accountId, Integer.hashCode(this.personalContactId) * 31, 31), 31, this.name)) * 31)) * 31;
        String str = this.pictureUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.groupId;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.groupName;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.email;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        int i = this.personalContactId;
        int i2 = this.accountId;
        String str = this.name;
        ContactOnlineStatus contactOnlineStatus = this.status;
        Ownership ownership = this.ownership;
        String str2 = this.pictureUrl;
        Integer num = this.groupId;
        String str3 = this.groupName;
        String str4 = this.email;
        String str5 = this.description;
        StringBuilder sbJ = fx3.j(i, i2, "PersonalContact(personalContactId=", ", accountId=", ", name=");
        sbJ.append(str);
        sbJ.append(", status=");
        sbJ.append(contactOnlineStatus);
        sbJ.append(", ownership=");
        sbJ.append(ownership);
        sbJ.append(", pictureUrl=");
        sbJ.append(str2);
        sbJ.append(", groupId=");
        sbJ.append(num);
        sbJ.append(", groupName=");
        sbJ.append(str3);
        sbJ.append(", email=");
        return e41.m(sbJ, str4, ", description=", str5, ")");
    }

    public /* synthetic */ PersonalContact(int i, int i2, String str, ContactOnlineStatus contactOnlineStatus, Ownership ownership, String str2, Integer num, String str3, String str4, String str5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str, contactOnlineStatus, ownership, (i3 & 32) != 0 ? null : str2, (i3 & 64) != 0 ? null : num, (i3 & 128) != 0 ? null : str3, (i3 & 256) != 0 ? null : str4, (i3 & 512) != 0 ? null : str5);
    }
}
