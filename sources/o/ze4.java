package o;

import java.util.LinkedHashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 o.ze4[], still in use, count: 1, list:
  (r0v1 o.ze4[]) from 0x0050: CONSTRUCTOR (r1v2 o.jc2) = (r0v1 o.ze4[]) A[MD:(java.lang.Enum[]):void (m)] call: o.jc2.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class ze4 {
    AuthCancelledOrError(0),
    AuthDenied(1),
    AuthOk(2),
    /* JADX INFO: Fake field, exist only in values array */
    ServerWasRestarted(3),
    /* JADX INFO: Fake field, exist only in values array */
    RestartElevatedFailed(4),
    /* JADX INFO: Fake field, exist only in values array */
    ServerWasRestartedWaitForNotification(5),
    AuthInProgress(6),
    /* JADX INFO: Fake field, exist only in values array */
    AuthTypeDenied(7);

    public static final ju n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final LinkedHashMap f2693o;
    public final byte m;

    static {
        jc2 jc2Var = new jc2(ze4VarArr);
        n = new ju((byte) 23);
        int iQ = xm4.Q(mv0.Z(jc2Var, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iQ < 16 ? 16 : iQ);
        j1 j1Var = new j1(jc2Var, (byte) 0);
        while (j1Var.hasNext()) {
            Object next = j1Var.next();
            linkedHashMap.put(Integer.valueOf(((ze4) next).m), next);
        }
        f2693o = linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ze4(int i) {
        super(str, i);
        this.m = i;
    }

    public static ze4 valueOf(String str) {
        return (ze4) Enum.valueOf(ze4.class, str);
    }

    public static ze4[] values() {
        return (ze4[]) t.clone();
    }
}
