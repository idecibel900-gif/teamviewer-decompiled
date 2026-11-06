package o;

/* JADX INFO: loaded from: classes.dex */
public final class mo5 implements ug6 {
    public final ug6 m;
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ to5 f1492o;

    public mo5(to5 to5Var, ug6 ug6Var) {
        ug6Var.getClass();
        this.f1492o = to5Var;
        this.m = ug6Var;
        this.n = n67.k();
    }

    @Override // o.ug6
    public final boolean F0() {
        if (this.f1492o.d.get()) {
            us1.P(21, "Statement is recycled");
            throw null;
        }
        if (this.n == n67.k()) {
            return this.m.F0();
        }
        us1.P(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // o.ug6
    public final void M(int i, String str) {
        str.getClass();
        if (this.f1492o.d.get()) {
            us1.P(21, "Statement is recycled");
            throw null;
        }
        if (this.n == n67.k()) {
            this.m.M(i, str);
        } else {
            us1.P(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.f1492o.d.get()) {
            us1.P(21, "Statement is recycled");
            throw null;
        }
        if (this.n == n67.k()) {
            this.m.close();
        } else {
            us1.P(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // o.ug6
    public final byte[] getBlob(int i) {
        if (this.f1492o.d.get()) {
            us1.P(21, "Statement is recycled");
            throw null;
        }
        if (this.n == n67.k()) {
            return this.m.getBlob(i);
        }
        us1.P(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // o.ug6
    public final int getColumnCount() {
        if (this.f1492o.d.get()) {
            us1.P(21, "Statement is recycled");
            throw null;
        }
        if (this.n == n67.k()) {
            return this.m.getColumnCount();
        }
        us1.P(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // o.ug6
    public final String getColumnName(int i) {
        if (this.f1492o.d.get()) {
            us1.P(21, "Statement is recycled");
            throw null;
        }
        if (this.n == n67.k()) {
            return this.m.getColumnName(i);
        }
        us1.P(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // o.ug6
    public final long getLong(int i) {
        if (this.f1492o.d.get()) {
            us1.P(21, "Statement is recycled");
            throw null;
        }
        if (this.n == n67.k()) {
            return this.m.getLong(i);
        }
        us1.P(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // o.ug6
    public final String h0(int i) {
        if (this.f1492o.d.get()) {
            us1.P(21, "Statement is recycled");
            throw null;
        }
        if (this.n == n67.k()) {
            return this.m.h0(i);
        }
        us1.P(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // o.ug6
    public final boolean isNull(int i) {
        if (this.f1492o.d.get()) {
            us1.P(21, "Statement is recycled");
            throw null;
        }
        if (this.n == n67.k()) {
            return this.m.isNull(i);
        }
        us1.P(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // o.ug6
    public final void k(int i, long j) {
        if (this.f1492o.d.get()) {
            us1.P(21, "Statement is recycled");
            throw null;
        }
        if (this.n == n67.k()) {
            this.m.k(i, j);
        } else {
            us1.P(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // o.ug6
    public final void l(byte[] bArr, int i) {
        if (this.f1492o.d.get()) {
            us1.P(21, "Statement is recycled");
            throw null;
        }
        if (this.n == n67.k()) {
            this.m.l(bArr, i);
        } else {
            us1.P(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // o.ug6
    public final void m(int i) {
        if (this.f1492o.d.get()) {
            us1.P(21, "Statement is recycled");
            throw null;
        }
        if (this.n == n67.k()) {
            this.m.m(i);
        } else {
            us1.P(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // o.ug6
    public final void reset() {
        if (this.f1492o.d.get()) {
            us1.P(21, "Statement is recycled");
            throw null;
        }
        if (this.n == n67.k()) {
            this.m.reset();
        } else {
            us1.P(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }
}
