package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class fw4 {
    public static final fw4 m;
    public static final fw4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ fw4[] f834o;

    static {
        fw4 fw4Var = new fw4("READ_ONLY", 0);
        m = fw4Var;
        fw4 fw4Var2 = new fw4("MUTABLE", 1);
        n = fw4Var2;
        f834o = new fw4[]{fw4Var, fw4Var2};
    }

    public static fw4 valueOf(String str) {
        return (fw4) Enum.valueOf(fw4.class, str);
    }

    public static fw4[] values() {
        return (fw4[]) f834o.clone();
    }
}
