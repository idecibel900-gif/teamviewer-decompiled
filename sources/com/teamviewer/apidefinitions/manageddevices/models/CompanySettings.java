package com.teamviewer.apidefinitions.manageddevices.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/CompanySettings;", "", "deviceGroupManagementPolicy", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceGroupManagementPolicy;", "permissionsInheritancePolicy", "Lcom/teamviewer/apidefinitions/manageddevices/models/PermissionsInheritancePolicy;", "<init>", "(Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceGroupManagementPolicy;Lcom/teamviewer/apidefinitions/manageddevices/models/PermissionsInheritancePolicy;)V", "getDeviceGroupManagementPolicy", "()Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceGroupManagementPolicy;", "getPermissionsInheritancePolicy", "()Lcom/teamviewer/apidefinitions/manageddevices/models/PermissionsInheritancePolicy;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CompanySettings {
    private final DeviceGroupManagementPolicy deviceGroupManagementPolicy;
    private final PermissionsInheritancePolicy permissionsInheritancePolicy;

    public /* synthetic */ CompanySettings(DeviceGroupManagementPolicy deviceGroupManagementPolicy, PermissionsInheritancePolicy permissionsInheritancePolicy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : deviceGroupManagementPolicy, (i & 2) != 0 ? null : permissionsInheritancePolicy);
    }

    public static /* synthetic */ CompanySettings copy$default(CompanySettings companySettings, DeviceGroupManagementPolicy deviceGroupManagementPolicy, PermissionsInheritancePolicy permissionsInheritancePolicy, int i, Object obj) {
        if ((i & 1) != 0) {
            deviceGroupManagementPolicy = companySettings.deviceGroupManagementPolicy;
        }
        if ((i & 2) != 0) {
            permissionsInheritancePolicy = companySettings.permissionsInheritancePolicy;
        }
        return companySettings.copy(deviceGroupManagementPolicy, permissionsInheritancePolicy);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DeviceGroupManagementPolicy getDeviceGroupManagementPolicy() {
        return this.deviceGroupManagementPolicy;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PermissionsInheritancePolicy getPermissionsInheritancePolicy() {
        return this.permissionsInheritancePolicy;
    }

    public final CompanySettings copy(@sp3(name = "deviceGroupManagementPolicy") DeviceGroupManagementPolicy deviceGroupManagementPolicy, @sp3(name = "permissionsInheritancePolicy") PermissionsInheritancePolicy permissionsInheritancePolicy) {
        return new CompanySettings(deviceGroupManagementPolicy, permissionsInheritancePolicy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompanySettings)) {
            return false;
        }
        CompanySettings companySettings = (CompanySettings) other;
        return this.deviceGroupManagementPolicy == companySettings.deviceGroupManagementPolicy && this.permissionsInheritancePolicy == companySettings.permissionsInheritancePolicy;
    }

    public final DeviceGroupManagementPolicy getDeviceGroupManagementPolicy() {
        return this.deviceGroupManagementPolicy;
    }

    public final PermissionsInheritancePolicy getPermissionsInheritancePolicy() {
        return this.permissionsInheritancePolicy;
    }

    public int hashCode() {
        DeviceGroupManagementPolicy deviceGroupManagementPolicy = this.deviceGroupManagementPolicy;
        int iHashCode = (deviceGroupManagementPolicy == null ? 0 : deviceGroupManagementPolicy.hashCode()) * 31;
        PermissionsInheritancePolicy permissionsInheritancePolicy = this.permissionsInheritancePolicy;
        return iHashCode + (permissionsInheritancePolicy != null ? permissionsInheritancePolicy.hashCode() : 0);
    }

    public String toString() {
        return "CompanySettings(deviceGroupManagementPolicy=" + this.deviceGroupManagementPolicy + ", permissionsInheritancePolicy=" + this.permissionsInheritancePolicy + ")";
    }

    public CompanySettings(@sp3(name = "deviceGroupManagementPolicy") DeviceGroupManagementPolicy deviceGroupManagementPolicy, @sp3(name = "permissionsInheritancePolicy") PermissionsInheritancePolicy permissionsInheritancePolicy) {
        this.deviceGroupManagementPolicy = deviceGroupManagementPolicy;
        this.permissionsInheritancePolicy = permissionsInheritancePolicy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CompanySettings() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
