package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 o.fu6[], still in use, count: 1, list:
  (r0v1 o.fu6[]) from 0x0036: CONSTRUCTOR (r0v1 o.fu6[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: o.jc2.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class fu6 {
    Unknown(0),
    /* JADX INFO: Fake field, exist only in values array */
    LoginSucceeded(1),
    LoginFailed(2),
    Ended(3),
    /* JADX INFO: Fake field, exist only in values array */
    Interrupted(4);

    public static final yi5 n = new yi5(9);
    public static final /* synthetic */ jc2 s;
    public final byte m;

    static {
        s = new jc2(new fu6[]{r0, r1, r2, r3, new fu6(4)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fu6(int i) {
        super(str, i);
        this.m = i;
    }

    public static fu6 valueOf(String str) {
        return (fu6) Enum.valueOf(fu6.class, str);
    }

    public static fu6[] values() {
        return (fu6[]) r.clone();
    }
}
