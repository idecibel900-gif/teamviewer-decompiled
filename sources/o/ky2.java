package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ky2 extends oy2 {
    public final cj2 m;

    public ky2(jy2 jy2Var) {
        jy2Var.n.f();
        jy2Var.f1212o = false;
        this.m = jy2Var.n;
    }

    public final boolean i() {
        m17 m17Var = this.m.a;
        for (int i = 0; i < m17Var.n.size(); i++) {
            if (!cj2.e((Map.Entry) m17Var.n.get(i))) {
                return false;
            }
        }
        Iterator it = m17Var.c().iterator();
        while (it.hasNext()) {
            if (!cj2.e((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int j() {
        m17 m17Var = this.m.a;
        int iD = 0;
        for (int i = 0; i < m17Var.n.size(); i++) {
            Map.Entry entry = (Map.Entry) m17Var.n.get(i);
            iD += cj2.d((ly2) entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : m17Var.c()) {
            iD += cj2.d((ly2) entry2.getKey(), entry2.getValue());
        }
        return iD;
    }

    public final Object k(my2 my2Var) {
        o(my2Var);
        ly2 ly2Var = my2Var.d;
        Object obj = this.m.a.get(ly2Var);
        if (obj == null) {
            return my2Var.b;
        }
        if (!ly2Var.f1418o) {
            return my2Var.a(obj);
        }
        if (ly2Var.n.m != am8.u) {
            return obj;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(my2Var.a(it.next()));
        }
        return arrayList;
    }

    public final boolean l(my2 my2Var) {
        o(my2Var);
        ly2 ly2Var = my2Var.d;
        cj2 cj2Var = this.m;
        cj2Var.getClass();
        if (!ly2Var.f1418o) {
            return cj2Var.a.get(ly2Var) != null;
        }
        hk0.g("hasField() can only be called on non-repeated fields.");
        return false;
    }

    public final void m() {
        this.m.f();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0019  */
    public final boolean n(vu0 vu0Var, cv0 cv0Var, dg2 dg2Var, int i) throws rm3 {
        boolean z;
        boolean z2;
        Object objC;
        t1 t1Var;
        int i2 = i & 7;
        my2 my2Var = (my2) dg2Var.a.get(new bg2(i >>> 3, b()));
        if (my2Var == null) {
            z2 = true;
            z = false;
        } else {
            ly2 ly2Var = my2Var.d;
            yl8 yl8Var = ly2Var.n;
            cj2 cj2Var = cj2.c;
            if (i2 == yl8Var.n) {
                z2 = false;
                z = false;
            } else if (ly2Var.f1418o && yl8Var.a() && i2 == 2) {
                z = true;
                z2 = false;
            } else {
                z2 = true;
                z = false;
            }
        }
        if (z2) {
            return vu0Var.p(i, cv0Var);
        }
        fy2 fy2VarD = null;
        cj2 cj2Var2 = this.m;
        if (z) {
            int iD = vu0Var.d(vu0Var.j());
            ly2 ly2Var2 = my2Var.d;
            if (ly2Var2.n != yl8.s) {
                while (vu0Var.b() > 0) {
                    cj2Var2.a(ly2Var2, cj2.h(vu0Var, ly2Var2.n));
                }
            } else if (vu0Var.b() > 0) {
                vu0Var.j();
                throw null;
            }
            vu0Var.c(iD);
            return true;
        }
        ly2 ly2Var3 = my2Var.d;
        yl8 yl8Var2 = ly2Var3.n;
        boolean z3 = ly2Var3.f1418o;
        yl8 yl8Var3 = ly2Var3.n;
        int iOrdinal = yl8Var2.m.ordinal();
        if (iOrdinal == 7) {
            vu0Var.j();
            throw null;
        }
        if (iOrdinal != 8) {
            objC = cj2.h(vu0Var, yl8Var3);
        } else {
            if (!z3 && (t1Var = (t1) cj2Var2.a.get(ly2Var3)) != null) {
                fy2VarD = t1Var.e();
            }
            if (fy2VarD == null) {
                fy2VarD = my2Var.c.d();
            }
            if (yl8Var3 == yl8.q) {
                short s = ly2Var3.m;
                int i3 = vu0Var.i;
                if (i3 >= 64) {
                    throw new rm3("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                }
                vu0Var.i = i3 + 1;
                fy2VarD.d(vu0Var, dg2Var);
                vu0Var.a((s << 3) | 4);
                vu0Var.i--;
            } else {
                int iJ = vu0Var.j();
                if (vu0Var.i >= 64) {
                    throw new rm3("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                }
                int iD2 = vu0Var.d(iJ);
                vu0Var.i++;
                fy2VarD.d(vu0Var, dg2Var);
                vu0Var.a(0);
                vu0Var.i--;
                vu0Var.c(iD2);
            }
            objC = fy2VarD.c();
        }
        if (z3) {
            cj2Var2.a(ly2Var3, my2Var.b(objC));
            return true;
        }
        cj2Var2.i(ly2Var3, my2Var.b(objC));
        return true;
    }

    public final void o(my2 my2Var) {
        if (my2Var.a == b()) {
            return;
        }
        hk0.g("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
    }

    public ky2() {
        this.m = new cj2();
    }
}
