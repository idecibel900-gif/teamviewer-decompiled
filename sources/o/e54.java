package o;

/* JADX INFO: loaded from: classes2.dex */
public final class e54 extends n87 {
    public final hc1 p;

    public e54(de1 de1Var, hw2 hw2Var) {
        super(de1Var, false);
        this.p = vt1.p(this, this, hw2Var);
    }

    @Override // o.op3
    public final void T() throws Throwable {
        try {
            ga0.t(f88.a, vt1.A(this.p));
        } catch (Throwable th) {
            th = th;
            if (th instanceof z12) {
                th = ((z12) th).m;
            }
            resumeWith(new sc6(th));
            throw th;
        }
    }
}
