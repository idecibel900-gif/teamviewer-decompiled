package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class s36 extends n47 {
    public final Function1 e;
    public int f;

    public s36(long j, t47 t47Var, Function1 function1) {
        super(j, t47Var);
        this.e = function1;
        this.f = 1;
    }

    @Override // o.n47
    public final void c() {
        if (this.c) {
            return;
        }
        l();
        this.c = true;
        synchronized (v47.c) {
            o();
        }
    }

    @Override // o.n47
    public final Function1 e() {
        return this.e;
    }

    @Override // o.n47
    public final boolean f() {
        return true;
    }

    @Override // o.n47
    public final Function1 i() {
        return null;
    }

    @Override // o.n47
    public final void k() {
        this.f++;
    }

    @Override // o.n47
    public final void l() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
    }

    @Override // o.n47
    public final void m() {
    }

    @Override // o.n47
    public final void n(s97 s97Var) {
        vs6 vs6Var = v47.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // o.n47
    public final n47 u(Function1 function1) {
        v47.v(this);
        return new t15(this.b, this.a, v47.i(function1, this.e, true), this);
    }
}
