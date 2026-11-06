package com.teamviewer.apidefinitions.legacydevices.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b7\b\u0086\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u00102\u001a\u00020\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010 J\u000b\u00105\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010(J\u000b\u00109\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010,J\u0010\u0010;\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010,J\u0010\u0010<\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010,J\u000b\u0010=\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010,J\u0010\u0010?\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010,J\u0010\u0010@\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010,J\u0010\u0010A\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010,JÌ\u0001\u0010B\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u0010CJ\u0013\u0010D\u001a\u00020\u00112\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020\u0003HÖ\u0001J\t\u0010G\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010-\u001a\u0004\b\u0010\u0010,R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010-\u001a\u0004\b\u0012\u0010,R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010-\u001a\u0004\b\u0013\u0010,R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010-\u001a\u0004\b/\u0010,R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010-\u001a\u0004\b\u0016\u0010,R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010-\u001a\u0004\b0\u0010,R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010-\u001a\u0004\b1\u0010,¨\u0006H"}, d2 = {"Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceDelta;", "", "deviceId", "", "deviceType", "Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceType;", "teamViewerId", "", "displayName", "", "notes", "onlineStatus", "Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceOnlineStatus;", "groupId", "managedState", "Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceManagedState;", "isManagedDevice", "", "isMobileWakeActivated", "isWakeOnLanPossible", "description", "hasMonitoringActivated", "isKnownDevice", "hasPermanentPassword", "hasPersonalPassword", "<init>", "(ILcom/teamviewer/apidefinitions/legacydevices/models/DeviceType;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceOnlineStatus;Ljava/lang/Integer;Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceManagedState;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getDeviceId", "()I", "getDeviceType", "()Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceType;", "getTeamViewerId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDisplayName", "()Ljava/lang/String;", "getNotes", "getOnlineStatus", "()Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceOnlineStatus;", "getGroupId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getManagedState", "()Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceManagedState;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDescription", "getHasMonitoringActivated", "getHasPermanentPassword", "getHasPersonalPassword", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(ILcom/teamviewer/apidefinitions/legacydevices/models/DeviceType;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceOnlineStatus;Ljava/lang/Integer;Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceManagedState;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceDelta;", "equals", "other", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceDelta {
    private final String description;
    private final int deviceId;
    private final DeviceType deviceType;
    private final String displayName;
    private final Integer groupId;
    private final Boolean hasMonitoringActivated;
    private final Boolean hasPermanentPassword;
    private final Boolean hasPersonalPassword;
    private final Boolean isKnownDevice;
    private final Boolean isManagedDevice;
    private final Boolean isMobileWakeActivated;
    private final Boolean isWakeOnLanPossible;
    private final DeviceManagedState managedState;
    private final String notes;
    private final DeviceOnlineStatus onlineStatus;
    private final Long teamViewerId;

    public /* synthetic */ DeviceDelta(int i, DeviceType deviceType, Long l, String str, String str2, DeviceOnlineStatus deviceOnlineStatus, Integer num, DeviceManagedState deviceManagedState, Boolean bool, Boolean bool2, Boolean bool3, String str3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : deviceType, (i2 & 4) != 0 ? null : l, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : deviceOnlineStatus, (i2 & 64) != 0 ? null : num, (i2 & 128) != 0 ? null : deviceManagedState, (i2 & 256) != 0 ? null : bool, (i2 & 512) != 0 ? null : bool2, (i2 & 1024) != 0 ? null : bool3, (i2 & 2048) != 0 ? null : str3, (i2 & 4096) != 0 ? null : bool4, (i2 & 8192) != 0 ? null : bool5, (i2 & 16384) != 0 ? null : bool6, (i2 & 32768) != 0 ? null : bool7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getIsMobileWakeActivated() {
        return this.isMobileWakeActivated;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getIsWakeOnLanPossible() {
        return this.isWakeOnLanPossible;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getHasMonitoringActivated() {
        return this.hasMonitoringActivated;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Boolean getIsKnownDevice() {
        return this.isKnownDevice;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Boolean getHasPermanentPassword() {
        return this.hasPermanentPassword;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Boolean getHasPersonalPassword() {
        return this.hasPersonalPassword;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DeviceType getDeviceType() {
        return this.deviceType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getTeamViewerId() {
        return this.teamViewerId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNotes() {
        return this.notes;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DeviceOnlineStatus getOnlineStatus() {
        return this.onlineStatus;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getGroupId() {
        return this.groupId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final DeviceManagedState getManagedState() {
        return this.managedState;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getIsManagedDevice() {
        return this.isManagedDevice;
    }

    public final DeviceDelta copy(@sp3(name = "deviceId") int deviceId, @sp3(name = "deviceType") DeviceType deviceType, @sp3(name = "teamViewerId") Long teamViewerId, @sp3(name = "displayName") String displayName, @sp3(name = "notes") String notes, @sp3(name = "onlineStatus") DeviceOnlineStatus onlineStatus, @sp3(name = "groupId") Integer groupId, @sp3(name = "managedState") DeviceManagedState managedState, @sp3(name = "isManagedDevice") Boolean isManagedDevice, @sp3(name = "isMobileWakeActivated") Boolean isMobileWakeActivated, @sp3(name = "isWakeOnLanPossible") Boolean isWakeOnLanPossible, @sp3(name = "description") String description, @sp3(name = "hasMonitoringActivated") Boolean hasMonitoringActivated, @sp3(name = "isKnownDevice") Boolean isKnownDevice, @sp3(name = "hasPermanentPassword") Boolean hasPermanentPassword, @sp3(name = "hasPersonalPassword") Boolean hasPersonalPassword) {
        return new DeviceDelta(deviceId, deviceType, teamViewerId, displayName, notes, onlineStatus, groupId, managedState, isManagedDevice, isMobileWakeActivated, isWakeOnLanPossible, description, hasMonitoringActivated, isKnownDevice, hasPermanentPassword, hasPersonalPassword);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceDelta)) {
            return false;
        }
        DeviceDelta deviceDelta = (DeviceDelta) other;
        return this.deviceId == deviceDelta.deviceId && this.deviceType == deviceDelta.deviceType && im3.n(this.teamViewerId, deviceDelta.teamViewerId) && im3.n(this.displayName, deviceDelta.displayName) && im3.n(this.notes, deviceDelta.notes) && this.onlineStatus == deviceDelta.onlineStatus && im3.n(this.groupId, deviceDelta.groupId) && this.managedState == deviceDelta.managedState && im3.n(this.isManagedDevice, deviceDelta.isManagedDevice) && im3.n(this.isMobileWakeActivated, deviceDelta.isMobileWakeActivated) && im3.n(this.isWakeOnLanPossible, deviceDelta.isWakeOnLanPossible) && im3.n(this.description, deviceDelta.description) && im3.n(this.hasMonitoringActivated, deviceDelta.hasMonitoringActivated) && im3.n(this.isKnownDevice, deviceDelta.isKnownDevice) && im3.n(this.hasPermanentPassword, deviceDelta.hasPermanentPassword) && im3.n(this.hasPersonalPassword, deviceDelta.hasPersonalPassword);
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

    public final Integer getGroupId() {
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

    public final Long getTeamViewerId() {
        return this.teamViewerId;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.deviceId) * 31;
        DeviceType deviceType = this.deviceType;
        int iHashCode2 = (iHashCode + (deviceType == null ? 0 : deviceType.hashCode())) * 31;
        Long l = this.teamViewerId;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.displayName;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.notes;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DeviceOnlineStatus deviceOnlineStatus = this.onlineStatus;
        int iHashCode6 = (iHashCode5 + (deviceOnlineStatus == null ? 0 : deviceOnlineStatus.hashCode())) * 31;
        Integer num = this.groupId;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        DeviceManagedState deviceManagedState = this.managedState;
        int iHashCode8 = (iHashCode7 + (deviceManagedState == null ? 0 : deviceManagedState.hashCode())) * 31;
        Boolean bool = this.isManagedDevice;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isMobileWakeActivated;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isWakeOnLanPossible;
        int iHashCode11 = (iHashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode12 = (iHashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool4 = this.hasMonitoringActivated;
        int iHashCode13 = (iHashCode12 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isKnownDevice;
        int iHashCode14 = (iHashCode13 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.hasPermanentPassword;
        int iHashCode15 = (iHashCode14 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.hasPersonalPassword;
        return iHashCode15 + (bool7 != null ? bool7.hashCode() : 0);
    }

    public final Boolean isKnownDevice() {
        return this.isKnownDevice;
    }

    public final Boolean isManagedDevice() {
        return this.isManagedDevice;
    }

    public final Boolean isMobileWakeActivated() {
        return this.isMobileWakeActivated;
    }

    public final Boolean isWakeOnLanPossible() {
        return this.isWakeOnLanPossible;
    }

    public String toString() {
        int i = this.deviceId;
        DeviceType deviceType = this.deviceType;
        Long l = this.teamViewerId;
        String str = this.displayName;
        String str2 = this.notes;
        DeviceOnlineStatus deviceOnlineStatus = this.onlineStatus;
        Integer num = this.groupId;
        DeviceManagedState deviceManagedState = this.managedState;
        Boolean bool = this.isManagedDevice;
        Boolean bool2 = this.isMobileWakeActivated;
        Boolean bool3 = this.isWakeOnLanPossible;
        String str3 = this.description;
        Boolean bool4 = this.hasMonitoringActivated;
        Boolean bool5 = this.isKnownDevice;
        Boolean bool6 = this.hasPermanentPassword;
        Boolean bool7 = this.hasPersonalPassword;
        StringBuilder sb = new StringBuilder("DeviceDelta(deviceId=");
        sb.append(i);
        sb.append(", deviceType=");
        sb.append(deviceType);
        sb.append(", teamViewerId=");
        sb.append(l);
        sb.append(", displayName=");
        sb.append(str);
        sb.append(", notes=");
        sb.append(str2);
        sb.append(", onlineStatus=");
        sb.append(deviceOnlineStatus);
        sb.append(", groupId=");
        sb.append(num);
        sb.append(", managedState=");
        sb.append(deviceManagedState);
        sb.append(", isManagedDevice=");
        ua5.w(sb, bool, ", isMobileWakeActivated=", bool2, ", isWakeOnLanPossible=");
        sb.append(bool3);
        sb.append(", description=");
        sb.append(str3);
        sb.append(", hasMonitoringActivated=");
        ua5.w(sb, bool4, ", isKnownDevice=", bool5, ", hasPermanentPassword=");
        sb.append(bool6);
        sb.append(", hasPersonalPassword=");
        sb.append(bool7);
        sb.append(")");
        return sb.toString();
    }

    public DeviceDelta(@sp3(name = "deviceId") int i, @sp3(name = "deviceType") DeviceType deviceType, @sp3(name = "teamViewerId") Long l, @sp3(name = "displayName") String str, @sp3(name = "notes") String str2, @sp3(name = "onlineStatus") DeviceOnlineStatus deviceOnlineStatus, @sp3(name = "groupId") Integer num, @sp3(name = "managedState") DeviceManagedState deviceManagedState, @sp3(name = "isManagedDevice") Boolean bool, @sp3(name = "isMobileWakeActivated") Boolean bool2, @sp3(name = "isWakeOnLanPossible") Boolean bool3, @sp3(name = "description") String str3, @sp3(name = "hasMonitoringActivated") Boolean bool4, @sp3(name = "isKnownDevice") Boolean bool5, @sp3(name = "hasPermanentPassword") Boolean bool6, @sp3(name = "hasPersonalPassword") Boolean bool7) {
        this.deviceId = i;
        this.deviceType = deviceType;
        this.teamViewerId = l;
        this.displayName = str;
        this.notes = str2;
        this.onlineStatus = deviceOnlineStatus;
        this.groupId = num;
        this.managedState = deviceManagedState;
        this.isManagedDevice = bool;
        this.isMobileWakeActivated = bool2;
        this.isWakeOnLanPossible = bool3;
        this.description = str3;
        this.hasMonitoringActivated = bool4;
        this.isKnownDevice = bool5;
        this.hasPermanentPassword = bool6;
        this.hasPersonalPassword = bool7;
    }
}
