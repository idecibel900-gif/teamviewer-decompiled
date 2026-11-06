package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class n43 {
    public static final n43 m;
    public static final n43 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final n43 f1537o;
    public static final /* synthetic */ n43[] p;

    static {
        n43 n43Var = new n43("None", 0);
        m = n43Var;
        n43 n43Var2 = new n43("Selection", 1);
        n = n43Var2;
        n43 n43Var3 = new n43("Cursor", 2);
        f1537o = n43Var3;
        p = new n43[]{n43Var, n43Var2, n43Var3};
    }

    public static n43 valueOf(String str) {
        return (n43) Enum.valueOf(n43.class, str);
    }

    public static n43[] values() {
        return (n43[]) p.clone();
    }
}
