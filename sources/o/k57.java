package o;

/* JADX INFO: loaded from: classes.dex */
public final class k57 extends u97 {
    public zj5 c;
    public int d;

    public k57(long j, zj5 zj5Var) {
        super(j);
        this.c = zj5Var;
    }

    @Override // o.u97
    public final void a(u97 u97Var) {
        u97Var.getClass();
        k57 k57Var = (k57) u97Var;
        synchronized (j51.x) {
            this.c = k57Var.c;
            this.d = k57Var.d;
        }
    }

    @Override // o.u97
    public final u97 b(long j) {
        return new k57(j, this.c);
    }
}
