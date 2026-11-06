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
public final class tu8 {
    public static final tu8 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final tu8 f2146o;
    public static final tu8[] p;
    public static final /* synthetic */ tu8[] q;
    public final byte m;

    /* JADX INFO: Fake field, exist only in values array */
    tu8 EF0;

    static {
        fv8 fv8Var = fv8.DOUBLE;
        tu8 tu8Var = new tu8("DOUBLE", 0, 0, 1, fv8Var);
        fv8 fv8Var2 = fv8.FLOAT;
        tu8 tu8Var2 = new tu8("FLOAT", 1, 1, 1, fv8Var2);
        fv8 fv8Var3 = fv8.LONG;
        tu8 tu8Var3 = new tu8("INT64", 2, 2, 1, fv8Var3);
        tu8 tu8Var4 = new tu8("UINT64", 3, 3, 1, fv8Var3);
        fv8 fv8Var4 = fv8.INT;
        tu8 tu8Var5 = new tu8("INT32", 4, 4, 1, fv8Var4);
        tu8 tu8Var6 = new tu8("FIXED64", 5, 5, 1, fv8Var3);
        tu8 tu8Var7 = new tu8("FIXED32", 6, 6, 1, fv8Var4);
        fv8 fv8Var5 = fv8.BOOLEAN;
        tu8 tu8Var8 = new tu8("BOOL", 7, 7, 1, fv8Var5);
        fv8 fv8Var6 = fv8.STRING;
        tu8 tu8Var9 = new tu8("STRING", 8, 8, 1, fv8Var6);
        fv8 fv8Var7 = fv8.MESSAGE;
        tu8 tu8Var10 = new tu8("MESSAGE", 9, 9, 1, fv8Var7);
        fv8 fv8Var8 = fv8.BYTE_STRING;
        tu8 tu8Var11 = new tu8("BYTES", 10, 10, 1, fv8Var8);
        tu8 tu8Var12 = new tu8("UINT32", 11, 11, 1, fv8Var4);
        fv8 fv8Var9 = fv8.ENUM;
        tu8 tu8Var13 = new tu8("ENUM", 12, 12, 1, fv8Var9);
        tu8 tu8Var14 = new tu8("SFIXED32", 13, 13, 1, fv8Var4);
        tu8 tu8Var15 = new tu8("SFIXED64", 14, 14, 1, fv8Var3);
        tu8 tu8Var16 = new tu8("SINT32", 15, 15, 1, fv8Var4);
        tu8 tu8Var17 = new tu8("SINT64", 16, 16, 1, fv8Var3);
        tu8 tu8Var18 = new tu8("GROUP", 17, 17, 1, fv8Var7);
        tu8 tu8Var19 = new tu8("DOUBLE_LIST", 18, 18, 2, fv8Var);
        tu8 tu8Var20 = new tu8("FLOAT_LIST", 19, 19, 2, fv8Var2);
        tu8 tu8Var21 = new tu8("INT64_LIST", 20, 20, 2, fv8Var3);
        tu8 tu8Var22 = new tu8("UINT64_LIST", 21, 21, 2, fv8Var3);
        tu8 tu8Var23 = new tu8("INT32_LIST", 22, 22, 2, fv8Var4);
        tu8 tu8Var24 = new tu8("FIXED64_LIST", 23, 23, 2, fv8Var3);
        tu8 tu8Var25 = new tu8("FIXED32_LIST", 24, 24, 2, fv8Var4);
        tu8 tu8Var26 = new tu8("BOOL_LIST", 25, 25, 2, fv8Var5);
        tu8 tu8Var27 = new tu8("STRING_LIST", 26, 26, 2, fv8Var6);
        tu8 tu8Var28 = new tu8("MESSAGE_LIST", 27, 27, 2, fv8Var7);
        tu8 tu8Var29 = new tu8("BYTES_LIST", 28, 28, 2, fv8Var8);
        tu8 tu8Var30 = new tu8("UINT32_LIST", 29, 29, 2, fv8Var4);
        tu8 tu8Var31 = new tu8("ENUM_LIST", 30, 30, 2, fv8Var9);
        tu8 tu8Var32 = new tu8("SFIXED32_LIST", 31, 31, 2, fv8Var4);
        tu8 tu8Var33 = new tu8("SFIXED64_LIST", 32, 32, 2, fv8Var3);
        tu8 tu8Var34 = new tu8("SINT32_LIST", 33, 33, 2, fv8Var4);
        tu8 tu8Var35 = new tu8("SINT64_LIST", 34, 34, 2, fv8Var3);
        tu8 tu8Var36 = new tu8("DOUBLE_LIST_PACKED", 35, 35, 3, fv8Var);
        n = tu8Var36;
        tu8 tu8Var37 = new tu8("FLOAT_LIST_PACKED", 36, 36, 3, fv8Var2);
        tu8 tu8Var38 = new tu8("INT64_LIST_PACKED", 37, 37, 3, fv8Var3);
        tu8 tu8Var39 = new tu8("UINT64_LIST_PACKED", 38, 38, 3, fv8Var3);
        tu8 tu8Var40 = new tu8("INT32_LIST_PACKED", 39, 39, 3, fv8Var4);
        tu8 tu8Var41 = new tu8("FIXED64_LIST_PACKED", 40, 40, 3, fv8Var3);
        tu8 tu8Var42 = new tu8("FIXED32_LIST_PACKED", 41, 41, 3, fv8Var4);
        tu8 tu8Var43 = new tu8("BOOL_LIST_PACKED", 42, 42, 3, fv8Var5);
        tu8 tu8Var44 = new tu8("UINT32_LIST_PACKED", 43, 43, 3, fv8Var4);
        tu8 tu8Var45 = new tu8("ENUM_LIST_PACKED", 44, 44, 3, fv8Var9);
        tu8 tu8Var46 = new tu8("SFIXED32_LIST_PACKED", 45, 45, 3, fv8Var4);
        tu8 tu8Var47 = new tu8("SFIXED64_LIST_PACKED", 46, 46, 3, fv8Var3);
        tu8 tu8Var48 = new tu8("SINT32_LIST_PACKED", 47, 47, 3, fv8Var4);
        tu8 tu8Var49 = new tu8("SINT64_LIST_PACKED", 48, 48, 3, fv8Var3);
        f2146o = tu8Var49;
        q = new tu8[]{tu8Var, tu8Var2, tu8Var3, tu8Var4, tu8Var5, tu8Var6, tu8Var7, tu8Var8, tu8Var9, tu8Var10, tu8Var11, tu8Var12, tu8Var13, tu8Var14, tu8Var15, tu8Var16, tu8Var17, tu8Var18, tu8Var19, tu8Var20, tu8Var21, tu8Var22, tu8Var23, tu8Var24, tu8Var25, tu8Var26, tu8Var27, tu8Var28, tu8Var29, tu8Var30, tu8Var31, tu8Var32, tu8Var33, tu8Var34, tu8Var35, tu8Var36, tu8Var37, tu8Var38, tu8Var39, tu8Var40, tu8Var41, tu8Var42, tu8Var43, tu8Var44, tu8Var45, tu8Var46, tu8Var47, tu8Var48, tu8Var49, new tu8("GROUP_LIST", 49, 49, 2, fv8Var7), new tu8("MAP", 50, 50, 4, fv8.VOID)};
        tu8[] tu8VarArrValues = values();
        p = new tu8[tu8VarArrValues.length];
        for (tu8 tu8Var50 : tu8VarArrValues) {
            p[tu8Var50.m] = tu8Var50;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public tu8(String str, int i, int i2, int i3, fv8 fv8Var) {
        super(str, i);
        this.m = i2;
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            Class cls = fv8Var.m;
        }
        if (i3 == 1) {
            fv8 fv8Var2 = fv8.VOID;
            fv8Var.ordinal();
        }
    }

    public static tu8[] values() {
        return (tu8[]) q.clone();
    }
}
