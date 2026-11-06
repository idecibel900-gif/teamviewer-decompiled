package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class el4 {
    public static final el4 m;
    public static final el4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ el4[] f724o;

    static {
        el4 el4Var = new el4("ManagedDeviceV2", 0);
        m = el4Var;
        el4 el4Var2 = new el4("ManagedGroupV2", 1);
        n = el4Var2;
        f724o = new el4[]{el4Var, el4Var2};
    }

    public static el4 valueOf(String str) {
        return (el4) Enum.valueOf(el4.class, str);
    }

    public static el4[] values() {
        return (el4[]) f724o.clone();
    }
}
