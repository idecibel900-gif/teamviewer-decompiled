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
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b=\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bý\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0003\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0010\b\u0003\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\u0010\b\u0003\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011\u0012\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u001f\u0012\u0010\b\u0003\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011¢\u0006\u0004\b#\u0010$J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0005HÆ\u0003J\t\u0010G\u001a\u00020\u0007HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0011\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u0011\u0010N\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010T\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0002\u0010@J\u0011\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011HÆ\u0003J\u0010\u0010V\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0002\u0010@J\u0011\u0010W\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011HÆ\u0003J\u0084\u0002\u0010X\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0003\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0010\b\u0003\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00112\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0010\b\u0003\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00112\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u001f2\u0010\b\u0003\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u0010YJ\u0013\u0010Z\u001a\u00020\u001f2\b\u0010[\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\\\u001a\u00020]HÖ\u0001J\t\u0010^\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010&R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010(R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b5\u00104R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b>\u0010(R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u0010A\u001a\u0004\b?\u0010@R\u0019\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\bB\u00104R\u0015\u0010!\u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u0010A\u001a\u0004\bC\u0010@R\u0019\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\bD\u00104¨\u0006_"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/GroupsDeviceListEntry;", "", "managementId", "Ljava/util/UUID;", "displayName", "", "teamViewerId", "", "bookmarkId", "description", "deviceListEntryType", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceListEntryType;", "onlineStatus", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceOnlineStatus;", "moduleType", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceModuleType;", "flags", "", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceFlags;", "supportedFeatures", "Lcom/teamviewer/apidefinitions/manageddevices/models/SupportedFeatures;", "deviceType", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceType;", "lastSeenTimestamp", "Ljava/time/OffsetDateTime;", "operatingSystemType", "Lcom/teamviewer/apidefinitions/manageddevices/models/OperatingSystemType;", "permissionInheritanceType", "Lcom/teamviewer/apidefinitions/manageddevices/models/PermissionInheritanceType;", "tvVersion", "hasPassword", "", "managerIds", "pending", "groupIds", "<init>", "(Ljava/util/UUID;Ljava/lang/String;JLjava/util/UUID;Ljava/lang/String;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceListEntryType;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceOnlineStatus;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceModuleType;Ljava/util/List;Ljava/util/List;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceType;Ljava/time/OffsetDateTime;Lcom/teamviewer/apidefinitions/manageddevices/models/OperatingSystemType;Lcom/teamviewer/apidefinitions/manageddevices/models/PermissionInheritanceType;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;)V", "getManagementId", "()Ljava/util/UUID;", "getDisplayName", "()Ljava/lang/String;", "getTeamViewerId", "()J", "getBookmarkId", "getDescription", "getDeviceListEntryType", "()Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceListEntryType;", "getOnlineStatus", "()Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceOnlineStatus;", "getModuleType", "()Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceModuleType;", "getFlags", "()Ljava/util/List;", "getSupportedFeatures", "getDeviceType", "()Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceType;", "getLastSeenTimestamp", "()Ljava/time/OffsetDateTime;", "getOperatingSystemType", "()Lcom/teamviewer/apidefinitions/manageddevices/models/OperatingSystemType;", "getPermissionInheritanceType", "()Lcom/teamviewer/apidefinitions/manageddevices/models/PermissionInheritanceType;", "getTvVersion", "getHasPassword", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getManagerIds", "getPending", "getGroupIds", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(Ljava/util/UUID;Ljava/lang/String;JLjava/util/UUID;Ljava/lang/String;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceListEntryType;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceOnlineStatus;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceModuleType;Ljava/util/List;Ljava/util/List;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceType;Ljava/time/OffsetDateTime;Lcom/teamviewer/apidefinitions/manageddevices/models/OperatingSystemType;Lcom/teamviewer/apidefinitions/manageddevices/models/PermissionInheritanceType;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;)Lcom/teamviewer/apidefinitions/manageddevices/models/GroupsDeviceListEntry;", "equals", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupsDeviceListEntry {
    private final UUID bookmarkId;
    private final String description;
    private final DeviceListEntryType deviceListEntryType;
    private final DeviceType deviceType;
    private final String displayName;
    private final List<DeviceFlags> flags;
    private final List<UUID> groupIds;
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

    public /* synthetic */ GroupsDeviceListEntry(UUID uuid, String str, long j, UUID uuid2, String str2, DeviceListEntryType deviceListEntryType, DeviceOnlineStatus deviceOnlineStatus, DeviceModuleType deviceModuleType, List list, List list2, DeviceType deviceType, OffsetDateTime offsetDateTime, OperatingSystemType operatingSystemType, PermissionInheritanceType permissionInheritanceType, String str3, Boolean bool, List list3, Boolean bool2, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, str, j, (i & 8) != 0 ? null : uuid2, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : deviceListEntryType, (i & 64) != 0 ? null : deviceOnlineStatus, (i & 128) != 0 ? null : deviceModuleType, (i & 256) != 0 ? null : list, (i & 512) != 0 ? null : list2, (i & 1024) != 0 ? null : deviceType, (i & 2048) != 0 ? null : offsetDateTime, (i & 4096) != 0 ? null : operatingSystemType, (i & 8192) != 0 ? null : permissionInheritanceType, (i & 16384) != 0 ? null : str3, (32768 & i) != 0 ? null : bool, (65536 & i) != 0 ? null : list3, (131072 & i) != 0 ? null : bool2, (i & 262144) != 0 ? null : list4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupsDeviceListEntry copy$default(GroupsDeviceListEntry groupsDeviceListEntry, UUID uuid, String str, long j, UUID uuid2, String str2, DeviceListEntryType deviceListEntryType, DeviceOnlineStatus deviceOnlineStatus, DeviceModuleType deviceModuleType, List list, List list2, DeviceType deviceType, OffsetDateTime offsetDateTime, OperatingSystemType operatingSystemType, PermissionInheritanceType permissionInheritanceType, String str3, Boolean bool, List list3, Boolean bool2, List list4, int i, Object obj) {
        List list5;
        Boolean bool3;
        UUID uuid3 = (i & 1) != 0 ? groupsDeviceListEntry.managementId : uuid;
        String str4 = (i & 2) != 0 ? groupsDeviceListEntry.displayName : str;
        long j2 = (i & 4) != 0 ? groupsDeviceListEntry.teamViewerId : j;
        UUID uuid4 = (i & 8) != 0 ? groupsDeviceListEntry.bookmarkId : uuid2;
        String str5 = (i & 16) != 0 ? groupsDeviceListEntry.description : str2;
        DeviceListEntryType deviceListEntryType2 = (i & 32) != 0 ? groupsDeviceListEntry.deviceListEntryType : deviceListEntryType;
        DeviceOnlineStatus deviceOnlineStatus2 = (i & 64) != 0 ? groupsDeviceListEntry.onlineStatus : deviceOnlineStatus;
        DeviceModuleType deviceModuleType2 = (i & 128) != 0 ? groupsDeviceListEntry.moduleType : deviceModuleType;
        List list6 = (i & 256) != 0 ? groupsDeviceListEntry.flags : list;
        List list7 = (i & 512) != 0 ? groupsDeviceListEntry.supportedFeatures : list2;
        DeviceType deviceType2 = (i & 1024) != 0 ? groupsDeviceListEntry.deviceType : deviceType;
        OffsetDateTime offsetDateTime2 = (i & 2048) != 0 ? groupsDeviceListEntry.lastSeenTimestamp : offsetDateTime;
        OperatingSystemType operatingSystemType2 = (i & 4096) != 0 ? groupsDeviceListEntry.operatingSystemType : operatingSystemType;
        UUID uuid5 = uuid3;
        PermissionInheritanceType permissionInheritanceType2 = (i & 8192) != 0 ? groupsDeviceListEntry.permissionInheritanceType : permissionInheritanceType;
        String str6 = (i & 16384) != 0 ? groupsDeviceListEntry.tvVersion : str3;
        Boolean bool4 = (i & 32768) != 0 ? groupsDeviceListEntry.hasPassword : bool;
        List list8 = (i & 65536) != 0 ? groupsDeviceListEntry.managerIds : list3;
        Boolean bool5 = (i & 131072) != 0 ? groupsDeviceListEntry.pending : bool2;
        if ((i & 262144) != 0) {
            bool3 = bool5;
            list5 = groupsDeviceListEntry.groupIds;
        } else {
            list5 = list4;
            bool3 = bool5;
        }
        return groupsDeviceListEntry.copy(uuid5, str4, j2, uuid4, str5, deviceListEntryType2, deviceOnlineStatus2, deviceModuleType2, list6, list7, deviceType2, offsetDateTime2, operatingSystemType2, permissionInheritanceType2, str6, bool4, list8, bool3, list5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getManagementId() {
        return this.managementId;
    }

    public final List<SupportedFeatures> component10() {
        return this.supportedFeatures;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final DeviceType getDeviceType() {
        return this.deviceType;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final OffsetDateTime getLastSeenTimestamp() {
        return this.lastSeenTimestamp;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final OperatingSystemType getOperatingSystemType() {
        return this.operatingSystemType;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final PermissionInheritanceType getPermissionInheritanceType() {
        return this.permissionInheritanceType;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getTvVersion() {
        return this.tvVersion;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Boolean getHasPassword() {
        return this.hasPassword;
    }

    public final List<UUID> component17() {
        return this.managerIds;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Boolean getPending() {
        return this.pending;
    }

    public final List<UUID> component19() {
        return this.groupIds;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTeamViewerId() {
        return this.teamViewerId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final UUID getBookmarkId() {
        return this.bookmarkId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DeviceListEntryType getDeviceListEntryType() {
        return this.deviceListEntryType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final DeviceOnlineStatus getOnlineStatus() {
        return this.onlineStatus;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final DeviceModuleType getModuleType() {
        return this.moduleType;
    }

    public final List<DeviceFlags> component9() {
        return this.flags;
    }

    public final GroupsDeviceListEntry copy(@sp3(name = "managementId") UUID managementId, @sp3(name = "displayName") String displayName, @sp3(name = "teamViewerId") long teamViewerId, @sp3(name = "bookmarkId") UUID bookmarkId, @sp3(name = "description") String description, @sp3(name = "deviceListEntryType") DeviceListEntryType deviceListEntryType, @sp3(name = "onlineStatus") DeviceOnlineStatus onlineStatus, @sp3(name = "moduleType") DeviceModuleType moduleType, @sp3(name = "flags") List<? extends DeviceFlags> flags, @sp3(name = "supportedFeatures") List<? extends SupportedFeatures> supportedFeatures, @sp3(name = "deviceType") DeviceType deviceType, @sp3(name = "lastSeenTimestamp") OffsetDateTime lastSeenTimestamp, @sp3(name = "operatingSystemType") OperatingSystemType operatingSystemType, @sp3(name = "permissionInheritanceType") PermissionInheritanceType permissionInheritanceType, @sp3(name = "tvVersion") String tvVersion, @sp3(name = "hasPassword") Boolean hasPassword, @sp3(name = "managerIds") List<UUID> managerIds, @sp3(name = "pending") Boolean pending, @sp3(name = "groupIds") List<UUID> groupIds) {
        managementId.getClass();
        displayName.getClass();
        return new GroupsDeviceListEntry(managementId, displayName, teamViewerId, bookmarkId, description, deviceListEntryType, onlineStatus, moduleType, flags, supportedFeatures, deviceType, lastSeenTimestamp, operatingSystemType, permissionInheritanceType, tvVersion, hasPassword, managerIds, pending, groupIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupsDeviceListEntry)) {
            return false;
        }
        GroupsDeviceListEntry groupsDeviceListEntry = (GroupsDeviceListEntry) other;
        return im3.n(this.managementId, groupsDeviceListEntry.managementId) && im3.n(this.displayName, groupsDeviceListEntry.displayName) && this.teamViewerId == groupsDeviceListEntry.teamViewerId && im3.n(this.bookmarkId, groupsDeviceListEntry.bookmarkId) && im3.n(this.description, groupsDeviceListEntry.description) && this.deviceListEntryType == groupsDeviceListEntry.deviceListEntryType && this.onlineStatus == groupsDeviceListEntry.onlineStatus && this.moduleType == groupsDeviceListEntry.moduleType && im3.n(this.flags, groupsDeviceListEntry.flags) && im3.n(this.supportedFeatures, groupsDeviceListEntry.supportedFeatures) && this.deviceType == groupsDeviceListEntry.deviceType && im3.n(this.lastSeenTimestamp, groupsDeviceListEntry.lastSeenTimestamp) && this.operatingSystemType == groupsDeviceListEntry.operatingSystemType && this.permissionInheritanceType == groupsDeviceListEntry.permissionInheritanceType && im3.n(this.tvVersion, groupsDeviceListEntry.tvVersion) && im3.n(this.hasPassword, groupsDeviceListEntry.hasPassword) && im3.n(this.managerIds, groupsDeviceListEntry.managerIds) && im3.n(this.pending, groupsDeviceListEntry.pending) && im3.n(this.groupIds, groupsDeviceListEntry.groupIds);
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
        int iC = fx3.c(to7.e(this.managementId.hashCode() * 31, 31, this.displayName), 31, this.teamViewerId);
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
        int iHashCode13 = (iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<UUID> list3 = this.managerIds;
        int iHashCode14 = (iHashCode13 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool2 = this.pending;
        int iHashCode15 = (iHashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<UUID> list4 = this.groupIds;
        return iHashCode15 + (list4 != null ? list4.hashCode() : 0);
    }

    public String toString() {
        return "GroupsDeviceListEntry(managementId=" + this.managementId + ", displayName=" + this.displayName + ", teamViewerId=" + this.teamViewerId + ", bookmarkId=" + this.bookmarkId + ", description=" + this.description + ", deviceListEntryType=" + this.deviceListEntryType + ", onlineStatus=" + this.onlineStatus + ", moduleType=" + this.moduleType + ", flags=" + this.flags + ", supportedFeatures=" + this.supportedFeatures + ", deviceType=" + this.deviceType + ", lastSeenTimestamp=" + this.lastSeenTimestamp + ", operatingSystemType=" + this.operatingSystemType + ", permissionInheritanceType=" + this.permissionInheritanceType + ", tvVersion=" + this.tvVersion + ", hasPassword=" + this.hasPassword + ", managerIds=" + this.managerIds + ", pending=" + this.pending + ", groupIds=" + this.groupIds + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GroupsDeviceListEntry(@sp3(name = "managementId") UUID uuid, @sp3(name = "displayName") String str, @sp3(name = "teamViewerId") long j, @sp3(name = "bookmarkId") UUID uuid2, @sp3(name = "description") String str2, @sp3(name = "deviceListEntryType") DeviceListEntryType deviceListEntryType, @sp3(name = "onlineStatus") DeviceOnlineStatus deviceOnlineStatus, @sp3(name = "moduleType") DeviceModuleType deviceModuleType, @sp3(name = "flags") List<? extends DeviceFlags> list, @sp3(name = "supportedFeatures") List<? extends SupportedFeatures> list2, @sp3(name = "deviceType") DeviceType deviceType, @sp3(name = "lastSeenTimestamp") OffsetDateTime offsetDateTime, @sp3(name = "operatingSystemType") OperatingSystemType operatingSystemType, @sp3(name = "permissionInheritanceType") PermissionInheritanceType permissionInheritanceType, @sp3(name = "tvVersion") String str3, @sp3(name = "hasPassword") Boolean bool, @sp3(name = "managerIds") List<UUID> list3, @sp3(name = "pending") Boolean bool2, @sp3(name = "groupIds") List<UUID> list4) {
        uuid.getClass();
        str.getClass();
        this.managementId = uuid;
        this.displayName = str;
        this.teamViewerId = j;
        this.bookmarkId = uuid2;
        this.description = str2;
        this.deviceListEntryType = deviceListEntryType;
        this.onlineStatus = deviceOnlineStatus;
        this.moduleType = deviceModuleType;
        this.flags = list;
        this.supportedFeatures = list2;
        this.deviceType = deviceType;
        this.lastSeenTimestamp = offsetDateTime;
        this.operatingSystemType = operatingSystemType;
        this.permissionInheritanceType = permissionInheritanceType;
        this.tvVersion = str3;
        this.hasPassword = bool;
        this.managerIds = list3;
        this.pending = bool2;
        this.groupIds = list4;
    }
}
