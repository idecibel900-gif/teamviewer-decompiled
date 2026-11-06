package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v29 o.y38[], still in use, count: 1, list:
  (r0v29 o.y38[]) from 0x0145: CONSTRUCTOR (r0v29 o.y38[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: o.jc2.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class y38 {
    /* JADX INFO: Fake field, exist only in values array */
    UnknownError(0),
    /* JADX INFO: Fake field, exist only in values array */
    InvalidRequest(1),
    /* JADX INFO: Fake field, exist only in values array */
    InvalidToken(2),
    InternalError(3),
    /* JADX INFO: Fake field, exist only in values array */
    Blocked(4),
    /* JADX INFO: Fake field, exist only in values array */
    RateLimitReached(5),
    /* JADX INFO: Fake field, exist only in values array */
    Expired(6),
    /* JADX INFO: Fake field, exist only in values array */
    WrongCredentials(7),
    /* JADX INFO: Fake field, exist only in values array */
    InvalidClient(8),
    /* JADX INFO: Fake field, exist only in values array */
    EmailInUse(9),
    /* JADX INFO: Fake field, exist only in values array */
    PasswordInsecure(10),
    /* JADX INFO: Fake field, exist only in values array */
    LicenseRequired(11),
    /* JADX INFO: Fake field, exist only in values array */
    UnsupportedMedaType(12),
    /* JADX INFO: Fake field, exist only in values array */
    NotFound(13),
    /* JADX INFO: Fake field, exist only in values array */
    AccountInvited(14),
    /* JADX INFO: Fake field, exist only in values array */
    InvalidAccountId(15),
    /* JADX INFO: Fake field, exist only in values array */
    InvalidIdentification(16),
    /* JADX INFO: Fake field, exist only in values array */
    FailedToAssignManagerToDevice(17),
    /* JADX INFO: Fake field, exist only in values array */
    TooManyRetries(18),
    /* JADX INFO: Fake field, exist only in values array */
    WrongPassword(19),
    /* JADX INFO: Fake field, exist only in values array */
    BuddyNotFound(20),
    /* JADX INFO: Fake field, exist only in values array */
    BuddyIsAlreadyManagedDeviceForOtherUser(21),
    /* JADX INFO: Fake field, exist only in values array */
    InvalidPermission(22),
    /* JADX INFO: Fake field, exist only in values array */
    ManagerSyncError(23),
    /* JADX INFO: Fake field, exist only in values array */
    TransportError(24),
    /* JADX INFO: Fake field, exist only in values array */
    DeviceOfflineError(25),
    /* JADX INFO: Fake field, exist only in values array */
    DeviceUnreachableError(26),
    /* JADX INFO: Fake field, exist only in values array */
    EasyRolloutNotActivated(27),
    /* JADX INFO: Fake field, exist only in values array */
    IoTEndpointLimitReached(28);

    public static final ol5 n = new ol5((byte) 14);
    public static final /* synthetic */ jc2 q;
    public final byte m;

    static {
        q = new jc2(new y38[]{r1, r2, r3, r4, new y38(4), new y38(5), new y38(6), new y38(7), new y38(8), new y38(9), new y38(10), new y38(11), new y38(12), new y38(13), new y38(14), new y38(15), new y38(16), new y38(17), new y38(18), new y38(19), new y38(20), new y38(21), new y38(22), new y38(23), new y38(24), new y38(25), new y38(26), new y38(27), new y38(28)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y38(int i) {
        super(str, i);
        this.m = i;
    }

    public static y38 valueOf(String str) {
        return (y38) Enum.valueOf(y38.class, str);
    }

    public static y38[] values() {
        return (y38[]) p.clone();
    }
}
