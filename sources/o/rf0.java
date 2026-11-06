package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class rf0 {
    public static final rf0 m;
    public static final rf0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ rf0[] f1918o;

    static {
        rf0 rf0Var = new rf0("Real", 0);
        m = rf0Var;
        rf0 rf0Var2 = new rf0("Virtual", 1);
        n = rf0Var2;
        f1918o = new rf0[]{rf0Var, rf0Var2};
    }

    public static rf0 valueOf(String str) {
        return (rf0) Enum.valueOf(rf0.class, str);
    }

    public static rf0[] values() {
        return (rf0[]) f1918o.clone();
    }
}
