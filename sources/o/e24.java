package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class e24 implements Function1 {
    public final /* synthetic */ byte m;
    public static final e24 n = new e24(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final e24 f672o = new e24(1);
    public static final e24 p = new e24(2);
    public static final e24 q = new e24(3);
    public static final e24 r = new e24(4);
    public static final e24 s = new e24(5);
    public static final e24 t = new e24(6);
    public static final e24 u = new e24(7);
    public static final e24 v = new e24(8);
    public static final e24 w = new e24(9);
    public static final e24 x = new e24(10);
    public static final e24 y = new e24(11);
    public static final e24 z = new e24(12);
    public static final e24 A = new e24(13);
    public static final e24 B = new e24(14);
    public static final e24 C = new e24(15);
    public static final e24 D = new e24(16);
    public static final e24 E = new e24(17);
    public static final e24 F = new e24(18);
    public static final e24 G = new e24(19);
    public static final e24 H = new e24(20);
    public static final e24 I = new e24(21);
    public static final e24 J = new e24(22);
    public static final e24 K = new e24(23);
    public static final e24 L = new e24(24);
    public static final e24 M = new e24(25);
    public static final e24 N = new e24(26);
    public static final e24 O = new e24(27);
    public static final e24 P = new e24(28);
    public static final e24 Q = new e24(29);

    public /* synthetic */ e24(byte b) {
        this.m = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        g07 g07VarW;
        m98 m98VarT;
        oz3 returnType;
        js0 js0VarF;
        oz3 returnType2;
        zi0 zi0VarB;
        String strF;
        boolean zB = false;
        v77 v77Var = null;
        switch (this.m) {
            case 0:
                i86 i86Var = (i86) obj;
                int i = g24.v;
                i86Var.getClass();
                return Boolean.valueOf(!Modifier.isStatic(i86Var.b().getModifiers()));
            case 1:
                c07 c07Var = (c07) obj;
                fw3[] fw3VarArr = s24.m;
                c07Var.getClass();
                return c07Var;
            case 2:
                i86 i86Var2 = (i86) obj;
                int i2 = u24.p;
                i86Var2.getClass();
                return Boolean.valueOf(Modifier.isStatic(i86Var2.b().getModifiers()));
            case 3:
                zo4 zo4Var = (zo4) obj;
                int i3 = u24.p;
                zo4Var.getClass();
                return zo4Var.f();
            case 4:
                int i4 = u24.p;
                ys0 ys0VarA = ((oz3) obj).o0().a();
                if (ys0VarA instanceof ns4) {
                    return (ns4) ys0VarA;
                }
                return null;
            case 5:
                z06 z06Var = z06.A;
                ((sy4) obj).getClass();
                return Boolean.TRUE;
            case 6:
                xw2 xw2Var = (xw2) obj;
                List list = wa5.a;
                xw2Var.getClass();
                List listJ = xw2Var.J();
                listJ.getClass();
                qb8 qb8Var = (qb8) lv0.w0(listJ);
                if (qb8Var == null || bp1.a(qb8Var) || qb8Var.v != null) {
                    return "last parameter should not have a default value or be a vararg";
                }
                return null;
            case 7:
                xw2 xw2Var2 = (xw2) obj;
                List list2 = wa5.a;
                xw2Var2.getClass();
                fi1 fi1VarI = xw2Var2.i();
                fi1VarI.getClass();
                if (fi1VarI instanceof ns4) {
                    sy4 sy4Var = wy3.e;
                    if (wy3.b((ns4) fi1VarI, s87.a)) {
                        return null;
                    }
                }
                Collection collectionJ = xw2Var2.j();
                collectionJ.getClass();
                Collection collection = collectionJ;
                if (!collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        fi1 fi1VarI2 = ((xw2) it.next()).i();
                        fi1VarI2.getClass();
                        if (fi1VarI2 instanceof ns4) {
                            sy4 sy4Var2 = wy3.e;
                            if (wy3.b((ns4) fi1VarI2, s87.a)) {
                                return null;
                            }
                        }
                    }
                }
                fi1 fi1VarI3 = xw2Var2.i();
                ns4 ns4Var = fi1VarI3 instanceof ns4 ? (ns4) fi1VarI3 : null;
                if (ns4Var != null) {
                    if (!pi3.e(ns4Var)) {
                        ns4Var = null;
                    }
                    if (ns4Var != null && (g07VarW = ns4Var.W()) != null && (m98VarT = n37.t(g07VarW)) != null && (returnType = xw2Var2.getReturnType()) != null && im3.n(((gi1) xw2Var2).getName(), xa5.d)) {
                        sy4 sy4Var3 = wy3.e;
                        if ((wy3.B(returnType, s87.h) || wy3.E(returnType)) && xw2Var2.J().size() == 1) {
                            oz3 type = ((qb8) xw2Var2.J().get(0)).getType();
                            type.getClass();
                            if (im3.n(n37.t(type), m98VarT) && xw2Var2.X().isEmpty() && xw2Var2.S() == null) {
                                return null;
                            }
                        }
                    }
                }
                StringBuilder sb = new StringBuilder("must override ''equals()'' in Any");
                fi1 fi1VarI4 = xw2Var2.i();
                fi1VarI4.getClass();
                if (pi3.e(fi1VarI4)) {
                    qo1 qo1Var = qo1.d;
                    fi1 fi1VarI5 = xw2Var2.i();
                    fi1VarI5.getClass();
                    g07 g07VarW2 = ((ns4) fi1VarI5).W();
                    g07VarW2.getClass();
                    sb.append(" or define ''equals(other: " + qo1Var.X(n37.t(g07VarW2)) + "): Boolean''");
                }
                return sb.toString();
            case 8:
                xw2 xw2Var3 = (xw2) obj;
                List list3 = wa5.a;
                xw2Var3.getClass();
                v14 v14VarO = xw2Var3.O();
                if (v14VarO == null) {
                    v14VarO = xw2Var3.S();
                }
                if (v14VarO != null) {
                    oz3 returnType3 = xw2Var3.getReturnType();
                    if (returnType3 != null ? qz3.a.b(returnType3, v14VarO.getType()) : false) {
                        return null;
                    }
                    v46 v46VarD0 = v14VarO.D0();
                    v46VarD0.getClass();
                    if (v46VarD0 instanceof ff3) {
                        ns4 ns4Var2 = ((ff3) v46VarD0).m;
                        if (ns4Var2.A() && (js0VarF = bp1.f(ns4Var2)) != null) {
                            ps4 ps4VarD = zo1.d(ns4Var2);
                            ps4VarD.getClass();
                            ys0 ys0VarR = vs1.r(ps4VarD, js0VarF);
                            eq1 eq1Var = ys0VarR instanceof eq1 ? (eq1) ys0VarR : null;
                            if (eq1Var != null && (returnType2 = xw2Var3.getReturnType()) != null) {
                                zB = qz3.a.b(returnType2, eq1Var.E0());
                            }
                        }
                    }
                    if (zB) {
                        return null;
                    }
                }
                return "receiver must be a supertype of the return type";
            case ep1.b /* 9 */:
                ad5 ad5Var = (ad5) obj;
                ad5Var.getClass();
                return ((bd5) ad5Var).q;
            case ep1.c /* 10 */:
                String str = (String) obj;
                str.getClass();
                return "(raw) ".concat(str);
            case 11:
                ParameterizedType parameterizedType = (ParameterizedType) obj;
                List list4 = p76.a;
                parameterizedType.getClass();
                Type ownerType = parameterizedType.getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    return (ParameterizedType) ownerType;
                }
                return null;
            case ep1.d /* 12 */:
                ParameterizedType parameterizedType2 = (ParameterizedType) obj;
                List list5 = p76.a;
                parameterizedType2.getClass();
                Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
                actualTypeArguments.getClass();
                return cx.A0(actualTypeArguments);
            case 13:
                return Boolean.valueOf(((Class) obj).getSimpleName().length() == 0);
            case 14:
                String simpleName = ((Class) obj).getSimpleName();
                if (!sy4.f(simpleName)) {
                    simpleName = null;
                }
                if (simpleName != null) {
                    return sy4.e(simpleName);
                }
                return null;
            case 15:
                qo1 qo1Var2 = z86.a;
                oz3 type2 = ((qb8) obj).getType();
                type2.getClass();
                return z86.a.X(type2);
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                qo1 qo1Var3 = z86.a;
                oz3 type3 = ((qb8) obj).getType();
                type3.getClass();
                return z86.a.X(type3);
            case 17:
                wy3 wy3Var = (wy3) obj;
                ed6 ed6Var = ed6.c;
                wy3Var.getClass();
                return wy3Var.s(ps5.BOOLEAN);
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                wy3 wy3Var2 = (wy3) obj;
                fd6 fd6Var = fd6.c;
                wy3Var2.getClass();
                return wy3Var2.s(ps5.INT);
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                wy3 wy3Var3 = (wy3) obj;
                gd6 gd6Var = gd6.c;
                wy3Var3.getClass();
                return wy3Var3.w();
            case 20:
                Class cls = (Class) obj;
                cls.getClass();
                return p76.b(cls);
            case 21:
                if (im3.n(obj, Boolean.FALSE)) {
                    return new rv0(rv0.h);
                }
                obj.getClass();
                return new rv0(j51.i(((Integer) obj).intValue()));
            case 22:
                String str2 = (String) obj;
                str2.getClass();
                return str2.length() > 1 ? to7.i(';', "L", str2) : str2;
            case 23:
                zi0 zi0Var = (zi0) obj;
                zi0Var.getClass();
                v14 v14VarS = zi0Var.S();
                v14VarS.getClass();
                return v14VarS.getType();
            case 24:
                zi0 zi0Var2 = (zi0) obj;
                zi0Var2.getClass();
                oz3 returnType4 = zi0Var2.getReturnType();
                returnType4.getClass();
                return returnType4;
            case 25:
                m98 m98Var = (m98) obj;
                m98Var.getClass();
                return Boolean.valueOf(m98Var instanceof y06);
            case 26:
                ys0 ys0VarA2 = ((m98) obj).o0().a();
                if (ys0VarA2 == null) {
                    return Boolean.FALSE;
                }
                sy4 name = ys0VarA2.getName();
                ht2 ht2Var = mo3.f;
                if (im3.n(name, ht2Var.f()) && im3.n(bp1.c(ys0VarA2), ht2Var)) {
                    zB = true;
                }
                return Boolean.valueOf(zB);
            case 27:
                zi0 zi0Var3 = (zi0) obj;
                zi0Var3.getClass();
                return Boolean.valueOf(e8.o(bp1.i(zi0Var3)));
            case 28:
                zi0 zi0Var4 = (zi0) obj;
                zi0Var4.getClass();
                int i5 = hg0.l;
                c07 c07Var2 = (c07) zi0Var4;
                if (wy3.z(c07Var2) && bp1.b(c07Var2, new t(c07Var2, (byte) 11)) != null) {
                    zB = true;
                }
                return Boolean.valueOf(zB);
            default:
                zi0 zi0Var5 = (zi0) obj;
                zi0Var5.getClass();
                if (wy3.z(zi0Var5)) {
                    int i6 = ig0.l;
                    if (y77.e.contains(zi0Var5.getName()) && (zi0VarB = bp1.b(zi0Var5, ek.q)) != null && (strF = io1.F(zi0VarB)) != null) {
                        if (y77.b.contains(strF)) {
                            v77Var = v77.m;
                        } else {
                            v77Var = ((x77) xm4.P(strF, y77.d)) == x77.n ? v77.f2283o : v77.n;
                        }
                    }
                    if (v77Var != null) {
                        zB = true;
                    }
                }
                return Boolean.valueOf(zB);
        }
    }
}
