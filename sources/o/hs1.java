package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class hs1 {
    public static final hs1 m;
    public static final hs1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final hs1 f1004o;
    public static final /* synthetic */ hs1[] p;

    static {
        hs1 hs1Var = new hs1("Legacy", 0);
        m = hs1Var;
        hs1 hs1Var2 = new hs1("Managed", 1);
        n = hs1Var2;
        hs1 hs1Var3 = new hs1("Unknown", 2);
        f1004o = hs1Var3;
        p = new hs1[]{hs1Var, hs1Var2, hs1Var3};
    }

    public static hs1 valueOf(String str) {
        return (hs1) Enum.valueOf(hs1.class, str);
    }

    public static hs1[] values() {
        return (hs1[]) p.clone();
    }
}
