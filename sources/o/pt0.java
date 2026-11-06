package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class pt0 {
    public static final pt0 m;
    public static final pt0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final pt0 f1773o;
    public static final /* synthetic */ pt0[] p;

    static {
        pt0 pt0Var = new pt0("NOT_SUPPORTED", 0);
        m = pt0Var;
        pt0 pt0Var2 = new pt0("NOT_INSTALLED", 1);
        n = pt0Var2;
        pt0 pt0Var3 = new pt0("INSTALLED", 2);
        f1773o = pt0Var3;
        p = new pt0[]{pt0Var, pt0Var2, pt0Var3};
    }

    public static pt0 valueOf(String str) {
        return (pt0) Enum.valueOf(pt0.class, str);
    }

    public static pt0[] values() {
        return (pt0[]) p.clone();
    }
}
