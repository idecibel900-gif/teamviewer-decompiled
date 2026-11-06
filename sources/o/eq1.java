package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class eq1 extends ii1 implements up1, zs0 {
    public g07 A;
    public List B;
    public g07 C;
    public final xd4 q;
    public final cp1 r;
    public List s;
    public final b3 t;
    public final cw5 u;
    public final ty4 v;
    public final d22 w;
    public final ed8 x;
    public final rp1 y;
    public g07 z;

    static {
        x86 x86Var = w86.a;
        x86Var.g(new gu5(x86Var.b(eq1.class), "constructors", "getConstructors()Ljava/util/Collection;"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq1(xd4 xd4Var, fi1 fi1Var, up upVar, sy4 sy4Var, cp1 cp1Var, cw5 cw5Var, ty4 ty4Var, d22 d22Var, ed8 ed8Var, rp1 rp1Var) {
        super(fi1Var, upVar, sy4Var, s67.h);
        xd4Var.getClass();
        fi1Var.getClass();
        cp1Var.getClass();
        cw5Var.getClass();
        ty4Var.getClass();
        d22Var.getClass();
        ed8Var.getClass();
        xd4Var.getClass();
        fi1Var.getClass();
        cp1Var.getClass();
        this.q = xd4Var;
        this.r = cp1Var;
        xd4Var.a(new a3(this, (byte) 0));
        this.t = new b3(this);
        this.u = cw5Var;
        this.v = ty4Var;
        this.w = d22Var;
        this.x = ed8Var;
        this.y = rp1Var;
    }

    @Override // o.qo4
    public final boolean A() {
        return false;
    }

    @Override // o.ii1
    /* JADX INFO: renamed from: C0 */
    public final hi1 a() {
        return this;
    }

    public final ns4 D0() {
        if (ct1.K(E0())) {
            return null;
        }
        ys0 ys0VarA = E0().o0().a();
        if (ys0VarA instanceof ns4) {
            return (ns4) ys0VarA;
        }
        return null;
    }

    public final g07 E0() {
        g07 g07Var = this.A;
        if (g07Var != null) {
            return g07Var;
        }
        im3.e0("expandedType");
        throw null;
    }

    public final g07 F0() {
        g07 g07Var = this.z;
        if (g07Var != null) {
            return g07Var;
        }
        im3.e0("underlyingType");
        throw null;
    }

    @Override // o.up1
    public final d22 G() {
        return this.w;
    }

    public final void G0(List list, g07 g07Var, g07 g07Var2) {
        zo4 zo4VarS0;
        g07 g07VarR;
        g07Var.getClass();
        g07Var2.getClass();
        this.s = list;
        this.z = g07Var;
        this.A = g07Var2;
        this.B = b77.f(this);
        ns4 ns4VarD0 = D0();
        if (ns4VarD0 == null || (zo4VarS0 = ns4VarD0.s0()) == null) {
            zo4VarS0 = yo4.b;
        }
        zo4 zo4Var = zo4VarS0;
        o48 o48Var = new o48(this, (byte) 13);
        ed2 ed2Var = p58.a;
        if (hd2.f(this)) {
            g07VarR = hd2.c(gd2.w, toString());
        } else {
            k48 k48VarQ = q();
            if (k48VarQ == null) {
                p58.a(12);
                throw null;
            }
            List listD = p58.d(((b3) k48VarQ).getParameters());
            g48.n.getClass();
            g07VarR = bt1.R(g48.f858o, k48VarQ, listD, false, zo4Var, o48Var);
        }
        this.C = g07VarR;
    }

    @Override // o.up1
    public final ty4 K() {
        return this.v;
    }

    @Override // o.up1
    public final rp1 M() {
        return this.y;
    }

    @Override // o.ys0
    public final g07 W() {
        g07 g07Var = this.C;
        if (g07Var != null) {
            return g07Var;
        }
        im3.e0("defaultTypeImpl");
        throw null;
    }

    @Override // o.ii1, o.gi1, o.fi1
    public final fi1 a() {
        return this;
    }

    @Override // o.ii1, o.gi1, o.fi1
    public final ys0 a() {
        return this;
    }

    @Override // o.ie7
    public final hi1 d(m58 m58Var) {
        m58Var.getClass();
        if (m58Var.a.e()) {
            return this;
        }
        fi1 fi1VarI = i();
        fi1VarI.getClass();
        up annotations = getAnnotations();
        annotations.getClass();
        sy4 name = getName();
        name.getClass();
        eq1 eq1Var = new eq1(this.q, fi1VarI, annotations, name, this.r, this.u, this.v, this.w, this.x, this.y);
        List listK0 = k0();
        g07 g07VarF0 = F0();
        ub8 ub8Var = ub8.f2197o;
        eq1Var.G0(listK0, m77.o(m58Var.f(g07VarF0, ub8Var)), m77.o(m58Var.f(E0(), ub8Var)));
        return eq1Var;
    }

    @Override // o.qo4, o.ki1
    public final cp1 e() {
        return this.r;
    }

    @Override // o.zs0
    public final boolean g() {
        return p58.c(F0(), new t(this, (byte) 4), null);
    }

    @Override // o.qo4
    public final boolean h0() {
        return false;
    }

    @Override // o.zs0
    public final List k0() {
        List list = this.s;
        if (list != null) {
            return list;
        }
        im3.e0("declaredTypeParametersImpl");
        throw null;
    }

    @Override // o.fi1
    public final Object o(ji1 ji1Var, Object obj) {
        return ji1Var.E(this, obj);
    }

    @Override // o.qo4
    public final boolean p() {
        return false;
    }

    @Override // o.ys0
    public final k48 q() {
        return this.t;
    }

    @Override // o.gi1
    public final String toString() {
        return "typealias " + getName().b();
    }

    @Override // o.up1
    public final t1 v() {
        return this.u;
    }
}
