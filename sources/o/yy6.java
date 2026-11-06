package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class yy6 {
    public static final yy6 m;
    public static final yy6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final yy6 f2656o;
    public static final /* synthetic */ yy6[] p;

    static {
        yy6 yy6Var = new yy6("Hidden", 0);
        m = yy6Var;
        yy6 yy6Var2 = new yy6("Expanded", 1);
        n = yy6Var2;
        yy6 yy6Var3 = new yy6("PartiallyExpanded", 2);
        f2656o = yy6Var3;
        p = new yy6[]{yy6Var, yy6Var2, yy6Var3};
    }

    public static yy6 valueOf(String str) {
        return (yy6) Enum.valueOf(yy6.class, str);
    }

    public static yy6[] values() {
        return (yy6[]) p.clone();
    }
}
