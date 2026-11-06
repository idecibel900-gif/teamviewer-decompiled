package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class j48 {
    public static final j48 m;
    public static final j48 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final j48 f1130o;
    public static final /* synthetic */ j48[] p;

    static {
        j48 j48Var = new j48("FLEXIBLE_LOWER", 0);
        m = j48Var;
        j48 j48Var2 = new j48("FLEXIBLE_UPPER", 1);
        n = j48Var2;
        j48 j48Var3 = new j48("INFLEXIBLE", 2);
        f1130o = j48Var3;
        p = new j48[]{j48Var, j48Var2, j48Var3};
    }

    public static j48 valueOf(String str) {
        return (j48) Enum.valueOf(j48.class, str);
    }

    public static j48[] values() {
        return (j48[]) p.clone();
    }
}
