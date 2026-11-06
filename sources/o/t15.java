package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class t15 extends n47 {
    public final Function1 e;
    public final n47 f;

    public t15(long j, t47 t47Var, Function1 function1, n47 n47Var) {
        super(j, t47Var);
        this.e = function1;
        this.f = n47Var;
        n47Var.k();
    }

    @Override // o.n47
    public final void c() {
        n47 n47Var = this.f;
        if (this.c) {
            return;
        }
        if (this.b != n47Var.g()) {
            a();
        }
        n47Var.l();
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
    public final n47 u(Function1 function1) {
        return new t15(this.b, this.a, v47.i(function1, this.e, true), this.f);
    }
}
