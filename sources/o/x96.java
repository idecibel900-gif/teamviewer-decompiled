package o;

/* JADX INFO: loaded from: classes.dex */
public final class x96 implements me1, t96 {
    public static final kl0 p = new kl0(0);
    public final de1 m;
    public final x96 n = this;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile de1 f2496o;

    public x96(de1 de1Var) {
        this.m = de1Var;
    }

    @Override // o.t96
    public final void a() {
        d();
    }

    @Override // o.t96
    public final void b() {
        d();
    }

    @Override // o.t96
    public final void c() {
    }

    public final void d() {
        synchronized (this.n) {
            try {
                de1 de1Var = this.f2496o;
                if (de1Var == null) {
                    this.f2496o = p;
                } else {
                    ds1.A(de1Var, new ws2());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.me1
    public final de1 getCoroutineContext() {
        de1 de1VarH0;
        de1 de1Var = this.f2496o;
        if (de1Var == null || de1Var == p) {
            q01 q01Var = (q01) this.m.l0(q01.n);
            de1 w96Var = q01Var != null ? new w96(q01Var, this) : ba2.m;
            synchronized (this.n) {
                try {
                    de1 de1Var2 = this.f2496o;
                    if (de1Var2 == null) {
                        de1 de1Var3 = this.m;
                        de1VarH0 = de1Var3.H0(new dp3((bp3) de1Var3.l0(z06.z))).H0(ba2.m).H0(w96Var);
                    } else if (de1Var2 == p) {
                        de1 de1Var4 = this.m;
                        dp3 dp3Var = new dp3((bp3) de1Var4.l0(z06.z));
                        dp3Var.i(new ws2());
                        de1VarH0 = de1Var4.H0(dp3Var).H0(ba2.m).H0(w96Var);
                    } else {
                        de1VarH0 = de1Var2;
                    }
                    this.f2496o = de1VarH0;
                } catch (Throwable th) {
                    throw th;
                }
            }
            de1Var = de1VarH0;
        }
        de1Var.getClass();
        return de1Var;
    }
}
