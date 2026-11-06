package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class y73 extends u73 {
    public boolean q;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2179o) {
            return;
        }
        if (!this.q) {
            e(z73.f);
        }
        this.f2179o = true;
    }

    @Override // o.u73, o.q67
    public final long i0(bf0 bf0Var, long j) throws IOException {
        bf0Var.getClass();
        if (j < 0) {
            gk0.h(e41.g("byteCount < 0: ", j));
            return 0L;
        }
        if (this.f2179o) {
            hk0.l("closed");
            return 0L;
        }
        if (this.q) {
            return -1L;
        }
        long jI0 = super.i0(bf0Var, j);
        if (jI0 != -1) {
            return jI0;
        }
        this.q = true;
        e(k53.n);
        return -1L;
    }
}
