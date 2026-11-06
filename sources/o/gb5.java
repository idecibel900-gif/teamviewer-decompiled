package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class gb5 {
    public static final gb5 m;
    public static final gb5 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ gb5[] f880o;

    static {
        gb5 gb5Var = new gb5("Vertical", 0);
        m = gb5Var;
        gb5 gb5Var2 = new gb5("Horizontal", 1);
        n = gb5Var2;
        f880o = new gb5[]{gb5Var, gb5Var2};
    }

    public static gb5 valueOf(String str) {
        return (gb5) Enum.valueOf(gb5.class, str);
    }

    public static gb5[] values() {
        return (gb5[]) f880o.clone();
    }
}
