package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class z37 {
    public static final z37 m;
    public static final z37 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ z37[] f2668o;

    static {
        z37 z37Var = new z37("Dismissed", 0);
        m = z37Var;
        z37 z37Var2 = new z37("ActionPerformed", 1);
        n = z37Var2;
        f2668o = new z37[]{z37Var, z37Var2};
    }

    public static z37 valueOf(String str) {
        return (z37) Enum.valueOf(z37.class, str);
    }

    public static z37[] values() {
        return (z37[]) f2668o.clone();
    }
}
