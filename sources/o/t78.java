package o;

/* JADX INFO: loaded from: classes2.dex */
public final class t78 extends mj6 {
    public final ThreadLocal q;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public t78(hc1 hc1Var, de1 de1Var) {
        kl0 kl0Var = kl0.f1277o;
        super(hc1Var, de1Var.l0(kl0Var) == null ? de1Var.H0(kl0Var) : de1Var);
        this.q = new ThreadLocal();
        if (hc1Var.getContext().l0(d82.y) instanceof fe1) {
            return;
        }
        Object objY = j51.Y(de1Var, null);
        j51.Q(de1Var, objY);
        i0(de1Var, objY);
    }

    @Override // o.mj6, o.op3
    public final void d(Object obj) {
        h0();
        Object objS = mo8.s(obj);
        hc1 hc1Var = this.p;
        de1 context = hc1Var.getContext();
        Object objY = j51.Y(context, null);
        t78 t78VarZ = objY != j51.y ? j51.Z(hc1Var, context, objY) : null;
        try {
            hc1Var.resumeWith(objS);
        } finally {
            if (t78VarZ == null || t78VarZ.g0()) {
                j51.Q(context, objY);
            }
        }
    }

    @Override // o.mj6
    public final void f0() {
        h0();
    }

    public final boolean g0() {
        boolean z = this.threadLocalIsSet && this.q.get() == null;
        this.q.remove();
        return !z;
    }

    public final void h0() {
        if (this.threadLocalIsSet) {
            vd5 vd5Var = (vd5) this.q.get();
            if (vd5Var != null) {
                j51.Q((de1) vd5Var.m, vd5Var.n);
            }
            this.q.remove();
        }
    }

    public final void i0(de1 de1Var, Object obj) {
        this.threadLocalIsSet = true;
        this.q.set(new vd5(de1Var, obj));
    }
}
