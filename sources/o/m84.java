package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class m84 {
    public static final m84 m;
    public static final m84 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final m84 f1446o;
    public static final m84 p;
    public static final m84 q;
    public static final /* synthetic */ m84[] r;

    static {
        m84 m84Var = new m84("DESTROYED", 0);
        m = m84Var;
        m84 m84Var2 = new m84("INITIALIZED", 1);
        n = m84Var2;
        m84 m84Var3 = new m84("CREATED", 2);
        f1446o = m84Var3;
        m84 m84Var4 = new m84("STARTED", 3);
        p = m84Var4;
        m84 m84Var5 = new m84("RESUMED", 4);
        q = m84Var5;
        r = new m84[]{m84Var, m84Var2, m84Var3, m84Var4, m84Var5};
    }

    public static m84 valueOf(String str) {
        return (m84) Enum.valueOf(m84.class, str);
    }

    public static m84[] values() {
        return (m84[]) r.clone();
    }
}
