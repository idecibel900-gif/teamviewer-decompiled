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

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b=\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0087\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0003\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\t\u0012\u0010\b\u0003\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\t\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\u0010\b\u0003\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010 \u0012\n\b\u0003\u0010#\u001a\u0004\u0018\u00010$¢\u0006\u0004\b%\u0010&J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0005HÆ\u0003J\t\u0010K\u001a\u00020\u0007HÆ\u0003J\u000f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0011\u0010R\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\tHÆ\u0003J\u0011\u0010S\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\tHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010Y\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0002\u0010CJ\u0011\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003J\u0010\u0010[\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0002\u0010CJ\u000b\u0010\\\u001a\u0004\u0018\u00010$HÆ\u0003J\u008e\u0002\u0010]\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0010\b\u0003\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\t2\u0010\b\u0003\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\t2\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010 2\u0010\b\u0003\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010 2\n\b\u0003\u0010#\u001a\u0004\u0018\u00010$HÆ\u0001¢\u0006\u0002\u0010^J\u0013\u0010_\u001a\u00020 2\b\u0010`\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010a\u001a\u00020bHÖ\u0001J\t\u0010c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010(R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010*R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b7\u0010.R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b8\u0010.R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bA\u0010*R\u0015\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\n\n\u0002\u0010D\u001a\u0004\bB\u0010CR\u0019\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\bE\u0010.R\u0015\u0010\"\u001a\u0004\u0018\u00010 ¢\u0006\n\n\u0002\u0010D\u001a\u0004\bF\u0010CR\u0013\u0010#\u001a\u0004\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\bG\u0010H¨\u0006d"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceListEntry;", "", "managementId", "Ljava/util/UUID;", "displayName", "", "teamViewerId", "", "groupIds", "", "bookmarkId", "description", "deviceListEntryType", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceListEntryType;", "onlineStatus", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceOnlineStatus;", "moduleType", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceModuleType;", "flags", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceFlags;", "supportedFeatures", "Lcom/teamviewer/apidefinitions/manageddevices/models/SupportedFeatures;", "deviceType", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceType;", "lastSeenTimestamp", "Ljava/time/OffsetDateTime;", "operatingSystemType", "Lcom/teamviewer/apidefinitions/manageddevices/models/OperatingSystemType;", "permissionInheritanceType", "Lcom/teamviewer/apidefinitions/manageddevices/models/PermissionInheritanceType;", "tvVersion", "hasPassword", "", "managerIds", "pending", "groupPendingOperationType", "Lcom/teamviewer/apidefinitions/manageddevices/models/PendingOperationTypeEnum;", "<init>", "(Ljava/util/UUID;Ljava/lang/String;JLjava/util/List;Ljava/util/UUID;Ljava/lang/String;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceListEntryType;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceOnlineStatus;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceModuleType;Ljava/util/List;Ljava/util/List;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceType;Ljava/time/OffsetDateTime;Lcom/teamviewer/apidefinitions/manageddevices/models/OperatingSystemType;Lcom/teamviewer/apidefinitions/manageddevices/models/PermissionInheritanceType;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Lcom/teamviewer/apidefinitions/manageddevices/models/PendingOperationTypeEnum;)V", "getManagementId", "()Ljava/util/UUID;", "getDisplayName", "()Ljava/lang/String;", "getTeamViewerId", "()J", "getGroupIds", "()Ljava/util/List;", "getBookmarkId", "getDescription", "getDeviceListEntryType", "()Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceListEntryType;", "getOnlineStatus", "()Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceOnlineStatus;", "getModuleType", "()Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceModuleType;", "getFlags", "getSupportedFeatures", "getDeviceType", "()Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceType;", "getLastSeenTimestamp", "()Ljava/time/OffsetDateTime;", "getOperatingSystemType", "()Lcom/teamviewer/apidefinitions/manageddevices/models/OperatingSystemType;", "getPermissionInheritanceType", "()Lcom/teamviewer/apidefinitions/manageddevices/models/PermissionInheritanceType;", "getTvVersion", "getHasPassword", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getManagerIds", "getPending", "getGroupPendingOperationType", "()Lcom/teamviewer/apidefinitions/manageddevices/models/PendingOperationTypeEnum;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Ljava/util/UUID;Ljava/lang/String;JLjava/util/List;Ljava/util/UUID;Ljava/lang/String;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceListEntryType;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceOnlineStatus;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceModuleType;Ljava/util/List;Ljava/util/List;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceType;Ljava/time/OffsetDateTime;Lcom/teamviewer/apidefinitions/manageddevices/models/OperatingSystemType;Lcom/teamviewer/apidefinitions/manageddevices/models/PermissionInheritanceType;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Lcom/teamviewer/apidefinitions/manageddevices/models/PendingOperationTypeEnum;)Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceListEntry;", "equals", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceListEntry {
    private final UUID bookmarkId;
    private final String description;
    private final DeviceListEntryType deviceListEntryType;
    private final DeviceType deviceType;
    private final String displayName;
    private final List<DeviceFlags> flags;
    private final List<UUID> groupIds;
    private final PendingOperationTypeEnum groupPendingOperationType;
    private final Boolean hasPassword;
    private final OffsetDateTime lastSeenTimestamp;
    private final UUID managementId;
    private final List<UUID> managerIds;
    private final DeviceModuleType moduleType;
    private final DeviceOnlineStatus onlineStatus;
    private final OperatingSystemType operatingSystemType;
    private final Boolean pending;
    private final PermissionInheritanceType permissionInheritanceType;
    private final List<SupportedFeatures> supportedFeatures;
    private final long teamViewerId;
    private final String tvVersion;

    public /* synthetic */ DeviceListEntry(UUID uuid, String str, long j, List list, UUID uuid2, String str2, DeviceListEntryType deviceListEntryType, DeviceOnlineStatus deviceOnlineStatus, DeviceModuleType deviceModuleType, List list2, List list3, DeviceType deviceType, OffsetDateTime offsetDateTime, OperatingSystemType operatingSystemType, PermissionInheritanceType permissionInheritanceType, String str3, Boolean bool, List list4, Boolean bool2, PendingOperationTypeEnum pendingOperationTypeEnum, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, str, j, list, (i & 16) != 0 ? null : uuid2, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : deviceListEntryType, (i & 128) != 0 ? null : deviceOnlineStatus, (i & 256) != 0 ? null : deviceModuleType, (i & 512) != 0 ? null : list2, (i & 1024) != 0 ? null : list3, (i & 2048) != 0 ? null : deviceType, (i & 4096) != 0 ? null : offsetDateTime, (i & 8192) != 0 ? null : operatingSystemType, (i & 16384) != 0 ? null : permissionInheritanceType, (32768 & i) != 0 ? null : str3, (65536 & i) != 0 ? null : bool, (131072 & i) != 0 ? null : list4, (262144 & i) != 0 ? null : bool2, (i & 524288) != 0 ? null : pendingOperationTypeEnum);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceListEntry copy$default(DeviceListEntry deviceListEntry, UUID uuid, String str, long j, List list, UUID uuid2, String str2, DeviceListEntryType deviceListEntryType, DeviceOnlineStatus deviceOnlineStatus, DeviceModuleType deviceModuleType, List list2, List list3, DeviceType deviceType, OffsetDateTime offsetDateTime, OperatingSystemType operatingSystemType, PermissionInheritanceType permissionInheritanceType, String str3, Boolean bool, List list4, Boolean bool2, PendingOperationTypeEnum pendingOperationTypeEnum, int i, Object obj) {
        PendingOperationTypeEnum pendingOperationTypeEnum2;
        Boolean bool3;
        UUID uuid3 = (i & 1) != 0 ? deviceListEntry.managementId : uuid;
        String str4 = (i & 2) != 0 ? deviceListEntry.displayName : str;
        long j2 = (i & 4) != 0 ? deviceListEntry.teamViewerId : j;
        List list5 = (i & 8) != 0 ? deviceListEntry.groupIds : list;
        UUID uuid4 = (i & 16) != 0 ? deviceListEntry.bookmarkId : uuid2;
        String str5 = (i & 32) != 0 ? deviceListEntry.description : str2;
        DeviceListEntryType deviceListEntryType2 = (i & 64) != 0 ? deviceListEntry.deviceListEntryType : deviceListEntryType;
        DeviceOnlineStatus deviceOnlineStatus2 = (i & 128) != 0 ? deviceListEntry.onlineStatus : deviceOnlineStatus;
        DeviceModuleType deviceModuleType2 = (i & 256) != 0 ? deviceListEntry.moduleType : deviceModuleType;
        List list6 = (i & 512) != 0 ? deviceListEntry.flags : list2;
        List list7 = (i & 1024) != 0 ? deviceListEntry.supportedFeatures : list3;
        DeviceType deviceType2 = (i & 2048) != 0 ? deviceListEntry.deviceType : deviceType;
        OffsetDateTime offsetDateTime2 = (i & 4096) != 0 ? deviceListEntry.lastSeenTimestamp : offsetDateTime;
        UUID uuid5 = uuid3;
        OperatingSystemType operatingSystemType2 = (i & 8192) != 0 ? deviceListEntry.operatingSystemType : operatingSystemType;
        PermissionInheritanceType permissionInheritanceType2 = (i & 16384) != 0 ? deviceListEntry.permissionInheritanceType : permissionInheritanceType;
        String str6 = (i & 32768) != 0 ? deviceListEntry.tvVersion : str3;
        Boolean bool4 = (i & 65536) != 0 ? deviceListEntry.hasPassword : bool;
        List list8 = (i & 131072) != 0 ? deviceListEntry.managerIds : list4;
        Boolean bool5 = (i & 262144) != 0 ? deviceListEntry.pending : bool2;
        if ((i & 524288) != 0) {
            bool3 = bool5;
            pendingOperationTypeEnum2 = deviceListEntry.groupPendingOperationType;
        } else {
            pendingOperationTypeEnum2 = pendingOperationTypeEnum;
            bool3 = bool5;
        }
        return deviceListEntry.copy(uuid5, str4, j2, list5, uuid4, str5, deviceListEntryType2, deviceOnlineStatus2, deviceModuleType2, list6, list7, deviceType2, offsetDateTime2, operatingSystemType2, permissionInheritanceType2, str6, bool4, list8, bool3, pendingOperationTypeEnum2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getManagementId() {
        return this.managementId;
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

    public final List<UUID> component18() {
        return this.managerIds;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Boolean getPending() {
        return this.pending;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final PendingOperationTypeEnum getGroupPendingOperationType() {
        return this.groupPendingOperationType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTeamViewerId() {
        return this.teamViewerId;
    }

    public final List<UUID> component4() {
        return this.groupIds;
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

    public final DeviceListEntry copy(@sp3(name = "managementId") UUID managementId, @sp3(name = "displayName") String displayName, @sp3(name = "teamViewerId") long teamViewerId, @sp3(name = "groupIds") List<UUID> groupIds, @sp3(name = "bookmarkId") UUID bookmarkId, @sp3(name = "description") String description, @sp3(name = "deviceListEntryType") DeviceListEntryType deviceListEntryType, @sp3(name = "onlineStatus") DeviceOnlineStatus onlineStatus, @sp3(name = "moduleType") DeviceModuleType moduleType, @sp3(name = "flags") List<? extends DeviceFlags> flags, @sp3(name = "supportedFeatures") List<? extends SupportedFeatures> supportedFeatures, @sp3(name = "deviceType") DeviceType deviceType, @sp3(name = "lastSeenTimestamp") OffsetDateTime lastSeenTimestamp, @sp3(name = "operatingSystemType") OperatingSystemType operatingSystemType, @sp3(name = "permissionInheritanceType") PermissionInheritanceType permissionInheritanceType, @sp3(name = "tvVersion") String tvVersion, @sp3(name = "hasPassword") Boolean hasPassword, @sp3(name = "managerIds") List<UUID> managerIds, @sp3(name = "pending") Boolean pending, @sp3(name = "groupPendingOperationType") PendingOperationTypeEnum groupPendingOperationType) {
        managementId.getClass();
        displayName.getClass();
        groupIds.getClass();
        return new DeviceListEntry(managementId, displayName, teamViewerId, groupIds, bookmarkId, description, deviceListEntryType, onlineStatus, moduleType, flags, supportedFeatures, deviceType, lastSeenTimestamp, operatingSystemType, permissionInheritanceType, tvVersion, hasPassword, managerIds, pending, groupPendingOperationType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceListEntry)) {
            return false;
        }
        DeviceListEntry deviceListEntry = (DeviceListEntry) other;
        return im3.n(this.managementId, deviceListEntry.managementId) && im3.n(this.displayName, deviceListEntry.displayName) && this.teamViewerId == deviceListEntry.teamViewerId && im3.n(this.groupIds, deviceListEntry.groupIds) && im3.n(this.bookmarkId, deviceListEntry.bookmarkId) && im3.n(this.description, deviceListEntry.description) && this.deviceListEntryType == deviceListEntry.deviceListEntryType && this.onlineStatus == deviceListEntry.onlineStatus && this.moduleType == deviceListEntry.moduleType && im3.n(this.flags, deviceListEntry.flags) && im3.n(this.supportedFeatures, deviceListEntry.supportedFeatures) && this.deviceType == deviceListEntry.deviceType && im3.n(this.lastSeenTimestamp, deviceListEntry.lastSeenTimestamp) && this.operatingSystemType == deviceListEntry.operatingSystemType && this.permissionInheritanceType == deviceListEntry.permissionInheritanceType && im3.n(this.tvVersion, deviceListEntry.tvVersion) && im3.n(this.hasPassword, deviceListEntry.hasPassword) && im3.n(this.managerIds, deviceListEntry.managerIds) && im3.n(this.pending, deviceListEntry.pending) && this.groupPendingOperationType == deviceListEntry.groupPendingOperationType;
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

    public final List<DeviceFlags> getFlags() {
        return this.flags;
    }

    public final List<UUID> getGroupIds() {
        return this.groupIds;
    }

    public final PendingOperationTypeEnum getGroupPendingOperationType() {
        return this.groupPendingOperationType;
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

    public final List<UUID> getManagerIds() {
        return this.managerIds;
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

    public final Boolean getPending() {
        return this.pending;
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
        int iG = to7.g(this.groupIds, fx3.c(to7.e(this.managementId.hashCode() * 31, 31, this.displayName), 31, this.teamViewerId), 31);
        UUID uuid = this.bookmarkId;
        int iHashCode = (iG + (uuid == null ? 0 : uuid.hashCode())) * 31;
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
        int iHashCode13 = (iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<UUID> list3 = this.managerIds;
        int iHashCode14 = (iHashCode13 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool2 = this.pending;
        int iHashCode15 = (iHashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        PendingOperationTypeEnum pendingOperationTypeEnum = this.groupPendingOperationType;
        return iHashCode15 + (pendingOperationTypeEnum != null ? pendingOperationTypeEnum.hashCode() : 0);
    }

    public String toString() {
        return "DeviceListEntry(managementId=" + this.managementId + ", displayName=" + this.displayName + ", teamViewerId=" + this.teamViewerId + ", groupIds=" + this.groupIds + ", bookmarkId=" + this.bookmarkId + ", description=" + this.description + ", deviceListEntryType=" + this.deviceListEntryType + ", onlineStatus=" + this.onlineStatus + ", moduleType=" + this.moduleType + ", flags=" + this.flags + ", supportedFeatures=" + this.supportedFeatures + ", deviceType=" + this.deviceType + ", lastSeenTimestamp=" + this.lastSeenTimestamp + ", operatingSystemType=" + this.operatingSystemType + ", permissionInheritanceType=" + this.permissionInheritanceType + ", tvVersion=" + this.tvVersion + ", hasPassword=" + this.hasPassword + ", managerIds=" + this.managerIds + ", pending=" + this.pending + ", groupPendingOperationType=" + this.groupPendingOperationType + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceListEntry(@sp3(name = "managementId") UUID uuid, @sp3(name = "displayName") String str, @sp3(name = "teamViewerId") long j, @sp3(name = "groupIds") List<UUID> list, @sp3(name = "bookmarkId") UUID uuid2, @sp3(name = "description") String str2, @sp3(name = "deviceListEntryType") DeviceListEntryType deviceListEntryType, @sp3(name = "onlineStatus") DeviceOnlineStatus deviceOnlineStatus, @sp3(name = "moduleType") DeviceModuleType deviceModuleType, @sp3(name = "flags") List<? extends DeviceFlags> list2, @sp3(name = "supportedFeatures") List<? extends SupportedFeatures> list3, @sp3(name = "deviceType") DeviceType deviceType, @sp3(name = "lastSeenTimestamp") OffsetDateTime offsetDateTime, @sp3(name = "operatingSystemType") OperatingSystemType operatingSystemType, @sp3(name = "permissionInheritanceType") PermissionInheritanceType permissionInheritanceType, @sp3(name = "tvVersion") String str3, @sp3(name = "hasPassword") Boolean bool, @sp3(name = "managerIds") List<UUID> list4, @sp3(name = "pending") Boolean bool2, @sp3(name = "groupPendingOperationType") PendingOperationTypeEnum pendingOperationTypeEnum) {
        uuid.getClass();
        str.getClass();
        list.getClass();
        this.managementId = uuid;
        this.displayName = str;
        this.teamViewerId = j;
        this.groupIds = list;
        this.bookmarkId = uuid2;
        this.description = str2;
        this.deviceListEntryType = deviceListEntryType;
        this.onlineStatus = deviceOnlineStatus;
        this.moduleType = deviceModuleType;
        this.flags = list2;
        this.supportedFeatures = list3;
        this.deviceType = deviceType;
        this.lastSeenTimestamp = offsetDateTime;
        this.operatingSystemType = operatingSystemType;
        this.permissionInheritanceType = permissionInheritanceType;
        this.tvVersion = str3;
        this.hasPassword = bool;
        this.managerIds = list4;
        this.pending = bool2;
        this.groupPendingOperationType = pendingOperationTypeEnum;
    }
}
