package o;

/* JADX INFO: loaded from: classes.dex */
public final class t54 extends es4 implements v01, gz2 {
    public cj A;
    public j64 B;
    public pr7 C;
    public final bg5 D = h57.p(null);

    public t54(cj cjVar, j64 j64Var, pr7 pr7Var) {
        this.A = cjVar;
        this.B = j64Var;
        this.C = pr7Var;
    }

    @Override // o.es4
    public final void M0() {
        cj cjVar = this.A;
        if (cjVar.a != null) {
            ni3.c("Expected textInputModifierNode to be null");
        }
        cjVar.a = this;
    }

    @Override // o.es4
    public final void N0() {
        this.A.k(this);
    }

    @Override // o.gz2
    public final void x0(e45 e45Var) {
        this.D.setValue(e45Var);
    }
}
