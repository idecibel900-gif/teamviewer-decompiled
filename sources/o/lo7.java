package o;

import com.teamviewer.apidefinitions.account.models.AccountChangeEvent;
import com.teamviewer.apidefinitions.account.models.AccountLoginFailureEvent;
import com.teamviewer.apidefinitions.account.models.AccountPictureAvailabilityChangedEvent;
import com.teamviewer.apidefinitions.account.models.AccountProfileEvent;
import com.teamviewer.apidefinitions.account.models.LicenseDetailsEvent;
import com.teamviewer.apidefinitions.account.models.LicensesChangedEvent;
import com.teamviewer.apidefinitions.account.models.SubLicenseEvent;
import com.teamviewer.apidefinitions.contacts.models.OrganizationContactSettingsChangedEvent;
import com.teamviewer.apidefinitions.contacts.models.PersonalContactAddedEvent;
import com.teamviewer.apidefinitions.contacts.models.PersonalContactChangedEvent;
import com.teamviewer.apidefinitions.contacts.models.PersonalContactInvitationAddedEvent;
import com.teamviewer.apidefinitions.contacts.models.PersonalContactInvitationRemovedEvent;
import com.teamviewer.apidefinitions.contacts.models.PersonalContactPictureAvailabilityChangedEvent;
import com.teamviewer.apidefinitions.contacts.models.PersonalContactRemovedEvent;
import com.teamviewer.apidefinitions.legacydevices.models.DeviceAddedEvent;
import com.teamviewer.apidefinitions.legacydevices.models.DeviceChangedEvent;
import com.teamviewer.apidefinitions.legacydevices.models.DeviceRemovedEvent;
import com.teamviewer.apidefinitions.legacydevices.models.DeviceStatusChangeEvent;
import com.teamviewer.apidefinitions.legacydevices.models.EasyAccessStatusChangeEvent;
import com.teamviewer.apidefinitions.legacydevices.models.GroupAddedEvent;
import com.teamviewer.apidefinitions.legacydevices.models.GroupChangedEvent;
import com.teamviewer.apidefinitions.legacydevices.models.GroupRemovedEvent;
import com.teamviewer.apidefinitions.legacydevices.models.MultipleDevicesAddedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.CompanyDeviceAddedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.CompanyDeviceRemovedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.DirectlyManagedDevicesCacheLoadedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.GroupManagedDevicesCacheLoadedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.LocalDeviceChangedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.ManagedDeviceAddedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.ManagedDeviceChangedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.ManagedDeviceOnlineStateChangedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.ManagedDeviceRemovedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.ManagedGroupAddedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.ManagedGroupChangedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.ManagedGroupRemovedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.ManagedGroupsCacheLoadedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.ManagerRelationChangedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.UnmanagedDeviceChangedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.UnmanagedDevicesAddedToGroupsEvent;
import com.teamviewer.apidefinitions.manageddevices.models.UnmanagedDevicesCacheLoadedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.UnmanagedDevicesCreatedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.UnmanagedDevicesDeletedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.UnmanagedDevicesMovedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.UnmanagedDevicesOnlineStateChangedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.UnmanagedDevicesPasswordInfoChangedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.UnmanagedDevicesRemovedFromGroupsEvent;
import com.teamviewer.apidefinitions.policies.models.PolicyAssignmentEvent;
import com.teamviewer.apidefinitions.policies.models.PolicyUnassignmentEvent;
import com.teamviewer.apidefinitions.policies.models.TeamViewerPolicyEvent;
import com.teamviewer.apidefinitions.recentconnections.models.RecentConnectionsChangedEvent;
import com.teamviewer.apidefinitions.recentconnections.models.RecentContactPictureAvailabilityChangedEvent;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSessionChangeEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class lo7 {
    public static final do5 a;

    static {
        List list = Collections.EMPTY_LIST;
        if (list.contains("manageddevices.v2.CompanyDeviceAddedEvent")) {
            hk0.g("Labels must be unique.");
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add("manageddevices.v2.CompanyDeviceAddedEvent");
        ArrayList arrayList2 = new ArrayList(list);
        arrayList2.add(CompanyDeviceAddedEvent.class);
        a = new do5(Object.class, "eventType", arrayList, arrayList2).b(CompanyDeviceRemovedEvent.class, "manageddevices.v2.CompanyDeviceRemovedEvent").b(DirectlyManagedDevicesCacheLoadedEvent.class, "manageddevices.v2.DirectlyManagedDevicesCacheLoadedEvent").b(GroupManagedDevicesCacheLoadedEvent.class, "manageddevices.v2.GroupManagedDevicesCacheLoadedEvent").b(LocalDeviceChangedEvent.class, "manageddevices.v2.LocalDeviceChangedEvent").b(ManagedDeviceAddedEvent.class, "manageddevices.v2.ManagedDeviceAddedEvent").b(ManagedDeviceChangedEvent.class, "manageddevices.v2.ManagedDeviceChangedEvent").b(ManagedDeviceOnlineStateChangedEvent.class, "manageddevices.v2.ManagedDeviceOnlineStateChangedEvent").b(ManagedDeviceRemovedEvent.class, "manageddevices.v2.ManagedDeviceRemovedEvent").b(ManagedGroupAddedEvent.class, "manageddevices.v2.ManagedGroupAddedEvent").b(ManagedGroupChangedEvent.class, "manageddevices.v2.ManagedGroupChangedEvent").b(ManagedGroupRemovedEvent.class, "manageddevices.v2.ManagedGroupRemovedEvent").b(ManagedGroupsCacheLoadedEvent.class, "manageddevices.v2.ManagedGroupsCacheLoadedEvent").b(ManagerRelationChangedEvent.class, "manageddevices.v2.ManagerRelationChangedEvent").b(UnmanagedDeviceChangedEvent.class, "manageddevices.v2.UnmanagedDeviceChangedEvent").b(UnmanagedDevicesAddedToGroupsEvent.class, "manageddevices.v2.UnmanagedDevicesAddedToGroupsEvent").b(UnmanagedDevicesCacheLoadedEvent.class, "manageddevices.v2.UnmanagedDevicesCacheLoadedEvent").b(UnmanagedDevicesCreatedEvent.class, "manageddevices.v2.UnmanagedDevicesCreatedEvent").b(UnmanagedDevicesDeletedEvent.class, "manageddevices.v2.UnmanagedDevicesDeletedEvent").b(UnmanagedDevicesMovedEvent.class, "manageddevices.v2.UnmanagedDevicesMovedEvent").b(UnmanagedDevicesOnlineStateChangedEvent.class, "manageddevices.v2.UnmanagedDevicesOnlineStateChangedEvent").b(UnmanagedDevicesPasswordInfoChangedEvent.class, "manageddevices.v2.UnmanagedDevicesPasswordInfoChangedEvent").b(UnmanagedDevicesRemovedFromGroupsEvent.class, "manageddevices.v2.UnmanagedDevicesRemovedFromGroupsEvent").b(DeviceAddedEvent.class, "legacydevices.v1.DeviceAddedEvent").b(DeviceChangedEvent.class, "legacydevices.v1.DeviceChangedEvent").b(DeviceRemovedEvent.class, "legacydevices.v1.DeviceRemovedEvent").b(DeviceStatusChangeEvent.class, "legacydevices.v1.DeviceStatusChangeEvent").b(EasyAccessStatusChangeEvent.class, "legacydevices.v1.EasyAccessStatusChangeEvent").b(GroupAddedEvent.class, "legacydevices.v1.GroupAddedEvent").b(GroupChangedEvent.class, "legacydevices.v1.GroupChangedEvent").b(GroupRemovedEvent.class, "legacydevices.v1.GroupRemovedEvent").b(MultipleDevicesAddedEvent.class, "legacydevices.v1.MultipleDevicesAddedEvent").b(OrganizationContactSettingsChangedEvent.class, "contacts.v1.OrganizationContactSettingsChangedEvent").b(PersonalContactAddedEvent.class, "contacts.v1.PersonalContactAddedEvent").b(PersonalContactChangedEvent.class, "contacts.v1.PersonalContactChangedEvent").b(PersonalContactInvitationAddedEvent.class, "contacts.v1.PersonalContactInvitationAddedEvent").b(PersonalContactInvitationRemovedEvent.class, "contacts.v1.PersonalContactInvitationRemovedEvent").b(PersonalContactPictureAvailabilityChangedEvent.class, "contacts.v1.PersonalContactPictureAvailabilityChangedEvent").b(PersonalContactRemovedEvent.class, "contacts.v1.PersonalContactRemovedEvent").b(SupportSessionChangeEvent.class, "supportsessions.v1.SupportSessionChangeEvent").b(RecentConnectionsChangedEvent.class, "recentconnections.v1.RecentConnectionsChangedEvent").b(RecentContactPictureAvailabilityChangedEvent.class, "recentconnections.v1.RecentContactPictureAvailabilityChangedEvent").b(AccountChangeEvent.class, "account.v1.AccountChangeEvent").b(AccountLoginFailureEvent.class, "account.v1.AccountLoginFailureEvent").b(AccountPictureAvailabilityChangedEvent.class, "account.v1.AccountPictureAvailabilityChangedEvent").b(AccountProfileEvent.class, "account.v1.AccountProfileEvent").b(LicenseDetailsEvent.class, "account.v1.LicenseDetailsEvent").b(LicensesChangedEvent.class, "account.v1.LicensesChangedEvent").b(SubLicenseEvent.class, "account.v1.SubLicenseEvent").b(TeamViewerPolicyEvent.class, "policies.v0.TeamViewerPolicyEvent").b(PolicyAssignmentEvent.class, "policies.v0.PolicyAssignmentEvent").b(PolicyUnassignmentEvent.class, "policies.v0.PolicyUnassignmentEvent");
    }
}
