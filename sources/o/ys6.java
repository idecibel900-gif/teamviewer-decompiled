package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ys6 {
    public static final ys6 m;
    public static final ys6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ys6 f2637o;
    public static final ys6 p;
    public static final /* synthetic */ ys6[] q;

    /* JADX INFO: Fake field, exist only in values array */
    ys6 EF0;

    static {
        ys6 ys6Var = new ys6("Unknown", 0);
        ys6 ys6Var2 = new ys6("Confirmed", 1);
        m = ys6Var2;
        ys6 ys6Var3 = new ys6("ByUser", 2);
        n = ys6Var3;
        ys6 ys6Var4 = new ys6("UserLogoff", 3);
        f2637o = ys6Var4;
        ys6 ys6Var5 = new ys6("Timeout", 4);
        p = ys6Var5;
        q = new ys6[]{ys6Var, ys6Var2, ys6Var3, ys6Var4, ys6Var5, new ys6("ErrorNetwork", 5), new ys6("ErrorState", 6), new ys6("ErrorSecurity", 7), new ys6("LicenseRequired", 8)};
    }

    public static ys6 valueOf(String str) {
        return (ys6) Enum.valueOf(ys6.class, str);
    }

    public static ys6[] values() {
        return (ys6[]) q.clone();
    }
}
