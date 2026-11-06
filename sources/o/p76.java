package o;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p76 {
    public static final List a;
    public static final Map b;
    public static final Map c;
    public static final Map d;

    static {
        x86 x86Var = w86.a;
        int i = 0;
        List<wt3> listL = qf0.L(x86Var.b(Boolean.TYPE), x86Var.b(Byte.TYPE), x86Var.b(Character.TYPE), x86Var.b(Double.TYPE), x86Var.b(Float.TYPE), x86Var.b(Integer.TYPE), x86Var.b(Long.TYPE), x86Var.b(Short.TYPE));
        a = listL;
        ArrayList arrayList = new ArrayList(mv0.Z(listL, 10));
        for (wt3 wt3Var : listL) {
            arrayList.add(new vd5(et1.A(wt3Var), et1.B(wt3Var)));
        }
        b = xm4.U(arrayList);
        List<wt3> list = a;
        ArrayList arrayList2 = new ArrayList(mv0.Z(list, 10));
        for (wt3 wt3Var2 : list) {
            arrayList2.add(new vd5(et1.B(wt3Var2), et1.A(wt3Var2)));
        }
        c = xm4.U(arrayList2);
        List listL2 = qf0.L(Function0.class, Function1.class, hw2.class, iw2.class, jw2.class, kw2.class, lw2.class, mw2.class, nw2.class, ow2.class, uv2.class, vv2.class, wv2.class, xv2.class, yv2.class, zv2.class, aw2.class, bw2.class, cw2.class, dw2.class, ew2.class, fw2.class, gw2.class);
        ArrayList arrayList3 = new ArrayList(mv0.Z(listL2, 10));
        for (Object obj : listL2) {
            int i2 = i + 1;
            if (i < 0) {
                qf0.U();
                throw null;
            }
            arrayList3.add(new vd5((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        d = xm4.U(arrayList3);
    }

    public static final js0 a(Class cls) {
        cls.getClass();
        if (cls.isPrimitive()) {
            an4.i(cls, "Can't compute ClassId for primitive type: ");
            return null;
        }
        if (cls.isArray()) {
            an4.i(cls, "Can't compute ClassId for array type: ");
            return null;
        }
        if (cls.getEnclosingMethod() != null || cls.getEnclosingConstructor() != null || cls.getSimpleName().length() == 0) {
            ht2 ht2Var = new ht2(cls.getName());
            return new js0(ht2Var.e(), ht2.j(ht2Var.f()), true);
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            return a(declaringClass).d(sy4.e(cls.getSimpleName()));
        }
        ht2 ht2Var2 = new ht2(cls.getName());
        ht2 ht2VarE = ht2Var2.e();
        sy4 sy4VarF = ht2Var2.f();
        sy4VarF.getClass();
        return new js0(ht2VarE, sy4VarF);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String b(Class cls) {
        cls.getClass();
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                String strReplace = cls.getName().replace('.', '/');
                strReplace.getClass();
                return strReplace;
            }
            StringBuilder sb = new StringBuilder("L");
            String strReplace2 = cls.getName().replace('.', '/');
            strReplace2.getClass();
            sb.append(strReplace2);
            sb.append(';');
            return sb.toString();
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return "S";
                }
                break;
        }
        an4.i(cls, "Unsupported primitive type: ");
        return null;
    }

    public static final List c(Type type) {
        type.getClass();
        if (!(type instanceof ParameterizedType)) {
            return ea2.m;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return bq6.l0(new km2(bq6.h0(type, e24.y), e24.z, eq6.n));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        actualTypeArguments.getClass();
        return cx.g1(actualTypeArguments);
    }

    public static final ClassLoader d(Class cls) {
        cls.getClass();
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        systemClassLoader.getClass();
        return systemClassLoader;
    }
}
