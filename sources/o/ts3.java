package o;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public enum ts3 {
    BOOLEAN(ps5.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(ps5.CHAR, "char", "C", "java.lang.Character"),
    BYTE(ps5.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(ps5.SHORT, "short", "S", "java.lang.Short"),
    INT(ps5.INT, "int", "I", "java.lang.Integer"),
    FLOAT(ps5.FLOAT, "float", "F", "java.lang.Float"),
    LONG(ps5.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(ps5.DOUBLE, "double", "D", "java.lang.Double");

    public final ps5 m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f2139o;
    public final ht2 p;
    public static final HashMap y = new HashMap();
    public static final EnumMap z = new EnumMap(ps5.class);
    public static final HashMap A = new HashMap();
    public static final HashSet B = new HashSet();
    public static final HashMap C = new HashMap();

    static {
        for (ts3 ts3Var : values()) {
            HashMap map = y;
            String str = ts3Var.n;
            String str2 = ts3Var.f2139o;
            map.put(str, ts3Var);
            z.put(ts3Var.c(), ts3Var);
            A.put(str2, ts3Var);
            String strReplace = ts3Var.p.b().replace('.', '/');
            B.add(strReplace);
            C.put(strReplace, fx3.h("(", str2, ")L", strReplace, ";"));
        }
    }

    ts3(ps5 ps5Var, String str, String str2, String str3) {
        if (ps5Var == null) {
            a(8);
            throw null;
        }
        this.m = ps5Var;
        this.n = str;
        this.f2139o = str2;
        this.p = new ht2(str3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 4 && i != 6) {
            switch (i) {
                case ep1.d /* 12 */:
                case 13:
                case 14:
                case 15:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 4 && i != 6) {
            switch (i) {
                case ep1.d /* 12 */:
                case 13:
                case 14:
                case 15:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "methodDescriptor";
                break;
            case 3:
            case ep1.b /* 9 */:
                objArr[0] = "name";
                break;
            case 4:
            case 6:
            case ep1.d /* 12 */:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                break;
            case 5:
                objArr[0] = "type";
                break;
            case 7:
            case ep1.c /* 10 */:
                objArr[0] = "desc";
                break;
            case 8:
                objArr[0] = "primitiveType";
                break;
            case 11:
                objArr[0] = "wrapperClassName";
                break;
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i != 4 && i != 6) {
            switch (i) {
                case ep1.d /* 12 */:
                    objArr[1] = "getPrimitiveType";
                    break;
                case 13:
                    objArr[1] = "getJavaKeywordName";
                    break;
                case 14:
                    objArr[1] = "getDesc";
                    break;
                case 15:
                    objArr[1] = "getWrapperFqName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                    break;
            }
        } else {
            objArr[1] = "get";
        }
        switch (i) {
            case 1:
            case 2:
                objArr[2] = "isBoxingMethodDescriptor";
                break;
            case 3:
            case 5:
                objArr[2] = "get";
                break;
            case 4:
            case 6:
            case ep1.d /* 12 */:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "getByDesc";
                break;
            case 8:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case 11:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "isWrapperClassInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 6) {
            switch (i) {
                case ep1.d /* 12 */:
                case 13:
                case 14:
                case 15:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static ts3 b(String str) {
        ts3 ts3Var = (ts3) y.get(str);
        if (ts3Var != null) {
            return ts3Var;
        }
        throw new AssertionError("Non-primitive type name passed: ".concat(str));
    }

    public final ps5 c() {
        ps5 ps5Var = this.m;
        if (ps5Var != null) {
            return ps5Var;
        }
        a(12);
        throw null;
    }
}
