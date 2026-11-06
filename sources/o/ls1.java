package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ls1 {
    public static final ls1 m;
    public static final ls1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ls1 f1400o;
    public static final /* synthetic */ ls1[] p;

    static {
        ls1 ls1Var = new ls1("Online", 0);
        m = ls1Var;
        ls1 ls1Var2 = new ls1("Offline", 1);
        n = ls1Var2;
        ls1 ls1Var3 = new ls1("Sleeping", 2);
        f1400o = ls1Var3;
        p = new ls1[]{ls1Var, ls1Var2, ls1Var3};
    }

    public static ls1 valueOf(String str) {
        return (ls1) Enum.valueOf(ls1.class, str);
    }

    public static ls1[] values() {
        return (ls1[]) p.clone();
    }
}
