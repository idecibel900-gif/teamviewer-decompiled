package o;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class y14 implements dp5 {
    public static final /* synthetic */ fw3[] h;
    public final yc4 a;
    public final q76 b;
    public final ud4 c;
    public final vd4 d;
    public final ng6 e;
    public final vd4 f;
    public final boolean g;

    static {
        x86 x86Var = w86.a;
        h = new fw3[]{x86Var.g(new gu5(x86Var.b(y14.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), x86Var.g(new gu5(x86Var.b(y14.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), x86Var.g(new gu5(x86Var.b(y14.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    public y14(yc4 yc4Var, q76 q76Var, boolean z) {
        yc4Var.getClass();
        q76Var.getClass();
        this.a = yc4Var;
        this.b = q76Var;
        xd4 xd4Var = ((io3) yc4Var.m).a;
        this.c = new ud4(xd4Var, new x14(this, (byte) 0));
        this.d = new vd4(xd4Var, new x14(this, (byte) 1));
        this.e = d82.z(q76Var);
        this.f = new vd4(xd4Var, new x14(this, (byte) 2));
        this.g = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final u51 a(r76 r76Var) {
        n86 u76Var;
        oz3 oz3VarG;
        if (r76Var instanceof h86) {
            return z06.p(((h86) r76Var).b, null);
        }
        if (r76Var instanceof f86) {
            Enum r6 = ((f86) r76Var).b;
            Class<?> enclosingClass = r6.getClass();
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            enclosingClass.getClass();
            return new oc2(p76.a(enclosingClass), sy4.e(r6.name()));
        }
        boolean z = r76Var instanceof t76;
        yc4 yc4Var = this.a;
        if (z) {
            t76 t76Var = (t76) r76Var;
            sy4 sy4Var = t76Var.a;
            if (sy4Var == null) {
                sy4Var = tr3.b;
            }
            sy4Var.getClass();
            ArrayList arrayListA = t76Var.a();
            if (!ct1.K((g07) i67.s(this.d, h[1]))) {
                ns4 ns4VarD = bp1.d(this);
                ns4VarD.getClass();
                qb8 qb8VarE = wo1.E(sy4Var, ns4VarD);
                if (qb8VarE == null || (oz3VarG = qb8VarE.getType()) == null) {
                    oz3VarG = ((io3) yc4Var.m).h.p.g(hd2.c(gd2.P, new String[0]));
                }
                ArrayList arrayList = new ArrayList(mv0.Z(arrayListA, 10));
                Iterator it = arrayListA.iterator();
                while (it.hasNext()) {
                    u51 u51VarA = a((r76) it.next());
                    if (u51VarA == null) {
                        u51VarA = new x55(null);
                    }
                    arrayList.add(u51VarA);
                }
                return new s58(arrayList, oz3VarG);
            }
        } else {
            if (r76Var instanceof s76) {
                return new sp((Object) new y14(yc4Var, new q76(((s76) r76Var).b), false));
            }
            if (r76Var instanceof b86) {
                Class cls = ((b86) r76Var).b;
                if (cls.isPrimitive()) {
                    u76Var = new l86(cls);
                } else if ((cls instanceof GenericArrayType) || cls.isArray()) {
                    u76Var = new u76(cls);
                } else {
                    u76Var = cls instanceof WildcardType ? new q86((WildcardType) cls) : new c86(cls);
                }
                oz3 oz3VarV = ((iu) yc4Var.q).V(u76Var, lq1.I(n58.n, false, null, 7));
                if (!ct1.K(oz3VarV)) {
                    oz3 oz3VarB = oz3VarV;
                    int i = 0;
                    while (wy3.y(oz3VarB)) {
                        oz3VarB = ((h58) lv0.F0(oz3VarB.m0())).b();
                        i++;
                    }
                    ys0 ys0VarA = oz3VarB.o0().a();
                    if (ys0VarA instanceof ns4) {
                        js0 js0VarF = bp1.f(ys0VarA);
                        return js0VarF == null ? new iu3(new fu3(oz3VarV)) : new iu3(js0VarF, i);
                    }
                    if (ys0VarA instanceof d58) {
                        ht2 ht2VarG = s87.a.g();
                        ht2 ht2VarE = ht2VarG.e();
                        sy4 sy4VarF = ht2VarG.f();
                        sy4VarF.getClass();
                        return new iu3(new js0(ht2VarE, sy4VarF), 0);
                    }
                }
            }
        }
        return null;
    }

    @Override // o.hp
    public final s67 c() {
        return this.e;
    }

    @Override // o.hp
    public final ht2 d() {
        fw3 fw3Var = h[0];
        ud4 ud4Var = this.c;
        ud4Var.getClass();
        fw3Var.getClass();
        return (ht2) ud4Var.a();
    }

    @Override // o.hp
    public final Map e() {
        return (Map) i67.s(this.f, h[2]);
    }

    @Override // o.hp
    public final oz3 getType() {
        return (g07) i67.s(this.d, h[1]);
    }

    public final String toString() {
        return qo1.c.w(this, null);
    }
}
