package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 o.se0[], still in use, count: 1, list:
  (r0v1 o.se0[]) from 0x0024: CONSTRUCTOR (r0v1 o.se0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: o.jc2.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class se0 {
    /* JADX INFO: Fake field, exist only in values array */
    REGULAR_ITEM(0),
    MDV2_ITEM(1),
    UNKNOWN(2);

    public static final vv n = new vv((byte) 3);
    public static final /* synthetic */ jc2 r;
    public final byte m;

    static {
        r = new jc2(new se0[]{r0, r1, r2});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public se0(int i) {
        super(str, i);
        this.m = i;
    }

    public static se0 valueOf(String str) {
        return (se0) Enum.valueOf(se0.class, str);
    }

    public static se0[] values() {
        return (se0[]) q.clone();
    }
}
