package o;

/* JADX INFO: loaded from: classes2.dex */
public final class d93 extends e93 {
    public final si0 d;
    public final boolean e;

    public d93(kb6 kb6Var, pi0 pi0Var, vc1 vc1Var, si0 si0Var, boolean z) {
        super(kb6Var, pi0Var, vc1Var);
        this.d = si0Var;
        this.e = z;
    }

    @Override // o.e93
    public final Object a(a75 a75Var, Object[] objArr) {
        qi0 qi0Var = (qi0) this.d.a(a75Var);
        hc1 hc1Var = (hc1) objArr[objArr.length - 1];
        try {
            try {
                if (!this.e) {
                    return xs1.t(qi0Var, hc1Var);
                }
                try {
                    qi0Var.getClass();
                    return xs1.v(qi0Var, hc1Var);
                } catch (LinkageError e) {
                    throw e;
                } catch (ThreadDeath e2) {
                    throw e2;
                }
            } catch (LinkageError | ThreadDeath | VirtualMachineError e3) {
                throw e3;
            }
        } catch (Throwable th) {
            xs1.Y(th, hc1Var);
            return ne1.m;
        }
    }
}
