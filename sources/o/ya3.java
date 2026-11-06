package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 o.ya3[], still in use, count: 1, list:
  (r0v1 o.ya3[]) from 0x0044: CONSTRUCTOR (r0v1 o.ya3[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: o.jc2.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class ya3 {
    Unknown(0),
    FirstRequest(1),
    Rationale(2),
    SecondRequest(3),
    Deny(4),
    Allow(5);

    public static final aw n = new aw(19);
    public static final /* synthetic */ jc2 v;
    public final byte m;

    static {
        v = new jc2(new ya3[]{r0, r1, r2, r3, r4, r5});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ya3(int i) {
        super(str, i);
        this.m = i;
    }

    public static ya3 valueOf(String str) {
        return (ya3) Enum.valueOf(ya3.class, str);
    }

    public static ya3[] values() {
        return (ya3[]) u.clone();
    }
}
