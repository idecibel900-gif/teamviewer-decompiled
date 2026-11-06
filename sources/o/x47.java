package o;

/* JADX INFO: loaded from: classes.dex */
public final class x47 extends u97 {
    public float c;

    public x47(float f, long j) {
        super(j);
        this.c = f;
    }

    @Override // o.u97
    public final void a(u97 u97Var) {
        u97Var.getClass();
        this.c = ((x47) u97Var).c;
    }

    @Override // o.u97
    public final u97 b(long j) {
        return new x47(this.c, j);
    }
}
