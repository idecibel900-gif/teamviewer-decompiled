package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 o.l3[], still in use, count: 1, list:
  (r0v1 o.l3[]) from 0x0069: CONSTRUCTOR (r0v1 o.l3[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: o.jc2.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class l3 {
    CONTROL_TYPE_FULL_ACCESS(0),
    /* JADX INFO: Fake field, exist only in values array */
    CONTROL_TYPE_CONFIRM_ALL(1),
    /* JADX INFO: Fake field, exist only in values array */
    CONTROL_TYPE_VIEW_AND_SHOW(2),
    CONTROL_TYPE_CUSTOM(3),
    /* JADX INFO: Fake field, exist only in values array */
    CONTROL_TYPE_PRESENTATION(4),
    /* JADX INFO: Fake field, exist only in values array */
    CONTROL_TYPE_FILE_TRANSFER_FULL_ACCESS(5),
    /* JADX INFO: Fake field, exist only in values array */
    CONTROL_TYPE_FILE_TRANSFER_CONFIRM_ALL(6),
    /* JADX INFO: Fake field, exist only in values array */
    CONTROL_TYPE_VPN_FULL_ACCESS(7),
    /* JADX INFO: Fake field, exist only in values array */
    CONTROL_TYPE_VPN_CONFIRM_ALL(8),
    CONTROL_TYPE_UNDEFINED(9),
    /* JADX INFO: Fake field, exist only in values array */
    CONTROL_TYPE_DENY_ACCESS(10);

    public static final d82 n = new d82(26);
    public static final /* synthetic */ jc2 s;
    public final byte m;

    static {
        s = new jc2(new l3[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, new l3(10)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l3(int i) {
        super(str, i);
        this.m = i;
    }

    public static l3 valueOf(String str) {
        return (l3) Enum.valueOf(l3.class, str);
    }

    public static l3[] values() {
        return (l3[]) r.clone();
    }
}
