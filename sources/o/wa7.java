package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class wa7 extends FilterInputStream {
    public final ByteBuffer m;
    public final ByteBuffer n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f2395o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final byte[] t;
    public int u;
    public final ra7 v;
    public final int w;
    public final int x;

    public wa7(w45 w45Var, InputStream inputStream, byte[] bArr) {
        super(inputStream);
        this.v = w45Var.g();
        this.f2395o = w45Var.e();
        this.t = Arrays.copyOf(bArr, bArr.length);
        int iD = w45Var.d();
        this.w = iD;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iD + 1);
        this.m = byteBufferAllocate;
        byteBufferAllocate.limit(0);
        this.x = iD - w45Var.c();
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(w45Var.f() + 16);
        this.n = byteBufferAllocate2;
        byteBufferAllocate2.limit(0);
        this.p = false;
        this.q = false;
        this.r = false;
        this.u = 0;
        this.s = false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return this.n.remaining();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
    }

    public final void e() throws IOException {
        byte b;
        while (!this.q && this.m.remaining() > 0) {
            int i = ((FilterInputStream) this).in.read(this.m.array(), this.m.position(), this.m.remaining());
            if (i > 0) {
                ByteBuffer byteBuffer = this.m;
                byteBuffer.position(byteBuffer.position() + i);
            } else if (i == -1) {
                this.q = true;
            } else if (i == 0) {
                gk0.l("Could not read bytes from the ciphertext stream");
                return;
            }
        }
        if (this.q) {
            b = 0;
        } else {
            ByteBuffer byteBuffer2 = this.m;
            b = byteBuffer2.get(byteBuffer2.position() - 1);
            ByteBuffer byteBuffer3 = this.m;
            byteBuffer3.position(byteBuffer3.position() - 1);
        }
        this.m.flip();
        this.n.clear();
        try {
            this.v.v(this.m, this.u, this.q, this.n);
            this.u++;
            this.n.flip();
            this.m.clear();
            if (this.q) {
                return;
            }
            this.m.clear();
            this.m.limit(this.w + 1);
            this.m.put(b);
        } catch (GeneralSecurityException e) {
            this.s = true;
            this.n.limit(0);
            throw new IOException(e.getMessage() + "\n" + toString() + "\nsegmentNr:" + this.u + " endOfCiphertext:" + this.q, e);
        }
    }

    public final void j() throws IOException {
        if (this.p) {
            this.s = true;
            this.n.limit(0);
            gk0.l("Decryption failed.");
            return;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.f2395o);
        while (byteBufferAllocate.remaining() > 0) {
            int i = ((FilterInputStream) this).in.read(byteBufferAllocate.array(), byteBufferAllocate.position(), byteBufferAllocate.remaining());
            if (i == -1) {
                this.s = true;
                this.n.limit(0);
                gk0.l("Ciphertext is too short");
                return;
            } else {
                if (i == 0) {
                    gk0.l("Could not read bytes from the ciphertext stream");
                    return;
                }
                byteBufferAllocate.position(byteBufferAllocate.position() + i);
            }
        }
        byteBufferAllocate.flip();
        try {
            this.v.n(byteBufferAllocate, this.t);
            this.p = true;
        } catch (GeneralSecurityException e) {
            throw new IOException(e);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        try {
            if (this.s) {
                throw new IOException("Decryption failed.");
            }
            if (!this.p) {
                j();
                this.m.clear();
                this.m.limit(this.x + 1);
            }
            if (this.r) {
                return -1;
            }
            int i3 = 0;
            while (i3 < i2) {
                if (this.n.remaining() == 0) {
                    if (this.q) {
                        this.r = true;
                        break;
                    }
                    e();
                }
                int iMin = Math.min(this.n.remaining(), i2 - i3);
                this.n.get(bArr, i3 + i, iMin);
                i3 += iMin;
            }
            if (i3 == 0 && this.r) {
                return -1;
            }
            return i3;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        int i;
        long j2 = this.w;
        if (j <= 0) {
            return 0L;
        }
        int iMin = (int) Math.min(j2, j);
        byte[] bArr = new byte[iMin];
        long j3 = j;
        while (j3 > 0 && (i = read(bArr, 0, (int) Math.min(iMin, j3))) > 0) {
            j3 -= (long) i;
        }
        return j - j3;
    }

    public final synchronized String toString() {
        return "StreamingAeadDecryptingStream\nsegmentNr:" + this.u + "\nciphertextSegmentSize:" + this.w + "\nheaderRead:" + this.p + "\nendOfCiphertext:" + this.q + "\nendOfPlaintext:" + this.r + "\ndecryptionErrorOccured:" + this.s + "\nciphertextSgement position:" + this.m.position() + " limit:" + this.m.limit() + "\nplaintextSegment position:" + this.n.position() + " limit:" + this.n.limit();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = new byte[1];
        int i = read(bArr, 0, 1);
        if (i == 1) {
            return bArr[0] & 255;
        }
        if (i == -1) {
            return i;
        }
        gk0.l("Reading failed");
        return 0;
    }
}
