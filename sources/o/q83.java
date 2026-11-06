package o;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class q83 implements Closeable {
    public static final Logger r = Logger.getLogger(a83.class.getName());
    public final u36 m;
    public final bf0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1808o;
    public boolean p;
    public final r63 q;

    public q83(u36 u36Var) {
        this.m = u36Var;
        bf0 bf0Var = new bf0();
        this.n = bf0Var;
        this.f1808o = 16384;
        this.q = new r63(bf0Var);
    }

    public final void F(int i, int i2, boolean z) {
        synchronized (this) {
            if (this.p) {
                throw new IOException("closed");
            }
            q(0, 8, 6, z ? 1 : 0);
            this.m.q(i);
            this.m.q(i2);
            this.m.flush();
        }
    }

    public final void G(int i, tc2 tc2Var) {
        synchronized (this) {
            if (this.p) {
                throw new IOException("closed");
            }
            if (tc2Var.m == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            q(i, 4, 3, 0);
            this.m.q(tc2Var.m);
            this.m.flush();
        }
    }

    public final void J(int i, long j) {
        synchronized (this) {
            try {
                if (this.p) {
                    throw new IOException("closed");
                }
                if (j == 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                }
                Logger logger = r;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(a83.c(false, i, 4, j));
                }
                q(i, 4, 8, 0);
                this.m.q((int) j);
                this.m.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.p = true;
            this.m.close();
        }
    }

    public final void e(hv6 hv6Var) {
        hv6Var.getClass();
        synchronized (this) {
            try {
                if (this.p) {
                    throw new IOException("closed");
                }
                int i = this.f1808o;
                int i2 = hv6Var.a;
                if ((i2 & 32) != 0) {
                    i = hv6Var.b[5];
                }
                this.f1808o = i;
                if (((i2 & 2) != 0 ? hv6Var.b[1] : -1) != -1) {
                    r63 r63Var = this.q;
                    int iMin = Math.min((i2 & 2) != 0 ? hv6Var.b[1] : -1, 16384);
                    int i3 = r63Var.d;
                    if (i3 != iMin) {
                        if (iMin < i3) {
                            r63Var.b = Math.min(r63Var.b, iMin);
                        }
                        r63Var.c = true;
                        r63Var.d = iMin;
                        int i4 = r63Var.h;
                        if (iMin < i4) {
                            if (iMin == 0) {
                                d53[] d53VarArr = r63Var.e;
                                cx.N0(0, d53VarArr.length, null, d53VarArr);
                                r63Var.f = r63Var.e.length - 1;
                                r63Var.g = 0;
                                r63Var.h = 0;
                            } else {
                                r63Var.a(i4 - iMin);
                            }
                        }
                    }
                }
                q(0, 0, 4, 1);
                this.m.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.p) {
                throw new IOException("closed");
            }
            this.m.flush();
        }
    }

    public final void j(boolean z, int i, bf0 bf0Var, int i2) {
        synchronized (this) {
            if (this.p) {
                throw new IOException("closed");
            }
            q(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                u36 u36Var = this.m;
                bf0Var.getClass();
                u36Var.W(bf0Var, i2);
            }
        }
    }

    public final void q(int i, int i2, int i3, int i4) {
        if (i3 != 8) {
            Level level = Level.FINE;
            Logger logger = r;
            if (logger.isLoggable(level)) {
                logger.fine(a83.b(false, i, i2, i3, i4));
            }
        }
        if (i2 > this.f1808o) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f1808o + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            gk0.h(fx3.e(i, "reserved bit set: "));
            return;
        }
        byte[] bArr = po8.a;
        u36 u36Var = this.m;
        u36Var.writeByte((i2 >>> 16) & 255);
        u36Var.writeByte((i2 >>> 8) & 255);
        u36Var.writeByte(i2 & 255);
        u36Var.writeByte(i3 & 255);
        u36Var.writeByte(i4 & 255);
        u36Var.q(i & Integer.MAX_VALUE);
    }

    public final void u(int i, tc2 tc2Var, byte[] bArr) {
        synchronized (this) {
            if (this.p) {
                throw new IOException("closed");
            }
            if (tc2Var.m == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            q(0, bArr.length + 8, 7, 0);
            this.m.q(i);
            this.m.q(tc2Var.m);
            if (bArr.length != 0) {
                this.m.write(bArr);
            }
            this.m.flush();
        }
    }

    public final void z(boolean z, int i, ArrayList arrayList) {
        synchronized (this) {
            if (this.p) {
                throw new IOException("closed");
            }
            this.q.d(arrayList);
            long j = this.n.n;
            long jMin = Math.min(this.f1808o, j);
            int i2 = j == jMin ? 4 : 0;
            if (z) {
                i2 |= 1;
            }
            q(i, (int) jMin, 1, i2);
            this.m.W(this.n, jMin);
            if (j > jMin) {
                long j2 = j - jMin;
                while (j2 > 0) {
                    long jMin2 = Math.min(this.f1808o, j2);
                    j2 -= jMin2;
                    q(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                    this.m.W(this.n, jMin2);
                }
            }
        }
    }
}
