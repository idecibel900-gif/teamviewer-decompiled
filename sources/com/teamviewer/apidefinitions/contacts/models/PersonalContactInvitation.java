package com.teamviewer.apidefinitions.contacts.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.fx3;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J8\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/teamviewer/apidefinitions/contacts/models/PersonalContactInvitation;", "", "personalContactInvitationId", "", "email", "", "groupId", "accountId", "<init>", "(ILjava/lang/String;ILjava/lang/Integer;)V", "getPersonalContactInvitationId", "()I", "getEmail", "()Ljava/lang/String;", "getGroupId", "getAccountId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/String;ILjava/lang/Integer;)Lcom/teamviewer/apidefinitions/contacts/models/PersonalContactInvitation;", "equals", "", "other", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PersonalContactInvitation {
    private final Integer accountId;
    private final String email;
    private final int groupId;
    private final int personalContactInvitationId;

    public PersonalContactInvitation(@sp3(name = "personalContactInvitationId") int i, @sp3(name = "email") String str, @sp3(name = "groupId") int i2, @sp3(name = "accountId") Integer num) {
        str.getClass();
        this.personalContactInvitationId = i;
        this.email = str;
        this.groupId = i2;
        this.accountId = num;
    }

    public static /* synthetic */ PersonalContactInvitation copy$default(PersonalContactInvitation personalContactInvitation, int i, String str, int i2, Integer num, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = personalContactInvitation.personalContactInvitationId;
        }
        if ((i3 & 2) != 0) {
            str = personalContactInvitation.email;
        }
        if ((i3 & 4) != 0) {
            i2 = personalContactInvitation.groupId;
        }
        if ((i3 & 8) != 0) {
            num = personalContactInvitation.accountId;
        }
        return personalContactInvitation.copy(i, str, i2, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPersonalContactInvitationId() {
        return this.personalContactInvitationId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getGroupId() {
        return this.groupId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getAccountId() {
        return this.accountId;
    }

    public final PersonalContactInvitation copy(@sp3(name = "personalContactInvitationId") int personalContactInvitationId, @sp3(name = "email") String email, @sp3(name = "groupId") int groupId, @sp3(name = "accountId") Integer accountId) {
        email.getClass();
        return new PersonalContactInvitation(personalContactInvitationId, email, groupId, accountId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalContactInvitation)) {
            return false;
        }
        PersonalContactInvitation personalContactInvitation = (PersonalContactInvitation) other;
        return this.personalContactInvitationId == personalContactInvitation.personalContactInvitationId && im3.n(this.email, personalContactInvitation.email) && this.groupId == personalContactInvitation.groupId && im3.n(this.accountId, personalContactInvitation.accountId);
    }

    public final Integer getAccountId() {
        return this.accountId;
    }

    public final String getEmail() {
        return this.email;
    }

    public final int getGroupId() {
        return this.groupId;
    }

    public final int getPersonalContactInvitationId() {
        return this.personalContactInvitationId;
    }

    public int hashCode() {
        int iA = fx3.a(this.groupId, to7.e(Integer.hashCode(this.personalContactInvitationId) * 31, 31, this.email), 31);
        Integer num = this.accountId;
        return iA + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "PersonalContactInvitation(personalContactInvitationId=" + this.personalContactInvitationId + ", email=" + this.email + ", groupId=" + this.groupId + ", accountId=" + this.accountId + ")";
    }

    public /* synthetic */ PersonalContactInvitation(int i, String str, int i2, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, i2, (i3 & 8) != 0 ? null : num);
    }
}
