package o;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class u04 extends e45 {
    public static final gy8 u0;
    public r04 q0;
    public r61 r0;
    public s04 s0;
    public qv t0;

    static {
        gy8 gy8VarK = ka0.k();
        int i = rv0.i;
        gy8VarK.l(rv0.f);
        gy8VarK.r(1.0f);
        gy8VarK.s(1);
        u0 = gy8VarK;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u04(LayoutNode layoutNode, r04 r04Var) {
        super(layoutNode);
        this.q0 = r04Var;
        this.s0 = layoutNode.u != null ? new s04(this) : null;
        this.t0 = (((es4) r04Var).m.f737o & 512) != 0 ? new qv(this, (xm) r04Var) : null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0088  */
    @Override // o.zn4
    public final jl5 C(long j) {
        eo4 eo4VarA;
        r61 r61Var;
        boolean z;
        if (this.I) {
            r61 r61Var2 = this.r0;
            if (r61Var2 == null) {
                hk0.g("Lookahead constraints cannot be null in approach pass.");
                return null;
            }
            j = r61Var2.a;
        }
        j0(j);
        qv qvVar = this.t0;
        if (qvVar != null) {
            xm xmVar = qvVar.n;
            s04 s04Var = qvVar.m.s0;
            s04Var.getClass();
            eo4 eo4VarF0 = s04Var.F0();
            eo4VarF0.b();
            eo4VarF0.a();
            boolean z2 = (xmVar.D && ((Number) xmVar.A.a()).floatValue() != 1.0f) || (r61Var = this.r0) == null || j != r61Var.a;
            qvVar.f1869o = z2;
            if (!z2) {
                e45 e45Var = this.J;
                e45Var.getClass();
                e45Var.I = true;
            }
            e45 e45Var2 = this.J;
            e45Var2.getClass();
            eo4VarA = xmVar.U0(qvVar, e45Var2, j);
            e45 e45Var3 = this.J;
            e45Var3.getClass();
            e45Var3.I = false;
            int iB = eo4VarA.b();
            s04 s04Var2 = this.s0;
            s04Var2.getClass();
            if (iB == s04Var2.m) {
                int iA = eo4VarA.a();
                s04 s04Var3 = this.s0;
                s04Var3.getClass();
                z = iA == s04Var3.n;
            }
            if (!qvVar.f1869o) {
                e45 e45Var4 = this.J;
                e45Var4.getClass();
                long j2 = e45Var4.f1179o;
                e45 e45Var5 = this.J;
                e45Var5.getClass();
                tg4 tg4VarY0 = e45Var5.Y0();
                if (dl3.a(j2, tg4VarY0 != null ? new dl3(tg4VarY0.P0()) : null) && !z) {
                    eo4VarA = new t04(eo4VarA, this);
                }
            }
        } else {
            r04 r04Var = this.q0;
            e45 e45Var6 = this.J;
            e45Var6.getClass();
            eo4VarA = r04Var.a(this, e45Var6, j);
        }
        u1(eo4VarA);
        l1();
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    public final void D1() {
        boolean z;
        if (this.z) {
            return;
        }
        m1();
        e45 e45Var = this.J;
        e45Var.getClass();
        qv qvVar = this.t0;
        if (qvVar != null) {
            xm xmVar = qvVar.n;
            this.s0.getClass();
            if ((!xmVar.D || ((Number) xmVar.A.a()).floatValue() == 1.0f) && !qvVar.f1869o) {
                long j = this.f1179o;
                s04 s04Var = this.s0;
                if (dl3.a(j, s04Var != null ? new dl3(s04Var.P0()) : null)) {
                    long j2 = e45Var.f1179o;
                    tg4 tg4VarY0 = e45Var.Y0();
                    if (dl3.a(j2, tg4VarY0 != null ? new dl3(tg4VarY0.P0()) : null)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            e45Var.H = z;
        }
        boolean z2 = e45Var.A;
        e45Var.A = this.A;
        F0().d();
        e45Var.A = z2;
        e45Var.H = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E1(r04 r04Var) {
        if (!r04Var.equals(this.q0)) {
            if ((((es4) r04Var).m.f737o & 512) != 0) {
                xm xmVar = (xm) r04Var;
                qv qvVar = this.t0;
                if (qvVar != null) {
                    qvVar.n = xmVar;
                } else {
                    qvVar = new qv(this, xmVar);
                }
                this.t0 = qvVar;
            } else {
                this.t0 = null;
            }
        }
        this.q0 = r04Var;
    }

    @Override // o.zn4
    public final int V(int i) {
        qv qvVar = this.t0;
        if (qvVar == null) {
            r04 r04Var = this.q0;
            e45 e45Var = this.J;
            e45Var.getClass();
            return r04Var.r0(this, e45Var, i);
        }
        xm xmVar = qvVar.n;
        e45 e45Var2 = this.J;
        e45Var2.getClass();
        e45 e45Var3 = xmVar.m.t;
        e45Var3.getClass();
        tg4 tg4VarY0 = e45Var3.Y0();
        tg4VarY0.getClass();
        if (!tg4VarY0.z0()) {
            return e45Var2.V(i);
        }
        return xmVar.U0(new nv(qvVar, qvVar.getLayoutDirection()), new fk1(e45Var2, m45.m, n45.n, (byte) 2), t61.b(0, i, 0, 0, 13)).a();
    }

    @Override // o.e45
    public final void V0() {
        if (this.s0 == null) {
            this.s0 = new s04(this);
        }
    }

    @Override // o.e45
    public final tg4 Y0() {
        return this.s0;
    }

    @Override // o.zn4
    public final int a(int i) {
        qv qvVar = this.t0;
        if (qvVar == null) {
            r04 r04Var = this.q0;
            e45 e45Var = this.J;
            e45Var.getClass();
            return r04Var.g(this, e45Var, i);
        }
        xm xmVar = qvVar.n;
        e45 e45Var2 = this.J;
        e45Var2.getClass();
        e45 e45Var3 = xmVar.m.t;
        e45Var3.getClass();
        tg4 tg4VarY0 = e45Var3.Y0();
        tg4VarY0.getClass();
        if (!tg4VarY0.z0()) {
            return e45Var2.a(i);
        }
        return xmVar.U0(new nv(qvVar, qvVar.getLayoutDirection()), new fk1(e45Var2, m45.n, n45.n, (byte) 2), t61.b(0, i, 0, 0, 13)).a();
    }

    @Override // o.e45
    public final es4 a1() {
        return ((es4) this.q0).m;
    }

    @Override // o.jl5
    public final void c0(long j, float f, Function1 function1) {
        if (this.H) {
            tg4 tg4VarY0 = Y0();
            tg4VarY0.getClass();
            r1(tg4VarY0.H, f, function1, null);
        } else {
            r1(j, f, function1, null);
        }
        D1();
    }

    @Override // o.e45, o.jl5
    public final void e0(long j, float f, l03 l03Var) {
        u04 u04Var;
        if (this.H) {
            tg4 tg4VarY0 = Y0();
            tg4VarY0.getClass();
            u04Var = this;
            u04Var.r1(tg4VarY0.H, f, null, l03Var);
        } else {
            u04Var = this;
            u04Var.r1(j, f, null, l03Var);
        }
        u04Var.D1();
    }

    @Override // o.zn4
    public final int k(int i) {
        qv qvVar = this.t0;
        if (qvVar == null) {
            r04 r04Var = this.q0;
            e45 e45Var = this.J;
            e45Var.getClass();
            return r04Var.H(this, e45Var, i);
        }
        xm xmVar = qvVar.n;
        e45 e45Var2 = this.J;
        e45Var2.getClass();
        e45 e45Var3 = xmVar.m.t;
        e45Var3.getClass();
        tg4 tg4VarY0 = e45Var3.Y0();
        tg4VarY0.getClass();
        if (!tg4VarY0.z0()) {
            return e45Var2.k(i);
        }
        return xmVar.U0(new nv(qvVar, qvVar.getLayoutDirection()), new fk1(e45Var2, m45.m, n45.m, (byte) 2), t61.b(0, 0, 0, i, 7)).b();
    }

    @Override // o.zn4
    public final int o(int i) {
        qv qvVar = this.t0;
        if (qvVar == null) {
            r04 r04Var = this.q0;
            e45 e45Var = this.J;
            e45Var.getClass();
            return r04Var.a0(this, e45Var, i);
        }
        xm xmVar = qvVar.n;
        e45 e45Var2 = this.J;
        e45Var2.getClass();
        e45 e45Var3 = xmVar.m.t;
        e45Var3.getClass();
        tg4 tg4VarY0 = e45Var3.Y0();
        tg4VarY0.getClass();
        if (!tg4VarY0.z0()) {
            return e45Var2.o(i);
        }
        return xmVar.U0(new nv(qvVar, qvVar.getLayoutDirection()), new fk1(e45Var2, m45.n, n45.m, (byte) 2), t61.b(0, 0, 0, i, 7)).b();
    }

    @Override // o.rg4
    public final int p0(ie ieVar) {
        s04 s04Var = this.s0;
        if (s04Var == null) {
            return lv1.F(this, ieVar);
        }
        vw4 vw4Var = s04Var.L;
        int iD = vw4Var.d(ieVar);
        if (iD >= 0) {
            return vw4Var.c[iD];
        }
        return Integer.MIN_VALUE;
    }

    @Override // o.e45
    public final void q1(ll0 ll0Var, l03 l03Var) {
        e45 e45Var;
        e45 e45Var2 = this.J;
        e45Var2.getClass();
        e45Var2.T0(ll0Var, l03Var);
        if (!e14.a(this.G).getShowLayoutBounds() || (e45Var = this.J) == null) {
            return;
        }
        if (dl3.b(this.f1179o, e45Var.f1179o) && vk3.a(e45Var.T, 0L)) {
            return;
        }
        long j = this.f1179o;
        ll0Var.q(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, u0);
    }
}
