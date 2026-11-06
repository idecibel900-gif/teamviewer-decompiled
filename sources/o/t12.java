package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 o.t12[], still in use, count: 1, list:
  (r0v1 o.t12[]) from 0x0026: CONSTRUCTOR (r0v1 o.t12[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: o.jc2.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class t12 {
    NotBlocked(0),
    InputBlocked(1),
    BlackScreen(2);

    public static final ju n = new ju(13);
    public static final /* synthetic */ jc2 s;
    public final byte m;

    static {
        s = new jc2(new t12[]{r0, r1, r2});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t12(int i) {
        super(str, i);
        this.m = i;
    }

    public static t12 valueOf(String str) {
        return (t12) Enum.valueOf(t12.class, str);
    }

    public static t12[] values() {
        return (t12[]) r.clone();
    }
}
