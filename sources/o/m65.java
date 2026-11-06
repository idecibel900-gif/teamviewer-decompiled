package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class m65 {
    public static final m65 m;
    public static final m65 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final m65 f1440o;
    public static final /* synthetic */ m65[] p;

    static {
        m65 m65Var = new m65("NO_OP", 0);
        m = m65Var;
        m65 m65Var2 = new m65("ADD", 1);
        n = m65Var2;
        m65 m65Var3 = new m65("REMOVE", 2);
        f1440o = m65Var3;
        p = new m65[]{m65Var, m65Var2, m65Var3};
    }

    public static m65 valueOf(String str) {
        return (m65) Enum.valueOf(m65.class, str);
    }

    public static m65[] values() {
        return (m65[]) p.clone();
    }
}
