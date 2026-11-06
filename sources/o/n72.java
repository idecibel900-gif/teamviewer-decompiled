package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 o.n72[], still in use, count: 1, list:
  (r0v1 o.n72[]) from 0x001c: CONSTRUCTOR (r0v1 o.n72[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: o.jc2.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class n72 {
    Mouse(0),
    Touch(1);

    public static final cr n = new cr(14);
    public static final /* synthetic */ jc2 r;
    public final boolean m;

    static {
        r = new jc2(new n72[]{r0, r1});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n72(int i) {
        super(str, i);
        this.m = i;
    }

    public static n72 valueOf(String str) {
        return (n72) Enum.valueOf(n72.class, str);
    }

    public static n72[] values() {
        return (n72[]) q.clone();
    }
}
