package com.teamviewer.apidefinitions.manageddevices.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001aJh\u0010#\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001a¨\u0006+"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/GroupDetailModel;", "", "displayName", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStateDisplayNameProperty;", "managers", "", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStateManagerId;", "policy", "Lcom/teamviewer/apidefinitions/manageddevices/models/GroupPolicyProperty;", "backupPolicy", "monitoringPolicy", "patchManagementPolicy", "allDevicesSupportRemoveMySelfAsManager", "", "<init>", "(Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStateDisplayNameProperty;Ljava/util/List;Lcom/teamviewer/apidefinitions/manageddevices/models/GroupPolicyProperty;Lcom/teamviewer/apidefinitions/manageddevices/models/GroupPolicyProperty;Lcom/teamviewer/apidefinitions/manageddevices/models/GroupPolicyProperty;Lcom/teamviewer/apidefinitions/manageddevices/models/GroupPolicyProperty;Ljava/lang/Boolean;)V", "getDisplayName", "()Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStateDisplayNameProperty;", "getManagers", "()Ljava/util/List;", "getPolicy", "()Lcom/teamviewer/apidefinitions/manageddevices/models/GroupPolicyProperty;", "getBackupPolicy", "getMonitoringPolicy", "getPatchManagementPolicy", "getAllDevicesSupportRemoveMySelfAsManager", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStateDisplayNameProperty;Ljava/util/List;Lcom/teamviewer/apidefinitions/manageddevices/models/GroupPolicyProperty;Lcom/teamviewer/apidefinitions/manageddevices/models/GroupPolicyProperty;Lcom/teamviewer/apidefinitions/manageddevices/models/GroupPolicyProperty;Lcom/teamviewer/apidefinitions/manageddevices/models/GroupPolicyProperty;Ljava/lang/Boolean;)Lcom/teamviewer/apidefinitions/manageddevices/models/GroupDetailModel;", "equals", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupDetailModel {
    private final Boolean allDevicesSupportRemoveMySelfAsManager;
    private final GroupPolicyProperty backupPolicy;
    private final DeviceStateDisplayNameProperty displayName;
    private final List<DeviceStateManagerId> managers;
    private final GroupPolicyProperty monitoringPolicy;
    private final GroupPolicyProperty patchManagementPolicy;
    private final GroupPolicyProperty policy;

    public /* synthetic */ GroupDetailModel(DeviceStateDisplayNameProperty deviceStateDisplayNameProperty, List list, GroupPolicyProperty groupPolicyProperty, GroupPolicyProperty groupPolicyProperty2, GroupPolicyProperty groupPolicyProperty3, GroupPolicyProperty groupPolicyProperty4, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : deviceStateDisplayNameProperty, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : groupPolicyProperty, (i & 8) != 0 ? null : groupPolicyProperty2, (i & 16) != 0 ? null : groupPolicyProperty3, (i & 32) != 0 ? null : groupPolicyProperty4, (i & 64) != 0 ? null : bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupDetailModel copy$default(GroupDetailModel groupDetailModel, DeviceStateDisplayNameProperty deviceStateDisplayNameProperty, List list, GroupPolicyProperty groupPolicyProperty, GroupPolicyProperty groupPolicyProperty2, GroupPolicyProperty groupPolicyProperty3, GroupPolicyProperty groupPolicyProperty4, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            deviceStateDisplayNameProperty = groupDetailModel.displayName;
        }
        if ((i & 2) != 0) {
            list = groupDetailModel.managers;
        }
        if ((i & 4) != 0) {
            groupPolicyProperty = groupDetailModel.policy;
        }
        if ((i & 8) != 0) {
            groupPolicyProperty2 = groupDetailModel.backupPolicy;
        }
        if ((i & 16) != 0) {
            groupPolicyProperty3 = groupDetailModel.monitoringPolicy;
        }
        if ((i & 32) != 0) {
            groupPolicyProperty4 = groupDetailModel.patchManagementPolicy;
        }
        if ((i & 64) != 0) {
            bool = groupDetailModel.allDevicesSupportRemoveMySelfAsManager;
        }
        GroupPolicyProperty groupPolicyProperty5 = groupPolicyProperty4;
        Boolean bool2 = bool;
        GroupPolicyProperty groupPolicyProperty6 = groupPolicyProperty3;
        GroupPolicyProperty groupPolicyProperty7 = groupPolicyProperty;
        return groupDetailModel.copy(deviceStateDisplayNameProperty, list, groupPolicyProperty7, groupPolicyProperty2, groupPolicyProperty6, groupPolicyProperty5, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DeviceStateDisplayNameProperty getDisplayName() {
        return this.displayName;
    }

    public final List<DeviceStateManagerId> component2() {
        return this.managers;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final GroupPolicyProperty getPolicy() {
        return this.policy;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final GroupPolicyProperty getBackupPolicy() {
        return this.backupPolicy;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final GroupPolicyProperty getMonitoringPolicy() {
        return this.monitoringPolicy;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final GroupPolicyProperty getPatchManagementPolicy() {
        return this.patchManagementPolicy;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getAllDevicesSupportRemoveMySelfAsManager() {
        return this.allDevicesSupportRemoveMySelfAsManager;
    }

    public final GroupDetailModel copy(@sp3(name = "displayName") DeviceStateDisplayNameProperty displayName, @sp3(name = "managers") List<DeviceStateManagerId> managers, @sp3(name = "policy") GroupPolicyProperty policy, @sp3(name = "backupPolicy") GroupPolicyProperty backupPolicy, @sp3(name = "monitoringPolicy") GroupPolicyProperty monitoringPolicy, @sp3(name = "patchManagementPolicy") GroupPolicyProperty patchManagementPolicy, @sp3(name = "allDevicesSupportRemoveMySelfAsManager") Boolean allDevicesSupportRemoveMySelfAsManager) {
        return new GroupDetailModel(displayName, managers, policy, backupPolicy, monitoringPolicy, patchManagementPolicy, allDevicesSupportRemoveMySelfAsManager);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupDetailModel)) {
            return false;
        }
        GroupDetailModel groupDetailModel = (GroupDetailModel) other;
        return im3.n(this.displayName, groupDetailModel.displayName) && im3.n(this.managers, groupDetailModel.managers) && im3.n(this.policy, groupDetailModel.policy) && im3.n(this.backupPolicy, groupDetailModel.backupPolicy) && im3.n(this.monitoringPolicy, groupDetailModel.monitoringPolicy) && im3.n(this.patchManagementPolicy, groupDetailModel.patchManagementPolicy) && im3.n(this.allDevicesSupportRemoveMySelfAsManager, groupDetailModel.allDevicesSupportRemoveMySelfAsManager);
    }

    public final Boolean getAllDevicesSupportRemoveMySelfAsManager() {
        return this.allDevicesSupportRemoveMySelfAsManager;
    }

    public final GroupPolicyProperty getBackupPolicy() {
        return this.backupPolicy;
    }

    public final DeviceStateDisplayNameProperty getDisplayName() {
        return this.displayName;
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

    public int hashCode() {
        DeviceStateDisplayNameProperty deviceStateDisplayNameProperty = this.displayName;
        int iHashCode = (deviceStateDisplayNameProperty == null ? 0 : deviceStateDisplayNameProperty.hashCode()) * 31;
        List<DeviceStateManagerId> list = this.managers;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        GroupPolicyProperty groupPolicyProperty = this.policy;
        int iHashCode3 = (iHashCode2 + (groupPolicyProperty == null ? 0 : groupPolicyProperty.hashCode())) * 31;
        GroupPolicyProperty groupPolicyProperty2 = this.backupPolicy;
        int iHashCode4 = (iHashCode3 + (groupPolicyProperty2 == null ? 0 : groupPolicyProperty2.hashCode())) * 31;
        GroupPolicyProperty groupPolicyProperty3 = this.monitoringPolicy;
        int iHashCode5 = (iHashCode4 + (groupPolicyProperty3 == null ? 0 : groupPolicyProperty3.hashCode())) * 31;
        GroupPolicyProperty groupPolicyProperty4 = this.patchManagementPolicy;
        int iHashCode6 = (iHashCode5 + (groupPolicyProperty4 == null ? 0 : groupPolicyProperty4.hashCode())) * 31;
        Boolean bool = this.allDevicesSupportRemoveMySelfAsManager;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "GroupDetailModel(displayName=" + this.displayName + ", managers=" + this.managers + ", policy=" + this.policy + ", backupPolicy=" + this.backupPolicy + ", monitoringPolicy=" + this.monitoringPolicy + ", patchManagementPolicy=" + this.patchManagementPolicy + ", allDevicesSupportRemoveMySelfAsManager=" + this.allDevicesSupportRemoveMySelfAsManager + ")";
    }

    public GroupDetailModel(@sp3(name = "displayName") DeviceStateDisplayNameProperty deviceStateDisplayNameProperty, @sp3(name = "managers") List<DeviceStateManagerId> list, @sp3(name = "policy") GroupPolicyProperty groupPolicyProperty, @sp3(name = "backupPolicy") GroupPolicyProperty groupPolicyProperty2, @sp3(name = "monitoringPolicy") GroupPolicyProperty groupPolicyProperty3, @sp3(name = "patchManagementPolicy") GroupPolicyProperty groupPolicyProperty4, @sp3(name = "allDevicesSupportRemoveMySelfAsManager") Boolean bool) {
        this.displayName = deviceStateDisplayNameProperty;
        this.managers = list;
        this.policy = groupPolicyProperty;
        this.backupPolicy = groupPolicyProperty2;
        this.monitoringPolicy = groupPolicyProperty3;
        this.patchManagementPolicy = groupPolicyProperty4;
        this.allDevicesSupportRemoveMySelfAsManager = bool;
    }

    public GroupDetailModel() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
