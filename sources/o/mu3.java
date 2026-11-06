package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class mu3 {
    public static final mu3 m;
    public static final mu3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ mu3[] f1507o;

    static {
        mu3 mu3Var = new mu3("DECLARED", 0);
        m = mu3Var;
        mu3 mu3Var2 = new mu3("INHERITED", 1);
        n = mu3Var2;
        f1507o = new mu3[]{mu3Var, mu3Var2};
    }

    public static mu3 valueOf(String str) {
        return (mu3) Enum.valueOf(mu3.class, str);
    }

    public static mu3[] values() {
        return (mu3[]) f1507o.clone();
    }
}
