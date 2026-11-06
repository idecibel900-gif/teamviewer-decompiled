package o;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes.dex */
public final class ua2 extends FileInputStream {
    public final InputStream m;

    public ua2(FileDescriptor fileDescriptor, InputStream inputStream) {
        super(fileDescriptor);
        this.m = inputStream;
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int available() {
        return this.m.available();
    }

    @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.m.close();
    }

    @Override // java.io.FileInputStream
    public final FileChannel getChannel() {
        throw new UnsupportedOperationException("For encrypted files, please open the relevant FileInput/FileOutputStream.");
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.m.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.m.markSupported();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read() {
        return this.m.read();
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.m.reset();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final long skip(long j) {
        return this.m.skip(j);
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return this.m.read(bArr);
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return this.m.read(bArr, i, i2);
    }
}
