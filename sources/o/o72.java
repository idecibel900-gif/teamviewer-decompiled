package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class o72 {
    public static final ir m;
    public static final o72 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final o72 f1638o;
    public static final o72 p;
    public static final /* synthetic */ o72[] q;

    static {
        o72 o72Var = new o72("DontChange", 0);
        n = o72Var;
        o72 o72Var2 = new o72("BestFit", 1);
        f1638o = o72Var2;
        o72 o72Var3 = new o72("Custom", 2);
        p = o72Var3;
        q = new o72[]{o72Var, o72Var2, o72Var3};
        m = new ir((byte) 14);
    }

    public static o72 valueOf(String str) {
        return (o72) Enum.valueOf(o72.class, str);
    }

    public static o72[] values() {
        return (o72[]) q.clone();
    }
}
