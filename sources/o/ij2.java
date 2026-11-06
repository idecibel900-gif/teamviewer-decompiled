package o;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final class ij2 implements q67 {
    public final gs3 m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1068o;

    public ij2(gs3 gs3Var, long j) {
        this.m = gs3Var;
        this.n = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        gs3 gs3Var = this.m;
        if (this.f1068o) {
            return;
        }
        this.f1068o = true;
        ReentrantLock reentrantLock = gs3Var.f917o;
        reentrantLock.lock();
        try {
            int i = gs3Var.n - 1;
            gs3Var.n = i;
            if (i == 0 && gs3Var.m) {
                reentrantLock.unlock();
                synchronized (gs3Var) {
                    gs3Var.p.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // o.q67, o.v07
    public final ov7 i() {
        return ov7.d;
    }

    @Override // o.q67
    public final long i0(bf0 bf0Var, long j) {
        long j2;
        long j3;
        int i;
        bf0Var.getClass();
        if (this.f1068o) {
            hk0.l("closed");
            return 0L;
        }
        gs3 gs3Var = this.m;
        long j4 = this.n;
        if (j < 0) {
            gk0.h(e41.g("byteCount < 0: ", j));
            return 0L;
        }
        long j5 = j + j4;
        long j6 = j4;
        while (true) {
            if (j6 < j5) {
                sn6 sn6VarQ0 = bf0Var.Q0(1);
                byte[] bArr = sn6VarQ0.a;
                int i2 = sn6VarQ0.c;
                j2 = -1;
                int iMin = (int) Math.min(j5 - j6, 8192 - i2);
                synchronized (gs3Var) {
                    bArr.getClass();
                    gs3Var.p.seek(j6);
                    i = 0;
                    while (true) {
                        if (i < iMin) {
                            int i3 = gs3Var.p.read(bArr, i2, iMin - i);
                            if (i3 != -1) {
                                i += i3;
                            } else if (i == 0) {
                                i = -1;
                                break;
                            }
                        }
                        break;
                    }
                }
                if (i == -1) {
                    if (sn6VarQ0.b == sn6VarQ0.c) {
                        bf0Var.m = sn6VarQ0.a();
                        vn6.a(sn6VarQ0);
                    }
                    if (j4 == j6) {
                        j3 = -1;
                        break;
                    }
                } else {
                    sn6VarQ0.c += i;
                    long j7 = i;
                    j6 += j7;
                    bf0Var.n += j7;
                }
            } else {
                j2 = -1;
            }
            j3 = j6 - j4;
            break;
        }
        if (j3 != j2) {
            this.n += j3;
        }
        return j3;
    }
}
