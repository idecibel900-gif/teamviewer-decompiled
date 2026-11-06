package o;

/* JADX INFO: loaded from: classes2.dex */
public final class rg3 extends k58 {
    public final d58[] b;
    public final h58[] c;
    public final boolean d;

    public rg3(d58[] d58VarArr, h58[] h58VarArr, boolean z) {
        d58VarArr.getClass();
        h58VarArr.getClass();
        this.b = d58VarArr;
        this.c = h58VarArr;
        this.d = z;
    }

    @Override // o.k58
    public final boolean b() {
        return this.d;
    }

    @Override // o.k58
    public final h58 d(oz3 oz3Var) {
        ys0 ys0VarA = oz3Var.o0().a();
        d58 d58Var = ys0VarA instanceof d58 ? (d58) ys0VarA : null;
        if (d58Var != null) {
            int index = d58Var.getIndex();
            d58[] d58VarArr = this.b;
            if (index < d58VarArr.length && im3.n(d58VarArr[index].q(), d58Var.q())) {
                return this.c[index];
            }
        }
        return null;
    }

    @Override // o.k58
    public final boolean e() {
        return this.c.length == 0;
    }
}
