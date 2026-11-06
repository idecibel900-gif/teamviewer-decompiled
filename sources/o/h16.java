package o;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class h16 implements Function1 {
    public final /* synthetic */ byte m;
    public Object n;

    public /* synthetic */ h16(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0150  */
    /* JADX WARN: Code duplicated, block: B:71:0x0172  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zEquals;
        h58 h58VarD;
        byte b = this.m;
        boolean z = true;
        z = true;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ((g16) this.n).a();
                return f88Var;
            case 1:
                ((c7) this.n).a();
                return f88Var;
            case 2:
                ((v16) this.n).a();
                return f88Var;
            case 3:
                ((v16) this.n).a();
                return f88Var;
            case 4:
                a86 a86Var = (a86) this.n;
                Method method = (Method) obj;
                if (method.isSynthetic()) {
                    z = false;
                } else if (a86Var.a.isEnum()) {
                    String name = method.getName();
                    if (im3.n(name, "values")) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        parameterTypes.getClass();
                        if (parameterTypes.length == 0) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    } else if (im3.n(name, "valueOf")) {
                        zEquals = Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
                    } else {
                        zEquals = false;
                    }
                    if (zEquals) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 5:
                ((c7) this.n).a();
                return f88Var;
            case 6:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                qn5 qn5Var = (qn5) this.n;
                if (qn5Var != null) {
                    qn5Var.d = zBooleanValue;
                }
                return f88Var;
            case 7:
                ((c7) this.n).a();
                return f88Var;
            case 8:
                ((c7) this.n).a();
                return f88Var;
            case ep1.b /* 9 */:
                ((c7) this.n).a();
                return f88Var;
            case ep1.c /* 10 */:
                qb8 qb8Var = (qb8) this.n;
                zi0 zi0Var = (zi0) obj;
                zi0Var.getClass();
                oz3 type = ((qb8) zi0Var.J().get(qb8Var.r)).getType();
                type.getClass();
                return type;
            case 11:
                Throwable th = (Throwable) obj;
                ug7 ug7Var = (ug7) this.n;
                gl0 gl0Var = ug7Var.f2213o;
                if (gl0Var != null) {
                    gl0Var.f(th);
                }
                ug7Var.f2213o = null;
                return f88Var;
            case ep1.d /* 12 */:
                float[] fArr = ((wn4) obj).a;
                i04 i04Var = (i04) this.n;
                if (i04Var.m()) {
                    vt1.s(i04Var).T(i04Var, fArr);
                }
                return f88Var;
            case 13:
                lh7 lh7Var = (lh7) this.n;
                g58 g58Var = (g58) obj;
                d58 d58Var = g58Var.a;
                po3 po3Var = g58Var.b;
                Set set = po3Var.e;
                if (set != null && set.contains(d58Var.a())) {
                    return lh7Var.p(po3Var);
                }
                g07 g07VarW = d58Var.W();
                g07VarW.getClass();
                LinkedHashSet<d58> linkedHashSet = new LinkedHashSet();
                n37.l(g07VarW, g07VarW, linkedHashSet, set);
                int iQ = xm4.Q(mv0.Z(linkedHashSet, 10));
                if (iQ < 16) {
                    iQ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iQ);
                for (d58 d58Var2 : linkedHashSet) {
                    if (set == null || !set.contains(d58Var2)) {
                        Set set2 = po3Var.e;
                        h58VarD = rk5.d(d58Var2, po3Var, lh7Var, lh7Var.q(d58Var2, po3.a(po3Var, null, false, set2 != null ? fv6.b0(set2, d58Var) : lv1.V(d58Var), null, 47)));
                    } else {
                        h58VarD = p58.l(d58Var2, po3Var);
                    }
                    linkedHashMap.put(d58Var2.q(), h58VarD);
                }
                m58 m58Var = new m58(new x87(linkedHashMap, z ? (byte) 1 : (byte) 0));
                List upperBounds = d58Var.getUpperBounds();
                upperBounds.getClass();
                zu6 zu6VarD = lh7Var.D(m58Var, upperBounds, po3Var);
                if (zu6VarD.m.isEmpty()) {
                    return lh7Var.p(po3Var);
                }
                if (zu6VarD.m.u == 1) {
                    return (oz3) lv0.E0(zu6VarD);
                }
                hk0.g("Should only be one computed upper bound if no need to intersect all bounds");
                return null;
            default:
                oz3 oz3Var = (oz3) this.n;
                ((ps4) obj).getClass();
                return oz3Var;
        }
    }
}
