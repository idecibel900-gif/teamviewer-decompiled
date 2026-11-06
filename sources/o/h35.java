package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class h35 extends g07 implements am0 {
    public final ul0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i35 f947o;
    public final m98 p;
    public final g48 q;
    public final boolean r;
    public final boolean s;

    /* JADX WARN: Illegal instructions before constructor call */
    public h35(ul0 ul0Var, i35 i35Var, m98 m98Var, g48 g48Var, boolean z, int i) {
        if ((i & 8) != 0) {
            g48.n.getClass();
            g48Var = g48.f858o;
        }
        this(ul0Var, i35Var, m98Var, g48Var, (i & 16) != 0 ? false : z, false);
    }

    @Override // o.oz3
    public final zo4 I() {
        return hd2.a(dd2.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // o.oz3
    public final List m0() {
        return ea2.m;
    }

    @Override // o.oz3
    public final g48 n0() {
        return this.q;
    }

    @Override // o.oz3
    public final k48 o0() {
        return this.f947o;
    }

    @Override // o.oz3
    public final boolean p0() {
        return this.r;
    }

    @Override // o.g07, o.m98
    public final m98 s0(boolean z) {
        return new h35(this.n, this.f947o, this.p, this.q, z, 32);
    }

    @Override // o.g07
    /* JADX INFO: renamed from: v0 */
    public final g07 s0(boolean z) {
        return new h35(this.n, this.f947o, this.p, this.q, z, 32);
    }

    @Override // o.m98
    /* JADX INFO: renamed from: w0 */
    public final g07 u0(g48 g48Var) {
        g48Var.getClass();
        return new h35(this.n, this.f947o, this.p, g48Var, this.r, this.s);
    }

    @Override // o.m98
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final h35 q0(uz3 uz3Var) {
        i35 i35Var = this.f947o;
        h58 h58VarD = i35Var.a.d(uz3Var);
        e3 e3Var = i35Var.b != null ? new e3((byte) 18, i35Var, uz3Var, false) : null;
        i35 i35Var2 = i35Var.c;
        if (i35Var2 == null) {
            i35Var2 = i35Var;
        }
        i35 i35Var3 = new i35(h58VarD, e3Var, i35Var2, i35Var.d);
        m98 m98Var = this.p;
        return new h35(this.n, i35Var3, m98Var != null ? m98Var : null, this.q, this.r, 32);
    }

    public h35(ul0 ul0Var, i35 i35Var, m98 m98Var, g48 g48Var, boolean z, boolean z2) {
        ul0Var.getClass();
        i35Var.getClass();
        g48Var.getClass();
        this.n = ul0Var;
        this.f947o = i35Var;
        this.p = m98Var;
        this.q = g48Var;
        this.r = z;
        this.s = z2;
    }
}
