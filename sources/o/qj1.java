package o;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class qj1 implements qi0 {
    public final Executor m;
    public final qi0 n;

    public qj1(Executor executor, qi0 qi0Var) {
        this.m = executor;
        this.n = qi0Var;
    }

    @Override // o.qi0
    public final boolean G() {
        return this.n.G();
    }

    @Override // o.qi0
    public final void b0(cj0 cj0Var) {
        this.n.b0(new wk0(this, cj0Var));
    }

    @Override // o.qi0
    public final void cancel() {
        this.n.cancel();
    }

    @Override // o.qi0
    public final qi0 clone() {
        return new qj1(this.m, this.n.clone());
    }

    @Override // o.qi0
    public final kc6 f() {
        return this.n.f();
    }

    @Override // o.qi0
    public final ab6 l0() {
        return this.n.l0();
    }
}
