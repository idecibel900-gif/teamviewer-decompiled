package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c55 extends as0 {
    public final boolean s;
    public final ArrayList t;
    public final ss0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c55(xd4 xd4Var, ps0 ps0Var, sy4 sy4Var, boolean z, int i) {
        super(xd4Var, ps0Var, sy4Var, s67.h);
        ps0Var.getClass();
        this.s = z;
        yk3 yk3VarB0 = ct1.b0(0, i);
        ArrayList arrayList = new ArrayList(mv0.Z(yk3VarB0, 10));
        Iterator it = yk3VarB0.iterator();
        while (true) {
            xk3 xk3Var = (xk3) it;
            if (!xk3Var.f2526o) {
                this.t = arrayList;
                List listF = b77.f(this);
                int i2 = bp1.a;
                ps4 ps4VarD = zo1.d(this);
                ps4VarD.getClass();
                this.u = new ss0(this, listF, lv1.V(ps4VarD.h().e()), xd4Var);
                return;
            }
            int iNextInt = xk3Var.nextInt();
            arrayList.add(e58.G0(this, ub8.f2197o, sy4.e("T" + iNextInt), iNextInt, xd4Var));
        }
    }

    @Override // o.qo4
    public final boolean A() {
        return false;
    }

    @Override // o.ns4, o.qo4, o.ki1
    public final cp1 e() {
        cp1 cp1Var = dp1.e;
        cp1Var.getClass();
        return cp1Var;
    }

    @Override // o.zs0
    public final boolean g() {
        return this.s;
    }

    @Override // o.so
    public final up getAnnotations() {
        return yl7.p;
    }

    @Override // o.qo4
    public final boolean h0() {
        return false;
    }

    @Override // o.ns4
    public final ms0 i0() {
        return ms0.m;
    }

    @Override // o.ns4, o.zs0
    public final List k0() {
        return this.t;
    }

    @Override // o.ns4
    public final boolean m() {
        return false;
    }

    @Override // o.ns4
    public final Collection o0() {
        return ea2.m;
    }

    @Override // o.as0, o.qo4
    public final boolean p() {
        return false;
    }

    @Override // o.ns4
    public final zo4 p0() {
        return yo4.b;
    }

    @Override // o.ys0
    public final k48 q() {
        return this.u;
    }

    @Override // o.ns4, o.qo4
    public final as4 r() {
        return as4.n;
    }

    @Override // o.ns4
    public final zo4 t0(uz3 uz3Var) {
        return yo4.b;
    }

    public final String toString() {
        return "class " + getName() + " (not found)";
    }

    @Override // o.ns4
    public final wr0 u0() {
        return null;
    }

    @Override // o.ns4
    public final jb8 v0() {
        return null;
    }

    @Override // o.ns4
    public final boolean w0() {
        return false;
    }

    @Override // o.ns4
    public final boolean x0() {
        return false;
    }

    @Override // o.ns4
    public final boolean y0() {
        return false;
    }

    @Override // o.ns4
    public final Collection z() {
        return la2.m;
    }

    @Override // o.ns4
    public final boolean z0() {
        return false;
    }
}
