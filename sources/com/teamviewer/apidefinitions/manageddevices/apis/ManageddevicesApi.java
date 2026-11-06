package com.teamviewer.apidefinitions.manageddevices.apis;

import com.teamviewer.apidefinitions.manageddevices.models.CacheLoadedResponse;
import com.teamviewer.apidefinitions.manageddevices.models.CompanyGroupDetailsList;
import com.teamviewer.apidefinitions.manageddevices.models.CompanySettings;
import com.teamviewer.apidefinitions.manageddevices.models.Device;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceDetailsList;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceFilteringModel;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceIdList;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceListResponse;
import com.teamviewer.apidefinitions.manageddevices.models.DevicePropertyType;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceStateDetailModel;
import com.teamviewer.apidefinitions.manageddevices.models.DevicesSetModel;
import com.teamviewer.apidefinitions.manageddevices.models.EditDeviceProperties;
import com.teamviewer.apidefinitions.manageddevices.models.EditGroupProperties;
import com.teamviewer.apidefinitions.manageddevices.models.FilterPaginationModel;
import com.teamviewer.apidefinitions.manageddevices.models.Group;
import com.teamviewer.apidefinitions.manageddevices.models.GroupDeleteList;
import com.teamviewer.apidefinitions.manageddevices.models.GroupDetailModel;
import com.teamviewer.apidefinitions.manageddevices.models.GroupDetailsList;
import com.teamviewer.apidefinitions.manageddevices.models.GroupIdList;
import com.teamviewer.apidefinitions.manageddevices.models.GroupListResponse;
import com.teamviewer.apidefinitions.manageddevices.models.GroupsDeviceListMap;
import com.teamviewer.apidefinitions.manageddevices.models.GroupsDeviceListResponse;
import com.teamviewer.apidefinitions.manageddevices.models.GroupsDevicesListModel;
import com.teamviewer.apidefinitions.manageddevices.models.GroupsSizesResponse;
import com.teamviewer.apidefinitions.manageddevices.models.InitialLocalDeviceParams;
import com.teamviewer.apidefinitions.manageddevices.models.Local;
import com.teamviewer.apidefinitions.manageddevices.models.Me;
import com.teamviewer.apidefinitions.manageddevices.models.RevokeGroupInheritancePermissionsProperties;
import com.teamviewer.apidefinitions.manageddevices.models.UnmanagedDevicePassword;
import com.teamviewer.apidefinitions.manageddevices.models.UnmanagedDevicesMove;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import o.f88;
import o.j80;
import o.jg1;
import o.ox2;
import o.qi0;
import o.sy5;
import o.un1;
import o.xg5;
import o.yc5;
import o.yq4;
import o.zc5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0090\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bH'¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0010H'¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0010H'¢\u0006\u0004\b\u0014\u0010\u0013J!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0015H'¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u001b\u001a\u00020\u001aH'¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00042\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u001eH'¢\u0006\u0004\b!\u0010\"J!\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00042\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u001eH'¢\u0006\u0004\b$\u0010\"J!\u0010'\u001a\b\u0012\u0004\u0012\u00020#0\u00042\n\b\u0003\u0010&\u001a\u0004\u0018\u00010%H'¢\u0006\u0004\b'\u0010(J!\u0010)\u001a\b\u0012\u0004\u0012\u00020 0\u00042\n\b\u0003\u0010&\u001a\u0004\u0018\u00010%H'¢\u0006\u0004\b)\u0010(J\u001f\u0010*\u001a\b\u0012\u0004\u0012\u00020 0\u00042\b\b\u0001\u0010&\u001a\u00020%H'¢\u0006\u0004\b*\u0010(J\u001f\u0010+\u001a\b\u0012\u0004\u0012\u00020 0\u00042\b\b\u0001\u0010\u001f\u001a\u00020\u001eH'¢\u0006\u0004\b+\u0010\"J\u001f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\b\b\u0001\u0010\u001b\u001a\u00020\u001aH'¢\u0006\u0004\b,\u0010\u001dJ\u001f\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00042\b\b\u0001\u0010.\u001a\u00020-H'¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\b\u0012\u0004\u0012\u0002020\u0004H'¢\u0006\u0004\b3\u00104J\u0015\u00106\u001a\b\u0012\u0004\u0012\u0002050\u0004H'¢\u0006\u0004\b6\u00104J=\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u00042\b\b\u0001\u00107\u001a\u00020\u001a2\u0010\b\u0003\u0010:\u001a\n\u0012\u0004\u0012\u000209\u0018\u0001082\n\b\u0003\u0010<\u001a\u0004\u0018\u00010;H'¢\u0006\u0004\b>\u0010?J1\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0010\b\u0003\u0010:\u001a\n\u0012\u0004\u0012\u000209\u0018\u000108H'¢\u0006\u0004\bA\u0010BJ\u001f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\b\b\u0001\u0010\u001b\u001a\u00020\u001aH'¢\u0006\u0004\bC\u0010\u001dJ\u001f\u0010E\u001a\b\u0012\u0004\u0012\u00020D0\u00042\b\b\u0001\u0010.\u001a\u00020-H'¢\u0006\u0004\bE\u00101J-\u0010K\u001a\b\u0012\u0004\u0012\u00020J0\u00042\n\b\u0003\u0010G\u001a\u0004\u0018\u00010F2\n\b\u0003\u0010I\u001a\u0004\u0018\u00010HH'¢\u0006\u0004\bK\u0010LJ!\u0010O\u001a\b\u0012\u0004\u0012\u00020N0\u00042\n\b\u0003\u0010M\u001a\u0004\u0018\u00010;H'¢\u0006\u0004\bO\u0010PJ-\u0010Q\u001a\b\u0012\u0004\u0012\u00020 0\u00042\n\b\u0003\u0010G\u001a\u0004\u0018\u00010F2\n\b\u0003\u0010I\u001a\u0004\u0018\u00010HH'¢\u0006\u0004\bQ\u0010LJ7\u0010R\u001a\b\u0012\u0004\u0012\u00020 0\u00042\b\b\u0001\u0010\u001b\u001a\u00020\u001a2\n\b\u0003\u0010G\u001a\u0004\u0018\u00010F2\n\b\u0003\u0010I\u001a\u0004\u0018\u00010HH'¢\u0006\u0004\bR\u0010SJ7\u0010T\u001a\b\u0012\u0004\u0012\u00020 0\u00042\b\b\u0001\u0010\u001b\u001a\u00020\u001a2\n\b\u0003\u0010G\u001a\u0004\u0018\u00010F2\n\b\u0003\u0010I\u001a\u0004\u0018\u00010HH'¢\u0006\u0004\bT\u0010SJ-\u0010V\u001a\b\u0012\u0004\u0012\u00020U0\u00042\n\b\u0003\u0010G\u001a\u0004\u0018\u00010F2\n\b\u0003\u0010I\u001a\u0004\u0018\u00010HH'¢\u0006\u0004\bV\u0010LJ-\u0010W\u001a\b\u0012\u0004\u0012\u00020 0\u00042\n\b\u0003\u0010G\u001a\u0004\u0018\u00010F2\n\b\u0003\u0010I\u001a\u0004\u0018\u00010HH'¢\u0006\u0004\bW\u0010LJ7\u0010X\u001a\b\u0012\u0004\u0012\u00020 0\u00042\b\b\u0001\u0010\u001b\u001a\u00020\u001a2\n\b\u0003\u0010G\u001a\u0004\u0018\u00010F2\n\b\u0003\u0010I\u001a\u0004\u0018\u00010HH'¢\u0006\u0004\bX\u0010SJ7\u0010Y\u001a\b\u0012\u0004\u0012\u00020 0\u00042\b\b\u0001\u0010\u001b\u001a\u00020\u001a2\n\b\u0003\u0010G\u001a\u0004\u0018\u00010F2\n\b\u0003\u0010I\u001a\u0004\u0018\u00010HH'¢\u0006\u0004\bY\u0010SJ!\u0010]\u001a\b\u0012\u0004\u0012\u00020\\0\u00042\n\b\u0003\u0010[\u001a\u0004\u0018\u00010ZH'¢\u0006\u0004\b]\u0010^J!\u0010_\u001a\b\u0012\u0004\u0012\u00020\\0\u00042\n\b\u0003\u0010[\u001a\u0004\u0018\u00010ZH'¢\u0006\u0004\b_\u0010^J-\u0010`\u001a\b\u0012\u0004\u0012\u00020U0\u00042\n\b\u0003\u0010G\u001a\u0004\u0018\u00010F2\n\b\u0003\u0010I\u001a\u0004\u0018\u00010HH'¢\u0006\u0004\b`\u0010LJ!\u0010c\u001a\b\u0012\u0004\u0012\u00020 0\u00042\n\b\u0003\u0010b\u001a\u0004\u0018\u00010aH'¢\u0006\u0004\bc\u0010dJ\u0015\u0010f\u001a\b\u0012\u0004\u0012\u00020e0\u0004H'¢\u0006\u0004\bf\u00104J!\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0003\u0010h\u001a\u0004\u0018\u00010gH'¢\u0006\u0004\bi\u0010jJ\u0015\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\bk\u00104J!\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0003\u0010m\u001a\u0004\u0018\u00010lH'¢\u0006\u0004\bn\u0010oJ)\u0010r\u001a\b\u0012\u0004\u0012\u00020=0\u00042\b\b\u0001\u00107\u001a\u00020\u001a2\b\b\u0001\u0010q\u001a\u00020pH'¢\u0006\u0004\br\u0010sJ!\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0003\u0010u\u001a\u0004\u0018\u00010tH'¢\u0006\u0004\bv\u0010wJ\u001f\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010x\u001a\u000202H'¢\u0006\u0004\by\u0010zJ+\u0010}\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u00107\u001a\u00020\u001a2\n\b\u0003\u0010|\u001a\u0004\u0018\u00010{H'¢\u0006\u0004\b}\u0010~J\u001f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u00107\u001a\u00020\u001aH'¢\u0006\u0004\b\u007f\u0010\u001dJ\u0017\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0005\b\u0080\u0001\u00104J.\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\b\b\u0001\u0010\u001b\u001a\u00020\u001a2\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0015H'¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001¨\u0006\u0083\u0001"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/apis/ManageddevicesApi;", "", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceIdList;", "deviceIdList", "Lo/qi0;", "Lo/f88;", "bulkDeleteDevices", "(Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceIdList;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/manageddevices/models/GroupDeleteList;", "groupDeleteList", "bulkDeleteGroups", "(Lcom/teamviewer/apidefinitions/manageddevices/models/GroupDeleteList;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/manageddevices/models/EditDeviceProperties;", "editDeviceProperties", "bulkEditDevices", "(Lcom/teamviewer/apidefinitions/manageddevices/models/EditDeviceProperties;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/manageddevices/models/EditGroupProperties;", "editGroupProperties", "bulkEditGroups", "(Lcom/teamviewer/apidefinitions/manageddevices/models/EditGroupProperties;)Lo/qi0;", "bulkEditGroupsDeprecated", "Lcom/teamviewer/apidefinitions/manageddevices/models/GroupDetailModel;", "groupDetailModel", "Lcom/teamviewer/apidefinitions/manageddevices/models/Group;", "createGroup", "(Lcom/teamviewer/apidefinitions/manageddevices/models/GroupDetailModel;)Lo/qi0;", "Ljava/util/UUID;", "groupId", "deleteGroup", "(Ljava/util/UUID;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceFilteringModel;", "deviceFilteringModel", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceListResponse;", "filterManagedDevices", "(Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceFilteringModel;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/manageddevices/models/GroupsDeviceListMap;", "filterManagedDevicesForGroups", "Lcom/teamviewer/apidefinitions/manageddevices/models/FilterPaginationModel;", "filterPaginationModel", "filterManagedDevicesForGroupsNext", "(Lcom/teamviewer/apidefinitions/manageddevices/models/FilterPaginationModel;)Lo/qi0;", "filterManagedDevicesNext", "filterManagedDevicesNextServerSide", "filterManagedDevicesServerSide", "getCompanyGroup", "Lcom/teamviewer/apidefinitions/manageddevices/models/GroupIdList;", "groupIdList", "Lcom/teamviewer/apidefinitions/manageddevices/models/CompanyGroupDetailsList;", "getCompanyGroupsDetails", "(Lcom/teamviewer/apidefinitions/manageddevices/models/GroupIdList;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/manageddevices/models/CompanySettings;", "getCompanySettings", "()Lo/qi0;", "Lcom/teamviewer/apidefinitions/manageddevices/models/Me;", "getCurrentSessionInformation", "deviceId", "", "Lcom/teamviewer/apidefinitions/manageddevices/models/DevicePropertyType;", "properties", "", "managementDetailsOnly", "Lcom/teamviewer/apidefinitions/manageddevices/models/Device;", "getDevice", "(Ljava/util/UUID;Ljava/util/List;Ljava/lang/Boolean;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceDetailsList;", "getDevicesDetails", "(Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceIdList;Ljava/util/List;)Lo/qi0;", "getGroup", "Lcom/teamviewer/apidefinitions/manageddevices/models/GroupDetailsList;", "getGroupsDetails", "", "paginationToken", "", "pageLimit", "Lcom/teamviewer/apidefinitions/manageddevices/models/GroupsSizesResponse;", "getGroupsSizes", "(Ljava/lang/String;Ljava/lang/Integer;)Lo/qi0;", "limited", "Lcom/teamviewer/apidefinitions/manageddevices/models/Local;", "getLocal", "(Ljava/lang/Boolean;)Lo/qi0;", "listCompanyDevices", "listCompanyGroupDevices", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/Integer;)Lo/qi0;", "listCompanyGroupPendingDevices", "Lcom/teamviewer/apidefinitions/manageddevices/models/GroupListResponse;", "listCompanyGroups", "listDevices", "listGroupDevices", "listGroupPendingDevices", "Lcom/teamviewer/apidefinitions/manageddevices/models/GroupsDevicesListModel;", "groupsDevicesListModel", "Lcom/teamviewer/apidefinitions/manageddevices/models/GroupsDeviceListResponse;", "listGroupSetDevices", "(Lcom/teamviewer/apidefinitions/manageddevices/models/GroupsDevicesListModel;)Lo/qi0;", "listGroupSetPendingDevices", "listGroups", "Lcom/teamviewer/apidefinitions/manageddevices/models/DevicesSetModel;", "devicesSetModel", "listSetDevices", "(Lcom/teamviewer/apidefinitions/manageddevices/models/DevicesSetModel;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/manageddevices/models/CacheLoadedResponse;", "loadedStatus", "Lcom/teamviewer/apidefinitions/manageddevices/models/InitialLocalDeviceParams;", "initialLocalDeviceParams", "manageLocal", "(Lcom/teamviewer/apidefinitions/manageddevices/models/InitialLocalDeviceParams;)Lo/qi0;", "migrateGroupsToCompany", "Lcom/teamviewer/apidefinitions/manageddevices/models/UnmanagedDevicesMove;", "unmanagedDevicesMove", "moveUnmanagedDevices", "(Lcom/teamviewer/apidefinitions/manageddevices/models/UnmanagedDevicesMove;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStateDetailModel;", "deviceStateDetailModel", "putDevice", "(Ljava/util/UUID;Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStateDetailModel;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/manageddevices/models/RevokeGroupInheritancePermissionsProperties;", "revokeGroupInheritancePermissionsProperties", "revokeInheritancePermissions", "(Lcom/teamviewer/apidefinitions/manageddevices/models/RevokeGroupInheritancePermissionsProperties;)Lo/qi0;", "companySettings", "setCompanySettings", "(Lcom/teamviewer/apidefinitions/manageddevices/models/CompanySettings;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/manageddevices/models/UnmanagedDevicePassword;", "unmanagedDevicePassword", "storeUnmanagedDevicePassword", "(Ljava/util/UUID;Lcom/teamviewer/apidefinitions/manageddevices/models/UnmanagedDevicePassword;)Lo/qi0;", "unmanageDevice", "unmanageLocal", "updateGroup", "(Ljava/util/UUID;Lcom/teamviewer/apidefinitions/manageddevices/models/GroupDetailModel;)Lo/qi0;", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ManageddevicesApi {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ qi0 bulkDeleteGroups$default(ManageddevicesApi manageddevicesApi, GroupDeleteList groupDeleteList, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: bulkDeleteGroups");
                return null;
            }
            if ((i & 1) != 0) {
                groupDeleteList = null;
            }
            return manageddevicesApi.bulkDeleteGroups(groupDeleteList);
        }

        public static /* synthetic */ qi0 bulkEditDevices$default(ManageddevicesApi manageddevicesApi, EditDeviceProperties editDeviceProperties, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: bulkEditDevices");
                return null;
            }
            if ((i & 1) != 0) {
                editDeviceProperties = null;
            }
            return manageddevicesApi.bulkEditDevices(editDeviceProperties);
        }

        public static /* synthetic */ qi0 bulkEditGroups$default(ManageddevicesApi manageddevicesApi, EditGroupProperties editGroupProperties, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: bulkEditGroups");
                return null;
            }
            if ((i & 1) != 0) {
                editGroupProperties = null;
            }
            return manageddevicesApi.bulkEditGroups(editGroupProperties);
        }

        public static /* synthetic */ qi0 bulkEditGroupsDeprecated$default(ManageddevicesApi manageddevicesApi, EditGroupProperties editGroupProperties, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: bulkEditGroupsDeprecated");
                return null;
            }
            if ((i & 1) != 0) {
                editGroupProperties = null;
            }
            return manageddevicesApi.bulkEditGroupsDeprecated(editGroupProperties);
        }

        public static /* synthetic */ qi0 createGroup$default(ManageddevicesApi manageddevicesApi, GroupDetailModel groupDetailModel, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: createGroup");
                return null;
            }
            if ((i & 1) != 0) {
                groupDetailModel = null;
            }
            return manageddevicesApi.createGroup(groupDetailModel);
        }

        public static /* synthetic */ qi0 filterManagedDevices$default(ManageddevicesApi manageddevicesApi, DeviceFilteringModel deviceFilteringModel, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: filterManagedDevices");
                return null;
            }
            if ((i & 1) != 0) {
                deviceFilteringModel = null;
            }
            return manageddevicesApi.filterManagedDevices(deviceFilteringModel);
        }

        public static /* synthetic */ qi0 filterManagedDevicesForGroups$default(ManageddevicesApi manageddevicesApi, DeviceFilteringModel deviceFilteringModel, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: filterManagedDevicesForGroups");
                return null;
            }
            if ((i & 1) != 0) {
                deviceFilteringModel = null;
            }
            return manageddevicesApi.filterManagedDevicesForGroups(deviceFilteringModel);
        }

        public static /* synthetic */ qi0 filterManagedDevicesForGroupsNext$default(ManageddevicesApi manageddevicesApi, FilterPaginationModel filterPaginationModel, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: filterManagedDevicesForGroupsNext");
                return null;
            }
            if ((i & 1) != 0) {
                filterPaginationModel = null;
            }
            return manageddevicesApi.filterManagedDevicesForGroupsNext(filterPaginationModel);
        }

        public static /* synthetic */ qi0 filterManagedDevicesNext$default(ManageddevicesApi manageddevicesApi, FilterPaginationModel filterPaginationModel, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: filterManagedDevicesNext");
                return null;
            }
            if ((i & 1) != 0) {
                filterPaginationModel = null;
            }
            return manageddevicesApi.filterManagedDevicesNext(filterPaginationModel);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ qi0 getDevice$default(ManageddevicesApi manageddevicesApi, UUID uuid, List list, Boolean bool, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: getDevice");
                return null;
            }
            if ((i & 2) != 0) {
                list = null;
            }
            if ((i & 4) != 0) {
                bool = null;
            }
            return manageddevicesApi.getDevice(uuid, list, bool);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ qi0 getDevicesDetails$default(ManageddevicesApi manageddevicesApi, DeviceIdList deviceIdList, List list, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: getDevicesDetails");
                return null;
            }
            if ((i & 2) != 0) {
                list = null;
            }
            return manageddevicesApi.getDevicesDetails(deviceIdList, list);
        }

        public static /* synthetic */ qi0 getGroupsSizes$default(ManageddevicesApi manageddevicesApi, String str, Integer num, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: getGroupsSizes");
                return null;
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                num = null;
            }
            return manageddevicesApi.getGroupsSizes(str, num);
        }

        public static /* synthetic */ qi0 getLocal$default(ManageddevicesApi manageddevicesApi, Boolean bool, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: getLocal");
                return null;
            }
            if ((i & 1) != 0) {
                bool = null;
            }
            return manageddevicesApi.getLocal(bool);
        }

        public static /* synthetic */ qi0 listCompanyDevices$default(ManageddevicesApi manageddevicesApi, String str, Integer num, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: listCompanyDevices");
                return null;
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                num = null;
            }
            return manageddevicesApi.listCompanyDevices(str, num);
        }

        public static /* synthetic */ qi0 listCompanyGroupDevices$default(ManageddevicesApi manageddevicesApi, UUID uuid, String str, Integer num, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: listCompanyGroupDevices");
                return null;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                num = null;
            }
            return manageddevicesApi.listCompanyGroupDevices(uuid, str, num);
        }

        public static /* synthetic */ qi0 listCompanyGroupPendingDevices$default(ManageddevicesApi manageddevicesApi, UUID uuid, String str, Integer num, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: listCompanyGroupPendingDevices");
                return null;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                num = null;
            }
            return manageddevicesApi.listCompanyGroupPendingDevices(uuid, str, num);
        }

        public static /* synthetic */ qi0 listCompanyGroups$default(ManageddevicesApi manageddevicesApi, String str, Integer num, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: listCompanyGroups");
                return null;
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                num = null;
            }
            return manageddevicesApi.listCompanyGroups(str, num);
        }

        public static /* synthetic */ qi0 listDevices$default(ManageddevicesApi manageddevicesApi, String str, Integer num, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: listDevices");
                return null;
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                num = null;
            }
            return manageddevicesApi.listDevices(str, num);
        }

        public static /* synthetic */ qi0 listGroupDevices$default(ManageddevicesApi manageddevicesApi, UUID uuid, String str, Integer num, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: listGroupDevices");
                return null;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                num = null;
            }
            return manageddevicesApi.listGroupDevices(uuid, str, num);
        }

        public static /* synthetic */ qi0 listGroupPendingDevices$default(ManageddevicesApi manageddevicesApi, UUID uuid, String str, Integer num, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: listGroupPendingDevices");
                return null;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                num = null;
            }
            return manageddevicesApi.listGroupPendingDevices(uuid, str, num);
        }

        public static /* synthetic */ qi0 listGroupSetDevices$default(ManageddevicesApi manageddevicesApi, GroupsDevicesListModel groupsDevicesListModel, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: listGroupSetDevices");
                return null;
            }
            if ((i & 1) != 0) {
                groupsDevicesListModel = null;
            }
            return manageddevicesApi.listGroupSetDevices(groupsDevicesListModel);
        }

        public static /* synthetic */ qi0 listGroupSetPendingDevices$default(ManageddevicesApi manageddevicesApi, GroupsDevicesListModel groupsDevicesListModel, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: listGroupSetPendingDevices");
                return null;
            }
            if ((i & 1) != 0) {
                groupsDevicesListModel = null;
            }
            return manageddevicesApi.listGroupSetPendingDevices(groupsDevicesListModel);
        }

        public static /* synthetic */ qi0 listGroups$default(ManageddevicesApi manageddevicesApi, String str, Integer num, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: listGroups");
                return null;
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                num = null;
            }
            return manageddevicesApi.listGroups(str, num);
        }

        public static /* synthetic */ qi0 listSetDevices$default(ManageddevicesApi manageddevicesApi, DevicesSetModel devicesSetModel, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: listSetDevices");
                return null;
            }
            if ((i & 1) != 0) {
                devicesSetModel = null;
            }
            return manageddevicesApi.listSetDevices(devicesSetModel);
        }

        public static /* synthetic */ qi0 manageLocal$default(ManageddevicesApi manageddevicesApi, InitialLocalDeviceParams initialLocalDeviceParams, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: manageLocal");
                return null;
            }
            if ((i & 1) != 0) {
                initialLocalDeviceParams = null;
            }
            return manageddevicesApi.manageLocal(initialLocalDeviceParams);
        }

        public static /* synthetic */ qi0 moveUnmanagedDevices$default(ManageddevicesApi manageddevicesApi, UnmanagedDevicesMove unmanagedDevicesMove, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: moveUnmanagedDevices");
                return null;
            }
            if ((i & 1) != 0) {
                unmanagedDevicesMove = null;
            }
            return manageddevicesApi.moveUnmanagedDevices(unmanagedDevicesMove);
        }

        public static /* synthetic */ qi0 revokeInheritancePermissions$default(ManageddevicesApi manageddevicesApi, RevokeGroupInheritancePermissionsProperties revokeGroupInheritancePermissionsProperties, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: revokeInheritancePermissions");
                return null;
            }
            if ((i & 1) != 0) {
                revokeGroupInheritancePermissionsProperties = null;
            }
            return manageddevicesApi.revokeInheritancePermissions(revokeGroupInheritancePermissionsProperties);
        }

        public static /* synthetic */ qi0 storeUnmanagedDevicePassword$default(ManageddevicesApi manageddevicesApi, UUID uuid, UnmanagedDevicePassword unmanagedDevicePassword, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: storeUnmanagedDevicePassword");
                return null;
            }
            if ((i & 2) != 0) {
                unmanagedDevicePassword = null;
            }
            return manageddevicesApi.storeUnmanagedDevicePassword(uuid, unmanagedDevicePassword);
        }

        public static /* synthetic */ qi0 updateGroup$default(ManageddevicesApi manageddevicesApi, UUID uuid, GroupDetailModel groupDetailModel, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: updateGroup");
                return null;
            }
            if ((i & 2) != 0) {
                groupDetailModel = null;
            }
            return manageddevicesApi.updateGroup(uuid, groupDetailModel);
        }
    }

    @yc5("devices/bulkdelete")
    qi0<f88> bulkDeleteDevices(@j80 DeviceIdList deviceIdList);

    @yc5("groups/bulkdelete")
    qi0<f88> bulkDeleteGroups(@j80 GroupDeleteList groupDeleteList);

    @zc5("devices")
    qi0<f88> bulkEditDevices(@j80 EditDeviceProperties editDeviceProperties);

    @yc5("groups/bulkedit")
    qi0<f88> bulkEditGroups(@j80 EditGroupProperties editGroupProperties);

    @zc5("groups")
    @un1
    qi0<f88> bulkEditGroupsDeprecated(@j80 EditGroupProperties editGroupProperties);

    @yc5("groups")
    qi0<Group> createGroup(@j80 GroupDetailModel groupDetailModel);

    @jg1("groups/{groupId}")
    qi0<f88> deleteGroup(@xg5("groupId") UUID groupId);

    @yc5("devices/filter")
    qi0<DeviceListResponse> filterManagedDevices(@j80 DeviceFilteringModel deviceFilteringModel);

    @yc5("devices/filterhierarchical")
    qi0<GroupsDeviceListMap> filterManagedDevicesForGroups(@j80 DeviceFilteringModel deviceFilteringModel);

    @yc5("devices/filternexthierarchical")
    qi0<GroupsDeviceListMap> filterManagedDevicesForGroupsNext(@j80 FilterPaginationModel filterPaginationModel);

    @yc5("devices/filternext")
    qi0<DeviceListResponse> filterManagedDevicesNext(@j80 FilterPaginationModel filterPaginationModel);

    @yc5("devices/serversidefilternext")
    qi0<DeviceListResponse> filterManagedDevicesNextServerSide(@j80 FilterPaginationModel filterPaginationModel);

    @yc5("devices/serversidefilter")
    qi0<DeviceListResponse> filterManagedDevicesServerSide(@j80 DeviceFilteringModel deviceFilteringModel);

    @ox2("company-groups/{groupId}")
    qi0<Group> getCompanyGroup(@xg5("groupId") UUID groupId);

    @yc5("company-groups/details")
    qi0<CompanyGroupDetailsList> getCompanyGroupsDetails(@j80 GroupIdList groupIdList);

    @ox2("company-settings")
    qi0<CompanySettings> getCompanySettings();

    @ox2("me")
    qi0<Me> getCurrentSessionInformation();

    @ox2("devices/{deviceId}")
    qi0<Device> getDevice(@xg5("deviceId") UUID deviceId, @sy5("properties") List<DevicePropertyType> properties, @sy5("managementDetailsOnly") Boolean managementDetailsOnly);

    @yc5("devices/details")
    qi0<DeviceDetailsList> getDevicesDetails(@j80 DeviceIdList deviceIdList, @sy5("properties") List<DevicePropertyType> properties);

    @ox2("groups/{groupId}")
    qi0<Group> getGroup(@xg5("groupId") UUID groupId);

    @yc5("groups/details")
    qi0<GroupDetailsList> getGroupsDetails(@j80 GroupIdList groupIdList);

    @ox2("groups/sizes")
    qi0<GroupsSizesResponse> getGroupsSizes(@sy5("paginationToken") String paginationToken, @sy5("pageLimit") Integer pageLimit);

    @ox2("local")
    qi0<Local> getLocal(@sy5("limited") Boolean limited);

    @ox2("devices/company")
    qi0<DeviceListResponse> listCompanyDevices(@sy5("paginationToken") String paginationToken, @sy5("pageLimit") Integer pageLimit);

    @ox2("company-groups/{groupId}/devices")
    qi0<DeviceListResponse> listCompanyGroupDevices(@xg5("groupId") UUID groupId, @sy5("paginationToken") String paginationToken, @sy5("pageLimit") Integer pageLimit);

    @ox2("company-groups/{groupId}/pending-devices")
    qi0<DeviceListResponse> listCompanyGroupPendingDevices(@xg5("groupId") UUID groupId, @sy5("paginationToken") String paginationToken, @sy5("pageLimit") Integer pageLimit);

    @ox2("company-groups")
    qi0<GroupListResponse> listCompanyGroups(@sy5("paginationToken") String paginationToken, @sy5("pageLimit") Integer pageLimit);

    @ox2("devices")
    qi0<DeviceListResponse> listDevices(@sy5("paginationToken") String paginationToken, @sy5("pageLimit") Integer pageLimit);

    @ox2("groups/{groupId}/devices")
    qi0<DeviceListResponse> listGroupDevices(@xg5("groupId") UUID groupId, @sy5("paginationToken") String paginationToken, @sy5("pageLimit") Integer pageLimit);

    @ox2("groups/{groupId}/pending-devices")
    qi0<DeviceListResponse> listGroupPendingDevices(@xg5("groupId") UUID groupId, @sy5("paginationToken") String paginationToken, @sy5("pageLimit") Integer pageLimit);

    @yc5("groups/devices")
    qi0<GroupsDeviceListResponse> listGroupSetDevices(@j80 GroupsDevicesListModel groupsDevicesListModel);

    @yc5("groups/pending_devices")
    qi0<GroupsDeviceListResponse> listGroupSetPendingDevices(@j80 GroupsDevicesListModel groupsDevicesListModel);

    @ox2("groups")
    qi0<GroupListResponse> listGroups(@sy5("paginationToken") String paginationToken, @sy5("pageLimit") Integer pageLimit);

    @yc5("devices")
    qi0<DeviceListResponse> listSetDevices(@j80 DevicesSetModel devicesSetModel);

    @ox2("cache")
    qi0<CacheLoadedResponse> loadedStatus();

    @yc5("local")
    qi0<f88> manageLocal(@j80 InitialLocalDeviceParams initialLocalDeviceParams);

    @ox2("groups/migration")
    qi0<f88> migrateGroupsToCompany();

    @yc5("devices/unmanaged/move")
    qi0<f88> moveUnmanagedDevices(@j80 UnmanagedDevicesMove unmanagedDevicesMove);

    @zc5("devices/{deviceId}")
    qi0<Device> putDevice(@xg5("deviceId") UUID deviceId, @j80 DeviceStateDetailModel deviceStateDetailModel);

    @yc5("groups/revokeinheritancepermissions")
    qi0<f88> revokeInheritancePermissions(@j80 RevokeGroupInheritancePermissionsProperties revokeGroupInheritancePermissionsProperties);

    @zc5("company-settings")
    qi0<f88> setCompanySettings(@j80 CompanySettings companySettings);

    @yc5("devices/unmanaged/{deviceId}/password")
    qi0<f88> storeUnmanagedDevicePassword(@xg5("deviceId") UUID deviceId, @j80 UnmanagedDevicePassword unmanagedDevicePassword);

    @jg1("devices/{deviceId}")
    qi0<f88> unmanageDevice(@xg5("deviceId") UUID deviceId);

    @jg1("local")
    qi0<f88> unmanageLocal();

    @zc5("groups/{groupId}")
    qi0<Group> updateGroup(@xg5("groupId") UUID groupId, @j80 GroupDetailModel groupDetailModel);
}
