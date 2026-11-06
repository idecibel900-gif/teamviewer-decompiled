package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class mb2 {
    public static final mb2 m;
    public static final mb2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final mb2 f1456o;
    public static final /* synthetic */ mb2[] p;

    static {
        mb2 mb2Var = new mb2("PreEnter", 0);
        m = mb2Var;
        mb2 mb2Var2 = new mb2("Visible", 1);
        n = mb2Var2;
        mb2 mb2Var3 = new mb2("PostExit", 2);
        f1456o = mb2Var3;
        p = new mb2[]{mb2Var, mb2Var2, mb2Var3};
    }

    public static mb2 valueOf(String str) {
        return (mb2) Enum.valueOf(mb2.class, str);
    }

    public static mb2[] values() {
        return (mb2[]) p.clone();
    }
}
