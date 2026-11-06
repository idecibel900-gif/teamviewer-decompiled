package o;

/* JADX INFO: loaded from: classes.dex */
public final class b57 extends u97 {
    public Object c;

    public b57(long j, Object obj) {
        super(j);
        this.c = obj;
    }

    @Override // o.u97
    public final void a(u97 u97Var) {
        u97Var.getClass();
        this.c = ((b57) u97Var).c;
    }

    @Override // o.u97
    public final u97 b(long j) {
        return new b57(j, this.c);
    }
}
