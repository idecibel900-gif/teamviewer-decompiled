package o;

/* JADX INFO: loaded from: classes.dex */
public final class nr7 implements zp7 {
    public gt7 b;
    public final /* synthetic */ pr7 d;
    public boolean a = true;
    public jo6 c = jk0.K;

    public nr7(pr7 pr7Var) {
        this.d = pr7Var;
    }

    @Override // o.zp7
    public final void a(long j, jo6 jo6Var) {
        long j2;
        ws7 ws7VarD;
        ws7 ws7VarD2;
        pr7 pr7Var = this.d;
        if (pr7Var.i() && ((l43) pr7Var.r.getValue()) == null) {
            pr7Var.q(l43.f1328o);
            pr7Var.t = -1;
            this.a = true;
            this.c = jo6Var;
            pr7Var.m();
            j64 j64Var = pr7Var.d;
            if (j64Var == null || (ws7VarD2 = j64Var.d()) == null || !ws7VarD2.c(j)) {
                j2 = j;
                j64 j64Var2 = pr7Var.d;
                if (j64Var2 != null && (ws7VarD = j64Var2.d()) != null) {
                    int iK = pr7Var.b.k(ws7VarD.b(j2, true));
                    zr7 zr7VarB = pr7.b(pr7Var.l().a, h57.a(iK, iK));
                    pr7Var.e(false);
                    v43 v43Var = pr7Var.k;
                    if (v43Var != null) {
                        ((tl5) v43Var).a(0);
                    }
                    pr7Var.c.invoke(zr7VarB);
                    pr7Var.w = new gt7(zr7VarB.b);
                }
                this.a = false;
            } else {
                if (pr7Var.l().a.n.length() == 0) {
                    return;
                }
                pr7Var.e(false);
                long jV = pr7Var.v(zr7.a(pr7Var.l(), null, gt7.b, 5), j, true, false, this.c, true, new w43(0));
                j2 = j;
                pr7Var.p = new gt7(jV);
                this.b = new gt7(jV);
            }
            pr7Var.r(n43.m);
            pr7Var.f1768o = j2;
            pr7Var.p(new t65(j2));
            pr7Var.q = 0L;
        }
    }

    @Override // o.zp7
    public final void b() {
    }

    @Override // o.zp7
    public final void c() {
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0094  */
    /* JADX WARN: Code duplicated, block: B:23:0x0098  */
    /* JADX WARN: Code duplicated, block: B:24:0x009f  */
    @Override // o.zp7
    public final void d(long j) {
        ws7 ws7VarD;
        gt7 gt7Var;
        int iB;
        long jV;
        pr7 pr7Var = this.d;
        if (!pr7Var.i() || pr7Var.l().a.n.length() == 0) {
            return;
        }
        pr7Var.q = t65.e(pr7Var.q, j);
        j64 j64Var = pr7Var.d;
        if (j64Var != null && (ws7VarD = j64Var.d()) != null) {
            pr7Var.p(new t65(t65.e(pr7Var.f1768o, pr7Var.q)));
            if (pr7Var.p == null) {
                t65 t65VarG = pr7Var.g();
                t65VarG.getClass();
                if (ws7VarD.c(t65VarG.a)) {
                    gt7Var = pr7Var.p;
                    if (gt7Var != null) {
                        iB = (int) (gt7Var.a >> 32);
                    } else {
                        iB = ws7VarD.b(pr7Var.f1768o, false);
                    }
                    t65 t65VarG2 = pr7Var.g();
                    t65VarG2.getClass();
                    int iB2 = ws7VarD.b(t65VarG2.a, false);
                    if (pr7Var.p != null && iB == iB2) {
                        return;
                    }
                    zr7 zr7VarL = pr7Var.l();
                    t65 t65VarG3 = pr7Var.g();
                    t65VarG3.getClass();
                    jV = pr7Var.v(zr7VarL, t65VarG3.a, false, false, this.c, true, new w43(9));
                } else {
                    int iK = pr7Var.b.k(ws7VarD.b(pr7Var.f1768o, true));
                    v65 v65Var = pr7Var.b;
                    t65 t65VarG4 = pr7Var.g();
                    t65VarG4.getClass();
                    jo6 jo6Var = iK == v65Var.k(ws7VarD.b(t65VarG4.a, true)) ? jk0.K : jk0.L;
                    zr7 zr7VarL2 = pr7Var.l();
                    t65 t65VarG5 = pr7Var.g();
                    t65VarG5.getClass();
                    jV = pr7Var.v(zr7VarL2, t65VarG5.a, false, false, jo6Var, true, new w43(9));
                }
            } else {
                gt7Var = pr7Var.p;
                if (gt7Var != null) {
                    iB = (int) (gt7Var.a >> 32);
                } else {
                    iB = ws7VarD.b(pr7Var.f1768o, false);
                }
                t65 t65VarG6 = pr7Var.g();
                t65VarG6.getClass();
                int iB3 = ws7VarD.b(t65VarG6.a, false);
                if (pr7Var.p != null) {
                }
                zr7 zr7VarL3 = pr7Var.l();
                t65 t65VarG7 = pr7Var.g();
                t65VarG7.getClass();
                jV = pr7Var.v(zr7VarL3, t65VarG7.a, false, false, this.c, true, new w43(9));
            }
            this.b = new gt7(jV);
            if (!gt7.a(jV, pr7Var.p)) {
                this.a = false;
            }
        }
        pr7Var.u(false);
    }

    public final void e() {
        pr7 pr7Var = this.d;
        pr7Var.q(null);
        pr7Var.p(null);
        this.c = jk0.K;
        pr7Var.u(true);
        gt7 gt7Var = this.b;
        boolean zC = gt7.c(gt7Var != null ? gt7Var.a : pr7Var.l().b);
        pr7Var.r(zC ? n43.f1537o : n43.n);
        j64 j64Var = pr7Var.d;
        if (j64Var != null) {
            j64Var.m.setValue(Boolean.valueOf(!zC && l47.p(pr7Var, true)));
        }
        j64 j64Var2 = pr7Var.d;
        if (j64Var2 != null) {
            j64Var2.n.setValue(Boolean.valueOf(!zC && l47.p(pr7Var, false)));
        }
        j64 j64Var3 = pr7Var.d;
        if (j64Var3 != null) {
            j64Var3.f1135o.setValue(Boolean.valueOf(zC && l47.p(pr7Var, true)));
        }
        if (this.a) {
            pr7Var.n(pr7Var.p);
        }
        pr7Var.p = null;
    }

    @Override // o.zp7
    public final void f() {
        e();
    }

    @Override // o.zp7
    public final void onCancel() {
        e();
    }
}
