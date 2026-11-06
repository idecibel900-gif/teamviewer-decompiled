package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class df0 {
    public static final df0 m;
    public static final df0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final df0 f616o;
    public static final /* synthetic */ df0[] p;

    static {
        df0 df0Var = new df0("SUSPEND", 0);
        m = df0Var;
        df0 df0Var2 = new df0("DROP_OLDEST", 1);
        n = df0Var2;
        df0 df0Var3 = new df0("DROP_LATEST", 2);
        f616o = df0Var3;
        p = new df0[]{df0Var, df0Var2, df0Var3};
    }

    public static df0 valueOf(String str) {
        return (df0) Enum.valueOf(df0.class, str);
    }

    public static df0[] values() {
        return (df0[]) p.clone();
    }
}
