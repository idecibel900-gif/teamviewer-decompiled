package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class n13 {
    public static final n13 m;
    public static final n13 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final n13 f1531o;
    public static final n13 p;
    public static final n13 q;
    public static final n13 r;
    public static final /* synthetic */ n13[] s;

    static {
        n13 n13Var = new n13("LOADING_SHIMMER", 0);
        m = n13Var;
        n13 n13Var2 = new n13("LEGACY_ERROR", 1);
        n = n13Var2;
        n13 n13Var3 = new n13("LOADING_SPINNER", 2);
        f1531o = n13Var3;
        n13 n13Var4 = new n13("EMPTY", 3);
        p = n13Var4;
        n13 n13Var5 = new n13("NO_RESULTS", 4);
        q = n13Var5;
        n13 n13Var6 = new n13("HAS_DEVICES", 5);
        r = n13Var6;
        s = new n13[]{n13Var, n13Var2, n13Var3, n13Var4, n13Var5, n13Var6};
    }

    public static n13 valueOf(String str) {
        return (n13) Enum.valueOf(n13.class, str);
    }

    public static n13[] values() {
        return (n13[]) s.clone();
    }
}
