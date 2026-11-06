package com.teamviewer.apidefinitions.legacydevices.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.fx3;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b2\b\u0086\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\t\u00108\u001a\u00020\tHÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\fHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010A\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010B\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010C\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010D\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010E\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010F\u001a\u0004\u0018\u00010\u001bHÆ\u0003JÚ\u0001\u0010G\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÆ\u0001¢\u0006\u0002\u0010HJ\u0013\u0010I\u001a\u00020\f2\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010K\u001a\u00020\u0003HÖ\u0001J\t\u0010L\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010'R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010/\u001a\u0004\b\u0014\u0010.R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010/\u001a\u0004\b\u0015\u0010.R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010/\u001a\u0004\b\u0016\u0010.R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010/\u001a\u0004\b\u0017\u0010.R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010/\u001a\u0004\b1\u0010.R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010/\u001a\u0004\b2\u0010.R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b3\u00104¨\u0006M"}, d2 = {"Lcom/teamviewer/apidefinitions/legacydevices/models/Device;", "", "deviceId", "", "teamViewerId", "", "displayName", "", "onlineStatus", "Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceOnlineStatus;", "groupId", "isManagedDevice", "", "deviceType", "Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceType;", "notes", "managedState", "Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceManagedState;", "hasMonitoringActivated", "description", "isMobileWakeActivated", "isWakeOnLanPossible", "isBackupActivated", "isKnownDevice", "hasPermanentPassword", "hasPersonalPassword", "policyAssignment", "Lcom/teamviewer/apidefinitions/legacydevices/models/PolicyAssignment;", "<init>", "(IJLjava/lang/String;Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceOnlineStatus;IZLcom/teamviewer/apidefinitions/legacydevices/models/DeviceType;Ljava/lang/String;Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceManagedState;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/teamviewer/apidefinitions/legacydevices/models/PolicyAssignment;)V", "getDeviceId", "()I", "getTeamViewerId", "()J", "getDisplayName", "()Ljava/lang/String;", "getOnlineStatus", "()Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceOnlineStatus;", "getGroupId", "()Z", "getDeviceType", "()Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceType;", "getNotes", "getManagedState", "()Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceManagedState;", "getHasMonitoringActivated", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDescription", "getHasPermanentPassword", "getHasPersonalPassword", "getPolicyAssignment", "()Lcom/teamviewer/apidefinitions/legacydevices/models/PolicyAssignment;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(IJLjava/lang/String;Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceOnlineStatus;IZLcom/teamviewer/apidefinitions/legacydevices/models/DeviceType;Ljava/lang/String;Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceManagedState;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/teamviewer/apidefinitions/legacydevices/models/PolicyAssignment;)Lcom/teamviewer/apidefinitions/legacydevices/models/Device;", "equals", "other", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Device {
    private final String description;
    private final int deviceId;
    private final DeviceType deviceType;
    private final String displayName;
    private final int groupId;
    private final Boolean hasMonitoringActivated;
    private final Boolean hasPermanentPassword;
    private final Boolean hasPersonalPassword;
    private final Boolean isBackupActivated;
    private final Boolean isKnownDevice;
    private final boolean isManagedDevice;
    private final Boolean isMobileWakeActivated;
    private final Boolean isWakeOnLanPossible;
    private final DeviceManagedState managedState;
    private final String notes;
    private final DeviceOnlineStatus onlineStatus;
    private final PolicyAssignment policyAssignment;
    private final long teamViewerId;

    public /* synthetic */ Device(int i, long j, String str, DeviceOnlineStatus deviceOnlineStatus, int i2, boolean z, DeviceType deviceType, String str2, DeviceManagedState deviceManagedState, Boolean bool, String str3, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, PolicyAssignment policyAssignment, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, j, str, deviceOnlineStatus, i2, z, (i3 & 64) != 0 ? null : deviceType, (i3 & 128) != 0 ? null : str2, (i3 & 256) != 0 ? null : deviceManagedState, (i3 & 512) != 0 ? null : bool, (i3 & 1024) != 0 ? null : str3, (i3 & 2048) != 0 ? null : bool2, (i3 & 4096) != 0 ? null : bool3, (i3 & 8192) != 0 ? null : bool4, (i3 & 16384) != 0 ? null : bool5, (32768 & i3) != 0 ? null : bool6, (65536 & i3) != 0 ? null : bool7, (i3 & 131072) != 0 ? null : policyAssignment);
    }

    public static /* synthetic */ Device copy$default(Device device, int i, long j, String str, DeviceOnlineStatus deviceOnlineStatus, int i2, boolean z, DeviceType deviceType, String str2, DeviceManagedState deviceManagedState, Boolean bool, String str3, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, PolicyAssignment policyAssignment, int i3, Object obj) {
        PolicyAssignment policyAssignment2;
        Boolean bool8;
        int i4 = (i3 & 1) != 0 ? device.deviceId : i;
        long j2 = (i3 & 2) != 0 ? device.teamViewerId : j;
        String str4 = (i3 & 4) != 0 ? device.displayName : str;
        DeviceOnlineStatus deviceOnlineStatus2 = (i3 & 8) != 0 ? device.onlineStatus : deviceOnlineStatus;
        int i5 = (i3 & 16) != 0 ? device.groupId : i2;
        boolean z2 = (i3 & 32) != 0 ? device.isManagedDevice : z;
        DeviceType deviceType2 = (i3 & 64) != 0 ? device.deviceType : deviceType;
        String str5 = (i3 & 128) != 0 ? device.notes : str2;
        DeviceManagedState deviceManagedState2 = (i3 & 256) != 0 ? device.managedState : deviceManagedState;
        Boolean bool9 = (i3 & 512) != 0 ? device.hasMonitoringActivated : bool;
        String str6 = (i3 & 1024) != 0 ? device.description : str3;
        Boolean bool10 = (i3 & 2048) != 0 ? device.isMobileWakeActivated : bool2;
        Boolean bool11 = (i3 & 4096) != 0 ? device.isWakeOnLanPossible : bool3;
        int i6 = i4;
        Boolean bool12 = (i3 & 8192) != 0 ? device.isBackupActivated : bool4;
        Boolean bool13 = (i3 & 16384) != 0 ? device.isKnownDevice : bool5;
        Boolean bool14 = (i3 & 32768) != 0 ? device.hasPermanentPassword : bool6;
        Boolean bool15 = (i3 & 65536) != 0 ? device.hasPersonalPassword : bool7;
        if ((i3 & 131072) != 0) {
            bool8 = bool15;
            policyAssignment2 = device.policyAssignment;
        } else {
            policyAssignment2 = policyAssignment;
            bool8 = bool15;
        }
        return device.copy(i6, j2, str4, deviceOnlineStatus2, i5, z2, deviceType2, str5, deviceManagedState2, bool9, str6, bool10, bool11, bool12, bool13, bool14, bool8, policyAssignment2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getHasMonitoringActivated() {
        return this.hasMonitoringActivated;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getIsMobileWakeActivated() {
        return this.isMobileWakeActivated;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getIsWakeOnLanPossible() {
        return this.isWakeOnLanPossible;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Boolean getIsBackupActivated() {
        return this.isBackupActivated;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Boolean getIsKnownDevice() {
        return this.isKnownDevice;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Boolean getHasPermanentPassword() {
        return this.hasPermanentPassword;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Boolean getHasPersonalPassword() {
        return this.hasPersonalPassword;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final PolicyAssignment getPolicyAssignment() {
        return this.policyAssignment;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTeamViewerId() {
        return this.teamViewerId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DeviceOnlineStatus getOnlineStatus() {
        return this.onlineStatus;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getGroupId() {
        return this.groupId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsManagedDevice() {
        return this.isManagedDevice;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final DeviceType getDeviceType() {
        return this.deviceType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getNotes() {
        return this.notes;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final DeviceManagedState getManagedState() {
        return this.managedState;
    }

    public final Device copy(@sp3(name = "deviceId") int deviceId, @sp3(name = "teamViewerId") long teamViewerId, @sp3(name = "displayName") String displayName, @sp3(name = "onlineStatus") DeviceOnlineStatus onlineStatus, @sp3(name = "groupId") int groupId, @sp3(name = "isManagedDevice") boolean isManagedDevice, @sp3(name = "deviceType") DeviceType deviceType, @sp3(name = "notes") String notes, @sp3(name = "managedState") DeviceManagedState managedState, @sp3(name = "hasMonitoringActivated") Boolean hasMonitoringActivated, @sp3(name = "description") String description, @sp3(name = "isMobileWakeActivated") Boolean isMobileWakeActivated, @sp3(name = "isWakeOnLanPossible") Boolean isWakeOnLanPossible, @sp3(name = "isBackupActivated") Boolean isBackupActivated, @sp3(name = "isKnownDevice") Boolean isKnownDevice, @sp3(name = "hasPermanentPassword") Boolean hasPermanentPassword, @sp3(name = "hasPersonalPassword") Boolean hasPersonalPassword, @sp3(name = "policyAssignment") PolicyAssignment policyAssignment) {
        displayName.getClass();
        onlineStatus.getClass();
        return new Device(deviceId, teamViewerId, displayName, onlineStatus, groupId, isManagedDevice, deviceType, notes, managedState, hasMonitoringActivated, description, isMobileWakeActivated, isWakeOnLanPossible, isBackupActivated, isKnownDevice, hasPermanentPassword, hasPersonalPassword, policyAssignment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Device)) {
            return false;
        }
        Device device = (Device) other;
        return this.deviceId == device.deviceId && this.teamViewerId == device.teamViewerId && im3.n(this.displayName, device.displayName) && this.onlineStatus == device.onlineStatus && this.groupId == device.groupId && this.isManagedDevice == device.isManagedDevice && this.deviceType == device.deviceType && im3.n(this.notes, device.notes) && this.managedState == device.managedState && im3.n(this.hasMonitoringActivated, device.hasMonitoringActivated) && im3.n(this.description, device.description) && im3.n(this.isMobileWakeActivated, device.isMobileWakeActivated) && im3.n(this.isWakeOnLanPossible, device.isWakeOnLanPossible) && im3.n(this.isBackupActivated, device.isBackupActivated) && im3.n(this.isKnownDevice, device.isKnownDevice) && im3.n(this.hasPermanentPassword, device.hasPermanentPassword) && im3.n(this.hasPersonalPassword, device.hasPersonalPassword) && im3.n(this.policyAssignment, device.policyAssignment);
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getDeviceId() {
        return this.deviceId;
    }

    public final DeviceType getDeviceType() {
        return this.deviceType;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final int getGroupId() {
        return this.groupId;
    }

    public final Boolean getHasMonitoringActivated() {
        return this.hasMonitoringActivated;
    }

    public final Boolean getHasPermanentPassword() {
        return this.hasPermanentPassword;
    }

    public final Boolean getHasPersonalPassword() {
        return this.hasPersonalPassword;
    }

    public final DeviceManagedState getManagedState() {
        return this.managedState;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final DeviceOnlineStatus getOnlineStatus() {
        return this.onlineStatus;
    }

    public final PolicyAssignment getPolicyAssignment() {
        return this.policyAssignment;
    }

    public final long getTeamViewerId() {
        return this.teamViewerId;
    }

    public int hashCode() {
        int iF = to7.f(fx3.a(this.groupId, (this.onlineStatus.hashCode() + to7.e(fx3.c(Integer.hashCode(this.deviceId) * 31, 31, this.teamViewerId), 31, this.displayName)) * 31, 31), 31, this.isManagedDevice);
        DeviceType deviceType = this.deviceType;
        int iHashCode = (iF + (deviceType == null ? 0 : deviceType.hashCode())) * 31;
        String str = this.notes;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DeviceManagedState deviceManagedState = this.managedState;
        int iHashCode3 = (iHashCode2 + (deviceManagedState == null ? 0 : deviceManagedState.hashCode())) * 31;
        Boolean bool = this.hasMonitoringActivated;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool2 = this.isMobileWakeActivated;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isWakeOnLanPossible;
        int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isBackupActivated;
        int iHashCode8 = (iHashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isKnownDevice;
        int iHashCode9 = (iHashCode8 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.hasPermanentPassword;
        int iHashCode10 = (iHashCode9 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.hasPersonalPassword;
        int iHashCode11 = (iHashCode10 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        PolicyAssignment policyAssignment = this.policyAssignment;
        return iHashCode11 + (policyAssignment != null ? policyAssignment.hashCode() : 0);
    }

    public final Boolean isBackupActivated() {
        return this.isBackupActivated;
    }

    public final Boolean isKnownDevice() {
        return this.isKnownDevice;
    }

    public final boolean isManagedDevice() {
        return this.isManagedDevice;
    }

    public final Boolean isMobileWakeActivated() {
        return this.isMobileWakeActivated;
    }

    public final Boolean isWakeOnLanPossible() {
        return this.isWakeOnLanPossible;
    }

    public String toString() {
        return "Device(deviceId=" + this.deviceId + ", teamViewerId=" + this.teamViewerId + ", displayName=" + this.displayName + ", onlineStatus=" + this.onlineStatus + ", groupId=" + this.groupId + ", isManagedDevice=" + this.isManagedDevice + ", deviceType=" + this.deviceType + ", notes=" + this.notes + ", managedState=" + this.managedState + ", hasMonitoringActivated=" + this.hasMonitoringActivated + ", description=" + this.description + ", isMobileWakeActivated=" + this.isMobileWakeActivated + ", isWakeOnLanPossible=" + this.isWakeOnLanPossible + ", isBackupActivated=" + this.isBackupActivated + ", isKnownDevice=" + this.isKnownDevice + ", hasPermanentPassword=" + this.hasPermanentPassword + ", hasPersonalPassword=" + this.hasPersonalPassword + ", policyAssignment=" + this.policyAssignment + ")";
    }

    public Device(@sp3(name = "deviceId") int i, @sp3(name = "teamViewerId") long j, @sp3(name = "displayName") String str, @sp3(name = "onlineStatus") DeviceOnlineStatus deviceOnlineStatus, @sp3(name = "groupId") int i2, @sp3(name = "isManagedDevice") boolean z, @sp3(name = "deviceType") DeviceType deviceType, @sp3(name = "notes") String str2, @sp3(name = "managedState") DeviceManagedState deviceManagedState, @sp3(name = "hasMonitoringActivated") Boolean bool, @sp3(name = "description") String str3, @sp3(name = "isMobileWakeActivated") Boolean bool2, @sp3(name = "isWakeOnLanPossible") Boolean bool3, @sp3(name = "isBackupActivated") Boolean bool4, @sp3(name = "isKnownDevice") Boolean bool5, @sp3(name = "hasPermanentPassword") Boolean bool6, @sp3(name = "hasPersonalPassword") Boolean bool7, @sp3(name = "policyAssignment") PolicyAssignment policyAssignment) {
        str.getClass();
        deviceOnlineStatus.getClass();
        this.deviceId = i;
        this.teamViewerId = j;
        this.displayName = str;
        this.onlineStatus = deviceOnlineStatus;
        this.groupId = i2;
        this.isManagedDevice = z;
        this.deviceType = deviceType;
        this.notes = str2;
        this.managedState = deviceManagedState;
        this.hasMonitoringActivated = bool;
        this.description = str3;
        this.isMobileWakeActivated = bool2;
        this.isWakeOnLanPossible = bool3;
        this.isBackupActivated = bool4;
        this.isKnownDevice = bool5;
        this.hasPermanentPassword = bool6;
        this.hasPersonalPassword = bool7;
        this.policyAssignment = policyAssignment;
    }
}
