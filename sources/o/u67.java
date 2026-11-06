package o;

/* JADX INFO: loaded from: classes.dex */
public final class u67 implements te3 {
    public final sj2 m;
    public final vs1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f2177o = new Object();
    public boolean p;
    public final of0 q;

    public u67(of0 of0Var, sj2 sj2Var, vs1 vs1Var) {
        this.m = sj2Var;
        this.n = vs1Var;
        this.q = of0Var;
    }

    @Override // o.te3
    public final of0 E0() {
        of0 of0Var;
        synchronized (this.f2177o) {
            try {
                if (this.p) {
                    throw new IllegalStateException("closed");
                }
                of0Var = this.q;
                if (of0Var == null) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return of0Var;
    }

    @Override // o.te3
    public final vs1 K() {
        return this.n;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f2177o) {
            this.p = true;
            of0 of0Var = this.q;
            if (of0Var != null) {
                try {
                    of0Var.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // o.te3
    public final sj2 getFileSystem() {
        return this.m;
    }

    @Override // o.te3
    public final wg5 v0() {
        synchronized (this.f2177o) {
            if (this.p) {
                throw new IllegalStateException("closed");
            }
        }
        return null;
    }
}
