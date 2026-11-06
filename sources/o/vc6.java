package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class vc6 {
    public static final vc6 m;
    public static final vc6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final vc6 f2300o;
    public static final vc6 p;
    public static final vc6 q;
    public static final vc6 r;
    public static final vc6 s;
    public static final vc6 t;
    public static final vc6 u;
    public static final vc6 v;
    public static final vc6 w;
    public static final vc6 x;
    public static final vc6 y;
    public static final /* synthetic */ vc6[] z;

    /* JADX INFO: Fake field, exist only in values array */
    vc6 EF0;

    static {
        vc6 vc6Var = new vc6("OTHER", 0);
        vc6 vc6Var2 = new vc6("ORIENTATION", 1);
        m = vc6Var2;
        vc6 vc6Var3 = new vc6("BYTE_SEGMENTS", 2);
        n = vc6Var3;
        vc6 vc6Var4 = new vc6("ERROR_CORRECTION_LEVEL", 3);
        f2300o = vc6Var4;
        vc6 vc6Var5 = new vc6("ERRORS_CORRECTED", 4);
        p = vc6Var5;
        vc6 vc6Var6 = new vc6("ERASURES_CORRECTED", 5);
        q = vc6Var6;
        vc6 vc6Var7 = new vc6("ISSUE_NUMBER", 6);
        r = vc6Var7;
        vc6 vc6Var8 = new vc6("SUGGESTED_PRICE", 7);
        s = vc6Var8;
        vc6 vc6Var9 = new vc6("POSSIBLE_COUNTRY", 8);
        t = vc6Var9;
        vc6 vc6Var10 = new vc6("UPC_EAN_EXTENSION", 9);
        u = vc6Var10;
        vc6 vc6Var11 = new vc6("PDF417_EXTRA_METADATA", 10);
        v = vc6Var11;
        vc6 vc6Var12 = new vc6("STRUCTURED_APPEND_SEQUENCE", 11);
        w = vc6Var12;
        vc6 vc6Var13 = new vc6("STRUCTURED_APPEND_PARITY", 12);
        x = vc6Var13;
        vc6 vc6Var14 = new vc6("SYMBOLOGY_IDENTIFIER", 13);
        y = vc6Var14;
        z = new vc6[]{vc6Var, vc6Var2, vc6Var3, vc6Var4, vc6Var5, vc6Var6, vc6Var7, vc6Var8, vc6Var9, vc6Var10, vc6Var11, vc6Var12, vc6Var13, vc6Var14};
    }

    public static vc6 valueOf(String str) {
        return (vc6) Enum.valueOf(vc6.class, str);
    }

    public static vc6[] values() {
        return (vc6[]) z.clone();
    }
}
