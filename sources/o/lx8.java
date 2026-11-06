package o;

/* JADX INFO: loaded from: classes.dex */
public final class lx8 extends bw8 {
    public final /* synthetic */ do7 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ gu8 f1416o;
    public final /* synthetic */ cy8 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx8(cy8 cy8Var, do7 do7Var, do7 do7Var2, gu8 gu8Var) {
        super(do7Var);
        this.n = do7Var2;
        this.f1416o = gu8Var;
        this.p = cy8Var;
    }

    @Override // o.bw8
    public final void a() {
        synchronized (this.p.f) {
            try {
                cy8 cy8Var = this.p;
                do7 do7Var = this.n;
                cy8Var.e.add(do7Var);
                do7Var.a.c(new lh7(cy8Var, do7Var, (byte) 27));
                if (this.p.k.getAndIncrement() > 0) {
                    this.p.b.a("Already connected to the service.", new Object[0]);
                }
                cy8.b(this.p, this.f1416o);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
