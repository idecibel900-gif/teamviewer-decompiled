package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class xs6 {
    public static final xs6 m;
    public static final xs6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final xs6 f2547o;
    public static final /* synthetic */ xs6[] p;

    static {
        xs6 xs6Var = new xs6("Name", 0);
        m = xs6Var;
        xs6 xs6Var2 = new xs6("Email", 1);
        n = xs6Var2;
        xs6 xs6Var3 = new xs6("Description", 2);
        f2547o = xs6Var3;
        p = new xs6[]{xs6Var, xs6Var2, xs6Var3};
    }

    public static xs6 valueOf(String str) {
        return (xs6) Enum.valueOf(xs6.class, str);
    }

    public static xs6[] values() {
        return (xs6[]) p.clone();
    }
}
