package com.teamviewer.apidefinitions.legacydevices.apis;

import com.teamviewer.apidefinitions.legacydevices.models.BuddyIdList;
import com.teamviewer.apidefinitions.legacydevices.models.Device;
import com.teamviewer.apidefinitions.legacydevices.models.DeviceListResponse;
import com.teamviewer.apidefinitions.legacydevices.models.DeviceMeta;
import com.teamviewer.apidefinitions.legacydevices.models.DeviceSearchRequest;
import com.teamviewer.apidefinitions.legacydevices.models.Group;
import com.teamviewer.apidefinitions.legacydevices.models.GroupAdditionalDetails;
import com.teamviewer.apidefinitions.legacydevices.models.GroupCreateModel;
import com.teamviewer.apidefinitions.legacydevices.models.GroupEditModel;
import com.teamviewer.apidefinitions.legacydevices.models.GroupListResponse;
import com.teamviewer.apidefinitions.legacydevices.models.GroupShareModel;
import kotlin.Metadata;
import o.f88;
import o.j80;
import o.jg1;
import o.ox2;
import o.qc5;
import o.qi0;
import o.sy5;
import o.xg5;
import o.yc5;
import o.yq4;
import o.zc5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u0012H'¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u0012H'¢\u0006\u0004\b\u0017\u0010\u0015J)\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u00122\b\b\u0001\u0010\u0019\u001a\u00020\u0018H'¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u00122\b\b\u0001\u0010\u001d\u001a\u00020\u001cH'¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u00122\b\b\u0001\u0010!\u001a\u00020 H'¢\u0006\u0004\b\"\u0010#J\u001f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00042\b\b\u0001\u0010%\u001a\u00020$H'¢\u0006\u0004\b'\u0010(J-\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00042\n\b\u0003\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0003\u0010+\u001a\u0004\u0018\u00010\u0012H'¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u0012H'¢\u0006\u0004\b/\u0010\u0015J\u0015\u00101\u001a\b\u0012\u0004\u0012\u0002000\u0004H'¢\u0006\u0004\b1\u00102J\u001f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u0012H'¢\u0006\u0004\b3\u0010\u0015J\u001f\u00104\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u0012H'¢\u0006\u0004\b4\u0010\u0015J\u001f\u00105\u001a\b\u0012\u0004\u0012\u00020 0\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u0012H'¢\u0006\u0004\b5\u0010\u0015J!\u00106\u001a\b\u0012\u0004\u0012\u00020&0\u00042\n\b\u0003\u0010*\u001a\u0004\u0018\u00010)H'¢\u0006\u0004\b6\u00107J7\u00108\u001a\b\u0012\u0004\u0012\u00020&0\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u00122\n\b\u0003\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0003\u0010+\u001a\u0004\u0018\u00010\u0012H'¢\u0006\u0004\b8\u00109J)\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H'¢\u0006\u0004\b<\u00102¨\u0006="}, d2 = {"Lcom/teamviewer/apidefinitions/legacydevices/apis/LegacydevicesApi;", "", "Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceMeta;", "deviceMeta", "Lo/qi0;", "Lcom/teamviewer/apidefinitions/legacydevices/models/Device;", "addDevice", "(Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceMeta;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/legacydevices/models/BuddyIdList;", "buddyIdList", "Lo/f88;", "bulkDeleteDevices", "(Lcom/teamviewer/apidefinitions/legacydevices/models/BuddyIdList;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/legacydevices/models/GroupCreateModel;", "groupCreateModel", "Lcom/teamviewer/apidefinitions/legacydevices/models/Group;", "createGroup", "(Lcom/teamviewer/apidefinitions/legacydevices/models/GroupCreateModel;)Lo/qi0;", "", "deviceId", "deleteDevice", "(I)Lo/qi0;", "groupId", "deleteGroupById", "Lcom/teamviewer/apidefinitions/legacydevices/models/GroupAdditionalDetails;", "groupAdditionalDetails", "editGroupAdditionalDetails", "(ILcom/teamviewer/apidefinitions/legacydevices/models/GroupAdditionalDetails;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/legacydevices/models/GroupEditModel;", "groupEditModel", "editGroupById", "(ILcom/teamviewer/apidefinitions/legacydevices/models/GroupEditModel;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/legacydevices/models/GroupShareModel;", "groupShareModel", "editSharedContactRights", "(ILcom/teamviewer/apidefinitions/legacydevices/models/GroupShareModel;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceSearchRequest;", "deviceSearchRequest", "Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceListResponse;", "filterDevices", "(Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceSearchRequest;)Lo/qi0;", "", "paginationToken", "pageLimit", "Lcom/teamviewer/apidefinitions/legacydevices/models/GroupListResponse;", "getAllGroups", "(Ljava/lang/String;Ljava/lang/Integer;)Lo/qi0;", "getDeviceById", "", "getEasyAccessStatus", "()Lo/qi0;", "getGroupAdditionalDetails", "getGroupById", "getSharedContactRights", "listDevices", "(Ljava/lang/String;)Lo/qi0;", "listDevicesByGroupId", "(ILjava/lang/String;Ljava/lang/Integer;)Lo/qi0;", "patchDevice", "(ILcom/teamviewer/apidefinitions/legacydevices/models/DeviceMeta;)Lo/qi0;", "unmanageLocal", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface LegacydevicesApi {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ qi0 getAllGroups$default(LegacydevicesApi legacydevicesApi, String str, Integer num, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: getAllGroups");
                return null;
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                num = null;
            }
            return legacydevicesApi.getAllGroups(str, num);
        }

        public static /* synthetic */ qi0 listDevices$default(LegacydevicesApi legacydevicesApi, String str, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: listDevices");
                return null;
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return legacydevicesApi.listDevices(str);
        }

        public static /* synthetic */ qi0 listDevicesByGroupId$default(LegacydevicesApi legacydevicesApi, int i, String str, Integer num, int i2, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: listDevicesByGroupId");
                return null;
            }
            if ((i2 & 2) != 0) {
                str = null;
            }
            if ((i2 & 4) != 0) {
                num = null;
            }
            return legacydevicesApi.listDevicesByGroupId(i, str, num);
        }
    }

    @yc5("devices")
    qi0<Device> addDevice(@j80 DeviceMeta deviceMeta);

    @yc5("devices/bulkdelete")
    qi0<f88> bulkDeleteDevices(@j80 BuddyIdList buddyIdList);

    @yc5("groups")
    qi0<Group> createGroup(@j80 GroupCreateModel groupCreateModel);

    @jg1("devices/{deviceId}")
    qi0<f88> deleteDevice(@xg5("deviceId") int deviceId);

    @jg1("group/{groupId}")
    qi0<f88> deleteGroupById(@xg5("groupId") int groupId);

    @zc5("groups/{groupId}/additionaldetails")
    qi0<f88> editGroupAdditionalDetails(@xg5("groupId") int groupId, @j80 GroupAdditionalDetails groupAdditionalDetails);

    @qc5("group/{groupId}")
    qi0<f88> editGroupById(@xg5("groupId") int groupId, @j80 GroupEditModel groupEditModel);

    @qc5("groups/{groupId}/sharedrights")
    qi0<f88> editSharedContactRights(@xg5("groupId") int groupId, @j80 GroupShareModel groupShareModel);

    @yc5("devices/filter")
    qi0<DeviceListResponse> filterDevices(@j80 DeviceSearchRequest deviceSearchRequest);

    @ox2("groups")
    qi0<GroupListResponse> getAllGroups(@sy5("paginationToken") String paginationToken, @sy5("pageLimit") Integer pageLimit);

    @ox2("devices/{deviceId}")
    qi0<Device> getDeviceById(@xg5("deviceId") int deviceId);

    @ox2("devices/local")
    qi0<Boolean> getEasyAccessStatus();

    @ox2("groups/{groupId}/additionaldetails")
    qi0<GroupAdditionalDetails> getGroupAdditionalDetails(@xg5("groupId") int groupId);

    @ox2("group/{groupId}")
    qi0<Group> getGroupById(@xg5("groupId") int groupId);

    @ox2("groups/{groupId}/sharedrights")
    qi0<GroupShareModel> getSharedContactRights(@xg5("groupId") int groupId);

    @ox2("devices")
    qi0<DeviceListResponse> listDevices(@sy5("paginationToken") String paginationToken);

    @ox2("groups/{groupId}/devices")
    qi0<DeviceListResponse> listDevicesByGroupId(@xg5("groupId") int groupId, @sy5("paginationToken") String paginationToken, @sy5("pageLimit") Integer pageLimit);

    @qc5("devices/{deviceId}")
    qi0<Device> patchDevice(@xg5("deviceId") int deviceId, @j80 DeviceMeta deviceMeta);

    @jg1("devices/local")
    qi0<f88> unmanageLocal();
}
