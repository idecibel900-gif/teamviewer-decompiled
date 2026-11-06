package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class m13 {
    public static final m13 m;
    public static final m13 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final m13 f1425o;
    public static final m13 p;
    public static final /* synthetic */ m13[] q;

    static {
        m13 m13Var = new m13("NAME_ASCENDING", 0);
        m = m13Var;
        m13 m13Var2 = new m13("NAME_DESCENDING", 1);
        n = m13Var2;
        m13 m13Var3 = new m13("STATUS_ONLINE", 2);
        f1425o = m13Var3;
        m13 m13Var4 = new m13("STATUS_OFFLINE", 3);
        p = m13Var4;
        q = new m13[]{m13Var, m13Var2, m13Var3, m13Var4};
    }

    public static m13 valueOf(String str) {
        return (m13) Enum.valueOf(m13.class, str);
    }

    public static m13[] values() {
        return (m13[]) q.clone();
    }
}
