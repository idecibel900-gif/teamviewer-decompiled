package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class rb6 {
    public static final rb6 m;
    public static final rb6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ rb6[] f1912o;

    static {
        rb6 rb6Var = new rb6("Ltr", 0);
        m = rb6Var;
        rb6 rb6Var2 = new rb6("Rtl", 1);
        n = rb6Var2;
        f1912o = new rb6[]{rb6Var, rb6Var2};
    }

    public static rb6 valueOf(String str) {
        return (rb6) Enum.valueOf(rb6.class, str);
    }

    public static rb6[] values() {
        return (rb6[]) f1912o.clone();
    }
}
