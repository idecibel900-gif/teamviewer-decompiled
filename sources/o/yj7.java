package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 o.yj7[], still in use, count: 1, list:
  (r0v1 o.yj7[]) from 0x005c: CONSTRUCTOR (r0v1 o.yj7[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: o.jc2.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class yj7 {
    INVALID(0),
    /* JADX INFO: Fake field, exist only in values array */
    CONSOLE_CONNECT(1),
    /* JADX INFO: Fake field, exist only in values array */
    CONSOLE_DISCONNECT(2),
    /* JADX INFO: Fake field, exist only in values array */
    WTS_REMOTE_CONNECT(3),
    /* JADX INFO: Fake field, exist only in values array */
    WTS_REMOTE_DISCONNECT(4),
    /* JADX INFO: Fake field, exist only in values array */
    WTS_SESSION_LOGON(5),
    /* JADX INFO: Fake field, exist only in values array */
    WTS_SESSION_LOGOFF(6),
    /* JADX INFO: Fake field, exist only in values array */
    WTS_SESSION_LOCK(7),
    /* JADX INFO: Fake field, exist only in values array */
    WTS_SESSION_UNLOCK(8),
    /* JADX INFO: Fake field, exist only in values array */
    WTS_SESSION_REMOTE_CONTROL(9);

    public static final el5 n = new el5((byte) 12);
    public static final /* synthetic */ jc2 q;
    public final byte m;

    static {
        q = new jc2(new yj7[]{r0, new yj7(1), new yj7(2), new yj7(3), new yj7(4), new yj7(5), new yj7(6), new yj7(7), new yj7(8), new yj7(9)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public yj7(int i) {
        super(str, i);
        this.m = i;
    }

    public static yj7 valueOf(String str) {
        return (yj7) Enum.valueOf(yj7.class, str);
    }

    public static yj7[] values() {
        return (yj7[]) p.clone();
    }
}
