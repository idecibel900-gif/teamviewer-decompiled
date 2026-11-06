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
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\bA\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0093\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0003\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u0010\b\u0003\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0012\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0003\u0010!\u001a\u0004\u0018\u00010 \u0012\u0010\b\u0003\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012\u0012\u0010\b\u0003\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012\u0012\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b%\u0010&J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0005HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\bHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0011\u0010R\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J\u0011\u0010S\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0012HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010Y\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0002\u0010CJ\u0010\u0010Z\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0002\u0010CJ\u0011\u0010[\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012HÆ\u0003J\u0011\u0010\\\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u009a\u0002\u0010^\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0010\b\u0003\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0010\b\u0003\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00122\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0003\u0010!\u001a\u0004\u0018\u00010 2\u0010\b\u0003\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00122\u0010\b\u0003\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00122\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010_J\u0013\u0010`\u001a\u00020 2\b\u0010a\u001a\u0004\u0018\u00010bHÖ\u0003J\t\u0010c\u001a\u00020dHÖ\u0001J\t\u0010e\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010*R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010(R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b8\u00107R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010(R\u0015\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\n\n\u0002\u0010D\u001a\u0004\bB\u0010CR\u0015\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\n\n\u0002\u0010D\u001a\u0004\bE\u0010CR\u0019\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\bF\u00107R\u0019\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\bG\u00107R\u0013\u0010$\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bH\u0010*¨\u0006f"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/ManagedDeviceAddedEvent;", "Lcom/teamviewer/apidefinitions/manageddevices/models/TeamViewerEvent;", "eventType", "", "managementId", "Ljava/util/UUID;", "displayName", "teamViewerId", "", "bookmarkId", "description", "deviceListEntryType", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceListEntryType;", "onlineStatus", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceOnlineStatus;", "moduleType", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceModuleType;", "flags", "", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceFlags;", "supportedFeatures", "Lcom/teamviewer/apidefinitions/manageddevices/models/SupportedFeatures;", "deviceType", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceType;", "lastSeenTimestamp", "Ljava/time/OffsetDateTime;", "operatingSystemType", "Lcom/teamviewer/apidefinitions/manageddevices/models/OperatingSystemType;", "permissionInheritanceType", "Lcom/teamviewer/apidefinitions/manageddevices/models/PermissionInheritanceType;", "tvVersion", "hasPassword", "", "direct", "groupIds", "pendingGroupIds", "targetManagerId", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;JLjava/util/UUID;Ljava/lang/String;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceListEntryType;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceOnlineStatus;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceModuleType;Ljava/util/List;Ljava/util/List;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceType;Ljava/time/OffsetDateTime;Lcom/teamviewer/apidefinitions/manageddevices/models/OperatingSystemType;Lcom/teamviewer/apidefinitions/manageddevices/models/PermissionInheritanceType;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/UUID;)V", "getEventType", "()Ljava/lang/String;", "getManagementId", "()Ljava/util/UUID;", "getDisplayName", "getTeamViewerId", "()J", "getBookmarkId", "getDescription", "getDeviceListEntryType", "()Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceListEntryType;", "getOnlineStatus", "()Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceOnlineStatus;", "getModuleType", "()Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceModuleType;", "getFlags", "()Ljava/util/List;", "getSupportedFeatures", "getDeviceType", "()Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceType;", "getLastSeenTimestamp", "()Ljava/time/OffsetDateTime;", "getOperatingSystemType", "()Lcom/teamviewer/apidefinitions/manageddevices/models/OperatingSystemType;", "getPermissionInheritanceType", "()Lcom/teamviewer/apidefinitions/manageddevices/models/PermissionInheritanceType;", "getTvVersion", "getHasPassword", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDirect", "getGroupIds", "getPendingGroupIds", "getTargetManagerId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;JLjava/util/UUID;Ljava/lang/String;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceListEntryType;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceOnlineStatus;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceModuleType;Ljava/util/List;Ljava/util/List;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceType;Ljava/time/OffsetDateTime;Lcom/teamviewer/apidefinitions/manageddevices/models/OperatingSystemType;Lcom/teamviewer/apidefinitions/manageddevices/models/PermissionInheritanceType;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/UUID;)Lcom/teamviewer/apidefinitions/manageddevices/models/ManagedDeviceAddedEvent;", "equals", "other", "", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ManagedDeviceAddedEvent implements TeamViewerEvent {
    private final UUID bookmarkId;
    private final String description;
    private final DeviceListEntryType deviceListEntryType;
    private final DeviceType deviceType;
    private final Boolean direct;
    private final String displayName;
    private final String eventType;
    private final List<DeviceFlags> flags;
    private final List<UUID> groupIds;
    private final Boolean hasPassword;
    private final OffsetDateTime lastSeenTimestamp;
    private final UUID managementId;
    private final DeviceModuleType moduleType;
    private final DeviceOnlineStatus onlineStatus;
    private final OperatingSystemType operatingSystemType;
    private final List<UUID> pendingGroupIds;
    private final PermissionInheritanceType permissionInheritanceType;
    private final List<SupportedFeatures> supportedFeatures;
    private final UUID targetManagerId;
    private final long teamViewerId;
    private final String tvVersion;

    public /* synthetic */ ManagedDeviceAddedEvent(String str, UUID uuid, String str2, long j, UUID uuid2, String str3, DeviceListEntryType deviceListEntryType, DeviceOnlineStatus deviceOnlineStatus, DeviceModuleType deviceModuleType, List list, List list2, DeviceType deviceType, OffsetDateTime offsetDateTime, OperatingSystemType operatingSystemType, PermissionInheritanceType permissionInheritanceType, String str4, Boolean bool, Boolean bool2, List list3, List list4, UUID uuid3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, uuid, str2, j, (i & 16) != 0 ? null : uuid2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : deviceListEntryType, (i & 128) != 0 ? null : deviceOnlineStatus, (i & 256) != 0 ? null : deviceModuleType, (i & 512) != 0 ? null : list, (i & 1024) != 0 ? null : list2, (i & 2048) != 0 ? null : deviceType, (i & 4096) != 0 ? null : offsetDateTime, (i & 8192) != 0 ? null : operatingSystemType, (i & 16384) != 0 ? null : permissionInheritanceType, (32768 & i) != 0 ? null : str4, (65536 & i) != 0 ? null : bool, (131072 & i) != 0 ? null : bool2, (262144 & i) != 0 ? null : list3, (524288 & i) != 0 ? null : list4, (i & 1048576) != 0 ? null : uuid3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ManagedDeviceAddedEvent copy$default(ManagedDeviceAddedEvent managedDeviceAddedEvent, String str, UUID uuid, String str2, long j, UUID uuid2, String str3, DeviceListEntryType deviceListEntryType, DeviceOnlineStatus deviceOnlineStatus, DeviceModuleType deviceModuleType, List list, List list2, DeviceType deviceType, OffsetDateTime offsetDateTime, OperatingSystemType operatingSystemType, PermissionInheritanceType permissionInheritanceType, String str4, Boolean bool, Boolean bool2, List list3, List list4, UUID uuid3, int i, Object obj) {
        UUID uuid4;
        List list5;
        String str5 = (i & 1) != 0 ? managedDeviceAddedEvent.eventType : str;
        UUID uuid5 = (i & 2) != 0 ? managedDeviceAddedEvent.managementId : uuid;
        String str6 = (i & 4) != 0 ? managedDeviceAddedEvent.displayName : str2;
        long j2 = (i & 8) != 0 ? managedDeviceAddedEvent.teamViewerId : j;
        UUID uuid6 = (i & 16) != 0 ? managedDeviceAddedEvent.bookmarkId : uuid2;
        String str7 = (i & 32) != 0 ? managedDeviceAddedEvent.description : str3;
        DeviceListEntryType deviceListEntryType2 = (i & 64) != 0 ? managedDeviceAddedEvent.deviceListEntryType : deviceListEntryType;
        DeviceOnlineStatus deviceOnlineStatus2 = (i & 128) != 0 ? managedDeviceAddedEvent.onlineStatus : deviceOnlineStatus;
        DeviceModuleType deviceModuleType2 = (i & 256) != 0 ? managedDeviceAddedEvent.moduleType : deviceModuleType;
        List list6 = (i & 512) != 0 ? managedDeviceAddedEvent.flags : list;
        List list7 = (i & 1024) != 0 ? managedDeviceAddedEvent.supportedFeatures : list2;
        DeviceType deviceType2 = (i & 2048) != 0 ? managedDeviceAddedEvent.deviceType : deviceType;
        OffsetDateTime offsetDateTime2 = (i & 4096) != 0 ? managedDeviceAddedEvent.lastSeenTimestamp : offsetDateTime;
        String str8 = str5;
        OperatingSystemType operatingSystemType2 = (i & 8192) != 0 ? managedDeviceAddedEvent.operatingSystemType : operatingSystemType;
        PermissionInheritanceType permissionInheritanceType2 = (i & 16384) != 0 ? managedDeviceAddedEvent.permissionInheritanceType : permissionInheritanceType;
        String str9 = (i & 32768) != 0 ? managedDeviceAddedEvent.tvVersion : str4;
        Boolean bool3 = (i & 65536) != 0 ? managedDeviceAddedEvent.hasPassword : bool;
        Boolean bool4 = (i & 131072) != 0 ? managedDeviceAddedEvent.direct : bool2;
        List list8 = (i & 262144) != 0 ? managedDeviceAddedEvent.groupIds : list3;
        List list9 = (i & 524288) != 0 ? managedDeviceAddedEvent.pendingGroupIds : list4;
        if ((i & 1048576) != 0) {
            list5 = list9;
            uuid4 = managedDeviceAddedEvent.targetManagerId;
        } else {
            uuid4 = uuid3;
            list5 = list9;
        }
        return managedDeviceAddedEvent.copy(str8, uuid5, str6, j2, uuid6, str7, deviceListEntryType2, deviceOnlineStatus2, deviceModuleType2, list6, list7, deviceType2, offsetDateTime2, operatingSystemType2, permissionInheritanceType2, str9, bool3, bool4, list8, list5, uuid4);
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

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Boolean getDirect() {
        return this.direct;
    }

    public final List<UUID> component19() {
        return this.groupIds;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UUID getManagementId() {
        return this.managementId;
    }

    public final List<UUID> component20() {
        return this.pendingGroupIds;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final UUID getTargetManagerId() {
        return this.targetManagerId;
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

    public final ManagedDeviceAddedEvent copy(@sp3(name = "eventType") String eventType, @sp3(name = "managementId") UUID managementId, @sp3(name = "displayName") String displayName, @sp3(name = "teamViewerId") long teamViewerId, @sp3(name = "bookmarkId") UUID bookmarkId, @sp3(name = "description") String description, @sp3(name = "deviceListEntryType") DeviceListEntryType deviceListEntryType, @sp3(name = "onlineStatus") DeviceOnlineStatus onlineStatus, @sp3(name = "moduleType") DeviceModuleType moduleType, @sp3(name = "flags") List<? extends DeviceFlags> flags, @sp3(name = "supportedFeatures") List<? extends SupportedFeatures> supportedFeatures, @sp3(name = "deviceType") DeviceType deviceType, @sp3(name = "lastSeenTimestamp") OffsetDateTime lastSeenTimestamp, @sp3(name = "operatingSystemType") OperatingSystemType operatingSystemType, @sp3(name = "permissionInheritanceType") PermissionInheritanceType permissionInheritanceType, @sp3(name = "tvVersion") String tvVersion, @sp3(name = "hasPassword") Boolean hasPassword, @sp3(name = "direct") Boolean direct, @sp3(name = "groupIds") List<UUID> groupIds, @sp3(name = "pendingGroupIds") List<UUID> pendingGroupIds, @sp3(name = "targetManagerId") UUID targetManagerId) {
        eventType.getClass();
        managementId.getClass();
        displayName.getClass();
        return new ManagedDeviceAddedEvent(eventType, managementId, displayName, teamViewerId, bookmarkId, description, deviceListEntryType, onlineStatus, moduleType, flags, supportedFeatures, deviceType, lastSeenTimestamp, operatingSystemType, permissionInheritanceType, tvVersion, hasPassword, direct, groupIds, pendingGroupIds, targetManagerId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManagedDeviceAddedEvent)) {
            return false;
        }
        ManagedDeviceAddedEvent managedDeviceAddedEvent = (ManagedDeviceAddedEvent) other;
        return im3.n(this.eventType, managedDeviceAddedEvent.eventType) && im3.n(this.managementId, managedDeviceAddedEvent.managementId) && im3.n(this.displayName, managedDeviceAddedEvent.displayName) && this.teamViewerId == managedDeviceAddedEvent.teamViewerId && im3.n(this.bookmarkId, managedDeviceAddedEvent.bookmarkId) && im3.n(this.description, managedDeviceAddedEvent.description) && this.deviceListEntryType == managedDeviceAddedEvent.deviceListEntryType && this.onlineStatus == managedDeviceAddedEvent.onlineStatus && this.moduleType == managedDeviceAddedEvent.moduleType && im3.n(this.flags, managedDeviceAddedEvent.flags) && im3.n(this.supportedFeatures, managedDeviceAddedEvent.supportedFeatures) && this.deviceType == managedDeviceAddedEvent.deviceType && im3.n(this.lastSeenTimestamp, managedDeviceAddedEvent.lastSeenTimestamp) && this.operatingSystemType == managedDeviceAddedEvent.operatingSystemType && this.permissionInheritanceType == managedDeviceAddedEvent.permissionInheritanceType && im3.n(this.tvVersion, managedDeviceAddedEvent.tvVersion) && im3.n(this.hasPassword, managedDeviceAddedEvent.hasPassword) && im3.n(this.direct, managedDeviceAddedEvent.direct) && im3.n(this.groupIds, managedDeviceAddedEvent.groupIds) && im3.n(this.pendingGroupIds, managedDeviceAddedEvent.pendingGroupIds) && im3.n(this.targetManagerId, managedDeviceAddedEvent.targetManagerId);
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

    public final Boolean getDirect() {
        return this.direct;
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

    public final DeviceModuleType getModuleType() {
        return this.moduleType;
    }

    public final DeviceOnlineStatus getOnlineStatus() {
        return this.onlineStatus;
    }

    public final OperatingSystemType getOperatingSystemType() {
        return this.operatingSystemType;
    }

    public final List<UUID> getPendingGroupIds() {
        return this.pendingGroupIds;
    }

    public final PermissionInheritanceType getPermissionInheritanceType() {
        return this.permissionInheritanceType;
    }

    public final List<SupportedFeatures> getSupportedFeatures() {
        return this.supportedFeatures;
    }

    public final UUID getTargetManagerId() {
        return this.targetManagerId;
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
        int iHashCode13 = (iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.direct;
        int iHashCode14 = (iHashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<UUID> list3 = this.groupIds;
        int iHashCode15 = (iHashCode14 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<UUID> list4 = this.pendingGroupIds;
        int iHashCode16 = (iHashCode15 + (list4 == null ? 0 : list4.hashCode())) * 31;
        UUID uuid2 = this.targetManagerId;
        return iHashCode16 + (uuid2 != null ? uuid2.hashCode() : 0);
    }

    public String toString() {
        return "ManagedDeviceAddedEvent(eventType=" + this.eventType + ", managementId=" + this.managementId + ", displayName=" + this.displayName + ", teamViewerId=" + this.teamViewerId + ", bookmarkId=" + this.bookmarkId + ", description=" + this.description + ", deviceListEntryType=" + this.deviceListEntryType + ", onlineStatus=" + this.onlineStatus + ", moduleType=" + this.moduleType + ", flags=" + this.flags + ", supportedFeatures=" + this.supportedFeatures + ", deviceType=" + this.deviceType + ", lastSeenTimestamp=" + this.lastSeenTimestamp + ", operatingSystemType=" + this.operatingSystemType + ", permissionInheritanceType=" + this.permissionInheritanceType + ", tvVersion=" + this.tvVersion + ", hasPassword=" + this.hasPassword + ", direct=" + this.direct + ", groupIds=" + this.groupIds + ", pendingGroupIds=" + this.pendingGroupIds + ", targetManagerId=" + this.targetManagerId + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ManagedDeviceAddedEvent(@sp3(name = "eventType") String str, @sp3(name = "managementId") UUID uuid, @sp3(name = "displayName") String str2, @sp3(name = "teamViewerId") long j, @sp3(name = "bookmarkId") UUID uuid2, @sp3(name = "description") String str3, @sp3(name = "deviceListEntryType") DeviceListEntryType deviceListEntryType, @sp3(name = "onlineStatus") DeviceOnlineStatus deviceOnlineStatus, @sp3(name = "moduleType") DeviceModuleType deviceModuleType, @sp3(name = "flags") List<? extends DeviceFlags> list, @sp3(name = "supportedFeatures") List<? extends SupportedFeatures> list2, @sp3(name = "deviceType") DeviceType deviceType, @sp3(name = "lastSeenTimestamp") OffsetDateTime offsetDateTime, @sp3(name = "operatingSystemType") OperatingSystemType operatingSystemType, @sp3(name = "permissionInheritanceType") PermissionInheritanceType permissionInheritanceType, @sp3(name = "tvVersion") String str4, @sp3(name = "hasPassword") Boolean bool, @sp3(name = "direct") Boolean bool2, @sp3(name = "groupIds") List<UUID> list3, @sp3(name = "pendingGroupIds") List<UUID> list4, @sp3(name = "targetManagerId") UUID uuid3) {
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
        this.direct = bool2;
        this.groupIds = list3;
        this.pendingGroupIds = list4;
        this.targetManagerId = uuid3;
    }
}
