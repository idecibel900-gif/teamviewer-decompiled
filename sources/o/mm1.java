package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 o.mm1[], still in use, count: 1, list:
  (r0v1 o.mm1[]) from 0x006e: CONSTRUCTOR (r0v1 o.mm1[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: o.jc2.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class mm1 {
    Undefined(0),
    /* JADX INFO: Fake field, exist only in values array */
    Windows(1),
    /* JADX INFO: Fake field, exist only in values array */
    Mac(2),
    /* JADX INFO: Fake field, exist only in values array */
    Linux(3),
    /* JADX INFO: Fake field, exist only in values array */
    Ios(4),
    /* JADX INFO: Fake field, exist only in values array */
    Android(5),
    /* JADX INFO: Fake field, exist only in values array */
    WinRT(6),
    /* JADX INFO: Fake field, exist only in values array */
    TvosWinPhone(7),
    /* JADX INFO: Fake field, exist only in values array */
    TvosBlackberry(8),
    /* JADX INFO: Fake field, exist only in values array */
    TvosChrome(9),
    /* JADX INFO: Fake field, exist only in values array */
    TvosWebAssembly(10),
    /* JADX INFO: Fake field, exist only in values array */
    TvosFreeBSD(11);

    public static final ir n = new ir(11);
    public static final /* synthetic */ jc2 q;
    public final byte m;

    static {
        q = new jc2(new mm1[]{r0, new mm1(1), new mm1(2), new mm1(3), new mm1(4), new mm1(5), new mm1(6), new mm1(7), new mm1(8), new mm1(9), new mm1(10), new mm1(11)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public mm1(int i) {
        super(str, i);
        this.m = i;
    }

    public static mm1 valueOf(String str) {
        return (mm1) Enum.valueOf(mm1.class, str);
    }

    public static mm1[] values() {
        return (mm1[]) p.clone();
    }
}
