package o;

/* JADX INFO: loaded from: classes2.dex */
public final class yc6 extends jp3 {
    public final lp3 q;

    public yc6(lp3 lp3Var) {
        this.q = lp3Var;
    }

    @Override // o.jp3
    public final boolean m() {
        return false;
    }

    @Override // o.jp3
    public final void n(Throwable th) {
        Object objE = l().E();
        boolean z = objE instanceof xx0;
        lp3 lp3Var = this.q;
        if (z) {
            lp3Var.resumeWith(ct1.A(((xx0) objE).a));
        } else {
            lp3Var.resumeWith(ka0.I(objE));
        }
    }
}
