package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ll6 {
    public static final ll6 m;
    public static final ll6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ll6 f1378o;
    public static final ll6 p;
    public static final /* synthetic */ ll6[] q;

    static {
        ll6 ll6Var = new ll6("All", 0);
        m = ll6Var;
        ll6 ll6Var2 = new ll6("Devices", 1);
        n = ll6Var2;
        ll6 ll6Var3 = new ll6("Contacts", 2);
        f1378o = ll6Var3;
        ll6 ll6Var4 = new ll6("Groups", 3);
        p = ll6Var4;
        q = new ll6[]{ll6Var, ll6Var2, ll6Var3, ll6Var4};
    }

    public static ll6 valueOf(String str) {
        return (ll6) Enum.valueOf(ll6.class, str);
    }

    public static ll6[] values() {
        return (ll6[]) q.clone();
    }
}
