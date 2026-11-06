package com.teamviewer.apidefinitions.manageddevices.models;

import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u001fJf\u0010(\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\fHÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001f¨\u0006/"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStateManagerId;", "", "operation", "Lcom/teamviewer/apidefinitions/manageddevices/models/StateOperation;", "displayName", "", "managerId", "Ljava/util/UUID;", "permissionSets", "", "Lcom/teamviewer/apidefinitions/manageddevices/models/PermissionSet;", "accountId", "", "companyId", "userGroupId", "", "<init>", "(Lcom/teamviewer/apidefinitions/manageddevices/models/StateOperation;Ljava/lang/String;Ljava/util/UUID;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)V", "getOperation", "()Lcom/teamviewer/apidefinitions/manageddevices/models/StateOperation;", "getDisplayName", "()Ljava/lang/String;", "getManagerId", "()Ljava/util/UUID;", "getPermissionSets", "()Ljava/util/List;", "getAccountId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCompanyId", "getUserGroupId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/teamviewer/apidefinitions/manageddevices/models/StateOperation;Ljava/lang/String;Ljava/util/UUID;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStateManagerId;", "equals", "", "other", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceStateManagerId {
    private final Integer accountId;
    private final Integer companyId;
    private final String displayName;
    private final UUID managerId;
    private final StateOperation operation;
    private final List<PermissionSet> permissionSets;
    private final Long userGroupId;

    public /* synthetic */ DeviceStateManagerId(StateOperation stateOperation, String str, UUID uuid, List list, Integer num, Integer num2, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateOperation, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : uuid, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceStateManagerId copy$default(DeviceStateManagerId deviceStateManagerId, StateOperation stateOperation, String str, UUID uuid, List list, Integer num, Integer num2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            stateOperation = deviceStateManagerId.operation;
        }
        if ((i & 2) != 0) {
            str = deviceStateManagerId.displayName;
        }
        if ((i & 4) != 0) {
            uuid = deviceStateManagerId.managerId;
        }
        if ((i & 8) != 0) {
            list = deviceStateManagerId.permissionSets;
        }
        if ((i & 16) != 0) {
            num = deviceStateManagerId.accountId;
        }
        if ((i & 32) != 0) {
            num2 = deviceStateManagerId.companyId;
        }
        if ((i & 64) != 0) {
            l = deviceStateManagerId.userGroupId;
        }
        Integer num3 = num2;
        Long l2 = l;
        Integer num4 = num;
        UUID uuid2 = uuid;
        return deviceStateManagerId.copy(stateOperation, str, uuid2, list, num4, num3, l2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final StateOperation getOperation() {
        return this.operation;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UUID getManagerId() {
        return this.managerId;
    }

    public final List<PermissionSet> component4() {
        return this.permissionSets;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getAccountId() {
        return this.accountId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getCompanyId() {
        return this.companyId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getUserGroupId() {
        return this.userGroupId;
    }

    public final DeviceStateManagerId copy(@sp3(name = "operation") StateOperation operation, @sp3(name = "displayName") String displayName, @sp3(name = "managerId") UUID managerId, @sp3(name = "permissionSets") List<? extends PermissionSet> permissionSets, @sp3(name = "accountId") Integer accountId, @sp3(name = "companyId") Integer companyId, @sp3(name = "userGroupId") Long userGroupId) {
        operation.getClass();
        return new DeviceStateManagerId(operation, displayName, managerId, permissionSets, accountId, companyId, userGroupId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceStateManagerId)) {
            return false;
        }
        DeviceStateManagerId deviceStateManagerId = (DeviceStateManagerId) other;
        return this.operation == deviceStateManagerId.operation && im3.n(this.displayName, deviceStateManagerId.displayName) && im3.n(this.managerId, deviceStateManagerId.managerId) && im3.n(this.permissionSets, deviceStateManagerId.permissionSets) && im3.n(this.accountId, deviceStateManagerId.accountId) && im3.n(this.companyId, deviceStateManagerId.companyId) && im3.n(this.userGroupId, deviceStateManagerId.userGroupId);
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

    public final StateOperation getOperation() {
        return this.operation;
    }

    public final List<PermissionSet> getPermissionSets() {
        return this.permissionSets;
    }

    public final Long getUserGroupId() {
        return this.userGroupId;
    }

    public int hashCode() {
        int iHashCode = this.operation.hashCode() * 31;
        String str = this.displayName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        UUID uuid = this.managerId;
        int iHashCode3 = (iHashCode2 + (uuid == null ? 0 : uuid.hashCode())) * 31;
        List<PermissionSet> list = this.permissionSets;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.accountId;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.companyId;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.userGroupId;
        return iHashCode6 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        return "DeviceStateManagerId(operation=" + this.operation + ", displayName=" + this.displayName + ", managerId=" + this.managerId + ", permissionSets=" + this.permissionSets + ", accountId=" + this.accountId + ", companyId=" + this.companyId + ", userGroupId=" + this.userGroupId + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceStateManagerId(@sp3(name = "operation") StateOperation stateOperation, @sp3(name = "displayName") String str, @sp3(name = "managerId") UUID uuid, @sp3(name = "permissionSets") List<? extends PermissionSet> list, @sp3(name = "accountId") Integer num, @sp3(name = "companyId") Integer num2, @sp3(name = "userGroupId") Long l) {
        stateOperation.getClass();
        this.operation = stateOperation;
        this.displayName = str;
        this.managerId = uuid;
        this.permissionSets = list;
        this.accountId = num;
        this.companyId = num2;
        this.userGroupId = l;
    }
}
