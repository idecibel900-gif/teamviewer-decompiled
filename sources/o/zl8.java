package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public class zl8 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final rl8 f2716o;
    public static final tl8 p;
    public static final vl8 q;
    public static final /* synthetic */ zl8[] r;
    public final bm8 m;
    public final byte n;

    /* JADX INFO: Fake field, exist only in values array */
    zl8 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    zl8 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    zl8 EF2;

    static {
        zl8 zl8Var = new zl8("DOUBLE", 0, bm8.p, 1);
        zl8 zl8Var2 = new zl8("FLOAT", 1, bm8.f441o, 5);
        bm8 bm8Var = bm8.n;
        zl8 zl8Var3 = new zl8("INT64", 2, bm8Var, 0);
        zl8 zl8Var4 = new zl8("UINT64", 3, bm8Var, 0);
        bm8 bm8Var2 = bm8.m;
        zl8 zl8Var5 = new zl8("INT32", 4, bm8Var2, 0);
        zl8 zl8Var6 = new zl8("FIXED64", 5, bm8Var, 1);
        zl8 zl8Var7 = new zl8("FIXED32", 6, bm8Var2, 5);
        zl8 zl8Var8 = new zl8("BOOL", 7, bm8.q, 0);
        rl8 rl8Var = new rl8("STRING", 8, bm8.r, 2);
        f2716o = rl8Var;
        bm8 bm8Var3 = bm8.u;
        tl8 tl8Var = new tl8("GROUP", 9, bm8Var3, 3);
        p = tl8Var;
        vl8 vl8Var = new vl8("MESSAGE", 10, bm8Var3, 2);
        q = vl8Var;
        r = new zl8[]{zl8Var, zl8Var2, zl8Var3, zl8Var4, zl8Var5, zl8Var6, zl8Var7, zl8Var8, rl8Var, tl8Var, vl8Var, new xl8("BYTES", 11, bm8.s, 2), new zl8("UINT32", 12, bm8Var2, 0), new zl8("ENUM", 13, bm8.t, 0), new zl8("SFIXED32", 14, bm8Var2, 5), new zl8("SFIXED64", 15, bm8Var, 1), new zl8("SINT32", 16, bm8Var2, 0), new zl8("SINT64", 17, bm8Var, 0)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zl8(String str, int i, bm8 bm8Var, int i2) {
        super(str, i);
        this.m = bm8Var;
        this.n = i2;
    }

    public static zl8 valueOf(String str) {
        return (zl8) Enum.valueOf(zl8.class, str);
    }

    public static zl8[] values() {
        return (zl8[]) r.clone();
    }
}
