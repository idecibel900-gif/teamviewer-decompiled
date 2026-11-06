package o;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: loaded from: classes.dex */
public final class f14 {
    public final LayoutNode a;
    public boolean b;
    public boolean c;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f760o;
    public xg4 q;
    public y04 d = y04.q;
    public final co4 p = new co4(this);

    public f14(LayoutNode layoutNode) {
        this.a = layoutNode;
    }

    public final e45 a() {
        return (e45) this.a.S.e;
    }

    public final void b() {
        y04 y04VarV = this.a.v();
        y04 y04Var = y04.f2568o;
        y04 y04Var2 = y04.p;
        if (y04VarV == y04Var || y04VarV == y04Var2) {
            if (this.p.N) {
                g(true);
            } else {
                f(true);
            }
        }
        if (y04VarV == y04Var2) {
            xg4 xg4Var = this.q;
            if (xg4Var == null || !xg4Var.H) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j) {
        xg4 xg4Var = this.q;
        if (xg4Var != null) {
            f14 f14Var = xg4Var.r;
            f14Var.d = y04.n;
            LayoutNode layoutNode = f14Var.a;
            f14Var.e = false;
            xg4Var.L = j;
            pc5 snapshotObserver = e14.a(layoutNode).getSnapshotObserver();
            vg4 vg4Var = xg4Var.M;
            snapshotObserver.a.f(layoutNode, snapshotObserver.b, vg4Var);
            f14Var.f = true;
            f14Var.g = true;
            boolean zX = io1.X(layoutNode);
            co4 co4Var = f14Var.p;
            if (zX) {
                co4Var.I = true;
                co4Var.J = true;
            } else {
                co4Var.H = true;
            }
            f14Var.d = y04.q;
        }
    }

    public final void d(int i) {
        int i2 = this.l;
        this.l = i;
        if ((i2 == 0) != (i == 0)) {
            LayoutNode layoutNodeF = this.a.F();
            f14 layoutDelegate = layoutNodeF != null ? layoutNodeF.getLayoutDelegate() : null;
            if (layoutDelegate != null) {
                int i3 = layoutDelegate.l;
                if (i == 0) {
                    layoutDelegate.d(i3 - 1);
                } else {
                    layoutDelegate.d(i3 + 1);
                }
            }
        }
    }

    public final void e(int i) {
        int i2 = this.f760o;
        this.f760o = i;
        if ((i2 == 0) != (i == 0)) {
            LayoutNode layoutNodeF = this.a.F();
            f14 layoutDelegate = layoutNodeF != null ? layoutNodeF.getLayoutDelegate() : null;
            if (layoutDelegate != null) {
                int i3 = layoutDelegate.f760o;
                if (i == 0) {
                    layoutDelegate.e(i3 - 1);
                } else {
                    layoutDelegate.e(i3 + 1);
                }
            }
        }
    }

    public final void f(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z && !this.j) {
                d(this.l + 1);
            } else {
                if (z || this.j) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z && !this.k) {
                d(this.l + 1);
            } else {
                if (z || this.k) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void h(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (z && !this.m) {
                e(this.f760o + 1);
            } else {
                if (z || this.m) {
                    return;
                }
                e(this.f760o - 1);
            }
        }
    }

    public final void i(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.n) {
                e(this.f760o + 1);
            } else {
                if (z || this.n) {
                    return;
                }
                e(this.f760o - 1);
            }
        }
    }

    public final void j() {
        co4 co4Var = this.p;
        f14 f14Var = co4Var.r;
        Object obj = co4Var.E;
        LayoutNode layoutNode = this.a;
        if ((obj != null || f14Var.a().E() != null) && co4Var.D) {
            co4Var.D = false;
            co4Var.E = f14Var.a().E();
            LayoutNode layoutNodeF = layoutNode.F();
            if (layoutNodeF != null) {
                LayoutNode.u0(layoutNodeF, false, 7);
            }
        }
        xg4 xg4Var = this.q;
        if (xg4Var != null) {
            f14 f14Var2 = xg4Var.r;
            if (xg4Var.K == null) {
                tg4 tg4VarY0 = f14Var2.a().Y0();
                tg4VarY0.getClass();
                if (tg4VarY0.G.E() == null) {
                    return;
                }
            }
            if (xg4Var.J) {
                xg4Var.J = false;
                tg4 tg4VarY1 = f14Var2.a().Y0();
                tg4VarY1.getClass();
                xg4Var.K = tg4VarY1.G.E();
                if (io1.X(layoutNode)) {
                    LayoutNode layoutNodeF2 = layoutNode.F();
                    if (layoutNodeF2 != null) {
                        LayoutNode.u0(layoutNodeF2, false, 7);
                        return;
                    }
                    return;
                }
                LayoutNode layoutNodeF3 = layoutNode.F();
                if (layoutNodeF3 != null) {
                    LayoutNode.s0(layoutNodeF3, false, 7);
                }
            }
        }
    }
}
