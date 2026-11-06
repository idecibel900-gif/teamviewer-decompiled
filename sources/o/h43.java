package o;

/* JADX INFO: loaded from: classes.dex */
public final class h43 extends zi8 {
    @Override // o.pn1
    public final void a(pn1 pn1Var) {
        tn1 tn1Var = this.h;
        if (tn1Var.c && !tn1Var.j) {
            tn1Var.d((int) ((((tn1) tn1Var.l.get(0)).g * ((g43) this.b).p0) + 0.5f));
        }
    }

    @Override // o.zi8
    public final void d() {
        n61 n61Var = this.b;
        g43 g43Var = (g43) n61Var;
        int i = g43Var.q0;
        int i2 = g43Var.r0;
        int i3 = g43Var.t0;
        tn1 tn1Var = this.h;
        if (i3 == 1) {
            if (i != -1) {
                tn1Var.l.add(n61Var.S.d.h);
                this.b.S.d.h.k.add(tn1Var);
                tn1Var.f = i;
            } else if (i2 != -1) {
                tn1Var.l.add(n61Var.S.d.i);
                this.b.S.d.i.k.add(tn1Var);
                tn1Var.f = -i2;
            } else {
                tn1Var.b = true;
                tn1Var.l.add(n61Var.S.d.i);
                this.b.S.d.i.k.add(tn1Var);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            tn1Var.l.add(n61Var.S.e.h);
            this.b.S.e.h.k.add(tn1Var);
            tn1Var.f = i;
        } else if (i2 != -1) {
            tn1Var.l.add(n61Var.S.e.i);
            this.b.S.e.i.k.add(tn1Var);
            tn1Var.f = -i2;
        } else {
            tn1Var.b = true;
            tn1Var.l.add(n61Var.S.e.i);
            this.b.S.e.i.k.add(tn1Var);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    public final void m(tn1 tn1Var) {
        tn1 tn1Var2 = this.h;
        tn1Var2.k.add(tn1Var);
        tn1Var.l.add(tn1Var2);
    }
}
