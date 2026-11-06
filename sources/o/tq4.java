package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class tq4 {
    public static final tq4 m;
    public static final tq4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final tq4 f2133o;
    public static final /* synthetic */ tq4[] p;

    static {
        tq4 tq4Var = new tq4("PRIORITY_UNKNOWN", 0);
        m = tq4Var;
        tq4 tq4Var2 = new tq4("PRIORITY_HIGH", 1);
        n = tq4Var2;
        tq4 tq4Var3 = new tq4("PRIORITY_NORMAL", 2);
        f2133o = tq4Var3;
        p = new tq4[]{tq4Var, tq4Var2, tq4Var3};
    }

    public static tq4 valueOf(String str) {
        return (tq4) Enum.valueOf(tq4.class, str);
    }

    public static tq4[] values() {
        return (tq4[]) p.clone();
    }
}
