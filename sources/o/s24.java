package o;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s24 extends ap4 {
    public static final /* synthetic */ fw3[] m;
    public final yc4 b;
    public final s24 c;
    public final qd4 d;
    public final vd4 e;
    public final sd4 f;
    public final h50 g;
    public final sd4 h;
    public final vd4 i;
    public final vd4 j;
    public final vd4 k;
    public final sd4 l;

    static {
        x86 x86Var = w86.a;
        m = new fw3[]{x86Var.g(new gu5(x86Var.b(s24.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), x86Var.g(new gu5(x86Var.b(s24.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), x86Var.g(new gu5(x86Var.b(s24.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};
    }

    public s24(yc4 yc4Var, g24 g24Var) {
        yc4Var.getClass();
        this.b = yc4Var;
        this.c = g24Var;
        xd4 xd4Var = ((io3) yc4Var.m).a;
        byte b = 0;
        this.d = new qd4(xd4Var, new p24(this, b));
        byte b2 = 1;
        this.e = new vd4(xd4Var, new p24(this, b2));
        this.f = xd4Var.b(new q24(this, b));
        this.g = xd4Var.c(new q24(this, b2));
        byte b3 = 2;
        this.h = xd4Var.b(new q24(this, b3));
        this.i = new vd4(xd4Var, new p24(this, b3));
        byte b4 = 3;
        this.j = new vd4(xd4Var, new p24(this, b4));
        this.k = new vd4(xd4Var, new p24(this, (byte) 4));
        this.l = xd4Var.b(new q24(this, b4));
    }

    public static oz3 l(j86 j86Var, yc4 yc4Var) {
        j86Var.getClass();
        Class<?> declaringClass = ((Method) j86Var.b()).getDeclaringClass();
        declaringClass.getClass();
        return ((iu) yc4Var.q).V(j86Var.f(), lq1.I(n58.n, declaringClass.isAnnotation(), null, 6));
    }

    public static os2 u(yc4 yc4Var, zw2 zw2Var, List list) {
        vd5 vd5Var;
        sy4 sy4Var;
        sy4 sy4VarE;
        iu iuVar = (iu) yc4Var.q;
        qs4 qs4Var = ((io3) yc4Var.m).h;
        ex exVarU0 = lv0.U0(list);
        ArrayList arrayList = new ArrayList(mv0.Z(exVarU0, 10));
        Iterator it = exVarU0.iterator();
        boolean z = false;
        while (true) {
            p62 p62Var = (p62) it;
            if (!p62Var.n.hasNext()) {
                return new os2(lv0.P0(arrayList), z);
            }
            sg3 sg3Var = (sg3) p62Var.next();
            int i = sg3Var.a;
            p86 p86Var = (p86) sg3Var.b;
            z14 z14VarD = ep1.D(yc4Var, p86Var);
            po3 po3VarI = lq1.I(n58.n, false, null, 7);
            boolean z2 = p86Var.d;
            n86 n86Var = p86Var.a;
            if (z2) {
                u76 u76Var = n86Var instanceof u76 ? (u76) n86Var : null;
                if (u76Var == null) {
                    hk0.s(p86Var, "Vararg parameter should be an array: ");
                    return null;
                }
                m98 m98VarU = iuVar.U(u76Var, po3VarI, true);
                vd5Var = new vd5(m98VarU, qs4Var.p.f(m98VarU));
            } else {
                vd5Var = new vd5(iuVar.V(n86Var, po3VarI), null);
            }
            oz3 oz3Var = (oz3) vd5Var.m;
            oz3 oz3Var2 = (oz3) vd5Var.n;
            if (im3.n(zw2Var.getName().b(), "equals") && list.size() == 1 && qs4Var.p.o().equals(oz3Var)) {
                sy4VarE = sy4.e("other");
            } else {
                String str = p86Var.c;
                sy4 sy4VarD = str != null ? sy4.d(str) : null;
                if (sy4VarD == null) {
                    z = true;
                }
                if (sy4VarD == null) {
                    sy4VarE = sy4.e("p" + i);
                } else {
                    sy4Var = sy4VarD;
                }
                arrayList.add(new qb8(zw2Var, null, i, z14VarD, sy4Var, oz3Var, false, false, false, oz3Var2, d82.z(p86Var)));
            }
            sy4Var = sy4VarE;
            arrayList.add(new qb8(zw2Var, null, i, z14VarD, sy4Var, oz3Var, false, false, false, oz3Var2, d82.z(p86Var)));
        }
    }

    @Override // o.ap4, o.zo4
    public Collection a(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        t35Var.getClass();
        return !b().contains(sy4Var) ? ea2.m : (Collection) this.h.invoke(sy4Var);
    }

    @Override // o.ap4, o.zo4
    public final Set b() {
        return (Set) i67.s(this.i, m[0]);
    }

    @Override // o.ap4, o.zo4
    public final Set c() {
        return (Set) i67.s(this.k, m[2]);
    }

    @Override // o.ap4, o.zo4
    public Collection d(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        return !f().contains(sy4Var) ? ea2.m : (Collection) this.l.invoke(sy4Var);
    }

    @Override // o.ap4, o.zo4
    public Collection e(no1 no1Var, Function1 function1) {
        no1Var.getClass();
        return (Collection) this.d.a();
    }

    @Override // o.ap4, o.zo4
    public final Set f() {
        return (Set) i67.s(this.j, m[1]);
    }

    public Set h(no1 no1Var, Function1 function1) {
        no1Var.getClass();
        return la2.m;
    }

    public Set i(no1 no1Var, Function1 function1) {
        no1Var.getClass();
        return la2.m;
    }

    public void j(ArrayList arrayList, sy4 sy4Var) {
    }

    public mi1 k() {
        return li1.a;
    }

    public void m(LinkedHashSet linkedHashSet, sy4 sy4Var) {
    }

    public void n(ArrayList arrayList, sy4 sy4Var) {
    }

    public Set o(no1 no1Var) {
        no1Var.getClass();
        return la2.m;
    }

    public v14 p() {
        return null;
    }

    public abstract fi1 q();

    public boolean r(eo3 eo3Var) {
        return true;
    }

    public r24 s(j86 j86Var, ArrayList arrayList, oz3 oz3Var, List list) {
        j86Var.getClass();
        return new r24(oz3Var, list, arrayList, ea2.m);
    }

    public final eo3 t(j86 j86Var) {
        as4 as4Var;
        j86Var.getClass();
        yc4 yc4Var = this.b;
        eo3 eo3VarR0 = eo3.R0(q(), ep1.D(yc4Var, j86Var), j86Var.c(), d82.z(j86Var), ((mi1) this.e.a()).f(j86Var.c()) != null && ((ArrayList) j86Var.g()).isEmpty());
        yc4Var.getClass();
        yc4 yc4Var2 = new yc4((io3) yc4Var.m, new x24(yc4Var, eo3VarR0, j86Var, 0), (u14) yc4Var.f2598o);
        ArrayList typeParameters = j86Var.getTypeParameters();
        ArrayList arrayList = new ArrayList(mv0.Z(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            d58 d58VarB = ((f58) yc4Var2.n).b((o86) it.next());
            d58VarB.getClass();
            arrayList.add(d58VarB);
        }
        os2 os2VarU = u(yc4Var2, eo3VarR0, j86Var.g());
        r24 r24VarS = s(j86Var, arrayList, l(j86Var, yc4Var2), os2VarU.a);
        List list = r24VarS.d;
        v14 v14VarP = p();
        ArrayList arrayList2 = r24VarS.c;
        List list2 = r24VarS.b;
        oz3 oz3Var = r24VarS.a;
        boolean zIsAbstract = Modifier.isAbstract(((Method) j86Var.b()).getModifiers());
        boolean zIsFinal = Modifier.isFinal(((Method) j86Var.b()).getModifiers());
        as4.m.getClass();
        if (zIsAbstract) {
            as4Var = as4.q;
        } else {
            as4Var = !zIsFinal ? as4.p : as4.n;
        }
        eo3VarR0.Q0(null, v14VarP, ea2.m, arrayList2, list2, oz3Var, as4Var, h57.y(j86Var.e()), fa2.m);
        eo3VarR0.S0(false, os2VarU.b);
        if (list.isEmpty()) {
            return eo3VarR0;
        }
        yq4.r("Should not be called");
        return null;
    }

    public String toString() {
        return "Lazy scope for " + q();
    }
}
