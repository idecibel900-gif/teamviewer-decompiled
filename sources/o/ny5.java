package o;

import com.teamviewer.teamviewer.market.mobile.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 o.ny5[], still in use, count: 1, list:
  (r0v1 o.ny5[]) from 0x002b: CONSTRUCTOR (r0v1 o.ny5[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: o.jc2.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class ny5 {
    AUTOMATIC(0, R.string.tv_options_Automatic),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIMIZE_QUALITY(1, R.string.tv_options_OptimizeQuality),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIMIZE_SPEED(2, R.string.tv_options_OptimizeSpeed);


    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final yi5 f1611o = new yi5((byte) 3);
    public static final /* synthetic */ jc2 r;
    public final byte m;
    public final int n;

    static {
        r = new jc2(new ny5[]{r0, new ny5(1, R.string.tv_options_OptimizeQuality), new ny5(2, R.string.tv_options_OptimizeSpeed)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ny5(int i, int i2) {
        super(str, i);
        this.m = i;
        this.n = i2;
    }

    public static ny5 valueOf(String str) {
        return (ny5) Enum.valueOf(ny5.class, str);
    }

    public static ny5[] values() {
        return (ny5[]) q.clone();
    }
}
