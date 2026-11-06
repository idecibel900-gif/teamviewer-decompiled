package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class iv4 {
    public static final iv4 m;
    public static final iv4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final iv4 f1107o;
    public static final iv4 p;
    public static final /* synthetic */ iv4[] q;

    static {
        iv4 iv4Var = new iv4("None", 0);
        m = iv4Var;
        iv4 iv4Var2 = new iv4("Remote", 1);
        n = iv4Var2;
        iv4 iv4Var3 = new iv4("LocalZoom", 2);
        f1107o = iv4Var3;
        iv4 iv4Var4 = new iv4("LocalScroll", 3);
        p = iv4Var4;
        q = new iv4[]{iv4Var, iv4Var2, iv4Var3, iv4Var4};
    }

    public static iv4 valueOf(String str) {
        return (iv4) Enum.valueOf(iv4.class, str);
    }

    public static iv4[] values() {
        return (iv4[]) q.clone();
    }
}
