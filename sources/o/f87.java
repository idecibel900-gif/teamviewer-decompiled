package o;

/* JADX INFO: loaded from: classes2.dex */
public final class f87 implements hc1, oe1 {
    public final zm0 m;
    public final de1 n;

    public f87(zm0 zm0Var, de1 de1Var) {
        this.m = zm0Var;
        this.n = de1Var;
    }

    @Override // o.oe1
    public final oe1 getCallerFrame() {
        return this.m;
    }

    @Override // o.hc1
    public final de1 getContext() {
        return this.n;
    }

    @Override // o.hc1
    public final void resumeWith(Object obj) {
        this.m.resumeWith(obj);
    }
}
