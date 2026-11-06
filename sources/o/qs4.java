package o;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class qs4 extends gi1 implements ps4 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final xd4 f1860o;
    public final wy3 p;
    public final Map q;
    public final kd5 r;
    public d22 s;
    public dd5 t;
    public final boolean u;
    public final sd4 v;
    public final kh7 w;

    public qs4(sy4 sy4Var, xd4 xd4Var, wy3 wy3Var, int i) {
        super(yl7.p, sy4Var);
        this.f1860o = xd4Var;
        this.p = wy3Var;
        if (!sy4Var.n) {
            an4.i(sy4Var, "Module name must be special: ");
            throw null;
        }
        this.q = fa2.m;
        kd5.a.getClass();
        kd5 kd5Var = (kd5) L(d82.I);
        this.r = kd5Var == null ? jd5.b : kd5Var;
        this.u = true;
        this.v = xd4Var.b(new t(this, (byte) 23));
        this.w = new kh7(new wr3(this, (byte) 1));
    }

    public final void C0() {
        if (this.u) {
            return;
        }
        if (L(ga0.u) != null) {
            io.sentry.h2.f();
        } else {
            throw new om3("Accessing invalid module descriptor " + this);
        }
    }

    @Override // o.ps4
    public final Object L(hr2 hr2Var) {
        hr2Var.getClass();
        Object obj = this.q.get(hr2Var);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // o.ps4
    public final List a0() {
        if (this.s != null) {
            return ea2.m;
        }
        String str = getName().m;
        str.getClass();
        hk0.p(str, " were not set", "Dependencies of module ");
        return null;
    }

    @Override // o.ps4
    public final boolean b0(ps4 ps4Var) {
        ps4Var.getClass();
        if (this == ps4Var) {
            return true;
        }
        this.s.getClass();
        if (lv0.h0(la2.m, ps4Var)) {
            return true;
        }
        a0();
        return ps4Var.a0().contains(this);
    }

    @Override // o.ps4
    public final Collection f(ht2 ht2Var, Function1 function1) {
        ht2Var.getClass();
        C0();
        C0();
        return ((l01) this.w.getValue()).f(ht2Var, function1);
    }

    @Override // o.ps4
    public final wy3 h() {
        return this.p;
    }

    @Override // o.fi1
    public final fi1 i() {
        return null;
    }

    @Override // o.fi1
    public final Object o(ji1 ji1Var, Object obj) {
        return ji1Var.v(obj, this);
    }

    @Override // o.gi1
    public final String toString() {
        StringBuilder sb = new StringBuilder(gi1.B0(this));
        if (!this.u) {
            sb.append(" !isValid");
        }
        sb.append(" packageFragmentProvider: ");
        dd5 dd5Var = this.t;
        sb.append(dd5Var != null ? dd5Var.getClass().getSimpleName() : null);
        return sb.toString();
    }

    @Override // o.ps4
    public final b54 y(ht2 ht2Var) {
        ht2Var.getClass();
        C0();
        return (b54) this.v.invoke(ht2Var);
    }
}
