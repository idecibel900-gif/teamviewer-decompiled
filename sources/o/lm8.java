package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class lm8 {
    public static final lm8 m;
    public static final lm8 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final lm8 f1384o;
    public static final lm8 p;
    public static final lm8 q;
    public static final lm8 r;
    public static final /* synthetic */ lm8[] s;

    static {
        lm8 lm8Var = new lm8("ENQUEUED", 0);
        m = lm8Var;
        lm8 lm8Var2 = new lm8("RUNNING", 1);
        n = lm8Var2;
        lm8 lm8Var3 = new lm8("SUCCEEDED", 2);
        f1384o = lm8Var3;
        lm8 lm8Var4 = new lm8("FAILED", 3);
        p = lm8Var4;
        lm8 lm8Var5 = new lm8("BLOCKED", 4);
        q = lm8Var5;
        lm8 lm8Var6 = new lm8("CANCELLED", 5);
        r = lm8Var6;
        s = new lm8[]{lm8Var, lm8Var2, lm8Var3, lm8Var4, lm8Var5, lm8Var6};
    }

    public static lm8 valueOf(String str) {
        return (lm8) Enum.valueOf(lm8.class, str);
    }

    public static lm8[] values() {
        return (lm8[]) s.clone();
    }

    public final boolean a() {
        return this == f1384o || this == p || this == r;
    }
}
