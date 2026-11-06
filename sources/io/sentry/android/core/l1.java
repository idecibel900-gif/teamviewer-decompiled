package io.sentry.android.core;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class l1 extends InputStream {
    public final BufferedInputStream m;
    public long n;

    public l1(BufferedInputStream bufferedInputStream, int i) {
        this.m = bufferedInputStream;
        this.n = i;
    }

    @Override // java.io.InputStream
    public final int available() {
        return Math.min(this.m.available(), (int) this.n);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        n1.n(this.m, this.n);
        this.n = 0L;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.n;
        if (j <= 0) {
            return -1;
        }
        int i3 = this.m.read(bArr, i, Math.min(i2, (int) j));
        if (i3 > 0) {
            this.n -= (long) i3;
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = this.m.skip(Math.min(j, this.n));
        this.n -= jSkip;
        return jSkip;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.n <= 0) {
            return -1;
        }
        int i = this.m.read();
        if (i != -1) {
            this.n--;
        }
        return i;
    }
}
