package o;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class df2 extends InputStream {
    public final InputStream m;
    public int n = 1073741824;

    public df2(InputStream inputStream) {
        this.m = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.n;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.m.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.m.read();
        if (i == -1) {
            this.n = 0;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.m.skip(j);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i = this.m.read(bArr);
        if (i == -1) {
            this.n = 0;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.m.read(bArr, i, i2);
        if (i3 == -1) {
            this.n = 0;
        }
        return i3;
    }
}
