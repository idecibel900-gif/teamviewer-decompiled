package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class l43 {
    public static final l43 m;
    public static final l43 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final l43 f1328o;
    public static final /* synthetic */ l43[] p;

    static {
        l43 l43Var = new l43("Cursor", 0);
        m = l43Var;
        l43 l43Var2 = new l43("SelectionStart", 1);
        n = l43Var2;
        l43 l43Var3 = new l43("SelectionEnd", 2);
        f1328o = l43Var3;
        p = new l43[]{l43Var, l43Var2, l43Var3};
    }

    public static l43 valueOf(String str) {
        return (l43) Enum.valueOf(l43.class, str);
    }

    public static l43[] values() {
        return (l43[]) p.clone();
    }
}
