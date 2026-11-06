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
/* JADX INFO: loaded from: classes2.dex */
public class yl8 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final yl8 f2620o;
    public static final yl8 p;
    public static final sl8 q;
    public static final ul8 r;
    public static final yl8 s;
    public static final /* synthetic */ yl8[] t;
    public final am8 m;
    public final byte n;

    /* JADX INFO: Fake field, exist only in values array */
    yl8 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    yl8 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    yl8 EF2;

    static {
        yl8 yl8Var = new yl8("DOUBLE", 0, am8.q, 1);
        yl8 yl8Var2 = new yl8("FLOAT", 1, am8.p, 5);
        am8 am8Var = am8.f339o;
        yl8 yl8Var3 = new yl8("INT64", 2, am8Var, 0);
        yl8 yl8Var4 = new yl8("UINT64", 3, am8Var, 0);
        am8 am8Var2 = am8.n;
        yl8 yl8Var5 = new yl8("INT32", 4, am8Var2, 0);
        f2620o = yl8Var5;
        yl8 yl8Var6 = new yl8("FIXED64", 5, am8Var, 1);
        yl8 yl8Var7 = new yl8("FIXED32", 6, am8Var2, 5);
        yl8 yl8Var8 = new yl8("BOOL", 7, am8.r, 0);
        p = yl8Var8;
        ql8 ql8Var = new ql8("STRING", 8, am8.s, 2);
        am8 am8Var3 = am8.v;
        sl8 sl8Var = new sl8("GROUP", 9, am8Var3, 3);
        q = sl8Var;
        ul8 ul8Var = new ul8("MESSAGE", 10, am8Var3, 2);
        r = ul8Var;
        wl8 wl8Var = new wl8("BYTES", 11, am8.t, 2);
        yl8 yl8Var9 = new yl8("UINT32", 12, am8Var2, 0);
        yl8 yl8Var10 = new yl8("ENUM", 13, am8.u, 0);
        s = yl8Var10;
        t = new yl8[]{yl8Var, yl8Var2, yl8Var3, yl8Var4, yl8Var5, yl8Var6, yl8Var7, yl8Var8, ql8Var, sl8Var, ul8Var, wl8Var, yl8Var9, yl8Var10, new yl8("SFIXED32", 14, am8Var2, 5), new yl8("SFIXED64", 15, am8Var, 1), new yl8("SINT32", 16, am8Var2, 0), new yl8("SINT64", 17, am8Var, 0)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public yl8(String str, int i, am8 am8Var, int i2) {
        super(str, i);
        this.m = am8Var;
        this.n = i2;
    }

    public static yl8 valueOf(String str) {
        return (yl8) Enum.valueOf(yl8.class, str);
    }

    public static yl8[] values() {
        return (yl8[]) t.clone();
    }

    public boolean a() {
        return !(this instanceof ql8);
    }
}
