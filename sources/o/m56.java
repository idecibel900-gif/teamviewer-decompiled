package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class m56 {
    public static final m56 m;
    public static final m56 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final m56 f1437o;
    public static final m56 p;
    public static final m56 q;
    public static final m56 r;
    public static final /* synthetic */ m56[] s;

    static {
        m56 m56Var = new m56("ShutDown", 0);
        m = m56Var;
        m56 m56Var2 = new m56("ShuttingDown", 1);
        n = m56Var2;
        m56 m56Var3 = new m56("Inactive", 2);
        f1437o = m56Var3;
        m56 m56Var4 = new m56("InactivePendingWork", 3);
        p = m56Var4;
        m56 m56Var5 = new m56("Idle", 4);
        q = m56Var5;
        m56 m56Var6 = new m56("PendingWork", 5);
        r = m56Var6;
        s = new m56[]{m56Var, m56Var2, m56Var3, m56Var4, m56Var5, m56Var6};
    }

    public static m56 valueOf(String str) {
        return (m56) Enum.valueOf(m56.class, str);
    }

    public static m56[] values() {
        return (m56[]) s.clone();
    }
}
