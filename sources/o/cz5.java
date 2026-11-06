package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class cz5 {
    public static final cz5 m;
    public static final cz5 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ cz5[] f571o;

    static {
        cz5 cz5Var = new cz5("OPEN_QS", 0);
        m = cz5Var;
        cz5 cz5Var2 = new cz5("UNAVAILABLE_QS", 1);
        n = cz5Var2;
        f571o = new cz5[]{cz5Var, cz5Var2};
    }

    public static cz5 valueOf(String str) {
        return (cz5) Enum.valueOf(cz5.class, str);
    }

    public static cz5[] values() {
        return (cz5[]) f571o.clone();
    }
}
