package o;

/* JADX INFO: loaded from: classes.dex */
public final class lr7 implements zp7 {
    public final /* synthetic */ pr7 a;

    public lr7(pr7 pr7Var) {
        this.a = pr7Var;
    }

    @Override // o.zp7
    public final void a(long j, jo6 jo6Var) {
        ws7 ws7VarD;
        pr7 pr7Var = this.a;
        long jA = uo6.a(pr7Var.j(true));
        j64 j64Var = pr7Var.d;
        if (j64Var == null || (ws7VarD = j64Var.d()) == null) {
            return;
        }
        long jE = ws7VarD.e(jA);
        pr7Var.f1768o = jE;
        pr7Var.p(new t65(jE));
        pr7Var.q = 0L;
        pr7Var.q(l43.m);
        pr7Var.u(false);
    }

    @Override // o.zp7
    public final void b() {
        pr7 pr7Var = this.a;
        pr7Var.q(null);
        pr7Var.p(null);
    }

    @Override // o.zp7
    public final void c() {
    }

    @Override // o.zp7
    public final void d(long j) {
        ws7 ws7VarD;
        v43 v43Var;
        pr7 pr7Var = this.a;
        pr7Var.q = t65.e(pr7Var.q, j);
        j64 j64Var = pr7Var.d;
        if (j64Var == null || (ws7VarD = j64Var.d()) == null) {
            return;
        }
        pr7Var.p(new t65(t65.e(pr7Var.f1768o, pr7Var.q)));
        v65 v65Var = pr7Var.b;
        t65 t65VarG = pr7Var.g();
        t65VarG.getClass();
        int iK = v65Var.k(ws7VarD.b(t65VarG.a, true));
        long jA = h57.a(iK, iK);
        if (gt7.b(jA, pr7Var.l().b)) {
            return;
        }
        j64 j64Var2 = pr7Var.d;
        if ((j64Var2 == null || ((Boolean) j64Var2.q.getValue()).booleanValue()) && (v43Var = pr7Var.k) != null) {
            ((tl5) v43Var).a(9);
        }
        pr7Var.c.invoke(pr7.b(pr7Var.l().a, jA));
        pr7Var.w = new gt7(jA);
    }

    @Override // o.zp7
    public final void f() {
        pr7 pr7Var = this.a;
        pr7Var.q(null);
        pr7Var.p(null);
    }

    @Override // o.zp7
    public final void onCancel() {
    }
}
