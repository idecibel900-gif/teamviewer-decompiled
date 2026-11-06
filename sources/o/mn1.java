package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 o.mn1[], still in use, count: 1, list:
  (r0v1 o.mn1[]) from 0x0050: CONSTRUCTOR (r0v1 o.mn1[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: o.jc2.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes2.dex */
public final class mn1 implements my5 {
    LDPI(120),
    MDPI(160),
    HDPI(240),
    XHDPI(320),
    XXHDPI(480),
    XXXHDPI(640);

    public static final ju n = new ju(11);
    public static final /* synthetic */ jc2 v;
    public final short m;

    static {
        v = new jc2(new mn1[]{r0, r1, r2, r3, r4, r5});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public mn1(int i) {
        super(str, i);
        this.m = i;
    }

    public static mn1 valueOf(String str) {
        return (mn1) Enum.valueOf(mn1.class, str);
    }

    public static mn1[] values() {
        return (mn1[]) u.clone();
    }
}
