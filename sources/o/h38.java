package o;

/* JADX INFO: loaded from: classes2.dex */
public final class h38 implements nw3 {
    public final nw3 a;
    public final nw3 b;
    public final nw3 c;
    public final hq6 d;

    public h38(nw3 nw3Var, nw3 nw3Var2, nw3 nw3Var3) {
        hq6 hq6Var;
        this.a = nw3Var;
        this.b = nw3Var2;
        this.c = nw3Var3;
        fq6[] fq6VarArr = new fq6[0];
        er7 er7Var = new er7(this, (byte) 3);
        if (ub7.b0("o.g38")) {
            hk0.g("Blank serial names are prohibited");
            hq6Var = null;
        } else {
            rs0 rs0Var = new rs0("o.g38");
            er7Var.invoke(rs0Var);
            hq6Var = new hq6("o.g38", lc7.d, rs0Var.b.size(), cx.g1(fq6VarArr), rs0Var);
        }
        this.d = hq6Var;
    }

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        g38 g38Var = (g38) obj;
        g38Var.getClass();
        hq6 hq6Var = this.d;
        bb7 bb7VarA = bb7Var.a(hq6Var);
        bb7VarA.n(hq6Var, 0, this.a, g38Var.m);
        bb7VarA.n(hq6Var, 1, this.b, g38Var.n);
        bb7VarA.n(hq6Var, 2, this.c, g38Var.f855o);
        bb7VarA.s(hq6Var);
    }

    @Override // o.nw3
    public final Object b(aj1 aj1Var) {
        hq6 hq6Var = this.d;
        k01 k01VarU = aj1Var.u(hq6Var);
        Object obj = hm3.I;
        Object objC = obj;
        Object objC2 = objC;
        Object objC3 = objC2;
        while (true) {
            int iL = k01VarU.l(hq6Var);
            if (iL == -1) {
                k01VarU.i(hq6Var);
                if (objC == obj) {
                    throw new nq6("Element 'first' is missing");
                }
                if (objC2 == obj) {
                    throw new nq6("Element 'second' is missing");
                }
                if (objC3 != obj) {
                    return new g38(objC, objC2, objC3);
                }
                throw new nq6("Element 'third' is missing");
            }
            if (iL == 0) {
                objC = k01VarU.C(hq6Var, 0, this.a, null);
            } else if (iL == 1) {
                objC2 = k01VarU.C(hq6Var, 1, this.b, null);
            } else {
                if (iL != 2) {
                    throw new nq6(fx3.e(iL, "Unexpected index "));
                }
                objC3 = k01VarU.C(hq6Var, 2, this.c, null);
            }
        }
    }

    @Override // o.nw3
    public final fq6 d() {
        return this.d;
    }
}
