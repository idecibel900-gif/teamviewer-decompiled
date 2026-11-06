package o;

import java.util.ArrayList;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 o.uv4[], still in use, count: 1, list:
  (r0v1 o.uv4[]) from 0x0044: CONSTRUCTOR (r1v2 o.jc2) = (r0v1 o.uv4[]) A[MD:(java.lang.Enum[]):void (m)] call: o.jc2.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class uv4 {
    CodNul(0),
    /* JADX INFO: Fake field, exist only in values array */
    CodAudSpeex(1),
    /* JADX INFO: Fake field, exist only in values array */
    CodAudRaw(2),
    /* JADX INFO: Fake field, exist only in values array */
    CodAudVorbis(3),
    /* JADX INFO: Fake field, exist only in values array */
    CodVidTheora(4),
    /* JADX INFO: Fake field, exist only in values array */
    CodVidRaw(5),
    CodAudOpus1(6);

    public static final ju m;
    public static final /* synthetic */ jc2 q;

    static {
        jc2 jc2Var = new jc2(uv4VarArr);
        q = jc2Var;
        m = new ju((byte) 27);
        new ArrayList().addAll(jc2Var);
    }

    public uv4(int i) {
        super(str, i);
    }

    public static uv4 valueOf(String str) {
        return (uv4) Enum.valueOf(uv4.class, str);
    }

    public static uv4[] values() {
        return (uv4[]) p.clone();
    }
}
