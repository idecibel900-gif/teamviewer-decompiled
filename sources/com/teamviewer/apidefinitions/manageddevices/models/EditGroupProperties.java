package com.teamviewer.apidefinitions.manageddevices.models;

import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003Jl\u0010\"\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017¨\u0006*"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/EditGroupProperties;", "", "groupIds", "", "Ljava/util/UUID;", "removeMyselfAsManager", "", "managers", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStateManagerId;", "policy", "Lcom/teamviewer/apidefinitions/manageddevices/models/GroupPolicyProperty;", "backupPolicy", "monitoringPolicy", "patchManagementPolicy", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Lcom/teamviewer/apidefinitions/manageddevices/models/GroupPolicyProperty;Lcom/teamviewer/apidefinitions/manageddevices/models/GroupPolicyProperty;Lcom/teamviewer/apidefinitions/manageddevices/models/GroupPolicyProperty;Lcom/teamviewer/apidefinitions/manageddevices/models/GroupPolicyProperty;)V", "getGroupIds", "()Ljava/util/List;", "getRemoveMyselfAsManager", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getManagers", "getPolicy", "()Lcom/teamviewer/apidefinitions/manageddevices/models/GroupPolicyProperty;", "getBackupPolicy", "getMonitoringPolicy", "getPatchManagementPolicy", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Lcom/teamviewer/apidefinitions/manageddevices/models/GroupPolicyProperty;Lcom/teamviewer/apidefinitions/manageddevices/models/GroupPolicyProperty;Lcom/teamviewer/apidefinitions/manageddevices/models/GroupPolicyProperty;Lcom/teamviewer/apidefinitions/manageddevices/models/GroupPolicyProperty;)Lcom/teamviewer/apidefinitions/manageddevices/models/EditGroupProperties;", "equals", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EditGroupProperties {
    private final GroupPolicyProperty backupPolicy;
    private final List<UUID> groupIds;
    private final List<DeviceStateManagerId> managers;
    private final GroupPolicyProperty monitoringPolicy;
    private final GroupPolicyProperty patchManagementPolicy;
    private final GroupPolicyProperty policy;
    private final Boolean removeMyselfAsManager;

    public /* synthetic */ EditGroupProperties(List list, Boolean bool, List list2, GroupPolicyProperty groupPolicyProperty, GroupPolicyProperty groupPolicyProperty2, GroupPolicyProperty groupPolicyProperty3, GroupPolicyProperty groupPolicyProperty4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : groupPolicyProperty, (i & 16) != 0 ? null : groupPolicyProperty2, (i & 32) != 0 ? null : groupPolicyProperty3, (i & 64) != 0 ? null : groupPolicyProperty4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditGroupProperties copy$default(EditGroupProperties editGroupProperties, List list, Boolean bool, List list2, GroupPolicyProperty groupPolicyProperty, GroupPolicyProperty groupPolicyProperty2, GroupPolicyProperty groupPolicyProperty3, GroupPolicyProperty groupPolicyProperty4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = editGroupProperties.groupIds;
        }
        if ((i & 2) != 0) {
            bool = editGroupProperties.removeMyselfAsManager;
        }
        if ((i & 4) != 0) {
            list2 = editGroupProperties.managers;
        }
        if ((i & 8) != 0) {
            groupPolicyProperty = editGroupProperties.policy;
        }
        if ((i & 16) != 0) {
            groupPolicyProperty2 = editGroupProperties.backupPolicy;
        }
        if ((i & 32) != 0) {
            groupPolicyProperty3 = editGroupProperties.monitoringPolicy;
        }
        if ((i & 64) != 0) {
            groupPolicyProperty4 = editGroupProperties.patchManagementPolicy;
        }
        GroupPolicyProperty groupPolicyProperty5 = groupPolicyProperty3;
        GroupPolicyProperty groupPolicyProperty6 = groupPolicyProperty4;
        GroupPolicyProperty groupPolicyProperty7 = groupPolicyProperty2;
        List list3 = list2;
        return editGroupProperties.copy(list, bool, list3, groupPolicyProperty, groupPolicyProperty7, groupPolicyProperty5, groupPolicyProperty6);
    }

    public final List<UUID> component1() {
        return this.groupIds;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getRemoveMyselfAsManager() {
        return this.removeMyselfAsManager;
    }

    public final List<DeviceStateManagerId> component3() {
        return this.managers;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final GroupPolicyProperty getPolicy() {
        return this.policy;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final GroupPolicyProperty getBackupPolicy() {
        return this.backupPolicy;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final GroupPolicyProperty getMonitoringPolicy() {
        return this.monitoringPolicy;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final GroupPolicyProperty getPatchManagementPolicy() {
        return this.patchManagementPolicy;
    }

    public final EditGroupProperties copy(@sp3(name = "groupIds") List<UUID> groupIds, @sp3(name = "removeMyselfAsManager") Boolean removeMyselfAsManager, @sp3(name = "managers") List<DeviceStateManagerId> managers, @sp3(name = "policy") GroupPolicyProperty policy, @sp3(name = "backupPolicy") GroupPolicyProperty backupPolicy, @sp3(name = "monitoringPolicy") GroupPolicyProperty monitoringPolicy, @sp3(name = "patchManagementPolicy") GroupPolicyProperty patchManagementPolicy) {
        groupIds.getClass();
        return new EditGroupProperties(groupIds, removeMyselfAsManager, managers, policy, backupPolicy, monitoringPolicy, patchManagementPolicy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditGroupProperties)) {
            return false;
        }
        EditGroupProperties editGroupProperties = (EditGroupProperties) other;
        return im3.n(this.groupIds, editGroupProperties.groupIds) && im3.n(this.removeMyselfAsManager, editGroupProperties.removeMyselfAsManager) && im3.n(this.managers, editGroupProperties.managers) && im3.n(this.policy, editGroupProperties.policy) && im3.n(this.backupPolicy, editGroupProperties.backupPolicy) && im3.n(this.monitoringPolicy, editGroupProperties.monitoringPolicy) && im3.n(this.patchManagementPolicy, editGroupProperties.patchManagementPolicy);
    }

    public final GroupPolicyProperty getBackupPolicy() {
        return this.backupPolicy;
    }

    public final List<UUID> getGroupIds() {
        return this.groupIds;
    }

    public final List<DeviceStateManagerId> getManagers() {
        return this.managers;
    }

    public final GroupPolicyProperty getMonitoringPolicy() {
        return this.monitoringPolicy;
    }

    public final GroupPolicyProperty getPatchManagementPolicy() {
        return this.patchManagementPolicy;
    }

    public final GroupPolicyProperty getPolicy() {
        return this.policy;
    }

    public final Boolean getRemoveMyselfAsManager() {
        return this.removeMyselfAsManager;
    }

    public int hashCode() {
        int iHashCode = this.groupIds.hashCode() * 31;
        Boolean bool = this.removeMyselfAsManager;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List<DeviceStateManagerId> list = this.managers;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        GroupPolicyProperty groupPolicyProperty = this.policy;
        int iHashCode4 = (iHashCode3 + (groupPolicyProperty == null ? 0 : groupPolicyProperty.hashCode())) * 31;
        GroupPolicyProperty groupPolicyProperty2 = this.backupPolicy;
        int iHashCode5 = (iHashCode4 + (groupPolicyProperty2 == null ? 0 : groupPolicyProperty2.hashCode())) * 31;
        GroupPolicyProperty groupPolicyProperty3 = this.monitoringPolicy;
        int iHashCode6 = (iHashCode5 + (groupPolicyProperty3 == null ? 0 : groupPolicyProperty3.hashCode())) * 31;
        GroupPolicyProperty groupPolicyProperty4 = this.patchManagementPolicy;
        return iHashCode6 + (groupPolicyProperty4 != null ? groupPolicyProperty4.hashCode() : 0);
    }

    public String toString() {
        return "EditGroupProperties(groupIds=" + this.groupIds + ", removeMyselfAsManager=" + this.removeMyselfAsManager + ", managers=" + this.managers + ", policy=" + this.policy + ", backupPolicy=" + this.backupPolicy + ", monitoringPolicy=" + this.monitoringPolicy + ", patchManagementPolicy=" + this.patchManagementPolicy + ")";
    }

    public EditGroupProperties(@sp3(name = "groupIds") List<UUID> list, @sp3(name = "removeMyselfAsManager") Boolean bool, @sp3(name = "managers") List<DeviceStateManagerId> list2, @sp3(name = "policy") GroupPolicyProperty groupPolicyProperty, @sp3(name = "backupPolicy") GroupPolicyProperty groupPolicyProperty2, @sp3(name = "monitoringPolicy") GroupPolicyProperty groupPolicyProperty3, @sp3(name = "patchManagementPolicy") GroupPolicyProperty groupPolicyProperty4) {
        list.getClass();
        this.groupIds = list;
        this.removeMyselfAsManager = bool;
        this.managers = list2;
        this.policy = groupPolicyProperty;
        this.backupPolicy = groupPolicyProperty2;
        this.monitoringPolicy = groupPolicyProperty3;
        this.patchManagementPolicy = groupPolicyProperty4;
    }
}
