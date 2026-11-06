package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 o.vv4[], still in use, count: 1, list:
  (r0v1 o.vv4[]) from 0x002c: CONSTRUCTOR (r0v1 o.vv4[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: o.jc2.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class vv4 {
    Nothing(0),
    /* JADX INFO: Fake field, exist only in values array */
    Audio(1),
    /* JADX INFO: Fake field, exist only in values array */
    Video(2),
    /* JADX INFO: Fake field, exist only in values array */
    End(128);

    public static final vv n = new vv((byte) 27);
    public static final /* synthetic */ jc2 q;
    public final short m;

    static {
        q = new jc2(new vv4[]{r0, new vv4(1), new vv4(2), new vv4(128)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public vv4(int i) {
        super(str, i);
        this.m = i;
    }

    public static vv4 valueOf(String str) {
        return (vv4) Enum.valueOf(vv4.class, str);
    }

    public static vv4[] values() {
        return (vv4[]) p.clone();
    }
}
