package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class gk6 {
    public static final gk6 m;
    public static final gk6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final gk6 f902o;
    public static final /* synthetic */ gk6[] p;

    static {
        gk6 gk6Var = new gk6("Collapsible", 0);
        m = gk6Var;
        gk6 gk6Var2 = new gk6("Scrollable", 1);
        gk6 gk6Var3 = new gk6("NonScrollable", 2);
        n = gk6Var3;
        gk6 gk6Var4 = new gk6("Unknown", 3);
        f902o = gk6Var4;
        p = new gk6[]{gk6Var, gk6Var2, gk6Var3, gk6Var4};
    }

    public static gk6 valueOf(String str) {
        return (gk6) Enum.valueOf(gk6.class, str);
    }

    public static gk6[] values() {
        return (gk6[]) p.clone();
    }
}
