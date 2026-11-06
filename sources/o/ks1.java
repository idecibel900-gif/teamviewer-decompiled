package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ks1 {
    public static final ks1 m;
    public static final ks1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ks1 f1298o;
    public static final /* synthetic */ ks1[] p;

    static {
        ks1 ks1Var = new ks1("Bookmarked", 0);
        m = ks1Var;
        ks1 ks1Var2 = new ks1("Managed", 1);
        n = ks1Var2;
        ks1 ks1Var3 = new ks1("None", 2);
        f1298o = ks1Var3;
        p = new ks1[]{ks1Var, ks1Var2, ks1Var3};
    }

    public static ks1 valueOf(String str) {
        return (ks1) Enum.valueOf(ks1.class, str);
    }

    public static ks1[] values() {
        return (ks1[]) p.clone();
    }
}
