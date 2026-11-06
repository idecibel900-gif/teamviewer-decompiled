package o;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes2.dex */
public final class le2 extends ft2 {
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f1355o;
    public long p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final /* synthetic */ io.sentry.z7 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le2(io.sentry.z7 z7Var, q67 q67Var, long j, boolean z) {
        super(q67Var);
        q67Var.getClass();
        this.t = z7Var;
        this.n = j;
        this.f1355o = z;
        this.q = true;
        if (j == 0) {
            e(null);
        }
    }

    @Override // o.ft2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.s) {
            return;
        }
        this.s = true;
        try {
            super.close();
            e(null);
        } catch (IOException e) {
            IOException iOExceptionE = e(e);
            iOExceptionE.getClass();
            throw iOExceptionE;
        }
    }

    public final IOException e(IOException iOException) {
        if (this.r) {
            return iOException;
        }
        this.r = true;
        if (iOException == null && this.q) {
            this.q = false;
            ((a46) this.t.b).p.v((a46) this.t.b);
        }
        return io.sentry.z7.a(this.t, this.p, this.f1355o, iOException, 8);
    }

    @Override // o.ft2, o.q67
    public final long i0(bf0 bf0Var, long j) throws IOException {
        bf0Var.getClass();
        if (this.s) {
            hk0.l("closed");
            return 0L;
        }
        try {
            long jI0 = this.m.i0(bf0Var, j);
            if (this.q) {
                this.q = false;
                ((a46) this.t.b).p.v((a46) this.t.b);
            }
            if (jI0 == -1) {
                e(null);
                return -1L;
            }
            long j2 = this.p + jI0;
            long j3 = this.n;
            if (j3 != -1 && j2 > j3) {
                throw new ProtocolException("expected " + this.n + " bytes but received " + j2);
            }
            this.p = j2;
            if (((ne2) this.t.d).b()) {
                e(null);
            }
            return jI0;
        } catch (IOException e) {
            IOException iOExceptionE = e(e);
            iOExceptionE.getClass();
            throw iOExceptionE;
        }
    }
}
