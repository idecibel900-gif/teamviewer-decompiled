package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class fj2 {
    public static final fj2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final fj2 f801o;
    public static final fj2[] p;
    public static final /* synthetic */ fj2[] q;
    public final byte m;

    /* JADX INFO: Fake field, exist only in values array */
    fj2 EF0;

    static {
        oo3 oo3Var = oo3.DOUBLE;
        fj2 fj2Var = new fj2("DOUBLE", 0, 0, 1, oo3Var);
        oo3 oo3Var2 = oo3.FLOAT;
        fj2 fj2Var2 = new fj2("FLOAT", 1, 1, 1, oo3Var2);
        oo3 oo3Var3 = oo3.LONG;
        fj2 fj2Var3 = new fj2("INT64", 2, 2, 1, oo3Var3);
        fj2 fj2Var4 = new fj2("UINT64", 3, 3, 1, oo3Var3);
        oo3 oo3Var4 = oo3.INT;
        fj2 fj2Var5 = new fj2("INT32", 4, 4, 1, oo3Var4);
        fj2 fj2Var6 = new fj2("FIXED64", 5, 5, 1, oo3Var3);
        fj2 fj2Var7 = new fj2("FIXED32", 6, 6, 1, oo3Var4);
        oo3 oo3Var5 = oo3.BOOLEAN;
        fj2 fj2Var8 = new fj2("BOOL", 7, 7, 1, oo3Var5);
        oo3 oo3Var6 = oo3.STRING;
        fj2 fj2Var9 = new fj2("STRING", 8, 8, 1, oo3Var6);
        oo3 oo3Var7 = oo3.MESSAGE;
        fj2 fj2Var10 = new fj2("MESSAGE", 9, 9, 1, oo3Var7);
        oo3 oo3Var8 = oo3.BYTE_STRING;
        fj2 fj2Var11 = new fj2("BYTES", 10, 10, 1, oo3Var8);
        fj2 fj2Var12 = new fj2("UINT32", 11, 11, 1, oo3Var4);
        oo3 oo3Var9 = oo3.ENUM;
        fj2 fj2Var13 = new fj2("ENUM", 12, 12, 1, oo3Var9);
        fj2 fj2Var14 = new fj2("SFIXED32", 13, 13, 1, oo3Var4);
        fj2 fj2Var15 = new fj2("SFIXED64", 14, 14, 1, oo3Var3);
        fj2 fj2Var16 = new fj2("SINT32", 15, 15, 1, oo3Var4);
        fj2 fj2Var17 = new fj2("SINT64", 16, 16, 1, oo3Var3);
        fj2 fj2Var18 = new fj2("GROUP", 17, 17, 1, oo3Var7);
        fj2 fj2Var19 = new fj2("DOUBLE_LIST", 18, 18, 2, oo3Var);
        fj2 fj2Var20 = new fj2("FLOAT_LIST", 19, 19, 2, oo3Var2);
        fj2 fj2Var21 = new fj2("INT64_LIST", 20, 20, 2, oo3Var3);
        fj2 fj2Var22 = new fj2("UINT64_LIST", 21, 21, 2, oo3Var3);
        fj2 fj2Var23 = new fj2("INT32_LIST", 22, 22, 2, oo3Var4);
        fj2 fj2Var24 = new fj2("FIXED64_LIST", 23, 23, 2, oo3Var3);
        fj2 fj2Var25 = new fj2("FIXED32_LIST", 24, 24, 2, oo3Var4);
        fj2 fj2Var26 = new fj2("BOOL_LIST", 25, 25, 2, oo3Var5);
        fj2 fj2Var27 = new fj2("STRING_LIST", 26, 26, 2, oo3Var6);
        fj2 fj2Var28 = new fj2("MESSAGE_LIST", 27, 27, 2, oo3Var7);
        fj2 fj2Var29 = new fj2("BYTES_LIST", 28, 28, 2, oo3Var8);
        fj2 fj2Var30 = new fj2("UINT32_LIST", 29, 29, 2, oo3Var4);
        fj2 fj2Var31 = new fj2("ENUM_LIST", 30, 30, 2, oo3Var9);
        fj2 fj2Var32 = new fj2("SFIXED32_LIST", 31, 31, 2, oo3Var4);
        fj2 fj2Var33 = new fj2("SFIXED64_LIST", 32, 32, 2, oo3Var3);
        fj2 fj2Var34 = new fj2("SINT32_LIST", 33, 33, 2, oo3Var4);
        fj2 fj2Var35 = new fj2("SINT64_LIST", 34, 34, 2, oo3Var3);
        fj2 fj2Var36 = new fj2("DOUBLE_LIST_PACKED", 35, 35, 3, oo3Var);
        n = fj2Var36;
        fj2 fj2Var37 = new fj2("FLOAT_LIST_PACKED", 36, 36, 3, oo3Var2);
        fj2 fj2Var38 = new fj2("INT64_LIST_PACKED", 37, 37, 3, oo3Var3);
        fj2 fj2Var39 = new fj2("UINT64_LIST_PACKED", 38, 38, 3, oo3Var3);
        fj2 fj2Var40 = new fj2("INT32_LIST_PACKED", 39, 39, 3, oo3Var4);
        fj2 fj2Var41 = new fj2("FIXED64_LIST_PACKED", 40, 40, 3, oo3Var3);
        fj2 fj2Var42 = new fj2("FIXED32_LIST_PACKED", 41, 41, 3, oo3Var4);
        fj2 fj2Var43 = new fj2("BOOL_LIST_PACKED", 42, 42, 3, oo3Var5);
        fj2 fj2Var44 = new fj2("UINT32_LIST_PACKED", 43, 43, 3, oo3Var4);
        fj2 fj2Var45 = new fj2("ENUM_LIST_PACKED", 44, 44, 3, oo3Var9);
        fj2 fj2Var46 = new fj2("SFIXED32_LIST_PACKED", 45, 45, 3, oo3Var4);
        fj2 fj2Var47 = new fj2("SFIXED64_LIST_PACKED", 46, 46, 3, oo3Var3);
        fj2 fj2Var48 = new fj2("SINT32_LIST_PACKED", 47, 47, 3, oo3Var4);
        fj2 fj2Var49 = new fj2("SINT64_LIST_PACKED", 48, 48, 3, oo3Var3);
        f801o = fj2Var49;
        q = new fj2[]{fj2Var, fj2Var2, fj2Var3, fj2Var4, fj2Var5, fj2Var6, fj2Var7, fj2Var8, fj2Var9, fj2Var10, fj2Var11, fj2Var12, fj2Var13, fj2Var14, fj2Var15, fj2Var16, fj2Var17, fj2Var18, fj2Var19, fj2Var20, fj2Var21, fj2Var22, fj2Var23, fj2Var24, fj2Var25, fj2Var26, fj2Var27, fj2Var28, fj2Var29, fj2Var30, fj2Var31, fj2Var32, fj2Var33, fj2Var34, fj2Var35, fj2Var36, fj2Var37, fj2Var38, fj2Var39, fj2Var40, fj2Var41, fj2Var42, fj2Var43, fj2Var44, fj2Var45, fj2Var46, fj2Var47, fj2Var48, fj2Var49, new fj2("GROUP_LIST", 49, 49, 2, oo3Var7), new fj2("MAP", 50, 50, 4, oo3.VOID)};
        fj2[] fj2VarArrValues = values();
        p = new fj2[fj2VarArrValues.length];
        for (fj2 fj2Var50 : fj2VarArrValues) {
            p[fj2Var50.m] = fj2Var50;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fj2(String str, int i, int i2, int i3, oo3 oo3Var) {
        super(str, i);
        this.m = i2;
        int iB = ua5.B(i3);
        if (iB == 1 || iB == 3) {
            Class cls = oo3Var.m;
        }
        if (i3 == 1) {
            oo3Var.ordinal();
        }
    }

    public static fj2 valueOf(String str) {
        return (fj2) Enum.valueOf(fj2.class, str);
    }

    public static fj2[] values() {
        return (fj2[]) q.clone();
    }
}
