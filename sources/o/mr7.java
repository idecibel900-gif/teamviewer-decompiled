package o;

/* JADX INFO: loaded from: classes.dex */
public final class mr7 implements zp7 {
    public final /* synthetic */ pr7 a;
    public final /* synthetic */ boolean b;

    public mr7(pr7 pr7Var, boolean z) {
        this.a = pr7Var;
        this.b = z;
    }

    @Override // o.zp7
    public final void a(long j, jo6 jo6Var) {
    }

    @Override // o.zp7
    public final void b() {
        pr7 pr7Var = this.a;
        pr7Var.q(null);
        pr7Var.p(null);
        pr7Var.u(true);
    }

    @Override // o.zp7
    public final void c() {
        ws7 ws7VarD;
        boolean z = this.b;
        l43 l43Var = z ? l43.n : l43.f1328o;
        pr7 pr7Var = this.a;
        pr7Var.q(l43Var);
        long jA = uo6.a(pr7Var.j(z));
        j64 j64Var = pr7Var.d;
        if (j64Var == null || (ws7VarD = j64Var.d()) == null) {
            return;
        }
        long jE = ws7VarD.e(jA);
        pr7Var.f1768o = jE;
        pr7Var.p(new t65(jE));
        pr7Var.q = 0L;
        pr7Var.t = -1;
        j64 j64Var2 = pr7Var.d;
        if (j64Var2 != null) {
            j64Var2.q.setValue(Boolean.TRUE);
        }
        pr7Var.u(false);
    }

    @Override // o.zp7
    public final void d(long j) {
        pr7 pr7Var = this.a;
        long jE = t65.e(pr7Var.q, j);
        pr7Var.q = jE;
        pr7Var.p(new t65(t65.e(pr7Var.f1768o, jE)));
        zr7 zr7VarL = pr7Var.l();
        t65 t65VarG = pr7Var.g();
        t65VarG.getClass();
        pr7Var.v(zr7VarL, t65VarG.a, false, this.b, jk0.N, true, new w43(9));
        pr7Var.u(false);
    }

    @Override // o.zp7
    public final void f() {
        pr7 pr7Var = this.a;
        pr7Var.q(null);
        pr7Var.p(null);
        pr7Var.u(true);
    }

    @Override // o.zp7
    public final void onCancel() {
    }
}
