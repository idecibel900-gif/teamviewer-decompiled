package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class o53 {
    public static final o53 m;
    public static final o53 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final o53 f1630o;
    public static final /* synthetic */ o53[] p;

    static {
        o53 o53Var = new o53("Unknown", 0);
        m = o53Var;
        o53 o53Var2 = new o53("Yes", 1);
        n = o53Var2;
        o53 o53Var3 = new o53("No", 2);
        f1630o = o53Var3;
        p = new o53[]{o53Var, o53Var2, o53Var3};
    }

    public static o53 valueOf(String str) {
        return (o53) Enum.valueOf(o53.class, str);
    }

    public static o53[] values() {
        return (o53[]) p.clone();
    }
}
