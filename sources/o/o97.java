package o;

/* JADX INFO: loaded from: classes.dex */
public final class o97 extends u97 {
    public c2 c;
    public int d;
    public int e;

    public o97(long j, c2 c2Var) {
        super(j);
        this.c = c2Var;
    }

    @Override // o.u97
    public final void a(u97 u97Var) {
        synchronized (xk0.w) {
            u97Var.getClass();
            this.c = ((o97) u97Var).c;
            this.d = ((o97) u97Var).d;
            this.e = ((o97) u97Var).e;
        }
    }

    @Override // o.u97
    public final u97 b(long j) {
        return new o97(j, this.c);
    }
}
