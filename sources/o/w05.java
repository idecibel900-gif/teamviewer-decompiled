package o;

import com.teamviewer.teamviewer.market.mobile.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 o.w05[], still in use, count: 1, list:
  (r0v1 o.w05[]) from 0x003d: CONSTRUCTOR (r0v1 o.w05[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: o.jc2.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class w05 {
    Connect(0, R.id.connect_item),
    Partnerlist(1, R.id.buddy_item),
    Chat(3, R.id.chat_item),
    Solutions(5, R.id.solutions_item);


    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ir f2361o = new ir(28);
    public static final /* synthetic */ jc2 u;
    public final byte m;
    public final int n;

    static {
        u = new jc2(new w05[]{r0, r1, r2, r3});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w05(int i, int i2) {
        super(str, i);
        this.m = i;
        this.n = i2;
    }

    public static w05 valueOf(String str) {
        return (w05) Enum.valueOf(w05.class, str);
    }

    public static w05[] values() {
        return (w05[]) t.clone();
    }
}
