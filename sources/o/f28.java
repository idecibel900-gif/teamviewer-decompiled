package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class f28 extends n47 {
    public final n47 e;
    public final boolean f;
    public final boolean g;
    public Function1 h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f28(n47 n47Var, Function1 function1, boolean z, boolean z2) {
        Function1 function1E;
        super(0L, t47.q);
        vs6 vs6Var = v47.a;
        this.e = n47Var;
        this.f = z;
        this.g = z2;
        this.h = v47.i(function1, (n47Var == null || (function1E = n47Var.e()) == null) ? v47.j.e : function1E, z);
        this.i = o67.f();
    }

    @Override // o.n47
    public final void c() {
        n47 n47Var;
        this.c = true;
        if (!this.g || (n47Var = this.e) == null) {
            return;
        }
        n47Var.c();
    }

    @Override // o.n47
    public final t47 d() {
        return v().d();
    }

    @Override // o.n47
    public final Function1 e() {
        return this.h;
    }

    @Override // o.n47
    public final boolean f() {
        return v().f();
    }

    @Override // o.n47
    public final long g() {
        return v().g();
    }

    @Override // o.n47
    public final Function1 i() {
        return null;
    }

    @Override // o.n47
    public final void k() {
        j51.X();
        throw null;
    }

    @Override // o.n47
    public final void l() {
        j51.X();
        throw null;
    }

    @Override // o.n47
    public final void m() {
        v().m();
    }

    @Override // o.n47
    public final void n(s97 s97Var) {
        v().n(s97Var);
    }

    @Override // o.n47
    public final n47 u(Function1 function1) {
        Function1 function1I = v47.i(function1, this.h, true);
        return !this.f ? v47.e(v().u(null), function1I, true) : v().u(function1I);
    }

    public final n47 v() {
        n47 n47Var = this.e;
        return n47Var == null ? v47.j : n47Var;
    }
}
