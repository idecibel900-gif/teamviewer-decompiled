package o;

import java.io.FilterInputStream;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class sc1 extends FilterInputStream {
    public static final /* synthetic */ int v = 0;
    public final b07 m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f2006o;
    public long p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public int u;

    public sc1(b07 b07Var, int i) {
        super(b07Var);
        this.p = 0L;
        this.t = true;
        this.u = 0;
        db8.f0(i >= 0);
        this.m = b07Var;
        this.n = i;
        this.q = i;
        this.r = -1;
        this.f2006o = System.nanoTime();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.t) {
            super.close();
        }
    }

    public final void e(int i) {
        int i2 = (i - this.n) + this.q;
        this.q = i2;
        if (i2 < 0) {
            this.q = 0;
            i2 = 0;
        }
        this.n = i;
        if (i == 0) {
            i2 = Integer.MAX_VALUE;
        }
        this.m.m = Math.max(0, i2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        this.r = this.u;
        b07 b07Var = this.m;
        b07Var.q = b07Var.f380o;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j;
        int i3;
        boolean z = this.n != 0;
        if (this.s || (z && this.q <= 0)) {
            return -1;
        }
        if (Thread.currentThread().isInterrupted()) {
            this.s = true;
            return -1;
        }
        if (z && i2 > (i3 = this.q)) {
            i2 = i3;
        }
        this.m.m = Math.max(0, z ? this.q : Integer.MAX_VALUE);
        do {
            if (this.p != 0 && System.nanoTime() - this.f2006o > this.p) {
                throw new SocketTimeoutException("Read timeout");
            }
            try {
                int i4 = super.read(bArr, i, i2);
                if (i4 != -1) {
                    if (z && i4 > 0) {
                        this.q -= i4;
                    }
                    this.u += i4;
                }
                return i4;
            } catch (SocketTimeoutException e) {
                j = this.p;
                if (j != 0) {
                    long jNanoTime = System.nanoTime() - this.f2006o;
                    long j2 = this.p;
                    if (jNanoTime > j2) {
                        break;
                    }
                    j = j2;
                }
                throw e;
            }
        } while (j != 0);
        throw e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        int i = this.r;
        if (i < 0) {
            gk0.l("Resetting to invalid mark");
            return;
        }
        b07 b07Var = this.m;
        int i2 = b07Var.q;
        if (i2 < 0) {
            gk0.l("Resetting to invalid mark");
            return;
        }
        b07Var.f380o = i2;
        b07Var.q = -1;
        int i3 = this.n;
        if (i3 != 0) {
            int i4 = i3 - i;
            this.q = i4;
            b07Var.m = Math.max(0, i4);
        } else {
            this.q = 0;
            b07Var.m = Math.max(0, Integer.MAX_VALUE);
        }
        this.u = this.r;
        this.r = -1;
    }
}
