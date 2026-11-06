package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class qp1 {
    public static final qp1 m;
    public static final qp1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ qp1[] f1853o;

    static {
        qp1 qp1Var = new qp1("STABLE", 0);
        m = qp1Var;
        qp1 qp1Var2 = new qp1("UNSTABLE", 1);
        n = qp1Var2;
        f1853o = new qp1[]{qp1Var, qp1Var2};
    }

    public static qp1 valueOf(String str) {
        return (qp1) Enum.valueOf(qp1.class, str);
    }

    public static qp1[] values() {
        return (qp1[]) f1853o.clone();
    }
}
