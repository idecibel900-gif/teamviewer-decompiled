package o;

/* JADX INFO: loaded from: classes.dex */
public final class kj2 implements te3 {
    public final wg5 m;
    public final sj2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f1270o;
    public final AutoCloseable p;
    public final Object q = new Object();
    public boolean r;
    public w36 s;

    public kj2(wg5 wg5Var, sj2 sj2Var, String str, AutoCloseable autoCloseable) {
        this.m = wg5Var;
        this.n = sj2Var;
        this.f1270o = str;
        this.p = autoCloseable;
    }

    @Override // o.te3
    public final of0 E0() {
        synchronized (this.q) {
            if (this.r) {
                throw new IllegalStateException("closed");
            }
            w36 w36Var = this.s;
            if (w36Var != null) {
                return w36Var;
            }
            q67 q67VarK0 = this.n.k0(this.m);
            q67VarK0.getClass();
            w36 w36Var2 = new w36(q67VarK0);
            this.s = w36Var2;
            return w36Var2;
        }
    }

    @Override // o.te3
    public final vs1 K() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0014 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.AutoCloseable
    public final void close() {
        AutoCloseable autoCloseable;
        synchronized (this.q) {
            this.r = true;
            w36 w36Var = this.s;
            if (w36Var != null) {
                try {
                    w36Var.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
                autoCloseable = this.p;
                if (autoCloseable != null) {
                    try {
                        to7.o(autoCloseable);
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused2) {
                    }
                }
            } else {
                autoCloseable = this.p;
                if (autoCloseable != null) {
                    to7.o(autoCloseable);
                }
            }
            throw th;
        }
    }

    @Override // o.te3
    public final sj2 getFileSystem() {
        return this.n;
    }

    @Override // o.te3
    public final wg5 v0() {
        wg5 wg5Var;
        synchronized (this.q) {
            if (this.r) {
                throw new IllegalStateException("closed");
            }
            wg5Var = this.m;
        }
        return wg5Var;
    }
}
