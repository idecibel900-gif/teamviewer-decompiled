package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class e28 extends ox4 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ox4 f673o;
    public final boolean p;
    public final boolean q;
    public Function1 r;
    public Function1 s;
    public final long t;

    /* JADX WARN: Illegal instructions before constructor call */
    public e28(ox4 ox4Var, Function1 function1, Function1 function2, boolean z, boolean z2) {
        Function1 function1I;
        Function1 function1Y;
        vs6 vs6Var = v47.a;
        super(0L, t47.q, v47.i(function1, (ox4Var == null || (function1Y = ox4Var.e()) == null) ? v47.j.e : function1Y, z), v47.j(function2, (ox4Var == null || (function1I = ox4Var.i()) == null) ? v47.j.f : function1I));
        this.f673o = ox4Var;
        this.p = z;
        this.q = z2;
        this.r = this.e;
        this.s = this.f;
        this.t = o67.f();
    }

    @Override // o.ox4
    public final void B(kx4 kx4Var) {
        j51.X();
        throw null;
    }

    @Override // o.ox4
    public final ox4 C(Function1 function1, Function1 function2) {
        Function1 function1I = v47.i(function1, this.r, true);
        Function1 function1J = v47.j(function2, this.s);
        return !this.p ? new e28(D().C(null, function1J), function1I, function1J, false, true) : D().C(function1I, function1J);
    }

    public final ox4 D() {
        ox4 ox4Var = this.f673o;
        return ox4Var == null ? v47.j : ox4Var;
    }

    @Override // o.ox4, o.n47
    public final void c() {
        ox4 ox4Var;
        this.c = true;
        if (!this.q || (ox4Var = this.f673o) == null) {
            return;
        }
        ox4Var.c();
    }

    @Override // o.n47
    public final t47 d() {
        return D().d();
    }

    @Override // o.ox4, o.n47
    public final Function1 e() {
        return this.r;
    }

    @Override // o.n47
    public final boolean f() {
        return D().f();
    }

    @Override // o.n47
    public final long g() {
        return D().g();
    }

    @Override // o.ox4, o.n47
    public final int h() {
        return D().h();
    }

    @Override // o.ox4, o.n47
    public final Function1 i() {
        return this.s;
    }

    @Override // o.ox4, o.n47
    public final void k() {
        j51.X();
        throw null;
    }

    @Override // o.ox4, o.n47
    public final void l() {
        j51.X();
        throw null;
    }

    @Override // o.ox4, o.n47
    public final void m() {
        D().m();
    }

    @Override // o.ox4, o.n47
    public final void n(s97 s97Var) {
        D().n(s97Var);
    }

    @Override // o.n47
    public final void r(t47 t47Var) {
        j51.X();
        throw null;
    }

    @Override // o.n47
    public final void s(long j) {
        j51.X();
        throw null;
    }

    @Override // o.ox4, o.n47
    public final void t(int i) {
        D().t(i);
    }

    @Override // o.ox4, o.n47
    public final n47 u(Function1 function1) {
        Function1 function1I = v47.i(function1, this.r, true);
        return !this.p ? v47.e(D().u(null), function1I, true) : D().u(function1I);
    }

    @Override // o.ox4
    public final r47 w() {
        return D().w();
    }

    @Override // o.ox4
    public final kx4 x() {
        return D().x();
    }

    @Override // o.ox4
    /* JADX INFO: renamed from: y */
    public final Function1 e() {
        return this.r;
    }
}
