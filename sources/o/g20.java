package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class g20 {
    public static final g20 m;
    public static final g20 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ g20[] f847o;

    static {
        g20 g20Var = new g20("EXPONENTIAL", 0);
        m = g20Var;
        g20 g20Var2 = new g20("LINEAR", 1);
        n = g20Var2;
        f847o = new g20[]{g20Var, g20Var2};
    }

    public static g20 valueOf(String str) {
        return (g20) Enum.valueOf(g20.class, str);
    }

    public static g20[] values() {
        return (g20[]) f847o.clone();
    }
}
