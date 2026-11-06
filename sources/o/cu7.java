package o;

/* JADX INFO: loaded from: classes2.dex */
public final class cu7 implements be1 {
    public final to5 m;
    public final ThreadLocal n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final eu7 f558o;

    public cu7(to5 to5Var, ThreadLocal threadLocal) {
        this.m = to5Var;
        this.n = threadLocal;
        this.f558o = new eu7(threadLocal);
    }

    @Override // o.de1
    public final de1 H0(de1 de1Var) {
        return xk0.G(this, de1Var);
    }

    public final void a(Object obj) {
        this.n.set(obj);
    }

    public final Object b() {
        ThreadLocal threadLocal = this.n;
        Object obj = threadLocal.get();
        threadLocal.set(this.m);
        return obj;
    }

    @Override // o.de1
    public final Object b0(Object obj, hw2 hw2Var) {
        return hw2Var.invoke(obj, this);
    }

    @Override // o.be1
    public final ce1 getKey() {
        return this.f558o;
    }

    @Override // o.de1
    public final de1 k0(ce1 ce1Var) {
        return this.f558o.equals(ce1Var) ? ba2.m : this;
    }

    @Override // o.de1
    public final be1 l0(ce1 ce1Var) {
        if (this.f558o.equals(ce1Var)) {
            return this;
        }
        return null;
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.m + ", threadLocal = " + this.n + ')';
    }
}
