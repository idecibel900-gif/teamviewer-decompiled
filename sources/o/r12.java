package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class r12 {
    public static final r12 m;
    public static final r12 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final r12 f1880o;
    public static final /* synthetic */ r12[] p;

    static {
        r12 r12Var = new r12("Vertical", 0);
        m = r12Var;
        r12 r12Var2 = new r12("Horizontal", 1);
        n = r12Var2;
        r12 r12Var3 = new r12("Both", 2);
        f1880o = r12Var3;
        p = new r12[]{r12Var, r12Var2, r12Var3};
    }

    public static r12 valueOf(String str) {
        return (r12) Enum.valueOf(r12.class, str);
    }

    public static r12[] values() {
        return (r12[]) p.clone();
    }
}
