package o;

/* JADX INFO: loaded from: classes.dex */
public enum kf4 {
    Unknown(0),
    /* JADX INFO: Fake field, exist only in values array */
    MainWindow(1),
    /* JADX INFO: Fake field, exist only in values array */
    DragAndDrop_MainWindowFileTransfer(2),
    /* JADX INFO: Fake field, exist only in values array */
    ReconnectAfterReboot(3),
    /* JADX INFO: Fake field, exist only in values array */
    ComAPI(4),
    /* JADX INFO: Fake field, exist only in values array */
    JoinMeetingAfterInvitation(5),
    /* JADX INFO: Fake field, exist only in values array */
    BuddyListQuickJoinRC(6),
    /* JADX INFO: Fake field, exist only in values array */
    BuddyListQuickJoinMeeting(7),
    /* JADX INFO: Fake field, exist only in values array */
    MeetingAlreadyRunning(8),
    /* JADX INFO: Fake field, exist only in values array */
    MainTabMeeting_Join(9),
    /* JADX INFO: Fake field, exist only in values array */
    RemoteControl_Join(10),
    /* JADX INFO: Fake field, exist only in values array */
    SessionPlayer(11),
    /* JADX INFO: Fake field, exist only in values array */
    RemoteControlFromCommandLine(12),
    /* JADX INFO: Fake field, exist only in values array */
    SessionCodeFromCommandLine(13),
    /* JADX INFO: Fake field, exist only in values array */
    RemoteControlToBuddy(14),
    /* JADX INFO: Fake field, exist only in values array */
    JoinScheduledMeeting(15),
    /* JADX INFO: Fake field, exist only in values array */
    ConnectFromBuddyList(16),
    /* JADX INFO: Fake field, exist only in values array */
    WakeOnLan(17),
    /* JADX INFO: Fake field, exist only in values array */
    Chat(18),
    /* JADX INFO: Fake field, exist only in values array */
    BListContextPopup(19),
    /* JADX INFO: Fake field, exist only in values array */
    URLRemoteControl(21),
    /* JADX INFO: Fake field, exist only in values array */
    URLRemoteControlAuthPrompt(22),
    /* JADX INFO: Fake field, exist only in values array */
    URLFileTransfer(23),
    /* JADX INFO: Fake field, exist only in values array */
    URLVPN(24),
    /* JADX INFO: Fake field, exist only in values array */
    URLMeeting(25),
    /* JADX INFO: Fake field, exist only in values array */
    URLSendFile(27),
    /* JADX INFO: Fake field, exist only in values array */
    URLSessionCode(28),
    /* JADX INFO: Fake field, exist only in values array */
    SendFileFromMainWindow(29),
    /* JADX INFO: Fake field, exist only in values array */
    ConnectToSessionCode(30),
    /* JADX INFO: Fake field, exist only in values array */
    URLChat(32),
    /* JADX INFO: Fake field, exist only in values array */
    PartnerlistRecentlyUsed(36),
    /* JADX INFO: Fake field, exist only in values array */
    PartnerlistRecentlyUsedDetails(37),
    /* JADX INFO: Fake field, exist only in values array */
    ScreenSharingRequest(38),
    /* JADX INFO: Fake field, exist only in values array */
    QuickRemoteControl(39),
    /* JADX INFO: Fake field, exist only in values array */
    SessionRequestFeature_Join(40),
    /* JADX INFO: Fake field, exist only in values array */
    NumEntries;

    public final int m;

    kf4() {
        int i = ds1.m;
        ds1.m = i + 1;
        this.m = i;
    }

    kf4(int i) {
        this.m = i;
        ds1.m = i + 1;
    }
}
