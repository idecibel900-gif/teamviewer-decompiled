package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class wd4 {
    public static final wd4 m;
    public static final wd4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final wd4 f2399o;
    public static final /* synthetic */ wd4[] p;

    static {
        wd4 wd4Var = new wd4("NOT_COMPUTED", 0);
        m = wd4Var;
        wd4 wd4Var2 = new wd4("COMPUTING", 1);
        n = wd4Var2;
        wd4 wd4Var3 = new wd4("RECURSION_WAS_DETECTED", 2);
        f2399o = wd4Var3;
        p = new wd4[]{wd4Var, wd4Var2, wd4Var3};
    }

    public static wd4 valueOf(String str) {
        return (wd4) Enum.valueOf(wd4.class, str);
    }

    public static wd4[] values() {
        return (wd4[]) p.clone();
    }
}
