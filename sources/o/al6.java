package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class al6 {
    public static final al6 m;
    public static final al6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final al6 f335o;
    public static final al6 p;
    public static final al6 q;
    public static final /* synthetic */ al6[] r;

    static {
        al6 al6Var = new al6("Loading", 0);
        m = al6Var;
        al6 al6Var2 = new al6("Description", 1);
        n = al6Var2;
        al6 al6Var3 = new al6("NoResults", 2);
        f335o = al6Var3;
        al6 al6Var4 = new al6("Results", 3);
        p = al6Var4;
        al6 al6Var5 = new al6("None", 4);
        q = al6Var5;
        r = new al6[]{al6Var, al6Var2, al6Var3, al6Var4, al6Var5};
    }

    public static al6 valueOf(String str) {
        return (al6) Enum.valueOf(al6.class, str);
    }

    public static al6[] values() {
        return (al6[]) r.clone();
    }
}
