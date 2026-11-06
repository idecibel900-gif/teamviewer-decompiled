package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class tw2 extends d0 {
    public static final js0 x = new js0(t87.l, sy4.e("Function"));
    public static final js0 y = new js0(t87.i, sy4.e("KFunction"));
    public final xd4 q;
    public final ad5 r;
    public final hx2 s;
    public final int t;
    public final sw2 u;
    public final vw2 v;
    public final List w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw2(xd4 xd4Var, eg0 eg0Var, hx2 hx2Var, int i) {
        super(xd4Var, hx2Var.a(i));
        eg0Var.getClass();
        this.q = xd4Var;
        this.r = eg0Var;
        this.s = hx2Var;
        this.t = i;
        this.u = new sw2(this);
        this.v = new vw2(xd4Var, this);
        ArrayList arrayList = new ArrayList();
        yk3 yk3Var = new yk3(1, i, 1);
        ArrayList arrayList2 = new ArrayList(mv0.Z(yk3Var, 10));
        Iterator it = yk3Var.iterator();
        while (true) {
            xk3 xk3Var = (xk3) it;
            if (!xk3Var.f2526o) {
                break;
            }
            arrayList.add(e58.G0(this, ub8.p, sy4.e("P" + xk3Var.nextInt()), arrayList.size(), this.q));
            arrayList2.add(f88.a);
        }
        arrayList.add(e58.G0(this, ub8.q, sy4.e("R"), arrayList.size(), this.q));
        this.w = lv0.P0(arrayList);
        hx2 hx2Var2 = this.s;
        uw2.m.getClass();
        hx2Var2.getClass();
        if (hx2Var2.equals(dx2.c) || hx2Var2.equals(gx2.c) || hx2Var2.equals(ex2.c)) {
            return;
        }
        hx2Var2.equals(fx2.c);
    }

    @Override // o.qo4
    public final boolean A() {
        return false;
    }

    @Override // o.hi1
    public final s67 c() {
        return s67.h;
    }

    @Override // o.ns4, o.qo4, o.ki1
    public final cp1 e() {
        cp1 cp1Var = dp1.e;
        cp1Var.getClass();
        return cp1Var;
    }

    @Override // o.zs0
    public final boolean g() {
        return false;
    }

    @Override // o.so
    public final up getAnnotations() {
        return yl7.p;
    }

    @Override // o.qo4
    public final boolean h0() {
        return false;
    }

    @Override // o.fi1
    public final fi1 i() {
        return this.r;
    }

    @Override // o.ns4
    public final ms0 i0() {
        return ms0.n;
    }

    @Override // o.ns4, o.zs0
    public final List k0() {
        return this.w;
    }

    @Override // o.ns4
    public final boolean m() {
        return false;
    }

    @Override // o.ns4
    public final Collection o0() {
        return ea2.m;
    }

    @Override // o.qo4
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
        return as4.q;
    }

    @Override // o.ns4
    public final zo4 t0(uz3 uz3Var) {
        return this.v;
    }

    public final String toString() {
        String strB = getName().b();
        strB.getClass();
        return strB;
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
        return ea2.m;
    }

    @Override // o.ns4
    public final boolean z0() {
        return false;
    }
}
