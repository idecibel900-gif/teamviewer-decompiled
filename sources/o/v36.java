package o;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class v36 extends InputStream {
    public final /* synthetic */ w36 m;

    public v36(w36 w36Var) {
        this.m = w36Var;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        w36 w36Var = this.m;
        if (!w36Var.f2372o) {
            return (int) Math.min(w36Var.n.n, 2147483647L);
        }
        gk0.l("closed");
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.m.close();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        bArr.getClass();
        w36 w36Var = this.m;
        bf0 bf0Var = w36Var.n;
        if (w36Var.f2372o) {
            gk0.l("closed");
            return 0;
        }
        ck3.p(bArr.length, i, i2);
        if (bf0Var.n == 0 && w36Var.m.i0(bf0Var, 8192L) == -1) {
            return -1;
        }
        return bf0Var.read(bArr, i, i2);
    }

    public final String toString() {
        return this.m + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final long transferTo(OutputStream outputStream) throws IOException {
        outputStream.getClass();
        w36 w36Var = this.m;
        bf0 bf0Var = w36Var.n;
        if (w36Var.f2372o) {
            gk0.l("closed");
            return 0L;
        }
        long j = 0;
        while (true) {
            if (bf0Var.n == 0 && w36Var.m.i0(bf0Var, 8192L) == -1) {
                return j;
            }
            long j2 = bf0Var.n;
            j += j2;
            ck3.p(j2, 0L, j2);
            sn6 sn6Var = bf0Var.m;
            while (j2 > 0) {
                sn6Var.getClass();
                int iMin = (int) Math.min(j2, sn6Var.c - sn6Var.b);
                outputStream.write(sn6Var.a, sn6Var.b, iMin);
                int i = sn6Var.b + iMin;
                sn6Var.b = i;
                long j3 = iMin;
                bf0Var.n -= j3;
                j2 -= j3;
                if (i == sn6Var.c) {
                    sn6 sn6VarA = sn6Var.a();
                    bf0Var.m = sn6VarA;
                    vn6.a(sn6Var);
                    sn6Var = sn6VarA;
                }
            }
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        w36 w36Var = this.m;
        bf0 bf0Var = w36Var.n;
        if (w36Var.f2372o) {
            gk0.l("closed");
            return 0;
        }
        if (bf0Var.n == 0 && w36Var.m.i0(bf0Var, 8192L) == -1) {
            return -1;
        }
        return bf0Var.c0() & 255;
    }
}
