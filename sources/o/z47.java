package o;

/* JADX INFO: loaded from: classes.dex */
public final class z47 extends u97 {
    public long c;

    public z47(long j, long j2) {
        super(j);
        this.c = j2;
    }

    @Override // o.u97
    public final void a(u97 u97Var) {
        u97Var.getClass();
        this.c = ((z47) u97Var).c;
    }

    @Override // o.u97
    public final u97 b(long j) {
        return new z47(j, this.c);
    }
}
