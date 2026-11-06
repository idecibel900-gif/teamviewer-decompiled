package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class k37 {
    public static final k37 m;
    public static final k37 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final k37 f1227o;
    public static final /* synthetic */ k37[] p;

    static {
        k37 k37Var = new k37("INFO", 0);
        m = k37Var;
        k37 k37Var2 = new k37("ACTION", 1);
        n = k37Var2;
        k37 k37Var3 = new k37("ERROR", 2);
        f1227o = k37Var3;
        p = new k37[]{k37Var, k37Var2, k37Var3};
    }

    public static k37 valueOf(String str) {
        return (k37) Enum.valueOf(k37.class, str);
    }

    public static k37[] values() {
        return (k37[]) p.clone();
    }
}
