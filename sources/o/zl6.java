package o;

import com.teamviewer.teamviewer.market.mobile.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 o.zl6[], still in use, count: 1, list:
  (r0v1 o.zl6[]) from 0x0050: CONSTRUCTOR (r0v1 o.zl6[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: o.jc2.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class zl6 {
    All(R.string.search_result_title_all, R.string.search_no_results_title, ll6.m),
    Devices(R.string.search_result_title_devices, R.string.search_no_device_results_title, ll6.n),
    Contacts(R.string.search_result_title_contacts, R.string.search_no_contact_results_title, ll6.f1378o),
    Groups(R.string.search_result_title_groups, R.string.search_no_group_results_title, ll6.p);

    public static final /* synthetic */ jc2 u;
    public final int m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ll6 f2714o;

    static {
        u = new jc2(zl6VarArr);
    }

    public zl6(int i, int i2, ll6 ll6Var) {
        super(str, i);
        this.m = i;
        this.n = i2;
        this.f2714o = ll6Var;
    }

    public static zl6 valueOf(String str) {
        return (zl6) Enum.valueOf(zl6.class, str);
    }

    public static zl6[] values() {
        return (zl6[]) t.clone();
    }
}
