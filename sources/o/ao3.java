package o;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ao3 {
    public static final cp1 a;
    public static final cp1 b;
    public static final cp1 c;
    public static final HashMap d;

    static {
        yo3 yo3Var = yo3.p;
        cp1 cp1Var = new cp1(yo3Var, (byte) 9);
        a = cp1Var;
        ap3 ap3Var = ap3.p;
        cp1 cp1Var2 = new cp1(ap3Var, (byte) 10);
        b = cp1Var2;
        zo3 zo3Var = zo3.p;
        cp1 cp1Var3 = new cp1(zo3Var, (byte) 11);
        c = cp1Var3;
        HashMap map = new HashMap();
        d = map;
        map.put(yo3Var, cp1Var);
        map.put(ap3Var, cp1Var2);
        map.put(zo3Var, cp1Var3);
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i == 5 || i == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i != 5 && i != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(ki1 ki1Var, fi1 fi1Var) {
        if (ki1Var == null) {
            a(2);
            throw null;
        }
        if (fi1Var == null) {
            a(3);
            throw null;
        }
        ad5 ad5Var = (ad5) zo1.i(ki1Var, ad5.class, false);
        ad5 ad5Var2 = (ad5) zo1.i(fi1Var, ad5.class, false);
        return (ad5Var2 == null || ad5Var == null || !((bd5) ad5Var).q.equals(((bd5) ad5Var2).q)) ? false : true;
    }

    public static boolean c(v46 v46Var, ki1 ki1Var, fi1 fi1Var) {
        ki1 ki1VarT;
        if (fi1Var == null) {
            a(1);
            throw null;
        }
        if (ki1Var instanceof zi0) {
            ki1VarT = zo1.t((zi0) ki1Var);
        } else {
            int i = zo1.a;
            ki1VarT = ki1Var;
        }
        if (b(ki1VarT, fi1Var)) {
            return true;
        }
        return dp1.c.a(v46Var, ki1Var, fi1Var);
    }
}
