package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 o.fj7[], still in use, count: 1, list:
  (r0v1 o.fj7[]) from 0x0024: CONSTRUCTOR (r0v1 o.fj7[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: o.jc2.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class fj7 {
    UNKNOWN(0),
    TRUE(1),
    /* JADX INFO: Fake field, exist only in values array */
    FALSE(2);

    public static final rk5 n = new rk5((byte) 12);
    public static final /* synthetic */ jc2 r;
    public final byte m;

    static {
        r = new jc2(new fj7[]{r0, r1, new fj7(2)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fj7(int i) {
        super(str, i);
        this.m = i;
    }

    public static fj7 valueOf(String str) {
        return (fj7) Enum.valueOf(fj7.class, str);
    }

    public static fj7[] values() {
        return (fj7[]) q.clone();
    }
}
