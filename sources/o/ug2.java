package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 o.ug2, still in use, count: 1, list:
  (r1v0 o.ug2) from 0x0110: CONSTRUCTOR (wrap java.lang.Class:0x010e: CONST_CLASS  A[WRAPPED] o.ug2.class), (r1v0 o.ug2) A[MD:(java.lang.Class, java.lang.Enum):void (m), WRAPPED] call: o.cj3.<init>(java.lang.Class, java.lang.Enum):void type: CONSTRUCTOR
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
public final class ug2 implements ph0 {
    /* JADX INFO: Fake field, exist only in values array */
    FTCmdEmpty(0),
    RequestSession(200),
    ReplySession(200),
    GetContents(201),
    RequestOutgoingTransfer(202),
    RequestIncomingTransfer(203),
    ReplyBeginFileTransfer(204),
    NewFile(205),
    FileChunk(206),
    ReplyFileRecursionStatus(207),
    PublishNewDirectory(208),
    ReplyEndFileTransfer(210),
    /* JADX INFO: Fake field, exist only in values array */
    CreateDirectory(211),
    /* JADX INFO: Fake field, exist only in values array */
    Rename(212),
    /* JADX INFO: Fake field, exist only in values array */
    Delete(213),
    /* JADX INFO: Fake field, exist only in values array */
    Reset(233),
    Error(253),
    Abort(254),
    EndSession(255);

    public static final ir n = new ir(17);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final cj3 f2212o = new cj3(ug2.class, new ug2(0));
    public final byte m;

    static {
    }

    public ug2(int i) {
        super(str, i);
        this.m = (byte) i;
    }

    public static ug2 valueOf(String str) {
        return (ug2) Enum.valueOf(ug2.class, str);
    }

    public static ug2[] values() {
        return (ug2[]) D.clone();
    }

    @Override // o.ph0
    public final byte a() {
        return this.m;
    }
}
