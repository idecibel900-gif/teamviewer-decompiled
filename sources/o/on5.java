package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class on5 {
    public static final on5 m;
    public static final on5 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final on5 f1662o;
    public static final /* synthetic */ on5[] p;

    static {
        on5 on5Var = new on5("Unknown", 0);
        m = on5Var;
        on5 on5Var2 = new on5("Dispatching", 1);
        n = on5Var2;
        on5 on5Var3 = new on5("NotDispatching", 2);
        f1662o = on5Var3;
        p = new on5[]{on5Var, on5Var2, on5Var3};
    }

    public static on5 valueOf(String str) {
        return (on5) Enum.valueOf(on5.class, str);
    }

    public static on5[] values() {
        return (on5[]) p.clone();
    }
}
