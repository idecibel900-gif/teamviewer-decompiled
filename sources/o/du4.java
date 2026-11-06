package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class du4 {
    public static final du4 m;
    public static final du4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final du4 f656o;
    public static final du4 p;
    public static final du4 q;
    public static final /* synthetic */ du4[] r;

    static {
        du4 du4Var = new du4("DefaultSpatial", 0);
        m = du4Var;
        du4 du4Var2 = new du4("FastSpatial", 1);
        n = du4Var2;
        du4 du4Var3 = new du4("SlowSpatial", 2);
        du4 du4Var4 = new du4("DefaultEffects", 3);
        f656o = du4Var4;
        du4 du4Var5 = new du4("FastEffects", 4);
        p = du4Var5;
        du4 du4Var6 = new du4("SlowEffects", 5);
        q = du4Var6;
        r = new du4[]{du4Var, du4Var2, du4Var3, du4Var4, du4Var5, du4Var6};
    }

    public static du4 valueOf(String str) {
        return (du4) Enum.valueOf(du4.class, str);
    }

    public static du4[] values() {
        return (du4[]) r.clone();
    }
}
