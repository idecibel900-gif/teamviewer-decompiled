package o;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class x73 extends u73 {
    public long q;
    public final /* synthetic */ z73 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x73(z73 z73Var, h93 h93Var, long j) {
        super(z73Var, h93Var);
        h93Var.getClass();
        this.r = z73Var;
        this.q = j;
        if (j == 0) {
            e(k53.n);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zG;
        if (this.f2179o) {
            return;
        }
        if (this.q != 0) {
            TimeZone timeZone = ro8.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zG = ro8.g(this, 100);
            } catch (IOException unused) {
                zG = false;
            }
            if (!zG) {
                this.r.b.f();
                e(z73.f);
            }
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
        long j2 = this.q;
        if (j2 == 0) {
            return -1L;
        }
        long jI0 = super.i0(bf0Var, Math.min(j2, j));
        if (jI0 == -1) {
            this.r.b.f();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            e(z73.f);
            throw protocolException;
        }
        long j3 = this.q - jI0;
        this.q = j3;
        if (j3 == 0) {
            e(k53.n);
        }
        return jI0;
    }
}
