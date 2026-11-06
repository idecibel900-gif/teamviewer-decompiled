package com.teamviewer.apidefinitions.manageddevices.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0081\u0001\u0010+\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00063"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStateDetailModel;", "", "displayName", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStateDisplayNameProperty;", "description", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStateDescription;", "managers", "", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStateManagerId;", "groupIds", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStateGroupId;", "policy", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStatePolicyProperty;", "monitoringPolicy", "backupPolicy", "patchManagementPolicy", "allowPermissionsInheritance", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStateAllowPermissionsInheritanceProperty;", "<init>", "(Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStateDisplayNameProperty;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStateDescription;Ljava/util/List;Ljava/util/List;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStatePolicyProperty;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStatePolicyProperty;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStatePolicyProperty;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStatePolicyProperty;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStateAllowPermissionsInheritanceProperty;)V", "getDisplayName", "()Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStateDisplayNameProperty;", "getDescription", "()Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStateDescription;", "getManagers", "()Ljava/util/List;", "getGroupIds", "getPolicy", "()Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStatePolicyProperty;", "getMonitoringPolicy", "getBackupPolicy", "getPatchManagementPolicy", "getAllowPermissionsInheritance", "()Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStateAllowPermissionsInheritanceProperty;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceStateDetailModel {
    private final DeviceStateAllowPermissionsInheritanceProperty allowPermissionsInheritance;
    private final DeviceStatePolicyProperty backupPolicy;
    private final DeviceStateDescription description;
    private final DeviceStateDisplayNameProperty displayName;
    private final List<DeviceStateGroupId> groupIds;
    private final List<DeviceStateManagerId> managers;
    private final DeviceStatePolicyProperty monitoringPolicy;
    private final DeviceStatePolicyProperty patchManagementPolicy;
    private final DeviceStatePolicyProperty policy;

    public /* synthetic */ DeviceStateDetailModel(DeviceStateDisplayNameProperty deviceStateDisplayNameProperty, DeviceStateDescription deviceStateDescription, List list, List list2, DeviceStatePolicyProperty deviceStatePolicyProperty, DeviceStatePolicyProperty deviceStatePolicyProperty2, DeviceStatePolicyProperty deviceStatePolicyProperty3, DeviceStatePolicyProperty deviceStatePolicyProperty4, DeviceStateAllowPermissionsInheritanceProperty deviceStateAllowPermissionsInheritanceProperty, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : deviceStateDisplayNameProperty, (i & 2) != 0 ? null : deviceStateDescription, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : deviceStatePolicyProperty, (i & 32) != 0 ? null : deviceStatePolicyProperty2, (i & 64) != 0 ? null : deviceStatePolicyProperty3, (i & 128) != 0 ? null : deviceStatePolicyProperty4, (i & 256) != 0 ? null : deviceStateAllowPermissionsInheritanceProperty);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceStateDetailModel copy$default(DeviceStateDetailModel deviceStateDetailModel, DeviceStateDisplayNameProperty deviceStateDisplayNameProperty, DeviceStateDescription deviceStateDescription, List list, List list2, DeviceStatePolicyProperty deviceStatePolicyProperty, DeviceStatePolicyProperty deviceStatePolicyProperty2, DeviceStatePolicyProperty deviceStatePolicyProperty3, DeviceStatePolicyProperty deviceStatePolicyProperty4, DeviceStateAllowPermissionsInheritanceProperty deviceStateAllowPermissionsInheritanceProperty, int i, Object obj) {
        if ((i & 1) != 0) {
            deviceStateDisplayNameProperty = deviceStateDetailModel.displayName;
        }
        if ((i & 2) != 0) {
            deviceStateDescription = deviceStateDetailModel.description;
        }
        if ((i & 4) != 0) {
            list = deviceStateDetailModel.managers;
        }
        if ((i & 8) != 0) {
            list2 = deviceStateDetailModel.groupIds;
        }
        if ((i & 16) != 0) {
            deviceStatePolicyProperty = deviceStateDetailModel.policy;
        }
        if ((i & 32) != 0) {
            deviceStatePolicyProperty2 = deviceStateDetailModel.monitoringPolicy;
        }
        if ((i & 64) != 0) {
            deviceStatePolicyProperty3 = deviceStateDetailModel.backupPolicy;
        }
        if ((i & 128) != 0) {
            deviceStatePolicyProperty4 = deviceStateDetailModel.patchManagementPolicy;
        }
        if ((i & 256) != 0) {
            deviceStateAllowPermissionsInheritanceProperty = deviceStateDetailModel.allowPermissionsInheritance;
        }
        DeviceStatePolicyProperty deviceStatePolicyProperty5 = deviceStatePolicyProperty4;
        DeviceStateAllowPermissionsInheritanceProperty deviceStateAllowPermissionsInheritanceProperty2 = deviceStateAllowPermissionsInheritanceProperty;
        DeviceStatePolicyProperty deviceStatePolicyProperty6 = deviceStatePolicyProperty2;
        DeviceStatePolicyProperty deviceStatePolicyProperty7 = deviceStatePolicyProperty3;
        DeviceStatePolicyProperty deviceStatePolicyProperty8 = deviceStatePolicyProperty;
        List list3 = list;
        return deviceStateDetailModel.copy(deviceStateDisplayNameProperty, deviceStateDescription, list3, list2, deviceStatePolicyProperty8, deviceStatePolicyProperty6, deviceStatePolicyProperty7, deviceStatePolicyProperty5, deviceStateAllowPermissionsInheritanceProperty2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DeviceStateDisplayNameProperty getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DeviceStateDescription getDescription() {
        return this.description;
    }

    public final List<DeviceStateManagerId> component3() {
        return this.managers;
    }

    public final List<DeviceStateGroupId> component4() {
        return this.groupIds;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DeviceStatePolicyProperty getPolicy() {
        return this.policy;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DeviceStatePolicyProperty getMonitoringPolicy() {
        return this.monitoringPolicy;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final DeviceStatePolicyProperty getBackupPolicy() {
        return this.backupPolicy;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final DeviceStatePolicyProperty getPatchManagementPolicy() {
        return this.patchManagementPolicy;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final DeviceStateAllowPermissionsInheritanceProperty getAllowPermissionsInheritance() {
        return this.allowPermissionsInheritance;
    }

    public final DeviceStateDetailModel copy(@sp3(name = "displayName") DeviceStateDisplayNameProperty displayName, @sp3(name = "description") DeviceStateDescription description, @sp3(name = "managers") List<DeviceStateManagerId> managers, @sp3(name = "groupIds") List<DeviceStateGroupId> groupIds, @sp3(name = "policy") DeviceStatePolicyProperty policy, @sp3(name = "monitoringPolicy") DeviceStatePolicyProperty monitoringPolicy, @sp3(name = "backupPolicy") DeviceStatePolicyProperty backupPolicy, @sp3(name = "patchManagementPolicy") DeviceStatePolicyProperty patchManagementPolicy, @sp3(name = "allowPermissionsInheritance") DeviceStateAllowPermissionsInheritanceProperty allowPermissionsInheritance) {
        return new DeviceStateDetailModel(displayName, description, managers, groupIds, policy, monitoringPolicy, backupPolicy, patchManagementPolicy, allowPermissionsInheritance);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceStateDetailModel)) {
            return false;
        }
        DeviceStateDetailModel deviceStateDetailModel = (DeviceStateDetailModel) other;
        return im3.n(this.displayName, deviceStateDetailModel.displayName) && im3.n(this.description, deviceStateDetailModel.description) && im3.n(this.managers, deviceStateDetailModel.managers) && im3.n(this.groupIds, deviceStateDetailModel.groupIds) && im3.n(this.policy, deviceStateDetailModel.policy) && im3.n(this.monitoringPolicy, deviceStateDetailModel.monitoringPolicy) && im3.n(this.backupPolicy, deviceStateDetailModel.backupPolicy) && im3.n(this.patchManagementPolicy, deviceStateDetailModel.patchManagementPolicy) && im3.n(this.allowPermissionsInheritance, deviceStateDetailModel.allowPermissionsInheritance);
    }

    public final DeviceStateAllowPermissionsInheritanceProperty getAllowPermissionsInheritance() {
        return this.allowPermissionsInheritance;
    }

    public final DeviceStatePolicyProperty getBackupPolicy() {
        return this.backupPolicy;
    }

    public final DeviceStateDescription getDescription() {
        return this.description;
    }

    public final DeviceStateDisplayNameProperty getDisplayName() {
        return this.displayName;
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

    public int hashCode() {
        DeviceStateDisplayNameProperty deviceStateDisplayNameProperty = this.displayName;
        int iHashCode = (deviceStateDisplayNameProperty == null ? 0 : deviceStateDisplayNameProperty.hashCode()) * 31;
        DeviceStateDescription deviceStateDescription = this.description;
        int iHashCode2 = (iHashCode + (deviceStateDescription == null ? 0 : deviceStateDescription.hashCode())) * 31;
        List<DeviceStateManagerId> list = this.managers;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<DeviceStateGroupId> list2 = this.groupIds;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        DeviceStatePolicyProperty deviceStatePolicyProperty = this.policy;
        int iHashCode5 = (iHashCode4 + (deviceStatePolicyProperty == null ? 0 : deviceStatePolicyProperty.hashCode())) * 31;
        DeviceStatePolicyProperty deviceStatePolicyProperty2 = this.monitoringPolicy;
        int iHashCode6 = (iHashCode5 + (deviceStatePolicyProperty2 == null ? 0 : deviceStatePolicyProperty2.hashCode())) * 31;
        DeviceStatePolicyProperty deviceStatePolicyProperty3 = this.backupPolicy;
        int iHashCode7 = (iHashCode6 + (deviceStatePolicyProperty3 == null ? 0 : deviceStatePolicyProperty3.hashCode())) * 31;
        DeviceStatePolicyProperty deviceStatePolicyProperty4 = this.patchManagementPolicy;
        int iHashCode8 = (iHashCode7 + (deviceStatePolicyProperty4 == null ? 0 : deviceStatePolicyProperty4.hashCode())) * 31;
        DeviceStateAllowPermissionsInheritanceProperty deviceStateAllowPermissionsInheritanceProperty = this.allowPermissionsInheritance;
        return iHashCode8 + (deviceStateAllowPermissionsInheritanceProperty != null ? deviceStateAllowPermissionsInheritanceProperty.hashCode() : 0);
    }

    public String toString() {
        return "DeviceStateDetailModel(displayName=" + this.displayName + ", description=" + this.description + ", managers=" + this.managers + ", groupIds=" + this.groupIds + ", policy=" + this.policy + ", monitoringPolicy=" + this.monitoringPolicy + ", backupPolicy=" + this.backupPolicy + ", patchManagementPolicy=" + this.patchManagementPolicy + ", allowPermissionsInheritance=" + this.allowPermissionsInheritance + ")";
    }

    public DeviceStateDetailModel(@sp3(name = "displayName") DeviceStateDisplayNameProperty deviceStateDisplayNameProperty, @sp3(name = "description") DeviceStateDescription deviceStateDescription, @sp3(name = "managers") List<DeviceStateManagerId> list, @sp3(name = "groupIds") List<DeviceStateGroupId> list2, @sp3(name = "policy") DeviceStatePolicyProperty deviceStatePolicyProperty, @sp3(name = "monitoringPolicy") DeviceStatePolicyProperty deviceStatePolicyProperty2, @sp3(name = "backupPolicy") DeviceStatePolicyProperty deviceStatePolicyProperty3, @sp3(name = "patchManagementPolicy") DeviceStatePolicyProperty deviceStatePolicyProperty4, @sp3(name = "allowPermissionsInheritance") DeviceStateAllowPermissionsInheritanceProperty deviceStateAllowPermissionsInheritanceProperty) {
        this.displayName = deviceStateDisplayNameProperty;
        this.description = deviceStateDescription;
        this.managers = list;
        this.groupIds = list2;
        this.policy = deviceStatePolicyProperty;
        this.monitoringPolicy = deviceStatePolicyProperty2;
        this.backupPolicy = deviceStatePolicyProperty3;
        this.patchManagementPolicy = deviceStatePolicyProperty4;
        this.allowPermissionsInheritance = deviceStateAllowPermissionsInheritanceProperty;
    }

    public DeviceStateDetailModel() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }
}
