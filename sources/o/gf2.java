package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class gf2 {
    public static final gf2 m;
    public static final gf2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final gf2 f887o;
    public static final gf2 p;
    public static final /* synthetic */ gf2[] q;

    static {
        gf2 gf2Var = new gf2("REPLACE", 0);
        m = gf2Var;
        gf2 gf2Var2 = new gf2("KEEP", 1);
        n = gf2Var2;
        gf2 gf2Var3 = new gf2("APPEND", 2);
        f887o = gf2Var3;
        gf2 gf2Var4 = new gf2("APPEND_OR_REPLACE", 3);
        p = gf2Var4;
        q = new gf2[]{gf2Var, gf2Var2, gf2Var3, gf2Var4};
    }

    public static gf2 valueOf(String str) {
        return (gf2) Enum.valueOf(gf2.class, str);
    }

    public static gf2[] values() {
        return (gf2[]) q.clone();
    }
}
