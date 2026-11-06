package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class mi6 {
    public static final mi6 m;
    public static final mi6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final mi6 f1473o;
    public static final mi6 p;
    public static final mi6 q;
    public static final /* synthetic */ mi6[] r;

    static {
        mi6 mi6Var = new mi6("TopBar", 0);
        m = mi6Var;
        mi6 mi6Var2 = new mi6("MainContent", 1);
        n = mi6Var2;
        mi6 mi6Var3 = new mi6("Snackbar", 2);
        f1473o = mi6Var3;
        mi6 mi6Var4 = new mi6("Fab", 3);
        p = mi6Var4;
        mi6 mi6Var5 = new mi6("BottomBar", 4);
        q = mi6Var5;
        r = new mi6[]{mi6Var, mi6Var2, mi6Var3, mi6Var4, mi6Var5};
    }

    public static mi6 valueOf(String str) {
        return (mi6) Enum.valueOf(mi6.class, str);
    }

    public static mi6[] values() {
        return (mi6[]) r.clone();
    }
}
