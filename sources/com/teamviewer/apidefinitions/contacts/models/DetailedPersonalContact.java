package com.teamviewer.apidefinitions.contacts.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.e41;
import o.fx3;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003J\t\u00101\u001a\u00020\fHÆ\u0003J\t\u00102\u001a\u00020\u000eHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010&J\u000b\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u009c\u0001\u00109\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020\u0003HÖ\u0001J\t\u0010?\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001b¨\u0006@"}, d2 = {"Lcom/teamviewer/apidefinitions/contacts/models/DetailedPersonalContact;", "", "personalContactId", "", "accountId", "name", "", "status", "Lcom/teamviewer/apidefinitions/contacts/models/ContactOnlineStatus;", "ownership", "Lcom/teamviewer/apidefinitions/contacts/models/Ownership;", "actionSettings", "Lcom/teamviewer/apidefinitions/contacts/models/ActionSettings;", "viewSettings", "Lcom/teamviewer/apidefinitions/contacts/models/ViewSettings;", "pictureUrl", "groupId", "groupName", "email", "description", "note", "<init>", "(IILjava/lang/String;Lcom/teamviewer/apidefinitions/contacts/models/ContactOnlineStatus;Lcom/teamviewer/apidefinitions/contacts/models/Ownership;Lcom/teamviewer/apidefinitions/contacts/models/ActionSettings;Lcom/teamviewer/apidefinitions/contacts/models/ViewSettings;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPersonalContactId", "()I", "getAccountId", "getName", "()Ljava/lang/String;", "getStatus", "()Lcom/teamviewer/apidefinitions/contacts/models/ContactOnlineStatus;", "getOwnership", "()Lcom/teamviewer/apidefinitions/contacts/models/Ownership;", "getActionSettings", "()Lcom/teamviewer/apidefinitions/contacts/models/ActionSettings;", "getViewSettings", "()Lcom/teamviewer/apidefinitions/contacts/models/ViewSettings;", "getPictureUrl", "getGroupId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGroupName", "getEmail", "getDescription", "getNote", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(IILjava/lang/String;Lcom/teamviewer/apidefinitions/contacts/models/ContactOnlineStatus;Lcom/teamviewer/apidefinitions/contacts/models/Ownership;Lcom/teamviewer/apidefinitions/contacts/models/ActionSettings;Lcom/teamviewer/apidefinitions/contacts/models/ViewSettings;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/teamviewer/apidefinitions/contacts/models/DetailedPersonalContact;", "equals", "", "other", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DetailedPersonalContact {
    private final int accountId;
    private final ActionSettings actionSettings;
    private final String description;
    private final String email;
    private final Integer groupId;
    private final String groupName;
    private final String name;
    private final String note;
    private final Ownership ownership;
    private final int personalContactId;
    private final String pictureUrl;
    private final ContactOnlineStatus status;
    private final ViewSettings viewSettings;

    public /* synthetic */ DetailedPersonalContact(int i, int i2, String str, ContactOnlineStatus contactOnlineStatus, Ownership ownership, ActionSettings actionSettings, ViewSettings viewSettings, String str2, Integer num, String str3, String str4, String str5, String str6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str, contactOnlineStatus, ownership, actionSettings, viewSettings, (i3 & 128) != 0 ? null : str2, (i3 & 256) != 0 ? null : num, (i3 & 512) != 0 ? null : str3, (i3 & 1024) != 0 ? null : str4, (i3 & 2048) != 0 ? null : str5, (i3 & 4096) != 0 ? null : str6);
    }

    public static /* synthetic */ DetailedPersonalContact copy$default(DetailedPersonalContact detailedPersonalContact, int i, int i2, String str, ContactOnlineStatus contactOnlineStatus, Ownership ownership, ActionSettings actionSettings, ViewSettings viewSettings, String str2, Integer num, String str3, String str4, String str5, String str6, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = detailedPersonalContact.personalContactId;
        }
        return detailedPersonalContact.copy(i, (i3 & 2) != 0 ? detailedPersonalContact.accountId : i2, (i3 & 4) != 0 ? detailedPersonalContact.name : str, (i3 & 8) != 0 ? detailedPersonalContact.status : contactOnlineStatus, (i3 & 16) != 0 ? detailedPersonalContact.ownership : ownership, (i3 & 32) != 0 ? detailedPersonalContact.actionSettings : actionSettings, (i3 & 64) != 0 ? detailedPersonalContact.viewSettings : viewSettings, (i3 & 128) != 0 ? detailedPersonalContact.pictureUrl : str2, (i3 & 256) != 0 ? detailedPersonalContact.groupId : num, (i3 & 512) != 0 ? detailedPersonalContact.groupName : str3, (i3 & 1024) != 0 ? detailedPersonalContact.email : str4, (i3 & 2048) != 0 ? detailedPersonalContact.description : str5, (i3 & 4096) != 0 ? detailedPersonalContact.note : str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPersonalContactId() {
        return this.personalContactId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getGroupName() {
        return this.groupName;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getNote() {
        return this.note;
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
    public final ActionSettings getActionSettings() {
        return this.actionSettings;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ViewSettings getViewSettings() {
        return this.viewSettings;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPictureUrl() {
        return this.pictureUrl;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getGroupId() {
        return this.groupId;
    }

    public final DetailedPersonalContact copy(@sp3(name = "personalContactId") int personalContactId, @sp3(name = "accountId") int accountId, @sp3(name = "name") String name, @sp3(name = "status") ContactOnlineStatus status, @sp3(name = "ownership") Ownership ownership, @sp3(name = "actionSettings") ActionSettings actionSettings, @sp3(name = "viewSettings") ViewSettings viewSettings, @sp3(name = "pictureUrl") String pictureUrl, @sp3(name = "groupId") Integer groupId, @sp3(name = "groupName") String groupName, @sp3(name = "email") String email, @sp3(name = "description") String description, @sp3(name = "note") String note) {
        name.getClass();
        status.getClass();
        ownership.getClass();
        actionSettings.getClass();
        viewSettings.getClass();
        return new DetailedPersonalContact(personalContactId, accountId, name, status, ownership, actionSettings, viewSettings, pictureUrl, groupId, groupName, email, description, note);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailedPersonalContact)) {
            return false;
        }
        DetailedPersonalContact detailedPersonalContact = (DetailedPersonalContact) other;
        return this.personalContactId == detailedPersonalContact.personalContactId && this.accountId == detailedPersonalContact.accountId && im3.n(this.name, detailedPersonalContact.name) && this.status == detailedPersonalContact.status && this.ownership == detailedPersonalContact.ownership && im3.n(this.actionSettings, detailedPersonalContact.actionSettings) && im3.n(this.viewSettings, detailedPersonalContact.viewSettings) && im3.n(this.pictureUrl, detailedPersonalContact.pictureUrl) && im3.n(this.groupId, detailedPersonalContact.groupId) && im3.n(this.groupName, detailedPersonalContact.groupName) && im3.n(this.email, detailedPersonalContact.email) && im3.n(this.description, detailedPersonalContact.description) && im3.n(this.note, detailedPersonalContact.note);
    }

    public final int getAccountId() {
        return this.accountId;
    }

    public final ActionSettings getActionSettings() {
        return this.actionSettings;
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

    public final String getNote() {
        return this.note;
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

    public final ViewSettings getViewSettings() {
        return this.viewSettings;
    }

    public int hashCode() {
        int iHashCode = (this.viewSettings.hashCode() + ((this.actionSettings.hashCode() + ((this.ownership.hashCode() + ((this.status.hashCode() + to7.e(fx3.a(this.accountId, Integer.hashCode(this.personalContactId) * 31, 31), 31, this.name)) * 31)) * 31)) * 31)) * 31;
        String str = this.pictureUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.groupId;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.groupName;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.email;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.note;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        int i = this.personalContactId;
        int i2 = this.accountId;
        String str = this.name;
        ContactOnlineStatus contactOnlineStatus = this.status;
        Ownership ownership = this.ownership;
        ActionSettings actionSettings = this.actionSettings;
        ViewSettings viewSettings = this.viewSettings;
        String str2 = this.pictureUrl;
        Integer num = this.groupId;
        String str3 = this.groupName;
        String str4 = this.email;
        String str5 = this.description;
        String str6 = this.note;
        StringBuilder sbJ = fx3.j(i, i2, "DetailedPersonalContact(personalContactId=", ", accountId=", ", name=");
        sbJ.append(str);
        sbJ.append(", status=");
        sbJ.append(contactOnlineStatus);
        sbJ.append(", ownership=");
        sbJ.append(ownership);
        sbJ.append(", actionSettings=");
        sbJ.append(actionSettings);
        sbJ.append(", viewSettings=");
        sbJ.append(viewSettings);
        sbJ.append(", pictureUrl=");
        sbJ.append(str2);
        sbJ.append(", groupId=");
        sbJ.append(num);
        sbJ.append(", groupName=");
        sbJ.append(str3);
        sbJ.append(", email=");
        e41.t(sbJ, str4, ", description=", str5, ", note=");
        return e41.l(sbJ, str6, ")");
    }

    public DetailedPersonalContact(@sp3(name = "personalContactId") int i, @sp3(name = "accountId") int i2, @sp3(name = "name") String str, @sp3(name = "status") ContactOnlineStatus contactOnlineStatus, @sp3(name = "ownership") Ownership ownership, @sp3(name = "actionSettings") ActionSettings actionSettings, @sp3(name = "viewSettings") ViewSettings viewSettings, @sp3(name = "pictureUrl") String str2, @sp3(name = "groupId") Integer num, @sp3(name = "groupName") String str3, @sp3(name = "email") String str4, @sp3(name = "description") String str5, @sp3(name = "note") String str6) {
        str.getClass();
        contactOnlineStatus.getClass();
        ownership.getClass();
        actionSettings.getClass();
        viewSettings.getClass();
        this.personalContactId = i;
        this.accountId = i2;
        this.name = str;
        this.status = contactOnlineStatus;
        this.ownership = ownership;
        this.actionSettings = actionSettings;
        this.viewSettings = viewSettings;
        this.pictureUrl = str2;
        this.groupId = num;
        this.groupName = str3;
        this.email = str4;
        this.description = str5;
        this.note = str6;
    }
}
