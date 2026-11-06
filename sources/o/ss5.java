package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ss5 {
    public static final ss5 m;
    public static final ss5 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ss5 f2049o;
    public static final /* synthetic */ ss5[] p;

    static {
        ss5 ss5Var = new ss5("DEFAULT", 0);
        m = ss5Var;
        ss5 ss5Var2 = new ss5("VERY_LOW", 1);
        n = ss5Var2;
        ss5 ss5Var3 = new ss5("HIGHEST", 2);
        f2049o = ss5Var3;
        p = new ss5[]{ss5Var, ss5Var2, ss5Var3};
    }

    public static ss5 valueOf(String str) {
        return (ss5) Enum.valueOf(ss5.class, str);
    }

    public static ss5[] values() {
        return (ss5[]) p.clone();
    }
}
