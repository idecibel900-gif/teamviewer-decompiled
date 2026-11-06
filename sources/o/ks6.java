package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 o.ks6, still in use, count: 1, list:
  (r1v0 o.ks6) from 0x01ab: CONSTRUCTOR (wrap java.lang.Class:0x01a9: CONST_CLASS  A[WRAPPED] o.ks6.class), (r1v0 o.ks6) A[MD:(java.lang.Class, java.lang.Enum):void (m), WRAPPED] call: o.cj3.<init>(java.lang.Class, java.lang.Enum):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class ks6 implements ph0 {
    /* JADX INFO: Fake field, exist only in values array */
    SessionCmdEmpty((byte) 0),
    IncomingConnection((byte) 1),
    /* JADX INFO: Fake field, exist only in values array */
    ConnectTo((byte) 2),
    /* JADX INFO: Fake field, exist only in values array */
    ChangeMode((byte) 3),
    /* JADX INFO: Fake field, exist only in values array */
    Terminate((byte) 4),
    /* JADX INFO: Fake field, exist only in values array */
    ServerThreadInfo((byte) 5),
    /* JADX INFO: Fake field, exist only in values array */
    SingleWindow((byte) 6),
    /* JADX INFO: Fake field, exist only in values array */
    DisplaySettings((byte) 7),
    /* JADX INFO: Fake field, exist only in values array */
    VPN((byte) 8),
    /* JADX INFO: Fake field, exist only in values array */
    DirectionChange((byte) 9),
    /* JADX INFO: Fake field, exist only in values array */
    BuddyName((byte) 10),
    /* JADX INFO: Fake field, exist only in values array */
    DisableClientInput((byte) 11),
    /* JADX INFO: Fake field, exist only in values array */
    ConnectionInfo((byte) 12),
    /* JADX INFO: Fake field, exist only in values array */
    Statistics((byte) 13),
    /* JADX INFO: Fake field, exist only in values array */
    WindowsSessionInfo((byte) 14),
    /* JADX INFO: Fake field, exist only in values array */
    RemoteControlAccess((byte) 15),
    /* JADX INFO: Fake field, exist only in values array */
    ReconnectMessage((byte) 16),
    /* JADX INFO: Fake field, exist only in values array */
    ParticipantManagerSync((byte) 17),
    /* JADX INFO: Fake field, exist only in values array */
    MeetingLoginState((byte) 18),
    /* JADX INFO: Fake field, exist only in values array */
    RouterAuthentication((byte) 19),
    /* JADX INFO: Fake field, exist only in values array */
    MeetingLicenseLimitReached((byte) 20),
    /* JADX INFO: Fake field, exist only in values array */
    ConferenceInfo((byte) 21),
    /* JADX INFO: Fake field, exist only in values array */
    BandwidthReport((byte) 22),
    /* JADX INFO: Fake field, exist only in values array */
    TVConsole((byte) 23),
    /* JADX INFO: Fake field, exist only in values array */
    BackmonitorControl((byte) 24),
    /* JADX INFO: Fake field, exist only in values array */
    BackmonitorUpdate((byte) 25),
    /* JADX INFO: Fake field, exist only in values array */
    Print((byte) 26),
    /* JADX INFO: Fake field, exist only in values array */
    AutoLockWorkstation((byte) 27),
    /* JADX INFO: Fake field, exist only in values array */
    PMCommandAccessControlSettings((byte) 28),
    /* JADX INFO: Fake field, exist only in values array */
    FileTransferAccess((byte) 29),
    /* JADX INFO: Fake field, exist only in values array */
    RecordingState((byte) 30),
    /* JADX INFO: Fake field, exist only in values array */
    SwitchDesktop((byte) 31),
    /* JADX INFO: Fake field, exist only in values array */
    PendingParticipantCmd((byte) 32),
    /* JADX INFO: Fake field, exist only in values array */
    AccountQueryCmd((byte) 33),
    /* JADX INFO: Fake field, exist only in values array */
    ExecuteRemoteActionRequest((byte) 34),
    /* JADX INFO: Fake field, exist only in values array */
    ExecuteRemoteActionResponse((byte) 35);

    public static final el5 n = new el5(8);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final cj3 f1299o = new cj3(ks6.class, new ks6((byte) 0));
    public final byte m;

    static {
    }

    public ks6(byte b) {
        super(str, i);
        this.m = b;
    }

    public static ks6 valueOf(String str) {
        return (ks6) Enum.valueOf(ks6.class, str);
    }

    public static ks6[] values() {
        return (ks6[]) q.clone();
    }

    @Override // o.ph0
    public final byte a() {
        return this.m;
    }
}
