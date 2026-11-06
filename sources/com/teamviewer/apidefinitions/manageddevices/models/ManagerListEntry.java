package com.teamviewer.apidefinitions.manageddevices.models;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012JF\u0010\u001d\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0017\u0010\u0012¨\u0006%"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/ManagerListEntry;", "", "managerId", "Ljava/util/UUID;", "managerType", "Lcom/teamviewer/apidefinitions/manageddevices/models/ManagerType;", "accountId", "", "userGroupId", "", "companyId", "<init>", "(Ljava/util/UUID;Lcom/teamviewer/apidefinitions/manageddevices/models/ManagerType;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;)V", "getManagerId", "()Ljava/util/UUID;", "getManagerType", "()Lcom/teamviewer/apidefinitions/manageddevices/models/ManagerType;", "getAccountId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUserGroupId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCompanyId", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/UUID;Lcom/teamviewer/apidefinitions/manageddevices/models/ManagerType;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;)Lcom/teamviewer/apidefinitions/manageddevices/models/ManagerListEntry;", "equals", "", "other", "hashCode", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ManagerListEntry {
    private final Integer accountId;
    private final Integer companyId;
    private final UUID managerId;
    private final ManagerType managerType;
    private final Long userGroupId;

    public ManagerListEntry(@sp3(name = "managerId") UUID uuid, @sp3(name = "managerType") ManagerType managerType, @sp3(name = "accountId") Integer num, @sp3(name = "userGroupId") Long l, @sp3(name = "companyId") Integer num2) {
        uuid.getClass();
        managerType.getClass();
        this.managerId = uuid;
        this.managerType = managerType;
        this.accountId = num;
        this.userGroupId = l;
        this.companyId = num2;
    }

    public static /* synthetic */ ManagerListEntry copy$default(ManagerListEntry managerListEntry, UUID uuid, ManagerType managerType, Integer num, Long l, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = managerListEntry.managerId;
        }
        if ((i & 2) != 0) {
            managerType = managerListEntry.managerType;
        }
        if ((i & 4) != 0) {
            num = managerListEntry.accountId;
        }
        if ((i & 8) != 0) {
            l = managerListEntry.userGroupId;
        }
        if ((i & 16) != 0) {
            num2 = managerListEntry.companyId;
        }
        Integer num3 = num2;
        Integer num4 = num;
        return managerListEntry.copy(uuid, managerType, num4, l, num3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getManagerId() {
        return this.managerId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ManagerType getManagerType() {
        return this.managerType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getAccountId() {
        return this.accountId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getUserGroupId() {
        return this.userGroupId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getCompanyId() {
        return this.companyId;
    }

    public final ManagerListEntry copy(@sp3(name = "managerId") UUID managerId, @sp3(name = "managerType") ManagerType managerType, @sp3(name = "accountId") Integer accountId, @sp3(name = "userGroupId") Long userGroupId, @sp3(name = "companyId") Integer companyId) {
        managerId.getClass();
        managerType.getClass();
        return new ManagerListEntry(managerId, managerType, accountId, userGroupId, companyId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManagerListEntry)) {
            return false;
        }
        ManagerListEntry managerListEntry = (ManagerListEntry) other;
        return im3.n(this.managerId, managerListEntry.managerId) && this.managerType == managerListEntry.managerType && im3.n(this.accountId, managerListEntry.accountId) && im3.n(this.userGroupId, managerListEntry.userGroupId) && im3.n(this.companyId, managerListEntry.companyId);
    }

    public final Integer getAccountId() {
        return this.accountId;
    }

    public final Integer getCompanyId() {
        return this.companyId;
    }

    public final UUID getManagerId() {
        return this.managerId;
    }

    public final ManagerType getManagerType() {
        return this.managerType;
    }

    public final Long getUserGroupId() {
        return this.userGroupId;
    }

    public int hashCode() {
        int iHashCode = (this.managerType.hashCode() + (this.managerId.hashCode() * 31)) * 31;
        Integer num = this.accountId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.userGroupId;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.companyId;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "ManagerListEntry(managerId=" + this.managerId + ", managerType=" + this.managerType + ", accountId=" + this.accountId + ", userGroupId=" + this.userGroupId + ", companyId=" + this.companyId + ")";
    }

    public /* synthetic */ ManagerListEntry(UUID uuid, ManagerType managerType, Integer num, Long l, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, managerType, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : num2);
    }
}
