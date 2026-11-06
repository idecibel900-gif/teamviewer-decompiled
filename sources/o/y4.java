package o;

import com.teamviewer.commonviewmodel.swig.ViewModelOnlineState;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 o.y4[], still in use, count: 1, list:
  (r0v1 o.y4[]) from 0x005d: CONSTRUCTOR (r0v1 o.y4[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: o.jc2.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class y4 {
    NOSTATE(ViewModelOnlineState.NoState, 0, 0),
    ONLINE(ViewModelOnlineState.Online, 2131231274, R.string.OnlineState_Online),
    AWAY(ViewModelOnlineState.OnlineAway, 2131231275, R.string.OnlineState_Away),
    BUSY(ViewModelOnlineState.OnlineBusy, 2131231276, R.string.OnlineState_Busy),
    OFFLINE(ViewModelOnlineState.Offline, 2131231273, R.string.OnlineState_Offline);

    public static final yl7 p = new yl7(27);
    public static final /* synthetic */ jc2 w;
    public final ViewModelOnlineState m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f2576o;

    static {
        w = new jc2(new y4[]{r0, r1, r2, r3, r4});
    }

    public y4(ViewModelOnlineState viewModelOnlineState, int i, int i2) {
        super(str, i);
        this.m = viewModelOnlineState;
        this.n = i;
        this.f2576o = i2;
    }

    public static y4 valueOf(String str) {
        return (y4) Enum.valueOf(y4.class, str);
    }

    public static y4[] values() {
        return (y4[]) v.clone();
    }
}
