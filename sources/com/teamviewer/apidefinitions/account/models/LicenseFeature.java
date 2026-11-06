package com.teamviewer.apidefinitions.account.models;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.bq3;
import o.ic2;
import o.qs1;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001b\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0003\b¸\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u0000 ½\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002½\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010»\u0001\u001a\u00030¼\u0001H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001j\u0003\b\u009e\u0001j\u0003\b\u009f\u0001j\u0003\b \u0001j\u0003\b¡\u0001j\u0003\b¢\u0001j\u0003\b£\u0001j\u0003\b¤\u0001j\u0003\b¥\u0001j\u0003\b¦\u0001j\u0003\b§\u0001j\u0003\b¨\u0001j\u0003\b©\u0001j\u0003\bª\u0001j\u0003\b«\u0001j\u0003\b¬\u0001j\u0003\b\u00ad\u0001j\u0003\b®\u0001j\u0003\b¯\u0001j\u0003\b°\u0001j\u0003\b±\u0001j\u0003\b²\u0001j\u0003\b³\u0001j\u0003\b´\u0001j\u0003\bµ\u0001j\u0003\b¶\u0001j\u0003\b·\u0001j\u0003\b¸\u0001j\u0003\b¹\u0001j\u0003\bº\u0001¨\u0006¾\u0001"}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/LicenseFeature;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ConnectionReporting", "UserManagement", "ShareGroup", "FastVideo", "RemoteSound", "DirectXGrab", "AdditionalLicensedSessions", "RS_Screen", "RS_Filetransfer", "RS_Configuration_WLAN", "RS_Configuration_EMAIL", "RS_Screenshot", "RS_Apps", "RS_Processes", "RS_Logfiles", "RS_Connection", "RS_Configuration_FILE", "Api_V1", "RS_Screen_V9", "AddNewDeviceDownload", "SettingPolicies", "Api_V2", "RS_Screen_V10", "SharedGroups_V11", "RS_Screen_V11", "SessionCodeCanStartChat", "SalesforceIntegration", "RS_Screen_V12", "InSessionDashboard", "LeaveNote", "IncomingConnectionReporting", "ServicecampIntegration", "WebApiPolicyManagement", "RS_Mobile2Mobile", "EasyRollout", "PolicyComplianceCheck", "SupportCaseNotification", "QuickSteps", "FileTransfer_RecentFiles", "InSessionDashboard_Extended", "SC_DefaultAssignee", "RemoteWebControl_RasPi", "RemoteWebControl_NAS", "RemoteWebControl_RasPi_Commercial", "SublicensingAllowed", "ActivationOnAccountAllowed", "ActivationOnCompanyAllowed", "LinkWithAccountAllowed", "ActivationOnDeviceAllowed", "FileTransfer_Queuing", "RecentlyContactedPartners", "IntuneIntegration", "ServiceNowIntegration", "ZendeskIntegration", "SwitchSides", "BlackScreen", "RemotePrinting", "RS_ScreenSharing_iOS", "AccountPasswordModification", "EnforceAutoRecording", "SessionRecordingDirectoryPolicy", "IoT_RemoteControl", "IoT_Monitoring", "IoT_Cloud_Visualisation", "BasicAssetTracking", "RS_Screen_V13", "IdentityAccessManagement", "ConnectionsToCustomModules", "SessionRecording", "MSIDownload", "EnterpriseUI", "AuditabilityBasic", "SessionScripting", "PilotBasic", "RS_Screen_V14", "CustomDeviceInformation", "CustomDeviceInformationGrouping", "IoT_PortForwarding", "IoT_RemoteScreen", "ConditionalAccessHosted", "SessionHandover", "SessionChat", "SessionVideo", "SessionWhiteboard", "SessionConferenceCallViaInternet", "SessionConferenceCallByPhone", "Api_SCIM", "RS_Screen_V15", "TrialLicense", "RS_Apps_Start", "RS_Screen_Inject", "RemoteWorker", "NamedUsers", "ChannelLimitNotifications", "MobileSDK_V2", "Organization_Management", "ManagedDeviceV2", "SMSInviteForSessionCodes", "TeamviewerMeeting_StartMeeting", "TeamviewerMeeting_PhoneViaPremiumNumbers", "TeamviewerMeeting_PhoneViaLocalNumbers", "TeamviewerMeeting_SessionRecording", "TeamviewerMeeting_Reporting", "TeamviewerMeeting_Removable", "TeamviewerMeeting_RemoteControl", "TVAssistAR_SessionRequest", "TVAssistAR_ConnectionProtocol", "CustomerTermsConditions", "WebClient", "SystemUpdate", "TVAssistAR_SDK", "MSDynamics365Integration", "ServiceNowEnterpriseIntegration", "UserGroups", "CompanyAddressBook", "TVAssistAR_MultipleExpert", "TVAssistAR_SessionRequestForAll", "AuthenticationDeviceForwarding", "ActivationOnOrganizationAllowed", "RemoteTerminal", "TVAssistAR_ScreenSharing", "TVAssistAR_TwoWayChat", "Cobrowsing", "RemoteCamera", "VPN", "RemoteHostUpdate", "ClassicServiceCases", "ServiceCaseReporting", "CustomerSatisfactionRating", "SOSButton", "WebApiTokenCreation", "ConnectionBillings", "WakeOnLan", "BookmarkDevice", "BringYourOwnCertificate", "Api_UserGroups", "EasyRollout_Enhanced", "TVAssistAR_SMSInviteForSessionCodes", "TVAssistAR_AugmentRCSession", "ManualActivationOnAccountAllowed", "PredefinedRole", "TVAssistAR_Translations", "TVAssistAR_LiveCaptions", "PolicyToUpdateToSpecificVersion", "MultipleSupporterSessions", "PreAuthorizedSessions", "CustomMobileQuickSupport", "ManageVirtualMonitor", "SessionRecordingCustomerHosted", "SessionRecordingTeamViewerHosted", "ServiceDesk", "TVAssistAR_LiveCaptionsWithTranslations", "PolicyForFullClientUI", "SessionSummary", "TVAssistAR_IntegratedAftersalesSolution", "TVAssistAR_Transcription", "CompanyDeviceGroupManagement", "DevicePermissionsInheritance", "InsessionChatTranscript", "TVAssistAR_SessionSummary", "ConditionalAccess_ApproveAccessRequests", "CustomAndroidHost", "AIScriptWriter", "TVAssistAR_SessionSummaryWithSettings", "DeviceCustomFields", "GoogleMeetIntegration", "TVAssistAR_TranscriptionUpload", "MultitenancyManagement", "ConnectViaPassword", "AttendedAccess", "TVAssistAR_SessionSummaryUpload", "TVAssistAR_ScreenshotUpload", "CoPilotDeviceData", "CoPilotChat", "CoPilotScreenshot", "HideServerPanel", "LAPSIntegration", "JumpGateJumpTarget", "PolicyForIncomingSessionRecording", "toString", "", "Companion", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@bq3(generateAdapter = false)
public enum LicenseFeature {
    ConnectionReporting(1),
    UserManagement(2),
    ShareGroup(3),
    FastVideo(4),
    RemoteSound(5),
    DirectXGrab(6),
    AdditionalLicensedSessions(7),
    RS_Screen(8),
    RS_Filetransfer(9),
    RS_Configuration_WLAN(10),
    RS_Configuration_EMAIL(11),
    RS_Screenshot(12),
    RS_Apps(13),
    RS_Processes(14),
    RS_Logfiles(15),
    RS_Connection(16),
    RS_Configuration_FILE(17),
    Api_V1(18),
    RS_Screen_V9(19),
    AddNewDeviceDownload(20),
    SettingPolicies(21),
    Api_V2(22),
    RS_Screen_V10(23),
    SharedGroups_V11(24),
    RS_Screen_V11(25),
    SessionCodeCanStartChat(26),
    SalesforceIntegration(27),
    RS_Screen_V12(28),
    InSessionDashboard(29),
    LeaveNote(30),
    IncomingConnectionReporting(32),
    ServicecampIntegration(33),
    WebApiPolicyManagement(34),
    RS_Mobile2Mobile(35),
    EasyRollout(36),
    PolicyComplianceCheck(37),
    SupportCaseNotification(38),
    QuickSteps(39),
    FileTransfer_RecentFiles(40),
    InSessionDashboard_Extended(41),
    SC_DefaultAssignee(42),
    RemoteWebControl_RasPi(43),
    RemoteWebControl_NAS(44),
    RemoteWebControl_RasPi_Commercial(45),
    SublicensingAllowed(46),
    ActivationOnAccountAllowed(47),
    ActivationOnCompanyAllowed(48),
    LinkWithAccountAllowed(49),
    ActivationOnDeviceAllowed(50),
    FileTransfer_Queuing(51),
    RecentlyContactedPartners(52),
    IntuneIntegration(53),
    ServiceNowIntegration(54),
    ZendeskIntegration(55),
    SwitchSides(56),
    BlackScreen(57),
    RemotePrinting(58),
    RS_ScreenSharing_iOS(59),
    AccountPasswordModification(60),
    EnforceAutoRecording(61),
    SessionRecordingDirectoryPolicy(62),
    IoT_RemoteControl(63),
    IoT_Monitoring(64),
    IoT_Cloud_Visualisation(65),
    BasicAssetTracking(66),
    RS_Screen_V13(67),
    IdentityAccessManagement(68),
    ConnectionsToCustomModules(69),
    SessionRecording(70),
    MSIDownload(71),
    EnterpriseUI(72),
    AuditabilityBasic(73),
    SessionScripting(74),
    PilotBasic(75),
    RS_Screen_V14(76),
    CustomDeviceInformation(77),
    CustomDeviceInformationGrouping(78),
    IoT_PortForwarding(79),
    IoT_RemoteScreen(80),
    ConditionalAccessHosted(81),
    SessionHandover(82),
    SessionChat(83),
    SessionVideo(84),
    SessionWhiteboard(85),
    SessionConferenceCallViaInternet(86),
    SessionConferenceCallByPhone(87),
    Api_SCIM(88),
    RS_Screen_V15(89),
    TrialLicense(90),
    RS_Apps_Start(91),
    RS_Screen_Inject(92),
    RemoteWorker(93),
    NamedUsers(94),
    ChannelLimitNotifications(95),
    MobileSDK_V2(96),
    Organization_Management(97),
    ManagedDeviceV2(98),
    SMSInviteForSessionCodes(99),
    TeamviewerMeeting_StartMeeting(100),
    TeamviewerMeeting_PhoneViaPremiumNumbers(101),
    TeamviewerMeeting_PhoneViaLocalNumbers(102),
    TeamviewerMeeting_SessionRecording(103),
    TeamviewerMeeting_Reporting(104),
    TeamviewerMeeting_Removable(105),
    TeamviewerMeeting_RemoteControl(106),
    TVAssistAR_SessionRequest(107),
    TVAssistAR_ConnectionProtocol(108),
    CustomerTermsConditions(109),
    WebClient(110),
    SystemUpdate(111),
    TVAssistAR_SDK(112),
    MSDynamics365Integration(113),
    ServiceNowEnterpriseIntegration(114),
    UserGroups(115),
    CompanyAddressBook(116),
    TVAssistAR_MultipleExpert(117),
    TVAssistAR_SessionRequestForAll(118),
    AuthenticationDeviceForwarding(119),
    ActivationOnOrganizationAllowed(120),
    RemoteTerminal(121),
    TVAssistAR_ScreenSharing(122),
    TVAssistAR_TwoWayChat(123),
    Cobrowsing(124),
    RemoteCamera(125),
    VPN(126),
    RemoteHostUpdate(127),
    ClassicServiceCases(128),
    ServiceCaseReporting(129),
    CustomerSatisfactionRating(130),
    SOSButton(131),
    WebApiTokenCreation(132),
    ConnectionBillings(133),
    WakeOnLan(134),
    BookmarkDevice(135),
    BringYourOwnCertificate(136),
    Api_UserGroups(137),
    EasyRollout_Enhanced(138),
    TVAssistAR_SMSInviteForSessionCodes(139),
    TVAssistAR_AugmentRCSession(140),
    ManualActivationOnAccountAllowed(141),
    PredefinedRole(142),
    TVAssistAR_Translations(143),
    TVAssistAR_LiveCaptions(144),
    PolicyToUpdateToSpecificVersion(145),
    MultipleSupporterSessions(146),
    PreAuthorizedSessions(147),
    CustomMobileQuickSupport(148),
    ManageVirtualMonitor(149),
    SessionRecordingCustomerHosted(150),
    SessionRecordingTeamViewerHosted(151),
    ServiceDesk(152),
    TVAssistAR_LiveCaptionsWithTranslations(153),
    PolicyForFullClientUI(154),
    SessionSummary(155),
    TVAssistAR_IntegratedAftersalesSolution(156),
    TVAssistAR_Transcription(157),
    CompanyDeviceGroupManagement(158),
    DevicePermissionsInheritance(159),
    InsessionChatTranscript(160),
    TVAssistAR_SessionSummary(161),
    ConditionalAccess_ApproveAccessRequests(162),
    CustomAndroidHost(163),
    AIScriptWriter(164),
    TVAssistAR_SessionSummaryWithSettings(165),
    DeviceCustomFields(166),
    GoogleMeetIntegration(167),
    TVAssistAR_TranscriptionUpload(168),
    MultitenancyManagement(169),
    ConnectViaPassword(170),
    AttendedAccess(171),
    TVAssistAR_SessionSummaryUpload(172),
    TVAssistAR_ScreenshotUpload(173),
    CoPilotDeviceData(174),
    CoPilotChat(175),
    CoPilotScreenshot(176),
    HideServerPanel(177),
    LAPSIntegration(178),
    JumpGateJumpTarget(179),
    PolicyForIncomingSessionRecording(180);

    private final int value;
    private static final /* synthetic */ ic2 $ENTRIES = qs1.K(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    LicenseFeature(int i) {
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

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¨\u0006\t"}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/LicenseFeature$Companion;", "", "<init>", "()V", "encode", "", "data", "decode", "Lcom/teamviewer/apidefinitions/account/models/LicenseFeature;", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LicenseFeature decode(Object data) {
            if (data != null) {
                String lowerCase = String.valueOf(data).toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                for (LicenseFeature licenseFeature : LicenseFeature.values()) {
                    if (data == licenseFeature || ua5.y(String.valueOf(licenseFeature), Locale.ROOT, lowerCase)) {
                        return licenseFeature;
                    }
                }
            }
            return null;
        }

        public final String encode(Object data) {
            if (data instanceof LicenseFeature) {
                return String.valueOf(data);
            }
            return null;
        }

        private Companion() {
        }
    }
}
