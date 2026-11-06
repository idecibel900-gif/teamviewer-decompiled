package o;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes2.dex */
public final class ke2 extends et2 {
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f1254o;
    public boolean p;
    public long q;
    public boolean r;
    public boolean s;
    public final /* synthetic */ io.sentry.z7 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke2(io.sentry.z7 z7Var, v07 v07Var, long j, boolean z) {
        super(v07Var);
        v07Var.getClass();
        this.t = z7Var;
        this.n = j;
        this.f1254o = z;
        this.r = z;
    }

    @Override // o.et2, o.v07
    public final void W(bf0 bf0Var, long j) throws IOException {
        if (this.s) {
            hk0.l("closed");
            return;
        }
        long j2 = this.n;
        if (j2 != -1 && this.q + j > j2) {
            throw new ProtocolException("expected " + this.n + " bytes but received " + (this.q + j));
        }
        try {
            if (this.r) {
                this.r = false;
                ((a46) this.t.b).p.q((a46) this.t.b);
            }
            this.m.W(bf0Var, j);
            this.q += j;
        } catch (IOException e) {
            IOException iOExceptionE = e(e);
            iOExceptionE.getClass();
            throw iOExceptionE;
        }
    }

    @Override // o.et2, o.v07, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.s) {
            return;
        }
        this.s = true;
        long j = this.n;
        if (j != -1 && this.q != j) {
            throw new ProtocolException("unexpected end of stream");
        }
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
        if (this.p) {
            return iOException;
        }
        this.p = true;
        return io.sentry.z7.a(this.t, this.q, this.f1254o, iOException, 4);
    }

    @Override // o.et2, o.v07, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e) {
            IOException iOExceptionE = e(e);
            iOExceptionE.getClass();
            throw iOExceptionE;
        }
    }
}
