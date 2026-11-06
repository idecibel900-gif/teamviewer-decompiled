package com.teamviewer.apidefinitions.contacts.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.e41;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J0\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/teamviewer/apidefinitions/contacts/models/PersonalContactInvitationRequest;", "", "email", "", "groupId", "", "description", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getGroupId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDescription", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/teamviewer/apidefinitions/contacts/models/PersonalContactInvitationRequest;", "equals", "", "other", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PersonalContactInvitationRequest {
    private final String description;
    private final String email;
    private final Integer groupId;

    public /* synthetic */ PersonalContactInvitationRequest(String str, Integer num, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2);
    }

    public static /* synthetic */ PersonalContactInvitationRequest copy$default(PersonalContactInvitationRequest personalContactInvitationRequest, String str, Integer num, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = personalContactInvitationRequest.email;
        }
        if ((i & 2) != 0) {
            num = personalContactInvitationRequest.groupId;
        }
        if ((i & 4) != 0) {
            str2 = personalContactInvitationRequest.description;
        }
        return personalContactInvitationRequest.copy(str, num, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getGroupId() {
        return this.groupId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final PersonalContactInvitationRequest copy(@sp3(name = "email") String email, @sp3(name = "groupId") Integer groupId, @sp3(name = "description") String description) {
        email.getClass();
        return new PersonalContactInvitationRequest(email, groupId, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalContactInvitationRequest)) {
            return false;
        }
        PersonalContactInvitationRequest personalContactInvitationRequest = (PersonalContactInvitationRequest) other;
        return im3.n(this.email, personalContactInvitationRequest.email) && im3.n(this.groupId, personalContactInvitationRequest.groupId) && im3.n(this.description, personalContactInvitationRequest.description);
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

    public int hashCode() {
        int iHashCode = this.email.hashCode() * 31;
        Integer num = this.groupId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.description;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.email;
        Integer num = this.groupId;
        String str2 = this.description;
        StringBuilder sb = new StringBuilder("PersonalContactInvitationRequest(email=");
        sb.append(str);
        sb.append(", groupId=");
        sb.append(num);
        sb.append(", description=");
        return e41.l(sb, str2, ")");
    }

    public PersonalContactInvitationRequest(@sp3(name = "email") String str, @sp3(name = "groupId") Integer num, @sp3(name = "description") String str2) {
        str.getClass();
        this.email = str;
        this.groupId = num;
        this.description = str2;
    }
}
