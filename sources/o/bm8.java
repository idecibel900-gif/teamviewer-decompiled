package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class bm8 {
    public static final bm8 m;
    public static final bm8 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final bm8 f441o;
    public static final bm8 p;
    public static final bm8 q;
    public static final bm8 r;
    public static final bm8 s;
    public static final bm8 t;
    public static final bm8 u;
    public static final /* synthetic */ bm8[] v;

    static {
        bm8 bm8Var = new bm8("INT", 0);
        m = bm8Var;
        bm8 bm8Var2 = new bm8("LONG", 1);
        n = bm8Var2;
        bm8 bm8Var3 = new bm8("FLOAT", 2);
        f441o = bm8Var3;
        bm8 bm8Var4 = new bm8("DOUBLE", 3);
        p = bm8Var4;
        bm8 bm8Var5 = new bm8("BOOLEAN", 4);
        q = bm8Var5;
        bm8 bm8Var6 = new bm8("STRING", 5);
        r = bm8Var6;
        wh0 wh0Var = wh0.f2412o;
        bm8 bm8Var7 = new bm8("BYTE_STRING", 6);
        s = bm8Var7;
        bm8 bm8Var8 = new bm8("ENUM", 7);
        t = bm8Var8;
        bm8 bm8Var9 = new bm8("MESSAGE", 8);
        u = bm8Var9;
        v = new bm8[]{bm8Var, bm8Var2, bm8Var3, bm8Var4, bm8Var5, bm8Var6, bm8Var7, bm8Var8, bm8Var9};
    }

    public static bm8 valueOf(String str) {
        return (bm8) Enum.valueOf(bm8.class, str);
    }

    public static bm8[] values() {
        return (bm8[]) v.clone();
    }
}
