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
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bL\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BÍ\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0010\b\u0003\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\t\u0012\u0010\b\u0003\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\t\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\"\u0012\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\"\u0012\n\b\u0003\u0010'\u001a\u0004\u0018\u00010(\u0012\n\b\u0003\u0010)\u001a\u0004\u0018\u00010(\u0012\n\b\u0003\u0010*\u001a\u0004\u0018\u00010(\u0012\n\b\u0003\u0010+\u001a\u0004\u0018\u00010(¢\u0006\u0004\b,\u0010-J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0005HÆ\u0003J\t\u0010X\u001a\u00020\u0007HÆ\u0003J\u000f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0011\u0010`\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\tHÆ\u0003J\u0011\u0010a\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\tHÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010g\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0002\u0010KJ\u000b\u0010h\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010i\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0002\u0010KJ\u000b\u0010j\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010k\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0002\u0010KJ\u000b\u0010l\u001a\u0004\u0018\u00010(HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010(HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010(HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010(HÆ\u0003JÔ\u0002\u0010p\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0010\b\u0003\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\t2\u0010\b\u0003\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\t2\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\"2\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\"2\n\b\u0003\u0010'\u001a\u0004\u0018\u00010(2\n\b\u0003\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0003\u0010*\u001a\u0004\u0018\u00010(2\n\b\u0003\u0010+\u001a\u0004\u0018\u00010(HÆ\u0001¢\u0006\u0002\u0010qJ\u0013\u0010r\u001a\u00020\"2\b\u0010s\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010t\u001a\u00020uHÖ\u0001J\t\u0010v\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b6\u00105R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010/R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u00101R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b?\u00105R\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b@\u00105R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0013\u0010 \u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bI\u00101R\u0015\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\n\n\u0002\u0010L\u001a\u0004\bJ\u0010KR\u0013\u0010#\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bM\u00101R\u0015\u0010$\u001a\u0004\u0018\u00010\"¢\u0006\n\n\u0002\u0010L\u001a\u0004\bN\u0010KR\u0013\u0010%\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bO\u00101R\u0015\u0010&\u001a\u0004\u0018\u00010\"¢\u0006\n\n\u0002\u0010L\u001a\u0004\bP\u0010KR\u0013\u0010'\u001a\u0004\u0018\u00010(¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0013\u0010)\u001a\u0004\u0018\u00010(¢\u0006\b\n\u0000\u001a\u0004\bS\u0010RR\u0013\u0010*\u001a\u0004\u0018\u00010(¢\u0006\b\n\u0000\u001a\u0004\bT\u0010RR\u0013\u0010+\u001a\u0004\u0018\u00010(¢\u0006\b\n\u0000\u001a\u0004\bU\u0010R¨\u0006w"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/Device;", "", "managementId", "Ljava/util/UUID;", "displayName", "", "teamViewerId", "", "managers", "", "Lcom/teamviewer/apidefinitions/manageddevices/models/EntityManagerListEntry;", "groupIds", "bookmarkId", "description", "deviceListEntryType", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceListEntryType;", "onlineStatus", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceOnlineStatus;", "moduleType", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceModuleType;", "flags", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceFlags;", "supportedFeatures", "Lcom/teamviewer/apidefinitions/manageddevices/models/SupportedFeatures;", "deviceType", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceType;", "lastSeenTimestamp", "Ljava/time/OffsetDateTime;", "operatingSystemType", "Lcom/teamviewer/apidefinitions/manageddevices/models/OperatingSystemType;", "permissionInheritanceType", "Lcom/teamviewer/apidefinitions/manageddevices/models/PermissionInheritanceType;", "tvVersion", "hasPassword", "", "version", "descriptionHasCryptoError", "descriptionErrorCode", "predicted", "policy", "Lcom/teamviewer/apidefinitions/manageddevices/models/DevicePolicyDescriptor;", "monitoringPolicy", "patchManagementPolicy", "backupPolicy", "<init>", "(Ljava/util/UUID;Ljava/lang/String;JLjava/util/List;Ljava/util/List;Ljava/util/UUID;Ljava/lang/String;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceListEntryType;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceOnlineStatus;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceModuleType;Ljava/util/List;Ljava/util/List;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceType;Ljava/time/OffsetDateTime;Lcom/teamviewer/apidefinitions/manageddevices/models/OperatingSystemType;Lcom/teamviewer/apidefinitions/manageddevices/models/PermissionInheritanceType;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/teamviewer/apidefinitions/manageddevices/models/DevicePolicyDescriptor;Lcom/teamviewer/apidefinitions/manageddevices/models/DevicePolicyDescriptor;Lcom/teamviewer/apidefinitions/manageddevices/models/DevicePolicyDescriptor;Lcom/teamviewer/apidefinitions/manageddevices/models/DevicePolicyDescriptor;)V", "getManagementId", "()Ljava/util/UUID;", "getDisplayName", "()Ljava/lang/String;", "getTeamViewerId", "()J", "getManagers", "()Ljava/util/List;", "getGroupIds", "getBookmarkId", "getDescription", "getDeviceListEntryType", "()Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceListEntryType;", "getOnlineStatus", "()Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceOnlineStatus;", "getModuleType", "()Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceModuleType;", "getFlags", "getSupportedFeatures", "getDeviceType", "()Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceType;", "getLastSeenTimestamp", "()Ljava/time/OffsetDateTime;", "getOperatingSystemType", "()Lcom/teamviewer/apidefinitions/manageddevices/models/OperatingSystemType;", "getPermissionInheritanceType", "()Lcom/teamviewer/apidefinitions/manageddevices/models/PermissionInheritanceType;", "getTvVersion", "getHasPassword", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getVersion", "getDescriptionHasCryptoError", "getDescriptionErrorCode", "getPredicted", "getPolicy", "()Lcom/teamviewer/apidefinitions/manageddevices/models/DevicePolicyDescriptor;", "getMonitoringPolicy", "getPatchManagementPolicy", "getBackupPolicy", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "copy", "(Ljava/util/UUID;Ljava/lang/String;JLjava/util/List;Ljava/util/List;Ljava/util/UUID;Ljava/lang/String;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceListEntryType;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceOnlineStatus;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceModuleType;Ljava/util/List;Ljava/util/List;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceType;Ljava/time/OffsetDateTime;Lcom/teamviewer/apidefinitions/manageddevices/models/OperatingSystemType;Lcom/teamviewer/apidefinitions/manageddevices/models/PermissionInheritanceType;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/teamviewer/apidefinitions/manageddevices/models/DevicePolicyDescriptor;Lcom/teamviewer/apidefinitions/manageddevices/models/DevicePolicyDescriptor;Lcom/teamviewer/apidefinitions/manageddevices/models/DevicePolicyDescriptor;Lcom/teamviewer/apidefinitions/manageddevices/models/DevicePolicyDescriptor;)Lcom/teamviewer/apidefinitions/manageddevices/models/Device;", "equals", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Device {
    private final DevicePolicyDescriptor backupPolicy;
    private final UUID bookmarkId;
    private final String description;
    private final String descriptionErrorCode;
    private final Boolean descriptionHasCryptoError;
    private final DeviceListEntryType deviceListEntryType;
    private final DeviceType deviceType;
    private final String displayName;
    private final List<DeviceFlags> flags;
    private final List<UUID> groupIds;
    private final Boolean hasPassword;
    private final OffsetDateTime lastSeenTimestamp;
    private final UUID managementId;
    private final List<EntityManagerListEntry> managers;
    private final DeviceModuleType moduleType;
    private final DevicePolicyDescriptor monitoringPolicy;
    private final DeviceOnlineStatus onlineStatus;
    private final OperatingSystemType operatingSystemType;
    private final DevicePolicyDescriptor patchManagementPolicy;
    private final PermissionInheritanceType permissionInheritanceType;
    private final DevicePolicyDescriptor policy;
    private final Boolean predicted;
    private final List<SupportedFeatures> supportedFeatures;
    private final long teamViewerId;
    private final String tvVersion;
    private final String version;

    public /* synthetic */ Device(UUID uuid, String str, long j, List list, List list2, UUID uuid2, String str2, DeviceListEntryType deviceListEntryType, DeviceOnlineStatus deviceOnlineStatus, DeviceModuleType deviceModuleType, List list3, List list4, DeviceType deviceType, OffsetDateTime offsetDateTime, OperatingSystemType operatingSystemType, PermissionInheritanceType permissionInheritanceType, String str3, Boolean bool, String str4, Boolean bool2, String str5, Boolean bool3, DevicePolicyDescriptor devicePolicyDescriptor, DevicePolicyDescriptor devicePolicyDescriptor2, DevicePolicyDescriptor devicePolicyDescriptor3, DevicePolicyDescriptor devicePolicyDescriptor4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, str, j, list, list2, (i & 32) != 0 ? null : uuid2, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : deviceListEntryType, (i & 256) != 0 ? null : deviceOnlineStatus, (i & 512) != 0 ? null : deviceModuleType, (i & 1024) != 0 ? null : list3, (i & 2048) != 0 ? null : list4, (i & 4096) != 0 ? null : deviceType, (i & 8192) != 0 ? null : offsetDateTime, (i & 16384) != 0 ? null : operatingSystemType, (32768 & i) != 0 ? null : permissionInheritanceType, (65536 & i) != 0 ? null : str3, (131072 & i) != 0 ? null : bool, (262144 & i) != 0 ? null : str4, (524288 & i) != 0 ? null : bool2, (1048576 & i) != 0 ? null : str5, (2097152 & i) != 0 ? null : bool3, (4194304 & i) != 0 ? null : devicePolicyDescriptor, (8388608 & i) != 0 ? null : devicePolicyDescriptor2, (16777216 & i) != 0 ? null : devicePolicyDescriptor3, (i & 33554432) != 0 ? null : devicePolicyDescriptor4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Device copy$default(Device device, UUID uuid, String str, long j, List list, List list2, UUID uuid2, String str2, DeviceListEntryType deviceListEntryType, DeviceOnlineStatus deviceOnlineStatus, DeviceModuleType deviceModuleType, List list3, List list4, DeviceType deviceType, OffsetDateTime offsetDateTime, OperatingSystemType operatingSystemType, PermissionInheritanceType permissionInheritanceType, String str3, Boolean bool, String str4, Boolean bool2, String str5, Boolean bool3, DevicePolicyDescriptor devicePolicyDescriptor, DevicePolicyDescriptor devicePolicyDescriptor2, DevicePolicyDescriptor devicePolicyDescriptor3, DevicePolicyDescriptor devicePolicyDescriptor4, int i, Object obj) {
        DevicePolicyDescriptor devicePolicyDescriptor5;
        DevicePolicyDescriptor devicePolicyDescriptor6;
        UUID uuid3 = (i & 1) != 0 ? device.managementId : uuid;
        String str6 = (i & 2) != 0 ? device.displayName : str;
        long j2 = (i & 4) != 0 ? device.teamViewerId : j;
        List list5 = (i & 8) != 0 ? device.managers : list;
        List list6 = (i & 16) != 0 ? device.groupIds : list2;
        UUID uuid4 = (i & 32) != 0 ? device.bookmarkId : uuid2;
        String str7 = (i & 64) != 0 ? device.description : str2;
        DeviceListEntryType deviceListEntryType2 = (i & 128) != 0 ? device.deviceListEntryType : deviceListEntryType;
        DeviceOnlineStatus deviceOnlineStatus2 = (i & 256) != 0 ? device.onlineStatus : deviceOnlineStatus;
        DeviceModuleType deviceModuleType2 = (i & 512) != 0 ? device.moduleType : deviceModuleType;
        List list7 = (i & 1024) != 0 ? device.flags : list3;
        List list8 = (i & 2048) != 0 ? device.supportedFeatures : list4;
        DeviceType deviceType2 = (i & 4096) != 0 ? device.deviceType : deviceType;
        UUID uuid5 = uuid3;
        OffsetDateTime offsetDateTime2 = (i & 8192) != 0 ? device.lastSeenTimestamp : offsetDateTime;
        OperatingSystemType operatingSystemType2 = (i & 16384) != 0 ? device.operatingSystemType : operatingSystemType;
        PermissionInheritanceType permissionInheritanceType2 = (i & 32768) != 0 ? device.permissionInheritanceType : permissionInheritanceType;
        String str8 = (i & 65536) != 0 ? device.tvVersion : str3;
        Boolean bool4 = (i & 131072) != 0 ? device.hasPassword : bool;
        String str9 = (i & 262144) != 0 ? device.version : str4;
        Boolean bool5 = (i & 524288) != 0 ? device.descriptionHasCryptoError : bool2;
        String str10 = (i & 1048576) != 0 ? device.descriptionErrorCode : str5;
        Boolean bool6 = (i & 2097152) != 0 ? device.predicted : bool3;
        DevicePolicyDescriptor devicePolicyDescriptor7 = (i & 4194304) != 0 ? device.policy : devicePolicyDescriptor;
        DevicePolicyDescriptor devicePolicyDescriptor8 = (i & 8388608) != 0 ? device.monitoringPolicy : devicePolicyDescriptor2;
        DevicePolicyDescriptor devicePolicyDescriptor9 = (i & 16777216) != 0 ? device.patchManagementPolicy : devicePolicyDescriptor3;
        if ((i & 33554432) != 0) {
            devicePolicyDescriptor6 = devicePolicyDescriptor9;
            devicePolicyDescriptor5 = device.backupPolicy;
        } else {
            devicePolicyDescriptor5 = devicePolicyDescriptor4;
            devicePolicyDescriptor6 = devicePolicyDescriptor9;
        }
        return device.copy(uuid5, str6, j2, list5, list6, uuid4, str7, deviceListEntryType2, deviceOnlineStatus2, deviceModuleType2, list7, list8, deviceType2, offsetDateTime2, operatingSystemType2, permissionInheritanceType2, str8, bool4, str9, bool5, str10, bool6, devicePolicyDescriptor7, devicePolicyDescriptor8, devicePolicyDescriptor6, devicePolicyDescriptor5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getManagementId() {
        return this.managementId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final DeviceModuleType getModuleType() {
        return this.moduleType;
    }

    public final List<DeviceFlags> component11() {
        return this.flags;
    }

    public final List<SupportedFeatures> component12() {
        return this.supportedFeatures;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final DeviceType getDeviceType() {
        return this.deviceType;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final OffsetDateTime getLastSeenTimestamp() {
        return this.lastSeenTimestamp;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final OperatingSystemType getOperatingSystemType() {
        return this.operatingSystemType;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final PermissionInheritanceType getPermissionInheritanceType() {
        return this.permissionInheritanceType;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getTvVersion() {
        return this.tvVersion;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Boolean getHasPassword() {
        return this.hasPassword;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Boolean getDescriptionHasCryptoError() {
        return this.descriptionHasCryptoError;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getDescriptionErrorCode() {
        return this.descriptionErrorCode;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Boolean getPredicted() {
        return this.predicted;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final DevicePolicyDescriptor getPolicy() {
        return this.policy;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final DevicePolicyDescriptor getMonitoringPolicy() {
        return this.monitoringPolicy;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final DevicePolicyDescriptor getPatchManagementPolicy() {
        return this.patchManagementPolicy;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final DevicePolicyDescriptor getBackupPolicy() {
        return this.backupPolicy;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTeamViewerId() {
        return this.teamViewerId;
    }

    public final List<EntityManagerListEntry> component4() {
        return this.managers;
    }

    public final List<UUID> component5() {
        return this.groupIds;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final UUID getBookmarkId() {
        return this.bookmarkId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final DeviceListEntryType getDeviceListEntryType() {
        return this.deviceListEntryType;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final DeviceOnlineStatus getOnlineStatus() {
        return this.onlineStatus;
    }

    public final Device copy(@sp3(name = "managementId") UUID managementId, @sp3(name = "displayName") String displayName, @sp3(name = "teamViewerId") long teamViewerId, @sp3(name = "managers") List<EntityManagerListEntry> managers, @sp3(name = "groupIds") List<UUID> groupIds, @sp3(name = "bookmarkId") UUID bookmarkId, @sp3(name = "description") String description, @sp3(name = "deviceListEntryType") DeviceListEntryType deviceListEntryType, @sp3(name = "onlineStatus") DeviceOnlineStatus onlineStatus, @sp3(name = "moduleType") DeviceModuleType moduleType, @sp3(name = "flags") List<? extends DeviceFlags> flags, @sp3(name = "supportedFeatures") List<? extends SupportedFeatures> supportedFeatures, @sp3(name = "deviceType") DeviceType deviceType, @sp3(name = "lastSeenTimestamp") OffsetDateTime lastSeenTimestamp, @sp3(name = "operatingSystemType") OperatingSystemType operatingSystemType, @sp3(name = "permissionInheritanceType") PermissionInheritanceType permissionInheritanceType, @sp3(name = "tvVersion") String tvVersion, @sp3(name = "hasPassword") Boolean hasPassword, @sp3(name = "version") String version, @sp3(name = "descriptionHasCryptoError") Boolean descriptionHasCryptoError, @sp3(name = "descriptionErrorCode") String descriptionErrorCode, @sp3(name = "predicted") Boolean predicted, @sp3(name = "policy") DevicePolicyDescriptor policy, @sp3(name = "monitoringPolicy") DevicePolicyDescriptor monitoringPolicy, @sp3(name = "patchManagementPolicy") DevicePolicyDescriptor patchManagementPolicy, @sp3(name = "backupPolicy") DevicePolicyDescriptor backupPolicy) {
        managementId.getClass();
        displayName.getClass();
        managers.getClass();
        groupIds.getClass();
        return new Device(managementId, displayName, teamViewerId, managers, groupIds, bookmarkId, description, deviceListEntryType, onlineStatus, moduleType, flags, supportedFeatures, deviceType, lastSeenTimestamp, operatingSystemType, permissionInheritanceType, tvVersion, hasPassword, version, descriptionHasCryptoError, descriptionErrorCode, predicted, policy, monitoringPolicy, patchManagementPolicy, backupPolicy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Device)) {
            return false;
        }
        Device device = (Device) other;
        return im3.n(this.managementId, device.managementId) && im3.n(this.displayName, device.displayName) && this.teamViewerId == device.teamViewerId && im3.n(this.managers, device.managers) && im3.n(this.groupIds, device.groupIds) && im3.n(this.bookmarkId, device.bookmarkId) && im3.n(this.description, device.description) && this.deviceListEntryType == device.deviceListEntryType && this.onlineStatus == device.onlineStatus && this.moduleType == device.moduleType && im3.n(this.flags, device.flags) && im3.n(this.supportedFeatures, device.supportedFeatures) && this.deviceType == device.deviceType && im3.n(this.lastSeenTimestamp, device.lastSeenTimestamp) && this.operatingSystemType == device.operatingSystemType && this.permissionInheritanceType == device.permissionInheritanceType && im3.n(this.tvVersion, device.tvVersion) && im3.n(this.hasPassword, device.hasPassword) && im3.n(this.version, device.version) && im3.n(this.descriptionHasCryptoError, device.descriptionHasCryptoError) && im3.n(this.descriptionErrorCode, device.descriptionErrorCode) && im3.n(this.predicted, device.predicted) && im3.n(this.policy, device.policy) && im3.n(this.monitoringPolicy, device.monitoringPolicy) && im3.n(this.patchManagementPolicy, device.patchManagementPolicy) && im3.n(this.backupPolicy, device.backupPolicy);
    }

    public final DevicePolicyDescriptor getBackupPolicy() {
        return this.backupPolicy;
    }

    public final UUID getBookmarkId() {
        return this.bookmarkId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDescriptionErrorCode() {
        return this.descriptionErrorCode;
    }

    public final Boolean getDescriptionHasCryptoError() {
        return this.descriptionHasCryptoError;
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

    public final List<EntityManagerListEntry> getManagers() {
        return this.managers;
    }

    public final DeviceModuleType getModuleType() {
        return this.moduleType;
    }

    public final DevicePolicyDescriptor getMonitoringPolicy() {
        return this.monitoringPolicy;
    }

    public final DeviceOnlineStatus getOnlineStatus() {
        return this.onlineStatus;
    }

    public final OperatingSystemType getOperatingSystemType() {
        return this.operatingSystemType;
    }

    public final DevicePolicyDescriptor getPatchManagementPolicy() {
        return this.patchManagementPolicy;
    }

    public final PermissionInheritanceType getPermissionInheritanceType() {
        return this.permissionInheritanceType;
    }

    public final DevicePolicyDescriptor getPolicy() {
        return this.policy;
    }

    public final Boolean getPredicted() {
        return this.predicted;
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

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iG = to7.g(this.groupIds, to7.g(this.managers, fx3.c(to7.e(this.managementId.hashCode() * 31, 31, this.displayName), 31, this.teamViewerId), 31), 31);
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
        String str3 = this.version;
        int iHashCode14 = (iHashCode13 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.descriptionHasCryptoError;
        int iHashCode15 = (iHashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.descriptionErrorCode;
        int iHashCode16 = (iHashCode15 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool3 = this.predicted;
        int iHashCode17 = (iHashCode16 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        DevicePolicyDescriptor devicePolicyDescriptor = this.policy;
        int iHashCode18 = (iHashCode17 + (devicePolicyDescriptor == null ? 0 : devicePolicyDescriptor.hashCode())) * 31;
        DevicePolicyDescriptor devicePolicyDescriptor2 = this.monitoringPolicy;
        int iHashCode19 = (iHashCode18 + (devicePolicyDescriptor2 == null ? 0 : devicePolicyDescriptor2.hashCode())) * 31;
        DevicePolicyDescriptor devicePolicyDescriptor3 = this.patchManagementPolicy;
        int iHashCode20 = (iHashCode19 + (devicePolicyDescriptor3 == null ? 0 : devicePolicyDescriptor3.hashCode())) * 31;
        DevicePolicyDescriptor devicePolicyDescriptor4 = this.backupPolicy;
        return iHashCode20 + (devicePolicyDescriptor4 != null ? devicePolicyDescriptor4.hashCode() : 0);
    }

    public String toString() {
        return "Device(managementId=" + this.managementId + ", displayName=" + this.displayName + ", teamViewerId=" + this.teamViewerId + ", managers=" + this.managers + ", groupIds=" + this.groupIds + ", bookmarkId=" + this.bookmarkId + ", description=" + this.description + ", deviceListEntryType=" + this.deviceListEntryType + ", onlineStatus=" + this.onlineStatus + ", moduleType=" + this.moduleType + ", flags=" + this.flags + ", supportedFeatures=" + this.supportedFeatures + ", deviceType=" + this.deviceType + ", lastSeenTimestamp=" + this.lastSeenTimestamp + ", operatingSystemType=" + this.operatingSystemType + ", permissionInheritanceType=" + this.permissionInheritanceType + ", tvVersion=" + this.tvVersion + ", hasPassword=" + this.hasPassword + ", version=" + this.version + ", descriptionHasCryptoError=" + this.descriptionHasCryptoError + ", descriptionErrorCode=" + this.descriptionErrorCode + ", predicted=" + this.predicted + ", policy=" + this.policy + ", monitoringPolicy=" + this.monitoringPolicy + ", patchManagementPolicy=" + this.patchManagementPolicy + ", backupPolicy=" + this.backupPolicy + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Device(@sp3(name = "managementId") UUID uuid, @sp3(name = "displayName") String str, @sp3(name = "teamViewerId") long j, @sp3(name = "managers") List<EntityManagerListEntry> list, @sp3(name = "groupIds") List<UUID> list2, @sp3(name = "bookmarkId") UUID uuid2, @sp3(name = "description") String str2, @sp3(name = "deviceListEntryType") DeviceListEntryType deviceListEntryType, @sp3(name = "onlineStatus") DeviceOnlineStatus deviceOnlineStatus, @sp3(name = "moduleType") DeviceModuleType deviceModuleType, @sp3(name = "flags") List<? extends DeviceFlags> list3, @sp3(name = "supportedFeatures") List<? extends SupportedFeatures> list4, @sp3(name = "deviceType") DeviceType deviceType, @sp3(name = "lastSeenTimestamp") OffsetDateTime offsetDateTime, @sp3(name = "operatingSystemType") OperatingSystemType operatingSystemType, @sp3(name = "permissionInheritanceType") PermissionInheritanceType permissionInheritanceType, @sp3(name = "tvVersion") String str3, @sp3(name = "hasPassword") Boolean bool, @sp3(name = "version") String str4, @sp3(name = "descriptionHasCryptoError") Boolean bool2, @sp3(name = "descriptionErrorCode") String str5, @sp3(name = "predicted") Boolean bool3, @sp3(name = "policy") DevicePolicyDescriptor devicePolicyDescriptor, @sp3(name = "monitoringPolicy") DevicePolicyDescriptor devicePolicyDescriptor2, @sp3(name = "patchManagementPolicy") DevicePolicyDescriptor devicePolicyDescriptor3, @sp3(name = "backupPolicy") DevicePolicyDescriptor devicePolicyDescriptor4) {
        uuid.getClass();
        str.getClass();
        list.getClass();
        list2.getClass();
        this.managementId = uuid;
        this.displayName = str;
        this.teamViewerId = j;
        this.managers = list;
        this.groupIds = list2;
        this.bookmarkId = uuid2;
        this.description = str2;
        this.deviceListEntryType = deviceListEntryType;
        this.onlineStatus = deviceOnlineStatus;
        this.moduleType = deviceModuleType;
        this.flags = list3;
        this.supportedFeatures = list4;
        this.deviceType = deviceType;
        this.lastSeenTimestamp = offsetDateTime;
        this.operatingSystemType = operatingSystemType;
        this.permissionInheritanceType = permissionInheritanceType;
        this.tvVersion = str3;
        this.hasPassword = bool;
        this.version = str4;
        this.descriptionHasCryptoError = bool2;
        this.descriptionErrorCode = str5;
        this.predicted = bool3;
        this.policy = devicePolicyDescriptor;
        this.monitoringPolicy = devicePolicyDescriptor2;
        this.patchManagementPolicy = devicePolicyDescriptor3;
        this.backupPolicy = devicePolicyDescriptor4;
    }
}
