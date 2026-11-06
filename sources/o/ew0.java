package o;

/* JADX INFO: loaded from: classes.dex */
public final class ew0 {
    public static final float[] a;
    public static final float[] b;
    public static final a18 c;
    public static final a18 d;
    public static final td6 e;
    public static final td6 f;
    public static final td6 g;
    public static final td6 h;
    public static final td6 i;
    public static final td6 j;
    public static final td6 k;
    public static final td6 l;
    public static final td6 m;
    public static final td6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final td6 f746o;
    public static final td6 p;
    public static final td6 q;
    public static final td6 r;
    public static final xz3 s;
    public static final xz3 t;
    public static final td6 u;
    public static final td6 v;
    public static final td6 w;
    public static final e75 x;
    public static final cw0[] y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        a18 a18Var = new a18(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        a18 a18Var2 = new a18(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        a18 a18Var3 = new a18(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = a18Var3;
        a18 a18Var4 = new a18(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = a18Var4;
        wi8 wi8Var = db8.z;
        td6 td6Var = new td6("sRGB IEC61966-2.1", fArr, wi8Var, a18Var, 0);
        e = td6Var;
        td6 td6Var2 = new td6("sRGB IEC61966-2.1 (Linear)", fArr, wi8Var, 1.0d, 0.0f, 1.0f, 1);
        f = td6Var2;
        byte b2 = 8;
        td6 td6Var3 = new td6("scRGB-nl IEC 61966-2-2:2003", fArr, wi8Var, null, new gk0(b2), new hk0(b2), -0.799f, 2.399f, a18Var, 2);
        g = td6Var3;
        td6 td6Var4 = new td6("scRGB IEC 61966-2-2:2003", fArr, wi8Var, 1.0d, -0.5f, 7.499f, 3);
        h = td6Var4;
        td6 td6Var5 = new td6("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, wi8Var, new a18(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = td6Var5;
        td6 td6Var6 = new td6("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, wi8Var, new a18(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = td6Var6;
        td6 td6Var7 = new td6("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new wi8(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        k = td6Var7;
        td6 td6Var8 = new td6("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, wi8Var, a18Var, 7);
        l = td6Var8;
        double d2 = 0.2222222222222222d;
        double d3 = 0.081d;
        double d4 = 2.2222222222222223d;
        double d5 = 0.9099181073703367d;
        double d6 = 0.09008189262966333d;
        td6 td6Var9 = new td6("NTSC (1953)", fArr2, db8.w, new a18(d4, d5, d6, d2, d3), 8);
        m = td6Var9;
        td6 td6Var10 = new td6("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, wi8Var, new a18(d4, d5, d6, d2, d3), 9);
        n = td6Var10;
        td6 td6Var11 = new td6("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, wi8Var, 2.2d, 0.0f, 1.0f, 10);
        f746o = td6Var11;
        td6 td6Var12 = new td6("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, db8.x, new a18(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        p = td6Var12;
        wi8 wi8Var2 = db8.y;
        td6 td6Var13 = new td6("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, wi8Var2, 1.0d, -65504.0f, 65504.0f, 12);
        q = td6Var13;
        td6 td6Var14 = new td6("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, wi8Var2, 1.0d, -65504.0f, 65504.0f, 13);
        r = td6Var14;
        xz3 xz3Var = new xz3("Generic XYZ", 12884901889L, 14, (byte) 1);
        s = xz3Var;
        xz3 xz3Var2 = new xz3("Generic L*a*b*", 12884901890L, 15, (byte) 0);
        t = xz3Var2;
        td6 td6Var15 = new td6("None", fArr, wi8Var, a18Var2, 16);
        u = td6Var15;
        byte b3 = 9;
        td6 td6Var16 = new td6("Hybrid Log Gamma encoding", fArr3, wi8Var, null, new gk0(b3), new hk0(b3), 0.0f, 1.0f, a18Var3, 17);
        v = td6Var16;
        byte b4 = 10;
        td6 td6Var17 = new td6("Perceptual Quantizer encoding", fArr3, wi8Var, null, new gk0(b4), new hk0(b4), 0.0f, 1.0f, a18Var4, 18);
        w = td6Var17;
        e75 e75Var = new e75(19, 12884901890L, "Oklab");
        x = e75Var;
        y = new cw0[]{td6Var, td6Var2, td6Var3, td6Var4, td6Var5, td6Var6, td6Var7, td6Var8, td6Var9, td6Var10, td6Var11, td6Var12, td6Var13, td6Var14, xz3Var, xz3Var2, td6Var15, td6Var16, td6Var17, e75Var};
    }

    public static double a(a18 a18Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = a18Var.b;
        double d6 = a18Var.c;
        double d7 = a18Var.d;
        double d8 = a18Var.e;
        double d9 = a18Var.f;
        double d10 = d5 * d4;
        return (a18Var.g + 1.0d) * d3 * (d10 <= 1.0d ? Math.pow(d10, d6) : Math.exp((d4 - d9) * d7) + d8);
    }

    public static double b(a18 a18Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = 1.0d / a18Var.b;
        double d5 = 1.0d / a18Var.c;
        double d6 = 1.0d / a18Var.d;
        double d7 = a18Var.e;
        double d8 = a18Var.f;
        double d9 = (d2 * d3) / (a18Var.g + 1.0d);
        return d3 * (d9 <= 1.0d ? Math.pow(d9, d5) * d4 : (Math.log(d9 - d7) * d6) + d8);
    }

    public static double c(a18 a18Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = a18Var.b;
        double d6 = a18Var.d;
        double dPow = (Math.pow(d4, d6) * a18Var.c) + d5;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d4, d6) * a18Var.f) + a18Var.e), a18Var.g) * d3;
    }

    public static double d(a18 a18Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = -a18Var.b;
        double d6 = a18Var.e;
        double d7 = 1.0d / a18Var.g;
        return Math.pow(Math.max((Math.pow(d4, d7) * d6) + d5, 0.0d) / ((Math.pow(d4, d7) * (-a18Var.f)) + a18Var.c), 1.0d / a18Var.d) * d3;
    }
}
