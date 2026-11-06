package o;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
public final class uh3 implements q67 {
    public final w36 m;
    public final Inflater n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2216o;
    public boolean p;

    public uh3(w36 w36Var, Inflater inflater) {
        this.m = w36Var;
        this.n = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.p) {
            return;
        }
        this.n.end();
        this.p = true;
        this.m.close();
    }

    @Override // o.q67, o.v07
    public final ov7 i() {
        return this.m.m.i();
    }

    @Override // o.q67
    public final long i0(bf0 bf0Var, long j) throws IOException {
        long j2;
        bf0Var.getClass();
        while (j >= 0) {
            if (this.p) {
                hk0.l("closed");
                return 0L;
            }
            w36 w36Var = this.m;
            Inflater inflater = this.n;
            if (j == 0) {
                j2 = 0;
            } else {
                try {
                    sn6 sn6VarQ0 = bf0Var.Q0(1);
                    int iMin = (int) Math.min(j, 8192 - sn6VarQ0.c);
                    if (inflater.needsInput() && !w36Var.e()) {
                        sn6 sn6Var = w36Var.n.m;
                        sn6Var.getClass();
                        int i = sn6Var.c;
                        int i2 = sn6Var.b;
                        int i3 = i - i2;
                        this.f2216o = i3;
                        inflater.setInput(sn6Var.a, i2, i3);
                    }
                    int iInflate = inflater.inflate(sn6VarQ0.a, sn6VarQ0.c, iMin);
                    int i4 = this.f2216o;
                    if (i4 != 0) {
                        int remaining = i4 - inflater.getRemaining();
                        this.f2216o -= remaining;
                        w36Var.skip(remaining);
                    }
                    if (iInflate > 0) {
                        sn6VarQ0.c += iInflate;
                        j2 = iInflate;
                        bf0Var.n += j2;
                    } else {
                        if (sn6VarQ0.b == sn6VarQ0.c) {
                            bf0Var.m = sn6VarQ0.a();
                            vn6.a(sn6VarQ0);
                        }
                        j2 = 0;
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            if (j2 > 0) {
                return j2;
            }
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
            if (w36Var.e()) {
                throw new EOFException("source exhausted prematurely");
            }
        }
        gk0.h(e41.g("byteCount < 0: ", j));
        return 0L;
    }
}
