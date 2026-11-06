package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ne1 {
    public static final ne1 m;
    public static final ne1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ne1 f1565o;
    public static final /* synthetic */ ne1[] p;

    static {
        ne1 ne1Var = new ne1("COROUTINE_SUSPENDED", 0);
        m = ne1Var;
        ne1 ne1Var2 = new ne1("UNDECIDED", 1);
        n = ne1Var2;
        ne1 ne1Var3 = new ne1("RESUMED", 2);
        f1565o = ne1Var3;
        p = new ne1[]{ne1Var, ne1Var2, ne1Var3};
    }

    public static ne1 valueOf(String str) {
        return (ne1) Enum.valueOf(ne1.class, str);
    }

    public static ne1[] values() {
        return (ne1[]) p.clone();
    }
}
