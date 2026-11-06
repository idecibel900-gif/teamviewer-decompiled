package com.teamviewer.apidefinitions.supportsessions.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003JV\u0010\u001d\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0013\u0010\u000eR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionCreationParams;", "", "validityInMinutes", "", "name", "", "email", "assignedAccountId", "groupId", "supportSessionType", "Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionType;", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionType;)V", "getValidityInMinutes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "()Ljava/lang/String;", "getEmail", "getAssignedAccountId", "getGroupId", "getSupportSessionType", "()Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionType;)Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionCreationParams;", "equals", "", "other", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SupportSessionCreationParams {
    private final Integer assignedAccountId;
    private final String email;
    private final Integer groupId;
    private final String name;
    private final SupportSessionType supportSessionType;
    private final Integer validityInMinutes;

    public /* synthetic */ SupportSessionCreationParams(Integer num, String str, String str2, Integer num2, Integer num3, SupportSessionType supportSessionType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : supportSessionType);
    }

    public static /* synthetic */ SupportSessionCreationParams copy$default(SupportSessionCreationParams supportSessionCreationParams, Integer num, String str, String str2, Integer num2, Integer num3, SupportSessionType supportSessionType, int i, Object obj) {
        if ((i & 1) != 0) {
            num = supportSessionCreationParams.validityInMinutes;
        }
        if ((i & 2) != 0) {
            str = supportSessionCreationParams.name;
        }
        if ((i & 4) != 0) {
            str2 = supportSessionCreationParams.email;
        }
        if ((i & 8) != 0) {
            num2 = supportSessionCreationParams.assignedAccountId;
        }
        if ((i & 16) != 0) {
            num3 = supportSessionCreationParams.groupId;
        }
        if ((i & 32) != 0) {
            supportSessionType = supportSessionCreationParams.supportSessionType;
        }
        Integer num4 = num3;
        SupportSessionType supportSessionType2 = supportSessionType;
        return supportSessionCreationParams.copy(num, str, str2, num2, num4, supportSessionType2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getValidityInMinutes() {
        return this.validityInMinutes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getAssignedAccountId() {
        return this.assignedAccountId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getGroupId() {
        return this.groupId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final SupportSessionType getSupportSessionType() {
        return this.supportSessionType;
    }

    public final SupportSessionCreationParams copy(@sp3(name = "validityInMinutes") Integer validityInMinutes, @sp3(name = "name") String name, @sp3(name = "email") String email, @sp3(name = "assignedAccountId") Integer assignedAccountId, @sp3(name = "groupId") Integer groupId, @sp3(name = "supportSessionType") SupportSessionType supportSessionType) {
        return new SupportSessionCreationParams(validityInMinutes, name, email, assignedAccountId, groupId, supportSessionType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportSessionCreationParams)) {
            return false;
        }
        SupportSessionCreationParams supportSessionCreationParams = (SupportSessionCreationParams) other;
        return im3.n(this.validityInMinutes, supportSessionCreationParams.validityInMinutes) && im3.n(this.name, supportSessionCreationParams.name) && im3.n(this.email, supportSessionCreationParams.email) && im3.n(this.assignedAccountId, supportSessionCreationParams.assignedAccountId) && im3.n(this.groupId, supportSessionCreationParams.groupId) && this.supportSessionType == supportSessionCreationParams.supportSessionType;
    }

    public final Integer getAssignedAccountId() {
        return this.assignedAccountId;
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

    public final SupportSessionType getSupportSessionType() {
        return this.supportSessionType;
    }

    public final Integer getValidityInMinutes() {
        return this.validityInMinutes;
    }

    public int hashCode() {
        Integer num = this.validityInMinutes;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.email;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.assignedAccountId;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.groupId;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        SupportSessionType supportSessionType = this.supportSessionType;
        return iHashCode5 + (supportSessionType != null ? supportSessionType.hashCode() : 0);
    }

    public String toString() {
        return "SupportSessionCreationParams(validityInMinutes=" + this.validityInMinutes + ", name=" + this.name + ", email=" + this.email + ", assignedAccountId=" + this.assignedAccountId + ", groupId=" + this.groupId + ", supportSessionType=" + this.supportSessionType + ")";
    }

    public SupportSessionCreationParams(@sp3(name = "validityInMinutes") Integer num, @sp3(name = "name") String str, @sp3(name = "email") String str2, @sp3(name = "assignedAccountId") Integer num2, @sp3(name = "groupId") Integer num3, @sp3(name = "supportSessionType") SupportSessionType supportSessionType) {
        this.validityInMinutes = num;
        this.name = str;
        this.email = str2;
        this.assignedAccountId = num2;
        this.groupId = num3;
        this.supportSessionType = supportSessionType;
    }

    public SupportSessionCreationParams() {
        this(null, null, null, null, null, null, 63, null);
    }
}
