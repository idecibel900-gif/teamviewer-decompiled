package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 o.no4, still in use, count: 1, list:
  (r1v0 o.no4) from 0x00e6: CONSTRUCTOR (wrap java.lang.Class:0x00e4: CONST_CLASS  A[WRAPPED] o.no4.class), (r1v0 o.no4) A[MD:(java.lang.Class, java.lang.Enum):void (m), WRAPPED] call: o.cj3.<init>(java.lang.Class, java.lang.Enum):void type: CONSTRUCTOR
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
public final class no4 implements ph0 {
    /* JADX INFO: Fake field, exist only in values array */
    MeetingCmdEmpty((byte) 0),
    /* JADX INFO: Fake field, exist only in values array */
    MeetingRegisterStream((byte) 1),
    /* JADX INFO: Fake field, exist only in values array */
    MeetingCloseStream((byte) 2),
    /* JADX INFO: Fake field, exist only in values array */
    MeetingSubscribeStream((byte) 3),
    /* JADX INFO: Fake field, exist only in values array */
    MeetingAddParticipant((byte) 4),
    /* JADX INFO: Fake field, exist only in values array */
    MeetingRemoveParticipant((byte) 5),
    /* JADX INFO: Fake field, exist only in values array */
    MeetingSwitchRole((byte) 6),
    /* JADX INFO: Fake field, exist only in values array */
    MeetingCommitControl((byte) 7),
    /* JADX INFO: Fake field, exist only in values array */
    MeetingChangeRoleValue((byte) 8),
    /* JADX INFO: Fake field, exist only in values array */
    MeetingEndSession((byte) 9),
    /* JADX INFO: Fake field, exist only in values array */
    MeetingRestartCachedStream((byte) 10),
    /* JADX INFO: Fake field, exist only in values array */
    MeetingPMCommand((byte) 11),
    /* JADX INFO: Fake field, exist only in values array */
    MeetingConnect((byte) 12),
    /* JADX INFO: Fake field, exist only in values array */
    MeetingPMSynchronizationComplete((byte) 13),
    /* JADX INFO: Fake field, exist only in values array */
    MeetingResetCachedStream((byte) 14),
    /* JADX INFO: Fake field, exist only in values array */
    MeetingLicenseLimitReached((byte) 15),
    /* JADX INFO: Fake field, exist only in values array */
    MeetingAccessControl((byte) 16),
    /* JADX INFO: Fake field, exist only in values array */
    MeetingInteractionDefaults((byte) 17),
    /* JADX INFO: Fake field, exist only in values array */
    MeetingRequestPresenterHandover((byte) 18),
    /* JADX INFO: Fake field, exist only in values array */
    MeetingPseudoRouterRemovePartner((byte) 19),
    /* JADX INFO: Fake field, exist only in values array */
    MeetingStreamGroupLimits((byte) 20);

    public static final vv n = new vv((byte) 26);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final cj3 f1586o = new cj3(no4.class, new no4((byte) 0));
    public final byte m;

    static {
    }

    public no4(byte b) {
        super(str, i);
        this.m = b;
    }

    public static no4 valueOf(String str) {
        return (no4) Enum.valueOf(no4.class, str);
    }

    public static no4[] values() {
        return (no4[]) p.clone();
    }

    @Override // o.ph0
    public final byte a() {
        return this.m;
    }
}
