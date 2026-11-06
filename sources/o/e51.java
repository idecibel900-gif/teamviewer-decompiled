package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 o.e51[], still in use, count: 1, list:
  (r0v1 o.e51[]) from 0x0036: CONSTRUCTOR (r0v1 o.e51[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: o.jc2.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class e51 {
    Unknown(0),
    RemoteControl(1),
    FileTransfer(2),
    /* JADX INFO: Fake field, exist only in values array */
    Presentation(3),
    /* JADX INFO: Fake field, exist only in values array */
    Meeting(4);

    public static final ju n = new ju(8);
    public static final /* synthetic */ jc2 s;
    public final byte m;

    static {
        s = new jc2(new e51[]{r0, r1, r2, new e51(3), new e51(4)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e51(int i) {
        super(str, i);
        this.m = i;
    }

    public static e51 valueOf(String str) {
        return (e51) Enum.valueOf(e51.class, str);
    }

    public static e51[] values() {
        return (e51[]) r.clone();
    }
}
