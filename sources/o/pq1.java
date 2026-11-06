package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class pq1 {
    public static final pq1 m;
    public static final pq1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final pq1 f1763o;
    public static final /* synthetic */ pq1[] p;

    static {
        pq1 pq1Var = new pq1("IsNotModularSession", 0);
        m = pq1Var;
        pq1 pq1Var2 = new pq1("Ambiguous", 1);
        n = pq1Var2;
        pq1 pq1Var3 = new pq1("Pilot", 2);
        f1763o = pq1Var3;
        p = new pq1[]{pq1Var, pq1Var2, pq1Var3};
    }

    public static pq1 valueOf(String str) {
        return (pq1) Enum.valueOf(pq1.class, str);
    }

    public static pq1[] values() {
        return (pq1[]) p.clone();
    }
}
