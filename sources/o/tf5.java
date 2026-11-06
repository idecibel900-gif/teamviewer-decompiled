package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class tf5 {
    public static final tf5 m;
    public static final tf5 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final tf5 f2106o;
    public static final /* synthetic */ tf5[] p;

    static {
        tf5 tf5Var = new tf5("ALL", 0);
        m = tf5Var;
        tf5 tf5Var2 = new tf5("ONLY_NON_SYNTHESIZED", 1);
        n = tf5Var2;
        tf5 tf5Var3 = new tf5("NONE", 2);
        f2106o = tf5Var3;
        p = new tf5[]{tf5Var, tf5Var2, tf5Var3};
    }

    public static tf5 valueOf(String str) {
        return (tf5) Enum.valueOf(tf5.class, str);
    }

    public static tf5[] values() {
        return (tf5[]) p.clone();
    }
}
