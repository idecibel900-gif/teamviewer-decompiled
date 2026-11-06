package o;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class nt2 extends f8 {
    public final /* synthetic */ AtomicReference a;

    public nt2(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // o.f8
    public final void a(Object obj, df6 df6Var) {
        f8 f8Var = (f8) this.a.get();
        if (f8Var != null) {
            f8Var.a(obj, df6Var);
        } else {
            hk0.l("Operation cannot be started before fragment is in created state");
        }
    }
}
