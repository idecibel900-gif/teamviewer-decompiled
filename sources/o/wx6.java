package o;

/* JADX INFO: loaded from: classes2.dex */
public final class wx6 implements t22 {
    public final yx6 m;
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f2459o;
    public final gl0 p;

    public wx6(yx6 yx6Var, long j, Object obj, gl0 gl0Var) {
        this.m = yx6Var;
        this.n = j;
        this.f2459o = obj;
        this.p = gl0Var;
    }

    @Override // o.t22
    public final void a() {
        yx6 yx6Var = this.m;
        synchronized (yx6Var) {
            if (this.n >= yx6Var.p()) {
                Object[] objArr = yx6Var.t;
                objArr.getClass();
                long j = this.n;
                if (objArr[((int) j) & (objArr.length - 1)] == this) {
                    au8.Q(objArr, j, au8.R0);
                    yx6Var.k();
                }
            }
        }
    }
}
