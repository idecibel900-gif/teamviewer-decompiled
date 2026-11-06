package o;

import com.teamviewer.teamviewer.market.mobile.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 o.ie4[], still in use, count: 1, list:
  (r0v1 o.ie4[]) from 0x003e: CONSTRUCTOR (r0v1 o.ie4[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: o.jc2.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class ie4 {
    /* JADX INFO: Fake field, exist only in values array */
    IMMEDIATELY(R.string.settings_biometric_timeout_Immediately, "0"),
    /* JADX INFO: Fake field, exist only in values array */
    AFTER_1_MIN(R.string.settings_biometric_timeout_After1min, "60000"),
    /* JADX INFO: Fake field, exist only in values array */
    AFTER_5_MIN(R.string.settings_biometric_timeout_After5min, "300000"),
    DEFAULT(R.string.settings_biometric_timeout_After10min, "600000");


    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final aw f1053o = new aw((byte) 22);
    public static final /* synthetic */ jc2 r;
    public final String m;
    public final int n;

    static {
        r = new jc2(new ie4[]{r0, r1, r2, r3});
    }

    public ie4(int i, String str) {
        super(str, i);
        this.m = str;
        this.n = i;
    }

    public static ie4 valueOf(String str) {
        return (ie4) Enum.valueOf(ie4.class, str);
    }

    public static ie4[] values() {
        return (ie4[]) q.clone();
    }
}
