package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 o.ba8[], still in use, count: 1, list:
  (r0v1 o.ba8[]) from 0x0127: CONSTRUCTOR (r0v1 o.ba8[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: o.jc2.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class ba8 {
    /* JADX INFO: Fake field, exist only in values array */
    Brown(j51.j(4283510035L), j51.j(4294956470L), j51.j(4294956470L), j51.j(4283510035L)),
    /* JADX INFO: Fake field, exist only in values array */
    Pink(j51.j(4288101278L), j51.j(4293639920L), j51.j(4294104821L), j51.j(4286263681L)),
    /* JADX INFO: Fake field, exist only in values array */
    Red(j51.j(4288556844L), j51.j(4288556844L), j51.j(4294765804L), j51.j(4281803041L)),
    /* JADX INFO: Fake field, exist only in values array */
    Gold(j51.j(4284828428L), j51.j(4294833374L), j51.j(4294699974L), j51.j(4286931731L)),
    /* JADX INFO: Fake field, exist only in values array */
    Orange(j51.j(4291588912L), j51.j(4291588912L), j51.j(4294956470L), j51.j(4282001692L)),
    /* JADX INFO: Fake field, exist only in values array */
    Yellow(j51.j(4285884171L), j51.j(4281412886L), j51.j(4294767275L), j51.j(4290882323L)),
    /* JADX INFO: Fake field, exist only in values array */
    Violet(j51.j(4286335661L), j51.j(4284824973L), j51.j(4293384699L), j51.j(4292592634L));

    public static final /* synthetic */ jc2 p;
    public final long m;
    public final long n;

    static {
        p = new jc2(ba8VarArr);
    }

    public ba8(long j, long j2, long j3, long j4) {
        super(str, i);
        this.m = j;
        this.n = j3;
    }

    public static ba8 valueOf(String str) {
        return (ba8) Enum.valueOf(ba8.class, str);
    }

    public static ba8[] values() {
        return (ba8[]) f412o.clone();
    }
}
