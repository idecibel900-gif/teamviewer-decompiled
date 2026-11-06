package com.teamviewer.apidefinitions.manageddevices.models;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bG\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0003\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0003\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0005\u0012\u0010\b\u0003\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0005\u0012\u0010\b\u0003\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0005\u0012\u0010\b\u0003\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0005\u0012\u0010\b\u0003\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0003\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\u0016\b\u0003\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u001b\u0012\u0010\b\u0003\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0005\u0012\u0010\b\u0003\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\u0010\b\u0003\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0005\u0012\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0003\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0003\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u0019\u0012\u0010\b\u0003\u0010(\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\u0005\u0012\u0010\b\u0003\u0010*\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u0005\u0012\n\b\u0003\u0010,\u001a\u0004\u0018\u00010-¢\u0006\u0004\b.\u0010/J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\u0011\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010W\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010[\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\\\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0005HÆ\u0003J\u0011\u0010]\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0005HÆ\u0003J\u0011\u0010^\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0005HÆ\u0003J\u0011\u0010_\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010`\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\u0010\u0010a\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u0010BJ\u0017\u0010b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u001bHÆ\u0003J\u0011\u0010c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0005HÆ\u0003J\u0011\u0010d\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\u0011\u0010e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0005HÆ\u0003J\u0010\u0010f\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0002\u0010JJ\u000b\u0010g\u001a\u0004\u0018\u00010$HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010$HÆ\u0003J\u0010\u0010i\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u0010BJ\u0010\u0010j\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u0010BJ\u0011\u0010k\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\u0005HÆ\u0003J\u0011\u0010l\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u0005HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010-HÆ\u0003J\u0092\u0003\u0010n\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\b2\u0010\b\u0003\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00052\u0010\b\u0003\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00052\u0010\b\u0003\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00052\u0010\b\u0003\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00052\u0010\b\u0003\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0003\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0016\b\u0003\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u001b2\u0010\b\u0003\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00052\u0010\b\u0003\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u0010\b\u0003\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00052\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0003\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0003\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u00192\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u00192\u0010\b\u0003\u0010(\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\u00052\u0010\b\u0003\u0010*\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u00052\n\b\u0003\u0010,\u001a\u0004\u0018\u00010-HÆ\u0001¢\u0006\u0002\u0010oJ\u0013\u0010p\u001a\u00020\u00192\b\u0010q\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010r\u001a\u00020\"HÖ\u0001J\t\u0010s\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u00103R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b;\u00103R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b<\u00103R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b=\u00103R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b>\u00103R\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b?\u00103R\u0019\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b@\u00103R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\n\n\u0002\u0010C\u001a\u0004\bA\u0010BR\u001f\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0019\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bF\u00103R\u0019\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bG\u00103R\u0019\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bH\u00103R\u0015\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\n\n\u0002\u0010K\u001a\u0004\bI\u0010JR\u0013\u0010#\u001a\u0004\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0013\u0010%\u001a\u0004\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\bN\u0010MR\u0015\u0010&\u001a\u0004\u0018\u00010\u0019¢\u0006\n\n\u0002\u0010C\u001a\u0004\bO\u0010BR\u0015\u0010'\u001a\u0004\u0018\u00010\u0019¢\u0006\n\n\u0002\u0010C\u001a\u0004\bP\u0010BR\u0019\u0010(\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bQ\u00103R\u0019\u0010*\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bR\u00103R\u0013\u0010,\u001a\u0004\u0018\u00010-¢\u0006\b\n\u0000\u001a\u0004\bS\u0010T¨\u0006t"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceFilteringModel;", "", "devicePoolType", "Lcom/teamviewer/apidefinitions/manageddevices/models/DevicePoolType;", "groupIds", "", "Ljava/util/UUID;", "teamviewerIDList", "", "sortingType", "Lcom/teamviewer/apidefinitions/manageddevices/models/SortingType;", "sortingOrder", "Lcom/teamviewer/apidefinitions/manageddevices/models/SortingOrder;", "searchTerm", "deviceOnlineStatusList", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceOnlineStatus;", "deviceTypeList", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceType;", "deviceModuleTypeList", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceModuleType;", "deviceServiceTypeList", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceFlags;", "deviceGroupIdFilterList", "endpointProtectionIDList", "endpointProtectionEnabled", "", "devicePolicyMap", "", "policyAssignmentStatusList", "Lcom/teamviewer/apidefinitions/manageddevices/models/PolicyAssignmentStatus;", "policyList", "operatingSystemTypeList", "Lcom/teamviewer/apidefinitions/manageddevices/models/OperatingSystemType;", "pageLimit", "", "lastSeenTimestampStartDate", "Ljava/time/OffsetDateTime;", "lastSeenTimestampEndDate", "permanentPassword", "deviceHasNoServices", "permissionsInheritanceTypeList", "Lcom/teamviewer/apidefinitions/manageddevices/models/PermissionInheritanceType;", "deviceListEntryTypes", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceListEntryType;", "filteringAuthType", "Lcom/teamviewer/apidefinitions/manageddevices/models/FilteringAuthType;", "<init>", "(Lcom/teamviewer/apidefinitions/manageddevices/models/DevicePoolType;Ljava/util/List;Ljava/util/List;Lcom/teamviewer/apidefinitions/manageddevices/models/SortingType;Lcom/teamviewer/apidefinitions/manageddevices/models/SortingOrder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/teamviewer/apidefinitions/manageddevices/models/FilteringAuthType;)V", "getDevicePoolType", "()Lcom/teamviewer/apidefinitions/manageddevices/models/DevicePoolType;", "getGroupIds", "()Ljava/util/List;", "getTeamviewerIDList", "getSortingType", "()Lcom/teamviewer/apidefinitions/manageddevices/models/SortingType;", "getSortingOrder", "()Lcom/teamviewer/apidefinitions/manageddevices/models/SortingOrder;", "getSearchTerm", "()Ljava/lang/String;", "getDeviceOnlineStatusList", "getDeviceTypeList", "getDeviceModuleTypeList", "getDeviceServiceTypeList", "getDeviceGroupIdFilterList", "getEndpointProtectionIDList", "getEndpointProtectionEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDevicePolicyMap", "()Ljava/util/Map;", "getPolicyAssignmentStatusList", "getPolicyList", "getOperatingSystemTypeList", "getPageLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLastSeenTimestampStartDate", "()Ljava/time/OffsetDateTime;", "getLastSeenTimestampEndDate", "getPermanentPassword", "getDeviceHasNoServices", "getPermissionsInheritanceTypeList", "getDeviceListEntryTypes", "getFilteringAuthType", "()Lcom/teamviewer/apidefinitions/manageddevices/models/FilteringAuthType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "copy", "(Lcom/teamviewer/apidefinitions/manageddevices/models/DevicePoolType;Ljava/util/List;Ljava/util/List;Lcom/teamviewer/apidefinitions/manageddevices/models/SortingType;Lcom/teamviewer/apidefinitions/manageddevices/models/SortingOrder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/teamviewer/apidefinitions/manageddevices/models/FilteringAuthType;)Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceFilteringModel;", "equals", "other", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceFilteringModel {
    private final List<UUID> deviceGroupIdFilterList;
    private final Boolean deviceHasNoServices;
    private final List<DeviceListEntryType> deviceListEntryTypes;
    private final List<DeviceModuleType> deviceModuleTypeList;
    private final List<DeviceOnlineStatus> deviceOnlineStatusList;
    private final Map<String, String> devicePolicyMap;
    private final DevicePoolType devicePoolType;
    private final List<DeviceFlags> deviceServiceTypeList;
    private final List<DeviceType> deviceTypeList;
    private final Boolean endpointProtectionEnabled;
    private final List<String> endpointProtectionIDList;
    private final FilteringAuthType filteringAuthType;
    private final List<UUID> groupIds;
    private final OffsetDateTime lastSeenTimestampEndDate;
    private final OffsetDateTime lastSeenTimestampStartDate;
    private final List<OperatingSystemType> operatingSystemTypeList;
    private final Integer pageLimit;
    private final Boolean permanentPassword;
    private final List<PermissionInheritanceType> permissionsInheritanceTypeList;
    private final List<PolicyAssignmentStatus> policyAssignmentStatusList;
    private final List<String> policyList;
    private final String searchTerm;
    private final SortingOrder sortingOrder;
    private final SortingType sortingType;
    private final List<String> teamviewerIDList;

    public /* synthetic */ DeviceFilteringModel(DevicePoolType devicePoolType, List list, List list2, SortingType sortingType, SortingOrder sortingOrder, String str, List list3, List list4, List list5, List list6, List list7, List list8, Boolean bool, Map map, List list9, List list10, List list11, Integer num, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, Boolean bool2, Boolean bool3, List list12, List list13, FilteringAuthType filteringAuthType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(devicePoolType, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : sortingType, (i & 16) != 0 ? null : sortingOrder, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : list3, (i & 128) != 0 ? null : list4, (i & 256) != 0 ? null : list5, (i & 512) != 0 ? null : list6, (i & 1024) != 0 ? null : list7, (i & 2048) != 0 ? null : list8, (i & 4096) != 0 ? null : bool, (i & 8192) != 0 ? null : map, (i & 16384) != 0 ? null : list9, (i & 32768) != 0 ? null : list10, (i & 65536) != 0 ? null : list11, (i & 131072) != 0 ? null : num, (i & 262144) != 0 ? null : offsetDateTime, (i & 524288) != 0 ? null : offsetDateTime2, (i & 1048576) != 0 ? null : bool2, (i & 2097152) != 0 ? null : bool3, (i & 4194304) != 0 ? null : list12, (i & 8388608) != 0 ? null : list13, (i & 16777216) != 0 ? null : filteringAuthType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceFilteringModel copy$default(DeviceFilteringModel deviceFilteringModel, DevicePoolType devicePoolType, List list, List list2, SortingType sortingType, SortingOrder sortingOrder, String str, List list3, List list4, List list5, List list6, List list7, List list8, Boolean bool, Map map, List list9, List list10, List list11, Integer num, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, Boolean bool2, Boolean bool3, List list12, List list13, FilteringAuthType filteringAuthType, int i, Object obj) {
        FilteringAuthType filteringAuthType2;
        List list14;
        DevicePoolType devicePoolType2 = (i & 1) != 0 ? deviceFilteringModel.devicePoolType : devicePoolType;
        List list15 = (i & 2) != 0 ? deviceFilteringModel.groupIds : list;
        List list16 = (i & 4) != 0 ? deviceFilteringModel.teamviewerIDList : list2;
        SortingType sortingType2 = (i & 8) != 0 ? deviceFilteringModel.sortingType : sortingType;
        SortingOrder sortingOrder2 = (i & 16) != 0 ? deviceFilteringModel.sortingOrder : sortingOrder;
        String str2 = (i & 32) != 0 ? deviceFilteringModel.searchTerm : str;
        List list17 = (i & 64) != 0 ? deviceFilteringModel.deviceOnlineStatusList : list3;
        List list18 = (i & 128) != 0 ? deviceFilteringModel.deviceTypeList : list4;
        List list19 = (i & 256) != 0 ? deviceFilteringModel.deviceModuleTypeList : list5;
        List list20 = (i & 512) != 0 ? deviceFilteringModel.deviceServiceTypeList : list6;
        List list21 = (i & 1024) != 0 ? deviceFilteringModel.deviceGroupIdFilterList : list7;
        List list22 = (i & 2048) != 0 ? deviceFilteringModel.endpointProtectionIDList : list8;
        Boolean bool4 = (i & 4096) != 0 ? deviceFilteringModel.endpointProtectionEnabled : bool;
        Map map2 = (i & 8192) != 0 ? deviceFilteringModel.devicePolicyMap : map;
        DevicePoolType devicePoolType3 = devicePoolType2;
        List list23 = (i & 16384) != 0 ? deviceFilteringModel.policyAssignmentStatusList : list9;
        List list24 = (i & 32768) != 0 ? deviceFilteringModel.policyList : list10;
        List list25 = (i & 65536) != 0 ? deviceFilteringModel.operatingSystemTypeList : list11;
        Integer num2 = (i & 131072) != 0 ? deviceFilteringModel.pageLimit : num;
        OffsetDateTime offsetDateTime3 = (i & 262144) != 0 ? deviceFilteringModel.lastSeenTimestampStartDate : offsetDateTime;
        OffsetDateTime offsetDateTime4 = (i & 524288) != 0 ? deviceFilteringModel.lastSeenTimestampEndDate : offsetDateTime2;
        Boolean bool5 = (i & 1048576) != 0 ? deviceFilteringModel.permanentPassword : bool2;
        Boolean bool6 = (i & 2097152) != 0 ? deviceFilteringModel.deviceHasNoServices : bool3;
        List list26 = (i & 4194304) != 0 ? deviceFilteringModel.permissionsInheritanceTypeList : list12;
        List list27 = (i & 8388608) != 0 ? deviceFilteringModel.deviceListEntryTypes : list13;
        if ((i & 16777216) != 0) {
            list14 = list27;
            filteringAuthType2 = deviceFilteringModel.filteringAuthType;
        } else {
            filteringAuthType2 = filteringAuthType;
            list14 = list27;
        }
        return deviceFilteringModel.copy(devicePoolType3, list15, list16, sortingType2, sortingOrder2, str2, list17, list18, list19, list20, list21, list22, bool4, map2, list23, list24, list25, num2, offsetDateTime3, offsetDateTime4, bool5, bool6, list26, list14, filteringAuthType2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DevicePoolType getDevicePoolType() {
        return this.devicePoolType;
    }

    public final List<DeviceFlags> component10() {
        return this.deviceServiceTypeList;
    }

    public final List<UUID> component11() {
        return this.deviceGroupIdFilterList;
    }

    public final List<String> component12() {
        return this.endpointProtectionIDList;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getEndpointProtectionEnabled() {
        return this.endpointProtectionEnabled;
    }

    public final Map<String, String> component14() {
        return this.devicePolicyMap;
    }

    public final List<PolicyAssignmentStatus> component15() {
        return this.policyAssignmentStatusList;
    }

    public final List<String> component16() {
        return this.policyList;
    }

    public final List<OperatingSystemType> component17() {
        return this.operatingSystemTypeList;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Integer getPageLimit() {
        return this.pageLimit;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final OffsetDateTime getLastSeenTimestampStartDate() {
        return this.lastSeenTimestampStartDate;
    }

    public final List<UUID> component2() {
        return this.groupIds;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final OffsetDateTime getLastSeenTimestampEndDate() {
        return this.lastSeenTimestampEndDate;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Boolean getPermanentPassword() {
        return this.permanentPassword;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Boolean getDeviceHasNoServices() {
        return this.deviceHasNoServices;
    }

    public final List<PermissionInheritanceType> component23() {
        return this.permissionsInheritanceTypeList;
    }

    public final List<DeviceListEntryType> component24() {
        return this.deviceListEntryTypes;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final FilteringAuthType getFilteringAuthType() {
        return this.filteringAuthType;
    }

    public final List<String> component3() {
        return this.teamviewerIDList;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SortingType getSortingType() {
        return this.sortingType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final SortingOrder getSortingOrder() {
        return this.sortingOrder;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSearchTerm() {
        return this.searchTerm;
    }

    public final List<DeviceOnlineStatus> component7() {
        return this.deviceOnlineStatusList;
    }

    public final List<DeviceType> component8() {
        return this.deviceTypeList;
    }

    public final List<DeviceModuleType> component9() {
        return this.deviceModuleTypeList;
    }

    public final DeviceFilteringModel copy(@sp3(name = "devicePoolType") DevicePoolType devicePoolType, @sp3(name = "groupIds") List<UUID> groupIds, @sp3(name = "teamviewerIDList") List<String> teamviewerIDList, @sp3(name = "sortingType") SortingType sortingType, @sp3(name = "sortingOrder") SortingOrder sortingOrder, @sp3(name = "searchTerm") String searchTerm, @sp3(name = "deviceOnlineStatusList") List<? extends DeviceOnlineStatus> deviceOnlineStatusList, @sp3(name = "deviceTypeList") List<? extends DeviceType> deviceTypeList, @sp3(name = "deviceModuleTypeList") List<? extends DeviceModuleType> deviceModuleTypeList, @sp3(name = "deviceServiceTypeList") List<? extends DeviceFlags> deviceServiceTypeList, @sp3(name = "deviceGroupIdFilterList") List<UUID> deviceGroupIdFilterList, @sp3(name = "endpointProtectionIDList") List<String> endpointProtectionIDList, @sp3(name = "endpointProtectionEnabled") Boolean endpointProtectionEnabled, @sp3(name = "devicePolicyMap") Map<String, String> devicePolicyMap, @sp3(name = "policyAssignmentStatusList") List<? extends PolicyAssignmentStatus> policyAssignmentStatusList, @sp3(name = "policyList") List<String> policyList, @sp3(name = "operatingSystemTypeList") List<? extends OperatingSystemType> operatingSystemTypeList, @sp3(name = "pageLimit") Integer pageLimit, @sp3(name = "lastSeenTimestampStartDate") OffsetDateTime lastSeenTimestampStartDate, @sp3(name = "lastSeenTimestampEndDate") OffsetDateTime lastSeenTimestampEndDate, @sp3(name = "permanentPassword") Boolean permanentPassword, @sp3(name = "deviceHasNoServices") Boolean deviceHasNoServices, @sp3(name = "permissionsInheritanceTypeList") List<? extends PermissionInheritanceType> permissionsInheritanceTypeList, @sp3(name = "deviceListEntryTypes") List<? extends DeviceListEntryType> deviceListEntryTypes, @sp3(name = "filteringAuthType") FilteringAuthType filteringAuthType) {
        devicePoolType.getClass();
        return new DeviceFilteringModel(devicePoolType, groupIds, teamviewerIDList, sortingType, sortingOrder, searchTerm, deviceOnlineStatusList, deviceTypeList, deviceModuleTypeList, deviceServiceTypeList, deviceGroupIdFilterList, endpointProtectionIDList, endpointProtectionEnabled, devicePolicyMap, policyAssignmentStatusList, policyList, operatingSystemTypeList, pageLimit, lastSeenTimestampStartDate, lastSeenTimestampEndDate, permanentPassword, deviceHasNoServices, permissionsInheritanceTypeList, deviceListEntryTypes, filteringAuthType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceFilteringModel)) {
            return false;
        }
        DeviceFilteringModel deviceFilteringModel = (DeviceFilteringModel) other;
        return this.devicePoolType == deviceFilteringModel.devicePoolType && im3.n(this.groupIds, deviceFilteringModel.groupIds) && im3.n(this.teamviewerIDList, deviceFilteringModel.teamviewerIDList) && this.sortingType == deviceFilteringModel.sortingType && this.sortingOrder == deviceFilteringModel.sortingOrder && im3.n(this.searchTerm, deviceFilteringModel.searchTerm) && im3.n(this.deviceOnlineStatusList, deviceFilteringModel.deviceOnlineStatusList) && im3.n(this.deviceTypeList, deviceFilteringModel.deviceTypeList) && im3.n(this.deviceModuleTypeList, deviceFilteringModel.deviceModuleTypeList) && im3.n(this.deviceServiceTypeList, deviceFilteringModel.deviceServiceTypeList) && im3.n(this.deviceGroupIdFilterList, deviceFilteringModel.deviceGroupIdFilterList) && im3.n(this.endpointProtectionIDList, deviceFilteringModel.endpointProtectionIDList) && im3.n(this.endpointProtectionEnabled, deviceFilteringModel.endpointProtectionEnabled) && im3.n(this.devicePolicyMap, deviceFilteringModel.devicePolicyMap) && im3.n(this.policyAssignmentStatusList, deviceFilteringModel.policyAssignmentStatusList) && im3.n(this.policyList, deviceFilteringModel.policyList) && im3.n(this.operatingSystemTypeList, deviceFilteringModel.operatingSystemTypeList) && im3.n(this.pageLimit, deviceFilteringModel.pageLimit) && im3.n(this.lastSeenTimestampStartDate, deviceFilteringModel.lastSeenTimestampStartDate) && im3.n(this.lastSeenTimestampEndDate, deviceFilteringModel.lastSeenTimestampEndDate) && im3.n(this.permanentPassword, deviceFilteringModel.permanentPassword) && im3.n(this.deviceHasNoServices, deviceFilteringModel.deviceHasNoServices) && im3.n(this.permissionsInheritanceTypeList, deviceFilteringModel.permissionsInheritanceTypeList) && im3.n(this.deviceListEntryTypes, deviceFilteringModel.deviceListEntryTypes) && this.filteringAuthType == deviceFilteringModel.filteringAuthType;
    }

    public final List<UUID> getDeviceGroupIdFilterList() {
        return this.deviceGroupIdFilterList;
    }

    public final Boolean getDeviceHasNoServices() {
        return this.deviceHasNoServices;
    }

    public final List<DeviceListEntryType> getDeviceListEntryTypes() {
        return this.deviceListEntryTypes;
    }

    public final List<DeviceModuleType> getDeviceModuleTypeList() {
        return this.deviceModuleTypeList;
    }

    public final List<DeviceOnlineStatus> getDeviceOnlineStatusList() {
        return this.deviceOnlineStatusList;
    }

    public final Map<String, String> getDevicePolicyMap() {
        return this.devicePolicyMap;
    }

    public final DevicePoolType getDevicePoolType() {
        return this.devicePoolType;
    }

    public final List<DeviceFlags> getDeviceServiceTypeList() {
        return this.deviceServiceTypeList;
    }

    public final List<DeviceType> getDeviceTypeList() {
        return this.deviceTypeList;
    }

    public final Boolean getEndpointProtectionEnabled() {
        return this.endpointProtectionEnabled;
    }

    public final List<String> getEndpointProtectionIDList() {
        return this.endpointProtectionIDList;
    }

    public final FilteringAuthType getFilteringAuthType() {
        return this.filteringAuthType;
    }

    public final List<UUID> getGroupIds() {
        return this.groupIds;
    }

    public final OffsetDateTime getLastSeenTimestampEndDate() {
        return this.lastSeenTimestampEndDate;
    }

    public final OffsetDateTime getLastSeenTimestampStartDate() {
        return this.lastSeenTimestampStartDate;
    }

    public final List<OperatingSystemType> getOperatingSystemTypeList() {
        return this.operatingSystemTypeList;
    }

    public final Integer getPageLimit() {
        return this.pageLimit;
    }

    public final Boolean getPermanentPassword() {
        return this.permanentPassword;
    }

    public final List<PermissionInheritanceType> getPermissionsInheritanceTypeList() {
        return this.permissionsInheritanceTypeList;
    }

    public final List<PolicyAssignmentStatus> getPolicyAssignmentStatusList() {
        return this.policyAssignmentStatusList;
    }

    public final List<String> getPolicyList() {
        return this.policyList;
    }

    public final String getSearchTerm() {
        return this.searchTerm;
    }

    public final SortingOrder getSortingOrder() {
        return this.sortingOrder;
    }

    public final SortingType getSortingType() {
        return this.sortingType;
    }

    public final List<String> getTeamviewerIDList() {
        return this.teamviewerIDList;
    }

    public int hashCode() {
        int iHashCode = this.devicePoolType.hashCode() * 31;
        List<UUID> list = this.groupIds;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.teamviewerIDList;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        SortingType sortingType = this.sortingType;
        int iHashCode4 = (iHashCode3 + (sortingType == null ? 0 : sortingType.hashCode())) * 31;
        SortingOrder sortingOrder = this.sortingOrder;
        int iHashCode5 = (iHashCode4 + (sortingOrder == null ? 0 : sortingOrder.hashCode())) * 31;
        String str = this.searchTerm;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        List<DeviceOnlineStatus> list3 = this.deviceOnlineStatusList;
        int iHashCode7 = (iHashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<DeviceType> list4 = this.deviceTypeList;
        int iHashCode8 = (iHashCode7 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<DeviceModuleType> list5 = this.deviceModuleTypeList;
        int iHashCode9 = (iHashCode8 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<DeviceFlags> list6 = this.deviceServiceTypeList;
        int iHashCode10 = (iHashCode9 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<UUID> list7 = this.deviceGroupIdFilterList;
        int iHashCode11 = (iHashCode10 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<String> list8 = this.endpointProtectionIDList;
        int iHashCode12 = (iHashCode11 + (list8 == null ? 0 : list8.hashCode())) * 31;
        Boolean bool = this.endpointProtectionEnabled;
        int iHashCode13 = (iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, String> map = this.devicePolicyMap;
        int iHashCode14 = (iHashCode13 + (map == null ? 0 : map.hashCode())) * 31;
        List<PolicyAssignmentStatus> list9 = this.policyAssignmentStatusList;
        int iHashCode15 = (iHashCode14 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<String> list10 = this.policyList;
        int iHashCode16 = (iHashCode15 + (list10 == null ? 0 : list10.hashCode())) * 31;
        List<OperatingSystemType> list11 = this.operatingSystemTypeList;
        int iHashCode17 = (iHashCode16 + (list11 == null ? 0 : list11.hashCode())) * 31;
        Integer num = this.pageLimit;
        int iHashCode18 = (iHashCode17 + (num == null ? 0 : num.hashCode())) * 31;
        OffsetDateTime offsetDateTime = this.lastSeenTimestampStartDate;
        int iHashCode19 = (iHashCode18 + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        OffsetDateTime offsetDateTime2 = this.lastSeenTimestampEndDate;
        int iHashCode20 = (iHashCode19 + (offsetDateTime2 == null ? 0 : offsetDateTime2.hashCode())) * 31;
        Boolean bool2 = this.permanentPassword;
        int iHashCode21 = (iHashCode20 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.deviceHasNoServices;
        int iHashCode22 = (iHashCode21 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List<PermissionInheritanceType> list12 = this.permissionsInheritanceTypeList;
        int iHashCode23 = (iHashCode22 + (list12 == null ? 0 : list12.hashCode())) * 31;
        List<DeviceListEntryType> list13 = this.deviceListEntryTypes;
        int iHashCode24 = (iHashCode23 + (list13 == null ? 0 : list13.hashCode())) * 31;
        FilteringAuthType filteringAuthType = this.filteringAuthType;
        return iHashCode24 + (filteringAuthType != null ? filteringAuthType.hashCode() : 0);
    }

    public String toString() {
        DevicePoolType devicePoolType = this.devicePoolType;
        List<UUID> list = this.groupIds;
        List<String> list2 = this.teamviewerIDList;
        SortingType sortingType = this.sortingType;
        SortingOrder sortingOrder = this.sortingOrder;
        String str = this.searchTerm;
        List<DeviceOnlineStatus> list3 = this.deviceOnlineStatusList;
        List<DeviceType> list4 = this.deviceTypeList;
        List<DeviceModuleType> list5 = this.deviceModuleTypeList;
        List<DeviceFlags> list6 = this.deviceServiceTypeList;
        List<UUID> list7 = this.deviceGroupIdFilterList;
        List<String> list8 = this.endpointProtectionIDList;
        Boolean bool = this.endpointProtectionEnabled;
        Map<String, String> map = this.devicePolicyMap;
        List<PolicyAssignmentStatus> list9 = this.policyAssignmentStatusList;
        List<String> list10 = this.policyList;
        List<OperatingSystemType> list11 = this.operatingSystemTypeList;
        Integer num = this.pageLimit;
        OffsetDateTime offsetDateTime = this.lastSeenTimestampStartDate;
        OffsetDateTime offsetDateTime2 = this.lastSeenTimestampEndDate;
        Boolean bool2 = this.permanentPassword;
        Boolean bool3 = this.deviceHasNoServices;
        List<PermissionInheritanceType> list12 = this.permissionsInheritanceTypeList;
        List<DeviceListEntryType> list13 = this.deviceListEntryTypes;
        FilteringAuthType filteringAuthType = this.filteringAuthType;
        StringBuilder sb = new StringBuilder("DeviceFilteringModel(devicePoolType=");
        sb.append(devicePoolType);
        sb.append(", groupIds=");
        sb.append(list);
        sb.append(", teamviewerIDList=");
        sb.append(list2);
        sb.append(", sortingType=");
        sb.append(sortingType);
        sb.append(", sortingOrder=");
        sb.append(sortingOrder);
        sb.append(", searchTerm=");
        sb.append(str);
        sb.append(", deviceOnlineStatusList=");
        sb.append(list3);
        sb.append(", deviceTypeList=");
        sb.append(list4);
        sb.append(", deviceModuleTypeList=");
        sb.append(list5);
        sb.append(", deviceServiceTypeList=");
        sb.append(list6);
        sb.append(", deviceGroupIdFilterList=");
        sb.append(list7);
        sb.append(", endpointProtectionIDList=");
        sb.append(list8);
        sb.append(", endpointProtectionEnabled=");
        sb.append(bool);
        sb.append(", devicePolicyMap=");
        sb.append(map);
        sb.append(", policyAssignmentStatusList=");
        sb.append(list9);
        sb.append(", policyList=");
        sb.append(list10);
        sb.append(", operatingSystemTypeList=");
        sb.append(list11);
        sb.append(", pageLimit=");
        sb.append(num);
        sb.append(", lastSeenTimestampStartDate=");
        sb.append(offsetDateTime);
        sb.append(", lastSeenTimestampEndDate=");
        sb.append(offsetDateTime2);
        sb.append(", permanentPassword=");
        ua5.w(sb, bool2, ", deviceHasNoServices=", bool3, ", permissionsInheritanceTypeList=");
        sb.append(list12);
        sb.append(", deviceListEntryTypes=");
        sb.append(list13);
        sb.append(", filteringAuthType=");
        sb.append(filteringAuthType);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceFilteringModel(@sp3(name = "devicePoolType") DevicePoolType devicePoolType, @sp3(name = "groupIds") List<UUID> list, @sp3(name = "teamviewerIDList") List<String> list2, @sp3(name = "sortingType") SortingType sortingType, @sp3(name = "sortingOrder") SortingOrder sortingOrder, @sp3(name = "searchTerm") String str, @sp3(name = "deviceOnlineStatusList") List<? extends DeviceOnlineStatus> list3, @sp3(name = "deviceTypeList") List<? extends DeviceType> list4, @sp3(name = "deviceModuleTypeList") List<? extends DeviceModuleType> list5, @sp3(name = "deviceServiceTypeList") List<? extends DeviceFlags> list6, @sp3(name = "deviceGroupIdFilterList") List<UUID> list7, @sp3(name = "endpointProtectionIDList") List<String> list8, @sp3(name = "endpointProtectionEnabled") Boolean bool, @sp3(name = "devicePolicyMap") Map<String, String> map, @sp3(name = "policyAssignmentStatusList") List<? extends PolicyAssignmentStatus> list9, @sp3(name = "policyList") List<String> list10, @sp3(name = "operatingSystemTypeList") List<? extends OperatingSystemType> list11, @sp3(name = "pageLimit") Integer num, @sp3(name = "lastSeenTimestampStartDate") OffsetDateTime offsetDateTime, @sp3(name = "lastSeenTimestampEndDate") OffsetDateTime offsetDateTime2, @sp3(name = "permanentPassword") Boolean bool2, @sp3(name = "deviceHasNoServices") Boolean bool3, @sp3(name = "permissionsInheritanceTypeList") List<? extends PermissionInheritanceType> list12, @sp3(name = "deviceListEntryTypes") List<? extends DeviceListEntryType> list13, @sp3(name = "filteringAuthType") FilteringAuthType filteringAuthType) {
        devicePoolType.getClass();
        this.devicePoolType = devicePoolType;
        this.groupIds = list;
        this.teamviewerIDList = list2;
        this.sortingType = sortingType;
        this.sortingOrder = sortingOrder;
        this.searchTerm = str;
        this.deviceOnlineStatusList = list3;
        this.deviceTypeList = list4;
        this.deviceModuleTypeList = list5;
        this.deviceServiceTypeList = list6;
        this.deviceGroupIdFilterList = list7;
        this.endpointProtectionIDList = list8;
        this.endpointProtectionEnabled = bool;
        this.devicePolicyMap = map;
        this.policyAssignmentStatusList = list9;
        this.policyList = list10;
        this.operatingSystemTypeList = list11;
        this.pageLimit = num;
        this.lastSeenTimestampStartDate = offsetDateTime;
        this.lastSeenTimestampEndDate = offsetDateTime2;
        this.permanentPassword = bool2;
        this.deviceHasNoServices = bool3;
        this.permissionsInheritanceTypeList = list12;
        this.deviceListEntryTypes = list13;
        this.filteringAuthType = filteringAuthType;
    }
}
