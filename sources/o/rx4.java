package o;

/* JADX INFO: loaded from: classes.dex */
public final class rx4 implements s97 {
    public qx4 m;

    public final void a(int i, boolean z) {
        n47 n47VarH;
        int i2 = z ? i : 0;
        int i3 = ((qx4) v47.f(this.m)).c;
        int i4 = ((~i) & i3) | i2;
        if (i3 != i4) {
            qx4 qx4Var = this.m;
            synchronized (v47.c) {
                n47VarH = v47.h();
                ((qx4) v47.w(qx4Var, this, n47VarH)).c = i4;
            }
            v47.l(n47VarH, this);
        }
    }

    @Override // o.s97
    public final u97 d() {
        return this.m;
    }

    @Override // o.s97
    public final void x(u97 u97Var) {
        this.m = (qx4) u97Var;
    }
}
