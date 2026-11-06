package o;

import androidx.compose.ui.node.LayoutNode;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class tg4 extends rg4 implements zn4 {
    public final e45 G;
    public LinkedHashMap I;
    public eo4 K;
    public final vw4 L;
    public long H = 0;
    public final ug4 J = new ug4(this);

    public tg4(e45 e45Var) {
        this.G = e45Var;
        vw4 vw4Var = h65.a;
        this.L = new vw4();
    }

    @Override // o.rg4
    public final LayoutNode D0() {
        return this.G.G;
    }

    @Override // o.jl5, o.zn4
    public final Object E() {
        return this.G.E();
    }

    @Override // o.rg4
    public final eo4 F0() {
        eo4 eo4Var = this.K;
        if (eo4Var != null) {
            return eo4Var;
        }
        throw ua5.r("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // o.rg4
    public final rg4 I0() {
        e45 e45Var = this.G.K;
        if (e45Var != null) {
            return e45Var.Y0();
        }
        return null;
    }

    @Override // o.rg4
    public final long J0() {
        return this.H;
    }

    @Override // o.rg4
    public final void N0() {
        c0(this.H, 0.0f, null);
    }

    public final long P0() {
        return (((long) this.m) << 32) | (((long) this.n) & 4294967295L);
    }

    public void Q0() {
        F0().d();
    }

    public final void R0(long j) {
        if (!vk3.a(this.H, j)) {
            this.H = j;
            e45 e45Var = this.G;
            xg4 xg4Var = e45Var.G.getLayoutDelegate().q;
            if (xg4Var != null) {
                xg4Var.u0();
            }
            rg4.L0(e45Var);
        }
        if (this.A) {
            return;
        }
        u0(F0());
    }

    public final long S0(tg4 tg4Var, boolean z) {
        long jC = 0;
        while (!this.equals(tg4Var)) {
            if (!this.x || !z) {
                jC = vk3.c(jC, this.H);
            }
            e45 e45Var = this.G.K;
            e45Var.getClass();
            this = e45Var.Y0();
            this.getClass();
        }
        return jC;
    }

    public final void T0(eo4 eo4Var) {
        LinkedHashMap linkedHashMap;
        if (eo4Var != null) {
            f0((((long) eo4Var.a()) & 4294967295L) | (((long) eo4Var.b()) << 32));
        } else {
            f0(0L);
        }
        if (!im3.n(this.K, eo4Var) && eo4Var != null && ((((linkedHashMap = this.I) != null && !linkedHashMap.isEmpty()) || !eo4Var.c().isEmpty()) && !im3.n(eo4Var.c(), this.I))) {
            xg4 xg4Var = this.G.G.getLayoutDelegate().q;
            xg4Var.getClass();
            xg4Var.E.f();
            LinkedHashMap linkedHashMap2 = this.I;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                this.I = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(eo4Var.c());
        }
        this.K = eo4Var;
    }

    @Override // o.in1
    public final float Z() {
        return this.G.Z();
    }

    @Override // o.rg4, o.bm3
    public final boolean b0() {
        return true;
    }

    @Override // o.jl5
    public final void c0(long j, float f, Function1 function1) {
        R0(j);
        if (this.z) {
            return;
        }
        Q0();
    }

    @Override // o.in1
    public final float getDensity() {
        return this.G.getDensity();
    }

    @Override // o.bm3
    public final j04 getLayoutDirection() {
        return this.G.G.M;
    }

    @Override // o.rg4
    public final rg4 v0() {
        e45 e45Var = this.G.J;
        if (e45Var != null) {
            return e45Var.Y0();
        }
        return null;
    }

    @Override // o.rg4
    public final i04 x0() {
        return this.J;
    }

    @Override // o.rg4
    public final boolean z0() {
        return this.K != null;
    }
}
