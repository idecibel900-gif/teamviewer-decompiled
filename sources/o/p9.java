package o;

/* JADX INFO: loaded from: classes.dex */
public final class p9 extends oe8 {
    public final xc0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final fe1 f1715o;
    public final l97 p;
    public final t36 q;
    public final yx6 r;
    public final r36 s;

    public p9(int i) {
        xc0 xc0Var = new xc0((byte) 18);
        tk1 tk1Var = g22.a;
        gk1 gk1Var = gk1.f901o;
        gk1Var.getClass();
        this.n = xc0Var;
        this.f1715o = gk1Var;
        l97 l97VarK = im3.k(new o9());
        this.p = l97VarK;
        this.q = yo1.u(l97VarK);
        yx6 yx6VarL = au8.l(0, 7, null);
        this.r = yx6VarL;
        this.s = new r36(yx6VarL);
    }

    public final void V0() {
        l97 l97Var;
        Object value;
        do {
            l97Var = this.p;
            value = l97Var.getValue();
        } while (!l97Var.j(value, new o9()));
    }

    public final void W0(d37 d37Var) {
        im3.R(e8.n(this), null, null, new h0((Object) this, (Object) d37Var, (hc1) null, (byte) 6), 3);
    }

    public final void X0(boolean z) {
        while (true) {
            l97 l97Var = this.p;
            Object value = l97Var.getValue();
            boolean z2 = z;
            if (l97Var.j(value, o9.a((o9) value, null, null, null, null, false, false, false, z2, 383))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    public final void Y0(l33 l33Var) {
        boolean z;
        while (true) {
            l97 l97Var = this.p;
            Object value = l97Var.getValue();
            o9 o9Var = (o9) value;
            k33 k33Var = l33Var.a;
            if (k33Var == null) {
                break;
            }
            if (k33Var instanceof i33) {
                z = l33Var.d;
            } else if (!(k33Var instanceof h33) && !(k33Var instanceof j33)) {
                break;
            } else {
                z = true;
            }
            l33 l33Var2 = l33Var;
            if (l97Var.j(value, o9.a(o9Var, null, null, l33Var2, null, false, false, z, false, 443))) {
                return;
            } else {
                l33Var = l33Var2;
            }
        }
        gk0.s();
    }

    public p9() {
        this(0);
    }
}
