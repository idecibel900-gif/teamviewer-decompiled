package o;

import androidx.lifecycle.LiveData;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class kl7 extends oe8 implements gd3 {
    public final Date n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final qf2 f1279o;
    public final ep3 p;

    public kl7(mo7 mo7Var) {
        du6 du6VarT;
        this.n = (mo7Var == null || (du6VarT = mo7Var.t()) == null) ? null : du6VarT.i;
        this.f1279o = new qf2(new y26(this, (byte) 25));
        ep3 ep3Var = new ep3(new io.sentry.u(this, (byte) 1));
        this.p = ep3Var;
        synchronized (ep3Var.p) {
            ep3Var.F();
            io.sentry.u uVar = new io.sentry.u(ep3Var, (byte) 2);
            ep3Var.f733o = uVar;
            p53.a.schedule(uVar, 0L, 1000L);
        }
    }

    @Override // o.oe8
    public final void U0() {
        this.p.F();
    }

    @Override // o.gd3
    public final LiveData Y() {
        return this.f1279o;
    }
}
