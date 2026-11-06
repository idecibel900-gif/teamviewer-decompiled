package o;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class mj3 implements q67 {
    public final InputStream m;
    public final ov7 n;

    public mj3(InputStream inputStream, ov7 ov7Var) {
        inputStream.getClass();
        this.m = inputStream;
        this.n = ov7Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.m.close();
    }

    @Override // o.q67, o.v07
    public final ov7 i() {
        return this.n;
    }

    @Override // o.q67
    public final long i0(bf0 bf0Var, long j) throws IOException {
        bf0Var.getClass();
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            gk0.h(e41.g("byteCount < 0: ", j));
            return 0L;
        }
        try {
            this.n.f();
            sn6 sn6VarQ0 = bf0Var.Q0(1);
            int i = this.m.read(sn6VarQ0.a, sn6VarQ0.c, (int) Math.min(j, 8192 - sn6VarQ0.c));
            if (i != -1) {
                sn6VarQ0.c += i;
                long j2 = i;
                bf0Var.n += j2;
                return j2;
            }
            if (sn6VarQ0.b != sn6VarQ0.c) {
                return -1L;
            }
            bf0Var.m = sn6VarQ0.a();
            vn6.a(sn6VarQ0);
            return -1L;
        } catch (AssertionError e) {
            if (oo8.a(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    public final String toString() {
        return "source(" + this.m + ')';
    }
}
