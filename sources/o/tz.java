package o;

import com.teamviewer.teamviewer.market.mobile.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 o.tz[], still in use, count: 1, list:
  (r0v1 o.tz[]) from 0x0031: CONSTRUCTOR (r0v1 o.tz[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: o.jc2.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class tz {
    /* JADX INFO: Fake field, exist only in values array */
    NEVER(R.string.tv_options_never, "autolock_disable"),
    /* JADX INFO: Fake field, exist only in values array */
    ALWAYS(R.string.tv_options_always, "autolock_always"),
    AUTOMATIC(R.string.tv_options_Automatic, "autolock_automatic");


    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final cr f2155o = new cr((byte) 2);
    public static final /* synthetic */ jc2 r;
    public final String m;
    public final int n;

    static {
        r = new jc2(new tz[]{r0, r1, r2});
    }

    public tz(int i, String str) {
        super(str, i);
        this.m = str;
        this.n = i;
    }

    public static tz valueOf(String str) {
        return (tz) Enum.valueOf(tz.class, str);
    }

    public static tz[] values() {
        return (tz[]) q.clone();
    }
}
