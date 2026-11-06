package com.teamviewer.apidefinitions.manageddevices.models;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.fx3;
import o.im3;
import o.sp3;
import o.to7;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b5\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B×\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0003\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u0010\b\u0003\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0012\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b!\u0010\"J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\bHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0011\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J\u0011\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0012HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010Q\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0002\u0010?JÞ\u0001\u0010R\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0010\b\u0003\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0010\b\u0003\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00122\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010 HÆ\u0001¢\u0006\u0002\u0010SJ\u0013\u0010T\u001a\u00020 2\b\u0010U\u001a\u0004\u0018\u00010VHÖ\u0003J\t\u0010W\u001a\u00020XHÖ\u0001J\t\u0010Y\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b4\u00103R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010$R\u0015\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\n\n\u0002\u0010@\u001a\u0004\b>\u0010?¨\u0006Z"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/CompanyDeviceAddedEvent;", "Lcom/teamviewer/apidefinitions/manageddevices/models/TeamViewerEvent;", "eventType", "", "managementId", "Ljava/util/UUID;", "displayName", "teamViewerId", "", "bookmarkId", "description", "deviceListEntryType", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceListEntryType;", "onlineStatus", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceOnlineStatus;", "moduleType", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceModuleType;", "flags", "", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceFlags;", "supportedFeatures", "Lcom/teamviewer/apidefinitions/manageddevices/models/SupportedFeatures;", "deviceType", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceType;", "lastSeenTimestamp", "Ljava/time/OffsetDateTime;", "operatingSystemType", "Lcom/teamviewer/apidefinitions/manageddevices/models/OperatingSystemType;", "permissionInheritanceType", "Lcom/teamviewer/apidefinitions/manageddevices/models/PermissionInheritanceType;", "tvVersion", "hasPassword", "", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;JLjava/util/UUID;Ljava/lang/String;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceListEntryType;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceOnlineStatus;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceModuleType;Ljava/util/List;Ljava/util/List;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceType;Ljava/time/OffsetDateTime;Lcom/teamviewer/apidefinitions/manageddevices/models/OperatingSystemType;Lcom/teamviewer/apidefinitions/manageddevices/models/PermissionInheritanceType;Ljava/lang/String;Ljava/lang/Boolean;)V", "getEventType", "()Ljava/lang/String;", "getManagementId", "()Ljava/util/UUID;", "getDisplayName", "getTeamViewerId", "()J", "getBookmarkId", "getDescription", "getDeviceListEntryType", "()Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceListEntryType;", "getOnlineStatus", "()Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceOnlineStatus;", "getModuleType", "()Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceModuleType;", "getFlags", "()Ljava/util/List;", "getSupportedFeatures", "getDeviceType", "()Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceType;", "getLastSeenTimestamp", "()Ljava/time/OffsetDateTime;", "getOperatingSystemType", "()Lcom/teamviewer/apidefinitions/manageddevices/models/OperatingSystemType;", "getPermissionInheritanceType", "()Lcom/teamviewer/apidefinitions/manageddevices/models/PermissionInheritanceType;", "getTvVersion", "getHasPassword", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;JLjava/util/UUID;Ljava/lang/String;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceListEntryType;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceOnlineStatus;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceModuleType;Ljava/util/List;Ljava/util/List;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceType;Ljava/time/OffsetDateTime;Lcom/teamviewer/apidefinitions/manageddevices/models/OperatingSystemType;Lcom/teamviewer/apidefinitions/manageddevices/models/PermissionInheritanceType;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/teamviewer/apidefinitions/manageddevices/models/CompanyDeviceAddedEvent;", "equals", "other", "", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CompanyDeviceAddedEvent implements TeamViewerEvent {
    private final UUID bookmarkId;
    private final String description;
    private final DeviceListEntryType deviceListEntryType;
    private final DeviceType deviceType;
    private final String displayName;
    private final String eventType;
    private final List<DeviceFlags> flags;
    private final Boolean hasPassword;
    private final OffsetDateTime lastSeenTimestamp;
    private final UUID managementId;
    private final DeviceModuleType moduleType;
    private final DeviceOnlineStatus onlineStatus;
    private final OperatingSystemType operatingSystemType;
    private final PermissionInheritanceType permissionInheritanceType;
    private final List<SupportedFeatures> supportedFeatures;
    private final long teamViewerId;
    private final String tvVersion;

    public /* synthetic */ CompanyDeviceAddedEvent(String str, UUID uuid, String str2, long j, UUID uuid2, String str3, DeviceListEntryType deviceListEntryType, DeviceOnlineStatus deviceOnlineStatus, DeviceModuleType deviceModuleType, List list, List list2, DeviceType deviceType, OffsetDateTime offsetDateTime, OperatingSystemType operatingSystemType, PermissionInheritanceType permissionInheritanceType, String str4, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, uuid, str2, j, (i & 16) != 0 ? null : uuid2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : deviceListEntryType, (i & 128) != 0 ? null : deviceOnlineStatus, (i & 256) != 0 ? null : deviceModuleType, (i & 512) != 0 ? null : list, (i & 1024) != 0 ? null : list2, (i & 2048) != 0 ? null : deviceType, (i & 4096) != 0 ? null : offsetDateTime, (i & 8192) != 0 ? null : operatingSystemType, (i & 16384) != 0 ? null : permissionInheritanceType, (32768 & i) != 0 ? null : str4, (i & 65536) != 0 ? null : bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CompanyDeviceAddedEvent copy$default(CompanyDeviceAddedEvent companyDeviceAddedEvent, String str, UUID uuid, String str2, long j, UUID uuid2, String str3, DeviceListEntryType deviceListEntryType, DeviceOnlineStatus deviceOnlineStatus, DeviceModuleType deviceModuleType, List list, List list2, DeviceType deviceType, OffsetDateTime offsetDateTime, OperatingSystemType operatingSystemType, PermissionInheritanceType permissionInheritanceType, String str4, Boolean bool, int i, Object obj) {
        Boolean bool2;
        String str5;
        String str6 = (i & 1) != 0 ? companyDeviceAddedEvent.eventType : str;
        UUID uuid3 = (i & 2) != 0 ? companyDeviceAddedEvent.managementId : uuid;
        String str7 = (i & 4) != 0 ? companyDeviceAddedEvent.displayName : str2;
        long j2 = (i & 8) != 0 ? companyDeviceAddedEvent.teamViewerId : j;
        UUID uuid4 = (i & 16) != 0 ? companyDeviceAddedEvent.bookmarkId : uuid2;
        String str8 = (i & 32) != 0 ? companyDeviceAddedEvent.description : str3;
        DeviceListEntryType deviceListEntryType2 = (i & 64) != 0 ? companyDeviceAddedEvent.deviceListEntryType : deviceListEntryType;
        DeviceOnlineStatus deviceOnlineStatus2 = (i & 128) != 0 ? companyDeviceAddedEvent.onlineStatus : deviceOnlineStatus;
        DeviceModuleType deviceModuleType2 = (i & 256) != 0 ? companyDeviceAddedEvent.moduleType : deviceModuleType;
        List list3 = (i & 512) != 0 ? companyDeviceAddedEvent.flags : list;
        List list4 = (i & 1024) != 0 ? companyDeviceAddedEvent.supportedFeatures : list2;
        DeviceType deviceType2 = (i & 2048) != 0 ? companyDeviceAddedEvent.deviceType : deviceType;
        OffsetDateTime offsetDateTime2 = (i & 4096) != 0 ? companyDeviceAddedEvent.lastSeenTimestamp : offsetDateTime;
        String str9 = str6;
        OperatingSystemType operatingSystemType2 = (i & 8192) != 0 ? companyDeviceAddedEvent.operatingSystemType : operatingSystemType;
        PermissionInheritanceType permissionInheritanceType2 = (i & 16384) != 0 ? companyDeviceAddedEvent.permissionInheritanceType : permissionInheritanceType;
        String str10 = (i & 32768) != 0 ? companyDeviceAddedEvent.tvVersion : str4;
        if ((i & 65536) != 0) {
            str5 = str10;
            bool2 = companyDeviceAddedEvent.hasPassword;
        } else {
            bool2 = bool;
            str5 = str10;
        }
        return companyDeviceAddedEvent.copy(str9, uuid3, str7, j2, uuid4, str8, deviceListEntryType2, deviceOnlineStatus2, deviceModuleType2, list3, list4, deviceType2, offsetDateTime2, operatingSystemType2, permissionInheritanceType2, str5, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    public final List<DeviceFlags> component10() {
        return this.flags;
    }

    public final List<SupportedFeatures> component11() {
        return this.supportedFeatures;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final DeviceType getDeviceType() {
        return this.deviceType;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final OffsetDateTime getLastSeenTimestamp() {
        return this.lastSeenTimestamp;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final OperatingSystemType getOperatingSystemType() {
        return this.operatingSystemType;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final PermissionInheritanceType getPermissionInheritanceType() {
        return this.permissionInheritanceType;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getTvVersion() {
        return this.tvVersion;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Boolean getHasPassword() {
        return this.hasPassword;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UUID getManagementId() {
        return this.managementId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTeamViewerId() {
        return this.teamViewerId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final UUID getBookmarkId() {
        return this.bookmarkId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final DeviceListEntryType getDeviceListEntryType() {
        return this.deviceListEntryType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final DeviceOnlineStatus getOnlineStatus() {
        return this.onlineStatus;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final DeviceModuleType getModuleType() {
        return this.moduleType;
    }

    public final CompanyDeviceAddedEvent copy(@sp3(name = "eventType") String eventType, @sp3(name = "managementId") UUID managementId, @sp3(name = "displayName") String displayName, @sp3(name = "teamViewerId") long teamViewerId, @sp3(name = "bookmarkId") UUID bookmarkId, @sp3(name = "description") String description, @sp3(name = "deviceListEntryType") DeviceListEntryType deviceListEntryType, @sp3(name = "onlineStatus") DeviceOnlineStatus onlineStatus, @sp3(name = "moduleType") DeviceModuleType moduleType, @sp3(name = "flags") List<? extends DeviceFlags> flags, @sp3(name = "supportedFeatures") List<? extends SupportedFeatures> supportedFeatures, @sp3(name = "deviceType") DeviceType deviceType, @sp3(name = "lastSeenTimestamp") OffsetDateTime lastSeenTimestamp, @sp3(name = "operatingSystemType") OperatingSystemType operatingSystemType, @sp3(name = "permissionInheritanceType") PermissionInheritanceType permissionInheritanceType, @sp3(name = "tvVersion") String tvVersion, @sp3(name = "hasPassword") Boolean hasPassword) {
        eventType.getClass();
        managementId.getClass();
        displayName.getClass();
        return new CompanyDeviceAddedEvent(eventType, managementId, displayName, teamViewerId, bookmarkId, description, deviceListEntryType, onlineStatus, moduleType, flags, supportedFeatures, deviceType, lastSeenTimestamp, operatingSystemType, permissionInheritanceType, tvVersion, hasPassword);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompanyDeviceAddedEvent)) {
            return false;
        }
        CompanyDeviceAddedEvent companyDeviceAddedEvent = (CompanyDeviceAddedEvent) other;
        return im3.n(this.eventType, companyDeviceAddedEvent.eventType) && im3.n(this.managementId, companyDeviceAddedEvent.managementId) && im3.n(this.displayName, companyDeviceAddedEvent.displayName) && this.teamViewerId == companyDeviceAddedEvent.teamViewerId && im3.n(this.bookmarkId, companyDeviceAddedEvent.bookmarkId) && im3.n(this.description, companyDeviceAddedEvent.description) && this.deviceListEntryType == companyDeviceAddedEvent.deviceListEntryType && this.onlineStatus == companyDeviceAddedEvent.onlineStatus && this.moduleType == companyDeviceAddedEvent.moduleType && im3.n(this.flags, companyDeviceAddedEvent.flags) && im3.n(this.supportedFeatures, companyDeviceAddedEvent.supportedFeatures) && this.deviceType == companyDeviceAddedEvent.deviceType && im3.n(this.lastSeenTimestamp, companyDeviceAddedEvent.lastSeenTimestamp) && this.operatingSystemType == companyDeviceAddedEvent.operatingSystemType && this.permissionInheritanceType == companyDeviceAddedEvent.permissionInheritanceType && im3.n(this.tvVersion, companyDeviceAddedEvent.tvVersion) && im3.n(this.hasPassword, companyDeviceAddedEvent.hasPassword);
    }

    public final UUID getBookmarkId() {
        return this.bookmarkId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final DeviceListEntryType getDeviceListEntryType() {
        return this.deviceListEntryType;
    }

    public final DeviceType getDeviceType() {
        return this.deviceType;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    @Override // com.teamviewer.apidefinitions.manageddevices.models.TeamViewerEvent
    public String getEventType() {
        return this.eventType;
    }

    public final List<DeviceFlags> getFlags() {
        return this.flags;
    }

    public final Boolean getHasPassword() {
        return this.hasPassword;
    }

    public final OffsetDateTime getLastSeenTimestamp() {
        return this.lastSeenTimestamp;
    }

    public final UUID getManagementId() {
        return this.managementId;
    }

    public final DeviceModuleType getModuleType() {
        return this.moduleType;
    }

    public final DeviceOnlineStatus getOnlineStatus() {
        return this.onlineStatus;
    }

    public final OperatingSystemType getOperatingSystemType() {
        return this.operatingSystemType;
    }

    public final PermissionInheritanceType getPermissionInheritanceType() {
        return this.permissionInheritanceType;
    }

    public final List<SupportedFeatures> getSupportedFeatures() {
        return this.supportedFeatures;
    }

    public final long getTeamViewerId() {
        return this.teamViewerId;
    }

    public final String getTvVersion() {
        return this.tvVersion;
    }

    public int hashCode() {
        int iC = fx3.c(to7.e(ua5.e(this.managementId, this.eventType.hashCode() * 31, 31), 31, this.displayName), 31, this.teamViewerId);
        UUID uuid = this.bookmarkId;
        int iHashCode = (iC + (uuid == null ? 0 : uuid.hashCode())) * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DeviceListEntryType deviceListEntryType = this.deviceListEntryType;
        int iHashCode3 = (iHashCode2 + (deviceListEntryType == null ? 0 : deviceListEntryType.hashCode())) * 31;
        DeviceOnlineStatus deviceOnlineStatus = this.onlineStatus;
        int iHashCode4 = (iHashCode3 + (deviceOnlineStatus == null ? 0 : deviceOnlineStatus.hashCode())) * 31;
        DeviceModuleType deviceModuleType = this.moduleType;
        int iHashCode5 = (iHashCode4 + (deviceModuleType == null ? 0 : deviceModuleType.hashCode())) * 31;
        List<DeviceFlags> list = this.flags;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<SupportedFeatures> list2 = this.supportedFeatures;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        DeviceType deviceType = this.deviceType;
        int iHashCode8 = (iHashCode7 + (deviceType == null ? 0 : deviceType.hashCode())) * 31;
        OffsetDateTime offsetDateTime = this.lastSeenTimestamp;
        int iHashCode9 = (iHashCode8 + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        OperatingSystemType operatingSystemType = this.operatingSystemType;
        int iHashCode10 = (iHashCode9 + (operatingSystemType == null ? 0 : operatingSystemType.hashCode())) * 31;
        PermissionInheritanceType permissionInheritanceType = this.permissionInheritanceType;
        int iHashCode11 = (iHashCode10 + (permissionInheritanceType == null ? 0 : permissionInheritanceType.hashCode())) * 31;
        String str2 = this.tvVersion;
        int iHashCode12 = (iHashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.hasPassword;
        return iHashCode12 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "CompanyDeviceAddedEvent(eventType=" + this.eventType + ", managementId=" + this.managementId + ", displayName=" + this.displayName + ", teamViewerId=" + this.teamViewerId + ", bookmarkId=" + this.bookmarkId + ", description=" + this.description + ", deviceListEntryType=" + this.deviceListEntryType + ", onlineStatus=" + this.onlineStatus + ", moduleType=" + this.moduleType + ", flags=" + this.flags + ", supportedFeatures=" + this.supportedFeatures + ", deviceType=" + this.deviceType + ", lastSeenTimestamp=" + this.lastSeenTimestamp + ", operatingSystemType=" + this.operatingSystemType + ", permissionInheritanceType=" + this.permissionInheritanceType + ", tvVersion=" + this.tvVersion + ", hasPassword=" + this.hasPassword + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CompanyDeviceAddedEvent(@sp3(name = "eventType") String str, @sp3(name = "managementId") UUID uuid, @sp3(name = "displayName") String str2, @sp3(name = "teamViewerId") long j, @sp3(name = "bookmarkId") UUID uuid2, @sp3(name = "description") String str3, @sp3(name = "deviceListEntryType") DeviceListEntryType deviceListEntryType, @sp3(name = "onlineStatus") DeviceOnlineStatus deviceOnlineStatus, @sp3(name = "moduleType") DeviceModuleType deviceModuleType, @sp3(name = "flags") List<? extends DeviceFlags> list, @sp3(name = "supportedFeatures") List<? extends SupportedFeatures> list2, @sp3(name = "deviceType") DeviceType deviceType, @sp3(name = "lastSeenTimestamp") OffsetDateTime offsetDateTime, @sp3(name = "operatingSystemType") OperatingSystemType operatingSystemType, @sp3(name = "permissionInheritanceType") PermissionInheritanceType permissionInheritanceType, @sp3(name = "tvVersion") String str4, @sp3(name = "hasPassword") Boolean bool) {
        str.getClass();
        uuid.getClass();
        str2.getClass();
        this.eventType = str;
        this.managementId = uuid;
        this.displayName = str2;
        this.teamViewerId = j;
        this.bookmarkId = uuid2;
        this.description = str3;
        this.deviceListEntryType = deviceListEntryType;
        this.onlineStatus = deviceOnlineStatus;
        this.moduleType = deviceModuleType;
        this.flags = list;
        this.supportedFeatures = list2;
        this.deviceType = deviceType;
        this.lastSeenTimestamp = offsetDateTime;
        this.operatingSystemType = operatingSystemType;
        this.permissionInheritanceType = permissionInheritanceType;
        this.tvVersion = str4;
        this.hasPassword = bool;
    }
}
