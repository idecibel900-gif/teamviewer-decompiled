package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class so3 {
    public static final so3 m;
    public static final so3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final so3 f2039o;
    public static final /* synthetic */ so3[] p;

    static {
        so3 so3Var = new so3("INFLEXIBLE", 0);
        m = so3Var;
        so3 so3Var2 = new so3("FLEXIBLE_UPPER_BOUND", 1);
        n = so3Var2;
        so3 so3Var3 = new so3("FLEXIBLE_LOWER_BOUND", 2);
        f2039o = so3Var3;
        p = new so3[]{so3Var, so3Var2, so3Var3};
    }

    public static so3 valueOf(String str) {
        return (so3) Enum.valueOf(so3.class, str);
    }

    public static so3[] values() {
        return (so3[]) p.clone();
    }
}
