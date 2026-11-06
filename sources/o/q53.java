package o;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class q53 extends zi8 {
    @Override // o.pn1
    public final void a(pn1 pn1Var) {
        a30 a30Var = (a30) this.b;
        int i = a30Var.r0;
        tn1 tn1Var = this.h;
        Iterator it = tn1Var.l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((tn1) it.next()).g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            tn1Var.d(i3 + a30Var.t0);
        } else {
            tn1Var.d(i2 + a30Var.t0);
        }
    }

    @Override // o.zi8
    public final void d() {
        n61 n61Var = this.b;
        if (n61Var instanceof a30) {
            tn1 tn1Var = this.h;
            tn1Var.b = true;
            ArrayList arrayList = tn1Var.l;
            a30 a30Var = (a30) n61Var;
            int i = a30Var.r0;
            boolean z = a30Var.s0;
            int i2 = 0;
            if (i == 0) {
                tn1Var.e = 4;
                while (i2 < a30Var.q0) {
                    n61 n61Var2 = a30Var.p0[i2];
                    if (z || n61Var2.f0 != 8) {
                        tn1 tn1Var2 = n61Var2.d.h;
                        tn1Var2.k.add(tn1Var);
                        arrayList.add(tn1Var2);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 1) {
                tn1Var.e = 5;
                while (i2 < a30Var.q0) {
                    n61 n61Var3 = a30Var.p0[i2];
                    if (z || n61Var3.f0 != 8) {
                        tn1 tn1Var3 = n61Var3.d.i;
                        tn1Var3.k.add(tn1Var);
                        arrayList.add(tn1Var3);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 2) {
                tn1Var.e = 6;
                while (i2 < a30Var.q0) {
                    n61 n61Var4 = a30Var.p0[i2];
                    if (z || n61Var4.f0 != 8) {
                        tn1 tn1Var4 = n61Var4.e.h;
                        tn1Var4.k.add(tn1Var);
                        arrayList.add(tn1Var4);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            tn1Var.e = 7;
            while (i2 < a30Var.q0) {
                n61 n61Var5 = a30Var.p0[i2];
                if (z || n61Var5.f0 != 8) {
                    tn1 tn1Var5 = n61Var5.e.i;
                    tn1Var5.k.add(tn1Var);
                    arrayList.add(tn1Var5);
                }
                i2++;
            }
            m(this.b.e.h);
            m(this.b.e.i);
        }
    }

    @Override // o.zi8
    public final void e() {
        n61 n61Var = this.b;
        if (n61Var instanceof a30) {
            int i = ((a30) n61Var).r0;
            tn1 tn1Var = this.h;
            if (i == 0 || i == 1) {
                n61Var.X = tn1Var.g;
            } else {
                n61Var.Y = tn1Var.g;
            }
        }
    }

    @Override // o.zi8
    public final void f() {
        this.c = null;
        this.h.c();
    }

    @Override // o.zi8
    public final boolean k() {
        return false;
    }

    public final void m(tn1 tn1Var) {
        tn1 tn1Var2 = this.h;
        tn1Var2.k.add(tn1Var);
        tn1Var.l.add(tn1Var2);
    }
}
