package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class yb3 {
    public static final yb3 m;
    public static final yb3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final yb3 f2595o;
    public static final yb3 p;
    public static final yb3 q;
    public static final yb3 r;
    public static final yb3 s;
    public static final yb3 t;
    public static final yb3 u;
    public static final /* synthetic */ yb3[] v;

    static {
        yb3 yb3Var = new yb3("NONE", 0);
        m = yb3Var;
        yb3 yb3Var2 = new yb3("LEFT_CLICK_PENDING", 1);
        n = yb3Var2;
        yb3 yb3Var3 = new yb3("RIGHT_CLICK", 2);
        f2595o = yb3Var3;
        yb3 yb3Var4 = new yb3("DOUBLE_TAB", 3);
        p = yb3Var4;
        yb3 yb3Var5 = new yb3("MARK", 4);
        q = yb3Var5;
        yb3 yb3Var6 = new yb3("SCROLL", 5);
        r = yb3Var6;
        yb3 yb3Var7 = new yb3("PINCH", 6);
        s = yb3Var7;
        yb3 yb3Var8 = new yb3("MOVE", 7);
        t = yb3Var8;
        yb3 yb3Var9 = new yb3("HOVER", 8);
        u = yb3Var9;
        v = new yb3[]{yb3Var, yb3Var2, yb3Var3, yb3Var4, yb3Var5, yb3Var6, yb3Var7, yb3Var8, yb3Var9};
    }

    public static yb3 valueOf(String str) {
        return (yb3) Enum.valueOf(yb3.class, str);
    }

    public static yb3[] values() {
        return (yb3[]) v.clone();
    }
}
