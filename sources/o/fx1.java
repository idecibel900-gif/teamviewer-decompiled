package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;

/* JADX INFO: loaded from: classes.dex */
public final class fx1 extends oe8 {
    public final l97 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t36 f837o;
    public final l97 p;
    public final t36 q;
    public final yx6 r;
    public final r36 s;
    public final l97 t;

    public fx1() {
        l97 l97VarK = im3.k(new gw1(null, null, null, null));
        this.n = l97VarK;
        this.f837o = yo1.u(l97VarK);
        l97 l97VarK2 = im3.k(new xv1(false, false, false, false));
        this.p = l97VarK2;
        this.q = yo1.u(l97VarK2);
        yx6 yx6VarL = au8.l(0, 7, null);
        this.r = yx6VarL;
        this.s = new r36(yx6VarL);
        this.t = im3.k(null);
    }

    public final void V0() {
        d1(false);
        e1(false);
        c1(false);
        a1(false);
    }

    public final void W0(lx1 lx1Var) {
        im3.R(e8.n(this), null, null, new oa1((Object) this, (Object) lx1Var, (hc1) null, (byte) 14), 3);
    }

    public final void X0(k33 k33Var) {
        l97 l97Var;
        Object value;
        k33Var.getClass();
        do {
            l97Var = this.n;
            value = l97Var.getValue();
        } while (!l97Var.j(value, gw1.a((gw1) value, null, null, null, null, 13)));
        W0(new jx1(k33Var));
    }

    public final void Y0(h71 h71Var) {
        while (true) {
            l97 l97Var = this.n;
            Object value = l97Var.getValue();
            h71 h71Var2 = h71Var;
            if (l97Var.j(value, gw1.a((gw1) value, h71Var2, null, null, null, 14))) {
                W0(new gx1(h71Var2));
                return;
            }
            h71Var = h71Var2;
        }
    }

    public final void Z0(SupportSession supportSession, boolean z) {
        V0();
        while (true) {
            l97 l97Var = this.n;
            Object value = l97Var.getValue();
            SupportSession supportSession2 = supportSession;
            if (l97Var.j(value, gw1.a((gw1) value, null, null, supportSession2, null, 11))) {
                W0(new kx1(supportSession2));
                a1(z);
                return;
            }
            supportSession = supportSession2;
        }
    }

    public final void a1(boolean z) {
        while (true) {
            l97 l97Var = this.p;
            Object value = l97Var.getValue();
            boolean z2 = z;
            if (l97Var.j(value, xv1.a((xv1) value, false, false, false, z2, 7))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    public final void b1() {
        l97 l97Var;
        Object value;
        xv1 xv1Var;
        do {
            l97Var = this.p;
            value = l97Var.getValue();
            xv1Var = (xv1) value;
        } while (!l97Var.j(value, xv1.a(xv1Var, false, false, false, !xv1Var.d, 7)));
    }

    public final void c1(boolean z) {
        while (true) {
            l97 l97Var = this.p;
            Object value = l97Var.getValue();
            boolean z2 = z;
            if (l97Var.j(value, xv1.a((xv1) value, false, false, z2, false, 11))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    public final void d1(boolean z) {
        while (true) {
            l97 l97Var = this.p;
            Object value = l97Var.getValue();
            boolean z2 = z;
            if (l97Var.j(value, xv1.a((xv1) value, z2, false, false, false, 14))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    public final void e1(boolean z) {
        while (true) {
            l97 l97Var = this.p;
            Object value = l97Var.getValue();
            boolean z2 = z;
            if (l97Var.j(value, xv1.a((xv1) value, false, z2, false, false, 13))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    public final void f1(tx1 tx1Var) {
        while (true) {
            l97 l97Var = this.n;
            Object value = l97Var.getValue();
            tx1 tx1Var2 = tx1Var;
            if (l97Var.j(value, gw1.a((gw1) value, null, null, null, tx1Var2, 7))) {
                return;
            } else {
                tx1Var = tx1Var2;
            }
        }
    }
}
