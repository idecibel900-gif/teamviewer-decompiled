package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 o.ak3[], still in use, count: 1, list:
  (r0v1 o.ak3[]) from 0x0047: CONSTRUCTOR (r0v1 o.ak3[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: o.jc2.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class ak3 {
    PlayStore("com.android.vending"),
    /* JADX INFO: Fake field, exist only in values array */
    Huawei("com.huawei.appmarket"),
    /* JADX INFO: Fake field, exist only in values array */
    Xiaomi("com.xiaomi.market"),
    /* JADX INFO: Fake field, exist only in values array */
    Oppo("com.oppo.market"),
    /* JADX INFO: Fake field, exist only in values array */
    Vivo("com.bbk.appstore"),
    Website(null);

    public static final vv n = new vv(20);
    public static final /* synthetic */ jc2 r;
    public final String m;

    static {
        r = new jc2(new ak3[]{r0, r1, r2, r3, r4, r5});
    }

    public ak3(String str) {
        super(str, i);
        this.m = str;
    }

    public static ak3 valueOf(String str) {
        return (ak3) Enum.valueOf(ak3.class, str);
    }

    public static ak3[] values() {
        return (ak3[]) q.clone();
    }
}
