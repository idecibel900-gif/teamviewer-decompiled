package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class lj5 {
    public static final lj5 m;
    public static final lj5 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ lj5[] f1368o;

    static {
        lj5 lj5Var = new lj5("RECOMMENDED", 0);
        m = lj5Var;
        lj5 lj5Var2 = new lj5("OPTIONAL", 1);
        n = lj5Var2;
        f1368o = new lj5[]{lj5Var, lj5Var2};
    }

    public static lj5 valueOf(String str) {
        return (lj5) Enum.valueOf(lj5.class, str);
    }

    public static lj5[] values() {
        return (lj5[]) f1368o.clone();
    }
}
