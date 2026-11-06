package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class sw2 extends e0 {
    public final /* synthetic */ tw2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw2(tw2 tw2Var) {
        super(tw2Var.q);
        this.c = tw2Var;
    }

    @Override // o.k48
    public final ys0 a() {
        return this.c;
    }

    @Override // o.k48
    public final boolean c() {
        return true;
    }

    @Override // o.d3
    public final Collection e() {
        List<js0> listL;
        tw2 tw2Var = this.c;
        int i = tw2Var.t;
        hx2 hx2Var = tw2Var.s;
        dx2 dx2Var = dx2.c;
        if (im3.n(hx2Var, dx2Var)) {
            listL = qf0.K(tw2.x);
        } else if (im3.n(hx2Var, ex2.c)) {
            listL = qf0.L(tw2.y, new js0(t87.l, dx2Var.a(i)));
        } else {
            gx2 gx2Var = gx2.c;
            if (im3.n(hx2Var, gx2Var)) {
                listL = qf0.K(tw2.x);
            } else {
                if (!im3.n(hx2Var, fx2.c)) {
                    int i2 = bc.a;
                    hk0.l("should not be called");
                    return null;
                }
                listL = qf0.L(tw2.y, new js0(t87.f, gx2Var.a(i)));
            }
        }
        ps4 ps4VarI = ((bd5) tw2Var.r).i();
        ArrayList arrayList = new ArrayList(mv0.Z(listL, 10));
        for (js0 js0Var : listL) {
            ns4 ns4VarQ = vs1.q(ps4VarI, js0Var);
            if (ns4VarQ == null) {
                an4.h(js0Var, " not found", "Built-in class ");
                return null;
            }
            List listL0 = lv0.L0(ns4VarQ.q().getParameters().size(), tw2Var.w);
            ArrayList arrayList2 = new ArrayList(mv0.Z(listL0, 10));
            Iterator it = listL0.iterator();
            while (it.hasNext()) {
                arrayList2.add(new w87(((d58) it.next()).W()));
            }
            g48.n.getClass();
            arrayList.add(bt1.O(g48.f858o, ns4VarQ, arrayList2));
        }
        return lv0.P0(arrayList);
    }

    @Override // o.d3
    public final jk0 g() {
        return jk0.O;
    }

    @Override // o.k48
    public final List getParameters() {
        return this.c.w;
    }

    @Override // o.e0
    /* JADX INFO: renamed from: m */
    public final ns4 a() {
        return this.c;
    }

    public final String toString() {
        return this.c.toString();
    }
}
