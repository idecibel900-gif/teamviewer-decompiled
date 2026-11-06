package o;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class eu3 extends ou3 implements wt3, sw3 {
    public static final /* synthetic */ int p = 0;
    public final Class n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final u14 f743o = ds1.X(l54.m, new xt3(this, (byte) 0));

    public eu3(Class cls) {
        this.n = cls;
    }

    public static cs0 z(js0 js0Var, mg6 mg6Var) {
        io.sentry.android.replay.screenshot.k kVar = mg6Var.a;
        ha2 ha2Var = new ha2((ps4) kVar.b, js0Var.a, (byte) 0);
        sy4 sy4VarF = js0Var.f();
        List listK = qf0.K(((ps4) kVar.b).h().j("Any").W());
        xd4 xd4Var = (xd4) kVar.a;
        cs0 cs0Var = new cs0(ha2Var, sy4VarF, as4.n, ms0.m, listK, xd4Var);
        cs0Var.C0(new cu3(xd4Var, cs0Var), la2.m, null);
        return cs0Var;
    }

    public final js0 A() {
        ps5 ps5VarC;
        js0 js0Var = og6.a;
        Class cls = this.n;
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            componentType.getClass();
            ps5VarC = componentType.isPrimitive() ? ts3.b(componentType.getSimpleName()).c() : null;
            if (ps5VarC != null) {
                return new js0(t87.l, ps5VarC.n);
            }
            ht2 ht2VarG = s87.g.g();
            ht2 ht2VarE = ht2VarG.e();
            sy4 sy4VarF = ht2VarG.f();
            sy4VarF.getClass();
            return new js0(ht2VarE, sy4VarF);
        }
        if (cls.equals(Void.TYPE)) {
            return og6.a;
        }
        ps5VarC = cls.isPrimitive() ? ts3.b(cls.getSimpleName()).c() : null;
        if (ps5VarC != null) {
            return new js0(t87.l, ps5VarC.m);
        }
        js0 js0VarA = p76.a(cls);
        if (!js0VarA.c) {
            String str = mo3.a;
            js0 js0VarF = mo3.f(js0VarA.a());
            if (js0VarF != null) {
                return js0VarF;
            }
        }
        return js0VarA;
    }

    public final ns4 B() {
        return ((au3) this.f743o.getValue()).a();
    }

    @Override // o.vr0
    public final Class a() {
        return this.n;
    }

    @Override // o.wt3
    public final String c() {
        u86 u86Var = ((au3) this.f743o.getValue()).e;
        fw3 fw3Var = au3.n[3];
        return (String) u86Var.a();
    }

    @Override // o.wt3
    public final boolean e() {
        return B().z0();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof eu3) && et1.A(this).equals(et1.A((wt3) obj));
    }

    @Override // o.wt3
    public final String f() {
        u86 u86Var = ((au3) this.f743o.getValue()).d;
        fw3 fw3Var = au3.n[2];
        return (String) u86Var.a();
    }

    @Override // o.wt3
    public final boolean g() {
        return B().g();
    }

    @Override // o.qt3
    public final List getAnnotations() {
        throw null;
    }

    @Override // o.wt3
    public final int hashCode() {
        return et1.A(this).hashCode();
    }

    @Override // o.wt3
    public final Object j() {
        return ((au3) this.f743o.getValue()).g.getValue();
    }

    @Override // o.wt3
    public final boolean m() {
        return B().r() == as4.f355o;
    }

    @Override // o.ou3
    public final Collection n() {
        ns4 ns4VarB = B();
        if (ns4VarB.i0() == ms0.n || ns4VarB.i0() == ms0.r) {
            return ea2.m;
        }
        Collection collectionZ = ns4VarB.z();
        collectionZ.getClass();
        return collectionZ;
    }

    @Override // o.wt3
    public final boolean o(Object obj) {
        Map map = p76.d;
        Class cls = this.n;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return e8.p(num.intValue(), obj);
        }
        Class cls2 = (Class) p76.c.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.isInstance(obj);
    }

    @Override // o.wt3
    public final boolean p() {
        return B().r() == as4.q;
    }

    @Override // o.ou3
    public final Collection q(sy4 sy4Var) {
        zo4 zo4VarI = B().W().I();
        t35 t35Var = t35.n;
        Collection collectionA = zo4VarI.a(sy4Var, t35Var);
        zo4 zo4VarP0 = B().p0();
        zo4VarP0.getClass();
        return lv0.A0(collectionA, zo4VarP0.a(sy4Var, t35Var));
    }

    @Override // o.ou3
    public final bu5 r(int i) {
        Class<?> declaringClass;
        Class cls = this.n;
        if (cls.getSimpleName().equals("DefaultImpls") && (declaringClass = cls.getDeclaringClass()) != null && declaringClass.isInterface()) {
            return ((eu3) w86.a.b(declaringClass)).r(i);
        }
        ns4 ns4VarB = B();
        pp1 pp1Var = ns4VarB instanceof pp1 ? (pp1) ns4VarB : null;
        if (pp1Var != null) {
            tu5 tu5Var = pp1Var.q;
            my2 my2Var = jt3.j;
            my2Var.getClass();
            qv5 qv5Var = (qv5) it1.D(tu5Var, my2Var, i);
            if (qv5Var != null) {
                fp1 fp1Var = pp1Var.x;
                return (bu5) pa8.f(cls, qv5Var, (ty4) fp1Var.b, (d22) fp1Var.d, pp1Var.r, du3.n);
            }
        }
        return null;
    }

    public final String toString() {
        js0 js0VarA = A();
        ht2 ht2Var = js0VarA.a;
        String strConcat = ht2Var.d() ? "" : ht2Var.b().concat(".");
        String strReplace = js0VarA.b.b().replace('.', '$');
        strReplace.getClass();
        return "class ".concat(strConcat.concat(strReplace));
    }

    @Override // o.ou3
    public final Collection u(sy4 sy4Var) {
        zo4 zo4VarI = B().W().I();
        t35 t35Var = t35.n;
        Collection collectionD = zo4VarI.d(sy4Var, t35Var);
        zo4 zo4VarP0 = B().p0();
        zo4VarP0.getClass();
        return lv0.A0(collectionD, zo4VarP0.d(sy4Var, t35Var));
    }
}
