package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class oi6 {
    public static final oi6 m;
    public static final oi6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ oi6[] f1656o;

    static {
        oi6 oi6Var = new oi6("FILL", 0);
        m = oi6Var;
        oi6 oi6Var2 = new oi6("FIT", 1);
        n = oi6Var2;
        f1656o = new oi6[]{oi6Var, oi6Var2};
    }

    public static oi6 valueOf(String str) {
        return (oi6) Enum.valueOf(oi6.class, str);
    }

    public static oi6[] values() {
        return (oi6[]) f1656o.clone();
    }
}
