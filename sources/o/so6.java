package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class so6 {
    public static final so6 m;
    public static final so6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final so6 f2042o;
    public static final /* synthetic */ so6[] p;

    static {
        so6 so6Var = new so6("Left", 0);
        m = so6Var;
        so6 so6Var2 = new so6("Middle", 1);
        n = so6Var2;
        so6 so6Var3 = new so6("Right", 2);
        f2042o = so6Var3;
        p = new so6[]{so6Var, so6Var2, so6Var3};
    }

    public static so6 valueOf(String str) {
        return (so6) Enum.valueOf(so6.class, str);
    }

    public static so6[] values() {
        return (so6[]) p.clone();
    }
}
