package o;

/* JADX INFO: loaded from: classes.dex */
public final class qx4 extends u97 {
    public int c;

    public qx4(int i, long j) {
        super(j);
        this.c = i;
    }

    @Override // o.u97
    public final void a(u97 u97Var) {
        u97Var.getClass();
        this.c = ((qx4) u97Var).c;
    }

    @Override // o.u97
    public final u97 b(long j) {
        return new qx4(this.c, j);
    }
}
