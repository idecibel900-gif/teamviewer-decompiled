package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ke1 {
    public static final ke1 m;
    public static final ke1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ke1 f1253o;
    public static final ke1 p;
    public static final ke1 q;
    public static final /* synthetic */ ke1[] r;

    static {
        ke1 ke1Var = new ke1("CPU_ACQUIRED", 0);
        m = ke1Var;
        ke1 ke1Var2 = new ke1("BLOCKING", 1);
        n = ke1Var2;
        ke1 ke1Var3 = new ke1("PARKING", 2);
        f1253o = ke1Var3;
        ke1 ke1Var4 = new ke1("DORMANT", 3);
        p = ke1Var4;
        ke1 ke1Var5 = new ke1("TERMINATED", 4);
        q = ke1Var5;
        r = new ke1[]{ke1Var, ke1Var2, ke1Var3, ke1Var4, ke1Var5};
    }

    public static ke1 valueOf(String str) {
        return (ke1) Enum.valueOf(ke1.class, str);
    }

    public static ke1[] values() {
        return (ke1[]) r.clone();
    }
}
