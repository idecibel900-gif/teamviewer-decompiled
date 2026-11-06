package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class o1 {
    public static final o1 m;
    public static final o1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ o1[] f1619o;

    static {
        o1 o1Var = new o1("CREATE_DIR_FAILED", 0);
        m = o1Var;
        o1 o1Var2 = new o1("WRITING_FAILED", 1);
        n = o1Var2;
        f1619o = new o1[]{o1Var, o1Var2};
    }

    public static o1 valueOf(String str) {
        return (o1) Enum.valueOf(o1.class, str);
    }

    public static o1[] values() {
        return (o1[]) f1619o.clone();
    }
}
