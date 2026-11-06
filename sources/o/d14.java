package o;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class d14 implements u52 {
    public final nl0 m = new nl0();
    public t52 n;

    @Override // o.in1
    public final float A0(long j) {
        return this.m.A0(j);
    }

    @Override // o.u52
    public final void B(long j, long j2, long j3, float f, int i) {
        this.m.B(j, j2, j3, f, i);
    }

    @Override // o.u52
    public final void B0(sb0 sb0Var, long j, long j2, float f, v52 v52Var, tv0 tv0Var, int i) {
        this.m.B0(sb0Var, j, j2, f, v52Var, tv0Var, i);
    }

    @Override // o.u52
    public final void E0(long j, long j2, long j3, float f, int i) {
        this.m.E0(j, j2, j3, f, i);
    }

    @Override // o.u52
    public final void G(rj rjVar, sb0 sb0Var, float f, v52 v52Var, tv0 tv0Var, int i) {
        this.m.G(rjVar, sb0Var, f, v52Var, tv0Var, i);
    }

    @Override // o.u52
    public final void G0(long j, long j2, long j3, long j4, v52 v52Var) {
        this.m.G0(j, j2, j3, j4, v52Var);
    }

    @Override // o.in1
    public final long I(float f) {
        return this.m.I(f);
    }

    @Override // o.in1
    public final float O(int i) {
        return this.m.O(i);
    }

    @Override // o.in1
    public final float R(float f) {
        return f / this.m.getDensity();
    }

    @Override // o.in1
    public final float Z() {
        return this.m.Z();
    }

    public final void a() {
        nl0 nl0Var = this.m;
        iu iuVar = nl0Var.n;
        ll0 ll0VarX = nl0Var.n.x();
        um1 um1Var = this.n;
        if (um1Var == null) {
            throw ua5.r("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        es4 es4Var = (es4) um1Var;
        es4 es4VarL0 = es4Var.m.r;
        if (es4VarL0 != null && (es4VarL0.p & 4) != 0) {
            while (true) {
                if (es4VarL0 != null) {
                    int i = es4VarL0.f737o;
                    if ((i & 2) == 0) {
                        if ((i & 4) != 0) {
                            break;
                        } else {
                            es4VarL0 = es4VarL0.r;
                        }
                    }
                }
                es4VarL0 = null;
                break;
            }
        } else {
            es4VarL0 = null;
            break;
        }
        if (es4VarL0 == null) {
            e45 e45VarN0 = vn4.n0(um1Var, 4);
            if (e45VarN0.a1() == es4Var.m) {
                e45VarN0 = e45VarN0.J;
                e45VarN0.getClass();
            }
            e45VarN0.q1(ll0VarX, (l03) iuVar.p);
            return;
        }
        xx4 xx4Var = null;
        while (es4VarL0 != null) {
            if (es4VarL0 instanceof t52) {
                t52 t52Var = (t52) es4VarL0;
                l03 l03Var = (l03) iuVar.p;
                e45 e45VarN1 = vn4.n0(t52Var, 4);
                long jA0 = xs1.a0(e45VarN1.f1179o);
                LayoutNode layoutNode = e45VarN1.G;
                layoutNode.getClass();
                e14.a(layoutNode).getSharedDrawScope().b(ll0VarX, jA0, e45VarN1, t52Var, l03Var);
            } else if ((es4VarL0.f737o & 4) != 0 && (es4VarL0 instanceof vm1)) {
                int i2 = 0;
                for (es4 es4Var2 = ((vm1) es4VarL0).B; es4Var2 != null; es4Var2 = es4Var2.r) {
                    if ((es4Var2.f737o & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            es4VarL0 = es4Var2;
                        } else {
                            if (xx4Var == null) {
                                xx4Var = new xx4(new es4[16]);
                            }
                            if (es4VarL0 != null) {
                                xx4Var.b(es4VarL0);
                                es4VarL0 = null;
                            }
                            xx4Var.b(es4Var2);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            es4VarL0 = vn4.l0(xx4Var);
        }
    }

    public final void b(ll0 ll0Var, long j, e45 e45Var, t52 t52Var, l03 l03Var) {
        t52 t52Var2 = this.n;
        this.n = t52Var;
        j04 j04Var = e45Var.G.M;
        iu iuVar = this.m.n;
        in1 in1VarZ = iuVar.z();
        j04 j04VarB = iuVar.B();
        ll0 ll0VarX = iuVar.x();
        long jD = iuVar.D();
        l03 l03Var2 = (l03) iuVar.p;
        iuVar.Q(e45Var);
        iuVar.R(j04Var);
        iuVar.P(ll0Var);
        iuVar.S(j);
        iuVar.p = l03Var;
        ll0Var.g();
        try {
            t52Var.j(this);
            ll0Var.p();
            iuVar.Q(in1VarZ);
            iuVar.R(j04VarB);
            iuVar.P(ll0VarX);
            iuVar.S(jD);
            iuVar.p = l03Var2;
            this.n = t52Var2;
        } catch (Throwable th) {
            ll0Var.p();
            iuVar.Q(in1VarZ);
            iuVar.R(j04VarB);
            iuVar.P(ll0VarX);
            iuVar.S(jD);
            iuVar.p = l03Var2;
            throw th;
        }
    }

    @Override // o.u52
    public final long d() {
        return this.m.d();
    }

    @Override // o.in1
    public final float d0(float f) {
        return this.m.getDensity() * f;
    }

    @Override // o.u52
    public final void g0(long j, Function1 function1, l03 l03Var) {
        l03Var.e(this, getLayoutDirection(), j, new m5((Object) this, (Object) this.n, (Object) function1, (byte) 24));
    }

    @Override // o.in1
    public final float getDensity() {
        return this.m.getDensity();
    }

    @Override // o.u52
    public final j04 getLayoutDirection() {
        return this.m.m.b;
    }

    @Override // o.u52
    public final iu h0() {
        return this.m.n;
    }

    @Override // o.u52
    public final void i(long j, float f, float f2, long j2, long j3, v52 v52Var) {
        this.m.i(j, f, f2, j2, j3, v52Var);
    }

    @Override // o.u52
    public final void i0(rj rjVar, long j, v52 v52Var) {
        this.m.i0(rjVar, j, v52Var);
    }

    @Override // o.in1
    public final int l0(long j) {
        return this.m.l0(j);
    }

    @Override // o.in1
    public final long q(float f) {
        return this.m.q(f);
    }

    @Override // o.in1
    public final int q0(float f) {
        return this.m.q0(f);
    }

    @Override // o.in1
    public final long r(long j) {
        return this.m.r(j);
    }

    @Override // o.u52
    public final void s0(vi viVar, long j, long j2, long j3, float f, tv0 tv0Var, int i) {
        this.m.s0(viVar, j, j2, j3, f, tv0Var, i);
    }

    @Override // o.u52
    public final long t0() {
        return this.m.t0();
    }

    @Override // o.in1
    public final float v(long j) {
        return this.m.v(j);
    }

    @Override // o.u52
    public final void w(long j, float f, long j2, v52 v52Var) {
        this.m.w(j, f, j2, v52Var);
    }

    @Override // o.in1
    public final long w0(long j) {
        return this.m.w0(j);
    }

    @Override // o.u52
    public final void y(sb0 sb0Var, long j, long j2, long j3, float f, v52 v52Var, tv0 tv0Var, int i) {
        this.m.y(sb0Var, j, j2, j3, f, v52Var, tv0Var, i);
    }

    @Override // o.u52
    public final void y0(vi viVar, long j, float f, tv0 tv0Var, int i) {
        this.m.y0(viVar, j, f, tv0Var, i);
    }
}
