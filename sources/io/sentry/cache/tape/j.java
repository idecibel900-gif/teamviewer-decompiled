package io.sentry.cache.tape;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import o.e41;
import o.fx3;
import o.gk0;
import o.hk0;
import o.to7;
import o.yq4;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Closeable, Iterable {
    public static final byte[] x = new byte[4096];
    public RandomAccessFile m;
    public final File n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f188o;
    public int p;
    public h q;
    public h r;
    public final byte[] s = new byte[32];
    public int t = 0;
    public final int u;
    public final boolean v;
    public boolean w;

    public j(File file, RandomAccessFile randomAccessFile, int i, boolean z) throws IOException {
        this.n = file;
        this.m = randomAccessFile;
        this.u = i;
        this.v = z;
        l0();
    }

    public static RandomAccessFile G(File file, boolean z) throws IOException {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                randomAccessFile.writeInt(-2147483647);
                randomAccessFile.writeLong(4096L);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    gk0.l("Rename failed!");
                    return null;
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        return new RandomAccessFile(file, z ? "rwd" : "rw");
    }

    public static int H0(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public static long K0(byte[] bArr, int i) {
        return ((((long) bArr[i]) & 255) << 56) + ((((long) bArr[i + 1]) & 255) << 48) + ((((long) bArr[i + 2]) & 255) << 40) + ((((long) bArr[i + 3]) & 255) << 32) + ((((long) bArr[i + 4]) & 255) << 24) + ((((long) bArr[i + 5]) & 255) << 16) + ((((long) bArr[i + 6]) & 255) << 8) + (((long) bArr[i + 7]) & 255);
    }

    public static void R0(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public static void S0(int i, long j, byte[] bArr) {
        bArr[i] = (byte) (j >> 56);
        bArr[i + 1] = (byte) (j >> 48);
        bArr[i + 2] = (byte) (j >> 40);
        bArr[i + 3] = (byte) (j >> 32);
        bArr[i + 4] = (byte) (j >> 24);
        bArr[i + 5] = (byte) (j >> 16);
        bArr[i + 6] = (byte) (j >> 8);
        bArr[i + 7] = (byte) j;
    }

    public final void L0(int i) throws IOException {
        if (i < 0) {
            hk0.g(fx3.f(i, "Cannot remove negative (", ") number of elements."));
            return;
        }
        if (i == 0) {
            return;
        }
        int i2 = this.p;
        if (i == i2) {
            clear();
            return;
        }
        if (i2 == 0) {
            yq4.p();
            return;
        }
        if (i > i2) {
            hk0.g(to7.l(fx3.k(i, "Cannot remove more elements (", ") than present in queue ("), this.p, ")."));
            return;
        }
        h hVar = this.q;
        long j = hVar.a;
        int iH0 = hVar.b;
        long jP0 = j;
        long j2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            j2 += (long) (iH0 + 4);
            jP0 = P0(jP0 + 4 + ((long) iH0));
            byte[] bArr = this.s;
            if (!N0(4, jP0, bArr)) {
                return;
            }
            iH0 = H0(bArr, 0);
        }
        Q0(this.f188o, this.p - i, jP0, this.r.a);
        this.p -= i;
        this.t++;
        this.q = new h(iH0, jP0);
        while (j2 > 0) {
            int iMin = (int) Math.min(j2, 4096L);
            O0(iMin, j, x);
            long j3 = iMin;
            j2 -= j3;
            j += j3;
        }
    }

    public final void M0() throws IOException {
        this.m.close();
        File file = this.n;
        file.delete();
        this.m = G(file, this.v);
        l0();
    }

    public final boolean N0(int i, long j, byte[] bArr) throws IOException {
        try {
            long jP0 = P0(j);
            long j2 = ((long) i) + jP0;
            long j3 = this.f188o;
            RandomAccessFile randomAccessFile = this.m;
            if (j2 <= j3) {
                randomAccessFile.seek(jP0);
                this.m.readFully(bArr, 0, i);
                return true;
            }
            int i2 = (int) (j3 - jP0);
            randomAccessFile.seek(jP0);
            this.m.readFully(bArr, 0, i2);
            this.m.seek(32L);
            this.m.readFully(bArr, i2, i - i2);
            return true;
        } catch (EOFException unused) {
            M0();
            return false;
        } catch (IOException e) {
            throw e;
        } catch (Throwable unused2) {
            M0();
            return false;
        }
    }

    public final void O0(int i, long j, byte[] bArr) throws IOException {
        long jP0 = P0(j);
        long j2 = ((long) i) + jP0;
        long j3 = this.f188o;
        RandomAccessFile randomAccessFile = this.m;
        if (j2 <= j3) {
            randomAccessFile.seek(jP0);
            this.m.write(bArr, 0, i);
            return;
        }
        int i2 = (int) (j3 - jP0);
        randomAccessFile.seek(jP0);
        this.m.write(bArr, 0, i2);
        this.m.seek(32L);
        this.m.write(bArr, i2, i - i2);
    }

    public final long P0(long j) {
        long j2 = this.f188o;
        return j < j2 ? j : (j + 32) - j2;
    }

    public final void Q0(long j, int i, long j2, long j3) throws IOException {
        this.m.seek(0L);
        byte[] bArr = this.s;
        R0(bArr, 0, -2147483647);
        S0(4, j, bArr);
        R0(bArr, 12, i);
        S0(16, j2, bArr);
        S0(24, j3, bArr);
        this.m.write(bArr, 0, 32);
    }

    public final h b0(long j) {
        if (j != 0) {
            byte[] bArr = this.s;
            if (N0(4, j, bArr)) {
                return new h(H0(bArr, 0), j);
            }
        }
        return h.c;
    }

    public final void clear() throws IOException {
        if (this.w) {
            hk0.l("closed");
            return;
        }
        Q0(4096L, 0, 0L, 0L);
        this.m.seek(32L);
        this.m.write(x, 0, 4064);
        this.p = 0;
        h hVar = h.c;
        this.q = hVar;
        this.r = hVar;
        if (this.f188o > 4096) {
            this.m.setLength(4096L);
            this.m.getChannel().force(true);
        }
        this.f188o = 4096L;
        this.t++;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.w = true;
        this.m.close();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new i(this);
    }

    public final void l0() throws IOException {
        this.m.seek(0L);
        RandomAccessFile randomAccessFile = this.m;
        byte[] bArr = this.s;
        randomAccessFile.readFully(bArr);
        this.f188o = K0(bArr, 4);
        this.p = H0(bArr, 12);
        long jK0 = K0(bArr, 16);
        long jK1 = K0(bArr, 24);
        long j = this.f188o;
        long length = this.m.length();
        long j2 = this.f188o;
        if (j > length) {
            gk0.n("File is truncated. Expected length: ", j2, ", Actual length: ", this.m.length());
        } else if (j2 <= 32) {
            gk0.l(e41.k(new StringBuilder("File is corrupt; length stored in header ("), this.f188o, ") is invalid."));
        } else {
            this.q = b0(jK0);
            this.r = b0(jK1);
        }
    }

    public final String toString() {
        return "QueueFile{file=" + this.n + ", zero=true, length=" + this.f188o + ", size=" + this.p + ", first=" + this.q + ", last=" + this.r + '}';
    }
}
