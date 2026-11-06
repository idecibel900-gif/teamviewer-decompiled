package o;

import com.teamviewer.commonviewmodel.swig.ViewModelOnlineState;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 o.x4[], still in use, count: 1, list:
  (r0v1 o.x4[]) from 0x0048: CONSTRUCTOR (r0v1 o.x4[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: o.jc2.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class x4 {
    NOSTATE(ViewModelOnlineState.NoState, 0),
    /* JADX INFO: Fake field, exist only in values array */
    ONLINE(ViewModelOnlineState.Online, R.drawable.online_indicator),
    /* JADX INFO: Fake field, exist only in values array */
    AWAY(ViewModelOnlineState.OnlineAway, R.drawable.away_indicator),
    /* JADX INFO: Fake field, exist only in values array */
    BUSY(ViewModelOnlineState.OnlineBusy, R.drawable.busy_indicator),
    /* JADX INFO: Fake field, exist only in values array */
    OFFLINE(ViewModelOnlineState.Offline, R.drawable.offline_indicator_icon);


    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final z06 f2479o = new z06(26);
    public static final /* synthetic */ jc2 r;
    public final ViewModelOnlineState m;
    public final int n;

    static {
        r = new jc2(new x4[]{r0, new x4(ViewModelOnlineState.Online, R.drawable.online_indicator), new x4(ViewModelOnlineState.OnlineAway, R.drawable.away_indicator), new x4(ViewModelOnlineState.OnlineBusy, R.drawable.busy_indicator), new x4(ViewModelOnlineState.Offline, R.drawable.offline_indicator_icon)});
    }

    public x4(ViewModelOnlineState viewModelOnlineState, int i) {
        super(str, i);
        this.m = viewModelOnlineState;
        this.n = i;
    }

    public static x4 valueOf(String str) {
        return (x4) Enum.valueOf(x4.class, str);
    }

    public static x4[] values() {
        return (x4[]) q.clone();
    }
}
