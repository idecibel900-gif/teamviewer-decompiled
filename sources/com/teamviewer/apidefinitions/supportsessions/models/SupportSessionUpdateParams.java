package com.teamviewer.apidefinitions.supportsessions.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.e41;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJJ\u0010\u0018\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionUpdateParams;", "", "name", "", "email", "groupId", "", "description", "assignedAccountId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "getName", "()Ljava/lang/String;", "getEmail", "getGroupId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDescription", "getAssignedAccountId", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionUpdateParams;", "equals", "", "other", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SupportSessionUpdateParams {
    private final Integer assignedAccountId;
    private final String description;
    private final String email;
    private final Integer groupId;
    private final String name;

    public /* synthetic */ SupportSessionUpdateParams(String str, String str2, Integer num, String str3, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num2);
    }

    public static /* synthetic */ SupportSessionUpdateParams copy$default(SupportSessionUpdateParams supportSessionUpdateParams, String str, String str2, Integer num, String str3, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = supportSessionUpdateParams.name;
        }
        if ((i & 2) != 0) {
            str2 = supportSessionUpdateParams.email;
        }
        if ((i & 4) != 0) {
            num = supportSessionUpdateParams.groupId;
        }
        if ((i & 8) != 0) {
            str3 = supportSessionUpdateParams.description;
        }
        if ((i & 16) != 0) {
            num2 = supportSessionUpdateParams.assignedAccountId;
        }
        Integer num3 = num2;
        Integer num4 = num;
        return supportSessionUpdateParams.copy(str, str2, num4, str3, num3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getGroupId() {
        return this.groupId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getAssignedAccountId() {
        return this.assignedAccountId;
    }

    public final SupportSessionUpdateParams copy(@sp3(name = "name") String name, @sp3(name = "email") String email, @sp3(name = "groupId") Integer groupId, @sp3(name = "description") String description, @sp3(name = "assignedAccountId") Integer assignedAccountId) {
        return new SupportSessionUpdateParams(name, email, groupId, description, assignedAccountId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportSessionUpdateParams)) {
            return false;
        }
        SupportSessionUpdateParams supportSessionUpdateParams = (SupportSessionUpdateParams) other;
        return im3.n(this.name, supportSessionUpdateParams.name) && im3.n(this.email, supportSessionUpdateParams.email) && im3.n(this.groupId, supportSessionUpdateParams.groupId) && im3.n(this.description, supportSessionUpdateParams.description) && im3.n(this.assignedAccountId, supportSessionUpdateParams.assignedAccountId);
    }

    public final Integer getAssignedAccountId() {
        return this.assignedAccountId;
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

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.email;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.groupId;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.assignedAccountId;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.email;
        Integer num = this.groupId;
        String str3 = this.description;
        Integer num2 = this.assignedAccountId;
        StringBuilder sbO = e41.o("SupportSessionUpdateParams(name=", str, ", email=", str2, ", groupId=");
        sbO.append(num);
        sbO.append(", description=");
        sbO.append(str3);
        sbO.append(", assignedAccountId=");
        sbO.append(num2);
        sbO.append(")");
        return sbO.toString();
    }

    public SupportSessionUpdateParams(@sp3(name = "name") String str, @sp3(name = "email") String str2, @sp3(name = "groupId") Integer num, @sp3(name = "description") String str3, @sp3(name = "assignedAccountId") Integer num2) {
        this.name = str;
        this.email = str2;
        this.groupId = num;
        this.description = str3;
        this.assignedAccountId = num2;
    }

    public SupportSessionUpdateParams() {
        this(null, null, null, null, null, 31, null);
    }
}
