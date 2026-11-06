package com.teamviewer.apidefinitions.manageddevices.models;

import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.e41;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b$\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010-\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010%Jz\u00100\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u00101J\u0013\u00102\u001a\u00020\u00122\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\nHÖ\u0001J\t\u00105\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b!\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010&\u001a\u0004\b\u0011\u0010%¨\u00066"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/EntityManagerListEntry;", "", "managerId", "Ljava/util/UUID;", "managerType", "Lcom/teamviewer/apidefinitions/manageddevices/models/ManagerType;", "permissionSets", "", "Lcom/teamviewer/apidefinitions/manageddevices/models/PermissionSet;", "accountId", "", "userGroupId", "", "companyId", "displayName", "", "pictureUrl", "isInvalidManager", "", "<init>", "(Ljava/util/UUID;Lcom/teamviewer/apidefinitions/manageddevices/models/ManagerType;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getManagerId", "()Ljava/util/UUID;", "getManagerType", "()Lcom/teamviewer/apidefinitions/manageddevices/models/ManagerType;", "getPermissionSets", "()Ljava/util/List;", "getAccountId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUserGroupId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCompanyId", "getDisplayName", "()Ljava/lang/String;", "getPictureUrl", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/UUID;Lcom/teamviewer/apidefinitions/manageddevices/models/ManagerType;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/teamviewer/apidefinitions/manageddevices/models/EntityManagerListEntry;", "equals", "other", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EntityManagerListEntry {
    private final Integer accountId;
    private final Integer companyId;
    private final String displayName;
    private final Boolean isInvalidManager;
    private final UUID managerId;
    private final ManagerType managerType;
    private final List<PermissionSet> permissionSets;
    private final String pictureUrl;
    private final Long userGroupId;

    public /* synthetic */ EntityManagerListEntry(UUID uuid, ManagerType managerType, List list, Integer num, Long l, Integer num2, String str, String str2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, managerType, list, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : str, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? null : bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EntityManagerListEntry copy$default(EntityManagerListEntry entityManagerListEntry, UUID uuid, ManagerType managerType, List list, Integer num, Long l, Integer num2, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = entityManagerListEntry.managerId;
        }
        if ((i & 2) != 0) {
            managerType = entityManagerListEntry.managerType;
        }
        if ((i & 4) != 0) {
            list = entityManagerListEntry.permissionSets;
        }
        if ((i & 8) != 0) {
            num = entityManagerListEntry.accountId;
        }
        if ((i & 16) != 0) {
            l = entityManagerListEntry.userGroupId;
        }
        if ((i & 32) != 0) {
            num2 = entityManagerListEntry.companyId;
        }
        if ((i & 64) != 0) {
            str = entityManagerListEntry.displayName;
        }
        if ((i & 128) != 0) {
            str2 = entityManagerListEntry.pictureUrl;
        }
        if ((i & 256) != 0) {
            bool = entityManagerListEntry.isInvalidManager;
        }
        String str3 = str2;
        Boolean bool2 = bool;
        Integer num3 = num2;
        String str4 = str;
        Long l2 = l;
        List list2 = list;
        return entityManagerListEntry.copy(uuid, managerType, list2, num, l2, num3, str4, str3, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getManagerId() {
        return this.managerId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ManagerType getManagerType() {
        return this.managerType;
    }

    public final List<PermissionSet> component3() {
        return this.permissionSets;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getAccountId() {
        return this.accountId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getUserGroupId() {
        return this.userGroupId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getCompanyId() {
        return this.companyId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPictureUrl() {
        return this.pictureUrl;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getIsInvalidManager() {
        return this.isInvalidManager;
    }

    public final EntityManagerListEntry copy(@sp3(name = "managerId") UUID managerId, @sp3(name = "managerType") ManagerType managerType, @sp3(name = "permissionSets") List<? extends PermissionSet> permissionSets, @sp3(name = "accountId") Integer accountId, @sp3(name = "userGroupId") Long userGroupId, @sp3(name = "companyId") Integer companyId, @sp3(name = "displayName") String displayName, @sp3(name = "pictureUrl") String pictureUrl, @sp3(name = "isInvalidManager") Boolean isInvalidManager) {
        managerId.getClass();
        managerType.getClass();
        permissionSets.getClass();
        return new EntityManagerListEntry(managerId, managerType, permissionSets, accountId, userGroupId, companyId, displayName, pictureUrl, isInvalidManager);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntityManagerListEntry)) {
            return false;
        }
        EntityManagerListEntry entityManagerListEntry = (EntityManagerListEntry) other;
        return im3.n(this.managerId, entityManagerListEntry.managerId) && this.managerType == entityManagerListEntry.managerType && im3.n(this.permissionSets, entityManagerListEntry.permissionSets) && im3.n(this.accountId, entityManagerListEntry.accountId) && im3.n(this.userGroupId, entityManagerListEntry.userGroupId) && im3.n(this.companyId, entityManagerListEntry.companyId) && im3.n(this.displayName, entityManagerListEntry.displayName) && im3.n(this.pictureUrl, entityManagerListEntry.pictureUrl) && im3.n(this.isInvalidManager, entityManagerListEntry.isInvalidManager);
    }

    public final Integer getAccountId() {
        return this.accountId;
    }

    public final Integer getCompanyId() {
        return this.companyId;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final UUID getManagerId() {
        return this.managerId;
    }

    public final ManagerType getManagerType() {
        return this.managerType;
    }

    public final List<PermissionSet> getPermissionSets() {
        return this.permissionSets;
    }

    public final String getPictureUrl() {
        return this.pictureUrl;
    }

    public final Long getUserGroupId() {
        return this.userGroupId;
    }

    public int hashCode() {
        int iG = to7.g(this.permissionSets, (this.managerType.hashCode() + (this.managerId.hashCode() * 31)) * 31, 31);
        Integer num = this.accountId;
        int iHashCode = (iG + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.userGroupId;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.companyId;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.displayName;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pictureUrl;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isInvalidManager;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isInvalidManager() {
        return this.isInvalidManager;
    }

    public String toString() {
        UUID uuid = this.managerId;
        ManagerType managerType = this.managerType;
        List<PermissionSet> list = this.permissionSets;
        Integer num = this.accountId;
        Long l = this.userGroupId;
        Integer num2 = this.companyId;
        String str = this.displayName;
        String str2 = this.pictureUrl;
        Boolean bool = this.isInvalidManager;
        StringBuilder sb = new StringBuilder("EntityManagerListEntry(managerId=");
        sb.append(uuid);
        sb.append(", managerType=");
        sb.append(managerType);
        sb.append(", permissionSets=");
        sb.append(list);
        sb.append(", accountId=");
        sb.append(num);
        sb.append(", userGroupId=");
        sb.append(l);
        sb.append(", companyId=");
        sb.append(num2);
        sb.append(", displayName=");
        e41.t(sb, str, ", pictureUrl=", str2, ", isInvalidManager=");
        sb.append(bool);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EntityManagerListEntry(@sp3(name = "managerId") UUID uuid, @sp3(name = "managerType") ManagerType managerType, @sp3(name = "permissionSets") List<? extends PermissionSet> list, @sp3(name = "accountId") Integer num, @sp3(name = "userGroupId") Long l, @sp3(name = "companyId") Integer num2, @sp3(name = "displayName") String str, @sp3(name = "pictureUrl") String str2, @sp3(name = "isInvalidManager") Boolean bool) {
        uuid.getClass();
        managerType.getClass();
        list.getClass();
        this.managerId = uuid;
        this.managerType = managerType;
        this.permissionSets = list;
        this.accountId = num;
        this.userGroupId = l;
        this.companyId = num2;
        this.displayName = str;
        this.pictureUrl = str2;
        this.isInvalidManager = bool;
    }
}
