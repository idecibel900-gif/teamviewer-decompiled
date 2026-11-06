package com.teamviewer.apidefinitions.manageddevices.models;

import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u008a\u0001\u0010+\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00063"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/EditDeviceProperties;", "", "deviceIds", "", "Ljava/util/UUID;", "removeMyselfAsManager", "", "groupIds", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStateGroupId;", "managers", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStateManagerId;", "policy", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStatePolicyProperty;", "backupPolicy", "monitoringPolicy", "patchManagementPolicy", "allowPermissionsInheritance", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStateAllowPermissionsInheritanceProperty;", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStatePolicyProperty;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStatePolicyProperty;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStatePolicyProperty;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStatePolicyProperty;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStateAllowPermissionsInheritanceProperty;)V", "getDeviceIds", "()Ljava/util/List;", "getRemoveMyselfAsManager", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getGroupIds", "getManagers", "getPolicy", "()Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStatePolicyProperty;", "getBackupPolicy", "getMonitoringPolicy", "getPatchManagementPolicy", "getAllowPermissionsInheritance", "()Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStateAllowPermissionsInheritanceProperty;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStatePolicyProperty;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStatePolicyProperty;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStatePolicyProperty;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStatePolicyProperty;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStateAllowPermissionsInheritanceProperty;)Lcom/teamviewer/apidefinitions/manageddevices/models/EditDeviceProperties;", "equals", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EditDeviceProperties {
    private final DeviceStateAllowPermissionsInheritanceProperty allowPermissionsInheritance;
    private final DeviceStatePolicyProperty backupPolicy;
    private final List<UUID> deviceIds;
    private final List<DeviceStateGroupId> groupIds;
    private final List<DeviceStateManagerId> managers;
    private final DeviceStatePolicyProperty monitoringPolicy;
    private final DeviceStatePolicyProperty patchManagementPolicy;
    private final DeviceStatePolicyProperty policy;
    private final Boolean removeMyselfAsManager;

    public /* synthetic */ EditDeviceProperties(List list, Boolean bool, List list2, List list3, DeviceStatePolicyProperty deviceStatePolicyProperty, DeviceStatePolicyProperty deviceStatePolicyProperty2, DeviceStatePolicyProperty deviceStatePolicyProperty3, DeviceStatePolicyProperty deviceStatePolicyProperty4, DeviceStateAllowPermissionsInheritanceProperty deviceStateAllowPermissionsInheritanceProperty, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : deviceStatePolicyProperty, (i & 32) != 0 ? null : deviceStatePolicyProperty2, (i & 64) != 0 ? null : deviceStatePolicyProperty3, (i & 128) != 0 ? null : deviceStatePolicyProperty4, (i & 256) != 0 ? null : deviceStateAllowPermissionsInheritanceProperty);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditDeviceProperties copy$default(EditDeviceProperties editDeviceProperties, List list, Boolean bool, List list2, List list3, DeviceStatePolicyProperty deviceStatePolicyProperty, DeviceStatePolicyProperty deviceStatePolicyProperty2, DeviceStatePolicyProperty deviceStatePolicyProperty3, DeviceStatePolicyProperty deviceStatePolicyProperty4, DeviceStateAllowPermissionsInheritanceProperty deviceStateAllowPermissionsInheritanceProperty, int i, Object obj) {
        if ((i & 1) != 0) {
            list = editDeviceProperties.deviceIds;
        }
        if ((i & 2) != 0) {
            bool = editDeviceProperties.removeMyselfAsManager;
        }
        if ((i & 4) != 0) {
            list2 = editDeviceProperties.groupIds;
        }
        if ((i & 8) != 0) {
            list3 = editDeviceProperties.managers;
        }
        if ((i & 16) != 0) {
            deviceStatePolicyProperty = editDeviceProperties.policy;
        }
        if ((i & 32) != 0) {
            deviceStatePolicyProperty2 = editDeviceProperties.backupPolicy;
        }
        if ((i & 64) != 0) {
            deviceStatePolicyProperty3 = editDeviceProperties.monitoringPolicy;
        }
        if ((i & 128) != 0) {
            deviceStatePolicyProperty4 = editDeviceProperties.patchManagementPolicy;
        }
        if ((i & 256) != 0) {
            deviceStateAllowPermissionsInheritanceProperty = editDeviceProperties.allowPermissionsInheritance;
        }
        DeviceStatePolicyProperty deviceStatePolicyProperty5 = deviceStatePolicyProperty4;
        DeviceStateAllowPermissionsInheritanceProperty deviceStateAllowPermissionsInheritanceProperty2 = deviceStateAllowPermissionsInheritanceProperty;
        DeviceStatePolicyProperty deviceStatePolicyProperty6 = deviceStatePolicyProperty2;
        DeviceStatePolicyProperty deviceStatePolicyProperty7 = deviceStatePolicyProperty3;
        DeviceStatePolicyProperty deviceStatePolicyProperty8 = deviceStatePolicyProperty;
        List list4 = list2;
        return editDeviceProperties.copy(list, bool, list4, list3, deviceStatePolicyProperty8, deviceStatePolicyProperty6, deviceStatePolicyProperty7, deviceStatePolicyProperty5, deviceStateAllowPermissionsInheritanceProperty2);
    }

    public final List<UUID> component1() {
        return this.deviceIds;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getRemoveMyselfAsManager() {
        return this.removeMyselfAsManager;
    }

    public final List<DeviceStateGroupId> component3() {
        return this.groupIds;
    }

    public final List<DeviceStateManagerId> component4() {
        return this.managers;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DeviceStatePolicyProperty getPolicy() {
        return this.policy;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DeviceStatePolicyProperty getBackupPolicy() {
        return this.backupPolicy;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final DeviceStatePolicyProperty getMonitoringPolicy() {
        return this.monitoringPolicy;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final DeviceStatePolicyProperty getPatchManagementPolicy() {
        return this.patchManagementPolicy;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final DeviceStateAllowPermissionsInheritanceProperty getAllowPermissionsInheritance() {
        return this.allowPermissionsInheritance;
    }

    public final EditDeviceProperties copy(@sp3(name = "deviceIds") List<UUID> deviceIds, @sp3(name = "removeMyselfAsManager") Boolean removeMyselfAsManager, @sp3(name = "groupIds") List<DeviceStateGroupId> groupIds, @sp3(name = "managers") List<DeviceStateManagerId> managers, @sp3(name = "policy") DeviceStatePolicyProperty policy, @sp3(name = "backupPolicy") DeviceStatePolicyProperty backupPolicy, @sp3(name = "monitoringPolicy") DeviceStatePolicyProperty monitoringPolicy, @sp3(name = "patchManagementPolicy") DeviceStatePolicyProperty patchManagementPolicy, @sp3(name = "allowPermissionsInheritance") DeviceStateAllowPermissionsInheritanceProperty allowPermissionsInheritance) {
        deviceIds.getClass();
        return new EditDeviceProperties(deviceIds, removeMyselfAsManager, groupIds, managers, policy, backupPolicy, monitoringPolicy, patchManagementPolicy, allowPermissionsInheritance);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditDeviceProperties)) {
            return false;
        }
        EditDeviceProperties editDeviceProperties = (EditDeviceProperties) other;
        return im3.n(this.deviceIds, editDeviceProperties.deviceIds) && im3.n(this.removeMyselfAsManager, editDeviceProperties.removeMyselfAsManager) && im3.n(this.groupIds, editDeviceProperties.groupIds) && im3.n(this.managers, editDeviceProperties.managers) && im3.n(this.policy, editDeviceProperties.policy) && im3.n(this.backupPolicy, editDeviceProperties.backupPolicy) && im3.n(this.monitoringPolicy, editDeviceProperties.monitoringPolicy) && im3.n(this.patchManagementPolicy, editDeviceProperties.patchManagementPolicy) && im3.n(this.allowPermissionsInheritance, editDeviceProperties.allowPermissionsInheritance);
    }

    public final DeviceStateAllowPermissionsInheritanceProperty getAllowPermissionsInheritance() {
        return this.allowPermissionsInheritance;
    }

    public final DeviceStatePolicyProperty getBackupPolicy() {
        return this.backupPolicy;
    }

    public final List<UUID> getDeviceIds() {
        return this.deviceIds;
    }

    public final List<DeviceStateGroupId> getGroupIds() {
        return this.groupIds;
    }

    public final List<DeviceStateManagerId> getManagers() {
        return this.managers;
    }

    public final DeviceStatePolicyProperty getMonitoringPolicy() {
        return this.monitoringPolicy;
    }

    public final DeviceStatePolicyProperty getPatchManagementPolicy() {
        return this.patchManagementPolicy;
    }

    public final DeviceStatePolicyProperty getPolicy() {
        return this.policy;
    }

    public final Boolean getRemoveMyselfAsManager() {
        return this.removeMyselfAsManager;
    }

    public int hashCode() {
        int iHashCode = this.deviceIds.hashCode() * 31;
        Boolean bool = this.removeMyselfAsManager;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List<DeviceStateGroupId> list = this.groupIds;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<DeviceStateManagerId> list2 = this.managers;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        DeviceStatePolicyProperty deviceStatePolicyProperty = this.policy;
        int iHashCode5 = (iHashCode4 + (deviceStatePolicyProperty == null ? 0 : deviceStatePolicyProperty.hashCode())) * 31;
        DeviceStatePolicyProperty deviceStatePolicyProperty2 = this.backupPolicy;
        int iHashCode6 = (iHashCode5 + (deviceStatePolicyProperty2 == null ? 0 : deviceStatePolicyProperty2.hashCode())) * 31;
        DeviceStatePolicyProperty deviceStatePolicyProperty3 = this.monitoringPolicy;
        int iHashCode7 = (iHashCode6 + (deviceStatePolicyProperty3 == null ? 0 : deviceStatePolicyProperty3.hashCode())) * 31;
        DeviceStatePolicyProperty deviceStatePolicyProperty4 = this.patchManagementPolicy;
        int iHashCode8 = (iHashCode7 + (deviceStatePolicyProperty4 == null ? 0 : deviceStatePolicyProperty4.hashCode())) * 31;
        DeviceStateAllowPermissionsInheritanceProperty deviceStateAllowPermissionsInheritanceProperty = this.allowPermissionsInheritance;
        return iHashCode8 + (deviceStateAllowPermissionsInheritanceProperty != null ? deviceStateAllowPermissionsInheritanceProperty.hashCode() : 0);
    }

    public String toString() {
        return "EditDeviceProperties(deviceIds=" + this.deviceIds + ", removeMyselfAsManager=" + this.removeMyselfAsManager + ", groupIds=" + this.groupIds + ", managers=" + this.managers + ", policy=" + this.policy + ", backupPolicy=" + this.backupPolicy + ", monitoringPolicy=" + this.monitoringPolicy + ", patchManagementPolicy=" + this.patchManagementPolicy + ", allowPermissionsInheritance=" + this.allowPermissionsInheritance + ")";
    }

    public EditDeviceProperties(@sp3(name = "deviceIds") List<UUID> list, @sp3(name = "removeMyselfAsManager") Boolean bool, @sp3(name = "groupIds") List<DeviceStateGroupId> list2, @sp3(name = "managers") List<DeviceStateManagerId> list3, @sp3(name = "policy") DeviceStatePolicyProperty deviceStatePolicyProperty, @sp3(name = "backupPolicy") DeviceStatePolicyProperty deviceStatePolicyProperty2, @sp3(name = "monitoringPolicy") DeviceStatePolicyProperty deviceStatePolicyProperty3, @sp3(name = "patchManagementPolicy") DeviceStatePolicyProperty deviceStatePolicyProperty4, @sp3(name = "allowPermissionsInheritance") DeviceStateAllowPermissionsInheritanceProperty deviceStateAllowPermissionsInheritanceProperty) {
        list.getClass();
        this.deviceIds = list;
        this.removeMyselfAsManager = bool;
        this.groupIds = list2;
        this.managers = list3;
        this.policy = deviceStatePolicyProperty;
        this.backupPolicy = deviceStatePolicyProperty2;
        this.monitoringPolicy = deviceStatePolicyProperty3;
        this.patchManagementPolicy = deviceStatePolicyProperty4;
        this.allowPermissionsInheritance = deviceStateAllowPermissionsInheritanceProperty;
    }
}
