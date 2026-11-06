package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class sl0 implements u20 {
    public final /* synthetic */ tl0 a;

    public sl0(tl0 tl0Var) {
        this.a = tl0Var;
    }

    @Override // o.u20
    public final void a(List list) {
    }

    @Override // o.u20
    public final void b(x20 x20Var) {
        tl0 tl0Var = this.a;
        tl0Var.b.m.c();
        q50 q50Var = tl0Var.i;
        synchronized (q50Var) {
            if (q50Var.b) {
                q50Var.a();
            }
        }
        tl0Var.j.post(new io.sentry.u4((Object) this, (Object) x20Var, (byte) 19));
    }
}
