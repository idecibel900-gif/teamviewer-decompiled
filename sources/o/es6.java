package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 o.es6[], still in use, count: 1, list:
  (r0v1 o.es6[]) from 0x002c: CONSTRUCTOR (r0v1 o.es6[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: o.jc2.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class es6 {
    Automatic("autolock_automatic"),
    Always("autolock_always"),
    Disable("autolock_disable");

    public static final rk5 n = new rk5((byte) 8);
    public static final /* synthetic */ jc2 s;
    public final String m;

    static {
        s = new jc2(new es6[]{r0, r1, r2});
    }

    public es6(String str) {
        super(str, i);
        this.m = str;
    }

    public static es6 valueOf(String str) {
        return (es6) Enum.valueOf(es6.class, str);
    }

    public static es6[] values() {
        return (es6[]) r.clone();
    }
}
