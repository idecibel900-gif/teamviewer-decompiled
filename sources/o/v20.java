package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class v20 {
    public static final v20 A;
    public static final v20 B;
    public static final v20 C;
    public static final /* synthetic */ v20[] D;
    public static final v20 m;
    public static final v20 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final v20 f2267o;
    public static final v20 p;
    public static final v20 q;
    public static final v20 r;
    public static final v20 s;
    public static final v20 t;
    public static final v20 u;
    public static final v20 v;
    public static final v20 w;
    public static final v20 x;
    public static final v20 y;
    public static final v20 z;

    static {
        v20 v20Var = new v20("AZTEC", 0);
        m = v20Var;
        v20 v20Var2 = new v20("CODABAR", 1);
        n = v20Var2;
        v20 v20Var3 = new v20("CODE_39", 2);
        f2267o = v20Var3;
        v20 v20Var4 = new v20("CODE_93", 3);
        p = v20Var4;
        v20 v20Var5 = new v20("CODE_128", 4);
        q = v20Var5;
        v20 v20Var6 = new v20("DATA_MATRIX", 5);
        r = v20Var6;
        v20 v20Var7 = new v20("EAN_8", 6);
        s = v20Var7;
        v20 v20Var8 = new v20("EAN_13", 7);
        t = v20Var8;
        v20 v20Var9 = new v20("ITF", 8);
        u = v20Var9;
        v20 v20Var10 = new v20("MAXICODE", 9);
        v = v20Var10;
        v20 v20Var11 = new v20("PDF_417", 10);
        w = v20Var11;
        v20 v20Var12 = new v20("QR_CODE", 11);
        x = v20Var12;
        v20 v20Var13 = new v20("RSS_14", 12);
        y = v20Var13;
        v20 v20Var14 = new v20("RSS_EXPANDED", 13);
        z = v20Var14;
        v20 v20Var15 = new v20("UPC_A", 14);
        A = v20Var15;
        v20 v20Var16 = new v20("UPC_E", 15);
        B = v20Var16;
        v20 v20Var17 = new v20("UPC_EAN_EXTENSION", 16);
        C = v20Var17;
        D = new v20[]{v20Var, v20Var2, v20Var3, v20Var4, v20Var5, v20Var6, v20Var7, v20Var8, v20Var9, v20Var10, v20Var11, v20Var12, v20Var13, v20Var14, v20Var15, v20Var16, v20Var17};
    }

    public static v20 valueOf(String str) {
        return (v20) Enum.valueOf(v20.class, str);
    }

    public static v20[] values() {
        return (v20[]) D.clone();
    }
}
