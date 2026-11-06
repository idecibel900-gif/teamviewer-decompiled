package o;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class e22 implements Executor {
    public final fe1 m;

    public e22(fe1 fe1Var) {
        this.m = fe1Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        fe1 fe1Var = this.m;
        ba2 ba2Var = ba2.m;
        if (ga0.v(fe1Var, ba2Var)) {
            ga0.u(fe1Var, ba2Var, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.m.toString();
    }
}
