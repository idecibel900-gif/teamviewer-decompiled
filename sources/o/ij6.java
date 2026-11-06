package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ij6 {
    public static final ij6 m;
    public static final ij6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ ij6[] f1069o;

    static {
        ij6 ij6Var = new ij6("PROMPT", 0);
        m = ij6Var;
        ij6 ij6Var2 = new ij6("PASSWORD", 1);
        n = ij6Var2;
        f1069o = new ij6[]{ij6Var, ij6Var2};
    }

    public static ij6 valueOf(String str) {
        return (ij6) Enum.valueOf(ij6.class, str);
    }

    public static ij6[] values() {
        return (ij6[]) f1069o.clone();
    }
}
