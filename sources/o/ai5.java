package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ai5 {
    public static final ai5 m;
    public static final ai5 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ai5 f327o;
    public static final ai5 p;
    public static final ai5 q;
    public static final ai5 r;
    public static final ai5 s;
    public static final /* synthetic */ ai5[] t;

    static {
        ai5 ai5Var = new ai5("Invalid", 0);
        m = ai5Var;
        ai5 ai5Var2 = new ai5("Cancelled", 1);
        n = ai5Var2;
        ai5 ai5Var3 = new ai5("InitialPending", 2);
        f327o = ai5Var3;
        ai5 ai5Var4 = new ai5("RecomposePending", 3);
        p = ai5Var4;
        ai5 ai5Var5 = new ai5("Recomposing", 4);
        q = ai5Var5;
        ai5 ai5Var6 = new ai5("ApplyPending", 5);
        r = ai5Var6;
        ai5 ai5Var7 = new ai5("Applied", 6);
        s = ai5Var7;
        t = new ai5[]{ai5Var, ai5Var2, ai5Var3, ai5Var4, ai5Var5, ai5Var6, ai5Var7};
    }

    public static ai5 valueOf(String str) {
        return (ai5) Enum.valueOf(ai5.class, str);
    }

    public static ai5[] values() {
        return (ai5[]) t.clone();
    }
}
