package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class pe1 {
    public static final pe1 m;
    public static final pe1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final pe1 f1729o;
    public static final pe1 p;
    public static final /* synthetic */ pe1[] q;

    static {
        pe1 pe1Var = new pe1("DEFAULT", 0);
        m = pe1Var;
        pe1 pe1Var2 = new pe1("LAZY", 1);
        n = pe1Var2;
        pe1 pe1Var3 = new pe1("ATOMIC", 2);
        f1729o = pe1Var3;
        pe1 pe1Var4 = new pe1("UNDISPATCHED", 3);
        p = pe1Var4;
        q = new pe1[]{pe1Var, pe1Var2, pe1Var3, pe1Var4};
    }

    public static pe1 valueOf(String str) {
        return (pe1) Enum.valueOf(pe1.class, str);
    }

    public static pe1[] values() {
        return (pe1[]) q.clone();
    }
}
