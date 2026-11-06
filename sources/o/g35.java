package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class g35 {
    public static final g35 m;
    public static final g35 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final g35 f853o;
    public static final g35 p;
    public static final g35 q;
    public static final g35 r;
    public static final /* synthetic */ g35[] s;

    static {
        g35 g35Var = new g35("NOT_REQUIRED", 0);
        m = g35Var;
        g35 g35Var2 = new g35("CONNECTED", 1);
        n = g35Var2;
        g35 g35Var3 = new g35("UNMETERED", 2);
        f853o = g35Var3;
        g35 g35Var4 = new g35("NOT_ROAMING", 3);
        p = g35Var4;
        g35 g35Var5 = new g35("METERED", 4);
        q = g35Var5;
        g35 g35Var6 = new g35("TEMPORARILY_UNMETERED", 5);
        r = g35Var6;
        s = new g35[]{g35Var, g35Var2, g35Var3, g35Var4, g35Var5, g35Var6};
    }

    public static g35 valueOf(String str) {
        return (g35) Enum.valueOf(g35.class, str);
    }

    public static g35[] values() {
        return (g35[]) s.clone();
    }
}
