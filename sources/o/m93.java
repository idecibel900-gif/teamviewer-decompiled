package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class m93 {
    public static final m93 m;
    public static final m93 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final m93 f1451o;
    public static final m93 p;
    public static final /* synthetic */ m93[] q;

    static {
        m93 m93Var = new m93("Online", 0);
        m = m93Var;
        m93 m93Var2 = new m93("Away", 1);
        n = m93Var2;
        m93 m93Var3 = new m93("Busy", 2);
        f1451o = m93Var3;
        m93 m93Var4 = new m93("Offline", 3);
        p = m93Var4;
        q = new m93[]{m93Var, m93Var2, m93Var3, m93Var4};
    }

    public static m93 valueOf(String str) {
        return (m93) Enum.valueOf(m93.class, str);
    }

    public static m93[] values() {
        return (m93[]) q.clone();
    }
}
