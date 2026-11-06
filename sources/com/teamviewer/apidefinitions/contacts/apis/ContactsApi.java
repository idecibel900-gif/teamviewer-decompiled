package com.teamviewer.apidefinitions.contacts.apis;

import com.teamviewer.apidefinitions.contacts.models.AccountContactDeviceInfo;
import com.teamviewer.apidefinitions.contacts.models.AccountContactSettings;
import com.teamviewer.apidefinitions.contacts.models.CreatePersonalInvitationResult;
import com.teamviewer.apidefinitions.contacts.models.DetailedPersonalContact;
import com.teamviewer.apidefinitions.contacts.models.OrganizationContactList;
import com.teamviewer.apidefinitions.contacts.models.OrganizationContactSettings;
import com.teamviewer.apidefinitions.contacts.models.PersonalContactInvitationList;
import com.teamviewer.apidefinitions.contacts.models.PersonalContactInvitationRequest;
import com.teamviewer.apidefinitions.contacts.models.PersonalContactList;
import com.teamviewer.apidefinitions.contacts.models.PersonalContactSearchRequest;
import com.teamviewer.apidefinitions.contacts.models.UserGroupFilteredContactsSetting;
import java.util.List;
import kotlin.Metadata;
import o.f88;
import o.j80;
import o.jg1;
import o.ox2;
import o.qi0;
import o.sy5;
import o.xg5;
import o.yc5;
import o.yq4;
import o.zc5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\b\b\u0001\u0010\u0012\u001a\u00020\u0007H'¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\b\b\u0001\u0010\u0018\u001a\u00020\u0017H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004H'¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u00042\b\b\u0001\u0010\u001f\u001a\u00020\u0007H'¢\u0006\u0004\b\"\u0010\u0015J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b#\u0010\u001eJ\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b$\u0010\u0015J%\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b%\u0010\u0015J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0004H'¢\u0006\u0004\b'\u0010\u001eJ!\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00042\n\b\u0003\u0010)\u001a\u0004\u0018\u00010(H'¢\u0006\u0004\b+\u0010,J!\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\n\b\u0003\u0010)\u001a\u0004\u0018\u00010(H'¢\u0006\u0004\b-\u0010,J!\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00042\n\b\u0003\u0010)\u001a\u0004\u0018\u00010(H'¢\u0006\u0004\b/\u0010,J\u001f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\b\b\u0001\u00100\u001a\u00020\u0007H'¢\u0006\u0004\b1\u0010\u0015J\u001f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\b\b\u0001\u00102\u001a\u00020&H'¢\u0006\u0004\b3\u00104¨\u00065"}, d2 = {"Lcom/teamviewer/apidefinitions/contacts/apis/ContactsApi;", "", "Lcom/teamviewer/apidefinitions/contacts/models/OrganizationContactSettings;", "organizationContactSettings", "Lo/qi0;", "changeOrganizationContactSettings", "(Lcom/teamviewer/apidefinitions/contacts/models/OrganizationContactSettings;)Lo/qi0;", "", "personalContactId", "Lcom/teamviewer/apidefinitions/contacts/models/DetailedPersonalContact;", "detailedPersonalContact", "changePersonalContact", "(ILcom/teamviewer/apidefinitions/contacts/models/DetailedPersonalContact;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/contacts/models/PersonalContactInvitationRequest;", "personalContactInvitationRequest", "Lcom/teamviewer/apidefinitions/contacts/models/CreatePersonalInvitationResult;", "createPersonalContactInvitation", "(Lcom/teamviewer/apidefinitions/contacts/models/PersonalContactInvitationRequest;)Lo/qi0;", "personalInvitationId", "Lo/f88;", "deletePersonalInvitation", "(I)Lo/qi0;", "deletePersonalcontact", "Lcom/teamviewer/apidefinitions/contacts/models/PersonalContactSearchRequest;", "personalContactSearchRequest", "Lcom/teamviewer/apidefinitions/contacts/models/PersonalContactList;", "filterContacts", "(Lcom/teamviewer/apidefinitions/contacts/models/PersonalContactSearchRequest;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/contacts/models/AccountContactSettings;", "getAccountContactSettings", "()Lo/qi0;", "accountId", "", "Lcom/teamviewer/apidefinitions/contacts/models/AccountContactDeviceInfo;", "getAccountDevices", "getOrganizationContactSettings", "getPersonalContactDetails", "getPersonalContactDevices", "Lcom/teamviewer/apidefinitions/contacts/models/UserGroupFilteredContactsSetting;", "getUserGroupFilteredContacts", "", "paginationToken", "Lcom/teamviewer/apidefinitions/contacts/models/OrganizationContactList;", "listOrganizationContacts", "(Ljava/lang/String;)Lo/qi0;", "listPersonalContact", "Lcom/teamviewer/apidefinitions/contacts/models/PersonalContactInvitationList;", "listPersonalContactInvitations", "groupId", "listPersonalGroupContacts", "userGroupFilteredContactsSetting", "setUserGroupFilteredContacts", "(Lcom/teamviewer/apidefinitions/contacts/models/UserGroupFilteredContactsSetting;)Lo/qi0;", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ContactsApi {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ qi0 listOrganizationContacts$default(ContactsApi contactsApi, String str, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: listOrganizationContacts");
                return null;
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return contactsApi.listOrganizationContacts(str);
        }

        public static /* synthetic */ qi0 listPersonalContact$default(ContactsApi contactsApi, String str, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: listPersonalContact");
                return null;
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return contactsApi.listPersonalContact(str);
        }

        public static /* synthetic */ qi0 listPersonalContactInvitations$default(ContactsApi contactsApi, String str, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: listPersonalContactInvitations");
                return null;
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return contactsApi.listPersonalContactInvitations(str);
        }
    }

    @zc5("organization/settings")
    qi0<OrganizationContactSettings> changeOrganizationContactSettings(@j80 OrganizationContactSettings organizationContactSettings);

    @zc5("personal/{personalContactId}")
    qi0<DetailedPersonalContact> changePersonalContact(@xg5("personalContactId") int personalContactId, @j80 DetailedPersonalContact detailedPersonalContact);

    @yc5("personal/invitations")
    qi0<CreatePersonalInvitationResult> createPersonalContactInvitation(@j80 PersonalContactInvitationRequest personalContactInvitationRequest);

    @jg1("personal/invitations/{personalInvitationId}")
    qi0<f88> deletePersonalInvitation(@xg5("personalInvitationId") int personalInvitationId);

    @jg1("personal/{personalContactId}")
    qi0<f88> deletePersonalcontact(@xg5("personalContactId") int personalContactId);

    @yc5("personal/filter")
    qi0<PersonalContactList> filterContacts(@j80 PersonalContactSearchRequest personalContactSearchRequest);

    @ox2("accountcontactsettings")
    qi0<AccountContactSettings> getAccountContactSettings();

    @ox2("organization/{accountId}/devices")
    qi0<List<AccountContactDeviceInfo>> getAccountDevices(@xg5("accountId") int accountId);

    @ox2("organization/settings")
    qi0<OrganizationContactSettings> getOrganizationContactSettings();

    @ox2("personal/{personalContactId}")
    qi0<DetailedPersonalContact> getPersonalContactDetails(@xg5("personalContactId") int personalContactId);

    @ox2("personal/{personalContactId}/devices")
    qi0<List<AccountContactDeviceInfo>> getPersonalContactDevices(@xg5("personalContactId") int personalContactId);

    @ox2("organization/settings/usergroupfilteredcontacts")
    qi0<UserGroupFilteredContactsSetting> getUserGroupFilteredContacts();

    @ox2("organization")
    qi0<OrganizationContactList> listOrganizationContacts(@sy5("paginationToken") String paginationToken);

    @ox2("personal")
    qi0<PersonalContactList> listPersonalContact(@sy5("paginationToken") String paginationToken);

    @ox2("personal/invitations")
    qi0<PersonalContactInvitationList> listPersonalContactInvitations(@sy5("paginationToken") String paginationToken);

    @ox2("personal/group/{groupId}")
    qi0<PersonalContactList> listPersonalGroupContacts(@xg5("groupId") int groupId);

    @zc5("organization/settings/usergroupfilteredcontacts")
    qi0<f88> setUserGroupFilteredContacts(@j80 UserGroupFilteredContactsSetting userGroupFilteredContactsSetting);
}
