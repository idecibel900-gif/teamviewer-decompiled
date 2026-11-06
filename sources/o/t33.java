package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class t33 {
    public static final t33 m;
    public static final t33 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final t33 f2076o;
    public static final /* synthetic */ t33[] p;

    static {
        t33 t33Var = new t33("Contact", 0);
        m = t33Var;
        t33 t33Var2 = new t33("Computer", 1);
        n = t33Var2;
        t33 t33Var3 = new t33("ServiceCase", 2);
        f2076o = t33Var3;
        p = new t33[]{t33Var, t33Var2, t33Var3};
    }

    public static t33 valueOf(String str) {
        return (t33) Enum.valueOf(t33.class, str);
    }

    public static t33[] values() {
        return (t33[]) p.clone();
    }
}
