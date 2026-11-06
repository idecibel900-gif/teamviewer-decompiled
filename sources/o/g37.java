package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class g37 {
    public static final g37 m;
    public static final g37 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final g37 f854o;
    public static final /* synthetic */ g37[] p;

    static {
        g37 g37Var = new g37("Short", 0);
        m = g37Var;
        g37 g37Var2 = new g37("Long", 1);
        n = g37Var2;
        g37 g37Var3 = new g37("Indefinite", 2);
        f854o = g37Var3;
        p = new g37[]{g37Var, g37Var2, g37Var3};
    }

    public static g37 valueOf(String str) {
        return (g37) Enum.valueOf(g37.class, str);
    }

    public static g37[] values() {
        return (g37[]) p.clone();
    }
}
