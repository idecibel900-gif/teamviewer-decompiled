package o;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class k83 implements q67 {
    public final w36 m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1236o;
    public int p;
    public int q;

    public k83(w36 w36Var) {
        this.m = w36Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // o.q67, o.v07
    public final ov7 i() {
        return this.m.m.i();
    }

    @Override // o.q67
    public final long i0(bf0 bf0Var, long j) throws IOException {
        int i;
        int iZ;
        bf0Var.getClass();
        do {
            int i2 = this.p;
            w36 w36Var = this.m;
            if (i2 == 0) {
                w36Var.skip(this.q);
                this.q = 0;
                if ((this.n & 4) == 0) {
                    i = this.f1236o;
                    int iL = po8.l(w36Var);
                    this.p = iL;
                    int iQ = w36Var.q() & 255;
                    this.n = w36Var.q() & 255;
                    Logger logger = l83.p;
                    if (logger.isLoggable(Level.FINE)) {
                        ai0 ai0Var = a83.a;
                        logger.fine(a83.b(true, this.f1236o, iL, iQ, this.n));
                    }
                    iZ = w36Var.z() & Integer.MAX_VALUE;
                    this.f1236o = iZ;
                    if (iQ != 9) {
                        throw new IOException(iQ + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jI0 = w36Var.i0(bf0Var, Math.min(j, i2));
                if (jI0 != -1) {
                    this.p -= (int) jI0;
                    return jI0;
                }
            }
            return -1L;
        } while (iZ == i);
        gk0.l("TYPE_CONTINUATION streamId changed");
        return 0L;
    }
}
