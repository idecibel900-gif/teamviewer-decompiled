package com.teamviewer.apidefinitions.account.models;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.bq3;
import o.ic2;
import o.qs1;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\bg\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u0000 l2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001lB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010j\u001a\u00020kH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bi¨\u0006m"}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/CompanyPermission;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "AllowGroupSharing", "ManageAdmins", "ManageUsers", "ShareGroupsForOtherUser", "ModifyConnections", "DeleteConnections", "FullProfileModification", "SynchWithManager", "MonitoringManagePolicies", "MonitoringAssignPolicies", "MonitoringViewAndAckOwnAlerts", "AssetTrackingViewAll", "AssetTrackingViewOwn", "MonitoringViewAndAckAllAlerts", "EditOwnCustomModuleConfigs", "EditAllCustomModuleConfigs", "ManageTvClientSettingsPolicies", "AssignTvClientSettingsPolicies", "ManageAntiMalwarePolicies", "AssignAntiMalwarePolicies", "AcknowledgeOwnAntiMalwareThreats", "AcknowledgeAllAntiMalwareThreats", "ManageBackupPolicies", "AssignBackupPolicies", "BackupViewAndAckOwnAlerts", "PasswordModification", "ManageAuditability", "TrustedDeviceManagement", "ConnectionManagementAccessAll", "ConnectionManagementAccessOwn", "MobileDeviceManagementAccessAll", "ServiceDeskTicketsViewAll", "ServiceDeskTicketsViewOwn", "ServiceDeskTicketsViewTeam", "ServiceDeskTicketsViewUnassigned", "ServiceDeskTicketsCreateEmail", "ServiceDeskTicketsDelete", "ServiceDeskTicketsEditAll", "ServiceDeskTicketsEditTimeEntries", "ServiceDeskTicketsReply", "ServiceDeskTicketsAssignTeam", "ServiceDeskTicketsAssignAnyTeam", "ServiceDeskTicketsAssignAnyUser", "ServiceDeskTicketsManageNotesAll", "ServiceDeskTicketsManageNotesOwn", "ServiceDeskSettingsManageConfiguration", "ServiceDeskSettingsAutomationManageRules", "ServiceDeskSettingsAutomationManageLabels", "ServiceDeskSettingsManageSignatures", "ServiceDeskDashboardsViewAll", "ServiceDeskDashboardsViewOwn", "ServiceDeskDashboardsViewTeam", "ServiceDeskDashboardsManage", "ManageTaskAutomations", "ManageSharedScripts", "ViewSharedScripts", "ExecuteSharedScripts", "SessionSummaryGenerate", "SessionSummaryView", "SessionSummaryEdit", "SessionSummaryDelete", "SessionSummaryDeleteCollectedData", "SessionSummaryManualRecording", "SmartGuideCreate", "ManageKnowledgeBaseArticles", "CreateKnowledgeBaseArticles", "ViewKnowledgeBaseArticles", "UpdateKnowledgeBaseArticles", "DeleteKnowledgeBaseArticles", "ManageKnowledgeBaseCategories", "DeleteKnowledgeBaseCategories", "ViewLicenses", "EditLicenses", "ViewUserGroups", "ManageTenantManagers", "CreateOrganizationalUnits", "ReadOrganizationalUnits", "UpdateOrganizationalUnits", "DeleteOrganizationalUnits", "ViewManagedRelations", "CreateManagedRelations", "UpdateManagedRelations", "DeleteManagedRelations", "CreateUsers", "ReadUsers", "UpdateUsers", "DeleteUsers", "ReadCompanySettings", "UpdateCompanySettings", "DeleteCompany", "CreateUserRoles", "ReadUserRoles", "UpdateUserRoles", "DeleteUserRoles", "CreateUsageReporting", "ViewUsageReporting", "UpdateUsageReporting", "DeleteUsageReporting", "toString", "", "Companion", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@bq3(generateAdapter = false)
public enum CompanyPermission {
    AllowGroupSharing(1),
    ManageAdmins(2),
    ManageUsers(3),
    ShareGroupsForOtherUser(4),
    ModifyConnections(7),
    DeleteConnections(8),
    FullProfileModification(9),
    SynchWithManager(10),
    MonitoringManagePolicies(12),
    MonitoringAssignPolicies(13),
    MonitoringViewAndAckOwnAlerts(14),
    AssetTrackingViewAll(15),
    AssetTrackingViewOwn(16),
    MonitoringViewAndAckAllAlerts(17),
    EditOwnCustomModuleConfigs(18),
    EditAllCustomModuleConfigs(19),
    ManageTvClientSettingsPolicies(20),
    AssignTvClientSettingsPolicies(21),
    ManageAntiMalwarePolicies(22),
    AssignAntiMalwarePolicies(23),
    AcknowledgeOwnAntiMalwareThreats(24),
    AcknowledgeAllAntiMalwareThreats(25),
    ManageBackupPolicies(26),
    AssignBackupPolicies(27),
    BackupViewAndAckOwnAlerts(28),
    PasswordModification(29),
    ManageAuditability(30),
    TrustedDeviceManagement(31),
    ConnectionManagementAccessAll(32),
    ConnectionManagementAccessOwn(33),
    MobileDeviceManagementAccessAll(34),
    ServiceDeskTicketsViewAll(35),
    ServiceDeskTicketsViewOwn(36),
    ServiceDeskTicketsViewTeam(37),
    ServiceDeskTicketsViewUnassigned(38),
    ServiceDeskTicketsCreateEmail(39),
    ServiceDeskTicketsDelete(40),
    ServiceDeskTicketsEditAll(41),
    ServiceDeskTicketsEditTimeEntries(42),
    ServiceDeskTicketsReply(43),
    ServiceDeskTicketsAssignTeam(44),
    ServiceDeskTicketsAssignAnyTeam(45),
    ServiceDeskTicketsAssignAnyUser(46),
    ServiceDeskTicketsManageNotesAll(47),
    ServiceDeskTicketsManageNotesOwn(48),
    ServiceDeskSettingsManageConfiguration(49),
    ServiceDeskSettingsAutomationManageRules(50),
    ServiceDeskSettingsAutomationManageLabels(51),
    ServiceDeskSettingsManageSignatures(52),
    ServiceDeskDashboardsViewAll(53),
    ServiceDeskDashboardsViewOwn(54),
    ServiceDeskDashboardsViewTeam(55),
    ServiceDeskDashboardsManage(56),
    ManageTaskAutomations(57),
    ManageSharedScripts(58),
    ViewSharedScripts(59),
    ExecuteSharedScripts(60),
    SessionSummaryGenerate(61),
    SessionSummaryView(62),
    SessionSummaryEdit(63),
    SessionSummaryDelete(64),
    SessionSummaryDeleteCollectedData(65),
    SessionSummaryManualRecording(66),
    SmartGuideCreate(67),
    ManageKnowledgeBaseArticles(68),
    CreateKnowledgeBaseArticles(69),
    ViewKnowledgeBaseArticles(70),
    UpdateKnowledgeBaseArticles(71),
    DeleteKnowledgeBaseArticles(72),
    ManageKnowledgeBaseCategories(73),
    DeleteKnowledgeBaseCategories(74),
    ViewLicenses(75),
    EditLicenses(76),
    ViewUserGroups(77),
    ManageTenantManagers(78),
    CreateOrganizationalUnits(79),
    ReadOrganizationalUnits(80),
    UpdateOrganizationalUnits(81),
    DeleteOrganizationalUnits(82),
    ViewManagedRelations(84),
    CreateManagedRelations(85),
    UpdateManagedRelations(86),
    DeleteManagedRelations(87),
    CreateUsers(88),
    ReadUsers(89),
    UpdateUsers(90),
    DeleteUsers(91),
    ReadCompanySettings(92),
    UpdateCompanySettings(93),
    DeleteCompany(94),
    CreateUserRoles(95),
    ReadUserRoles(96),
    UpdateUserRoles(97),
    DeleteUserRoles(98),
    CreateUsageReporting(99),
    ViewUsageReporting(100),
    UpdateUsageReporting(101),
    DeleteUsageReporting(102);

    private final int value;
    private static final /* synthetic */ ic2 $ENTRIES = qs1.K(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    CompanyPermission(int i) {
        this.value = i;
    }

    public static ic2 getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return String.valueOf(this.value);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¨\u0006\t"}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/CompanyPermission$Companion;", "", "<init>", "()V", "encode", "", "data", "decode", "Lcom/teamviewer/apidefinitions/account/models/CompanyPermission;", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CompanyPermission decode(Object data) {
            if (data != null) {
                String lowerCase = String.valueOf(data).toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                for (CompanyPermission companyPermission : CompanyPermission.values()) {
                    if (data == companyPermission || ua5.y(String.valueOf(companyPermission), Locale.ROOT, lowerCase)) {
                        return companyPermission;
                    }
                }
            }
            return null;
        }

        public final String encode(Object data) {
            if (data instanceof CompanyPermission) {
                return String.valueOf(data);
            }
            return null;
        }

        private Companion() {
        }
    }
}
