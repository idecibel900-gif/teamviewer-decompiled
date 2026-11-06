package o;

/* JADX INFO: loaded from: classes2.dex */
public final class zs3 extends fy2 implements rq4 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2730o;
    public int p;
    public int q;

    public /* synthetic */ zs3(byte b) {
        this.n = b;
    }

    @Override // o.fy2
    public final t1 c() {
        switch (this.n) {
            case 0:
                at3 at3VarG = g();
                if (at3VarG.a()) {
                    return at3VarG;
                }
                throw new z78();
            default:
                bt3 bt3VarH = h();
                if (bt3VarH.a()) {
                    return bt3VarH;
                }
                throw new z78();
        }
    }

    public final Object clone() {
        switch (this.n) {
            case 0:
                zs3 zs3Var = new zs3((byte) 0);
                zs3Var.i(g());
                return zs3Var;
            default:
                zs3 zs3Var2 = new zs3((byte) 1);
                zs3Var2.j(h());
                return zs3Var2;
        }
    }

    @Override // o.fy2
    public final fy2 d(vu0 vu0Var, dg2 dg2Var) throws Throwable {
        bt3 bt3Var = null;
        at3 at3Var = null;
        try {
            try {
                switch (this.n) {
                    case 0:
                        try {
                            at3.t.getClass();
                            i(new at3(vu0Var));
                            return this;
                        } catch (rm3 e) {
                            at3 at3Var2 = (at3) e.m;
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                at3Var = at3Var2;
                                if (at3Var != null) {
                                    i(at3Var);
                                }
                                throw th;
                            }
                        }
                    default:
                        try {
                            bt3.t.getClass();
                            j(new bt3(vu0Var));
                            return this;
                        } catch (rm3 e2) {
                            bt3 bt3Var2 = (bt3) e2.m;
                            try {
                                throw e2;
                            } catch (Throwable th2) {
                                th = th2;
                                bt3Var = bt3Var2;
                                if (bt3Var != null) {
                                    j(bt3Var);
                                }
                                throw th;
                            }
                        }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // o.fy2
    public final /* bridge */ /* synthetic */ fy2 e(oy2 oy2Var) {
        switch (this.n) {
            case 0:
                i((at3) oy2Var);
                break;
            default:
                j((bt3) oy2Var);
                break;
        }
        return this;
    }

    public at3 g() {
        at3 at3Var = new at3(this);
        int i = this.f2730o;
        int i2 = (i & 1) != 1 ? 0 : 1;
        at3Var.f360o = this.p;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        at3Var.p = this.q;
        at3Var.n = i2;
        return at3Var;
    }

    public bt3 h() {
        bt3 bt3Var = new bt3(this);
        int i = this.f2730o;
        int i2 = (i & 1) != 1 ? 0 : 1;
        bt3Var.f453o = this.p;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        bt3Var.p = this.q;
        bt3Var.n = i2;
        return bt3Var;
    }

    public void i(at3 at3Var) {
        if (at3Var == at3.s) {
            return;
        }
        int i = at3Var.n;
        if ((i & 1) == 1) {
            int i2 = at3Var.f360o;
            this.f2730o = 1 | this.f2730o;
            this.p = i2;
        }
        if ((i & 2) == 2) {
            int i3 = at3Var.p;
            this.f2730o = 2 | this.f2730o;
            this.q = i3;
        }
        this.m = this.m.b(at3Var.m);
    }

    public void j(bt3 bt3Var) {
        if (bt3Var == bt3.s) {
            return;
        }
        int i = bt3Var.n;
        if ((i & 1) == 1) {
            int i2 = bt3Var.f453o;
            this.f2730o = 1 | this.f2730o;
            this.p = i2;
        }
        if ((i & 2) == 2) {
            int i3 = bt3Var.p;
            this.f2730o = 2 | this.f2730o;
            this.q = i3;
        }
        this.m = this.m.b(bt3Var.m);
    }
}
