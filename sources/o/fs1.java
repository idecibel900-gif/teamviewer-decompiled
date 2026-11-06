package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class fs1 {
    public static final fs1 m;
    public static final fs1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final fs1 f825o;
    public static final fs1 p;
    public static final fs1 q;
    public static final /* synthetic */ fs1[] r;

    static {
        fs1 fs1Var = new fs1("Online", 0);
        m = fs1Var;
        fs1 fs1Var2 = new fs1("Sleeping", 1);
        n = fs1Var2;
        fs1 fs1Var3 = new fs1("Offline", 2);
        f825o = fs1Var3;
        fs1 fs1Var4 = new fs1("Unknown", 3);
        p = fs1Var4;
        fs1 fs1Var5 = new fs1("Unavailable", 4);
        q = fs1Var5;
        r = new fs1[]{fs1Var, fs1Var2, fs1Var3, fs1Var4, fs1Var5};
    }

    public static fs1 valueOf(String str) {
        return (fs1) Enum.valueOf(fs1.class, str);
    }

    public static fs1[] values() {
        return (fs1[]) r.clone();
    }
}
