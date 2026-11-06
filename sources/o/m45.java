package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class m45 {
    public static final m45 m;
    public static final m45 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ m45[] f1434o;

    static {
        m45 m45Var = new m45("Min", 0);
        m = m45Var;
        m45 m45Var2 = new m45("Max", 1);
        n = m45Var2;
        f1434o = new m45[]{m45Var, m45Var2};
    }

    public static m45 valueOf(String str) {
        return (m45) Enum.valueOf(m45.class, str);
    }

    public static m45[] values() {
        return (m45[]) f1434o.clone();
    }
}
