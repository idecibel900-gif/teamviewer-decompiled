package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class zh3 {
    public static final zh3 m;
    public static final zh3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ zh3[] f2702o;

    static {
        zh3 zh3Var = new zh3("NO_BROWSER", 0);
        m = zh3Var;
        zh3 zh3Var2 = new zh3("ACCOUNT_DEVICE_LIMIT_EXCEEDED_ERROR", 1);
        n = zh3Var2;
        f2702o = new zh3[]{zh3Var, zh3Var2};
    }

    public static zh3 valueOf(String str) {
        return (zh3) Enum.valueOf(zh3.class, str);
    }

    public static zh3[] values() {
        return (zh3[]) f2702o.clone();
    }
}
