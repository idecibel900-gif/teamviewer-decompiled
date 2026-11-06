package o;

import com.teamviewer.teamviewer.market.mobile.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 o.dj3[], still in use, count: 1, list:
  (r0v1 o.dj3[]) from 0x0020: CONSTRUCTOR (r0v1 o.dj3[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: o.jc2.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class dj3 {
    MOUSE(0, R.string.tv_options_InputMethodMouse),
    /* JADX INFO: Fake field, exist only in values array */
    TOUCHSCREEN(1, R.string.tv_options_InputMethodTouch);


    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ju f627o = new ju((byte) 20);
    public static final /* synthetic */ jc2 r;
    public final boolean m;
    public final int n;

    static {
        r = new jc2(new dj3[]{r0, new dj3(1, R.string.tv_options_InputMethodTouch)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dj3(int i, int i2) {
        super(str, i);
        this.m = i;
        this.n = i2;
    }

    public static dj3 valueOf(String str) {
        return (dj3) Enum.valueOf(dj3.class, str);
    }

    public static dj3[] values() {
        return (dj3[]) q.clone();
    }
}
