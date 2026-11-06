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
public final class ej2 {
    public static final ej2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ej2 f719o;
    public static final ej2[] p;
    public static final /* synthetic */ ej2[] q;
    public final byte m;

    /* JADX INFO: Fake field, exist only in values array */
    ej2 EF0;

    static {
        no3 no3Var = no3.DOUBLE;
        ej2 ej2Var = new ej2("DOUBLE", 0, 0, 1, no3Var);
        no3 no3Var2 = no3.FLOAT;
        ej2 ej2Var2 = new ej2("FLOAT", 1, 1, 1, no3Var2);
        no3 no3Var3 = no3.LONG;
        ej2 ej2Var3 = new ej2("INT64", 2, 2, 1, no3Var3);
        ej2 ej2Var4 = new ej2("UINT64", 3, 3, 1, no3Var3);
        no3 no3Var4 = no3.INT;
        ej2 ej2Var5 = new ej2("INT32", 4, 4, 1, no3Var4);
        ej2 ej2Var6 = new ej2("FIXED64", 5, 5, 1, no3Var3);
        ej2 ej2Var7 = new ej2("FIXED32", 6, 6, 1, no3Var4);
        no3 no3Var5 = no3.BOOLEAN;
        ej2 ej2Var8 = new ej2("BOOL", 7, 7, 1, no3Var5);
        no3 no3Var6 = no3.STRING;
        ej2 ej2Var9 = new ej2("STRING", 8, 8, 1, no3Var6);
        no3 no3Var7 = no3.MESSAGE;
        ej2 ej2Var10 = new ej2("MESSAGE", 9, 9, 1, no3Var7);
        no3 no3Var8 = no3.BYTE_STRING;
        ej2 ej2Var11 = new ej2("BYTES", 10, 10, 1, no3Var8);
        ej2 ej2Var12 = new ej2("UINT32", 11, 11, 1, no3Var4);
        no3 no3Var9 = no3.ENUM;
        ej2 ej2Var13 = new ej2("ENUM", 12, 12, 1, no3Var9);
        ej2 ej2Var14 = new ej2("SFIXED32", 13, 13, 1, no3Var4);
        ej2 ej2Var15 = new ej2("SFIXED64", 14, 14, 1, no3Var3);
        ej2 ej2Var16 = new ej2("SINT32", 15, 15, 1, no3Var4);
        ej2 ej2Var17 = new ej2("SINT64", 16, 16, 1, no3Var3);
        ej2 ej2Var18 = new ej2("GROUP", 17, 17, 1, no3Var7);
        ej2 ej2Var19 = new ej2("DOUBLE_LIST", 18, 18, 2, no3Var);
        ej2 ej2Var20 = new ej2("FLOAT_LIST", 19, 19, 2, no3Var2);
        ej2 ej2Var21 = new ej2("INT64_LIST", 20, 20, 2, no3Var3);
        ej2 ej2Var22 = new ej2("UINT64_LIST", 21, 21, 2, no3Var3);
        ej2 ej2Var23 = new ej2("INT32_LIST", 22, 22, 2, no3Var4);
        ej2 ej2Var24 = new ej2("FIXED64_LIST", 23, 23, 2, no3Var3);
        ej2 ej2Var25 = new ej2("FIXED32_LIST", 24, 24, 2, no3Var4);
        ej2 ej2Var26 = new ej2("BOOL_LIST", 25, 25, 2, no3Var5);
        ej2 ej2Var27 = new ej2("STRING_LIST", 26, 26, 2, no3Var6);
        ej2 ej2Var28 = new ej2("MESSAGE_LIST", 27, 27, 2, no3Var7);
        ej2 ej2Var29 = new ej2("BYTES_LIST", 28, 28, 2, no3Var8);
        ej2 ej2Var30 = new ej2("UINT32_LIST", 29, 29, 2, no3Var4);
        ej2 ej2Var31 = new ej2("ENUM_LIST", 30, 30, 2, no3Var9);
        ej2 ej2Var32 = new ej2("SFIXED32_LIST", 31, 31, 2, no3Var4);
        ej2 ej2Var33 = new ej2("SFIXED64_LIST", 32, 32, 2, no3Var3);
        ej2 ej2Var34 = new ej2("SINT32_LIST", 33, 33, 2, no3Var4);
        ej2 ej2Var35 = new ej2("SINT64_LIST", 34, 34, 2, no3Var3);
        ej2 ej2Var36 = new ej2("DOUBLE_LIST_PACKED", 35, 35, 3, no3Var);
        n = ej2Var36;
        ej2 ej2Var37 = new ej2("FLOAT_LIST_PACKED", 36, 36, 3, no3Var2);
        ej2 ej2Var38 = new ej2("INT64_LIST_PACKED", 37, 37, 3, no3Var3);
        ej2 ej2Var39 = new ej2("UINT64_LIST_PACKED", 38, 38, 3, no3Var3);
        ej2 ej2Var40 = new ej2("INT32_LIST_PACKED", 39, 39, 3, no3Var4);
        ej2 ej2Var41 = new ej2("FIXED64_LIST_PACKED", 40, 40, 3, no3Var3);
        ej2 ej2Var42 = new ej2("FIXED32_LIST_PACKED", 41, 41, 3, no3Var4);
        ej2 ej2Var43 = new ej2("BOOL_LIST_PACKED", 42, 42, 3, no3Var5);
        ej2 ej2Var44 = new ej2("UINT32_LIST_PACKED", 43, 43, 3, no3Var4);
        ej2 ej2Var45 = new ej2("ENUM_LIST_PACKED", 44, 44, 3, no3Var9);
        ej2 ej2Var46 = new ej2("SFIXED32_LIST_PACKED", 45, 45, 3, no3Var4);
        ej2 ej2Var47 = new ej2("SFIXED64_LIST_PACKED", 46, 46, 3, no3Var3);
        ej2 ej2Var48 = new ej2("SINT32_LIST_PACKED", 47, 47, 3, no3Var4);
        ej2 ej2Var49 = new ej2("SINT64_LIST_PACKED", 48, 48, 3, no3Var3);
        f719o = ej2Var49;
        q = new ej2[]{ej2Var, ej2Var2, ej2Var3, ej2Var4, ej2Var5, ej2Var6, ej2Var7, ej2Var8, ej2Var9, ej2Var10, ej2Var11, ej2Var12, ej2Var13, ej2Var14, ej2Var15, ej2Var16, ej2Var17, ej2Var18, ej2Var19, ej2Var20, ej2Var21, ej2Var22, ej2Var23, ej2Var24, ej2Var25, ej2Var26, ej2Var27, ej2Var28, ej2Var29, ej2Var30, ej2Var31, ej2Var32, ej2Var33, ej2Var34, ej2Var35, ej2Var36, ej2Var37, ej2Var38, ej2Var39, ej2Var40, ej2Var41, ej2Var42, ej2Var43, ej2Var44, ej2Var45, ej2Var46, ej2Var47, ej2Var48, ej2Var49, new ej2("GROUP_LIST", 49, 49, 2, no3Var7), new ej2("MAP", 50, 50, 4, no3.VOID)};
        ej2[] ej2VarArrValues = values();
        p = new ej2[ej2VarArrValues.length];
        for (ej2 ej2Var50 : ej2VarArrValues) {
            p[ej2Var50.m] = ej2Var50;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ej2(String str, int i, int i2, int i3, no3 no3Var) {
        super(str, i);
        this.m = i2;
        int iB = ua5.B(i3);
        if (iB == 1 || iB == 3) {
            Class cls = no3Var.m;
        }
        if (i3 == 1) {
            no3Var.ordinal();
        }
    }

    public static ej2 valueOf(String str) {
        return (ej2) Enum.valueOf(ej2.class, str);
    }

    public static ej2[] values() {
        return (ej2[]) q.clone();
    }
}
