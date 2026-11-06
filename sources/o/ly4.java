package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class ly4 implements fl0, ug8 {
    public final gl0 m;
    public final /* synthetic */ my4 n;

    public ly4(my4 my4Var, gl0 gl0Var) {
        this.n = my4Var;
        this.m = gl0Var;
    }

    @Override // o.ug8
    public final void a(tn6 tn6Var, int i) {
        this.m.a(tn6Var, i);
    }

    @Override // o.fl0
    public final boolean f(Throwable th) {
        return this.m.f(th);
    }

    @Override // o.fl0
    public final void g(Object obj, iw2 iw2Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = my4.u;
        my4 my4Var = this.n;
        atomicReferenceFieldUpdater.set(my4Var, null);
        fj3 fj3Var = new fj3(my4Var, this);
        gl0 gl0Var = this.m;
        gl0Var.C((f88) obj, gl0Var.f478o, new b9((Object) fj3Var, (byte) 4));
    }

    @Override // o.hc1
    public final de1 getContext() {
        return this.m.q;
    }

    @Override // o.fl0
    public final hr2 o(Object obj, iw2 iw2Var) {
        my4 my4Var = this.n;
        b9 b9Var = new b9(my4Var, this);
        hr2 hr2VarO = this.m.o((f88) obj, b9Var);
        if (hr2VarO != null) {
            my4.u.set(my4Var, null);
        }
        return hr2VarO;
    }

    @Override // o.hc1
    public final void resumeWith(Object obj) {
        this.m.resumeWith(obj);
    }

    @Override // o.fl0
    public final void s(Object obj) {
        this.m.s(obj);
    }
}
