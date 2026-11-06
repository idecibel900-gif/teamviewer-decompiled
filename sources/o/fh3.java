package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class fh3 {
    public static final fh3 m;
    public static final fh3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final fh3 f798o;
    public static final /* synthetic */ fh3[] p;

    static {
        fh3 fh3Var = new fh3("Yes", 0);
        m = fh3Var;
        fh3 fh3Var2 = new fh3("No", 1);
        n = fh3Var2;
        fh3 fh3Var3 = new fh3("NotInitialized", 2);
        f798o = fh3Var3;
        p = new fh3[]{fh3Var, fh3Var2, fh3Var3};
    }

    public static fh3 valueOf(String str) {
        return (fh3) Enum.valueOf(fh3.class, str);
    }

    public static fh3[] values() {
        return (fh3[]) p.clone();
    }
}
