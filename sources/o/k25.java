package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class k25 {
    public static final k25 m;
    public static final k25 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final k25 f1224o;
    public static final /* synthetic */ k25[] p;

    static {
        k25 k25Var = new k25("Offline", 0);
        m = k25Var;
        k25 k25Var2 = new k25("Connecting", 1);
        n = k25Var2;
        k25 k25Var3 = new k25("Online", 2);
        f1224o = k25Var3;
        p = new k25[]{k25Var, k25Var2, k25Var3};
    }

    public static k25 valueOf(String str) {
        return (k25) Enum.valueOf(k25.class, str);
    }

    public static k25[] values() {
        return (k25[]) p.clone();
    }
}
