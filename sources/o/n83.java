package o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class n83 implements q67 {
    public final long m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final bf0 f1552o = new bf0();
    public final bf0 p = new bf0();
    public boolean q;
    public final /* synthetic */ p83 r;

    public n83(p83 p83Var, long j, boolean z) {
        this.r = p83Var;
        this.m = j;
        this.n = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        p83 p83Var = this.r;
        synchronized (p83Var) {
            this.q = true;
            bf0 bf0Var = this.p;
            j = bf0Var.n;
            bf0Var.e();
            p83Var.notifyAll();
        }
        if (j > 0) {
            p83 p83Var2 = this.r;
            TimeZone timeZone = ro8.a;
            p83Var2.n.z(j);
        }
        this.r.a();
    }

    @Override // o.q67, o.v07
    public final ov7 i() {
        return this.r.v;
    }

    @Override // o.q67
    public final long i0(bf0 bf0Var, long j) throws Throwable {
        boolean z;
        Throwable qa7Var;
        long j2;
        long jI0;
        bf0Var.getClass();
        long j3 = 0;
        if (j < 0) {
            gk0.h(e41.g("byteCount < 0: ", j));
            return 0L;
        }
        while (true) {
            p83 p83Var = this.r;
            synchronized (p83Var) {
                p83Var.n.getClass();
                m83 m83Var = p83Var.u;
                z = true;
                boolean z2 = m83Var.f1445o || m83Var.m;
                if (z2) {
                    p83Var.v.h();
                }
                try {
                    if (p83Var.g() == null || this.n) {
                        qa7Var = null;
                    } else {
                        qa7Var = p83Var.y;
                        if (qa7Var == null) {
                            tc2 tc2VarG = p83Var.g();
                            tc2VarG.getClass();
                            qa7Var = new qa7(tc2VarG);
                        }
                    }
                    if (this.q) {
                        throw new IOException("stream closed");
                    }
                    bf0 bf0Var2 = this.p;
                    long j4 = bf0Var2.n;
                    if (j4 > j3) {
                        jI0 = bf0Var2.i0(bf0Var, Math.min(j, j4));
                        fj8.b(p83Var.f1713o, jI0, 0L, 2);
                        long jA = p83Var.f1713o.a();
                        if (qa7Var == null) {
                            j2 = j3;
                            if (jA >= p83Var.n.C.a() / 2) {
                                p83Var.n.J(p83Var.m, jA);
                                fj8.b(p83Var.f1713o, 0L, jA, 1);
                            }
                        } else {
                            j2 = j3;
                        }
                        z = false;
                    } else {
                        j2 = j3;
                        if (this.n || qa7Var != null) {
                            z = false;
                        } else {
                            try {
                                p83Var.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException();
                            }
                        }
                        jI0 = -1;
                    }
                    if (z2) {
                        p83Var.v.k();
                    }
                } catch (Throwable th) {
                    if (z2) {
                        p83Var.v.k();
                    }
                    throw th;
                }
            }
            this.r.n.B.getClass();
            if (!z) {
                if (jI0 != -1) {
                    return jI0;
                }
                if (qa7Var == null) {
                    return -1L;
                }
                throw qa7Var;
            }
            j3 = j2;
        }
    }
}
