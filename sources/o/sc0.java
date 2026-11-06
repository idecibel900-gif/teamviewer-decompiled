package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 o.sc0[], still in use, count: 1, list:
  (r0v1 o.sc0[]) from 0x0032: CONSTRUCTOR (r0v1 o.sc0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: o.jc2.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class sc0 {
    /* JADX INFO: Fake field, exist only in values array */
    ONLINE_HEADER(0),
    /* JADX INFO: Fake field, exist only in values array */
    ONLINE_ITEM(1),
    /* JADX INFO: Fake field, exist only in values array */
    OFFLINE_HEADER(2),
    /* JADX INFO: Fake field, exist only in values array */
    OFFLINE_ITEM(3),
    UNKNOWN(4);

    public static final ir n = new ir((byte) 3);
    public static final /* synthetic */ jc2 q;
    public final byte m;

    static {
        q = new jc2(new sc0[]{r0, r1, r2, r3, r4});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public sc0(int i) {
        super(str, i);
        this.m = i;
    }

    public static sc0 valueOf(String str) {
        return (sc0) Enum.valueOf(sc0.class, str);
    }

    public static sc0[] values() {
        return (sc0[]) p.clone();
    }
}
