package o;

/* JADX INFO: loaded from: classes.dex */
public final class y47 extends u97 {
    public int c;

    public y47(int i, long j) {
        super(j);
        this.c = i;
    }

    @Override // o.u97
    public final void a(u97 u97Var) {
        u97Var.getClass();
        this.c = ((y47) u97Var).c;
    }

    @Override // o.u97
    public final u97 b(long j) {
        return new y47(this.c, j);
    }
}
