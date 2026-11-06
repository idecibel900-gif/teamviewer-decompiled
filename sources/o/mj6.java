package o;

/* JADX INFO: loaded from: classes2.dex */
public class mj6 extends d1 implements oe1 {
    public final hc1 p;

    public mj6(hc1 hc1Var, de1 de1Var) {
        super(de1Var, true);
        this.p = hc1Var;
    }

    @Override // o.op3
    public final boolean M() {
        return true;
    }

    @Override // o.op3
    public void c(Object obj) {
        ga0.t(mo8.s(obj), vt1.A(this.p));
    }

    @Override // o.op3
    public void d(Object obj) {
        this.p.resumeWith(mo8.s(obj));
    }

    public void f0() {
    }

    @Override // o.oe1
    public final oe1 getCallerFrame() {
        hc1 hc1Var = this.p;
        if (hc1Var instanceof oe1) {
            return (oe1) hc1Var;
        }
        return null;
    }
}
