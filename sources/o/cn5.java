package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class cn5 {
    public static final cn5 m;
    public static final cn5 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final cn5 f544o;
    public static final /* synthetic */ cn5[] p;

    static {
        cn5 cn5Var = new cn5("Initial", 0);
        m = cn5Var;
        cn5 cn5Var2 = new cn5("Main", 1);
        n = cn5Var2;
        cn5 cn5Var3 = new cn5("Final", 2);
        f544o = cn5Var3;
        p = new cn5[]{cn5Var, cn5Var2, cn5Var3};
    }

    public static cn5 valueOf(String str) {
        return (cn5) Enum.valueOf(cn5.class, str);
    }

    public static cn5[] values() {
        return (cn5[]) p.clone();
    }
}
